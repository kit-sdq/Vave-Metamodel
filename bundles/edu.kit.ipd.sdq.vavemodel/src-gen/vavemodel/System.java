/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.System#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link vavemodel.System#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Constraints}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraints> getConstraints();

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' containment reference.
	 * @see #setRootNode(Variant)
	 * @see vavemodel.VavemodelPackage#getSystem_RootNode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variant getRootNode();

	/**
	 * Sets the value of the '{@link vavemodel.System#getRootNode <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' containment reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(Variant value);

} // System
