/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.ListRow#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getListRow()
 * @model
 * @generated
 */
public interface ListRow extends Row {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.nasdanika.models.excel.ExcelPackage#getListRow_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

} // ListRow
