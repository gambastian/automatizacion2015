package org.xtext.jlog.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.jlog.jlogDsl.ArqStimulus;
import org.xtext.jlog.jlogDsl.Jlog;
import org.xtext.jlog.jlogDsl.JlogDslPackage;
import org.xtext.jlog.jlogDsl.Values;
import org.xtext.jlog.services.JlogDslGrammarAccess;

@SuppressWarnings("all")
public class JlogDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JlogDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JlogDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JlogDslPackage.ARQ_STIMULUS:
				if(context == grammarAccess.getArqStimulusRule()) {
					sequence_ArqStimulus(context, (ArqStimulus) semanticObject); 
					return; 
				}
				else break;
			case JlogDslPackage.JLOG:
				if(context == grammarAccess.getJlogRule()) {
					sequence_Jlog(context, (Jlog) semanticObject); 
					return; 
				}
				else break;
			case JlogDslPackage.VALUES:
				if(context == grammarAccess.getValuesRule()) {
					sequence_Values(context, (Values) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         stimulusName=STRING 
	 *         minResponseTime=INT 
	 *         medResponseTime=INT 
	 *         maxResponseTime=INT 
	 *         errorPercentage=Double 
	 *         throughput=Double 
	 *         threadNumber=INT 
	 *         latencies+=Values? 
	 *         latencies+=Values* 
	 *         responses+=Values? 
	 *         responses+=Values*
	 *     )
	 */
	protected void sequence_ArqStimulus(EObject context, ArqStimulus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING arquEstimulos+=ArqStimulus arquEstimulos+=ArqStimulus*)
	 */
	protected void sequence_Jlog(EObject context, Jlog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=INT)
	 */
	protected void sequence_Values(EObject context, Values semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JlogDslPackage.Literals.VALUES__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JlogDslPackage.Literals.VALUES__KEY));
			if(transientValues.isValueTransient(semanticObject, JlogDslPackage.Literals.VALUES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JlogDslPackage.Literals.VALUES__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValuesAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getValuesAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
