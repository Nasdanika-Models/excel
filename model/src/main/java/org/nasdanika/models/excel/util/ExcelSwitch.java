/**
 */
package org.nasdanika.models.excel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.excel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.excel.ExcelPackage
 * @generated
 */
public class ExcelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExcelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelSwitch() {
		if (modelPackage == null) {
			modelPackage = ExcelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExcelPackage.WORKBOOK: {
				Workbook workbook = (Workbook)theEObject;
				T result = caseWorkbook(workbook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.SHEET: {
				Sheet sheet = (Sheet)theEObject;
				T result = caseSheet(sheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.ROW_SHEET: {
				RowSheet rowSheet = (RowSheet)theEObject;
				T result = caseRowSheet(rowSheet);
				if (result == null) result = caseSheet(rowSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.LIST_SHEET: {
				ListSheet listSheet = (ListSheet)theEObject;
				T result = caseListSheet(listSheet);
				if (result == null) result = caseSheet(listSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.CELL_ROW: {
				CellRow cellRow = (CellRow)theEObject;
				T result = caseCellRow(cellRow);
				if (result == null) result = caseRow(cellRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.EOBJECT_ROW: {
				EObjectRow eObjectRow = (EObjectRow)theEObject;
				T result = caseEObjectRow(eObjectRow);
				if (result == null) result = caseRow(eObjectRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.LIST_ROW: {
				ListRow listRow = (ListRow)theEObject;
				T result = caseListRow(listRow);
				if (result == null) result = caseRow(listRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.BLANK_CELL: {
				BlankCell blankCell = (BlankCell)theEObject;
				T result = caseBlankCell(blankCell);
				if (result == null) result = caseCell(blankCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.BOOLEAN_CELL: {
				BooleanCell booleanCell = (BooleanCell)theEObject;
				T result = caseBooleanCell(booleanCell);
				if (result == null) result = caseCell(booleanCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.DATE_CELL: {
				DateCell dateCell = (DateCell)theEObject;
				T result = caseDateCell(dateCell);
				if (result == null) result = caseCell(dateCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.ERROR_CELL: {
				ErrorCell errorCell = (ErrorCell)theEObject;
				T result = caseErrorCell(errorCell);
				if (result == null) result = caseCell(errorCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.NUMERIC_CELL: {
				NumericCell numericCell = (NumericCell)theEObject;
				T result = caseNumericCell(numericCell);
				if (result == null) result = caseCell(numericCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.STRING_CELL: {
				StringCell stringCell = (StringCell)theEObject;
				T result = caseStringCell(stringCell);
				if (result == null) result = caseCell(stringCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.EOBJECT_CELL: {
				EObjectCell eObjectCell = (EObjectCell)theEObject;
				T result = caseEObjectCell(eObjectCell);
				if (result == null) result = caseCell(eObjectCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.REFERENCE_CELL: {
				ReferenceCell referenceCell = (ReferenceCell)theEObject;
				T result = caseReferenceCell(referenceCell);
				if (result == null) result = caseCell(referenceCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExcelPackage.HYPERLINK_CELL: {
				HyperlinkCell hyperlinkCell = (HyperlinkCell)theEObject;
				T result = caseHyperlinkCell(hyperlinkCell);
				if (result == null) result = caseStringCell(hyperlinkCell);
				if (result == null) result = caseCell(hyperlinkCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workbook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workbook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkbook(Workbook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheet(Sheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowSheet(RowSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSheet(ListSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellRow(CellRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectRow(EObjectRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRow(ListRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blank Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blank Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlankCell(BlankCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCell(BooleanCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateCell(DateCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorCell(ErrorCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericCell(NumericCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringCell(StringCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectCell(EObjectCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceCell(ReferenceCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyperlink Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyperlink Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperlinkCell(HyperlinkCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExcelSwitch
