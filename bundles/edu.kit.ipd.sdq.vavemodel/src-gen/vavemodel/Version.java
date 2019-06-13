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
 *   <li>{@link vavemodel.Version#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link vavemodel.Version#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link vavemodel.Version#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link vavemodel.Version#getDeltamodule <em>Deltamodule</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Version)
	 * @see vavemodel.VavemodelPackage#getVersion_Predecessor()
	 * @model
	 * @generated
	 */
	Version getPredecessor();

	/**
	 * Sets the value of the '{@link vavemodel.Version#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Version value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Version}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getVersion_Successor()
	 * @model
	 * @generated
	 */
	EList<Version> getSuccessor();

	/**
	 * Returns the value of the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version ID</em>' attribute.
	 * @see #setVersionID(double)
	 * @see vavemodel.VavemodelPackage#getVersion_VersionID()
	 * @model
	 * @generated
	 */
	double getVersionID();

	/**
	 * Sets the value of the '{@link vavemodel.Version#getVersionID <em>Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version ID</em>' attribute.
	 * @see #getVersionID()
	 * @generated
	 */
	void setVersionID(double value);

	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deltamodule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // Version
