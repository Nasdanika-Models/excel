/**
 */
package org.nasdanika.models.excel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyperlink Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.excel.HyperlinkCell#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.models.excel.HyperlinkCell#getHyperlinkType <em>Hyperlink Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.excel.ExcelPackage#getHyperlinkCell()
 * @model
 * @generated
 */
public interface HyperlinkCell extends StringCell {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.nasdanika.models.excel.ExcelPackage#getHyperlinkCell_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.HyperlinkCell#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.excel.HyperlinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink Type</em>' attribute.
	 * @see org.nasdanika.models.excel.HyperlinkType
	 * @see #setHyperlinkType(HyperlinkType)
	 * @see org.nasdanika.models.excel.ExcelPackage#getHyperlinkCell_HyperlinkType()
	 * @model
	 * @generated
	 */
	HyperlinkType getHyperlinkType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.excel.HyperlinkCell#getHyperlinkType <em>Hyperlink Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Type</em>' attribute.
	 * @see org.nasdanika.models.excel.HyperlinkType
	 * @see #getHyperlinkType()
	 * @generated
	 */
	void setHyperlinkType(HyperlinkType value);

} // HyperlinkCell
