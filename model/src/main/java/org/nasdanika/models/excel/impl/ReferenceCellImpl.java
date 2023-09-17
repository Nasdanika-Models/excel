/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.excel.ExcelPackage;
import org.nasdanika.models.excel.ReferenceCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.ReferenceCellImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceCellImpl extends CellImpl implements ReferenceCell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.REFERENCE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTarget() {
		return (EObject)eDynamicGet(ExcelPackage.REFERENCE_CELL__TARGET, ExcelPackage.Literals.REFERENCE_CELL__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return (EObject)eDynamicGet(ExcelPackage.REFERENCE_CELL__TARGET, ExcelPackage.Literals.REFERENCE_CELL__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EObject newTarget) {
		eDynamicSet(ExcelPackage.REFERENCE_CELL__TARGET, ExcelPackage.Literals.REFERENCE_CELL__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExcelPackage.REFERENCE_CELL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ExcelPackage.REFERENCE_CELL__TARGET:
				setTarget((EObject)newValue);
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
			case ExcelPackage.REFERENCE_CELL__TARGET:
				setTarget((EObject)null);
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
			case ExcelPackage.REFERENCE_CELL__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceCellImpl
