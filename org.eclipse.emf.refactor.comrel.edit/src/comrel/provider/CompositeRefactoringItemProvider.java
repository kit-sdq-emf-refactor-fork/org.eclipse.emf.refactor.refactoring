/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.provider;


import comrel.CompositeRefactoring;
import comrel.ComrelFactory;
import comrel.ComrelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link comrel.CompositeRefactoring} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeRefactoringItemProvider
	extends ModelRefactoringItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRefactoringItemProvider(AdapterFactory adapterFactory) {
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

			addMappingVisualizationPropertyDescriptor(object);
			addCustomInitialConditionPropertyDescriptor(object);
			addCustomFinalConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mapping Visualization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingVisualizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeRefactoring_mappingVisualization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeRefactoring_mappingVisualization_feature", "_UI_CompositeRefactoring_type"),
				 ComrelPackage.Literals.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Initial Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomInitialConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeRefactoring_customInitialCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeRefactoring_customInitialCondition_feature", "_UI_CompositeRefactoring_type"),
				 ComrelPackage.Literals.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Final Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomFinalConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeRefactoring_customFinalCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeRefactoring_customFinalCondition_feature", "_UI_CompositeRefactoring_type"),
				 ComrelPackage.Literals.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT);
			childrenFeatures.add(ComrelPackage.Literals.COMPOSITE_REFACTORING__PORT_MAPPINGS);
			childrenFeatures.add(ComrelPackage.Literals.COMPOSITE_REFACTORING__MODEL_REFACTORINGS);
			childrenFeatures.add(ComrelPackage.Literals.COMPOSITE_REFACTORING__HELPER);
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
	 * This returns CompositeRefactoring.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeRefactoring"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeRefactoring)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeRefactoring_type") :
			getString("_UI_CompositeRefactoring_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeRefactoring.class)) {
			case ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION:
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION:
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
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
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createAtomicUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createSequentialUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createConditionalUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createSingleQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createCartesianQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT,
				 ComrelFactory.eINSTANCE.createParallelQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__PORT_MAPPINGS,
				 ComrelFactory.eINSTANCE.createSinglePortMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__PORT_MAPPINGS,
				 ComrelFactory.eINSTANCE.createMultiPortMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__PORT_MAPPINGS,
				 ComrelFactory.eINSTANCE.createMultiSinglePortMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MODEL_REFACTORINGS,
				 ComrelFactory.eINSTANCE.createModelRefactoring()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__MODEL_REFACTORINGS,
				 ComrelFactory.eINSTANCE.createCompositeRefactoring()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__HELPER,
				 ComrelFactory.eINSTANCE.createSingleFeatureHelper()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__HELPER,
				 ComrelFactory.eINSTANCE.createMultiFeatureHelper()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__HELPER,
				 ComrelFactory.eINSTANCE.createSingleFilterHelper()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.COMPOSITE_REFACTORING__HELPER,
				 ComrelFactory.eINSTANCE.createMultiFilterHelper()));
	}

}
