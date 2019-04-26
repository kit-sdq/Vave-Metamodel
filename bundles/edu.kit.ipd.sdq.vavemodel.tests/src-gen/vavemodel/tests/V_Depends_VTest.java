/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.V_Depends_V;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VDepends V</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class V_Depends_VTest extends V_Constraint_VTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(V_Depends_VTest.class);
	}

	/**
	 * Constructs a new VDepends V test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_Depends_VTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this VDepends V test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected V_Depends_V getFixture() {
		return (V_Depends_V)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createV_Depends_V());
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

} //V_Depends_VTest
