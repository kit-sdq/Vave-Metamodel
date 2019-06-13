/**
 */
package vavemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vavemodel.Change;
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
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getChange <em>Change</em>}</li>
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
	protected static final double DELTA_MODULE_ID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeltaModuleID() <em>Delta Module ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaModuleID()
	 * @generated
	 * @ordered
	 */
	protected double deltaModuleID = DELTA_MODULE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected EList<Change> change;

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
	public double getDeltaModuleID() {
		return deltaModuleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaModuleID(double newDeltaModuleID) {
		double oldDeltaModuleID = deltaModuleID;
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
	public EList<Change> getChange() {
		if (change == null) {
			change = new EObjectContainmentEList<Change>(Change.class, this, VavemodelPackage.DELTA_MODULE__CHANGE);
		}
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__CHANGE:
				return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case VavemodelPackage.DELTA_MODULE__CHANGE:
				return getChange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTA_MODULE_ID:
				setDeltaModuleID((Double)newValue);
				return;
			case VavemodelPackage.DELTA_MODULE__CHANGE:
				getChange().clear();
				getChange().addAll((Collection<? extends Change>)newValue);
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
			case VavemodelPackage.DELTA_MODULE__CHANGE:
				getChange().clear();
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
				return deltaModuleID != DELTA_MODULE_ID_EDEFAULT;
			case VavemodelPackage.DELTA_MODULE__CHANGE:
				return change != null && !change.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DeltaModuleImpl
