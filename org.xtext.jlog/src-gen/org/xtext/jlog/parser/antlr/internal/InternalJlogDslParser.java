package org.xtext.jlog.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.jlog.services.JlogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJlogDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jlog'", "'{'", "'}'", "'ArqStimulus{'", "'stimulusName'", "','", "'minResponseTime'", "'medResponseTime'", "'maxResponseTime'", "'errorPercentage'", "'throughput'", "'threadNumber'", "'latencies{'", "'|'", "'responses{'", "':'", "'.'"
    };
    public static final int RULE_ID=6;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalJlogDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJlogDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJlogDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g"; }



     	private JlogDslGrammarAccess grammarAccess;
     	
        public InternalJlogDslParser(TokenStream input, JlogDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Jlog";	
       	}
       	
       	@Override
       	protected JlogDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJlog"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:67:1: entryRuleJlog returns [EObject current=null] : iv_ruleJlog= ruleJlog EOF ;
    public final EObject entryRuleJlog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJlog = null;


        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:68:2: (iv_ruleJlog= ruleJlog EOF )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:69:2: iv_ruleJlog= ruleJlog EOF
            {
             newCompositeNode(grammarAccess.getJlogRule()); 
            pushFollow(FOLLOW_ruleJlog_in_entryRuleJlog75);
            iv_ruleJlog=ruleJlog();

            state._fsp--;

             current =iv_ruleJlog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJlog85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJlog"


    // $ANTLR start "ruleJlog"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:76:1: ruleJlog returns [EObject current=null] : (otherlv_0= 'Jlog' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_arquEstimulos_3_0= ruleArqStimulus ) ) ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )* otherlv_5= '}' ) ;
    public final EObject ruleJlog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_arquEstimulos_3_0 = null;

        EObject lv_arquEstimulos_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:79:28: ( (otherlv_0= 'Jlog' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_arquEstimulos_3_0= ruleArqStimulus ) ) ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )* otherlv_5= '}' ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:80:1: (otherlv_0= 'Jlog' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_arquEstimulos_3_0= ruleArqStimulus ) ) ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )* otherlv_5= '}' )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:80:1: (otherlv_0= 'Jlog' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_arquEstimulos_3_0= ruleArqStimulus ) ) ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )* otherlv_5= '}' )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:80:3: otherlv_0= 'Jlog' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_arquEstimulos_3_0= ruleArqStimulus ) ) ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleJlog122); 

                	newLeafNode(otherlv_0, grammarAccess.getJlogAccess().getJlogKeyword_0());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:84:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:85:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:85:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:86:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJlog139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJlogAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJlogRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleJlog156); 

                	newLeafNode(otherlv_2, grammarAccess.getJlogAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:106:1: ( (lv_arquEstimulos_3_0= ruleArqStimulus ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:107:1: (lv_arquEstimulos_3_0= ruleArqStimulus )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:107:1: (lv_arquEstimulos_3_0= ruleArqStimulus )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:108:3: lv_arquEstimulos_3_0= ruleArqStimulus
            {
             
            	        newCompositeNode(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleArqStimulus_in_ruleJlog177);
            lv_arquEstimulos_3_0=ruleArqStimulus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJlogRule());
            	        }
                   		add(
                   			current, 
                   			"arquEstimulos",
                    		lv_arquEstimulos_3_0, 
                    		"ArqStimulus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:124:2: ( (lv_arquEstimulos_4_0= ruleArqStimulus ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:125:1: (lv_arquEstimulos_4_0= ruleArqStimulus )
            	    {
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:125:1: (lv_arquEstimulos_4_0= ruleArqStimulus )
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:126:3: lv_arquEstimulos_4_0= ruleArqStimulus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArqStimulus_in_ruleJlog198);
            	    lv_arquEstimulos_4_0=ruleArqStimulus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJlogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arquEstimulos",
            	            		lv_arquEstimulos_4_0, 
            	            		"ArqStimulus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleJlog211); 

                	newLeafNode(otherlv_5, grammarAccess.getJlogAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJlog"


    // $ANTLR start "entryRuleArqStimulus"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:154:1: entryRuleArqStimulus returns [EObject current=null] : iv_ruleArqStimulus= ruleArqStimulus EOF ;
    public final EObject entryRuleArqStimulus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArqStimulus = null;


        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:155:2: (iv_ruleArqStimulus= ruleArqStimulus EOF )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:156:2: iv_ruleArqStimulus= ruleArqStimulus EOF
            {
             newCompositeNode(grammarAccess.getArqStimulusRule()); 
            pushFollow(FOLLOW_ruleArqStimulus_in_entryRuleArqStimulus247);
            iv_ruleArqStimulus=ruleArqStimulus();

            state._fsp--;

             current =iv_ruleArqStimulus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArqStimulus257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArqStimulus"


    // $ANTLR start "ruleArqStimulus"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:163:1: ruleArqStimulus returns [EObject current=null] : (otherlv_0= 'ArqStimulus{' otherlv_1= 'stimulusName' ( (lv_stimulusName_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'minResponseTime' ( (lv_minResponseTime_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'medResponseTime' ( (lv_medResponseTime_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'maxResponseTime' ( (lv_maxResponseTime_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'errorPercentage' ( (lv_errorPercentage_14_0= ruleDouble ) ) otherlv_15= ',' otherlv_16= 'throughput' ( (lv_throughput_17_0= ruleDouble ) ) otherlv_18= ',' otherlv_19= 'threadNumber' ( (lv_threadNumber_20_0= RULE_INT ) ) otherlv_21= ',' otherlv_22= 'latencies{' ( (lv_latencies_23_0= ruleValues ) )? (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )* otherlv_26= '}' otherlv_27= ',' otherlv_28= 'responses{' ( (lv_responses_29_0= ruleValues ) )? (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )* otherlv_32= '}' otherlv_33= '}' ) ;
    public final EObject ruleArqStimulus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stimulusName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_minResponseTime_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_medResponseTime_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_maxResponseTime_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_threadNumber_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        EObject lv_errorPercentage_14_0 = null;

        EObject lv_throughput_17_0 = null;

        EObject lv_latencies_23_0 = null;

        EObject lv_latencies_25_0 = null;

        EObject lv_responses_29_0 = null;

        EObject lv_responses_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:166:28: ( (otherlv_0= 'ArqStimulus{' otherlv_1= 'stimulusName' ( (lv_stimulusName_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'minResponseTime' ( (lv_minResponseTime_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'medResponseTime' ( (lv_medResponseTime_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'maxResponseTime' ( (lv_maxResponseTime_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'errorPercentage' ( (lv_errorPercentage_14_0= ruleDouble ) ) otherlv_15= ',' otherlv_16= 'throughput' ( (lv_throughput_17_0= ruleDouble ) ) otherlv_18= ',' otherlv_19= 'threadNumber' ( (lv_threadNumber_20_0= RULE_INT ) ) otherlv_21= ',' otherlv_22= 'latencies{' ( (lv_latencies_23_0= ruleValues ) )? (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )* otherlv_26= '}' otherlv_27= ',' otherlv_28= 'responses{' ( (lv_responses_29_0= ruleValues ) )? (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )* otherlv_32= '}' otherlv_33= '}' ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:167:1: (otherlv_0= 'ArqStimulus{' otherlv_1= 'stimulusName' ( (lv_stimulusName_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'minResponseTime' ( (lv_minResponseTime_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'medResponseTime' ( (lv_medResponseTime_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'maxResponseTime' ( (lv_maxResponseTime_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'errorPercentage' ( (lv_errorPercentage_14_0= ruleDouble ) ) otherlv_15= ',' otherlv_16= 'throughput' ( (lv_throughput_17_0= ruleDouble ) ) otherlv_18= ',' otherlv_19= 'threadNumber' ( (lv_threadNumber_20_0= RULE_INT ) ) otherlv_21= ',' otherlv_22= 'latencies{' ( (lv_latencies_23_0= ruleValues ) )? (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )* otherlv_26= '}' otherlv_27= ',' otherlv_28= 'responses{' ( (lv_responses_29_0= ruleValues ) )? (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )* otherlv_32= '}' otherlv_33= '}' )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:167:1: (otherlv_0= 'ArqStimulus{' otherlv_1= 'stimulusName' ( (lv_stimulusName_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'minResponseTime' ( (lv_minResponseTime_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'medResponseTime' ( (lv_medResponseTime_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'maxResponseTime' ( (lv_maxResponseTime_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'errorPercentage' ( (lv_errorPercentage_14_0= ruleDouble ) ) otherlv_15= ',' otherlv_16= 'throughput' ( (lv_throughput_17_0= ruleDouble ) ) otherlv_18= ',' otherlv_19= 'threadNumber' ( (lv_threadNumber_20_0= RULE_INT ) ) otherlv_21= ',' otherlv_22= 'latencies{' ( (lv_latencies_23_0= ruleValues ) )? (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )* otherlv_26= '}' otherlv_27= ',' otherlv_28= 'responses{' ( (lv_responses_29_0= ruleValues ) )? (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )* otherlv_32= '}' otherlv_33= '}' )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:167:3: otherlv_0= 'ArqStimulus{' otherlv_1= 'stimulusName' ( (lv_stimulusName_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'minResponseTime' ( (lv_minResponseTime_5_0= RULE_INT ) ) otherlv_6= ',' otherlv_7= 'medResponseTime' ( (lv_medResponseTime_8_0= RULE_INT ) ) otherlv_9= ',' otherlv_10= 'maxResponseTime' ( (lv_maxResponseTime_11_0= RULE_INT ) ) otherlv_12= ',' otherlv_13= 'errorPercentage' ( (lv_errorPercentage_14_0= ruleDouble ) ) otherlv_15= ',' otherlv_16= 'throughput' ( (lv_throughput_17_0= ruleDouble ) ) otherlv_18= ',' otherlv_19= 'threadNumber' ( (lv_threadNumber_20_0= RULE_INT ) ) otherlv_21= ',' otherlv_22= 'latencies{' ( (lv_latencies_23_0= ruleValues ) )? (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )* otherlv_26= '}' otherlv_27= ',' otherlv_28= 'responses{' ( (lv_responses_29_0= ruleValues ) )? (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )* otherlv_32= '}' otherlv_33= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleArqStimulus294); 

                	newLeafNode(otherlv_0, grammarAccess.getArqStimulusAccess().getArqStimulusKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleArqStimulus306); 

                	newLeafNode(otherlv_1, grammarAccess.getArqStimulusAccess().getStimulusNameKeyword_1());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:175:1: ( (lv_stimulusName_2_0= RULE_STRING ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:176:1: (lv_stimulusName_2_0= RULE_STRING )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:176:1: (lv_stimulusName_2_0= RULE_STRING )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:177:3: lv_stimulusName_2_0= RULE_STRING
            {
            lv_stimulusName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArqStimulus323); 

            			newLeafNode(lv_stimulusName_2_0, grammarAccess.getArqStimulusAccess().getStimulusNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArqStimulusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"stimulusName",
                    		lv_stimulusName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus340); 

                	newLeafNode(otherlv_3, grammarAccess.getArqStimulusAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleArqStimulus352); 

                	newLeafNode(otherlv_4, grammarAccess.getArqStimulusAccess().getMinResponseTimeKeyword_4());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:201:1: ( (lv_minResponseTime_5_0= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:202:1: (lv_minResponseTime_5_0= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:202:1: (lv_minResponseTime_5_0= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:203:3: lv_minResponseTime_5_0= RULE_INT
            {
            lv_minResponseTime_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArqStimulus369); 

            			newLeafNode(lv_minResponseTime_5_0, grammarAccess.getArqStimulusAccess().getMinResponseTimeINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArqStimulusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minResponseTime",
                    		lv_minResponseTime_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus386); 

                	newLeafNode(otherlv_6, grammarAccess.getArqStimulusAccess().getCommaKeyword_6());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleArqStimulus398); 

                	newLeafNode(otherlv_7, grammarAccess.getArqStimulusAccess().getMedResponseTimeKeyword_7());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:227:1: ( (lv_medResponseTime_8_0= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:228:1: (lv_medResponseTime_8_0= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:228:1: (lv_medResponseTime_8_0= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:229:3: lv_medResponseTime_8_0= RULE_INT
            {
            lv_medResponseTime_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArqStimulus415); 

            			newLeafNode(lv_medResponseTime_8_0, grammarAccess.getArqStimulusAccess().getMedResponseTimeINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArqStimulusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"medResponseTime",
                    		lv_medResponseTime_8_0, 
                    		"INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus432); 

                	newLeafNode(otherlv_9, grammarAccess.getArqStimulusAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleArqStimulus444); 

                	newLeafNode(otherlv_10, grammarAccess.getArqStimulusAccess().getMaxResponseTimeKeyword_10());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:253:1: ( (lv_maxResponseTime_11_0= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:254:1: (lv_maxResponseTime_11_0= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:254:1: (lv_maxResponseTime_11_0= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:255:3: lv_maxResponseTime_11_0= RULE_INT
            {
            lv_maxResponseTime_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArqStimulus461); 

            			newLeafNode(lv_maxResponseTime_11_0, grammarAccess.getArqStimulusAccess().getMaxResponseTimeINTTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArqStimulusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxResponseTime",
                    		lv_maxResponseTime_11_0, 
                    		"INT");
            	    

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus478); 

                	newLeafNode(otherlv_12, grammarAccess.getArqStimulusAccess().getCommaKeyword_12());
                
            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleArqStimulus490); 

                	newLeafNode(otherlv_13, grammarAccess.getArqStimulusAccess().getErrorPercentageKeyword_13());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:279:1: ( (lv_errorPercentage_14_0= ruleDouble ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:280:1: (lv_errorPercentage_14_0= ruleDouble )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:280:1: (lv_errorPercentage_14_0= ruleDouble )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:281:3: lv_errorPercentage_14_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getArqStimulusAccess().getErrorPercentageDoubleParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleArqStimulus511);
            lv_errorPercentage_14_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
            	        }
                   		set(
                   			current, 
                   			"errorPercentage",
                    		lv_errorPercentage_14_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus523); 

                	newLeafNode(otherlv_15, grammarAccess.getArqStimulusAccess().getCommaKeyword_15());
                
            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleArqStimulus535); 

                	newLeafNode(otherlv_16, grammarAccess.getArqStimulusAccess().getThroughputKeyword_16());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:305:1: ( (lv_throughput_17_0= ruleDouble ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:306:1: (lv_throughput_17_0= ruleDouble )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:306:1: (lv_throughput_17_0= ruleDouble )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:307:3: lv_throughput_17_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getArqStimulusAccess().getThroughputDoubleParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleArqStimulus556);
            lv_throughput_17_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
            	        }
                   		set(
                   			current, 
                   			"throughput",
                    		lv_throughput_17_0, 
                    		"Double");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus568); 

                	newLeafNode(otherlv_18, grammarAccess.getArqStimulusAccess().getCommaKeyword_18());
                
            otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleArqStimulus580); 

                	newLeafNode(otherlv_19, grammarAccess.getArqStimulusAccess().getThreadNumberKeyword_19());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:331:1: ( (lv_threadNumber_20_0= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:332:1: (lv_threadNumber_20_0= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:332:1: (lv_threadNumber_20_0= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:333:3: lv_threadNumber_20_0= RULE_INT
            {
            lv_threadNumber_20_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArqStimulus597); 

            			newLeafNode(lv_threadNumber_20_0, grammarAccess.getArqStimulusAccess().getThreadNumberINTTerminalRuleCall_20_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArqStimulusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"threadNumber",
                    		lv_threadNumber_20_0, 
                    		"INT");
            	    

            }


            }

            otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus614); 

                	newLeafNode(otherlv_21, grammarAccess.getArqStimulusAccess().getCommaKeyword_21());
                
            otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleArqStimulus626); 

                	newLeafNode(otherlv_22, grammarAccess.getArqStimulusAccess().getLatenciesKeyword_22());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:357:1: ( (lv_latencies_23_0= ruleValues ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:358:1: (lv_latencies_23_0= ruleValues )
                    {
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:358:1: (lv_latencies_23_0= ruleValues )
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:359:3: lv_latencies_23_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_23_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleArqStimulus647);
                    lv_latencies_23_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
                    	        }
                           		add(
                           			current, 
                           			"latencies",
                            		lv_latencies_23_0, 
                            		"Values");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:375:3: (otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:375:5: otherlv_24= '|' ( (lv_latencies_25_0= ruleValues ) )
            	    {
            	    otherlv_24=(Token)match(input,24,FOLLOW_24_in_ruleArqStimulus661); 

            	        	newLeafNode(otherlv_24, grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_24_0());
            	        
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:379:1: ( (lv_latencies_25_0= ruleValues ) )
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:380:1: (lv_latencies_25_0= ruleValues )
            	    {
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:380:1: (lv_latencies_25_0= ruleValues )
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:381:3: lv_latencies_25_0= ruleValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_24_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValues_in_ruleArqStimulus682);
            	    lv_latencies_25_0=ruleValues();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"latencies",
            	            		lv_latencies_25_0, 
            	            		"Values");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_26=(Token)match(input,13,FOLLOW_13_in_ruleArqStimulus696); 

                	newLeafNode(otherlv_26, grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_25());
                
            otherlv_27=(Token)match(input,16,FOLLOW_16_in_ruleArqStimulus708); 

                	newLeafNode(otherlv_27, grammarAccess.getArqStimulusAccess().getCommaKeyword_26());
                
            otherlv_28=(Token)match(input,25,FOLLOW_25_in_ruleArqStimulus720); 

                	newLeafNode(otherlv_28, grammarAccess.getArqStimulusAccess().getResponsesKeyword_27());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:409:1: ( (lv_responses_29_0= ruleValues ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:410:1: (lv_responses_29_0= ruleValues )
                    {
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:410:1: (lv_responses_29_0= ruleValues )
                    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:411:3: lv_responses_29_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_28_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleArqStimulus741);
                    lv_responses_29_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
                    	        }
                           		add(
                           			current, 
                           			"responses",
                            		lv_responses_29_0, 
                            		"Values");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:427:3: (otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:427:5: otherlv_30= '|' ( (lv_responses_31_0= ruleValues ) )
            	    {
            	    otherlv_30=(Token)match(input,24,FOLLOW_24_in_ruleArqStimulus755); 

            	        	newLeafNode(otherlv_30, grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_29_0());
            	        
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:431:1: ( (lv_responses_31_0= ruleValues ) )
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:432:1: (lv_responses_31_0= ruleValues )
            	    {
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:432:1: (lv_responses_31_0= ruleValues )
            	    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:433:3: lv_responses_31_0= ruleValues
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_29_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValues_in_ruleArqStimulus776);
            	    lv_responses_31_0=ruleValues();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArqStimulusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"responses",
            	            		lv_responses_31_0, 
            	            		"Values");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_32=(Token)match(input,13,FOLLOW_13_in_ruleArqStimulus790); 

                	newLeafNode(otherlv_32, grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_30());
                
            otherlv_33=(Token)match(input,13,FOLLOW_13_in_ruleArqStimulus802); 

                	newLeafNode(otherlv_33, grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_31());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArqStimulus"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:465:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:466:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:467:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues838);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:474:1: ruleValues returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:477:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:478:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:478:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:478:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:478:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:479:1: (lv_key_0_0= RULE_STRING )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:479:1: (lv_key_0_0= RULE_STRING )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:480:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValues890); 

            			newLeafNode(lv_key_0_0, grammarAccess.getValuesAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValuesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleValues907); 

                	newLeafNode(otherlv_1, grammarAccess.getValuesAccess().getColonKeyword_1());
                
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:500:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:501:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:501:1: (lv_value_2_0= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:502:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValues924); 

            			newLeafNode(lv_value_2_0, grammarAccess.getValuesAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValuesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:526:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:527:2: (iv_ruleDouble= ruleDouble EOF )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:528:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble965);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:535:1: ruleDouble returns [EObject current=null] : (this_INT_0= RULE_INT otherlv_1= '.' this_INT_2= RULE_INT ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token otherlv_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:538:28: ( (this_INT_0= RULE_INT otherlv_1= '.' this_INT_2= RULE_INT ) )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:539:1: (this_INT_0= RULE_INT otherlv_1= '.' this_INT_2= RULE_INT )
            {
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:539:1: (this_INT_0= RULE_INT otherlv_1= '.' this_INT_2= RULE_INT )
            // ../org.xtext.jlog/src-gen/org/xtext/jlog/parser/antlr/internal/InternalJlogDsl.g:539:2: this_INT_0= RULE_INT otherlv_1= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1011); 
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDouble1022); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1033); 
             
                newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJlog_in_entryRuleJlog75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJlog85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleJlog122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJlog139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleJlog156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_ruleJlog177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_ruleJlog198 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleJlog211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_entryRuleArqStimulus247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArqStimulus257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArqStimulus294 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArqStimulus306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArqStimulus323 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus340 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArqStimulus352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArqStimulus369 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus386 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleArqStimulus398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArqStimulus415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleArqStimulus444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArqStimulus461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleArqStimulus490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleArqStimulus511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArqStimulus535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleArqStimulus556 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus568 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleArqStimulus580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArqStimulus597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus614 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleArqStimulus626 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArqStimulus647 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_ruleArqStimulus661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArqStimulus682 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleArqStimulus696 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArqStimulus708 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArqStimulus720 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArqStimulus741 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_ruleArqStimulus755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValues_in_ruleArqStimulus776 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleArqStimulus790 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArqStimulus802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValues890 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValues907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValues924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1011 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDouble1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1033 = new BitSet(new long[]{0x0000000000000002L});

}