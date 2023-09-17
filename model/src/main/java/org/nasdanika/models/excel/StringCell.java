/**
 */
package org.nasdanika.models.excel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.StringCell#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getStringCell()
 * @model
 * @generated
 */
public interface StringCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.excel.ExcelPackage#getStringCell_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.StringCell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringCell
