/**
 */
package org.nasdanika.models.excel.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.excel.BlankCell;
import org.nasdanika.models.excel.ExcelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blank Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlankCellImpl extends CellImpl implements BlankCell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlankCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExcelPackage.Literals.BLANK_CELL;
	}

} //BlankCellImpl
