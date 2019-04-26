/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.VP_Depends_VP;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VP Depends VP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VP_Depends_VPTest extends VP_Constraint_VPTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VP_Depends_VPTest.class);
	}

	/**
	 * Constructs a new VP Depends VP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VP_Depends_VPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VP Depends VP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VP_Depends_VP getFixture() {
		return (VP_Depends_VP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createVP_Depends_VP());
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

} //VP_Depends_VPTest
