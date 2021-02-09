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

import vavemodel.Revision;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.impl.RevisionImpl#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link vavemodel.impl.RevisionImpl#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends OptionImpl implements Revision {
	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> successor;

	/**
	 * The default value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected String revisionID = REVISION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Revision> getSuccessor() {
		if (successor == null) {
			successor = new EObjectContainmentEList<Revision>(Revision.class, this, VavemodelPackage.REVISION__SUCCESSOR);
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionID() {
		return revisionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionID(String newRevisionID) {
		String oldRevisionID = revisionID;
		revisionID = newRevisionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VavemodelPackage.REVISION__REVISION_ID, oldRevisionID, revisionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VavemodelPackage.REVISION__SUCCESSOR:
				return ((InternalEList<?>)getSuccessor()).basicRemove(otherEnd, msgs);
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
			case VavemodelPackage.REVISION__SUCCESSOR:
				return getSuccessor();
			case VavemodelPackage.REVISION__REVISION_ID:
				return getRevisionID();
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
			case VavemodelPackage.REVISION__SUCCESSOR:
				getSuccessor().clear();
				getSuccessor().addAll((Collection<? extends Revision>)newValue);
				return;
			case VavemodelPackage.REVISION__REVISION_ID:
				setRevisionID((String)newValue);
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
			case VavemodelPackage.REVISION__SUCCESSOR:
				getSuccessor().clear();
				return;
			case VavemodelPackage.REVISION__REVISION_ID:
				setRevisionID(REVISION_ID_EDEFAULT);
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
			case VavemodelPackage.REVISION__SUCCESSOR:
				return successor != null && !successor.isEmpty();
			case VavemodelPackage.REVISION__REVISION_ID:
				return REVISION_ID_EDEFAULT == null ? revisionID != null : !REVISION_ID_EDEFAULT.equals(revisionID);
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
		result.append(" (revisionID: ");
		result.append(revisionID);
		result.append(')');
		return result.toString();
	}

} //RevisionImpl
