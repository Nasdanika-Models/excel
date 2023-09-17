/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.Cell#getColumnIndex <em>Column Index</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {

	/**
	 * Returns the value of the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Index</em>' attribute.
	 * @see #setColumnIndex(int)
	 * @see org.nasdanika.models.excel.ExcelPackage#getCell_ColumnIndex()
	 * @model
	 * @generated
	 */
	int getColumnIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.Cell#getColumnIndex <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Index</em>' attribute.
	 * @see #getColumnIndex()
	 * @generated
	 */
	void setColumnIndex(int value);
} // Cell
