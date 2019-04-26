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

import vavemodel.Cardinality;
import vavemodel.GroupType;
import vavemodel.Variant;
import vavemodel.VariationPoint;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.VariationPointImpl#getType <em>Type</em>}</li>
 *   <li>{@link vavemodel.impl.VariationPointImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link vavemodel.impl.VariationPointImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariationPointImpl extends MinimalEObjectImpl.Container implements VariationPoint {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GroupType TYPE_EDEFAULT = GroupType.XOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GroupType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variant;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected EList<Cardinality> cardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(GroupType newType) {
		GroupType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.VARIATION_POINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variant> getVariant() {
		if (variant == null) {
			variant = new EObjectContainmentEList<Variant>(Variant.class, this, VavemodelPackage.VARIATION_POINT__VARIANT);
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cardinality> getCardinality() {
		if (cardinality == null) {
			cardinality = new EObjectContainmentEList<Cardinality>(Cardinality.class, this, VavemodelPackage.VARIATION_POINT__CARDINALITY);
		}
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.VARIATION_POINT__VARIANT:
				return ((InternalEList<?>)getVariant()).basicRemove(otherEnd, msgs);
			case VavemodelPackage.VARIATION_POINT__CARDINALITY:
				return ((InternalEList<?>)getCardinality()).basicRemove(otherEnd, msgs);
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
			case VavemodelPackage.VARIATION_POINT__TYPE:
				return getType();
			case VavemodelPackage.VARIATION_POINT__VARIANT:
				return getVariant();
			case VavemodelPackage.VARIATION_POINT__CARDINALITY:
				return getCardinality();
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
			case VavemodelPackage.VARIATION_POINT__TYPE:
				setType((GroupType)newValue);
				return;
			case VavemodelPackage.VARIATION_POINT__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Variant>)newValue);
				return;
			case VavemodelPackage.VARIATION_POINT__CARDINALITY:
				getCardinality().clear();
				getCardinality().addAll((Collection<? extends Cardinality>)newValue);
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
			case VavemodelPackage.VARIATION_POINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VavemodelPackage.VARIATION_POINT__VARIANT:
				getVariant().clear();
				return;
			case VavemodelPackage.VARIATION_POINT__CARDINALITY:
				getCardinality().clear();
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
			case VavemodelPackage.VARIATION_POINT__TYPE:
				return type != TYPE_EDEFAULT;
			case VavemodelPackage.VARIATION_POINT__VARIANT:
				return variant != null && !variant.isEmpty();
			case VavemodelPackage.VARIATION_POINT__CARDINALITY:
				return cardinality != null && !cardinality.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VariationPointImpl
