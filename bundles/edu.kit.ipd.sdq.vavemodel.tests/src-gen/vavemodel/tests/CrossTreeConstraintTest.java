/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.CrossTreeConstraint;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cross Tree Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrossTreeConstraintTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrossTreeConstraintTest.class);
	}

	/**
	 * Constructs a new Cross Tree Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossTreeConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cross Tree Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CrossTreeConstraint getFixture() {
		return (CrossTreeConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createCrossTreeConstraint());
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

} //CrossTreeConstraintTest
