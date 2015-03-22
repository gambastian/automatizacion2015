package org.xtext.jlog.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.jlog.services.JlogDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJlogDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Jlog'", "'{'", "'}'", "'ArqStimulus{'", "'stimulusName'", "','", "'minResponseTime'", "'medResponseTime'", "'maxResponseTime'", "'errorPercentage'", "'throughput'", "'threadNumber'", "'latencies{'", "'responses{'", "'|'", "':'", "'.'"
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
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g"; }


     
     	private JlogDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JlogDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleJlog"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:60:1: entryRuleJlog : ruleJlog EOF ;
    public final void entryRuleJlog() throws RecognitionException {
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:61:1: ( ruleJlog EOF )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:62:1: ruleJlog EOF
            {
             before(grammarAccess.getJlogRule()); 
            pushFollow(FOLLOW_ruleJlog_in_entryRuleJlog61);
            ruleJlog();

            state._fsp--;

             after(grammarAccess.getJlogRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJlog68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJlog"


    // $ANTLR start "ruleJlog"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:69:1: ruleJlog : ( ( rule__Jlog__Group__0 ) ) ;
    public final void ruleJlog() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:73:2: ( ( ( rule__Jlog__Group__0 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:74:1: ( ( rule__Jlog__Group__0 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:74:1: ( ( rule__Jlog__Group__0 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:75:1: ( rule__Jlog__Group__0 )
            {
             before(grammarAccess.getJlogAccess().getGroup()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:76:1: ( rule__Jlog__Group__0 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:76:2: rule__Jlog__Group__0
            {
            pushFollow(FOLLOW_rule__Jlog__Group__0_in_ruleJlog94);
            rule__Jlog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJlogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJlog"


    // $ANTLR start "entryRuleArqStimulus"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:88:1: entryRuleArqStimulus : ruleArqStimulus EOF ;
    public final void entryRuleArqStimulus() throws RecognitionException {
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:89:1: ( ruleArqStimulus EOF )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:90:1: ruleArqStimulus EOF
            {
             before(grammarAccess.getArqStimulusRule()); 
            pushFollow(FOLLOW_ruleArqStimulus_in_entryRuleArqStimulus121);
            ruleArqStimulus();

            state._fsp--;

             after(grammarAccess.getArqStimulusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArqStimulus128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArqStimulus"


    // $ANTLR start "ruleArqStimulus"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:97:1: ruleArqStimulus : ( ( rule__ArqStimulus__Group__0 ) ) ;
    public final void ruleArqStimulus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:101:2: ( ( ( rule__ArqStimulus__Group__0 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:102:1: ( ( rule__ArqStimulus__Group__0 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:102:1: ( ( rule__ArqStimulus__Group__0 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:103:1: ( rule__ArqStimulus__Group__0 )
            {
             before(grammarAccess.getArqStimulusAccess().getGroup()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:104:1: ( rule__ArqStimulus__Group__0 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:104:2: rule__ArqStimulus__Group__0
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__0_in_ruleArqStimulus154);
            rule__ArqStimulus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArqStimulus"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:116:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:117:1: ( ruleValues EOF )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:118:1: ruleValues EOF
            {
             before(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues181);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getValuesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:125:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:129:2: ( ( ( rule__Values__Group__0 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:130:1: ( ( rule__Values__Group__0 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:130:1: ( ( rule__Values__Group__0 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:131:1: ( rule__Values__Group__0 )
            {
             before(grammarAccess.getValuesAccess().getGroup()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:132:1: ( rule__Values__Group__0 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:132:2: rule__Values__Group__0
            {
            pushFollow(FOLLOW_rule__Values__Group__0_in_ruleValues214);
            rule__Values__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:144:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:145:1: ( ruleDouble EOF )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:146:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble241);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:153:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:157:2: ( ( ( rule__Double__Group__0 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:158:1: ( ( rule__Double__Group__0 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:158:1: ( ( rule__Double__Group__0 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:159:1: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:160:1: ( rule__Double__Group__0 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:160:2: rule__Double__Group__0
            {
            pushFollow(FOLLOW_rule__Double__Group__0_in_ruleDouble274);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "rule__Jlog__Group__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:174:1: rule__Jlog__Group__0 : rule__Jlog__Group__0__Impl rule__Jlog__Group__1 ;
    public final void rule__Jlog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:178:1: ( rule__Jlog__Group__0__Impl rule__Jlog__Group__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:179:2: rule__Jlog__Group__0__Impl rule__Jlog__Group__1
            {
            pushFollow(FOLLOW_rule__Jlog__Group__0__Impl_in_rule__Jlog__Group__0308);
            rule__Jlog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Jlog__Group__1_in_rule__Jlog__Group__0311);
            rule__Jlog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__0"


    // $ANTLR start "rule__Jlog__Group__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:186:1: rule__Jlog__Group__0__Impl : ( 'Jlog' ) ;
    public final void rule__Jlog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:190:1: ( ( 'Jlog' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:191:1: ( 'Jlog' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:191:1: ( 'Jlog' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:192:1: 'Jlog'
            {
             before(grammarAccess.getJlogAccess().getJlogKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Jlog__Group__0__Impl339); 
             after(grammarAccess.getJlogAccess().getJlogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__0__Impl"


    // $ANTLR start "rule__Jlog__Group__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:205:1: rule__Jlog__Group__1 : rule__Jlog__Group__1__Impl rule__Jlog__Group__2 ;
    public final void rule__Jlog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:209:1: ( rule__Jlog__Group__1__Impl rule__Jlog__Group__2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:210:2: rule__Jlog__Group__1__Impl rule__Jlog__Group__2
            {
            pushFollow(FOLLOW_rule__Jlog__Group__1__Impl_in_rule__Jlog__Group__1370);
            rule__Jlog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Jlog__Group__2_in_rule__Jlog__Group__1373);
            rule__Jlog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__1"


    // $ANTLR start "rule__Jlog__Group__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:217:1: rule__Jlog__Group__1__Impl : ( ( rule__Jlog__NameAssignment_1 ) ) ;
    public final void rule__Jlog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:221:1: ( ( ( rule__Jlog__NameAssignment_1 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:222:1: ( ( rule__Jlog__NameAssignment_1 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:222:1: ( ( rule__Jlog__NameAssignment_1 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:223:1: ( rule__Jlog__NameAssignment_1 )
            {
             before(grammarAccess.getJlogAccess().getNameAssignment_1()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:224:1: ( rule__Jlog__NameAssignment_1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:224:2: rule__Jlog__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Jlog__NameAssignment_1_in_rule__Jlog__Group__1__Impl400);
            rule__Jlog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJlogAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__1__Impl"


    // $ANTLR start "rule__Jlog__Group__2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:234:1: rule__Jlog__Group__2 : rule__Jlog__Group__2__Impl rule__Jlog__Group__3 ;
    public final void rule__Jlog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:238:1: ( rule__Jlog__Group__2__Impl rule__Jlog__Group__3 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:239:2: rule__Jlog__Group__2__Impl rule__Jlog__Group__3
            {
            pushFollow(FOLLOW_rule__Jlog__Group__2__Impl_in_rule__Jlog__Group__2430);
            rule__Jlog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Jlog__Group__3_in_rule__Jlog__Group__2433);
            rule__Jlog__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__2"


    // $ANTLR start "rule__Jlog__Group__2__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:246:1: rule__Jlog__Group__2__Impl : ( '{' ) ;
    public final void rule__Jlog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:250:1: ( ( '{' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:251:1: ( '{' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:251:1: ( '{' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:252:1: '{'
            {
             before(grammarAccess.getJlogAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Jlog__Group__2__Impl461); 
             after(grammarAccess.getJlogAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__2__Impl"


    // $ANTLR start "rule__Jlog__Group__3"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:265:1: rule__Jlog__Group__3 : rule__Jlog__Group__3__Impl rule__Jlog__Group__4 ;
    public final void rule__Jlog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:269:1: ( rule__Jlog__Group__3__Impl rule__Jlog__Group__4 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:270:2: rule__Jlog__Group__3__Impl rule__Jlog__Group__4
            {
            pushFollow(FOLLOW_rule__Jlog__Group__3__Impl_in_rule__Jlog__Group__3492);
            rule__Jlog__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Jlog__Group__4_in_rule__Jlog__Group__3495);
            rule__Jlog__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__3"


    // $ANTLR start "rule__Jlog__Group__3__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:277:1: rule__Jlog__Group__3__Impl : ( ( rule__Jlog__ArquEstimulosAssignment_3 ) ) ;
    public final void rule__Jlog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:281:1: ( ( ( rule__Jlog__ArquEstimulosAssignment_3 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:282:1: ( ( rule__Jlog__ArquEstimulosAssignment_3 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:282:1: ( ( rule__Jlog__ArquEstimulosAssignment_3 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:283:1: ( rule__Jlog__ArquEstimulosAssignment_3 )
            {
             before(grammarAccess.getJlogAccess().getArquEstimulosAssignment_3()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:284:1: ( rule__Jlog__ArquEstimulosAssignment_3 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:284:2: rule__Jlog__ArquEstimulosAssignment_3
            {
            pushFollow(FOLLOW_rule__Jlog__ArquEstimulosAssignment_3_in_rule__Jlog__Group__3__Impl522);
            rule__Jlog__ArquEstimulosAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJlogAccess().getArquEstimulosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__3__Impl"


    // $ANTLR start "rule__Jlog__Group__4"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:294:1: rule__Jlog__Group__4 : rule__Jlog__Group__4__Impl rule__Jlog__Group__5 ;
    public final void rule__Jlog__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:298:1: ( rule__Jlog__Group__4__Impl rule__Jlog__Group__5 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:299:2: rule__Jlog__Group__4__Impl rule__Jlog__Group__5
            {
            pushFollow(FOLLOW_rule__Jlog__Group__4__Impl_in_rule__Jlog__Group__4552);
            rule__Jlog__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Jlog__Group__5_in_rule__Jlog__Group__4555);
            rule__Jlog__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__4"


    // $ANTLR start "rule__Jlog__Group__4__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:306:1: rule__Jlog__Group__4__Impl : ( ( rule__Jlog__ArquEstimulosAssignment_4 )* ) ;
    public final void rule__Jlog__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:310:1: ( ( ( rule__Jlog__ArquEstimulosAssignment_4 )* ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:311:1: ( ( rule__Jlog__ArquEstimulosAssignment_4 )* )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:311:1: ( ( rule__Jlog__ArquEstimulosAssignment_4 )* )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:312:1: ( rule__Jlog__ArquEstimulosAssignment_4 )*
            {
             before(grammarAccess.getJlogAccess().getArquEstimulosAssignment_4()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:313:1: ( rule__Jlog__ArquEstimulosAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:313:2: rule__Jlog__ArquEstimulosAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Jlog__ArquEstimulosAssignment_4_in_rule__Jlog__Group__4__Impl582);
            	    rule__Jlog__ArquEstimulosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getJlogAccess().getArquEstimulosAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__4__Impl"


    // $ANTLR start "rule__Jlog__Group__5"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:323:1: rule__Jlog__Group__5 : rule__Jlog__Group__5__Impl ;
    public final void rule__Jlog__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:327:1: ( rule__Jlog__Group__5__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:328:2: rule__Jlog__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Jlog__Group__5__Impl_in_rule__Jlog__Group__5613);
            rule__Jlog__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__5"


    // $ANTLR start "rule__Jlog__Group__5__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:334:1: rule__Jlog__Group__5__Impl : ( '}' ) ;
    public final void rule__Jlog__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:338:1: ( ( '}' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:339:1: ( '}' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:339:1: ( '}' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:340:1: '}'
            {
             before(grammarAccess.getJlogAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Jlog__Group__5__Impl641); 
             after(grammarAccess.getJlogAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__Group__5__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:365:1: rule__ArqStimulus__Group__0 : rule__ArqStimulus__Group__0__Impl rule__ArqStimulus__Group__1 ;
    public final void rule__ArqStimulus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:369:1: ( rule__ArqStimulus__Group__0__Impl rule__ArqStimulus__Group__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:370:2: rule__ArqStimulus__Group__0__Impl rule__ArqStimulus__Group__1
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__0__Impl_in_rule__ArqStimulus__Group__0684);
            rule__ArqStimulus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__1_in_rule__ArqStimulus__Group__0687);
            rule__ArqStimulus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__0"


    // $ANTLR start "rule__ArqStimulus__Group__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:377:1: rule__ArqStimulus__Group__0__Impl : ( 'ArqStimulus{' ) ;
    public final void rule__ArqStimulus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:381:1: ( ( 'ArqStimulus{' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:382:1: ( 'ArqStimulus{' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:382:1: ( 'ArqStimulus{' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:383:1: 'ArqStimulus{'
            {
             before(grammarAccess.getArqStimulusAccess().getArqStimulusKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ArqStimulus__Group__0__Impl715); 
             after(grammarAccess.getArqStimulusAccess().getArqStimulusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__0__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:396:1: rule__ArqStimulus__Group__1 : rule__ArqStimulus__Group__1__Impl rule__ArqStimulus__Group__2 ;
    public final void rule__ArqStimulus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:400:1: ( rule__ArqStimulus__Group__1__Impl rule__ArqStimulus__Group__2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:401:2: rule__ArqStimulus__Group__1__Impl rule__ArqStimulus__Group__2
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__1__Impl_in_rule__ArqStimulus__Group__1746);
            rule__ArqStimulus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__2_in_rule__ArqStimulus__Group__1749);
            rule__ArqStimulus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__1"


    // $ANTLR start "rule__ArqStimulus__Group__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:408:1: rule__ArqStimulus__Group__1__Impl : ( 'stimulusName' ) ;
    public final void rule__ArqStimulus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:412:1: ( ( 'stimulusName' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:413:1: ( 'stimulusName' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:413:1: ( 'stimulusName' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:414:1: 'stimulusName'
            {
             before(grammarAccess.getArqStimulusAccess().getStimulusNameKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ArqStimulus__Group__1__Impl777); 
             after(grammarAccess.getArqStimulusAccess().getStimulusNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__1__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:427:1: rule__ArqStimulus__Group__2 : rule__ArqStimulus__Group__2__Impl rule__ArqStimulus__Group__3 ;
    public final void rule__ArqStimulus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:431:1: ( rule__ArqStimulus__Group__2__Impl rule__ArqStimulus__Group__3 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:432:2: rule__ArqStimulus__Group__2__Impl rule__ArqStimulus__Group__3
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__2__Impl_in_rule__ArqStimulus__Group__2808);
            rule__ArqStimulus__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__3_in_rule__ArqStimulus__Group__2811);
            rule__ArqStimulus__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__2"


    // $ANTLR start "rule__ArqStimulus__Group__2__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:439:1: rule__ArqStimulus__Group__2__Impl : ( ( rule__ArqStimulus__StimulusNameAssignment_2 ) ) ;
    public final void rule__ArqStimulus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:443:1: ( ( ( rule__ArqStimulus__StimulusNameAssignment_2 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:444:1: ( ( rule__ArqStimulus__StimulusNameAssignment_2 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:444:1: ( ( rule__ArqStimulus__StimulusNameAssignment_2 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:445:1: ( rule__ArqStimulus__StimulusNameAssignment_2 )
            {
             before(grammarAccess.getArqStimulusAccess().getStimulusNameAssignment_2()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:446:1: ( rule__ArqStimulus__StimulusNameAssignment_2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:446:2: rule__ArqStimulus__StimulusNameAssignment_2
            {
            pushFollow(FOLLOW_rule__ArqStimulus__StimulusNameAssignment_2_in_rule__ArqStimulus__Group__2__Impl838);
            rule__ArqStimulus__StimulusNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getStimulusNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__2__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__3"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:456:1: rule__ArqStimulus__Group__3 : rule__ArqStimulus__Group__3__Impl rule__ArqStimulus__Group__4 ;
    public final void rule__ArqStimulus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:460:1: ( rule__ArqStimulus__Group__3__Impl rule__ArqStimulus__Group__4 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:461:2: rule__ArqStimulus__Group__3__Impl rule__ArqStimulus__Group__4
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__3__Impl_in_rule__ArqStimulus__Group__3868);
            rule__ArqStimulus__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__4_in_rule__ArqStimulus__Group__3871);
            rule__ArqStimulus__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__3"


    // $ANTLR start "rule__ArqStimulus__Group__3__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:468:1: rule__ArqStimulus__Group__3__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:472:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:473:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:473:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:474:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__3__Impl899); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__3__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__4"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:487:1: rule__ArqStimulus__Group__4 : rule__ArqStimulus__Group__4__Impl rule__ArqStimulus__Group__5 ;
    public final void rule__ArqStimulus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:491:1: ( rule__ArqStimulus__Group__4__Impl rule__ArqStimulus__Group__5 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:492:2: rule__ArqStimulus__Group__4__Impl rule__ArqStimulus__Group__5
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__4__Impl_in_rule__ArqStimulus__Group__4930);
            rule__ArqStimulus__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__5_in_rule__ArqStimulus__Group__4933);
            rule__ArqStimulus__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__4"


    // $ANTLR start "rule__ArqStimulus__Group__4__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:499:1: rule__ArqStimulus__Group__4__Impl : ( 'minResponseTime' ) ;
    public final void rule__ArqStimulus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:503:1: ( ( 'minResponseTime' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:504:1: ( 'minResponseTime' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:504:1: ( 'minResponseTime' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:505:1: 'minResponseTime'
            {
             before(grammarAccess.getArqStimulusAccess().getMinResponseTimeKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ArqStimulus__Group__4__Impl961); 
             after(grammarAccess.getArqStimulusAccess().getMinResponseTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__4__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__5"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:518:1: rule__ArqStimulus__Group__5 : rule__ArqStimulus__Group__5__Impl rule__ArqStimulus__Group__6 ;
    public final void rule__ArqStimulus__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:522:1: ( rule__ArqStimulus__Group__5__Impl rule__ArqStimulus__Group__6 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:523:2: rule__ArqStimulus__Group__5__Impl rule__ArqStimulus__Group__6
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__5__Impl_in_rule__ArqStimulus__Group__5992);
            rule__ArqStimulus__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__6_in_rule__ArqStimulus__Group__5995);
            rule__ArqStimulus__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__5"


    // $ANTLR start "rule__ArqStimulus__Group__5__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:530:1: rule__ArqStimulus__Group__5__Impl : ( ( rule__ArqStimulus__MinResponseTimeAssignment_5 ) ) ;
    public final void rule__ArqStimulus__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:534:1: ( ( ( rule__ArqStimulus__MinResponseTimeAssignment_5 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:535:1: ( ( rule__ArqStimulus__MinResponseTimeAssignment_5 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:535:1: ( ( rule__ArqStimulus__MinResponseTimeAssignment_5 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:536:1: ( rule__ArqStimulus__MinResponseTimeAssignment_5 )
            {
             before(grammarAccess.getArqStimulusAccess().getMinResponseTimeAssignment_5()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:537:1: ( rule__ArqStimulus__MinResponseTimeAssignment_5 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:537:2: rule__ArqStimulus__MinResponseTimeAssignment_5
            {
            pushFollow(FOLLOW_rule__ArqStimulus__MinResponseTimeAssignment_5_in_rule__ArqStimulus__Group__5__Impl1022);
            rule__ArqStimulus__MinResponseTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getMinResponseTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__5__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__6"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:547:1: rule__ArqStimulus__Group__6 : rule__ArqStimulus__Group__6__Impl rule__ArqStimulus__Group__7 ;
    public final void rule__ArqStimulus__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:551:1: ( rule__ArqStimulus__Group__6__Impl rule__ArqStimulus__Group__7 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:552:2: rule__ArqStimulus__Group__6__Impl rule__ArqStimulus__Group__7
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__6__Impl_in_rule__ArqStimulus__Group__61052);
            rule__ArqStimulus__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__7_in_rule__ArqStimulus__Group__61055);
            rule__ArqStimulus__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__6"


    // $ANTLR start "rule__ArqStimulus__Group__6__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:559:1: rule__ArqStimulus__Group__6__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:563:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:564:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:564:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:565:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__6__Impl1083); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__6__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__7"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:578:1: rule__ArqStimulus__Group__7 : rule__ArqStimulus__Group__7__Impl rule__ArqStimulus__Group__8 ;
    public final void rule__ArqStimulus__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:582:1: ( rule__ArqStimulus__Group__7__Impl rule__ArqStimulus__Group__8 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:583:2: rule__ArqStimulus__Group__7__Impl rule__ArqStimulus__Group__8
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__7__Impl_in_rule__ArqStimulus__Group__71114);
            rule__ArqStimulus__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__8_in_rule__ArqStimulus__Group__71117);
            rule__ArqStimulus__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__7"


    // $ANTLR start "rule__ArqStimulus__Group__7__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:590:1: rule__ArqStimulus__Group__7__Impl : ( 'medResponseTime' ) ;
    public final void rule__ArqStimulus__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:594:1: ( ( 'medResponseTime' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:595:1: ( 'medResponseTime' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:595:1: ( 'medResponseTime' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:596:1: 'medResponseTime'
            {
             before(grammarAccess.getArqStimulusAccess().getMedResponseTimeKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__ArqStimulus__Group__7__Impl1145); 
             after(grammarAccess.getArqStimulusAccess().getMedResponseTimeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__7__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__8"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:609:1: rule__ArqStimulus__Group__8 : rule__ArqStimulus__Group__8__Impl rule__ArqStimulus__Group__9 ;
    public final void rule__ArqStimulus__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:613:1: ( rule__ArqStimulus__Group__8__Impl rule__ArqStimulus__Group__9 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:614:2: rule__ArqStimulus__Group__8__Impl rule__ArqStimulus__Group__9
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__8__Impl_in_rule__ArqStimulus__Group__81176);
            rule__ArqStimulus__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__9_in_rule__ArqStimulus__Group__81179);
            rule__ArqStimulus__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__8"


    // $ANTLR start "rule__ArqStimulus__Group__8__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:621:1: rule__ArqStimulus__Group__8__Impl : ( ( rule__ArqStimulus__MedResponseTimeAssignment_8 ) ) ;
    public final void rule__ArqStimulus__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:625:1: ( ( ( rule__ArqStimulus__MedResponseTimeAssignment_8 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:626:1: ( ( rule__ArqStimulus__MedResponseTimeAssignment_8 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:626:1: ( ( rule__ArqStimulus__MedResponseTimeAssignment_8 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:627:1: ( rule__ArqStimulus__MedResponseTimeAssignment_8 )
            {
             before(grammarAccess.getArqStimulusAccess().getMedResponseTimeAssignment_8()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:628:1: ( rule__ArqStimulus__MedResponseTimeAssignment_8 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:628:2: rule__ArqStimulus__MedResponseTimeAssignment_8
            {
            pushFollow(FOLLOW_rule__ArqStimulus__MedResponseTimeAssignment_8_in_rule__ArqStimulus__Group__8__Impl1206);
            rule__ArqStimulus__MedResponseTimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getMedResponseTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__8__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__9"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:638:1: rule__ArqStimulus__Group__9 : rule__ArqStimulus__Group__9__Impl rule__ArqStimulus__Group__10 ;
    public final void rule__ArqStimulus__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:642:1: ( rule__ArqStimulus__Group__9__Impl rule__ArqStimulus__Group__10 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:643:2: rule__ArqStimulus__Group__9__Impl rule__ArqStimulus__Group__10
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__9__Impl_in_rule__ArqStimulus__Group__91236);
            rule__ArqStimulus__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__10_in_rule__ArqStimulus__Group__91239);
            rule__ArqStimulus__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__9"


    // $ANTLR start "rule__ArqStimulus__Group__9__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:650:1: rule__ArqStimulus__Group__9__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:654:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:655:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:655:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:656:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_9()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__9__Impl1267); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__9__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__10"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:669:1: rule__ArqStimulus__Group__10 : rule__ArqStimulus__Group__10__Impl rule__ArqStimulus__Group__11 ;
    public final void rule__ArqStimulus__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:673:1: ( rule__ArqStimulus__Group__10__Impl rule__ArqStimulus__Group__11 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:674:2: rule__ArqStimulus__Group__10__Impl rule__ArqStimulus__Group__11
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__10__Impl_in_rule__ArqStimulus__Group__101298);
            rule__ArqStimulus__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__11_in_rule__ArqStimulus__Group__101301);
            rule__ArqStimulus__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__10"


    // $ANTLR start "rule__ArqStimulus__Group__10__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:681:1: rule__ArqStimulus__Group__10__Impl : ( 'maxResponseTime' ) ;
    public final void rule__ArqStimulus__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:685:1: ( ( 'maxResponseTime' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:686:1: ( 'maxResponseTime' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:686:1: ( 'maxResponseTime' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:687:1: 'maxResponseTime'
            {
             before(grammarAccess.getArqStimulusAccess().getMaxResponseTimeKeyword_10()); 
            match(input,19,FOLLOW_19_in_rule__ArqStimulus__Group__10__Impl1329); 
             after(grammarAccess.getArqStimulusAccess().getMaxResponseTimeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__10__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__11"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:700:1: rule__ArqStimulus__Group__11 : rule__ArqStimulus__Group__11__Impl rule__ArqStimulus__Group__12 ;
    public final void rule__ArqStimulus__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:704:1: ( rule__ArqStimulus__Group__11__Impl rule__ArqStimulus__Group__12 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:705:2: rule__ArqStimulus__Group__11__Impl rule__ArqStimulus__Group__12
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__11__Impl_in_rule__ArqStimulus__Group__111360);
            rule__ArqStimulus__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__12_in_rule__ArqStimulus__Group__111363);
            rule__ArqStimulus__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__11"


    // $ANTLR start "rule__ArqStimulus__Group__11__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:712:1: rule__ArqStimulus__Group__11__Impl : ( ( rule__ArqStimulus__MaxResponseTimeAssignment_11 ) ) ;
    public final void rule__ArqStimulus__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:716:1: ( ( ( rule__ArqStimulus__MaxResponseTimeAssignment_11 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:717:1: ( ( rule__ArqStimulus__MaxResponseTimeAssignment_11 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:717:1: ( ( rule__ArqStimulus__MaxResponseTimeAssignment_11 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:718:1: ( rule__ArqStimulus__MaxResponseTimeAssignment_11 )
            {
             before(grammarAccess.getArqStimulusAccess().getMaxResponseTimeAssignment_11()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:719:1: ( rule__ArqStimulus__MaxResponseTimeAssignment_11 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:719:2: rule__ArqStimulus__MaxResponseTimeAssignment_11
            {
            pushFollow(FOLLOW_rule__ArqStimulus__MaxResponseTimeAssignment_11_in_rule__ArqStimulus__Group__11__Impl1390);
            rule__ArqStimulus__MaxResponseTimeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getMaxResponseTimeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__11__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__12"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:729:1: rule__ArqStimulus__Group__12 : rule__ArqStimulus__Group__12__Impl rule__ArqStimulus__Group__13 ;
    public final void rule__ArqStimulus__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:733:1: ( rule__ArqStimulus__Group__12__Impl rule__ArqStimulus__Group__13 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:734:2: rule__ArqStimulus__Group__12__Impl rule__ArqStimulus__Group__13
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__12__Impl_in_rule__ArqStimulus__Group__121420);
            rule__ArqStimulus__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__13_in_rule__ArqStimulus__Group__121423);
            rule__ArqStimulus__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__12"


    // $ANTLR start "rule__ArqStimulus__Group__12__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:741:1: rule__ArqStimulus__Group__12__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:745:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:746:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:746:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:747:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_12()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__12__Impl1451); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__12__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__13"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:760:1: rule__ArqStimulus__Group__13 : rule__ArqStimulus__Group__13__Impl rule__ArqStimulus__Group__14 ;
    public final void rule__ArqStimulus__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:764:1: ( rule__ArqStimulus__Group__13__Impl rule__ArqStimulus__Group__14 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:765:2: rule__ArqStimulus__Group__13__Impl rule__ArqStimulus__Group__14
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__13__Impl_in_rule__ArqStimulus__Group__131482);
            rule__ArqStimulus__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__14_in_rule__ArqStimulus__Group__131485);
            rule__ArqStimulus__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__13"


    // $ANTLR start "rule__ArqStimulus__Group__13__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:772:1: rule__ArqStimulus__Group__13__Impl : ( 'errorPercentage' ) ;
    public final void rule__ArqStimulus__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:776:1: ( ( 'errorPercentage' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:777:1: ( 'errorPercentage' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:777:1: ( 'errorPercentage' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:778:1: 'errorPercentage'
            {
             before(grammarAccess.getArqStimulusAccess().getErrorPercentageKeyword_13()); 
            match(input,20,FOLLOW_20_in_rule__ArqStimulus__Group__13__Impl1513); 
             after(grammarAccess.getArqStimulusAccess().getErrorPercentageKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__13__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__14"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:791:1: rule__ArqStimulus__Group__14 : rule__ArqStimulus__Group__14__Impl rule__ArqStimulus__Group__15 ;
    public final void rule__ArqStimulus__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:795:1: ( rule__ArqStimulus__Group__14__Impl rule__ArqStimulus__Group__15 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:796:2: rule__ArqStimulus__Group__14__Impl rule__ArqStimulus__Group__15
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__14__Impl_in_rule__ArqStimulus__Group__141544);
            rule__ArqStimulus__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__15_in_rule__ArqStimulus__Group__141547);
            rule__ArqStimulus__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__14"


    // $ANTLR start "rule__ArqStimulus__Group__14__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:803:1: rule__ArqStimulus__Group__14__Impl : ( ( rule__ArqStimulus__ErrorPercentageAssignment_14 ) ) ;
    public final void rule__ArqStimulus__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:807:1: ( ( ( rule__ArqStimulus__ErrorPercentageAssignment_14 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:808:1: ( ( rule__ArqStimulus__ErrorPercentageAssignment_14 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:808:1: ( ( rule__ArqStimulus__ErrorPercentageAssignment_14 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:809:1: ( rule__ArqStimulus__ErrorPercentageAssignment_14 )
            {
             before(grammarAccess.getArqStimulusAccess().getErrorPercentageAssignment_14()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:810:1: ( rule__ArqStimulus__ErrorPercentageAssignment_14 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:810:2: rule__ArqStimulus__ErrorPercentageAssignment_14
            {
            pushFollow(FOLLOW_rule__ArqStimulus__ErrorPercentageAssignment_14_in_rule__ArqStimulus__Group__14__Impl1574);
            rule__ArqStimulus__ErrorPercentageAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getErrorPercentageAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__14__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__15"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:820:1: rule__ArqStimulus__Group__15 : rule__ArqStimulus__Group__15__Impl rule__ArqStimulus__Group__16 ;
    public final void rule__ArqStimulus__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:824:1: ( rule__ArqStimulus__Group__15__Impl rule__ArqStimulus__Group__16 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:825:2: rule__ArqStimulus__Group__15__Impl rule__ArqStimulus__Group__16
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__15__Impl_in_rule__ArqStimulus__Group__151604);
            rule__ArqStimulus__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__16_in_rule__ArqStimulus__Group__151607);
            rule__ArqStimulus__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__15"


    // $ANTLR start "rule__ArqStimulus__Group__15__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:832:1: rule__ArqStimulus__Group__15__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:836:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:837:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:837:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:838:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_15()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__15__Impl1635); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__15__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__16"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:851:1: rule__ArqStimulus__Group__16 : rule__ArqStimulus__Group__16__Impl rule__ArqStimulus__Group__17 ;
    public final void rule__ArqStimulus__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:855:1: ( rule__ArqStimulus__Group__16__Impl rule__ArqStimulus__Group__17 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:856:2: rule__ArqStimulus__Group__16__Impl rule__ArqStimulus__Group__17
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__16__Impl_in_rule__ArqStimulus__Group__161666);
            rule__ArqStimulus__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__17_in_rule__ArqStimulus__Group__161669);
            rule__ArqStimulus__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__16"


    // $ANTLR start "rule__ArqStimulus__Group__16__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:863:1: rule__ArqStimulus__Group__16__Impl : ( 'throughput' ) ;
    public final void rule__ArqStimulus__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:867:1: ( ( 'throughput' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:868:1: ( 'throughput' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:868:1: ( 'throughput' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:869:1: 'throughput'
            {
             before(grammarAccess.getArqStimulusAccess().getThroughputKeyword_16()); 
            match(input,21,FOLLOW_21_in_rule__ArqStimulus__Group__16__Impl1697); 
             after(grammarAccess.getArqStimulusAccess().getThroughputKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__16__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__17"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:882:1: rule__ArqStimulus__Group__17 : rule__ArqStimulus__Group__17__Impl rule__ArqStimulus__Group__18 ;
    public final void rule__ArqStimulus__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:886:1: ( rule__ArqStimulus__Group__17__Impl rule__ArqStimulus__Group__18 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:887:2: rule__ArqStimulus__Group__17__Impl rule__ArqStimulus__Group__18
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__17__Impl_in_rule__ArqStimulus__Group__171728);
            rule__ArqStimulus__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__18_in_rule__ArqStimulus__Group__171731);
            rule__ArqStimulus__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__17"


    // $ANTLR start "rule__ArqStimulus__Group__17__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:894:1: rule__ArqStimulus__Group__17__Impl : ( ( rule__ArqStimulus__ThroughputAssignment_17 ) ) ;
    public final void rule__ArqStimulus__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:898:1: ( ( ( rule__ArqStimulus__ThroughputAssignment_17 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:899:1: ( ( rule__ArqStimulus__ThroughputAssignment_17 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:899:1: ( ( rule__ArqStimulus__ThroughputAssignment_17 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:900:1: ( rule__ArqStimulus__ThroughputAssignment_17 )
            {
             before(grammarAccess.getArqStimulusAccess().getThroughputAssignment_17()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:901:1: ( rule__ArqStimulus__ThroughputAssignment_17 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:901:2: rule__ArqStimulus__ThroughputAssignment_17
            {
            pushFollow(FOLLOW_rule__ArqStimulus__ThroughputAssignment_17_in_rule__ArqStimulus__Group__17__Impl1758);
            rule__ArqStimulus__ThroughputAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getThroughputAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__17__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__18"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:911:1: rule__ArqStimulus__Group__18 : rule__ArqStimulus__Group__18__Impl rule__ArqStimulus__Group__19 ;
    public final void rule__ArqStimulus__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:915:1: ( rule__ArqStimulus__Group__18__Impl rule__ArqStimulus__Group__19 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:916:2: rule__ArqStimulus__Group__18__Impl rule__ArqStimulus__Group__19
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__18__Impl_in_rule__ArqStimulus__Group__181788);
            rule__ArqStimulus__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__19_in_rule__ArqStimulus__Group__181791);
            rule__ArqStimulus__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__18"


    // $ANTLR start "rule__ArqStimulus__Group__18__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:923:1: rule__ArqStimulus__Group__18__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:927:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:928:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:928:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:929:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_18()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__18__Impl1819); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__18__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__19"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:942:1: rule__ArqStimulus__Group__19 : rule__ArqStimulus__Group__19__Impl rule__ArqStimulus__Group__20 ;
    public final void rule__ArqStimulus__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:946:1: ( rule__ArqStimulus__Group__19__Impl rule__ArqStimulus__Group__20 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:947:2: rule__ArqStimulus__Group__19__Impl rule__ArqStimulus__Group__20
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__19__Impl_in_rule__ArqStimulus__Group__191850);
            rule__ArqStimulus__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__20_in_rule__ArqStimulus__Group__191853);
            rule__ArqStimulus__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__19"


    // $ANTLR start "rule__ArqStimulus__Group__19__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:954:1: rule__ArqStimulus__Group__19__Impl : ( 'threadNumber' ) ;
    public final void rule__ArqStimulus__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:958:1: ( ( 'threadNumber' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:959:1: ( 'threadNumber' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:959:1: ( 'threadNumber' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:960:1: 'threadNumber'
            {
             before(grammarAccess.getArqStimulusAccess().getThreadNumberKeyword_19()); 
            match(input,22,FOLLOW_22_in_rule__ArqStimulus__Group__19__Impl1881); 
             after(grammarAccess.getArqStimulusAccess().getThreadNumberKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__19__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__20"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:973:1: rule__ArqStimulus__Group__20 : rule__ArqStimulus__Group__20__Impl rule__ArqStimulus__Group__21 ;
    public final void rule__ArqStimulus__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:977:1: ( rule__ArqStimulus__Group__20__Impl rule__ArqStimulus__Group__21 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:978:2: rule__ArqStimulus__Group__20__Impl rule__ArqStimulus__Group__21
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__20__Impl_in_rule__ArqStimulus__Group__201912);
            rule__ArqStimulus__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__21_in_rule__ArqStimulus__Group__201915);
            rule__ArqStimulus__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__20"


    // $ANTLR start "rule__ArqStimulus__Group__20__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:985:1: rule__ArqStimulus__Group__20__Impl : ( ( rule__ArqStimulus__ThreadNumberAssignment_20 ) ) ;
    public final void rule__ArqStimulus__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:989:1: ( ( ( rule__ArqStimulus__ThreadNumberAssignment_20 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:990:1: ( ( rule__ArqStimulus__ThreadNumberAssignment_20 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:990:1: ( ( rule__ArqStimulus__ThreadNumberAssignment_20 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:991:1: ( rule__ArqStimulus__ThreadNumberAssignment_20 )
            {
             before(grammarAccess.getArqStimulusAccess().getThreadNumberAssignment_20()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:992:1: ( rule__ArqStimulus__ThreadNumberAssignment_20 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:992:2: rule__ArqStimulus__ThreadNumberAssignment_20
            {
            pushFollow(FOLLOW_rule__ArqStimulus__ThreadNumberAssignment_20_in_rule__ArqStimulus__Group__20__Impl1942);
            rule__ArqStimulus__ThreadNumberAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getThreadNumberAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__20__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__21"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1002:1: rule__ArqStimulus__Group__21 : rule__ArqStimulus__Group__21__Impl rule__ArqStimulus__Group__22 ;
    public final void rule__ArqStimulus__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1006:1: ( rule__ArqStimulus__Group__21__Impl rule__ArqStimulus__Group__22 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1007:2: rule__ArqStimulus__Group__21__Impl rule__ArqStimulus__Group__22
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__21__Impl_in_rule__ArqStimulus__Group__211972);
            rule__ArqStimulus__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__22_in_rule__ArqStimulus__Group__211975);
            rule__ArqStimulus__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__21"


    // $ANTLR start "rule__ArqStimulus__Group__21__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1014:1: rule__ArqStimulus__Group__21__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1018:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1019:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1019:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1020:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_21()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__21__Impl2003); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__21__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__22"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1033:1: rule__ArqStimulus__Group__22 : rule__ArqStimulus__Group__22__Impl rule__ArqStimulus__Group__23 ;
    public final void rule__ArqStimulus__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1037:1: ( rule__ArqStimulus__Group__22__Impl rule__ArqStimulus__Group__23 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1038:2: rule__ArqStimulus__Group__22__Impl rule__ArqStimulus__Group__23
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__22__Impl_in_rule__ArqStimulus__Group__222034);
            rule__ArqStimulus__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__23_in_rule__ArqStimulus__Group__222037);
            rule__ArqStimulus__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__22"


    // $ANTLR start "rule__ArqStimulus__Group__22__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1045:1: rule__ArqStimulus__Group__22__Impl : ( 'latencies{' ) ;
    public final void rule__ArqStimulus__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1049:1: ( ( 'latencies{' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1050:1: ( 'latencies{' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1050:1: ( 'latencies{' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1051:1: 'latencies{'
            {
             before(grammarAccess.getArqStimulusAccess().getLatenciesKeyword_22()); 
            match(input,23,FOLLOW_23_in_rule__ArqStimulus__Group__22__Impl2065); 
             after(grammarAccess.getArqStimulusAccess().getLatenciesKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__22__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__23"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1064:1: rule__ArqStimulus__Group__23 : rule__ArqStimulus__Group__23__Impl rule__ArqStimulus__Group__24 ;
    public final void rule__ArqStimulus__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1068:1: ( rule__ArqStimulus__Group__23__Impl rule__ArqStimulus__Group__24 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1069:2: rule__ArqStimulus__Group__23__Impl rule__ArqStimulus__Group__24
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__23__Impl_in_rule__ArqStimulus__Group__232096);
            rule__ArqStimulus__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__24_in_rule__ArqStimulus__Group__232099);
            rule__ArqStimulus__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__23"


    // $ANTLR start "rule__ArqStimulus__Group__23__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1076:1: rule__ArqStimulus__Group__23__Impl : ( ( rule__ArqStimulus__LatenciesAssignment_23 )? ) ;
    public final void rule__ArqStimulus__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1080:1: ( ( ( rule__ArqStimulus__LatenciesAssignment_23 )? ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1081:1: ( ( rule__ArqStimulus__LatenciesAssignment_23 )? )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1081:1: ( ( rule__ArqStimulus__LatenciesAssignment_23 )? )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1082:1: ( rule__ArqStimulus__LatenciesAssignment_23 )?
            {
             before(grammarAccess.getArqStimulusAccess().getLatenciesAssignment_23()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1083:1: ( rule__ArqStimulus__LatenciesAssignment_23 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1083:2: rule__ArqStimulus__LatenciesAssignment_23
                    {
                    pushFollow(FOLLOW_rule__ArqStimulus__LatenciesAssignment_23_in_rule__ArqStimulus__Group__23__Impl2126);
                    rule__ArqStimulus__LatenciesAssignment_23();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArqStimulusAccess().getLatenciesAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__23__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__24"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1093:1: rule__ArqStimulus__Group__24 : rule__ArqStimulus__Group__24__Impl rule__ArqStimulus__Group__25 ;
    public final void rule__ArqStimulus__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1097:1: ( rule__ArqStimulus__Group__24__Impl rule__ArqStimulus__Group__25 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1098:2: rule__ArqStimulus__Group__24__Impl rule__ArqStimulus__Group__25
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__24__Impl_in_rule__ArqStimulus__Group__242157);
            rule__ArqStimulus__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__25_in_rule__ArqStimulus__Group__242160);
            rule__ArqStimulus__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__24"


    // $ANTLR start "rule__ArqStimulus__Group__24__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1105:1: rule__ArqStimulus__Group__24__Impl : ( ( rule__ArqStimulus__Group_24__0 )* ) ;
    public final void rule__ArqStimulus__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1109:1: ( ( ( rule__ArqStimulus__Group_24__0 )* ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1110:1: ( ( rule__ArqStimulus__Group_24__0 )* )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1110:1: ( ( rule__ArqStimulus__Group_24__0 )* )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1111:1: ( rule__ArqStimulus__Group_24__0 )*
            {
             before(grammarAccess.getArqStimulusAccess().getGroup_24()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1112:1: ( rule__ArqStimulus__Group_24__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1112:2: rule__ArqStimulus__Group_24__0
            	    {
            	    pushFollow(FOLLOW_rule__ArqStimulus__Group_24__0_in_rule__ArqStimulus__Group__24__Impl2187);
            	    rule__ArqStimulus__Group_24__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getArqStimulusAccess().getGroup_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__24__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__25"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1122:1: rule__ArqStimulus__Group__25 : rule__ArqStimulus__Group__25__Impl rule__ArqStimulus__Group__26 ;
    public final void rule__ArqStimulus__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1126:1: ( rule__ArqStimulus__Group__25__Impl rule__ArqStimulus__Group__26 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1127:2: rule__ArqStimulus__Group__25__Impl rule__ArqStimulus__Group__26
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__25__Impl_in_rule__ArqStimulus__Group__252218);
            rule__ArqStimulus__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__26_in_rule__ArqStimulus__Group__252221);
            rule__ArqStimulus__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__25"


    // $ANTLR start "rule__ArqStimulus__Group__25__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1134:1: rule__ArqStimulus__Group__25__Impl : ( '}' ) ;
    public final void rule__ArqStimulus__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1138:1: ( ( '}' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1139:1: ( '}' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1139:1: ( '}' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1140:1: '}'
            {
             before(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_25()); 
            match(input,13,FOLLOW_13_in_rule__ArqStimulus__Group__25__Impl2249); 
             after(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__25__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__26"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1153:1: rule__ArqStimulus__Group__26 : rule__ArqStimulus__Group__26__Impl rule__ArqStimulus__Group__27 ;
    public final void rule__ArqStimulus__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1157:1: ( rule__ArqStimulus__Group__26__Impl rule__ArqStimulus__Group__27 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1158:2: rule__ArqStimulus__Group__26__Impl rule__ArqStimulus__Group__27
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__26__Impl_in_rule__ArqStimulus__Group__262280);
            rule__ArqStimulus__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__27_in_rule__ArqStimulus__Group__262283);
            rule__ArqStimulus__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__26"


    // $ANTLR start "rule__ArqStimulus__Group__26__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1165:1: rule__ArqStimulus__Group__26__Impl : ( ',' ) ;
    public final void rule__ArqStimulus__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1169:1: ( ( ',' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1170:1: ( ',' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1170:1: ( ',' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1171:1: ','
            {
             before(grammarAccess.getArqStimulusAccess().getCommaKeyword_26()); 
            match(input,16,FOLLOW_16_in_rule__ArqStimulus__Group__26__Impl2311); 
             after(grammarAccess.getArqStimulusAccess().getCommaKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__26__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__27"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1184:1: rule__ArqStimulus__Group__27 : rule__ArqStimulus__Group__27__Impl rule__ArqStimulus__Group__28 ;
    public final void rule__ArqStimulus__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1188:1: ( rule__ArqStimulus__Group__27__Impl rule__ArqStimulus__Group__28 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1189:2: rule__ArqStimulus__Group__27__Impl rule__ArqStimulus__Group__28
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__27__Impl_in_rule__ArqStimulus__Group__272342);
            rule__ArqStimulus__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__28_in_rule__ArqStimulus__Group__272345);
            rule__ArqStimulus__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__27"


    // $ANTLR start "rule__ArqStimulus__Group__27__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1196:1: rule__ArqStimulus__Group__27__Impl : ( 'responses{' ) ;
    public final void rule__ArqStimulus__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1200:1: ( ( 'responses{' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1201:1: ( 'responses{' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1201:1: ( 'responses{' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1202:1: 'responses{'
            {
             before(grammarAccess.getArqStimulusAccess().getResponsesKeyword_27()); 
            match(input,24,FOLLOW_24_in_rule__ArqStimulus__Group__27__Impl2373); 
             after(grammarAccess.getArqStimulusAccess().getResponsesKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__27__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__28"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1215:1: rule__ArqStimulus__Group__28 : rule__ArqStimulus__Group__28__Impl rule__ArqStimulus__Group__29 ;
    public final void rule__ArqStimulus__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1219:1: ( rule__ArqStimulus__Group__28__Impl rule__ArqStimulus__Group__29 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1220:2: rule__ArqStimulus__Group__28__Impl rule__ArqStimulus__Group__29
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__28__Impl_in_rule__ArqStimulus__Group__282404);
            rule__ArqStimulus__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__29_in_rule__ArqStimulus__Group__282407);
            rule__ArqStimulus__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__28"


    // $ANTLR start "rule__ArqStimulus__Group__28__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1227:1: rule__ArqStimulus__Group__28__Impl : ( ( rule__ArqStimulus__ResponsesAssignment_28 )? ) ;
    public final void rule__ArqStimulus__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1231:1: ( ( ( rule__ArqStimulus__ResponsesAssignment_28 )? ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1232:1: ( ( rule__ArqStimulus__ResponsesAssignment_28 )? )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1232:1: ( ( rule__ArqStimulus__ResponsesAssignment_28 )? )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1233:1: ( rule__ArqStimulus__ResponsesAssignment_28 )?
            {
             before(grammarAccess.getArqStimulusAccess().getResponsesAssignment_28()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1234:1: ( rule__ArqStimulus__ResponsesAssignment_28 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1234:2: rule__ArqStimulus__ResponsesAssignment_28
                    {
                    pushFollow(FOLLOW_rule__ArqStimulus__ResponsesAssignment_28_in_rule__ArqStimulus__Group__28__Impl2434);
                    rule__ArqStimulus__ResponsesAssignment_28();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArqStimulusAccess().getResponsesAssignment_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__28__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__29"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1244:1: rule__ArqStimulus__Group__29 : rule__ArqStimulus__Group__29__Impl rule__ArqStimulus__Group__30 ;
    public final void rule__ArqStimulus__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1248:1: ( rule__ArqStimulus__Group__29__Impl rule__ArqStimulus__Group__30 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1249:2: rule__ArqStimulus__Group__29__Impl rule__ArqStimulus__Group__30
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__29__Impl_in_rule__ArqStimulus__Group__292465);
            rule__ArqStimulus__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__30_in_rule__ArqStimulus__Group__292468);
            rule__ArqStimulus__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__29"


    // $ANTLR start "rule__ArqStimulus__Group__29__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1256:1: rule__ArqStimulus__Group__29__Impl : ( ( rule__ArqStimulus__Group_29__0 )* ) ;
    public final void rule__ArqStimulus__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1260:1: ( ( ( rule__ArqStimulus__Group_29__0 )* ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1261:1: ( ( rule__ArqStimulus__Group_29__0 )* )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1261:1: ( ( rule__ArqStimulus__Group_29__0 )* )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1262:1: ( rule__ArqStimulus__Group_29__0 )*
            {
             before(grammarAccess.getArqStimulusAccess().getGroup_29()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1263:1: ( rule__ArqStimulus__Group_29__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1263:2: rule__ArqStimulus__Group_29__0
            	    {
            	    pushFollow(FOLLOW_rule__ArqStimulus__Group_29__0_in_rule__ArqStimulus__Group__29__Impl2495);
            	    rule__ArqStimulus__Group_29__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArqStimulusAccess().getGroup_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__29__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__30"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1273:1: rule__ArqStimulus__Group__30 : rule__ArqStimulus__Group__30__Impl rule__ArqStimulus__Group__31 ;
    public final void rule__ArqStimulus__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1277:1: ( rule__ArqStimulus__Group__30__Impl rule__ArqStimulus__Group__31 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1278:2: rule__ArqStimulus__Group__30__Impl rule__ArqStimulus__Group__31
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__30__Impl_in_rule__ArqStimulus__Group__302526);
            rule__ArqStimulus__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group__31_in_rule__ArqStimulus__Group__302529);
            rule__ArqStimulus__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__30"


    // $ANTLR start "rule__ArqStimulus__Group__30__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1285:1: rule__ArqStimulus__Group__30__Impl : ( '}' ) ;
    public final void rule__ArqStimulus__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1289:1: ( ( '}' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1290:1: ( '}' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1290:1: ( '}' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1291:1: '}'
            {
             before(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_30()); 
            match(input,13,FOLLOW_13_in_rule__ArqStimulus__Group__30__Impl2557); 
             after(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__30__Impl"


    // $ANTLR start "rule__ArqStimulus__Group__31"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1304:1: rule__ArqStimulus__Group__31 : rule__ArqStimulus__Group__31__Impl ;
    public final void rule__ArqStimulus__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1308:1: ( rule__ArqStimulus__Group__31__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1309:2: rule__ArqStimulus__Group__31__Impl
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group__31__Impl_in_rule__ArqStimulus__Group__312588);
            rule__ArqStimulus__Group__31__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__31"


    // $ANTLR start "rule__ArqStimulus__Group__31__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1315:1: rule__ArqStimulus__Group__31__Impl : ( '}' ) ;
    public final void rule__ArqStimulus__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1319:1: ( ( '}' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1320:1: ( '}' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1320:1: ( '}' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1321:1: '}'
            {
             before(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_31()); 
            match(input,13,FOLLOW_13_in_rule__ArqStimulus__Group__31__Impl2616); 
             after(grammarAccess.getArqStimulusAccess().getRightCurlyBracketKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group__31__Impl"


    // $ANTLR start "rule__ArqStimulus__Group_24__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1398:1: rule__ArqStimulus__Group_24__0 : rule__ArqStimulus__Group_24__0__Impl rule__ArqStimulus__Group_24__1 ;
    public final void rule__ArqStimulus__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1402:1: ( rule__ArqStimulus__Group_24__0__Impl rule__ArqStimulus__Group_24__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1403:2: rule__ArqStimulus__Group_24__0__Impl rule__ArqStimulus__Group_24__1
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group_24__0__Impl_in_rule__ArqStimulus__Group_24__02711);
            rule__ArqStimulus__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group_24__1_in_rule__ArqStimulus__Group_24__02714);
            rule__ArqStimulus__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_24__0"


    // $ANTLR start "rule__ArqStimulus__Group_24__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1410:1: rule__ArqStimulus__Group_24__0__Impl : ( '|' ) ;
    public final void rule__ArqStimulus__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1414:1: ( ( '|' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1415:1: ( '|' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1415:1: ( '|' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1416:1: '|'
            {
             before(grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_24_0()); 
            match(input,25,FOLLOW_25_in_rule__ArqStimulus__Group_24__0__Impl2742); 
             after(grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_24__0__Impl"


    // $ANTLR start "rule__ArqStimulus__Group_24__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1429:1: rule__ArqStimulus__Group_24__1 : rule__ArqStimulus__Group_24__1__Impl ;
    public final void rule__ArqStimulus__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1433:1: ( rule__ArqStimulus__Group_24__1__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1434:2: rule__ArqStimulus__Group_24__1__Impl
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group_24__1__Impl_in_rule__ArqStimulus__Group_24__12773);
            rule__ArqStimulus__Group_24__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_24__1"


    // $ANTLR start "rule__ArqStimulus__Group_24__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1440:1: rule__ArqStimulus__Group_24__1__Impl : ( ( rule__ArqStimulus__LatenciesAssignment_24_1 ) ) ;
    public final void rule__ArqStimulus__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1444:1: ( ( ( rule__ArqStimulus__LatenciesAssignment_24_1 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1445:1: ( ( rule__ArqStimulus__LatenciesAssignment_24_1 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1445:1: ( ( rule__ArqStimulus__LatenciesAssignment_24_1 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1446:1: ( rule__ArqStimulus__LatenciesAssignment_24_1 )
            {
             before(grammarAccess.getArqStimulusAccess().getLatenciesAssignment_24_1()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1447:1: ( rule__ArqStimulus__LatenciesAssignment_24_1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1447:2: rule__ArqStimulus__LatenciesAssignment_24_1
            {
            pushFollow(FOLLOW_rule__ArqStimulus__LatenciesAssignment_24_1_in_rule__ArqStimulus__Group_24__1__Impl2800);
            rule__ArqStimulus__LatenciesAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getLatenciesAssignment_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_24__1__Impl"


    // $ANTLR start "rule__ArqStimulus__Group_29__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1461:1: rule__ArqStimulus__Group_29__0 : rule__ArqStimulus__Group_29__0__Impl rule__ArqStimulus__Group_29__1 ;
    public final void rule__ArqStimulus__Group_29__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1465:1: ( rule__ArqStimulus__Group_29__0__Impl rule__ArqStimulus__Group_29__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1466:2: rule__ArqStimulus__Group_29__0__Impl rule__ArqStimulus__Group_29__1
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group_29__0__Impl_in_rule__ArqStimulus__Group_29__02834);
            rule__ArqStimulus__Group_29__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArqStimulus__Group_29__1_in_rule__ArqStimulus__Group_29__02837);
            rule__ArqStimulus__Group_29__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_29__0"


    // $ANTLR start "rule__ArqStimulus__Group_29__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1473:1: rule__ArqStimulus__Group_29__0__Impl : ( '|' ) ;
    public final void rule__ArqStimulus__Group_29__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1477:1: ( ( '|' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1478:1: ( '|' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1478:1: ( '|' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1479:1: '|'
            {
             before(grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_29_0()); 
            match(input,25,FOLLOW_25_in_rule__ArqStimulus__Group_29__0__Impl2865); 
             after(grammarAccess.getArqStimulusAccess().getVerticalLineKeyword_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_29__0__Impl"


    // $ANTLR start "rule__ArqStimulus__Group_29__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1492:1: rule__ArqStimulus__Group_29__1 : rule__ArqStimulus__Group_29__1__Impl ;
    public final void rule__ArqStimulus__Group_29__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1496:1: ( rule__ArqStimulus__Group_29__1__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1497:2: rule__ArqStimulus__Group_29__1__Impl
            {
            pushFollow(FOLLOW_rule__ArqStimulus__Group_29__1__Impl_in_rule__ArqStimulus__Group_29__12896);
            rule__ArqStimulus__Group_29__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_29__1"


    // $ANTLR start "rule__ArqStimulus__Group_29__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1503:1: rule__ArqStimulus__Group_29__1__Impl : ( ( rule__ArqStimulus__ResponsesAssignment_29_1 ) ) ;
    public final void rule__ArqStimulus__Group_29__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1507:1: ( ( ( rule__ArqStimulus__ResponsesAssignment_29_1 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1508:1: ( ( rule__ArqStimulus__ResponsesAssignment_29_1 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1508:1: ( ( rule__ArqStimulus__ResponsesAssignment_29_1 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1509:1: ( rule__ArqStimulus__ResponsesAssignment_29_1 )
            {
             before(grammarAccess.getArqStimulusAccess().getResponsesAssignment_29_1()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1510:1: ( rule__ArqStimulus__ResponsesAssignment_29_1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1510:2: rule__ArqStimulus__ResponsesAssignment_29_1
            {
            pushFollow(FOLLOW_rule__ArqStimulus__ResponsesAssignment_29_1_in_rule__ArqStimulus__Group_29__1__Impl2923);
            rule__ArqStimulus__ResponsesAssignment_29_1();

            state._fsp--;


            }

             after(grammarAccess.getArqStimulusAccess().getResponsesAssignment_29_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__Group_29__1__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1524:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1528:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1529:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__02957);
            rule__Values__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Values__Group__1_in_rule__Values__Group__02960);
            rule__Values__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0"


    // $ANTLR start "rule__Values__Group__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1536:1: rule__Values__Group__0__Impl : ( ( rule__Values__KeyAssignment_0 ) ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1540:1: ( ( ( rule__Values__KeyAssignment_0 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1541:1: ( ( rule__Values__KeyAssignment_0 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1541:1: ( ( rule__Values__KeyAssignment_0 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1542:1: ( rule__Values__KeyAssignment_0 )
            {
             before(grammarAccess.getValuesAccess().getKeyAssignment_0()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1543:1: ( rule__Values__KeyAssignment_0 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1543:2: rule__Values__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Values__KeyAssignment_0_in_rule__Values__Group__0__Impl2987);
            rule__Values__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0__Impl"


    // $ANTLR start "rule__Values__Group__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1553:1: rule__Values__Group__1 : rule__Values__Group__1__Impl rule__Values__Group__2 ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1557:1: ( rule__Values__Group__1__Impl rule__Values__Group__2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1558:2: rule__Values__Group__1__Impl rule__Values__Group__2
            {
            pushFollow(FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__13017);
            rule__Values__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Values__Group__2_in_rule__Values__Group__13020);
            rule__Values__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1"


    // $ANTLR start "rule__Values__Group__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1565:1: rule__Values__Group__1__Impl : ( ':' ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1569:1: ( ( ':' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1570:1: ( ':' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1570:1: ( ':' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1571:1: ':'
            {
             before(grammarAccess.getValuesAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Values__Group__1__Impl3048); 
             after(grammarAccess.getValuesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1__Impl"


    // $ANTLR start "rule__Values__Group__2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1584:1: rule__Values__Group__2 : rule__Values__Group__2__Impl ;
    public final void rule__Values__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1588:1: ( rule__Values__Group__2__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1589:2: rule__Values__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Values__Group__2__Impl_in_rule__Values__Group__23079);
            rule__Values__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2"


    // $ANTLR start "rule__Values__Group__2__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1595:1: rule__Values__Group__2__Impl : ( ( rule__Values__ValueAssignment_2 ) ) ;
    public final void rule__Values__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1599:1: ( ( ( rule__Values__ValueAssignment_2 ) ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1600:1: ( ( rule__Values__ValueAssignment_2 ) )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1600:1: ( ( rule__Values__ValueAssignment_2 ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1601:1: ( rule__Values__ValueAssignment_2 )
            {
             before(grammarAccess.getValuesAccess().getValueAssignment_2()); 
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1602:1: ( rule__Values__ValueAssignment_2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1602:2: rule__Values__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Values__ValueAssignment_2_in_rule__Values__Group__2__Impl3106);
            rule__Values__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValuesAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__2__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1618:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1622:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1623:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__03142);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Double__Group__1_in_rule__Double__Group__03145);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1630:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1634:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1635:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1635:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1636:1: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Group__0__Impl3172); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1647:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1651:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1652:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__13201);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Double__Group__2_in_rule__Double__Group__13204);
            rule__Double__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1659:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1663:1: ( ( '.' ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1664:1: ( '.' )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1664:1: ( '.' )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1665:1: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Double__Group__1__Impl3232); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1678:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1682:1: ( rule__Double__Group__2__Impl )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1683:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__23263);
            rule__Double__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1689:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1693:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1694:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1694:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1695:1: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl3290); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Jlog__NameAssignment_1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1713:1: rule__Jlog__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Jlog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1717:1: ( ( RULE_STRING ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1718:1: ( RULE_STRING )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1718:1: ( RULE_STRING )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1719:1: RULE_STRING
            {
             before(grammarAccess.getJlogAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Jlog__NameAssignment_13330); 
             after(grammarAccess.getJlogAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__NameAssignment_1"


    // $ANTLR start "rule__Jlog__ArquEstimulosAssignment_3"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1728:1: rule__Jlog__ArquEstimulosAssignment_3 : ( ruleArqStimulus ) ;
    public final void rule__Jlog__ArquEstimulosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1732:1: ( ( ruleArqStimulus ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1733:1: ( ruleArqStimulus )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1733:1: ( ruleArqStimulus )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1734:1: ruleArqStimulus
            {
             before(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArqStimulus_in_rule__Jlog__ArquEstimulosAssignment_33361);
            ruleArqStimulus();

            state._fsp--;

             after(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__ArquEstimulosAssignment_3"


    // $ANTLR start "rule__Jlog__ArquEstimulosAssignment_4"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1743:1: rule__Jlog__ArquEstimulosAssignment_4 : ( ruleArqStimulus ) ;
    public final void rule__Jlog__ArquEstimulosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1747:1: ( ( ruleArqStimulus ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1748:1: ( ruleArqStimulus )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1748:1: ( ruleArqStimulus )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1749:1: ruleArqStimulus
            {
             before(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArqStimulus_in_rule__Jlog__ArquEstimulosAssignment_43392);
            ruleArqStimulus();

            state._fsp--;

             after(grammarAccess.getJlogAccess().getArquEstimulosArqStimulusParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jlog__ArquEstimulosAssignment_4"


    // $ANTLR start "rule__ArqStimulus__StimulusNameAssignment_2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1758:1: rule__ArqStimulus__StimulusNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ArqStimulus__StimulusNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1762:1: ( ( RULE_STRING ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1763:1: ( RULE_STRING )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1763:1: ( RULE_STRING )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1764:1: RULE_STRING
            {
             before(grammarAccess.getArqStimulusAccess().getStimulusNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArqStimulus__StimulusNameAssignment_23423); 
             after(grammarAccess.getArqStimulusAccess().getStimulusNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__StimulusNameAssignment_2"


    // $ANTLR start "rule__ArqStimulus__MinResponseTimeAssignment_5"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1773:1: rule__ArqStimulus__MinResponseTimeAssignment_5 : ( RULE_INT ) ;
    public final void rule__ArqStimulus__MinResponseTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1777:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1778:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1778:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1779:1: RULE_INT
            {
             before(grammarAccess.getArqStimulusAccess().getMinResponseTimeINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArqStimulus__MinResponseTimeAssignment_53454); 
             after(grammarAccess.getArqStimulusAccess().getMinResponseTimeINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__MinResponseTimeAssignment_5"


    // $ANTLR start "rule__ArqStimulus__MedResponseTimeAssignment_8"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1788:1: rule__ArqStimulus__MedResponseTimeAssignment_8 : ( RULE_INT ) ;
    public final void rule__ArqStimulus__MedResponseTimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1792:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1793:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1793:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1794:1: RULE_INT
            {
             before(grammarAccess.getArqStimulusAccess().getMedResponseTimeINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArqStimulus__MedResponseTimeAssignment_83485); 
             after(grammarAccess.getArqStimulusAccess().getMedResponseTimeINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__MedResponseTimeAssignment_8"


    // $ANTLR start "rule__ArqStimulus__MaxResponseTimeAssignment_11"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1803:1: rule__ArqStimulus__MaxResponseTimeAssignment_11 : ( RULE_INT ) ;
    public final void rule__ArqStimulus__MaxResponseTimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1807:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1808:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1808:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1809:1: RULE_INT
            {
             before(grammarAccess.getArqStimulusAccess().getMaxResponseTimeINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArqStimulus__MaxResponseTimeAssignment_113516); 
             after(grammarAccess.getArqStimulusAccess().getMaxResponseTimeINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__MaxResponseTimeAssignment_11"


    // $ANTLR start "rule__ArqStimulus__ErrorPercentageAssignment_14"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1818:1: rule__ArqStimulus__ErrorPercentageAssignment_14 : ( ruleDouble ) ;
    public final void rule__ArqStimulus__ErrorPercentageAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1822:1: ( ( ruleDouble ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1823:1: ( ruleDouble )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1823:1: ( ruleDouble )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1824:1: ruleDouble
            {
             before(grammarAccess.getArqStimulusAccess().getErrorPercentageDoubleParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__ArqStimulus__ErrorPercentageAssignment_143547);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getErrorPercentageDoubleParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__ErrorPercentageAssignment_14"


    // $ANTLR start "rule__ArqStimulus__ThroughputAssignment_17"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1833:1: rule__ArqStimulus__ThroughputAssignment_17 : ( ruleDouble ) ;
    public final void rule__ArqStimulus__ThroughputAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1837:1: ( ( ruleDouble ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1838:1: ( ruleDouble )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1838:1: ( ruleDouble )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1839:1: ruleDouble
            {
             before(grammarAccess.getArqStimulusAccess().getThroughputDoubleParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleDouble_in_rule__ArqStimulus__ThroughputAssignment_173578);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getThroughputDoubleParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__ThroughputAssignment_17"


    // $ANTLR start "rule__ArqStimulus__ThreadNumberAssignment_20"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1848:1: rule__ArqStimulus__ThreadNumberAssignment_20 : ( RULE_INT ) ;
    public final void rule__ArqStimulus__ThreadNumberAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1852:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1853:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1853:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1854:1: RULE_INT
            {
             before(grammarAccess.getArqStimulusAccess().getThreadNumberINTTerminalRuleCall_20_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArqStimulus__ThreadNumberAssignment_203609); 
             after(grammarAccess.getArqStimulusAccess().getThreadNumberINTTerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__ThreadNumberAssignment_20"


    // $ANTLR start "rule__ArqStimulus__LatenciesAssignment_23"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1863:1: rule__ArqStimulus__LatenciesAssignment_23 : ( ruleValues ) ;
    public final void rule__ArqStimulus__LatenciesAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1867:1: ( ( ruleValues ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1868:1: ( ruleValues )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1868:1: ( ruleValues )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1869:1: ruleValues
            {
             before(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_23_0()); 
            pushFollow(FOLLOW_ruleValues_in_rule__ArqStimulus__LatenciesAssignment_233640);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__LatenciesAssignment_23"


    // $ANTLR start "rule__ArqStimulus__LatenciesAssignment_24_1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1878:1: rule__ArqStimulus__LatenciesAssignment_24_1 : ( ruleValues ) ;
    public final void rule__ArqStimulus__LatenciesAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1882:1: ( ( ruleValues ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1883:1: ( ruleValues )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1883:1: ( ruleValues )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1884:1: ruleValues
            {
             before(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_24_1_0()); 
            pushFollow(FOLLOW_ruleValues_in_rule__ArqStimulus__LatenciesAssignment_24_13671);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getLatenciesValuesParserRuleCall_24_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__LatenciesAssignment_24_1"


    // $ANTLR start "rule__ArqStimulus__ResponsesAssignment_28"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1893:1: rule__ArqStimulus__ResponsesAssignment_28 : ( ruleValues ) ;
    public final void rule__ArqStimulus__ResponsesAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1897:1: ( ( ruleValues ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1898:1: ( ruleValues )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1898:1: ( ruleValues )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1899:1: ruleValues
            {
             before(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_28_0()); 
            pushFollow(FOLLOW_ruleValues_in_rule__ArqStimulus__ResponsesAssignment_283702);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__ResponsesAssignment_28"


    // $ANTLR start "rule__ArqStimulus__ResponsesAssignment_29_1"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1908:1: rule__ArqStimulus__ResponsesAssignment_29_1 : ( ruleValues ) ;
    public final void rule__ArqStimulus__ResponsesAssignment_29_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1912:1: ( ( ruleValues ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1913:1: ( ruleValues )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1913:1: ( ruleValues )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1914:1: ruleValues
            {
             before(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_29_1_0()); 
            pushFollow(FOLLOW_ruleValues_in_rule__ArqStimulus__ResponsesAssignment_29_13733);
            ruleValues();

            state._fsp--;

             after(grammarAccess.getArqStimulusAccess().getResponsesValuesParserRuleCall_29_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArqStimulus__ResponsesAssignment_29_1"


    // $ANTLR start "rule__Values__KeyAssignment_0"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1923:1: rule__Values__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Values__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1927:1: ( ( RULE_STRING ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1928:1: ( RULE_STRING )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1928:1: ( RULE_STRING )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1929:1: RULE_STRING
            {
             before(grammarAccess.getValuesAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Values__KeyAssignment_03764); 
             after(grammarAccess.getValuesAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__KeyAssignment_0"


    // $ANTLR start "rule__Values__ValueAssignment_2"
    // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1938:1: rule__Values__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Values__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1942:1: ( ( RULE_INT ) )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1943:1: ( RULE_INT )
            {
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1943:1: ( RULE_INT )
            // ../org.xtext.jlog.ui/src-gen/org/xtext/jlog/ui/contentassist/antlr/internal/InternalJlogDsl.g:1944:1: RULE_INT
            {
             before(grammarAccess.getValuesAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Values__ValueAssignment_23795); 
             after(grammarAccess.getValuesAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJlog_in_entryRuleJlog61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJlog68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__0_in_ruleJlog94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_entryRuleArqStimulus121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArqStimulus128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__0_in_ruleArqStimulus154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0_in_ruleValues214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0_in_ruleDouble274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__0__Impl_in_rule__Jlog__Group__0308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Jlog__Group__1_in_rule__Jlog__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Jlog__Group__0__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__1__Impl_in_rule__Jlog__Group__1370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Jlog__Group__2_in_rule__Jlog__Group__1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__NameAssignment_1_in_rule__Jlog__Group__1__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__2__Impl_in_rule__Jlog__Group__2430 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Jlog__Group__3_in_rule__Jlog__Group__2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Jlog__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__3__Impl_in_rule__Jlog__Group__3492 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Jlog__Group__4_in_rule__Jlog__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__ArquEstimulosAssignment_3_in_rule__Jlog__Group__3__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__4__Impl_in_rule__Jlog__Group__4552 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Jlog__Group__5_in_rule__Jlog__Group__4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jlog__ArquEstimulosAssignment_4_in_rule__Jlog__Group__4__Impl582 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Jlog__Group__5__Impl_in_rule__Jlog__Group__5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Jlog__Group__5__Impl641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__0__Impl_in_rule__ArqStimulus__Group__0684 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__1_in_rule__ArqStimulus__Group__0687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArqStimulus__Group__0__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__1__Impl_in_rule__ArqStimulus__Group__1746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__2_in_rule__ArqStimulus__Group__1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArqStimulus__Group__1__Impl777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__2__Impl_in_rule__ArqStimulus__Group__2808 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__3_in_rule__ArqStimulus__Group__2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__StimulusNameAssignment_2_in_rule__ArqStimulus__Group__2__Impl838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__3__Impl_in_rule__ArqStimulus__Group__3868 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__4_in_rule__ArqStimulus__Group__3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__3__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__4__Impl_in_rule__ArqStimulus__Group__4930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__5_in_rule__ArqStimulus__Group__4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ArqStimulus__Group__4__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__5__Impl_in_rule__ArqStimulus__Group__5992 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__6_in_rule__ArqStimulus__Group__5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__MinResponseTimeAssignment_5_in_rule__ArqStimulus__Group__5__Impl1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__6__Impl_in_rule__ArqStimulus__Group__61052 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__7_in_rule__ArqStimulus__Group__61055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__6__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__7__Impl_in_rule__ArqStimulus__Group__71114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__8_in_rule__ArqStimulus__Group__71117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ArqStimulus__Group__7__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__8__Impl_in_rule__ArqStimulus__Group__81176 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__9_in_rule__ArqStimulus__Group__81179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__MedResponseTimeAssignment_8_in_rule__ArqStimulus__Group__8__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__9__Impl_in_rule__ArqStimulus__Group__91236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__10_in_rule__ArqStimulus__Group__91239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__9__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__10__Impl_in_rule__ArqStimulus__Group__101298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__11_in_rule__ArqStimulus__Group__101301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ArqStimulus__Group__10__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__11__Impl_in_rule__ArqStimulus__Group__111360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__12_in_rule__ArqStimulus__Group__111363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__MaxResponseTimeAssignment_11_in_rule__ArqStimulus__Group__11__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__12__Impl_in_rule__ArqStimulus__Group__121420 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__13_in_rule__ArqStimulus__Group__121423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__12__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__13__Impl_in_rule__ArqStimulus__Group__131482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__14_in_rule__ArqStimulus__Group__131485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ArqStimulus__Group__13__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__14__Impl_in_rule__ArqStimulus__Group__141544 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__15_in_rule__ArqStimulus__Group__141547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__ErrorPercentageAssignment_14_in_rule__ArqStimulus__Group__14__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__15__Impl_in_rule__ArqStimulus__Group__151604 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__16_in_rule__ArqStimulus__Group__151607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__15__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__16__Impl_in_rule__ArqStimulus__Group__161666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__17_in_rule__ArqStimulus__Group__161669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArqStimulus__Group__16__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__17__Impl_in_rule__ArqStimulus__Group__171728 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__18_in_rule__ArqStimulus__Group__171731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__ThroughputAssignment_17_in_rule__ArqStimulus__Group__17__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__18__Impl_in_rule__ArqStimulus__Group__181788 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__19_in_rule__ArqStimulus__Group__181791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__18__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__19__Impl_in_rule__ArqStimulus__Group__191850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__20_in_rule__ArqStimulus__Group__191853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArqStimulus__Group__19__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__20__Impl_in_rule__ArqStimulus__Group__201912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__21_in_rule__ArqStimulus__Group__201915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__ThreadNumberAssignment_20_in_rule__ArqStimulus__Group__20__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__21__Impl_in_rule__ArqStimulus__Group__211972 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__22_in_rule__ArqStimulus__Group__211975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__21__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__22__Impl_in_rule__ArqStimulus__Group__222034 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__23_in_rule__ArqStimulus__Group__222037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArqStimulus__Group__22__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__23__Impl_in_rule__ArqStimulus__Group__232096 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__24_in_rule__ArqStimulus__Group__232099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__LatenciesAssignment_23_in_rule__ArqStimulus__Group__23__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__24__Impl_in_rule__ArqStimulus__Group__242157 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__25_in_rule__ArqStimulus__Group__242160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_24__0_in_rule__ArqStimulus__Group__24__Impl2187 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__25__Impl_in_rule__ArqStimulus__Group__252218 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__26_in_rule__ArqStimulus__Group__252221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArqStimulus__Group__25__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__26__Impl_in_rule__ArqStimulus__Group__262280 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__27_in_rule__ArqStimulus__Group__262283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArqStimulus__Group__26__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__27__Impl_in_rule__ArqStimulus__Group__272342 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__28_in_rule__ArqStimulus__Group__272345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArqStimulus__Group__27__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__28__Impl_in_rule__ArqStimulus__Group__282404 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__29_in_rule__ArqStimulus__Group__282407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__ResponsesAssignment_28_in_rule__ArqStimulus__Group__28__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__29__Impl_in_rule__ArqStimulus__Group__292465 = new BitSet(new long[]{0x0000000002002020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__30_in_rule__ArqStimulus__Group__292468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_29__0_in_rule__ArqStimulus__Group__29__Impl2495 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__30__Impl_in_rule__ArqStimulus__Group__302526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__31_in_rule__ArqStimulus__Group__302529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArqStimulus__Group__30__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group__31__Impl_in_rule__ArqStimulus__Group__312588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArqStimulus__Group__31__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_24__0__Impl_in_rule__ArqStimulus__Group_24__02711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_24__1_in_rule__ArqStimulus__Group_24__02714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArqStimulus__Group_24__0__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_24__1__Impl_in_rule__ArqStimulus__Group_24__12773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__LatenciesAssignment_24_1_in_rule__ArqStimulus__Group_24__1__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_29__0__Impl_in_rule__ArqStimulus__Group_29__02834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_29__1_in_rule__ArqStimulus__Group_29__02837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArqStimulus__Group_29__0__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__Group_29__1__Impl_in_rule__ArqStimulus__Group_29__12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArqStimulus__ResponsesAssignment_29_1_in_rule__ArqStimulus__Group_29__1__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__0__Impl_in_rule__Values__Group__02957 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Values__Group__1_in_rule__Values__Group__02960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__KeyAssignment_0_in_rule__Values__Group__0__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__1__Impl_in_rule__Values__Group__13017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Values__Group__2_in_rule__Values__Group__13020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Values__Group__1__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__Group__2__Impl_in_rule__Values__Group__23079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Values__ValueAssignment_2_in_rule__Values__Group__2__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__0__Impl_in_rule__Double__Group__03142 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Double__Group__1_in_rule__Double__Group__03145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Group__0__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__1__Impl_in_rule__Double__Group__13201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Double__Group__2_in_rule__Double__Group__13204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Double__Group__1__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Double__Group__2__Impl_in_rule__Double__Group__23263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Double__Group__2__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Jlog__NameAssignment_13330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_rule__Jlog__ArquEstimulosAssignment_33361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArqStimulus_in_rule__Jlog__ArquEstimulosAssignment_43392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArqStimulus__StimulusNameAssignment_23423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArqStimulus__MinResponseTimeAssignment_53454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArqStimulus__MedResponseTimeAssignment_83485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArqStimulus__MaxResponseTimeAssignment_113516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__ArqStimulus__ErrorPercentageAssignment_143547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_rule__ArqStimulus__ThroughputAssignment_173578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArqStimulus__ThreadNumberAssignment_203609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__ArqStimulus__LatenciesAssignment_233640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__ArqStimulus__LatenciesAssignment_24_13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__ArqStimulus__ResponsesAssignment_283702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_rule__ArqStimulus__ResponsesAssignment_29_13733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Values__KeyAssignment_03764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Values__ValueAssignment_23795 = new BitSet(new long[]{0x0000000000000002L});

}