/**
 */
package vavemodel.tests;

import junit.textui.TestRunner;

import vavemodel.Implication;
import vavemodel.VavemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicationTest extends BinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplicationTest.class);
	}

	/**
	 * Constructs a new Implication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Implication getFixture() {
		return (Implication)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VavemodelFactory.eINSTANCE.createImplication());
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

} //ImplicationTest
