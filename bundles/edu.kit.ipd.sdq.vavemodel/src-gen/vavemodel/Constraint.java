/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Constraint#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.FeatureOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getConstraint_Option()
	 * @model
	 * @generated
	 */
	EList<FeatureOption> getOption();

} // Constraint
