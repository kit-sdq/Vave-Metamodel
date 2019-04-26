/**
 */
package vavemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vavemodel.Cardinality;
import vavemodel.Constraints;
import vavemodel.DeltaModule;
import vavemodel.VP_Constraint_VP;
import vavemodel.VP_Depends_VP;
import vavemodel.VP_Excludes_VP;
import vavemodel.V_Constraint_V;
import vavemodel.V_Constraint_VP;
import vavemodel.V_Depends_V;
import vavemodel.V_Depends_VP;
import vavemodel.V_Excludes_V;
import vavemodel.V_Excludes_VP;
import vavemodel.Variant;
import vavemodel.VariationPoint;
import vavemodel.VavemodelPackage;
import vavemodel.Version;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelPackage
 * @generated
 */
public class VavemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VavemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VavemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VavemodelSwitch<Adapter> modelSwitch =
		new VavemodelSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(vavemodel.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseVariant(Variant object) {
				return createVariantAdapter();
			}
			@Override
			public Adapter caseConstraints(Constraints object) {
				return createConstraintsAdapter();
			}
			@Override
			public Adapter caseVariationPoint(VariationPoint object) {
				return createVariationPointAdapter();
			}
			@Override
			public Adapter caseVP_Constraint_VP(VP_Constraint_VP object) {
				return createVP_Constraint_VPAdapter();
			}
			@Override
			public Adapter caseV_Constraint_VP(V_Constraint_VP object) {
				return createV_Constraint_VPAdapter();
			}
			@Override
			public Adapter caseV_Constraint_V(V_Constraint_V object) {
				return createV_Constraint_VAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseDeltaModule(DeltaModule object) {
				return createDeltaModuleAdapter();
			}
			@Override
			public Adapter caseVP_Depends_VP(VP_Depends_VP object) {
				return createVP_Depends_VPAdapter();
			}
			@Override
			public Adapter caseVP_Excludes_VP(VP_Excludes_VP object) {
				return createVP_Excludes_VPAdapter();
			}
			@Override
			public Adapter caseV_Depends_VP(V_Depends_VP object) {
				return createV_Depends_VPAdapter();
			}
			@Override
			public Adapter caseV_Excludes_VP(V_Excludes_VP object) {
				return createV_Excludes_VPAdapter();
			}
			@Override
			public Adapter caseV_Depends_V(V_Depends_V object) {
				return createV_Depends_VAdapter();
			}
			@Override
			public Adapter caseV_Excludes_V(V_Excludes_V object) {
				return createV_Excludes_VAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Constraints
	 * @generated
	 */
	public Adapter createConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.VariationPoint
	 * @generated
	 */
	public Adapter createVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.VP_Constraint_VP <em>VP Constraint VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.VP_Constraint_VP
	 * @generated
	 */
	public Adapter createVP_Constraint_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Constraint_VP <em>VConstraint VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Constraint_VP
	 * @generated
	 */
	public Adapter createV_Constraint_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Constraint_V <em>VConstraint V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Constraint_V
	 * @generated
	 */
	public Adapter createV_Constraint_VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.DeltaModule <em>Delta Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.DeltaModule
	 * @generated
	 */
	public Adapter createDeltaModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.VP_Depends_VP <em>VP Depends VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.VP_Depends_VP
	 * @generated
	 */
	public Adapter createVP_Depends_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.VP_Excludes_VP <em>VP Excludes VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.VP_Excludes_VP
	 * @generated
	 */
	public Adapter createVP_Excludes_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Depends_VP <em>VDepends VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Depends_VP
	 * @generated
	 */
	public Adapter createV_Depends_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Excludes_VP <em>VExcludes VP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Excludes_VP
	 * @generated
	 */
	public Adapter createV_Excludes_VPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Depends_V <em>VDepends V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Depends_V
	 * @generated
	 */
	public Adapter createV_Depends_VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.V_Excludes_V <em>VExcludes V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.V_Excludes_V
	 * @generated
	 */
	public Adapter createV_Excludes_VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vavemodel.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vavemodel.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VavemodelAdapterFactory
