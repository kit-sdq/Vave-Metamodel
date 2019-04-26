/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.VP_Excludes_VP;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VP Excludes VP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VP_Excludes_VPTest extends VP_Constraint_VPTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VP_Excludes_VPTest.class);
	}

	/**
	 * Constructs a new VP Excludes VP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VP_Excludes_VPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VP Excludes VP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VP_Excludes_VP getFixture() {
		return (VP_Excludes_VP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createVP_Excludes_VP());
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

} //VP_Excludes_VPTest
