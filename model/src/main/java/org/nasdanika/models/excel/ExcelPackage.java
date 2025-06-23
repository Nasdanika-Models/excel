/**
 */
package org.nasdanika.models.excel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.excel.ExcelFactory
 * @model kind="package"
 * @generated
 */
public interface ExcelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "excel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/excel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.excel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExcelPackage eINSTANCE = org.nasdanika.models.excel.impl.ExcelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.WorkbookImpl <em>Workbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.WorkbookImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getWorkbook()
	 * @generated
	 */
	int WORKBOOK = 0;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK__SHEETS = 0;

	/**
	 * The number of structural features of the '<em>Workbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Row Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK___ADD_ROW_SHEET__STRING = 0;

	/**
	 * The number of operations of the '<em>Workbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBOOK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.SheetImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.RowSheetImpl <em>Row Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.RowSheetImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getRowSheet()
	 * @generated
	 */
	int ROW_SHEET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SHEET__NAME = SHEET__NAME;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SHEET__ROWS = SHEET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SHEET_FEATURE_COUNT = SHEET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Cell Row</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SHEET___ADD_CELL_ROW = SHEET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SHEET_OPERATION_COUNT = SHEET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.ListSheetImpl <em>List Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.ListSheetImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getListSheet()
	 * @generated
	 */
	int LIST_SHEET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SHEET__NAME = SHEET__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SHEET__CONTENTS = SHEET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SHEET_FEATURE_COUNT = SHEET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SHEET_OPERATION_COUNT = SHEET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.RowImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.CellRowImpl <em>Cell Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.CellRowImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getCellRow()
	 * @generated
	 */
	int CELL_ROW = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW__NUMBER = ROW__NUMBER;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW__CELLS = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Blank Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_BLANK_CELL = ROW_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Boolean Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_BOOLEAN_CELL__BOOLEAN = ROW_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Date Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_DATE_CELL__DATE = ROW_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add EObject Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_EOBJECT_CELL__EOBJECT = ROW_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Error Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_ERROR_CELL__BYTE = ROW_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Numeric Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_NUMERIC_CELL__DOUBLE = ROW_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Reference Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_REFERENCE_CELL__EOBJECT = ROW_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add String Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_STRING_CELL__STRING = ROW_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Hyperlink Cell</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW___ADD_HYPERLINK_CELL__STRING_STRING = ROW_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Cell Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.EObjectRowImpl <em>EObject Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.EObjectRowImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getEObjectRow()
	 * @generated
	 */
	int EOBJECT_ROW = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_ROW__NUMBER = ROW__NUMBER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_ROW__CONTENTS = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EObject Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.ListRowImpl <em>List Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.ListRowImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getListRow()
	 * @generated
	 */
	int LIST_ROW = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ROW__NUMBER = ROW__NUMBER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ROW__CONTENTS = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.CellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 8;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLUMN_INDEX = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.BlankCellImpl <em>Blank Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.BlankCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getBlankCell()
	 * @generated
	 */
	int BLANK_CELL = 9;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The number of structural features of the '<em>Blank Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blank Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLANK_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.BooleanCellImpl <em>Boolean Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.BooleanCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getBooleanCell()
	 * @generated
	 */
	int BOOLEAN_CELL = 10;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.DateCellImpl <em>Date Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.DateCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getDateCell()
	 * @generated
	 */
	int DATE_CELL = 11;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.ErrorCellImpl <em>Error Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.ErrorCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getErrorCell()
	 * @generated
	 */
	int ERROR_CELL = 12;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.NumericCellImpl <em>Numeric Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.NumericCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getNumericCell()
	 * @generated
	 */
	int NUMERIC_CELL = 13;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.StringCellImpl <em>String Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.StringCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getStringCell()
	 * @generated
	 */
	int STRING_CELL = 14;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.EObjectCellImpl <em>EObject Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.EObjectCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getEObjectCell()
	 * @generated
	 */
	int EOBJECT_CELL = 15;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_CELL__VALUE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EObject Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.ReferenceCellImpl <em>Reference Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.ReferenceCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getReferenceCell()
	 * @generated
	 */
	int REFERENCE_CELL = 16;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CELL__COLUMN_INDEX = CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CELL__TARGET = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.impl.HyperlinkCellImpl <em>Hyperlink Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.impl.HyperlinkCellImpl
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getHyperlinkCell()
	 * @generated
	 */
	int HYPERLINK_CELL = 17;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL__COLUMN_INDEX = STRING_CELL__COLUMN_INDEX;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL__VALUE = STRING_CELL__VALUE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL__ADDRESS = STRING_CELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hyperlink Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL__HYPERLINK_TYPE = STRING_CELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hyperlink Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL_FEATURE_COUNT = STRING_CELL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hyperlink Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERLINK_CELL_OPERATION_COUNT = STRING_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.excel.HyperlinkType <em>Hyperlink Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.excel.HyperlinkType
	 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getHyperlinkType()
	 * @generated
	 */
	int HYPERLINK_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.Workbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workbook</em>'.
	 * @see org.nasdanika.models.excel.Workbook
	 * @generated
	 */
	EClass getWorkbook();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.excel.Workbook#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheets</em>'.
	 * @see org.nasdanika.models.excel.Workbook#getSheets()
	 * @see #getWorkbook()
	 * @generated
	 */
	EReference getWorkbook_Sheets();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.Workbook#addRowSheet(java.lang.String) <em>Add Row Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Row Sheet</em>' operation.
	 * @see org.nasdanika.models.excel.Workbook#addRowSheet(java.lang.String)
	 * @generated
	 */
	EOperation getWorkbook__AddRowSheet__String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see org.nasdanika.models.excel.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.Sheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.excel.Sheet#getName()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.RowSheet <em>Row Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Sheet</em>'.
	 * @see org.nasdanika.models.excel.RowSheet
	 * @generated
	 */
	EClass getRowSheet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.excel.RowSheet#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.models.excel.RowSheet#getRows()
	 * @see #getRowSheet()
	 * @generated
	 */
	EReference getRowSheet_Rows();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.RowSheet#addCellRow() <em>Add Cell Row</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cell Row</em>' operation.
	 * @see org.nasdanika.models.excel.RowSheet#addCellRow()
	 * @generated
	 */
	EOperation getRowSheet__AddCellRow();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.ListSheet <em>List Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Sheet</em>'.
	 * @see org.nasdanika.models.excel.ListSheet
	 * @generated
	 */
	EClass getListSheet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.excel.ListSheet#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.nasdanika.models.excel.ListSheet#getContents()
	 * @see #getListSheet()
	 * @generated
	 */
	EReference getListSheet_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.nasdanika.models.excel.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.Row#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.nasdanika.models.excel.Row#getNumber()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Number();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.CellRow <em>Cell Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Row</em>'.
	 * @see org.nasdanika.models.excel.CellRow
	 * @generated
	 */
	EClass getCellRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.excel.CellRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.models.excel.CellRow#getCells()
	 * @see #getCellRow()
	 * @generated
	 */
	EReference getCellRow_Cells();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addBlankCell() <em>Add Blank Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Blank Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addBlankCell()
	 * @generated
	 */
	EOperation getCellRow__AddBlankCell();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addBooleanCell(boolean) <em>Add Boolean Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Boolean Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addBooleanCell(boolean)
	 * @generated
	 */
	EOperation getCellRow__AddBooleanCell__boolean();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addDateCell(java.util.Date) <em>Add Date Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Date Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addDateCell(java.util.Date)
	 * @generated
	 */
	EOperation getCellRow__AddDateCell__Date();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addEObjectCell(org.eclipse.emf.ecore.EObject) <em>Add EObject Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add EObject Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addEObjectCell(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCellRow__AddEObjectCell__EObject();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addErrorCell(byte) <em>Add Error Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Error Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addErrorCell(byte)
	 * @generated
	 */
	EOperation getCellRow__AddErrorCell__byte();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addNumericCell(double) <em>Add Numeric Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Numeric Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addNumericCell(double)
	 * @generated
	 */
	EOperation getCellRow__AddNumericCell__double();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addReferenceCell(org.eclipse.emf.ecore.EObject) <em>Add Reference Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Reference Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addReferenceCell(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getCellRow__AddReferenceCell__EObject();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addStringCell(java.lang.String) <em>Add String Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add String Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addStringCell(java.lang.String)
	 * @generated
	 */
	EOperation getCellRow__AddStringCell__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.excel.CellRow#addHyperlinkCell(java.lang.String, java.lang.String) <em>Add Hyperlink Cell</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Hyperlink Cell</em>' operation.
	 * @see org.nasdanika.models.excel.CellRow#addHyperlinkCell(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCellRow__AddHyperlinkCell__String_String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.EObjectRow <em>EObject Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Row</em>'.
	 * @see org.nasdanika.models.excel.EObjectRow
	 * @generated
	 */
	EClass getEObjectRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.excel.EObjectRow#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see org.nasdanika.models.excel.EObjectRow#getContents()
	 * @see #getEObjectRow()
	 * @generated
	 */
	EReference getEObjectRow_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.ListRow <em>List Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Row</em>'.
	 * @see org.nasdanika.models.excel.ListRow
	 * @generated
	 */
	EClass getListRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.excel.ListRow#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.nasdanika.models.excel.ListRow#getContents()
	 * @see #getListRow()
	 * @generated
	 */
	EReference getListRow_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see org.nasdanika.models.excel.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.Cell#getColumnIndex <em>Column Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Index</em>'.
	 * @see org.nasdanika.models.excel.Cell#getColumnIndex()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ColumnIndex();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.BlankCell <em>Blank Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blank Cell</em>'.
	 * @see org.nasdanika.models.excel.BlankCell
	 * @generated
	 */
	EClass getBlankCell();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.BooleanCell <em>Boolean Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Cell</em>'.
	 * @see org.nasdanika.models.excel.BooleanCell
	 * @generated
	 */
	EClass getBooleanCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.BooleanCell#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.BooleanCell#isValue()
	 * @see #getBooleanCell()
	 * @generated
	 */
	EAttribute getBooleanCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.DateCell <em>Date Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Cell</em>'.
	 * @see org.nasdanika.models.excel.DateCell
	 * @generated
	 */
	EClass getDateCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.DateCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.DateCell#getValue()
	 * @see #getDateCell()
	 * @generated
	 */
	EAttribute getDateCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.ErrorCell <em>Error Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Cell</em>'.
	 * @see org.nasdanika.models.excel.ErrorCell
	 * @generated
	 */
	EClass getErrorCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.ErrorCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.ErrorCell#getValue()
	 * @see #getErrorCell()
	 * @generated
	 */
	EAttribute getErrorCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.NumericCell <em>Numeric Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Cell</em>'.
	 * @see org.nasdanika.models.excel.NumericCell
	 * @generated
	 */
	EClass getNumericCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.NumericCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.NumericCell#getValue()
	 * @see #getNumericCell()
	 * @generated
	 */
	EAttribute getNumericCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.StringCell <em>String Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Cell</em>'.
	 * @see org.nasdanika.models.excel.StringCell
	 * @generated
	 */
	EClass getStringCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.StringCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.StringCell#getValue()
	 * @see #getStringCell()
	 * @generated
	 */
	EAttribute getStringCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.EObjectCell <em>EObject Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Cell</em>'.
	 * @see org.nasdanika.models.excel.EObjectCell
	 * @generated
	 */
	EClass getEObjectCell();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.excel.EObjectCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.excel.EObjectCell#getValue()
	 * @see #getEObjectCell()
	 * @generated
	 */
	EReference getEObjectCell_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.ReferenceCell <em>Reference Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Cell</em>'.
	 * @see org.nasdanika.models.excel.ReferenceCell
	 * @generated
	 */
	EClass getReferenceCell();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.excel.ReferenceCell#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.excel.ReferenceCell#getTarget()
	 * @see #getReferenceCell()
	 * @generated
	 */
	EReference getReferenceCell_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.excel.HyperlinkCell <em>Hyperlink Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyperlink Cell</em>'.
	 * @see org.nasdanika.models.excel.HyperlinkCell
	 * @generated
	 */
	EClass getHyperlinkCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.HyperlinkCell#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.nasdanika.models.excel.HyperlinkCell#getAddress()
	 * @see #getHyperlinkCell()
	 * @generated
	 */
	EAttribute getHyperlinkCell_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.excel.HyperlinkCell#getHyperlinkType <em>Hyperlink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink Type</em>'.
	 * @see org.nasdanika.models.excel.HyperlinkCell#getHyperlinkType()
	 * @see #getHyperlinkCell()
	 * @generated
	 */
	EAttribute getHyperlinkCell_HyperlinkType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.excel.HyperlinkType <em>Hyperlink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hyperlink Type</em>'.
	 * @see org.nasdanika.models.excel.HyperlinkType
	 * @generated
	 */
	EEnum getHyperlinkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExcelFactory getExcelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.WorkbookImpl <em>Workbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.WorkbookImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getWorkbook()
		 * @generated
		 */
		EClass WORKBOOK = eINSTANCE.getWorkbook();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBOOK__SHEETS = eINSTANCE.getWorkbook_Sheets();

		/**
		 * The meta object literal for the '<em><b>Add Row Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORKBOOK___ADD_ROW_SHEET__STRING = eINSTANCE.getWorkbook__AddRowSheet__String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.SheetImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__NAME = eINSTANCE.getSheet_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.RowSheetImpl <em>Row Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.RowSheetImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getRowSheet()
		 * @generated
		 */
		EClass ROW_SHEET = eINSTANCE.getRowSheet();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_SHEET__ROWS = eINSTANCE.getRowSheet_Rows();

		/**
		 * The meta object literal for the '<em><b>Add Cell Row</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROW_SHEET___ADD_CELL_ROW = eINSTANCE.getRowSheet__AddCellRow();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.ListSheetImpl <em>List Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.ListSheetImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getListSheet()
		 * @generated
		 */
		EClass LIST_SHEET = eINSTANCE.getListSheet();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_SHEET__CONTENTS = eINSTANCE.getListSheet_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.RowImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NUMBER = eINSTANCE.getRow_Number();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.CellRowImpl <em>Cell Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.CellRowImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getCellRow()
		 * @generated
		 */
		EClass CELL_ROW = eINSTANCE.getCellRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_ROW__CELLS = eINSTANCE.getCellRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Add Blank Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_BLANK_CELL = eINSTANCE.getCellRow__AddBlankCell();

		/**
		 * The meta object literal for the '<em><b>Add Boolean Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_BOOLEAN_CELL__BOOLEAN = eINSTANCE.getCellRow__AddBooleanCell__boolean();

		/**
		 * The meta object literal for the '<em><b>Add Date Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_DATE_CELL__DATE = eINSTANCE.getCellRow__AddDateCell__Date();

		/**
		 * The meta object literal for the '<em><b>Add EObject Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_EOBJECT_CELL__EOBJECT = eINSTANCE.getCellRow__AddEObjectCell__EObject();

		/**
		 * The meta object literal for the '<em><b>Add Error Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_ERROR_CELL__BYTE = eINSTANCE.getCellRow__AddErrorCell__byte();

		/**
		 * The meta object literal for the '<em><b>Add Numeric Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_NUMERIC_CELL__DOUBLE = eINSTANCE.getCellRow__AddNumericCell__double();

		/**
		 * The meta object literal for the '<em><b>Add Reference Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_REFERENCE_CELL__EOBJECT = eINSTANCE.getCellRow__AddReferenceCell__EObject();

		/**
		 * The meta object literal for the '<em><b>Add String Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_STRING_CELL__STRING = eINSTANCE.getCellRow__AddStringCell__String();

		/**
		 * The meta object literal for the '<em><b>Add Hyperlink Cell</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL_ROW___ADD_HYPERLINK_CELL__STRING_STRING = eINSTANCE.getCellRow__AddHyperlinkCell__String_String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.EObjectRowImpl <em>EObject Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.EObjectRowImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getEObjectRow()
		 * @generated
		 */
		EClass EOBJECT_ROW = eINSTANCE.getEObjectRow();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_ROW__CONTENTS = eINSTANCE.getEObjectRow_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.ListRowImpl <em>List Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.ListRowImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getListRow()
		 * @generated
		 */
		EClass LIST_ROW = eINSTANCE.getListRow();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ROW__CONTENTS = eINSTANCE.getListRow_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.CellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Column Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COLUMN_INDEX = eINSTANCE.getCell_ColumnIndex();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.BlankCellImpl <em>Blank Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.BlankCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getBlankCell()
		 * @generated
		 */
		EClass BLANK_CELL = eINSTANCE.getBlankCell();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.BooleanCellImpl <em>Boolean Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.BooleanCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getBooleanCell()
		 * @generated
		 */
		EClass BOOLEAN_CELL = eINSTANCE.getBooleanCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CELL__VALUE = eINSTANCE.getBooleanCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.DateCellImpl <em>Date Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.DateCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getDateCell()
		 * @generated
		 */
		EClass DATE_CELL = eINSTANCE.getDateCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_CELL__VALUE = eINSTANCE.getDateCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.ErrorCellImpl <em>Error Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.ErrorCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getErrorCell()
		 * @generated
		 */
		EClass ERROR_CELL = eINSTANCE.getErrorCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_CELL__VALUE = eINSTANCE.getErrorCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.NumericCellImpl <em>Numeric Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.NumericCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getNumericCell()
		 * @generated
		 */
		EClass NUMERIC_CELL = eINSTANCE.getNumericCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_CELL__VALUE = eINSTANCE.getNumericCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.StringCellImpl <em>String Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.StringCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getStringCell()
		 * @generated
		 */
		EClass STRING_CELL = eINSTANCE.getStringCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CELL__VALUE = eINSTANCE.getStringCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.EObjectCellImpl <em>EObject Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.EObjectCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getEObjectCell()
		 * @generated
		 */
		EClass EOBJECT_CELL = eINSTANCE.getEObjectCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_CELL__VALUE = eINSTANCE.getEObjectCell_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.ReferenceCellImpl <em>Reference Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.ReferenceCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getReferenceCell()
		 * @generated
		 */
		EClass REFERENCE_CELL = eINSTANCE.getReferenceCell();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CELL__TARGET = eINSTANCE.getReferenceCell_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.impl.HyperlinkCellImpl <em>Hyperlink Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.impl.HyperlinkCellImpl
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getHyperlinkCell()
		 * @generated
		 */
		EClass HYPERLINK_CELL = eINSTANCE.getHyperlinkCell();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERLINK_CELL__ADDRESS = eINSTANCE.getHyperlinkCell_Address();

		/**
		 * The meta object literal for the '<em><b>Hyperlink Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERLINK_CELL__HYPERLINK_TYPE = eINSTANCE.getHyperlinkCell_HyperlinkType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.excel.HyperlinkType <em>Hyperlink Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.excel.HyperlinkType
		 * @see org.nasdanika.models.excel.impl.ExcelPackageImpl#getHyperlinkType()
		 * @generated
		 */
		EEnum HYPERLINK_TYPE = eINSTANCE.getHyperlinkType();

	}

} //ExcelPackage
