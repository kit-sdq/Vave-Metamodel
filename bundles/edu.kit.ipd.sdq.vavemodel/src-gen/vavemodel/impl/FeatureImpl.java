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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vavemodel.Feature;
import vavemodel.Revision;
import vavemodel.TreeConstraint;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.FeatureImpl#getVariationpoint <em>Variationpoint</em>}</li>
 *   <li>{@link vavemodel.impl.FeatureImpl#getInitialVersion <em>Initial Version</em>}</li>
 *   <li>{@link vavemodel.impl.FeatureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends OptionImpl implements Feature {
	/**
	 * The cached value of the '{@link #getVariationpoint() <em>Variationpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariationpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeConstraint> variationpoint;

	/**
	 * The cached value of the '{@link #getInitialVersion() <em>Initial Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialVersion()
	 * @generated
	 * @ordered
	 */
	protected Revision initialVersion;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TreeConstraint> getVariationpoint() {
		if (variationpoint == null) {
			variationpoint = new EObjectContainmentEList<TreeConstraint>(TreeConstraint.class, this, VavemodelPackage.FEATURE__VARIATIONPOINT);
		}
		return variationpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revision getInitialVersion() {
		return initialVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialVersion(Revision newInitialVersion, NotificationChain msgs) {
		Revision oldInitialVersion = initialVersion;
		initialVersion = newInitialVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VavemodelPackage.FEATURE__INITIAL_VERSION, oldInitialVersion, newInitialVersion);
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
	public void setInitialVersion(Revision newInitialVersion) {
		if (newInitialVersion != initialVersion) {
			NotificationChain msgs = null;
			if (initialVersion != null)
				msgs = ((InternalEObject)initialVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.FEATURE__INITIAL_VERSION, null, msgs);
			if (newInitialVersion != null)
				msgs = ((InternalEObject)newInitialVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.FEATURE__INITIAL_VERSION, null, msgs);
			msgs = basicSetInitialVersion(newInitialVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.FEATURE__INITIAL_VERSION, newInitialVersion, newInitialVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.FEATURE__VARIATIONPOINT:
				return ((InternalEList<?>)getVariationpoint()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.FEATURE__INITIAL_VERSION:
				return basicSetInitialVersion(null, msgs);
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
			case VavemodelPackage.FEATURE__VARIATIONPOINT:
				return getVariationpoint();
			case VavemodelPackage.FEATURE__INITIAL_VERSION:
				return getInitialVersion();
			case VavemodelPackage.FEATURE__NAME:
				return getName();
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
			case VavemodelPackage.FEATURE__VARIATIONPOINT:
				getVariationpoint().clear();
				getVariationpoint().addAll((Collection<? extends TreeConstraint>)newValue);
				return;
			case VavemodelPackage.FEATURE__INITIAL_VERSION:
				setInitialVersion((Revision)newValue);
				return;
			case VavemodelPackage.FEATURE__NAME:
				setName((String)newValue);
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
			case VavemodelPackage.FEATURE__VARIATIONPOINT:
				getVariationpoint().clear();
				return;
			case VavemodelPackage.FEATURE__INITIAL_VERSION:
				setInitialVersion((Revision)null);
				return;
			case VavemodelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
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
			case VavemodelPackage.FEATURE__VARIATIONPOINT:
				return variationpoint != null && !variationpoint.isEmpty();
			case VavemodelPackage.FEATURE__INITIAL_VERSION:
				return initialVersion != null;
			case VavemodelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl