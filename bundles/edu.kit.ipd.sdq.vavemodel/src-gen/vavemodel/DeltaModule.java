/**
 */
package vavemodel;

import compare.Diff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.DeltaModule#getDeltaModuleID <em>Delta Module ID</em>}</li>
 *   <li>{@link vavemodel.DeltaModule#getDiff <em>Diff</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getDeltaModule()
 * @model
 * @generated
 */
public interface DeltaModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Delta Module ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Module ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Module ID</em>' attribute.
	 * @see #setDeltaModuleID(double)
	 * @see vavemodel.VavemodelPackage#getDeltaModule_DeltaModuleID()
	 * @model
	 * @generated
	 */
	double getDeltaModuleID();

	/**
	 * Sets the value of the '{@link vavemodel.DeltaModule#getDeltaModuleID <em>Delta Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Module ID</em>' attribute.
	 * @see #getDeltaModuleID()
	 * @generated
	 */
	void setDeltaModuleID(double value);

	/**
	 * Returns the value of the '<em><b>Diff</b></em>' containment reference list.
	 * The list contents are of type {@link compare.Diff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getDeltaModule_Diff()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diff> getDiff();

} // DeltaModule
