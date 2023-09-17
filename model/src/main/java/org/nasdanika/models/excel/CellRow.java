/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.CellRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getCellRow()
 * @model
 * @generated
 */
public interface CellRow extends Row {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.excel.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see org.nasdanika.models.excel.ExcelPackage#getCellRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // CellRow
