/**
 */
package vavemodel;

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
 *   <li>{@link vavemodel.DeltaModule#getOldVersionID <em>Old Version ID</em>}</li>
 *   <li>{@link vavemodel.DeltaModule#getNewVersionID <em>New Version ID</em>}</li>
 *   <li>{@link vavemodel.DeltaModule#getModelPath <em>Model Path</em>}</li>
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
	 * @see #setDeltaModuleID(String)
	 * @see vavemodel.VavemodelPackage#getDeltaModule_DeltaModuleID()
	 * @model
	 * @generated
	 */
	String getDeltaModuleID();

	/**
	 * Sets the value of the '{@link vavemodel.DeltaModule#getDeltaModuleID <em>Delta Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Module ID</em>' attribute.
	 * @see #getDeltaModuleID()
	 * @generated
	 */
	void setDeltaModuleID(String value);

	/**
	 * Returns the value of the '<em><b>Old Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version ID</em>' attribute.
	 * @see #setOldVersionID(String)
	 * @see vavemodel.VavemodelPackage#getDeltaModule_OldVersionID()
	 * @model
	 * @generated
	 */
	String getOldVersionID();

	/**
	 * Sets the value of the '{@link vavemodel.DeltaModule#getOldVersionID <em>Old Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version ID</em>' attribute.
	 * @see #getOldVersionID()
	 * @generated
	 */
	void setOldVersionID(String value);

	/**
	 * Returns the value of the '<em><b>New Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version ID</em>' attribute.
	 * @see #setNewVersionID(String)
	 * @see vavemodel.VavemodelPackage#getDeltaModule_NewVersionID()
	 * @model
	 * @generated
	 */
	String getNewVersionID();

	/**
	 * Sets the value of the '{@link vavemodel.DeltaModule#getNewVersionID <em>New Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Version ID</em>' attribute.
	 * @see #getNewVersionID()
	 * @generated
	 */
	void setNewVersionID(String value);

	/**
	 * Returns the value of the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Path</em>' attribute.
	 * @see #setModelPath(String)
	 * @see vavemodel.VavemodelPackage#getDeltaModule_ModelPath()
	 * @model
	 * @generated
	 */
	String getModelPath();

	/**
	 * Sets the value of the '{@link vavemodel.DeltaModule#getModelPath <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Path</em>' attribute.
	 * @see #getModelPath()
	 * @generated
	 */
	void setModelPath(String value);

} // DeltaModule
