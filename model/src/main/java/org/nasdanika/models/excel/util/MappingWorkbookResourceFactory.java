package org.nasdanika.models.excel.util;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.Util;
import org.nasdanika.models.excel.BooleanCell;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.DateCell;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;

/**
 * Populates the root object my mapping cells and sheets to features.
 */
public abstract class MappingWorkbookResourceFactory extends WorkbookResourceFactory {

	/**
	 * Creates the root EObject
	 * @return
	 */
	protected abstract EObject createRoot();

	protected void loadContents(Workbook workbook, Resource resource) {
		EObject root = createRoot();
		for (Sheet sheet: workbook.getSheets()) {
			if (isFeatureSheet(sheet, resource)) {
				for (EStructuralFeature rootFeature: root.eClass().getEAllStructuralFeatures()) {
					if (isFeatureSheet(sheet, resource, rootFeature)) {
						loadFeature(root, rootFeature, sheet, resource);
					}					
				}
			} else {
				for (Row row: ((RowSheet) sheet).getRows()) {
					if (isFeatureRow(row, resource)) {
						for (EStructuralFeature rootFeature: root.eClass().getEAllStructuralFeatures()) {
							if (isFeatureRow(row, resource, rootFeature)) {
								loadFeature(root, rootFeature, row, resource);
							}					
						}
					} 					
				}
			}
		}		
		
		resource.getContents().add(root);
	};
	
	/**
	 * Loads a feature from a sheet. This implementation loads reference elements from rows starting from the second row (index 1+)
	 * The first row is assumed to be a header row with feature labels 
	 * @param root
	 * @param rootFeature
	 * @param sheet
	 * @param resource
	 */
	protected void loadFeature(EObject root, EStructuralFeature rootFeature, Sheet sheet, Resource resource) {
		if (sheet instanceof RowSheet) {
			RowSheet rowSheet = (RowSheet) sheet;
			for (Row row: rowSheet.getRows()) {
				if (row.getNumber() > 0) {
					loadFeatureElement(root, rootFeature, row, resource);
				}
			}
		}
	}
	
	/**
	 * For attributes returns value of the first cell converted to the feature type. 
	 * For references creates a row element and then populates it by matching header row labels to feature names
	 * @param root
	 * @param rootFeature
	 * @param row
	 * @param resource
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected void loadFeatureElement(EObject root, EStructuralFeature rootFeature, Row row, Resource resource) {
		if (row instanceof CellRow) {
			CellRow cellRow = (CellRow) row;
			if (rootFeature instanceof EReference) {
				EReference rootReference = (EReference) rootFeature;
				EObject referenceElement = createReferenceElement(rootFeature, rootReference, cellRow, resource);
				if (referenceElement != null) {
					// Loading features from cells
					for (Cell cell: cellRow.getCells()) {
						for (EStructuralFeature elementFeature: referenceElement.eClass().getEAllStructuralFeatures()) {
							if (isFeatureCell(cell, resource, elementFeature)) {
								loadFeature(referenceElement, elementFeature, cell, resource);
							}					
						}						
					}
					
					if (rootReference.isMany()) {
						((Collection<Object>) root.eGet(rootReference)).add(referenceElement);
					} else {
						root.eSet(rootReference, referenceElement);
					}
				}
			} else 	if (!cellRow.getCells().isEmpty()) {
				loadFeature(root, rootFeature, cellRow.getCells().get(0), resource);
			}			
		}
	}
	
	/**
	 * Matches a cell to feature name by using the first row cell value as a label and nameToLabel
	 * @param cell
	 * @param resource
	 * @param elementFeature
	 * @return
	 */
	protected boolean isFeatureCell(Cell cell, Resource resource, EStructuralFeature feature) {
		EList<Cell> headerCells = ((CellRow) ((RowSheet) cell.eContainer().eContainer()).getRows().get(0)).getCells();
		if (headerCells.size() > cell.getColumnIndex()) {
			Cell headerCell = headerCells.get(cell.getColumnIndex());
			if (headerCell instanceof StringCell) {
				String cellValue = ((StringCell) headerCell).getValue();
				String featureLabel = Util.nameToLabel(feature.getName());
				return !Util.isBlank(cellValue) && featureLabel.equalsIgnoreCase(cellValue.trim());				
			}
		}
		return false;
	}

	/**
	 * This implementation creates elements of feature type. Override for heterogeneity or to support lookup for non-containment references
	 * @param root
	 * @param rootFeature
	 * @param row
	 * @param resource
	 * @return
	 */
	protected EObject createReferenceElement(EObject root, EReference rootReference, Row row, Resource resource) {
		EClass type = rootReference.getEReferenceType();
		return type.getEPackage().getEFactoryInstance().create(type);
	}

	/**
	 * Feature sheet is used to load an entire {@link EStructuralFeature}, e.g. a many reference. 
	 * If this method returns false then it is assumed that the sheet contains a table of root feature values.
	 * This implementation returns false for the first sheet in the workbook and true for the rest
	 * @param sheet
	 * @param resource
	 * @return
	 */
	protected boolean isFeatureSheet(Sheet sheet, Resource resource) {
		return ((Workbook) sheet.eContainer()).getSheets().indexOf(sheet) > 0;
	}
	
