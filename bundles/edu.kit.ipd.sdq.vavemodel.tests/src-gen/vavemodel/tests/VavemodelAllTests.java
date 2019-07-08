/**
 */
package vavemodel.tests;

import compare.tests.CompareTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Vavemodel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new VavemodelAllTests("Vavemodel Tests");
		suite.addTest(CompareTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelAllTests(String name) {
		super(name);
	}

} //VavemodelAllTests
