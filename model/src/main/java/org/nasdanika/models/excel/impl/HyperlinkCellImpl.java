/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.excel.ExcelPackage;
import org.nasdanika.models.excel.HyperlinkCell;
import org.nasdanika.models.excel.HyperlinkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyperlink Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.HyperlinkCellImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.models.excel.impl.HyperlinkCellImpl#getHyperlinkType <em>Hyperlink Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperlinkCellImpl extends StringCellImpl implements HyperlinkCell {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHyperlinkType() <em>Hyperlink Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkType()
	 * @generated
	 * @ordered
	 */
	protected static final HyperlinkType HYPERLINK_TYPE_EDEFAULT = HyperlinkType.NONE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperlinkCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.HYPERLINK_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return (String)eDynamicGet(ExcelPackage.HYPERLINK_CELL__ADDRESS, ExcelPackage.Literals.HYPERLINK_CELL__ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		eDynamicSet(ExcelPackage.HYPERLINK_CELL__ADDRESS, ExcelPackage.Literals.HYPERLINK_CELL__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HyperlinkType getHyperlinkType() {
		return (HyperlinkType)eDynamicGet(ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE, ExcelPackage.Literals.HYPERLINK_CELL__HYPERLINK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHyperlinkType(HyperlinkType newHyperlinkType) {
		eDynamicSet(ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE, ExcelPackage.Literals.HYPERLINK_CELL__HYPERLINK_TYPE, newHyperlinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelPackage.HYPERLINK_CELL__ADDRESS:
				return getAddress();
			case ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE:
				return getHyperlinkType();
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
			case ExcelPackage.HYPERLINK_CELL__ADDRESS:
				setAddress((String)newValue);
				return;
			case ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE:
				setHyperlinkType((HyperlinkType)newValue);
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
			case ExcelPackage.HYPERLINK_CELL__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE:
				setHyperlinkType(HYPERLINK_TYPE_EDEFAULT);
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
			case ExcelPackage.HYPERLINK_CELL__ADDRESS:
				return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
			case ExcelPackage.HYPERLINK_CELL__HYPERLINK_TYPE:
				return getHyperlinkType() != HYPERLINK_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //HyperlinkCellImpl
