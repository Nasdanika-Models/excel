/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.excel.EObjectRow;
import org.nasdanika.models.excel.ExcelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.impl.EObjectRowImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EObjectRowImpl extends RowImpl implements EObjectRow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.EOBJECT_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getContents() {
		return (EObject)eDynamicGet(ExcelPackage.EOBJECT_ROW__CONTENTS, ExcelPackage.Literals.EOBJECT_ROW__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContents(EObject newContents, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContents, ExcelPackage.EOBJECT_ROW__CONTENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(EObject newContents) {
		eDynamicSet(ExcelPackage.EOBJECT_ROW__CONTENTS, ExcelPackage.Literals.EOBJECT_ROW__CONTENTS, newContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExcelPackage.EOBJECT_ROW__CONTENTS:
				return basicSetContents(null, msgs);
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
			case ExcelPackage.EOBJECT_ROW__CONTENTS:
				return getContents();
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
			case ExcelPackage.EOBJECT_ROW__CONTENTS:
				setContents((EObject)newValue);
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
			case ExcelPackage.EOBJECT_ROW__CONTENTS:
				setContents((EObject)null);
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
			case ExcelPackage.EOBJECT_ROW__CONTENTS:
				return getContents() != null;
		}
		return super.eIsSet(featureID);
	}

} //EObjectRowImpl
