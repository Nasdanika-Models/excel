/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.excel.ExcelPackage
 * @generated
 */
public interface ExcelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExcelFactory eINSTANCE = org.nasdanika.models.excel.impl.ExcelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workbook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workbook</em>'.
	 * @generated
	 */
	Workbook createWorkbook();

	/**
	 * Returns a new object of class '<em>Row Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row Sheet</em>'.
	 * @generated
	 */
	RowSheet createRowSheet();

	/**
	 * Returns a new object of class '<em>List Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Sheet</em>'.
	 * @generated
	 */
	ListSheet createListSheet();

	/**
	 * Returns a new object of class '<em>Cell Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Row</em>'.
	 * @generated
	 */
	CellRow createCellRow();

	/**
	 * Returns a new object of class '<em>EObject Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Row</em>'.
	 * @generated
	 */
	EObjectRow createEObjectRow();

	/**
	 * Returns a new object of class '<em>List Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Row</em>'.
	 * @generated
	 */
	ListRow createListRow();

	/**
	 * Returns a new object of class '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell</em>'.
	 * @generated
	 */
	Cell createCell();

	/**
	 * Returns a new object of class '<em>Blank Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blank Cell</em>'.
	 * @generated
	 */
	BlankCell createBlankCell();

	/**
	 * Returns a new object of class '<em>Boolean Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Cell</em>'.
	 * @generated
	 */
	BooleanCell createBooleanCell();

	/**
	 * Returns a new object of class '<em>Date Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Cell</em>'.
	 * @generated
	 */
	DateCell createDateCell();

	/**
	 * Returns a new object of class '<em>Error Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Cell</em>'.
	 * @generated
	 */
	ErrorCell createErrorCell();

	/**
	 * Returns a new object of class '<em>Numeric Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Cell</em>'.
	 * @generated
	 */
	NumericCell createNumericCell();

	/**
	 * Returns a new object of class '<em>String Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Cell</em>'.
	 * @generated
	 */
	StringCell createStringCell();

	/**
	 * Returns a new object of class '<em>EObject Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Cell</em>'.
	 * @generated
	 */
	EObjectCell createEObjectCell();

	/**
	 * Returns a new object of class '<em>Reference Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Cell</em>'.
	 * @generated
	 */
	ReferenceCell createReferenceCell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExcelPackage getExcelPackage();

} //ExcelFactory
