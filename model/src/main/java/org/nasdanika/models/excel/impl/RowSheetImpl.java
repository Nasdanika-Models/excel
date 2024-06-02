/**
 */
package org.nasdanika.models.excel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.OptionalInt;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.ExcelPackage;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.RowSheetImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowSheetImpl extends SheetImpl implements RowSheet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowSheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.ROW_SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Row> getRows() {
		return (EList<Row>)eDynamicGet(ExcelPackage.ROW_SHEET__ROWS, ExcelPackage.Literals.ROW_SHEET__ROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CellRow addCellRow() {
		CellRow cellRow = ((ExcelFactory) eClass().getEPackage().getEFactoryInstance()).createCellRow();
		OptionalInt maxRow = getRows().stream().mapToInt(Row::getNumber).max();
		cellRow.setNumber(maxRow.orElse(-1) + 1);
		getRows().add(cellRow);
		return cellRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelPackage.ROW_SHEET__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case ExcelPackage.ROW_SHEET__ROWS:
				return getRows();
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
			case ExcelPackage.ROW_SHEET__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
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
			case ExcelPackage.ROW_SHEET__ROWS:
				getRows().clear();
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
			case ExcelPackage.ROW_SHEET__ROWS:
				return !getRows().isEmpty();
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
			case ExcelPackage.ROW_SHEET___ADD_CELL_ROW:
				return addCellRow();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RowSheetImpl
