/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.provider;


import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.SequentialUnit;

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
 * This is the item provider adapter for a {@link comrel.SequentialUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialUnitItemProvider
	extends CompositeUnitItemProvider
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
	public SequentialUnitItemProvider(AdapterFactory adapterFactory) {
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

			addStrictPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addLblStrictPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Strict feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrictPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequentialUnit_strict_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequentialUnit_strict_feature", "_UI_SequentialUnit_type"),
				 ComrelPackage.Literals.SEQUENTIAL_UNIT__STRICT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequentialUnit_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequentialUnit_type_feature", "_UI_SequentialUnit_type"),
				 ComrelPackage.Literals.SEQUENTIAL_UNIT__TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lbl Strict feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLblStrictPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequentialUnit_lblStrict_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequentialUnit_lblStrict_feature", "_UI_SequentialUnit_type"),
				 ComrelPackage.Literals.SEQUENTIAL_UNIT__LBL_STRICT,
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
			childrenFeatures.add(ComrelPackage.Literals.SEQUENTIAL_UNIT__HELPER_UNITS);
			childrenFeatures.add(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS);
			childrenFeatures.add(ComrelPackage.Literals.SEQUENTIAL_UNIT__INPUT_PORTS);
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
	 * This returns SequentialUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SequentialUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SequentialUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SequentialUnit_type") :
			getString("_UI_SequentialUnit_type") + " " + label;
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

		switch (notification.getFeatureID(SequentialUnit.class)) {
			case ComrelPackage.SEQUENTIAL_UNIT__STRICT:
			case ComrelPackage.SEQUENTIAL_UNIT__TYPE:
			case ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
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
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__HELPER_UNITS,
				 ComrelFactory.eINSTANCE.createSingleFeatureUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__HELPER_UNITS,
				 ComrelFactory.eINSTANCE.createMultiFeatureUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__HELPER_UNITS,
				 ComrelFactory.eINSTANCE.createSingleFilterUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__HELPER_UNITS,
				 ComrelFactory.eINSTANCE.createMultiFilterUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createAtomicUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createSequentialUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createConditionalUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createSingleQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createCartesianQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__REFACTORING_UNITS,
				 ComrelFactory.eINSTANCE.createParallelQueuedUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__INPUT_PORTS,
				 ComrelFactory.eINSTANCE.createSingleInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(ComrelPackage.Literals.SEQUENTIAL_UNIT__INPUT_PORTS,
				 ComrelFactory.eINSTANCE.createMultiInputPort()));
	}

}
