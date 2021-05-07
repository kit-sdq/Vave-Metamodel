/**
 */
package vavemodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link vavemodel.impl.DeltaModuleImpl#getDeltamodule <em>Deltamodule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaModuleImpl extends MinimalEObjectImpl.Container implements DeltaModule {
	/**
	 * The cached value of the '{@link #getDeltamodule() <em>Deltamodule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltamodule()
	 * @generated
	 * @ordered
	 */
	protected EList<DeltaModule> deltamodule;

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
	public EList<DeltaModule> getDeltamodule() {
		if (deltamodule == null) {
			deltamodule = new EObjectResolvingEList<DeltaModule>(DeltaModule.class, this, VavemodelPackage.DELTA_MODULE__DELTAMODULE);
		}
		return deltamodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VavemodelPackage.DELTA_MODULE__DELTAMODULE:
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
			case VavemodelPackage.DELTA_MODULE__DELTAMODULE:
				getDeltamodule().clear();
				getDeltamodule().addAll((Collection<? extends DeltaModule>)newValue);
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
			case VavemodelPackage.DELTA_MODULE__DELTAMODULE:
				getDeltamodule().clear();
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
			case VavemodelPackage.DELTA_MODULE__DELTAMODULE:
				return deltamodule != null && !deltamodule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeltaModuleImpl
