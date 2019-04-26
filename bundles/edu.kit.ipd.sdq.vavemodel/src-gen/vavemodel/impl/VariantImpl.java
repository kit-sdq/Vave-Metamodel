/**
 */
package vavemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vavemodel.Variant;
import vavemodel.VariationPoint;
import vavemodel.VavemodelPackage;
import vavemodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.VariantImpl#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.impl.VariantImpl#getVariationpoint <em>Variationpoint</em>}</li>
 *   <li>{@link vavemodel.impl.VariantImpl#getInitialVersion <em>Initial Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantImpl extends MinimalEObjectImpl.Container implements Variant {
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
	 * The cached value of the '{@link #getVariationpoint() <em>Variationpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariationpoint()
	 * @generated
	 * @ordered
	 */
	protected VariationPoint variationpoint;

	/**
	 * The cached value of the '{@link #getInitialVersion() <em>Initial Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialVersion()
	 * @generated
	 * @ordered
	 */
	protected Version initialVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.VARIANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VARIANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationPoint getVariationpoint() {
		return variationpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariationpoint(VariationPoint newVariationpoint, NotificationChain msgs) {
		VariationPoint oldVariationpoint = variationpoint;
		variationpoint = newVariationpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VavemodelPackage.VARIANT__VARIATIONPOINT, oldVariationpoint, newVariationpoint);
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
	public void setVariationpoint(VariationPoint newVariationpoint) {
		if (newVariationpoint != variationpoint) {
			NotificationChain msgs = null;
			if (variationpoint != null)
				msgs = ((InternalEObject)variationpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.VARIANT__VARIATIONPOINT, null, msgs);
			if (newVariationpoint != null)
				msgs = ((InternalEObject)newVariationpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VavemodelPackage.VARIANT__VARIATIONPOINT, null, msgs);
			msgs = basicSetVariationpoint(newVariationpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VARIANT__VARIATIONPOINT, newVariationpoint, newVariationpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version getInitialVersion() {
		if (initialVersion != null && initialVersion.eIsProxy()) {
			InternalEObject oldInitialVersion = (InternalEObject)initialVersion;
			initialVersion = (Version)eResolveProxy(oldInitialVersion);
			if (initialVersion != oldInitialVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VavemodelPackage.VARIANT__INITIAL_VERSION, oldInitialVersion, initialVersion));
			}
		}
		return initialVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetInitialVersion() {
		return initialVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialVersion(Version newInitialVersion) {
		Version oldInitialVersion = initialVersion;
		initialVersion = newInitialVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VARIANT__INITIAL_VERSION, oldInitialVersion, initialVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.VARIANT__VARIATIONPOINT:
				return basicSetVariationpoint(null, msgs);
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
			case VavemodelPackage.VARIANT__NAME:
				return getName();
			case VavemodelPackage.VARIANT__VARIATIONPOINT:
				return getVariationpoint();
			case VavemodelPackage.VARIANT__INITIAL_VERSION:
				if (resolve) return getInitialVersion();
				return basicGetInitialVersion();
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
			case VavemodelPackage.VARIANT__NAME:
				setName((String)newValue);
				return;
			case VavemodelPackage.VARIANT__VARIATIONPOINT:
				setVariationpoint((VariationPoint)newValue);
				return;
			case VavemodelPackage.VARIANT__INITIAL_VERSION:
				setInitialVersion((Version)newValue);
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
			case VavemodelPackage.VARIANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VavemodelPackage.VARIANT__VARIATIONPOINT:
				setVariationpoint((VariationPoint)null);
				return;
			case VavemodelPackage.VARIANT__INITIAL_VERSION:
				setInitialVersion((Version)null);
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
			case VavemodelPackage.VARIANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VavemodelPackage.VARIANT__VARIATIONPOINT:
				return variationpoint != null;
			case VavemodelPackage.VARIANT__INITIAL_VERSION:
				return initialVersion != null;
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

} //VariantImpl
