/**
 */
package org.nasdanika.models.excel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.NumericCell#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getNumericCell()
 * @model
 * @generated
 */
public interface NumericCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.nasdanika.models.excel.ExcelPackage#getNumericCell_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.NumericCell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // NumericCell
