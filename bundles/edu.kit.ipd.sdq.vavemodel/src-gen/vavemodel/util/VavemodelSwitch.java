/**
 */
package vavemodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelPackage
 * @generated
 */
public class VavemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VavemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = VavemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VavemodelPackage.SYSTEM: {
				vavemodel.System system = (vavemodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				T result = caseVariant(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CONSTRAINTS: {
				Constraints constraints = (Constraints)theEObject;
				T result = caseConstraints(constraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VARIATION_POINT: {
				VariationPoint variationPoint = (VariationPoint)theEObject;
				T result = caseVariationPoint(variationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VP_CONSTRAINT_VP: {
				VP_Constraint_VP vP_Constraint_VP = (VP_Constraint_VP)theEObject;
				T result = caseVP_Constraint_VP(vP_Constraint_VP);
				if (result == null) result = caseConstraints(vP_Constraint_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VCONSTRAINT_VP: {
				V_Constraint_VP v_Constraint_VP = (V_Constraint_VP)theEObject;
				T result = caseV_Constraint_VP(v_Constraint_VP);
				if (result == null) result = caseConstraints(v_Constraint_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VCONSTRAINT_V: {
				V_Constraint_V v_Constraint_V = (V_Constraint_V)theEObject;
				T result = caseV_Constraint_V(v_Constraint_V);
				if (result == null) result = caseConstraints(v_Constraint_V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.DELTA_MODULE: {
				DeltaModule deltaModule = (DeltaModule)theEObject;
				T result = caseDeltaModule(deltaModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VP_DEPENDS_VP: {
				VP_Depends_VP vP_Depends_VP = (VP_Depends_VP)theEObject;
				T result = caseVP_Depends_VP(vP_Depends_VP);
				if (result == null) result = caseVP_Constraint_VP(vP_Depends_VP);
				if (result == null) result = caseConstraints(vP_Depends_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VP_EXCLUDES_VP: {
				VP_Excludes_VP vP_Excludes_VP = (VP_Excludes_VP)theEObject;
				T result = caseVP_Excludes_VP(vP_Excludes_VP);
				if (result == null) result = caseVP_Constraint_VP(vP_Excludes_VP);
				if (result == null) result = caseConstraints(vP_Excludes_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VDEPENDS_VP: {
				V_Depends_VP v_Depends_VP = (V_Depends_VP)theEObject;
				T result = caseV_Depends_VP(v_Depends_VP);
				if (result == null) result = caseV_Constraint_VP(v_Depends_VP);
				if (result == null) result = caseConstraints(v_Depends_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VEXCLUDES_VP: {
				V_Excludes_VP v_Excludes_VP = (V_Excludes_VP)theEObject;
				T result = caseV_Excludes_VP(v_Excludes_VP);
				if (result == null) result = caseV_Constraint_VP(v_Excludes_VP);
				if (result == null) result = caseConstraints(v_Excludes_VP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VDEPENDS_V: {
				V_Depends_V v_Depends_V = (V_Depends_V)theEObject;
				T result = caseV_Depends_V(v_Depends_V);
				if (result == null) result = caseV_Constraint_V(v_Depends_V);
				if (result == null) result = caseConstraints(v_Depends_V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.VEXCLUDES_V: {
				V_Excludes_V v_Excludes_V = (V_Excludes_V)theEObject;
				T result = caseV_Excludes_V(v_Excludes_V);
				if (result == null) result = caseV_Constraint_V(v_Excludes_V);
				if (result == null) result = caseConstraints(v_Excludes_V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VavemodelPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T result = caseCardinality(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(vavemodel.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraints(Constraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariationPoint(VariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VP Constraint VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VP Constraint VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVP_Constraint_VP(VP_Constraint_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VConstraint VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VConstraint VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Constraint_VP(V_Constraint_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VConstraint V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VConstraint V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Constraint_V(V_Constraint_V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaModule(DeltaModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VP Depends VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VP Depends VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVP_Depends_VP(VP_Depends_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VP Excludes VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VP Excludes VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVP_Excludes_VP(VP_Excludes_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDepends VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDepends VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Depends_VP(V_Depends_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VExcludes VP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VExcludes VP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Excludes_VP(V_Excludes_VP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDepends V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDepends V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Depends_V(V_Depends_V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VExcludes V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VExcludes V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_Excludes_V(V_Excludes_V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VavemodelSwitch
