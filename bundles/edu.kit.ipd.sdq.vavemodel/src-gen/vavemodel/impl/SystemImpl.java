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

import vavemodel.Constraints;
import vavemodel.Variant;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.SystemImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link vavemodel.impl.SystemImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements vavemodel.System {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraints> constraints;

	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected Variant rootNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraints> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraints>(Constraints.class, this, VavemodelPackage.SYSTEM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant getRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootNode(Variant newRootNode, NotificationChain msgs) {
		Variant oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VavemodelPackage.SYSTEM__ROOT_NODE, oldRootNode, newRootNode);
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
	public void setRootNode(Variant newRootNode) {
		if (newRootNode != rootNode) {
			NotificationChain msgs = null;
			if (rootNode != null)
				msgs = ((InternalEObject)rootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.SYSTEM__ROOT_NODE, null, msgs);
			if (newRootNode != null)
				msgs = ((InternalEObject)newRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.SYSTEM__ROOT_NODE, null, msgs);
			msgs = basicSetRootNode(newRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.SYSTEM__ROOT_NODE, newRootNode, newRootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.SYSTEM__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.SYSTEM__ROOT_NODE:
				return basicSetRootNode(null, msgs);
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
			case VavemodelPackage.SYSTEM__CONSTRAINTS:
				return getConstraints();
			case VavemodelPackage.SYSTEM__ROOT_NODE:
				return getRootNode();
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
			case VavemodelPackage.SYSTEM__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraints>)newValue);
				return;
			case VavemodelPackage.SYSTEM__ROOT_NODE:
				setRootNode((Variant)newValue);
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
			case VavemodelPackage.SYSTEM__CONSTRAINTS:
				getConstraints().clear();
				return;
			case VavemodelPackage.SYSTEM__ROOT_NODE:
				setRootNode((Variant)null);
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
			case VavemodelPackage.SYSTEM__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case VavemodelPackage.SYSTEM__ROOT_NODE:
				return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
