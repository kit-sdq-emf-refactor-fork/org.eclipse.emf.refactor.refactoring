/*
 * 
 */
package comrel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import comrel.diagram.edit.parts.*;
import comrel.diagram.part.ComrelVisualIDRegistry;
import comrel.diagram.part.Messages;

/**
 * @generated
 */
public class ComrelNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ComrelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ComrelNavigatorItem> result = new ArrayList<ComrelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							CompositeRefactoringEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ComrelNavigatorGroup) {
			ComrelNavigatorGroup group = (ComrelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ComrelNavigatorItem) {
			ComrelNavigatorItem navigatorItem = (ComrelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {

		case CompositeRefactoringEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ComrelNavigatorGroup links = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_CompositeRefactoring_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(AtomicUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SingleInputPort4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CartesianQueuedUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CartesianQueuedUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CartesianQueuedUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleQueuedUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFilterUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SinglePortMappingEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComrelNavigatorGroup target = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SinglePortMapping_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup source = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SinglePortMapping_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SequentialUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConditionalUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFeatureUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConditionalUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFeatureUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFeatureUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CartesianQueuedUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConditionalUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFeatureUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequentialUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFeatureUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleInputPort8EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleInputPort5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiFilterUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CartesianQueuedUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiInputPort4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ParallelQueuedUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFeatureUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiInputPort9EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiInputPort7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionalUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequentialUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleInputPort2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleInputPort9EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiInputPort3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionalUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFilterUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleOutputPortEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleOutputPort_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiFilterUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFeatureUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFilterUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFeatureUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleQueuedUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequentialUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleQueuedUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleQueuedUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFilterUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFilterUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequentialUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiInputPort8EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleQueuedUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiInputPort5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleInputPort3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleQueuedUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CartesianQueuedUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AtomicUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiInputPortEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SequentialUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFeatureUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFilterUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleInputPort6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CartesianQueuedUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnit6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleInputPort7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiInputPort2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SingleInputPortEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleInputPort_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiFilterUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SequentialUnit2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConditionalUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleFilterUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleOutputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiFeatureUnit3EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnitEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiOutputPortEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiOutputPort_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AtomicUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ParallelQueuedUnit4EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiPortMappingEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComrelNavigatorGroup target = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiPortMapping_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup source = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiPortMapping_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MultiInputPort6EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup incominglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiInputPort_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiSinglePortMappingEditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ComrelNavigatorGroup target = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiSinglePortMapping_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ComrelNavigatorGroup source = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiSinglePortMapping_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiOutputPort2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SingleQueuedUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SingleOutputPort2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_SingleOutputPort_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionalUnit5EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(CartesianQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ParallelQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFeatureUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(MultiFilterUnit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SingleQueuedUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(SequentialUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionalUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(ConditionCheckEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ComrelVisualIDRegistry
							.getType(AtomicUnit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MultiOutputPort2EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ComrelNavigatorGroup outgoinglinks = new ComrelNavigatorGroup(
					Messages.NavigatorGroupName_MultiOutputPort_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiPortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(MultiSinglePortMappingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AtomicUnit7EditPart.VISUAL_ID: {
			LinkedList<ComrelAbstractNavigatorItem> result = new LinkedList<ComrelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ComrelVisualIDRegistry
							.getType(SingleInputPort9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CompositeRefactoringEditPart.MODEL_ID
				.equals(ComrelVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ComrelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ComrelNavigatorItem> result = new ArrayList<ComrelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ComrelNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ComrelNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ComrelAbstractNavigatorItem) {
			ComrelAbstractNavigatorItem abstractNavigatorItem = (ComrelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
