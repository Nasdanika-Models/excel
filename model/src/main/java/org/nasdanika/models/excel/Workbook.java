/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Excel workbook containing sheets of possibly different type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.Workbook#getSheets <em>Sheets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getWorkbook()
 * @model
 * @generated
 */
public interface Workbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.excel.Sheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' containment reference list.
	 * @see org.nasdanika.models.excel.ExcelPackage#getWorkbook_Sheets()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Sheet> getSheets();

} // Workbook
