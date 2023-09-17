/**
 */
package org.nasdanika.models.excel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.ErrorCell#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getErrorCell()
 * @model
 * @generated
 */
public interface ErrorCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte)
	 * @see org.nasdanika.models.excel.ExcelPackage#getErrorCell_Value()
	 * @model
	 * @generated
	 */
	byte getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.ErrorCell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte value);

} // ErrorCell
