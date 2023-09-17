/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.RowSheet#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getRowSheet()
 * @model
 * @generated
 */
public interface RowSheet extends Sheet {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.excel.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.nasdanika.models.excel.ExcelPackage#getRowSheet_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

} // RowSheet
