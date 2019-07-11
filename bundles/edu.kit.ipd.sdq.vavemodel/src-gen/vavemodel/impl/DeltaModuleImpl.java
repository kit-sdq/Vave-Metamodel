/**
 */
package vavemodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vavemodel.DeltaModule;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getDeltaModuleID <em>Delta Module ID</em>}</li>
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getOldVersionID <em>Old Version ID</em>}</li>
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getNewVersionID <em>New Version ID</em>}</li>
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getModelPath <em>Model Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaModuleImpl extends MinimalEObjectImpl.Container implements DeltaModule {
	/**
	 * The default value of the '{@link #getDeltaModuleID() <em>Delta Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaModuleID()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_MODULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaModuleID() <em>Delta Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaModuleID()
	 * @generated
	 * @ordered
	 */
	protected String deltaModuleID = DELTA_MODULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldVersionID() <em>Old Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldVersionID() <em>Old Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersionID()
	 * @generated
	 * @ordered
	 */
	protected String oldVersionID = OLD_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewVersionID() <em>New Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewVersionID() <em>New Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersionID()
	 * @generated
	 * @ordered
	 */
	protected String newVersionID = NEW_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected String modelPath = MODEL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.DELTA_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeltaModuleID() {
		return deltaModuleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaModuleID(String newDeltaModuleID) {
		String oldDeltaModuleID = deltaModuleID;
		deltaModuleID = newDeltaModuleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID, oldDeltaModuleID, deltaModuleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldVersionID() {
		return oldVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldVersionID(String newOldVersionID) {
		String oldOldVersionID = oldVersionID;
		oldVersionID = newOldVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.DELTA_MODULE__OLD_VERSION_ID, oldOldVersionID, oldVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewVersionID() {
		return newVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewVersionID(String newNewVersionID) {
		String oldNewVersionID = newVersionID;
		newVersionID = newNewVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.DELTA_MODULE__NEW_VERSION_ID, oldNewVersionID, newVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelPath() {
		return modelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelPath(String newModelPath) {
		String oldModelPath = modelPath;
		modelPath = newModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.DELTA_MODULE__MODEL_PATH, oldModelPath, modelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID:
				return getDeltaModuleID();
			case VavemodelPackage.DELTA_MODULE__OLD_VERSION_ID:
				return getOldVersionID();
			case VavemodelPackage.DELTA_MODULE__NEW_VERSION_ID:
				return getNewVersionID();
			case VavemodelPackage.DELTA_MODULE__MODEL_PATH:
				return getModelPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID:
				setDeltaModuleID((String)newValue);
				return;
			case VavemodelPackage.DELTA_MODULE__OLD_VERSION_ID:
				setOldVersionID((String)newValue);
				return;
			case VavemodelPackage.DELTA_MODULE__NEW_VERSION_ID:
				setNewVersionID((String)newValue);
				return;
			case VavemodelPackage.DELTA_MODULE__MODEL_PATH:
				setModelPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID:
				setDeltaModuleID(DELTA_MODULE_ID_EDEFAULT);
				return;
			case VavemodelPackage.DELTA_MODULE__OLD_VERSION_ID:
				setOldVersionID(OLD_VERSION_ID_EDEFAULT);
				return;
			case VavemodelPackage.DELTA_MODULE__NEW_VERSION_ID:
				setNewVersionID(NEW_VERSION_ID_EDEFAULT);
				return;
			case VavemodelPackage.DELTA_MODULE__MODEL_PATH:
				setModelPath(MODEL_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID:
				return DELTA_MODULE_ID_EDEFAULT == null ? deltaModuleID != null : !DELTA_MODULE_ID_EDEFAULT.equals(deltaModuleID);
			case VavemodelPackage.DELTA_MODULE__OLD_VERSION_ID:
				return OLD_VERSION_ID_EDEFAULT == null ? oldVersionID != null : !OLD_VERSION_ID_EDEFAULT.equals(oldVersionID);
			case VavemodelPackage.DELTA_MODULE__NEW_VERSION_ID:
				return NEW_VERSION_ID_EDEFAULT == null ? newVersionID != null : !NEW_VERSION_ID_EDEFAULT.equals(newVersionID);
			case VavemodelPackage.DELTA_MODULE__MODEL_PATH:
				return MODEL_PATH_EDEFAULT == null ? modelPath != null : !MODEL_PATH_EDEFAULT.equals(modelPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (deltaModuleID: ");
		result.append(deltaModuleID);
		result.append(", oldVersionID: ");
		result.append(oldVersionID);
		result.append(", newVersionID: ");
		result.append(newVersionID);
		result.append(", modelPath: ");
		result.append(modelPath);
		result.append(')');
		return result.toString();
	}

} //DeltaModuleImpl
