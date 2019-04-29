/**
 */
package vavemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelFactory
 * @model kind="package"
 * @generated
 */
public interface VavemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vavemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.vavemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vavemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VavemodelPackage eINSTANCE = vavemodel.impl.VavemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link vavemodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.SystemImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VariantImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variationpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__VARIATIONPOINT = 1;

	/**
	 * The feature id for the '<em><b>Initial Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__INITIAL_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Is Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__IS_CORE = 3;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__IS_ROOT = 4;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.ConstraintsImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VariationPointImpl <em>Variation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VariationPointImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVariationPoint()
	 * @generated
	 */
	int VARIATION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT__CARDINALITY = 2;

	/**
	 * The number of structural features of the '<em>Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIATION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VP_Constraint_VPImpl <em>VP Constraint VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VP_Constraint_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Constraint_VP()
	 * @generated
	 */
	int VP_CONSTRAINT_VP = 4;

	/**
	 * The number of structural features of the '<em>VP Constraint VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_CONSTRAINT_VP_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VP Constraint VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_CONSTRAINT_VP_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Constraint_VPImpl <em>VConstraint VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Constraint_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Constraint_VP()
	 * @generated
	 */
	int VCONSTRAINT_VP = 5;

	/**
	 * The number of structural features of the '<em>VConstraint VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONSTRAINT_VP_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VConstraint VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONSTRAINT_VP_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Constraint_VImpl <em>VConstraint V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Constraint_VImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Constraint_V()
	 * @generated
	 */
	int VCONSTRAINT_V = 6;

	/**
	 * The number of structural features of the '<em>VConstraint V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONSTRAINT_V_FEATURE_COUNT = CONSTRAINTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VConstraint V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONSTRAINT_V_OPERATION_COUNT = CONSTRAINTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VersionImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 7;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__PREDECESSOR = 0;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SUCCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Deltamodule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DELTAMODULE = 2;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VERSION_ID = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.DeltaModuleImpl <em>Delta Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.DeltaModuleImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getDeltaModule()
	 * @generated
	 */
	int DELTA_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Delta Module ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_MODULE__DELTA_MODULE_ID = 0;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_MODULE__CHANGE = 1;

	/**
	 * The number of structural features of the '<em>Delta Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delta Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VP_Depends_VPImpl <em>VP Depends VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VP_Depends_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Depends_VP()
	 * @generated
	 */
	int VP_DEPENDS_VP = 9;

	/**
	 * The number of structural features of the '<em>VP Depends VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_DEPENDS_VP_FEATURE_COUNT = VP_CONSTRAINT_VP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VP Depends VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_DEPENDS_VP_OPERATION_COUNT = VP_CONSTRAINT_VP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.VP_Excludes_VPImpl <em>VP Excludes VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.VP_Excludes_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Excludes_VP()
	 * @generated
	 */
	int VP_EXCLUDES_VP = 10;

	/**
	 * The number of structural features of the '<em>VP Excludes VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_EXCLUDES_VP_FEATURE_COUNT = VP_CONSTRAINT_VP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VP Excludes VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VP_EXCLUDES_VP_OPERATION_COUNT = VP_CONSTRAINT_VP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Depends_VPImpl <em>VDepends VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Depends_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Depends_VP()
	 * @generated
	 */
	int VDEPENDS_VP = 11;

	/**
	 * The number of structural features of the '<em>VDepends VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDS_VP_FEATURE_COUNT = VCONSTRAINT_VP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VDepends VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDS_VP_OPERATION_COUNT = VCONSTRAINT_VP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Excludes_VPImpl <em>VExcludes VP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Excludes_VPImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Excludes_VP()
	 * @generated
	 */
	int VEXCLUDES_VP = 12;

	/**
	 * The number of structural features of the '<em>VExcludes VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEXCLUDES_VP_FEATURE_COUNT = VCONSTRAINT_VP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VExcludes VP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEXCLUDES_VP_OPERATION_COUNT = VCONSTRAINT_VP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Depends_VImpl <em>VDepends V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Depends_VImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Depends_V()
	 * @generated
	 */
	int VDEPENDS_V = 13;

	/**
	 * The number of structural features of the '<em>VDepends V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDS_V_FEATURE_COUNT = VCONSTRAINT_V_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VDepends V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDEPENDS_V_OPERATION_COUNT = VCONSTRAINT_V_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.V_Excludes_VImpl <em>VExcludes V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.V_Excludes_VImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getV_Excludes_V()
	 * @generated
	 */
	int VEXCLUDES_V = 14;

	/**
	 * The number of structural features of the '<em>VExcludes V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEXCLUDES_V_FEATURE_COUNT = VCONSTRAINT_V_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VExcludes V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEXCLUDES_V_OPERATION_COUNT = VCONSTRAINT_V_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.CardinalityImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 15;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MAX = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.impl.ChangeImpl
	 * @see vavemodel.impl.VavemodelPackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 16;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link vavemodel.GroupType <em>Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vavemodel.GroupType
	 * @see vavemodel.impl.VavemodelPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link vavemodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see vavemodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link vavemodel.System#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see vavemodel.System#getConstraints()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link vavemodel.System#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant</em>'.
	 * @see vavemodel.System#getVariant()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Variant();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vavemodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link vavemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see vavemodel.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Variant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vavemodel.Variant#getName()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link vavemodel.Variant#getVariationpoint <em>Variationpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variationpoint</em>'.
	 * @see vavemodel.Variant#getVariationpoint()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_Variationpoint();

	/**
	 * Returns the meta object for the containment reference '{@link vavemodel.Variant#getInitialVersion <em>Initial Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Version</em>'.
	 * @see vavemodel.Variant#getInitialVersion()
	 * @see #getVariant()
	 * @generated
	 */
	EReference getVariant_InitialVersion();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Variant#isIsCore <em>Is Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Core</em>'.
	 * @see vavemodel.Variant#isIsCore()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_IsCore();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Variant#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see vavemodel.Variant#isIsRoot()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_IsRoot();

	/**
	 * Returns the meta object for class '{@link vavemodel.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see vavemodel.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for class '{@link vavemodel.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variation Point</em>'.
	 * @see vavemodel.VariationPoint
	 * @generated
	 */
	EClass getVariationPoint();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.VariationPoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see vavemodel.VariationPoint#getType()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EAttribute getVariationPoint_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link vavemodel.VariationPoint#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant</em>'.
	 * @see vavemodel.VariationPoint#getVariant()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_Variant();

	/**
	 * Returns the meta object for the containment reference '{@link vavemodel.VariationPoint#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see vavemodel.VariationPoint#getCardinality()
	 * @see #getVariationPoint()
	 * @generated
	 */
	EReference getVariationPoint_Cardinality();

	/**
	 * Returns the meta object for class '{@link vavemodel.VP_Constraint_VP <em>VP Constraint VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VP Constraint VP</em>'.
	 * @see vavemodel.VP_Constraint_VP
	 * @generated
	 */
	EClass getVP_Constraint_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Constraint_VP <em>VConstraint VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VConstraint VP</em>'.
	 * @see vavemodel.V_Constraint_VP
	 * @generated
	 */
	EClass getV_Constraint_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Constraint_V <em>VConstraint V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VConstraint V</em>'.
	 * @see vavemodel.V_Constraint_V
	 * @generated
	 */
	EClass getV_Constraint_V();

	/**
	 * Returns the meta object for class '{@link vavemodel.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see vavemodel.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the reference '{@link vavemodel.Version#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see vavemodel.Version#getPredecessor()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Predecessor();

	/**
	 * Returns the meta object for the reference list '{@link vavemodel.Version#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor</em>'.
	 * @see vavemodel.Version#getSuccessor()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Successor();

	/**
	 * Returns the meta object for the containment reference '{@link vavemodel.Version#getDeltamodule <em>Deltamodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deltamodule</em>'.
	 * @see vavemodel.Version#getDeltamodule()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Deltamodule();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Version#getVersionID <em>Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version ID</em>'.
	 * @see vavemodel.Version#getVersionID()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_VersionID();

	/**
	 * Returns the meta object for class '{@link vavemodel.DeltaModule <em>Delta Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta Module</em>'.
	 * @see vavemodel.DeltaModule
	 * @generated
	 */
	EClass getDeltaModule();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.DeltaModule#getDeltaModuleID <em>Delta Module ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta Module ID</em>'.
	 * @see vavemodel.DeltaModule#getDeltaModuleID()
	 * @see #getDeltaModule()
	 * @generated
	 */
	EAttribute getDeltaModule_DeltaModuleID();

	/**
	 * Returns the meta object for the containment reference list '{@link vavemodel.DeltaModule#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see vavemodel.DeltaModule#getChange()
	 * @see #getDeltaModule()
	 * @generated
	 */
	EReference getDeltaModule_Change();

	/**
	 * Returns the meta object for class '{@link vavemodel.VP_Depends_VP <em>VP Depends VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VP Depends VP</em>'.
	 * @see vavemodel.VP_Depends_VP
	 * @generated
	 */
	EClass getVP_Depends_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.VP_Excludes_VP <em>VP Excludes VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VP Excludes VP</em>'.
	 * @see vavemodel.VP_Excludes_VP
	 * @generated
	 */
	EClass getVP_Excludes_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Depends_VP <em>VDepends VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDepends VP</em>'.
	 * @see vavemodel.V_Depends_VP
	 * @generated
	 */
	EClass getV_Depends_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Excludes_VP <em>VExcludes VP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VExcludes VP</em>'.
	 * @see vavemodel.V_Excludes_VP
	 * @generated
	 */
	EClass getV_Excludes_VP();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Depends_V <em>VDepends V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDepends V</em>'.
	 * @see vavemodel.V_Depends_V
	 * @generated
	 */
	EClass getV_Depends_V();

	/**
	 * Returns the meta object for class '{@link vavemodel.V_Excludes_V <em>VExcludes V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VExcludes V</em>'.
	 * @see vavemodel.V_Excludes_V
	 * @generated
	 */
	EClass getV_Excludes_V();

	/**
	 * Returns the meta object for class '{@link vavemodel.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see vavemodel.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Cardinality#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see vavemodel.Cardinality#getMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Min();

	/**
	 * Returns the meta object for the attribute '{@link vavemodel.Cardinality#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see vavemodel.Cardinality#getMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Max();

	/**
	 * Returns the meta object for class '{@link vavemodel.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see vavemodel.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for enum '{@link vavemodel.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Type</em>'.
	 * @see vavemodel.GroupType
	 * @generated
	 */
	EEnum getGroupType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VavemodelFactory getVavemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vavemodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.SystemImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONSTRAINTS = eINSTANCE.getSystem_Constraints();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__VARIANT = eINSTANCE.getSystem_Variant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VariantImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__NAME = eINSTANCE.getVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Variationpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__VARIATIONPOINT = eINSTANCE.getVariant_Variationpoint();

		/**
		 * The meta object literal for the '<em><b>Initial Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT__INITIAL_VERSION = eINSTANCE.getVariant_InitialVersion();

		/**
		 * The meta object literal for the '<em><b>Is Core</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__IS_CORE = eINSTANCE.getVariant_IsCore();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__IS_ROOT = eINSTANCE.getVariant_IsRoot();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.ConstraintsImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VariationPointImpl <em>Variation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VariationPointImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVariationPoint()
		 * @generated
		 */
		EClass VARIATION_POINT = eINSTANCE.getVariationPoint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIATION_POINT__TYPE = eINSTANCE.getVariationPoint_Type();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__VARIANT = eINSTANCE.getVariationPoint_Variant();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIATION_POINT__CARDINALITY = eINSTANCE.getVariationPoint_Cardinality();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VP_Constraint_VPImpl <em>VP Constraint VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VP_Constraint_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Constraint_VP()
		 * @generated
		 */
		EClass VP_CONSTRAINT_VP = eINSTANCE.getVP_Constraint_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Constraint_VPImpl <em>VConstraint VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Constraint_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Constraint_VP()
		 * @generated
		 */
		EClass VCONSTRAINT_VP = eINSTANCE.getV_Constraint_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Constraint_VImpl <em>VConstraint V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Constraint_VImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Constraint_V()
		 * @generated
		 */
		EClass VCONSTRAINT_V = eINSTANCE.getV_Constraint_V();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VersionImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__PREDECESSOR = eINSTANCE.getVersion_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__SUCCESSOR = eINSTANCE.getVersion_Successor();

		/**
		 * The meta object literal for the '<em><b>Deltamodule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__DELTAMODULE = eINSTANCE.getVersion_Deltamodule();

		/**
		 * The meta object literal for the '<em><b>Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VERSION_ID = eINSTANCE.getVersion_VersionID();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.DeltaModuleImpl <em>Delta Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.DeltaModuleImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getDeltaModule()
		 * @generated
		 */
		EClass DELTA_MODULE = eINSTANCE.getDeltaModule();

		/**
		 * The meta object literal for the '<em><b>Delta Module ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELTA_MODULE__DELTA_MODULE_ID = eINSTANCE.getDeltaModule_DeltaModuleID();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_MODULE__CHANGE = eINSTANCE.getDeltaModule_Change();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VP_Depends_VPImpl <em>VP Depends VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VP_Depends_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Depends_VP()
		 * @generated
		 */
		EClass VP_DEPENDS_VP = eINSTANCE.getVP_Depends_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.VP_Excludes_VPImpl <em>VP Excludes VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.VP_Excludes_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getVP_Excludes_VP()
		 * @generated
		 */
		EClass VP_EXCLUDES_VP = eINSTANCE.getVP_Excludes_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Depends_VPImpl <em>VDepends VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Depends_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Depends_VP()
		 * @generated
		 */
		EClass VDEPENDS_VP = eINSTANCE.getV_Depends_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Excludes_VPImpl <em>VExcludes VP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Excludes_VPImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Excludes_VP()
		 * @generated
		 */
		EClass VEXCLUDES_VP = eINSTANCE.getV_Excludes_VP();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Depends_VImpl <em>VDepends V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Depends_VImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Depends_V()
		 * @generated
		 */
		EClass VDEPENDS_V = eINSTANCE.getV_Depends_V();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.V_Excludes_VImpl <em>VExcludes V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.V_Excludes_VImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getV_Excludes_V()
		 * @generated
		 */
		EClass VEXCLUDES_V = eINSTANCE.getV_Excludes_V();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.CardinalityImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MIN = eINSTANCE.getCardinality_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MAX = eINSTANCE.getCardinality_Max();

		/**
		 * The meta object literal for the '{@link vavemodel.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.impl.ChangeImpl
		 * @see vavemodel.impl.VavemodelPackageImpl#getChange()
		 * @generated
		 */
		EClass CHANGE = eINSTANCE.getChange();

		/**
		 * The meta object literal for the '{@link vavemodel.GroupType <em>Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vavemodel.GroupType
		 * @see vavemodel.impl.VavemodelPackageImpl#getGroupType()
		 * @generated
		 */
		EEnum GROUP_TYPE = eINSTANCE.getGroupType();

	}

} //VavemodelPackage
