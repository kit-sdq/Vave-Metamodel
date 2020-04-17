/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Mapping#getOption <em>Option</em>}</li>
 *   <li>{@link vavemodel.Mapping#getDeltamodule <em>Deltamodule</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getMapping_Option()
	 * @model
	 * @generated
	 */
	EList<Option> getOption();

	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' reference list.
	 * The list contents are of type {@link vavemodel.DeltaModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamodule</em>' reference list.
	 * @see vavemodel.VavemodelPackage#getMapping_Deltamodule()
	 * @model required="true"
	 * @generated
	 */
	EList<DeltaModule> getDeltamodule();

} // Mapping
