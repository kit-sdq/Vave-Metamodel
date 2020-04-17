/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Version#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link vavemodel.Version#getDeltamodule <em>Deltamodule</em>}</li>
 *   <li>{@link vavemodel.Version#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version ID</em>' attribute.
	 * @see #setVersionID(String)
	 * @see vavemodel.VavemodelPackage#getVersion_VersionID()
	 * @model
	 * @generated
	 */
	String getVersionID();

	/**
	 * Sets the value of the '{@link vavemodel.Version#getVersionID <em>Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>' attribute.
	 * @see #getVersionID()
	 * @generated
	 */
	void setVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamodule</em>' containment reference.
	 * @see #setDeltamodule(DeltaModule)
	 * @see vavemodel.VavemodelPackage#getVersion_Deltamodule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeltaModule getDeltamodule();

	/**
	 * Sets the value of the '{@link vavemodel.Version#getDeltamodule <em>Deltamodule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deltamodule</em>' containment reference.
	 * @see #getDeltamodule()
	 * @generated
	 */
	void setDeltamodule(DeltaModule value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getVersion_Successor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getSuccessor();

} // Version
