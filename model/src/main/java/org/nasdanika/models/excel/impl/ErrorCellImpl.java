/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.excel.ErrorCell;
import org.nasdanika.models.excel.ExcelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.ErrorCellImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorCellImpl extends CellImpl implements ErrorCell {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte VALUE_EDEFAULT = 0x00;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.ERROR_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte getValue() {
		return (Byte)eDynamicGet(ExcelPackage.ERROR_CELL__VALUE, ExcelPackage.Literals.ERROR_CELL__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(byte newValue) {
		eDynamicSet(ExcelPackage.ERROR_CELL__VALUE, ExcelPackage.Literals.ERROR_CELL__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelPackage.ERROR_CELL__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExcelPackage.ERROR_CELL__VALUE:
				setValue((Byte)newValue);
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
			case ExcelPackage.ERROR_CELL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ExcelPackage.ERROR_CELL__VALUE:
				return getValue() != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ErrorCellImpl
