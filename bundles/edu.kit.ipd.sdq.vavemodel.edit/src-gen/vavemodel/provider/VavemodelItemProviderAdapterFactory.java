/**
 */
package vavemodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import vavemodel.util.VavemodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VavemodelItemProviderAdapterFactory extends VavemodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VavemodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.CrossTreeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossTreeConstraintItemProvider crossTreeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.CrossTreeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCrossTreeConstraintAdapter() {
		if (crossTreeConstraintItemProvider == null) {
			crossTreeConstraintItemProvider = new CrossTreeConstraintItemProvider(this);
		}

		return crossTreeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.TreeConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeConstraintItemProvider treeConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.TreeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTreeConstraintAdapter() {
		if (treeConstraintItemProvider == null) {
			treeConstraintItemProvider = new TreeConstraintItemProvider(this);
		}

		return treeConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.FeatureRevision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureRevisionItemProvider featureRevisionItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.FeatureRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureRevisionAdapter() {
		if (featureRevisionItemProvider == null) {
			featureRevisionItemProvider = new FeatureRevisionItemProvider(this);
		}

		return featureRevisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.DeltaModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaModuleItemProvider deltaModuleItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.DeltaModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeltaModuleAdapter() {
		if (deltaModuleItemProvider == null) {
			deltaModuleItemProvider = new DeltaModuleItemProvider(this);
		}

		return deltaModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Implication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationItemProvider implicationItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Implication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplicationAdapter() {
		if (implicationItemProvider == null) {
			implicationItemProvider = new ImplicationItemProvider(this);
		}

		return implicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Disjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjunctionItemProvider disjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Disjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisjunctionAdapter() {
		if (disjunctionItemProvider == null) {
			disjunctionItemProvider = new DisjunctionItemProvider(this);
		}

		return disjunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Equivalence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalenceItemProvider equivalenceItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Equivalence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEquivalenceAdapter() {
		if (equivalenceItemProvider == null) {
			equivalenceItemProvider = new EquivalenceItemProvider(this);
		}

		return equivalenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Conjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjunctionItemProvider conjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Conjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConjunctionAdapter() {
		if (conjunctionItemProvider == null) {
			conjunctionItemProvider = new ConjunctionItemProvider(this);
		}

		return conjunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.Mapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingItemProvider mappingItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingAdapter() {
		if (mappingItemProvider == null) {
			mappingItemProvider = new MappingItemProvider(this);
		}

		return mappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link vavemodel.SystemRevision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRevisionItemProvider systemRevisionItemProvider;

	/**
	 * This creates an adapter for a {@link vavemodel.SystemRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemRevisionAdapter() {
		if (systemRevisionItemProvider == null) {
			systemRevisionItemProvider = new SystemRevisionItemProvider(this);
		}

		return systemRevisionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (featureItemProvider != null) featureItemProvider.dispose();
		if (crossTreeConstraintItemProvider != null) crossTreeConstraintItemProvider.dispose();
		if (treeConstraintItemProvider != null) treeConstraintItemProvider.dispose();
		if (featureRevisionItemProvider != null) featureRevisionItemProvider.dispose();
		if (deltaModuleItemProvider != null) deltaModuleItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (implicationItemProvider != null) implicationItemProvider.dispose();
		if (disjunctionItemProvider != null) disjunctionItemProvider.dispose();
		if (equivalenceItemProvider != null) equivalenceItemProvider.dispose();
		if (conjunctionItemProvider != null) conjunctionItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (mappingItemProvider != null) mappingItemProvider.dispose();
		if (systemRevisionItemProvider != null) systemRevisionItemProvider.dispose();
	}

}
