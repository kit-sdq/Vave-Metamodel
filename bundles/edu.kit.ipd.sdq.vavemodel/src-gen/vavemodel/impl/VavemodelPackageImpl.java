/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vavemodel.Cardinality;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelPackageImpl extends EPackageImpl implements VavemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vP_Constraint_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Constraint_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Constraint_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vP_Depends_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vP_Excludes_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Depends_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Excludes_VPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Depends_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_Excludes_VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vavemodel.VavemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VavemodelPackageImpl() {
		super(eNS_URI, VavemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VavemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VavemodelPackage init() {
		if (isInited) return (VavemodelPackage)EPackage.Registry.INSTANCE.getEPackage(VavemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVavemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VavemodelPackageImpl theVavemodelPackage = registeredVavemodelPackage instanceof VavemodelPackageImpl ? (VavemodelPackageImpl)registeredVavemodelPackage : new VavemodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVavemodelPackage.createPackageContents();

		// Initialize created meta-data
		theVavemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVavemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VavemodelPackage.eNS_URI, theVavemodelPackage);
		return theVavemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Constraints() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_RootNode() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariant_Name() {
		return (EAttribute)variantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Variationpoint() {
		return (EReference)variantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_InitialVersion() {
		return (EReference)variantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraints() {
		return constraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariationPoint() {
		return variationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariationPoint_Type() {
		return (EAttribute)variationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariationPoint_Variant() {
		return (EReference)variationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariationPoint_Cardinality() {
		return (EReference)variationPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVP_Constraint_VP() {
		return vP_Constraint_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Constraint_VP() {
		return v_Constraint_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Constraint_V() {
		return v_Constraint_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersion_Predecessor() {
		return (EReference)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersion_Successor() {
		return (EReference)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersion_Deltamodule() {
		return (EReference)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_VersionID() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeltaModule() {
		return deltaModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVP_Depends_VP() {
		return vP_Depends_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVP_Excludes_VP() {
		return vP_Excludes_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Depends_VP() {
		return v_Depends_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Excludes_VP() {
		return v_Excludes_VPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Depends_V() {
		return v_Depends_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getV_Excludes_V() {
		return v_Excludes_VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Min() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Max() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGroupType() {
		return groupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VavemodelFactory getVavemodelFactory() {
		return (VavemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONSTRAINTS);
		createEReference(systemEClass, SYSTEM__ROOT_NODE);

		variantEClass = createEClass(VARIANT);
		createEAttribute(variantEClass, VARIANT__NAME);
		createEReference(variantEClass, VARIANT__VARIATIONPOINT);
		createEReference(variantEClass, VARIANT__INITIAL_VERSION);

		constraintsEClass = createEClass(CONSTRAINTS);

		variationPointEClass = createEClass(VARIATION_POINT);
		createEAttribute(variationPointEClass, VARIATION_POINT__TYPE);
		createEReference(variationPointEClass, VARIATION_POINT__VARIANT);
		createEReference(variationPointEClass, VARIATION_POINT__CARDINALITY);

		vP_Constraint_VPEClass = createEClass(VP_CONSTRAINT_VP);

		v_Constraint_VPEClass = createEClass(VCONSTRAINT_VP);

		v_Constraint_VEClass = createEClass(VCONSTRAINT_V);

		versionEClass = createEClass(VERSION);
		createEReference(versionEClass, VERSION__PREDECESSOR);
		createEReference(versionEClass, VERSION__SUCCESSOR);
		createEReference(versionEClass, VERSION__DELTAMODULE);
		createEAttribute(versionEClass, VERSION__VERSION_ID);

		deltaModuleEClass = createEClass(DELTA_MODULE);

		vP_Depends_VPEClass = createEClass(VP_DEPENDS_VP);

		vP_Excludes_VPEClass = createEClass(VP_EXCLUDES_VP);

		v_Depends_VPEClass = createEClass(VDEPENDS_VP);

		v_Excludes_VPEClass = createEClass(VEXCLUDES_VP);

		v_Depends_VEClass = createEClass(VDEPENDS_V);

		v_Excludes_VEClass = createEClass(VEXCLUDES_V);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__MIN);
		createEAttribute(cardinalityEClass, CARDINALITY__MAX);

		// Create enums
		groupTypeEEnum = createEEnum(GROUP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vP_Constraint_VPEClass.getESuperTypes().add(this.getConstraints());
		v_Constraint_VPEClass.getESuperTypes().add(this.getConstraints());
		v_Constraint_VEClass.getESuperTypes().add(this.getConstraints());
		vP_Depends_VPEClass.getESuperTypes().add(this.getVP_Constraint_VP());
		vP_Excludes_VPEClass.getESuperTypes().add(this.getVP_Constraint_VP());
		v_Depends_VPEClass.getESuperTypes().add(this.getV_Constraint_VP());
		v_Excludes_VPEClass.getESuperTypes().add(this.getV_Constraint_VP());
		v_Depends_VEClass.getESuperTypes().add(this.getV_Constraint_V());
		v_Excludes_VEClass.getESuperTypes().add(this.getV_Constraint_V());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, vavemodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Constraints(), this.getConstraints(), null, "constraints", null, 0, -1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RootNode(), this.getVariant(), null, "rootNode", null, 1, 1, vavemodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_Variationpoint(), this.getVariationPoint(), null, "variationpoint", null, 1, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_InitialVersion(), this.getVersion(), null, "initialVersion", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsEClass, Constraints.class, "Constraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variationPointEClass, VariationPoint.class, "VariationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariationPoint_Type(), this.getGroupType(), "type", null, 0, 1, VariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariationPoint_Variant(), this.getVariant(), null, "variant", null, 1, -1, VariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariationPoint_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, -1, VariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vP_Constraint_VPEClass, VP_Constraint_VP.class, "VP_Constraint_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Constraint_VPEClass, V_Constraint_VP.class, "V_Constraint_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Constraint_VEClass, V_Constraint_V.class, "V_Constraint_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersion_Predecessor(), this.getVersion(), null, "predecessor", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Successor(), this.getVersion(), null, "successor", null, 0, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Deltamodule(), this.getDeltaModule(), null, "deltamodule", null, 1, -1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_VersionID(), ecorePackage.getEDouble(), "versionID", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deltaModuleEClass, DeltaModule.class, "DeltaModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vP_Depends_VPEClass, VP_Depends_VP.class, "VP_Depends_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vP_Excludes_VPEClass, VP_Excludes_VP.class, "VP_Excludes_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Depends_VPEClass, V_Depends_VP.class, "V_Depends_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Excludes_VPEClass, V_Excludes_VP.class, "V_Excludes_VP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Depends_VEClass, V_Depends_V.class, "V_Depends_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(v_Excludes_VEClass, V_Excludes_V.class, "V_Excludes_V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_Min(), ecorePackage.getEInt(), "min", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(groupTypeEEnum, GroupType.class, "GroupType");
		addEEnumLiteral(groupTypeEEnum, GroupType.XOR);
		addEEnumLiteral(groupTypeEEnum, GroupType.OR);
		addEEnumLiteral(groupTypeEEnum, GroupType.XORNONE);
		addEEnumLiteral(groupTypeEEnum, GroupType.ORNONE);

		// Create resource
		createResource(eNS_URI);
	}

} //VavemodelPackageImpl
