/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.V_Excludes_VP;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VExcludes VP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class V_Excludes_VPTest extends V_Constraint_VPTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(V_Excludes_VPTest.class);
	}

	/**
	 * Constructs a new VExcludes VP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_Excludes_VPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VExcludes VP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected V_Excludes_VP getFixture() {
		return (V_Excludes_VP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createV_Excludes_VP());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //V_Excludes_VPTest
