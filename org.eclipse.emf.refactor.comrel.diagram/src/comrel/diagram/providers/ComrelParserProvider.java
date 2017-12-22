/*
 * 
 */
package comrel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import comrel.ComrelPackage;
import comrel.diagram.edit.parts.AtomicUnitLabelType2EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelType3EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelType4EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelType5EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelType6EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelType7EditPart;
import comrel.diagram.edit.parts.AtomicUnitLabelTypeEditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict2EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict3EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict4EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict5EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict6EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrict7EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitNameTypeLblStrictEditPart;
import comrel.diagram.edit.parts.ConditionCheckNameTypeSpecEditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType2EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType3EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType4EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType5EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType6EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameType7EditPart;
import comrel.diagram.edit.parts.ConditionalUnitNameTypeEditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitNameType2EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitNameType3EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitNameType4EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitNameType5EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitNameTypeEditPart;
import comrel.diagram.edit.parts.MultiFilterUnitNameType2EditPart;
import comrel.diagram.edit.parts.MultiFilterUnitNameType3EditPart;
import comrel.diagram.edit.parts.MultiFilterUnitNameType4EditPart;
import comrel.diagram.edit.parts.MultiFilterUnitNameType5EditPart;
import comrel.diagram.edit.parts.MultiFilterUnitNameTypeEditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType2EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType3EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType4EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType5EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType6EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType7EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType8EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameType9EditPart;
import comrel.diagram.edit.parts.MultiInputPortNameTypeEditPart;
import comrel.diagram.edit.parts.MultiOutputPortNameType2EditPart;
import comrel.diagram.edit.parts.MultiOutputPortNameTypeEditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict2EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict3EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict4EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict5EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict6EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrict7EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitNameTypeLblStrictEditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict2EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict3EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict4EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict5EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict6EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrict7EditPart;
import comrel.diagram.edit.parts.SequentialUnitNameTypeLblStrictEditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitNameType2EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitNameType3EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitNameType4EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitNameType5EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitNameTypeEditPart;
import comrel.diagram.edit.parts.SingleFilterUnitNameType2EditPart;
import comrel.diagram.edit.parts.SingleFilterUnitNameType3EditPart;
import comrel.diagram.edit.parts.SingleFilterUnitNameType4EditPart;
import comrel.diagram.edit.parts.SingleFilterUnitNameType5EditPart;
import comrel.diagram.edit.parts.SingleFilterUnitNameTypeEditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType2EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType3EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType4EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType5EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType6EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType7EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType8EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameType9EditPart;
import comrel.diagram.edit.parts.SingleInputPortNameTypeEditPart;
import comrel.diagram.edit.parts.SingleOutputPortNameType2EditPart;
import comrel.diagram.edit.parts.SingleOutputPortNameTypeEditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict2EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict3EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict4EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict5EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict6EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrict7EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitNameTypeLblStrictEditPart;
import comrel.diagram.parsers.MessageFormatParser;
import comrel.diagram.part.ComrelVisualIDRegistry;

/**
 * @generated
 */
