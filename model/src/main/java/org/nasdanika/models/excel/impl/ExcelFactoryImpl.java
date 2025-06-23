/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.excel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelFactoryImpl extends EFactoryImpl implements ExcelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExcelFactory init() {
		try {
			ExcelFactory theExcelFactory = (ExcelFactory)EPackage.Registry.INSTANCE.getEFactory(ExcelPackage.eNS_URI);
			if (theExcelFactory != null) {
				return theExcelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExcelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExcelPackage.WORKBOOK: return createWorkbook();
			case ExcelPackage.ROW_SHEET: return createRowSheet();
			case ExcelPackage.LIST_SHEET: return createListSheet();
			case ExcelPackage.CELL_ROW: return createCellRow();
			case ExcelPackage.EOBJECT_ROW: return createEObjectRow();
			case ExcelPackage.LIST_ROW: return createListRow();
			case ExcelPackage.CELL: return createCell();
			case ExcelPackage.BLANK_CELL: return createBlankCell();
			case ExcelPackage.BOOLEAN_CELL: return createBooleanCell();
			case ExcelPackage.DATE_CELL: return createDateCell();
			case ExcelPackage.ERROR_CELL: return createErrorCell();
			case ExcelPackage.NUMERIC_CELL: return createNumericCell();
			case ExcelPackage.STRING_CELL: return createStringCell();
			case ExcelPackage.EOBJECT_CELL: return createEObjectCell();
			case ExcelPackage.REFERENCE_CELL: return createReferenceCell();
			case ExcelPackage.HYPERLINK_CELL: return createHyperlinkCell();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExcelPackage.HYPERLINK_TYPE:
				return createHyperlinkTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExcelPackage.HYPERLINK_TYPE:
				return convertHyperlinkTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workbook createWorkbook() {
		WorkbookImpl workbook = new WorkbookImpl();
		return workbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowSheet createRowSheet() {
		RowSheetImpl rowSheet = new RowSheetImpl();
		return rowSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListSheet createListSheet() {
		ListSheetImpl listSheet = new ListSheetImpl();
		return listSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellRow createCellRow() {
		CellRowImpl cellRow = new CellRowImpl();
		return cellRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObjectRow createEObjectRow() {
		EObjectRowImpl eObjectRow = new EObjectRowImpl();
		return eObjectRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListRow createListRow() {
		ListRowImpl listRow = new ListRowImpl();
		return listRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlankCell createBlankCell() {
		BlankCellImpl blankCell = new BlankCellImpl();
		return blankCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanCell createBooleanCell() {
		BooleanCellImpl booleanCell = new BooleanCellImpl();
		return booleanCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateCell createDateCell() {
		DateCellImpl dateCell = new DateCellImpl();
		return dateCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErrorCell createErrorCell() {
		ErrorCellImpl errorCell = new ErrorCellImpl();
		return errorCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericCell createNumericCell() {
		NumericCellImpl numericCell = new NumericCellImpl();
		return numericCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringCell createStringCell() {
		StringCellImpl stringCell = new StringCellImpl();
		return stringCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObjectCell createEObjectCell() {
		EObjectCellImpl eObjectCell = new EObjectCellImpl();
		return eObjectCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceCell createReferenceCell() {
		ReferenceCellImpl referenceCell = new ReferenceCellImpl();
		return referenceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyperlinkCell createHyperlinkCell() {
		HyperlinkCellImpl hyperlinkCell = new HyperlinkCellImpl();
		return hyperlinkCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperlinkType createHyperlinkTypeFromString(EDataType eDataType, String initialValue) {
		HyperlinkType result = HyperlinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelPackage getExcelPackage() {
		return (ExcelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExcelPackage getPackage() {
		return ExcelPackage.eINSTANCE;
	}

} //ExcelFactoryImpl
