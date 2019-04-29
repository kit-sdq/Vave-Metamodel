/**
 */
package vavemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vavemodel.VavemodelPackage
 * @generated
 */
public interface VavemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VavemodelFactory eINSTANCE = vavemodel.impl.VavemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	Variant createVariant();

	/**
	 * Returns a new object of class '<em>Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraints</em>'.
	 * @generated
	 */
	Constraints createConstraints();

	/**
	 * Returns a new object of class '<em>Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variation Point</em>'.
	 * @generated
	 */
	VariationPoint createVariationPoint();

	/**
	 * Returns a new object of class '<em>VP Constraint VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VP Constraint VP</em>'.
	 * @generated
	 */
	VP_Constraint_VP createVP_Constraint_VP();

	/**
	 * Returns a new object of class '<em>VConstraint VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VConstraint VP</em>'.
	 * @generated
	 */
	V_Constraint_VP createV_Constraint_VP();

	/**
	 * Returns a new object of class '<em>VConstraint V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VConstraint V</em>'.
	 * @generated
	 */
	V_Constraint_V createV_Constraint_V();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Delta Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delta Module</em>'.
	 * @generated
	 */
	DeltaModule createDeltaModule();

	/**
	 * Returns a new object of class '<em>VP Depends VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VP Depends VP</em>'.
	 * @generated
	 */
	VP_Depends_VP createVP_Depends_VP();

	/**
	 * Returns a new object of class '<em>VP Excludes VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VP Excludes VP</em>'.
	 * @generated
	 */
	VP_Excludes_VP createVP_Excludes_VP();

	/**
	 * Returns a new object of class '<em>VDepends VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDepends VP</em>'.
	 * @generated
	 */
	V_Depends_VP createV_Depends_VP();

	/**
	 * Returns a new object of class '<em>VExcludes VP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VExcludes VP</em>'.
	 * @generated
	 */
	V_Excludes_VP createV_Excludes_VP();

	/**
	 * Returns a new object of class '<em>VDepends V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDepends V</em>'.
	 * @generated
	 */
	V_Depends_V createV_Depends_V();

	/**
	 * Returns a new object of class '<em>VExcludes V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VExcludes V</em>'.
	 * @generated
	 */
	V_Excludes_V createV_Excludes_V();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	Cardinality createCardinality();

	/**
	 * Returns a new object of class '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change</em>'.
	 * @generated
	 */
	Change createChange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VavemodelPackage getVavemodelPackage();

} //VavemodelFactory
