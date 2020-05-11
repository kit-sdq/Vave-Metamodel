/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Variant#getVariationpoint <em>Variationpoint</em>}</li>
 *   <li>{@link vavemodel.Variant#getInitialVersion <em>Initial Version</em>}</li>
 *   <li>{@link vavemodel.Variant#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends Option {
	/**
	 * Returns the value of the '<em><b>Variationpoint</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.TreeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variationpoint</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getVariant_Variationpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreeConstraint> getVariationpoint();

	/**
	 * Returns the value of the '<em><b>Initial Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Version</em>' containment reference.
	 * @see #setInitialVersion(Revision)
	 * @see vavemodel.VavemodelPackage#getVariant_InitialVersion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Revision getInitialVersion();

	/**
	 * Sets the value of the '{@link vavemodel.Variant#getInitialVersion <em>Initial Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Version</em>' containment reference.
	 * @see #getInitialVersion()
	 * @generated
	 */
	void setInitialVersion(Revision value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vavemodel.VavemodelPackage#getVariant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vavemodel.Variant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variant
