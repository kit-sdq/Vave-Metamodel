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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import vavemodel.DeltaModule;
import vavemodel.VavemodelPackage;
import vavemodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.VersionImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link vavemodel.impl.VersionImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link vavemodel.impl.VersionImpl#getVersionID <em>Version ID</em>}</li>
 *   <li>{@link vavemodel.impl.VersionImpl#getDeltamodule <em>Deltamodule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends MinimalEObjectImpl.Container implements Version {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Version predecessor;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Version> successor;

	/**
	 * The default value of the '{@link #getVersionID() <em>Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final double VERSION_ID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVersionID() <em>Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionID()
	 * @generated
	 * @ordered
	 */
	protected double versionID = VERSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeltamodule() <em>Deltamodule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltamodule()
	 * @generated
	 * @ordered
	 */
	protected DeltaModule deltamodule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Version)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VavemodelPackage.VERSION__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecessor(Version newPredecessor) {
		Version oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VERSION__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Version> getSuccessor() {
		if (successor == null) {
			successor = new EObjectResolvingEList<Version>(Version.class, this, VavemodelPackage.VERSION__SUCCESSOR);
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaModule getDeltamodule() {
		return deltamodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltamodule(DeltaModule newDeltamodule, NotificationChain msgs) {
		DeltaModule oldDeltamodule = deltamodule;
		deltamodule = newDeltamodule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VavemodelPackage.VERSION__DELTAMODULE, oldDeltamodule, newDeltamodule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltamodule(DeltaModule newDeltamodule) {
		if (newDeltamodule != deltamodule) {
			NotificationChain msgs = null;
			if (deltamodule != null)
				msgs = ((InternalEObject)deltamodule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.VERSION__DELTAMODULE, null, msgs);
			if (newDeltamodule != null)
				msgs = ((InternalEObject)newDeltamodule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.VERSION__DELTAMODULE, null, msgs);
			msgs = basicSetDeltamodule(newDeltamodule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VERSION__DELTAMODULE, newDeltamodule, newDeltamodule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVersionID() {
		return versionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionID(double newVersionID) {
		double oldVersionID = versionID;
		versionID = newVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VERSION__VERSION_ID, oldVersionID, versionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.VERSION__DELTAMODULE:
				return basicSetDeltamodule(null, msgs);
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
			case VavemodelPackage.VERSION__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case VavemodelPackage.VERSION__SUCCESSOR:
				return getSuccessor();
			case VavemodelPackage.VERSION__VERSION_ID:
				return getVersionID();
			case VavemodelPackage.VERSION__DELTAMODULE:
				return getDeltamodule();
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
			case VavemodelPackage.VERSION__PREDECESSOR:
				setPredecessor((Version)newValue);
				return;
			case VavemodelPackage.VERSION__SUCCESSOR:
				getSuccessor().clear();
				getSuccessor().addAll((Collection<? extends Version>)newValue);
				return;
			case VavemodelPackage.VERSION__VERSION_ID:
				setVersionID((Double)newValue);
				return;
			case VavemodelPackage.VERSION__DELTAMODULE:
				setDeltamodule((DeltaModule)newValue);
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
			case VavemodelPackage.VERSION__PREDECESSOR:
				setPredecessor((Version)null);
				return;
			case VavemodelPackage.VERSION__SUCCESSOR:
				getSuccessor().clear();
				return;
			case VavemodelPackage.VERSION__VERSION_ID:
				setVersionID(VERSION_ID_EDEFAULT);
				return;
			case VavemodelPackage.VERSION__DELTAMODULE:
				setDeltamodule((DeltaModule)null);
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
			case VavemodelPackage.VERSION__PREDECESSOR:
				return predecessor != null;
			case VavemodelPackage.VERSION__SUCCESSOR:
				return successor != null && !successor.isEmpty();
			case VavemodelPackage.VERSION__VERSION_ID:
				return versionID != VERSION_ID_EDEFAULT;
			case VavemodelPackage.VERSION__DELTAMODULE:
				return deltamodule != null;
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
		result.append(" (versionID: ");
		result.append(versionID);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
