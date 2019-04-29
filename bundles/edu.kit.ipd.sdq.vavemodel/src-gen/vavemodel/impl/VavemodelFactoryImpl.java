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
import vavemodel.Constraints;
import vavemodel.DeltaModule;
import vavemodel.GroupType;
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
			case VavemodelPackage.CONSTRAINTS: return createConstraints();
			case VavemodelPackage.VARIATION_POINT: return createVariationPoint();
			case VavemodelPackage.VP_CONSTRAINT_VP: return createVP_Constraint_VP();
			case VavemodelPackage.VCONSTRAINT_VP: return createV_Constraint_VP();
			case VavemodelPackage.VCONSTRAINT_V: return createV_Constraint_V();
			case VavemodelPackage.VERSION: return createVersion();
			case VavemodelPackage.DELTA_MODULE: return createDeltaModule();
			case VavemodelPackage.VP_DEPENDS_VP: return createVP_Depends_VP();
			case VavemodelPackage.VP_EXCLUDES_VP: return createVP_Excludes_VP();
			case VavemodelPackage.VDEPENDS_VP: return createV_Depends_VP();
			case VavemodelPackage.VEXCLUDES_VP: return createV_Excludes_VP();
			case VavemodelPackage.VDEPENDS_V: return createV_Depends_V();
			case VavemodelPackage.VEXCLUDES_V: return createV_Excludes_V();
			case VavemodelPackage.CARDINALITY: return createCardinality();
			case VavemodelPackage.CHANGE: return createChange();
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
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
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
	public VP_Constraint_VP createVP_Constraint_VP() {
		VP_Constraint_VPImpl vP_Constraint_VP = new VP_Constraint_VPImpl();
		return vP_Constraint_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Constraint_VP createV_Constraint_VP() {
		V_Constraint_VPImpl v_Constraint_VP = new V_Constraint_VPImpl();
		return v_Constraint_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Constraint_V createV_Constraint_V() {
		V_Constraint_VImpl v_Constraint_V = new V_Constraint_VImpl();
		return v_Constraint_V;
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
	public VP_Depends_VP createVP_Depends_VP() {
		VP_Depends_VPImpl vP_Depends_VP = new VP_Depends_VPImpl();
		return vP_Depends_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VP_Excludes_VP createVP_Excludes_VP() {
		VP_Excludes_VPImpl vP_Excludes_VP = new VP_Excludes_VPImpl();
		return vP_Excludes_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Depends_VP createV_Depends_VP() {
		V_Depends_VPImpl v_Depends_VP = new V_Depends_VPImpl();
		return v_Depends_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Excludes_VP createV_Excludes_VP() {
		V_Excludes_VPImpl v_Excludes_VP = new V_Excludes_VPImpl();
		return v_Excludes_VP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Depends_V createV_Depends_V() {
		V_Depends_VImpl v_Depends_V = new V_Depends_VImpl();
		return v_Depends_V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Excludes_V createV_Excludes_V() {
		V_Excludes_VImpl v_Excludes_V = new V_Excludes_VImpl();
		return v_Excludes_V;
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