public class ComrelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5001Parser() {
		if (singleInputPortNameType_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5001Parser = parser;
		}
		return singleInputPortNameType_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5080Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5080Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5080Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5080Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5081Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5081Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5081Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5081Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5082Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5082Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5082Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5082Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5083Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5083Parser() {
		if (sequentialUnitNameTypeLblStrict_5083Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5083Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5084Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5084Parser() {
		if (conditionalUnitNameType_5084Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5084Parser = parser;
		}
		return conditionalUnitNameType_5084Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5085Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5085Parser() {
		if (atomicUnitLabelType_5085Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5085Parser = parser;
		}
		return atomicUnitLabelType_5085Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5002Parser() {
		if (singleInputPortNameType_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5002Parser = parser;
		}
		return singleInputPortNameType_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5003Parser() {
		if (multiInputPortNameType_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5003Parser = parser;
		}
		return multiInputPortNameType_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5079Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5079Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5079Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5079Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5078Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5078Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5078Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5078Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5004Parser() {
		if (singleInputPortNameType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5004Parser = parser;
		}
		return singleInputPortNameType_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5005Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5005Parser() {
		if (multiInputPortNameType_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5005Parser = parser;
		}
		return multiInputPortNameType_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5077Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5077Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5077Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5077Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFeatureUnitNameType_5009Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFeatureUnitNameType_5009Parser() {
		if (singleFeatureUnitNameType_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFeatureUnitNameType_5009Parser = parser;
		}
		return singleFeatureUnitNameType_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5006Parser() {
		if (singleInputPortNameType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5006Parser = parser;
		}
		return singleInputPortNameType_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5007Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5007Parser() {
		if (multiInputPortNameType_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5007Parser = parser;
		}
		return multiInputPortNameType_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleOutputPortNameType_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSingleOutputPortNameType_5008Parser() {
		if (singleOutputPortNameType_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleOutputPortNameType_5008Parser = parser;
		}
		return singleOutputPortNameType_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFeatureUnitNameType_5013Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFeatureUnitNameType_5013Parser() {
		if (multiFeatureUnitNameType_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFeatureUnitNameType_5013Parser = parser;
		}
		return multiFeatureUnitNameType_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5010Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5010Parser() {
		if (singleInputPortNameType_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5010Parser = parser;
		}
		return singleInputPortNameType_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5011Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5011Parser() {
		if (multiInputPortNameType_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5011Parser = parser;
		}
		return multiInputPortNameType_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiOutputPortNameType_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMultiOutputPortNameType_5012Parser() {
		if (multiOutputPortNameType_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiOutputPortNameType_5012Parser = parser;
		}
		return multiOutputPortNameType_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFilterUnitNameType_5016Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFilterUnitNameType_5016Parser() {
		if (singleFilterUnitNameType_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFilterUnitNameType_5016Parser = parser;
		}
		return singleFilterUnitNameType_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5014Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5014Parser() {
		if (multiInputPortNameType_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5014Parser = parser;
		}
		return multiInputPortNameType_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleOutputPortNameType_5015Parser;

	/**
	 * @generated
	 */
	private IParser getSingleOutputPortNameType_5015Parser() {
		if (singleOutputPortNameType_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleOutputPortNameType_5015Parser = parser;
		}
		return singleOutputPortNameType_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFilterUnitNameType_5019Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFilterUnitNameType_5019Parser() {
		if (multiFilterUnitNameType_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFilterUnitNameType_5019Parser = parser;
		}
		return multiFilterUnitNameType_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5017Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5017Parser() {
		if (multiInputPortNameType_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5017Parser = parser;
		}
		return multiInputPortNameType_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiOutputPortNameType_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMultiOutputPortNameType_5018Parser() {
		if (multiOutputPortNameType_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiOutputPortNameType_5018Parser = parser;
		}
		return multiOutputPortNameType_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5076Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5076Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5076Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5076Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5020Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5020Parser() {
		if (singleInputPortNameType_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5020Parser = parser;
		}
		return singleInputPortNameType_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5021Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5021Parser() {
		if (multiInputPortNameType_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5021Parser = parser;
		}
		return multiInputPortNameType_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5075Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5075Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5075Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5075Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5074Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5074Parser() {
		if (sequentialUnitNameTypeLblStrict_5074Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5074Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5022Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5022Parser() {
		if (singleInputPortNameType_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5022Parser = parser;
		}
		return singleInputPortNameType_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5023Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5023Parser() {
		if (multiInputPortNameType_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5023Parser = parser;
		}
		return multiInputPortNameType_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5073Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5073Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5073Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5073Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5072Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5072Parser() {
		if (conditionalUnitNameType_5072Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5072Parser = parser;
		}
		return conditionalUnitNameType_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5024Parser() {
		if (singleInputPortNameType_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5024Parser = parser;
		}
		return singleInputPortNameType_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiInputPortNameType_5025Parser;

	/**
	 * @generated
	 */
	private IParser getMultiInputPortNameType_5025Parser() {
		if (multiInputPortNameType_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiInputPortNameType_5025Parser = parser;
		}
		return multiInputPortNameType_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5028Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5028Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5028Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5027Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5027Parser() {
		if (atomicUnitLabelType_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5027Parser = parser;
		}
		return atomicUnitLabelType_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleInputPortNameType_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSingleInputPortNameType_5026Parser() {
		if (singleInputPortNameType_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleInputPortNameType_5026Parser = parser;
		}
		return singleInputPortNameType_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5071Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5071Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5071Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5071Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5070Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5070Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5070Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5070Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFeatureUnitNameType_5029Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFeatureUnitNameType_5029Parser() {
		if (singleFeatureUnitNameType_5029Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFeatureUnitNameType_5029Parser = parser;
		}
		return singleFeatureUnitNameType_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFeatureUnitNameType_5030Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFeatureUnitNameType_5030Parser() {
		if (multiFeatureUnitNameType_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFeatureUnitNameType_5030Parser = parser;
		}
		return multiFeatureUnitNameType_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFilterUnitNameType_5031Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFilterUnitNameType_5031Parser() {
		if (singleFilterUnitNameType_5031Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFilterUnitNameType_5031Parser = parser;
		}
		return singleFilterUnitNameType_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFilterUnitNameType_5032Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFilterUnitNameType_5032Parser() {
		if (multiFilterUnitNameType_5032Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFilterUnitNameType_5032Parser = parser;
		}
		return multiFilterUnitNameType_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5069Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5069Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5069Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5069Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5068Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5068Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5068Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5068Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5067Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5067Parser() {
		if (sequentialUnitNameTypeLblStrict_5067Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5067Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5066Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5066Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5066Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5066Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5065Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5065Parser() {
		if (conditionalUnitNameType_5065Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5065Parser = parser;
		}
		return conditionalUnitNameType_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser cartesianQueuedUnitNameTypeLblStrict_5033Parser;

	/**
	 * @generated
	 */
	private IParser getCartesianQueuedUnitNameTypeLblStrict_5033Parser() {
		if (cartesianQueuedUnitNameTypeLblStrict_5033Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			cartesianQueuedUnitNameTypeLblStrict_5033Parser = parser;
		}
		return cartesianQueuedUnitNameTypeLblStrict_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser parallelQueuedUnitNameTypeLblStrict_5035Parser;

	/**
	 * @generated
	 */
	private IParser getParallelQueuedUnitNameTypeLblStrict_5035Parser() {
		if (parallelQueuedUnitNameTypeLblStrict_5035Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getParallelQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parallelQueuedUnitNameTypeLblStrict_5035Parser = parser;
		}
		return parallelQueuedUnitNameTypeLblStrict_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5034Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5034Parser() {
		if (atomicUnitLabelType_5034Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5034Parser = parser;
		}
		return atomicUnitLabelType_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFeatureUnitNameType_5036Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFeatureUnitNameType_5036Parser() {
		if (singleFeatureUnitNameType_5036Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFeatureUnitNameType_5036Parser = parser;
		}
		return singleFeatureUnitNameType_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFeatureUnitNameType_5037Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFeatureUnitNameType_5037Parser() {
		if (multiFeatureUnitNameType_5037Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFeatureUnitNameType_5037Parser = parser;
		}
		return multiFeatureUnitNameType_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFilterUnitNameType_5038Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFilterUnitNameType_5038Parser() {
		if (singleFilterUnitNameType_5038Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFilterUnitNameType_5038Parser = parser;
		}
		return singleFilterUnitNameType_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFilterUnitNameType_5039Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFilterUnitNameType_5039Parser() {
		if (multiFilterUnitNameType_5039Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFilterUnitNameType_5039Parser = parser;
		}
		return multiFilterUnitNameType_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5064Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5064Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5064Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5064Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFeatureUnitNameType_5040Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFeatureUnitNameType_5040Parser() {
		if (singleFeatureUnitNameType_5040Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFeatureUnitNameType_5040Parser = parser;
		}
		return singleFeatureUnitNameType_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFeatureUnitNameType_5041Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFeatureUnitNameType_5041Parser() {
		if (multiFeatureUnitNameType_5041Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFeatureUnitNameType_5041Parser = parser;
		}
		return multiFeatureUnitNameType_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFilterUnitNameType_5042Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFilterUnitNameType_5042Parser() {
		if (singleFilterUnitNameType_5042Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFilterUnitNameType_5042Parser = parser;
		}
		return singleFilterUnitNameType_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFilterUnitNameType_5043Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFilterUnitNameType_5043Parser() {
		if (multiFilterUnitNameType_5043Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFilterUnitNameType_5043Parser = parser;
		}
		return multiFilterUnitNameType_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5063Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5063Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5063Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5063Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5062Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5062Parser() {
		if (sequentialUnitNameTypeLblStrict_5062Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5062Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFeatureUnitNameType_5044Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFeatureUnitNameType_5044Parser() {
		if (singleFeatureUnitNameType_5044Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFeatureUnitNameType_5044Parser = parser;
		}
		return singleFeatureUnitNameType_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFeatureUnitNameType_5045Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFeatureUnitNameType_5045Parser() {
		if (multiFeatureUnitNameType_5045Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFeatureUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFeatureUnitNameType_5045Parser = parser;
		}
		return multiFeatureUnitNameType_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleFilterUnitNameType_5046Parser;

	/**
	 * @generated
	 */
	private IParser getSingleFilterUnitNameType_5046Parser() {
		if (singleFilterUnitNameType_5046Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			singleFilterUnitNameType_5046Parser = parser;
		}
		return singleFilterUnitNameType_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser multiFilterUnitNameType_5047Parser;

	/**
	 * @generated
	 */
	private IParser getMultiFilterUnitNameType_5047Parser() {
		if (multiFilterUnitNameType_5047Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getMultiFilterUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			multiFilterUnitNameType_5047Parser = parser;
		}
		return multiFilterUnitNameType_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5061Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5061Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5061Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5061Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5060Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5060Parser() {
		if (conditionalUnitNameType_5060Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5060Parser = parser;
		}
		return conditionalUnitNameType_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleQueuedUnitNameTypeLblStrict_5049Parser;

	/**
	 * @generated
	 */
	private IParser getSingleQueuedUnitNameTypeLblStrict_5049Parser() {
		if (singleQueuedUnitNameTypeLblStrict_5049Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_Type(),
					ComrelPackage.eINSTANCE.getSingleQueuedUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			singleQueuedUnitNameTypeLblStrict_5049Parser = parser;
		}
		return singleQueuedUnitNameTypeLblStrict_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5048Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5048Parser() {
		if (atomicUnitLabelType_5048Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5048Parser = parser;
		}
		return atomicUnitLabelType_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5059Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5059Parser() {
		if (sequentialUnitNameTypeLblStrict_5059Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5059Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5058Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5058Parser() {
		if (sequentialUnitNameTypeLblStrict_5058Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5058Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5057Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5057Parser() {
		if (conditionalUnitNameType_5057Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5057Parser = parser;
		}
		return conditionalUnitNameType_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5056Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5056Parser() {
		if (conditionalUnitNameType_5056Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5056Parser = parser;
		}
		return conditionalUnitNameType_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser sequentialUnitNameTypeLblStrict_5051Parser;

	/**
	 * @generated
	 */
	private IParser getSequentialUnitNameTypeLblStrict_5051Parser() {
		if (sequentialUnitNameTypeLblStrict_5051Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getSequentialUnit_Type(),
					ComrelPackage.eINSTANCE.getSequentialUnit_LblStrict() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			sequentialUnitNameTypeLblStrict_5051Parser = parser;
		}
		return sequentialUnitNameTypeLblStrict_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5050Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5050Parser() {
		if (atomicUnitLabelType_5050Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5050Parser = parser;
		}
		return atomicUnitLabelType_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalUnitNameType_5055Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalUnitNameType_5055Parser() {
		if (conditionalUnitNameType_5055Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionalUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			conditionalUnitNameType_5055Parser = parser;
		}
		return conditionalUnitNameType_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionCheckNameTypeSpec_5052Parser;

	/**
	 * @generated
	 */
	private IParser getConditionCheckNameTypeSpec_5052Parser() {
		if (conditionCheckNameTypeSpec_5052Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getNamedElement_Name(),
					ComrelPackage.eINSTANCE.getConditionCheck_Type(),
					ComrelPackage.eINSTANCE.getConditionCheck_Spec() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1} -{2}-"); //$NON-NLS-1$
			conditionCheckNameTypeSpec_5052Parser = parser;
		}
		return conditionCheckNameTypeSpec_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5053Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5053Parser() {
		if (atomicUnitLabelType_5053Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5053Parser = parser;
		}
		return atomicUnitLabelType_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser atomicUnitLabelType_5054Parser;

	/**
	 * @generated
	 */
	private IParser getAtomicUnitLabelType_5054Parser() {
		if (atomicUnitLabelType_5054Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ComrelPackage.eINSTANCE.getAtomicUnit_Label(),
					ComrelPackage.eINSTANCE.getAtomicUnit_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			atomicUnitLabelType_5054Parser = parser;
		}
		return atomicUnitLabelType_5054Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SingleInputPortNameTypeEditPart.VISUAL_ID:
			return getSingleInputPortNameType_5001Parser();
		case CartesianQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5080Parser();
		case ParallelQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5081Parser();
		case SingleQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5082Parser();
		case SequentialUnitNameTypeLblStrictEditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5083Parser();
		case ConditionalUnitNameTypeEditPart.VISUAL_ID:
			return getConditionalUnitNameType_5084Parser();
		case AtomicUnitLabelTypeEditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5085Parser();
		case SingleInputPortNameType2EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5002Parser();
		case MultiInputPortNameTypeEditPart.VISUAL_ID:
			return getMultiInputPortNameType_5003Parser();
		case CartesianQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5079Parser();
		case ParallelQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5078Parser();
		case SingleInputPortNameType3EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5004Parser();
		case MultiInputPortNameType2EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5005Parser();
		case CartesianQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5077Parser();
		case SingleFeatureUnitNameTypeEditPart.VISUAL_ID:
			return getSingleFeatureUnitNameType_5009Parser();
		case SingleInputPortNameType4EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5006Parser();
		case MultiInputPortNameType3EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5007Parser();
		case SingleOutputPortNameTypeEditPart.VISUAL_ID:
			return getSingleOutputPortNameType_5008Parser();
		case MultiFeatureUnitNameTypeEditPart.VISUAL_ID:
			return getMultiFeatureUnitNameType_5013Parser();
		case SingleInputPortNameType5EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5010Parser();
		case MultiInputPortNameType4EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5011Parser();
		case MultiOutputPortNameTypeEditPart.VISUAL_ID:
			return getMultiOutputPortNameType_5012Parser();
		case SingleFilterUnitNameTypeEditPart.VISUAL_ID:
			return getSingleFilterUnitNameType_5016Parser();
		case MultiInputPortNameType5EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5014Parser();
		case SingleOutputPortNameType2EditPart.VISUAL_ID:
			return getSingleOutputPortNameType_5015Parser();
		case MultiFilterUnitNameTypeEditPart.VISUAL_ID:
			return getMultiFilterUnitNameType_5019Parser();
		case MultiInputPortNameType6EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5017Parser();
		case MultiOutputPortNameType2EditPart.VISUAL_ID:
			return getMultiOutputPortNameType_5018Parser();
		case SingleQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5076Parser();
		case SingleInputPortNameType6EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5020Parser();
		case MultiInputPortNameType7EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5021Parser();
		case CartesianQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5075Parser();
		case SequentialUnitNameTypeLblStrict2EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5074Parser();
		case SingleInputPortNameType7EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5022Parser();
		case MultiInputPortNameType8EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5023Parser();
		case CartesianQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5073Parser();
		case ConditionalUnitNameType2EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5072Parser();
		case SingleInputPortNameType8EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5024Parser();
		case MultiInputPortNameType9EditPart.VISUAL_ID:
			return getMultiInputPortNameType_5025Parser();
		case CartesianQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5028Parser();
		case AtomicUnitLabelType2EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5027Parser();
		case SingleInputPortNameType9EditPart.VISUAL_ID:
			return getSingleInputPortNameType_5026Parser();
		case ParallelQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5071Parser();
		case ParallelQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5070Parser();
		case SingleFeatureUnitNameType2EditPart.VISUAL_ID:
			return getSingleFeatureUnitNameType_5029Parser();
		case MultiFeatureUnitNameType2EditPart.VISUAL_ID:
			return getMultiFeatureUnitNameType_5030Parser();
		case SingleFilterUnitNameType2EditPart.VISUAL_ID:
			return getSingleFilterUnitNameType_5031Parser();
		case MultiFilterUnitNameType2EditPart.VISUAL_ID:
			return getMultiFilterUnitNameType_5032Parser();
		case SingleQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5069Parser();
		case ParallelQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5068Parser();
		case SequentialUnitNameTypeLblStrict3EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5067Parser();
		case ParallelQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5066Parser();
		case ConditionalUnitNameType3EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5065Parser();
		case CartesianQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
			return getCartesianQueuedUnitNameTypeLblStrict_5033Parser();
		case ParallelQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
			return getParallelQueuedUnitNameTypeLblStrict_5035Parser();
		case AtomicUnitLabelType3EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5034Parser();
		case SingleFeatureUnitNameType3EditPart.VISUAL_ID:
			return getSingleFeatureUnitNameType_5036Parser();
		case MultiFeatureUnitNameType3EditPart.VISUAL_ID:
			return getMultiFeatureUnitNameType_5037Parser();
		case SingleFilterUnitNameType3EditPart.VISUAL_ID:
			return getSingleFilterUnitNameType_5038Parser();
		case MultiFilterUnitNameType3EditPart.VISUAL_ID:
			return getMultiFilterUnitNameType_5039Parser();
		case SingleQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5064Parser();
		case SingleFeatureUnitNameType4EditPart.VISUAL_ID:
			return getSingleFeatureUnitNameType_5040Parser();
		case MultiFeatureUnitNameType4EditPart.VISUAL_ID:
			return getMultiFeatureUnitNameType_5041Parser();
		case SingleFilterUnitNameType4EditPart.VISUAL_ID:
			return getSingleFilterUnitNameType_5042Parser();
		case MultiFilterUnitNameType4EditPart.VISUAL_ID:
			return getMultiFilterUnitNameType_5043Parser();
		case SingleQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5063Parser();
		case SequentialUnitNameTypeLblStrict4EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5062Parser();
		case SingleFeatureUnitNameType5EditPart.VISUAL_ID:
			return getSingleFeatureUnitNameType_5044Parser();
		case MultiFeatureUnitNameType5EditPart.VISUAL_ID:
			return getMultiFeatureUnitNameType_5045Parser();
		case SingleFilterUnitNameType5EditPart.VISUAL_ID:
			return getSingleFilterUnitNameType_5046Parser();
		case MultiFilterUnitNameType5EditPart.VISUAL_ID:
			return getMultiFilterUnitNameType_5047Parser();
		case SingleQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5061Parser();
		case ConditionalUnitNameType4EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5060Parser();
		case SingleQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
			return getSingleQueuedUnitNameTypeLblStrict_5049Parser();
		case AtomicUnitLabelType4EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5048Parser();
		case SequentialUnitNameTypeLblStrict5EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5059Parser();
		case SequentialUnitNameTypeLblStrict6EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5058Parser();
		case ConditionalUnitNameType5EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5057Parser();
		case ConditionalUnitNameType6EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5056Parser();
		case SequentialUnitNameTypeLblStrict7EditPart.VISUAL_ID:
			return getSequentialUnitNameTypeLblStrict_5051Parser();
		case AtomicUnitLabelType5EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5050Parser();
		case ConditionalUnitNameType7EditPart.VISUAL_ID:
			return getConditionalUnitNameType_5055Parser();
		case ConditionCheckNameTypeSpecEditPart.VISUAL_ID:
			return getConditionCheckNameTypeSpec_5052Parser();
		case AtomicUnitLabelType6EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5053Parser();
		case AtomicUnitLabelType7EditPart.VISUAL_ID:
			return getAtomicUnitLabelType_5054Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComrelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComrelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComrelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
