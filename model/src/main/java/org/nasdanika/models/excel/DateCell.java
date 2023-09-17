/**
 */
package org.nasdanika.models.excel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.DateCell#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getDateCell()
 * @model
 * @generated
 */
public interface DateCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see org.nasdanika.models.excel.ExcelPackage#getDateCell_Value()
	 * @model
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.DateCell#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

} // DateCell
