/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vavemodel.Cardinality;
import vavemodel.Change;
import vavemodel.Conjunction;
import vavemodel.Constraint;
import vavemodel.DeltaModule;
import vavemodel.Disjunction;
import vavemodel.Equivalence;
import vavemodel.GroupType;
import vavemodel.Implication;
import vavemodel.Not;
import vavemodel.Variable;
import vavemodel.Variant;
import vavemodel.VariationPoint;
import vavemodel.VavemodelFactory;
import vavemodel.VavemodelPackage;
import vavemodel.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelFactoryImpl extends EFactoryImpl implements VavemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VavemodelFactory init() {
		try {
			VavemodelFactory theVavemodelFactory = (VavemodelFactory)EPackage.Registry.INSTANCE.getEFactory(VavemodelPackage.eNS_URI);
			if (theVavemodelFactory != null) {
				return theVavemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VavemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VavemodelPackage.SYSTEM: return createSystem();
			case VavemodelPackage.VARIANT: return createVariant();
			case VavemodelPackage.CONSTRAINT: return createConstraint();
			case VavemodelPackage.VARIATION_POINT: return createVariationPoint();
			case VavemodelPackage.VERSION: return createVersion();
			case VavemodelPackage.CARDINALITY: return createCardinality();
			case VavemodelPackage.DELTA_MODULE: return createDeltaModule();
			case VavemodelPackage.CHANGE: return createChange();
			case VavemodelPackage.VARIABLE: return createVariable();
			case VavemodelPackage.IMPLICATION: return createImplication();
			case VavemodelPackage.DISJUNCTION: return createDisjunction();
			case VavemodelPackage.EQUIVALENCE: return createEquivalence();
			case VavemodelPackage.CONJUNCTION: return createConjunction();
			case VavemodelPackage.NOT: return createNot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VavemodelPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VavemodelPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public vavemodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationPoint createVariationPoint() {
		VariationPointImpl variationPoint = new VariationPointImpl();
		return variationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeltaModule createDeltaModule() {
		DeltaModuleImpl deltaModule = new DeltaModuleImpl();
		return deltaModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Change createChange() {
		ChangeImpl change = new ChangeImpl();
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equivalence createEquivalence() {
		EquivalenceImpl equivalence = new EquivalenceImpl();
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VavemodelPackage getVavemodelPackage() {
		return (VavemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VavemodelPackage getPackage() {
		return VavemodelPackage.eINSTANCE;
	}

} //VavemodelFactoryImpl
