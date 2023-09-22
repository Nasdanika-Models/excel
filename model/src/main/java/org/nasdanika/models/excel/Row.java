/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.Row#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getRow()
 * @model abstract="true"
 * @generated
 */
public interface Row extends EObject {

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(long)
	 * @see org.nasdanika.models.excel.ExcelPackage#getRow_Number()
	 * @model
	 * @generated
	 */
	long getNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.Row#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(long value);
} // Row
