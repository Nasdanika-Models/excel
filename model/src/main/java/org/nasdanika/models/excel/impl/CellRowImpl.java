/**
 */
package org.nasdanika.models.excel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.excel.BlankCell;
import org.nasdanika.models.excel.BooleanCell;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.DateCell;
import org.nasdanika.models.excel.EObjectCell;
import org.nasdanika.models.excel.ErrorCell;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.ExcelPackage;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.ReferenceCell;
import org.nasdanika.models.excel.StringCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.CellRowImpl#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellRowImpl extends RowImpl implements CellRow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.CELL_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Cell> getCells() {
		return (EList<Cell>)eDynamicGet(ExcelPackage.CELL_ROW__CELLS, ExcelPackage.Literals.CELL_ROW__CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BlankCell addBlankCell() {
		BlankCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createBlankCell();
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BooleanCell addBooleanCell(boolean value) {
		BooleanCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createBooleanCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public DateCell addDateCell(Date value) {
		DateCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createDateCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EObjectCell addEObjectCell(EObject value) {
		EObjectCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createEObjectCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ErrorCell addErrorCell(byte value) {
		ErrorCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createErrorCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NumericCell addNumericCell(double value) {
		NumericCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createNumericCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ReferenceCell addReferenceCell(EObject target) {
		ReferenceCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createReferenceCell();
		cell.setTarget(target);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public StringCell addStringCell(String value) {
		StringCell cell = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createStringCell();
		cell.setValue(value);
		cell.setColumnIndex(getCells().size());
		getCells().add(cell);		
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelPackage.CELL_ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelPackage.CELL_ROW__CELLS:
				return getCells();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExcelPackage.CELL_ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExcelPackage.CELL_ROW__CELLS:
				getCells().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExcelPackage.CELL_ROW__CELLS:
				return !getCells().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExcelPackage.CELL_ROW___ADD_BLANK_CELL:
				return addBlankCell();
			case ExcelPackage.CELL_ROW___ADD_BOOLEAN_CELL__BOOLEAN:
				return addBooleanCell((Boolean)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_DATE_CELL__DATE:
				return addDateCell((Date)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_EOBJECT_CELL__EOBJECT:
				return addEObjectCell((EObject)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_ERROR_CELL__BYTE:
				return addErrorCell((Byte)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_NUMERIC_CELL__DOUBLE:
				return addNumericCell((Double)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_REFERENCE_CELL__EOBJECT:
				return addReferenceCell((EObject)arguments.get(0));
			case ExcelPackage.CELL_ROW___ADD_STRING_CELL__STRING:
				return addStringCell((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CellRowImpl
