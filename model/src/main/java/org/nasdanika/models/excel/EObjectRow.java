/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.EObjectRow#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getEObjectRow()
 * @model
 * @generated
 */
public interface EObjectRow extends Row {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference.
	 * @see #setContents(EObject)
	 * @see org.nasdanika.models.excel.ExcelPackage#getEObjectRow_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EObject getContents();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.EObjectRow#getContents <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' containment reference.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(EObject value);

} // EObjectRow
