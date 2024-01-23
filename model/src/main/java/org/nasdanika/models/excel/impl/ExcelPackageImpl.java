/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.excel.BlankCell;
import org.nasdanika.models.excel.BooleanCell;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.DateCell;
import org.nasdanika.models.excel.EObjectCell;
import org.nasdanika.models.excel.EObjectRow;
import org.nasdanika.models.excel.ErrorCell;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.ExcelPackage;
import org.nasdanika.models.excel.ListRow;
import org.nasdanika.models.excel.ListSheet;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.ReferenceCell;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelPackageImpl extends EPackageImpl implements ExcelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workbookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blankCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceCellEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.excel.ExcelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExcelPackageImpl() {
		super(eNS_URI, ExcelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExcelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExcelPackage init() {
		if (isInited) return (ExcelPackage)EPackage.Registry.INSTANCE.getEPackage(ExcelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExcelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExcelPackageImpl theExcelPackage = registeredExcelPackage instanceof ExcelPackageImpl ? (ExcelPackageImpl)registeredExcelPackage : new ExcelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theExcelPackage.createPackageContents();

		// Initialize created meta-data
		theExcelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExcelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExcelPackage.eNS_URI, theExcelPackage);
		return theExcelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkbook() {
		return workbookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkbook_Sheets() {
		return (EReference)workbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWorkbook__AddRowSheet__String() {
		return workbookEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSheet() {
		return sheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSheet_Name() {
		return (EAttribute)sheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRowSheet() {
		return rowSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRowSheet_Rows() {
		return (EReference)rowSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRowSheet__AddCellRow() {
		return rowSheetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListSheet() {
		return listSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListSheet_Contents() {
		return (EReference)listSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRow_Number() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCellRow() {
		return cellRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCellRow_Cells() {
		return (EReference)cellRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddBlankCell() {
		return cellRowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddBooleanCell__boolean() {
		return cellRowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddDateCell__Date() {
		return cellRowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddEObjectCell__EObject() {
		return cellRowEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddErrorCell__byte() {
		return cellRowEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddNumericCell__double() {
		return cellRowEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddReferenceCell__EObject() {
		return cellRowEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCellRow__AddStringCell__String() {
		return cellRowEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEObjectRow() {
		return eObjectRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEObjectRow_Contents() {
		return (EReference)eObjectRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListRow() {
		return listRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListRow_Contents() {
		return (EReference)listRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_ColumnIndex() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlankCell() {
		return blankCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanCell() {
		return booleanCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanCell_Value() {
		return (EAttribute)booleanCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateCell() {
		return dateCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateCell_Value() {
		return (EAttribute)dateCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErrorCell() {
		return errorCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErrorCell_Value() {
		return (EAttribute)errorCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericCell() {
		return numericCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericCell_Value() {
		return (EAttribute)numericCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringCell() {
		return stringCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringCell_Value() {
		return (EAttribute)stringCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEObjectCell() {
		return eObjectCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEObjectCell_Value() {
		return (EReference)eObjectCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceCell() {
		return referenceCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceCell_Target() {
		return (EReference)referenceCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcelFactory getExcelFactory() {
		return (ExcelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workbookEClass = createEClass(WORKBOOK);
		createEReference(workbookEClass, WORKBOOK__SHEETS);
		createEOperation(workbookEClass, WORKBOOK___ADD_ROW_SHEET__STRING);

		sheetEClass = createEClass(SHEET);
		createEAttribute(sheetEClass, SHEET__NAME);

		rowSheetEClass = createEClass(ROW_SHEET);
		createEReference(rowSheetEClass, ROW_SHEET__ROWS);
		createEOperation(rowSheetEClass, ROW_SHEET___ADD_CELL_ROW);

		listSheetEClass = createEClass(LIST_SHEET);
		createEReference(listSheetEClass, LIST_SHEET__CONTENTS);

		rowEClass = createEClass(ROW);
		createEAttribute(rowEClass, ROW__NUMBER);

		cellRowEClass = createEClass(CELL_ROW);
		createEReference(cellRowEClass, CELL_ROW__CELLS);
		createEOperation(cellRowEClass, CELL_ROW___ADD_BLANK_CELL);
		createEOperation(cellRowEClass, CELL_ROW___ADD_BOOLEAN_CELL__BOOLEAN);
		createEOperation(cellRowEClass, CELL_ROW___ADD_DATE_CELL__DATE);
		createEOperation(cellRowEClass, CELL_ROW___ADD_EOBJECT_CELL__EOBJECT);
		createEOperation(cellRowEClass, CELL_ROW___ADD_ERROR_CELL__BYTE);
		createEOperation(cellRowEClass, CELL_ROW___ADD_NUMERIC_CELL__DOUBLE);
		createEOperation(cellRowEClass, CELL_ROW___ADD_REFERENCE_CELL__EOBJECT);
		createEOperation(cellRowEClass, CELL_ROW___ADD_STRING_CELL__STRING);

		eObjectRowEClass = createEClass(EOBJECT_ROW);
		createEReference(eObjectRowEClass, EOBJECT_ROW__CONTENTS);

		listRowEClass = createEClass(LIST_ROW);
		createEReference(listRowEClass, LIST_ROW__CONTENTS);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__COLUMN_INDEX);

		blankCellEClass = createEClass(BLANK_CELL);

		booleanCellEClass = createEClass(BOOLEAN_CELL);
		createEAttribute(booleanCellEClass, BOOLEAN_CELL__VALUE);

		dateCellEClass = createEClass(DATE_CELL);
		createEAttribute(dateCellEClass, DATE_CELL__VALUE);

		errorCellEClass = createEClass(ERROR_CELL);
		createEAttribute(errorCellEClass, ERROR_CELL__VALUE);

		numericCellEClass = createEClass(NUMERIC_CELL);
		createEAttribute(numericCellEClass, NUMERIC_CELL__VALUE);

		stringCellEClass = createEClass(STRING_CELL);
		createEAttribute(stringCellEClass, STRING_CELL__VALUE);

		eObjectCellEClass = createEClass(EOBJECT_CELL);
		createEReference(eObjectCellEClass, EOBJECT_CELL__VALUE);

		referenceCellEClass = createEClass(REFERENCE_CELL);
		createEReference(referenceCellEClass, REFERENCE_CELL__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rowSheetEClass.getESuperTypes().add(this.getSheet());
		listSheetEClass.getESuperTypes().add(this.getSheet());
		cellRowEClass.getESuperTypes().add(this.getRow());
		eObjectRowEClass.getESuperTypes().add(this.getRow());
		listRowEClass.getESuperTypes().add(this.getRow());
		blankCellEClass.getESuperTypes().add(this.getCell());
		booleanCellEClass.getESuperTypes().add(this.getCell());
		dateCellEClass.getESuperTypes().add(this.getCell());
		errorCellEClass.getESuperTypes().add(this.getCell());
		numericCellEClass.getESuperTypes().add(this.getCell());
		stringCellEClass.getESuperTypes().add(this.getCell());
		eObjectCellEClass.getESuperTypes().add(this.getCell());
		referenceCellEClass.getESuperTypes().add(this.getCell());

		// Initialize classes, features, and operations; add parameters
		initEClass(workbookEClass, Workbook.class, "Workbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkbook_Sheets(), this.getSheet(), null, "sheets", null, 0, -1, Workbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkbook_Sheets().getEKeys().add(this.getSheet_Name());

		EOperation op = initEOperation(getWorkbook__AddRowSheet__String(), this.getRowSheet(), "addRowSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sheetEClass, Sheet.class, "Sheet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSheet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowSheetEClass, RowSheet.class, "RowSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowSheet_Rows(), this.getRow(), null, "rows", null, 0, -1, RowSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRowSheet__AddCellRow(), this.getCellRow(), "addCellRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listSheetEClass, ListSheet.class, "ListSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListSheet_Contents(), ecorePackage.getEObject(), null, "contents", null, 0, -1, ListSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRow_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellRowEClass, CellRow.class, "CellRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellRow_Cells(), this.getCell(), null, "cells", null, 0, -1, CellRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCellRow__AddBlankCell(), this.getBlankCell(), "addBlankCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddBooleanCell__boolean(), this.getBooleanCell(), "addBooleanCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddDateCell__Date(), this.getDateCell(), "addDateCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddEObjectCell__EObject(), this.getEObjectCell(), "addEObjectCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddErrorCell__byte(), this.getErrorCell(), "addErrorCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddNumericCell__double(), this.getNumericCell(), "addNumericCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddReferenceCell__EObject(), this.getReferenceCell(), "addReferenceCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCellRow__AddStringCell__String(), this.getStringCell(), "addStringCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eObjectRowEClass, EObjectRow.class, "EObjectRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectRow_Contents(), ecorePackage.getEObject(), null, "contents", null, 0, 1, EObjectRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRowEClass, ListRow.class, "ListRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListRow_Contents(), ecorePackage.getEObject(), null, "contents", null, 0, -1, ListRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_ColumnIndex(), ecorePackage.getEInt(), "columnIndex", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blankCellEClass, BlankCell.class, "BlankCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanCellEClass, BooleanCell.class, "BooleanCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanCell_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateCellEClass, DateCell.class, "DateCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateCell_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DateCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorCellEClass, ErrorCell.class, "ErrorCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorCell_Value(), ecorePackage.getEByte(), "value", null, 0, 1, ErrorCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericCellEClass, NumericCell.class, "NumericCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericCell_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumericCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringCellEClass, StringCell.class, "StringCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringCell_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectCellEClass, EObjectCell.class, "EObjectCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectCell_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, EObjectCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceCellEClass, ReferenceCell.class, "ReferenceCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceCell_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, ReferenceCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (workbookEClass,
		   source,
		   new String[] {
			   "documentation", "Excel workbook containing sheets of possibly different type"
		   });
	}

} //ExcelPackageImpl