	/**
	 * @param sheet
	 * @param resource
	 * @param feature
	 * @return true if this sheet is for a given feature. This implementation uses {@link Util}.nameToLabel() to convert feature name to a textual representation and then compares it with the trimmed sheet name ignoring case.
	 * For example, feature <code>firstName</code> would match a sheet with "First Name" name.
	 */
	protected boolean isFeatureSheet(Sheet sheet, Resource resource, EStructuralFeature feature) {
		String featureLabel = Util.nameToLabel(feature.getName());
		return featureLabel.equalsIgnoreCase(sheet.getName().trim());
	}
	
	/**
	 * Row to load a feature. This implementation returns true for rows 1+, i.e. it assumes a header row
	 * @param row
	 * @param resource
	 * @return
	 */
	protected boolean isFeatureRow(Row row, Resource resource) {
		return ((RowSheet) row.eContainer()).getRows().indexOf(row) > 0;
	}

	/**
	 * 
	 * @param row
	 * @param resource
	 * @param feature
	 * @return true if this row is for a given feature. This implementation uses {@link Util}.nameToLabel() to convert feature name to a textual representation and then compares it with the trimmed value of the first (0 index) cell.
	 * For example, feature <code>firstName</code> would match a cell value "First Name".
	 */
	protected boolean isFeatureRow(Row row, Resource resource, EStructuralFeature feature) {
		if (row instanceof CellRow) {
			CellRow cellRow = (CellRow) row;
			if (cellRow.getCells().size() > 1) {
				Cell firstCell = cellRow.getCells().get(0);
				if (firstCell instanceof StringCell) {
					String featureLabel = Util.nameToLabel(feature.getName());
					String cellValue = ((StringCell) firstCell).getValue();					
					return !Util.isBlank(cellValue) && featureLabel.equalsIgnoreCase(cellValue.trim());
				}
			}
		}
		return false;
	}
	
	/**
	 * Loads feature value from the second cell (index 1)
	 * @param root
	 * @param rootFeature
	 * @param row
	 * @param resource
	 */
	protected void loadFeature(EObject root, EStructuralFeature rootFeature, Row row, Resource resource) {
		loadFeature(root, rootFeature, ((CellRow) row).getCells().get(1), resource);		
	}
	
	/**
	 * Loads values for boolean, date, numeric and string cells
	 * @param root
	 * @param rootFeature
	 * @param cell
	 * @param resource
	 */
	protected void loadFeature(EObject root, EStructuralFeature feature, Cell cell, Resource resource) {
		if (cell instanceof BooleanCell) {
			loadFeatureValue(root, feature, ((BooleanCell) cell).isValue(), resource);
		} else if (cell instanceof DateCell) {
			loadFeatureValue(root, feature, ((DateCell) cell).getValue(), resource);
		} else if (cell instanceof NumericCell) {
			loadFeatureValue(root, feature, ((NumericCell) cell).getValue(), resource);
		} else if (cell instanceof StringCell) {
			loadFeatureValue(root, feature, ((StringCell) cell).getValue(), resource);
		}  		
	}
	
	@SuppressWarnings("unchecked")
	protected void loadFeatureValue(EObject eObj, EStructuralFeature feature, boolean value, Resource resource) {
		Class<?> type = feature.getEType().getInstanceClass();
		if (feature.isMany()) {
			((Collection<Object>) eObj.eGet(feature)).add(convert(value, type));
		} else {
			eObj.eSet(feature, convert(value, type));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void loadFeatureValue(EObject eObj, EStructuralFeature feature, Date value, Resource resource) {
		Class<?> type = feature.getEType().getInstanceClass();
		if (feature.isMany()) {
			((Collection<Object>) eObj.eGet(feature)).add(convert(value, type));
		} else {
			eObj.eSet(feature, convert(value, type));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void loadFeatureValue(EObject eObj, EStructuralFeature feature, double value, Resource resource) {
		Class<?> type = feature.getEType().getInstanceClass();
		if (feature.isMany()) {
			((Collection<Object>) eObj.eGet(feature)).add(convert(value, type));
		} else {
			eObj.eSet(feature, convert(value, type));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void loadFeatureValue(EObject eObj, EStructuralFeature feature, String value, Resource resource) {
		Class<?> type = feature.getEType().getInstanceClass();
		if (feature.isMany()) {
			((Collection<Object>) eObj.eGet(feature)).add(convert(value, type));
		} else {
			eObj.eSet(feature, convert(value, type));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected <S,T> T convert(S value, Class<T> type) {
		if (value == null) {
			return null;
		}
		if (value instanceof Double && Date.class.equals(type)) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(1900, 0, 0);
			long baseMillis = calendar.getTimeInMillis();
			long millisInADay = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);
			long mills = (long) (((double) value) - 1.0) * millisInADay + baseMillis;
			return (T) new Date(mills);
		}
		
		return Objects.requireNonNull(DefaultConverter.INSTANCE.convert(value, type), "Cannot convert " + value + " to " + type);
	}

}
