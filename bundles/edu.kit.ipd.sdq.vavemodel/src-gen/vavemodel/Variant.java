/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Variant#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.Variant#getVariationpoint <em>Variationpoint</em>}</li>
 *   <li>{@link vavemodel.Variant#getInitialVersion <em>Initial Version</em>}</li>
 *   <li>{@link vavemodel.Variant#isIsCore <em>Is Core</em>}</li>
 *   <li>{@link vavemodel.Variant#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

	/**
	 * Returns the value of the '<em><b>Variationpoint</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variationpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variationpoint</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getVariant_Variationpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariationPoint> getVariationpoint();

	/**
	 * Returns the value of the '<em><b>Initial Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Version</em>' containment reference.
	 * @see #setInitialVersion(Version)
	 * @see vavemodel.VavemodelPackage#getVariant_InitialVersion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Version getInitialVersion();

	/**
	 * Sets the value of the '{@link vavemodel.Variant#getInitialVersion <em>Initial Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Version</em>' containment reference.
	 * @see #getInitialVersion()
	 * @generated
	 */
	void setInitialVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Is Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Core</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Core</em>' attribute.
	 * @see #setIsCore(boolean)
	 * @see vavemodel.VavemodelPackage#getVariant_IsCore()
	 * @model
	 * @generated
	 */
	boolean isIsCore();

	/**
	 * Sets the value of the '{@link vavemodel.Variant#isIsCore <em>Is Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Core</em>' attribute.
	 * @see #isIsCore()
	 * @generated
	 */
	void setIsCore(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see vavemodel.VavemodelPackage#getVariant_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link vavemodel.Variant#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

} // Variant
