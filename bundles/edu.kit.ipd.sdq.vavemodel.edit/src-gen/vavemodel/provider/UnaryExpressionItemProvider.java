/**
 */
package vavemodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vavemodel.UnaryExpression;
import vavemodel.VavemodelFactory;
import vavemodel.VavemodelPackage;

/**
 * This is the item provider adapter for a {@link vavemodel.UnaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UnaryExpression_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UnaryExpression.class)) {
			case VavemodelPackage.UNARY_EXPRESSION__TERM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createEquivalence()));

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createConjunction()));

		newChildDescriptors.add
			(createChildParameter
				(VavemodelPackage.Literals.UNARY_EXPRESSION__TERM,
				 VavemodelFactory.eINSTANCE.createNot()));
	}

}
