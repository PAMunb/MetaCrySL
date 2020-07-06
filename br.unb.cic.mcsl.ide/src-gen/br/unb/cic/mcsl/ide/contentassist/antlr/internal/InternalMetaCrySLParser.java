package br.unb.cic.mcsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.unb.cic.mcsl.services.MetaCrySLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMetaCrySLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ABSTRACT'", "'SPEC'", "'OBJECTS'", "':'", "';'", "'EVENTS'", "'='", "':='", "'|'", "'('", "')'", "','", "'ORDER'", "'?'", "'*'", "'+'", "'['", "']'", "'=>'", "'<'", "'>'", "'.'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMetaCrySLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetaCrySLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetaCrySLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMetaCrySL.g"; }


    	private MetaCrySLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MetaCrySLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMetaCrySL.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:55:1: ( ruleModel EOF )
            // InternalMetaCrySL.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMetaCrySL.g:63:1: ruleModel : ( ( rule__Model__MetaCrySLAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:67:2: ( ( ( rule__Model__MetaCrySLAssignment ) ) )
            // InternalMetaCrySL.g:68:2: ( ( rule__Model__MetaCrySLAssignment ) )
            {
            // InternalMetaCrySL.g:68:2: ( ( rule__Model__MetaCrySLAssignment ) )
            // InternalMetaCrySL.g:69:3: ( rule__Model__MetaCrySLAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetaCrySLAssignment()); 
            }
            // InternalMetaCrySL.g:70:3: ( rule__Model__MetaCrySLAssignment )
            // InternalMetaCrySL.g:70:4: rule__Model__MetaCrySLAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__MetaCrySLAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetaCrySLAssignment()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpec"
    // InternalMetaCrySL.g:79:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:80:1: ( ruleSpec EOF )
            // InternalMetaCrySL.g:81:1: ruleSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalMetaCrySL.g:88:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:92:2: ( ( ( rule__Spec__Group__0 ) ) )
            // InternalMetaCrySL.g:93:2: ( ( rule__Spec__Group__0 ) )
            {
            // InternalMetaCrySL.g:93:2: ( ( rule__Spec__Group__0 ) )
            // InternalMetaCrySL.g:94:3: ( rule__Spec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:95:3: ( rule__Spec__Group__0 )
            // InternalMetaCrySL.g:95:4: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleObjectSpec"
    // InternalMetaCrySL.g:104:1: entryRuleObjectSpec : ruleObjectSpec EOF ;
    public final void entryRuleObjectSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:105:1: ( ruleObjectSpec EOF )
            // InternalMetaCrySL.g:106:1: ruleObjectSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleObjectSpec"


    // $ANTLR start "ruleObjectSpec"
    // InternalMetaCrySL.g:113:1: ruleObjectSpec : ( ( rule__ObjectSpec__Group__0 ) ) ;
    public final void ruleObjectSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:117:2: ( ( ( rule__ObjectSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:118:2: ( ( rule__ObjectSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:118:2: ( ( rule__ObjectSpec__Group__0 ) )
            // InternalMetaCrySL.g:119:3: ( rule__ObjectSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:120:3: ( rule__ObjectSpec__Group__0 )
            // InternalMetaCrySL.g:120:4: rule__ObjectSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleObjectSpec"


    // $ANTLR start "entryRuleObject"
    // InternalMetaCrySL.g:129:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:130:1: ( ruleObject EOF )
            // InternalMetaCrySL.g:131:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalMetaCrySL.g:138:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:142:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalMetaCrySL.g:143:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalMetaCrySL.g:143:2: ( ( rule__Object__Group__0 ) )
            // InternalMetaCrySL.g:144:3: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:145:3: ( rule__Object__Group__0 )
            // InternalMetaCrySL.g:145:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleEventSpec"
    // InternalMetaCrySL.g:154:1: entryRuleEventSpec : ruleEventSpec EOF ;
    public final void entryRuleEventSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:155:1: ( ruleEventSpec EOF )
            // InternalMetaCrySL.g:156:1: ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventSpec"


    // $ANTLR start "ruleEventSpec"
    // InternalMetaCrySL.g:163:1: ruleEventSpec : ( ( rule__EventSpec__Group__0 ) ) ;
    public final void ruleEventSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:167:2: ( ( ( rule__EventSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:168:2: ( ( rule__EventSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:168:2: ( ( rule__EventSpec__Group__0 ) )
            // InternalMetaCrySL.g:169:3: ( rule__EventSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:170:3: ( rule__EventSpec__Group__0 )
            // InternalMetaCrySL.g:170:4: rule__EventSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEventSpec"


    // $ANTLR start "entryRuleEvent"
    // InternalMetaCrySL.g:179:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:180:1: ( ruleEvent EOF )
            // InternalMetaCrySL.g:181:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMetaCrySL.g:188:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:192:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMetaCrySL.g:193:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMetaCrySL.g:193:2: ( ( rule__Event__Alternatives ) )
            // InternalMetaCrySL.g:194:3: ( rule__Event__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:195:3: ( rule__Event__Alternatives )
            // InternalMetaCrySL.g:195:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAggregateList"
    // InternalMetaCrySL.g:204:1: entryRuleAggregateList : ruleAggregateList EOF ;
    public final void entryRuleAggregateList() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:205:1: ( ruleAggregateList EOF )
            // InternalMetaCrySL.g:206:1: ruleAggregateList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAggregateList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAggregateList"


    // $ANTLR start "ruleAggregateList"
    // InternalMetaCrySL.g:213:1: ruleAggregateList : ( ( rule__AggregateList__Group__0 ) ) ;
    public final void ruleAggregateList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:217:2: ( ( ( rule__AggregateList__Group__0 ) ) )
            // InternalMetaCrySL.g:218:2: ( ( rule__AggregateList__Group__0 ) )
            {
            // InternalMetaCrySL.g:218:2: ( ( rule__AggregateList__Group__0 ) )
            // InternalMetaCrySL.g:219:3: ( rule__AggregateList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:220:3: ( rule__AggregateList__Group__0 )
            // InternalMetaCrySL.g:220:4: rule__AggregateList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregateList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAggregateList"


    // $ANTLR start "entryRuleMethodDef"
    // InternalMetaCrySL.g:229:1: entryRuleMethodDef : ruleMethodDef EOF ;
    public final void entryRuleMethodDef() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:230:1: ( ruleMethodDef EOF )
            // InternalMetaCrySL.g:231:1: ruleMethodDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodDef"


    // $ANTLR start "ruleMethodDef"
    // InternalMetaCrySL.g:238:1: ruleMethodDef : ( ( rule__MethodDef__Group__0 ) ) ;
    public final void ruleMethodDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:242:2: ( ( ( rule__MethodDef__Group__0 ) ) )
            // InternalMetaCrySL.g:243:2: ( ( rule__MethodDef__Group__0 ) )
            {
            // InternalMetaCrySL.g:243:2: ( ( rule__MethodDef__Group__0 ) )
            // InternalMetaCrySL.g:244:3: ( rule__MethodDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:245:3: ( rule__MethodDef__Group__0 )
            // InternalMetaCrySL.g:245:4: rule__MethodDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMethodDef"


    // $ANTLR start "entryRuleFormalArgs"
    // InternalMetaCrySL.g:254:1: entryRuleFormalArgs : ruleFormalArgs EOF ;
    public final void entryRuleFormalArgs() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:255:1: ( ruleFormalArgs EOF )
            // InternalMetaCrySL.g:256:1: ruleFormalArgs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFormalArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFormalArgs"


    // $ANTLR start "ruleFormalArgs"
    // InternalMetaCrySL.g:263:1: ruleFormalArgs : ( ( rule__FormalArgs__Group__0 ) ) ;
    public final void ruleFormalArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:267:2: ( ( ( rule__FormalArgs__Group__0 ) ) )
            // InternalMetaCrySL.g:268:2: ( ( rule__FormalArgs__Group__0 ) )
            {
            // InternalMetaCrySL.g:268:2: ( ( rule__FormalArgs__Group__0 ) )
            // InternalMetaCrySL.g:269:3: ( rule__FormalArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:270:3: ( rule__FormalArgs__Group__0 )
            // InternalMetaCrySL.g:270:4: rule__FormalArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormalArgs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFormalArgs"


    // $ANTLR start "entryRuleOrderSpec"
    // InternalMetaCrySL.g:279:1: entryRuleOrderSpec : ruleOrderSpec EOF ;
    public final void entryRuleOrderSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:280:1: ( ruleOrderSpec EOF )
            // InternalMetaCrySL.g:281:1: ruleOrderSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrderSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrderSpec"


    // $ANTLR start "ruleOrderSpec"
    // InternalMetaCrySL.g:288:1: ruleOrderSpec : ( ( rule__OrderSpec__Group__0 ) ) ;
    public final void ruleOrderSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:292:2: ( ( ( rule__OrderSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:293:2: ( ( rule__OrderSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:293:2: ( ( rule__OrderSpec__Group__0 ) )
            // InternalMetaCrySL.g:294:3: ( rule__OrderSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:295:3: ( rule__OrderSpec__Group__0 )
            // InternalMetaCrySL.g:295:4: rule__OrderSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrderSpec"


    // $ANTLR start "entryRuleEventExp"
    // InternalMetaCrySL.g:304:1: entryRuleEventExp : ruleEventExp EOF ;
    public final void entryRuleEventExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:305:1: ( ruleEventExp EOF )
            // InternalMetaCrySL.g:306:1: ruleEventExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventExp"


    // $ANTLR start "ruleEventExp"
    // InternalMetaCrySL.g:313:1: ruleEventExp : ( ( rule__EventExp__Alternatives ) ) ;
    public final void ruleEventExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:317:2: ( ( ( rule__EventExp__Alternatives ) ) )
            // InternalMetaCrySL.g:318:2: ( ( rule__EventExp__Alternatives ) )
            {
            // InternalMetaCrySL.g:318:2: ( ( rule__EventExp__Alternatives ) )
            // InternalMetaCrySL.g:319:3: ( rule__EventExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:320:3: ( rule__EventExp__Alternatives )
            // InternalMetaCrySL.g:320:4: rule__EventExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleEventExp"


    // $ANTLR start "entryRuleChoiceExp"
    // InternalMetaCrySL.g:329:1: entryRuleChoiceExp : ruleChoiceExp EOF ;
    public final void entryRuleChoiceExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:330:1: ( ruleChoiceExp EOF )
            // InternalMetaCrySL.g:331:1: ruleChoiceExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleChoiceExp"


    // $ANTLR start "ruleChoiceExp"
    // InternalMetaCrySL.g:338:1: ruleChoiceExp : ( ( rule__ChoiceExp__Group__0 ) ) ;
    public final void ruleChoiceExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:342:2: ( ( ( rule__ChoiceExp__Group__0 ) ) )
            // InternalMetaCrySL.g:343:2: ( ( rule__ChoiceExp__Group__0 ) )
            {
            // InternalMetaCrySL.g:343:2: ( ( rule__ChoiceExp__Group__0 ) )
            // InternalMetaCrySL.g:344:3: ( rule__ChoiceExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:345:3: ( rule__ChoiceExp__Group__0 )
            // InternalMetaCrySL.g:345:4: rule__ChoiceExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleChoiceExp"


    // $ANTLR start "entryRuleSequenceExp"
    // InternalMetaCrySL.g:354:1: entryRuleSequenceExp : ruleSequenceExp EOF ;
    public final void entryRuleSequenceExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:355:1: ( ruleSequenceExp EOF )
            // InternalMetaCrySL.g:356:1: ruleSequenceExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSequenceExp"


    // $ANTLR start "ruleSequenceExp"
    // InternalMetaCrySL.g:363:1: ruleSequenceExp : ( ( rule__SequenceExp__Group__0 ) ) ;
    public final void ruleSequenceExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:367:2: ( ( ( rule__SequenceExp__Group__0 ) ) )
            // InternalMetaCrySL.g:368:2: ( ( rule__SequenceExp__Group__0 ) )
            {
            // InternalMetaCrySL.g:368:2: ( ( rule__SequenceExp__Group__0 ) )
            // InternalMetaCrySL.g:369:3: ( rule__SequenceExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:370:3: ( rule__SequenceExp__Group__0 )
            // InternalMetaCrySL.g:370:4: rule__SequenceExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSequenceExp"


    // $ANTLR start "entryRulePrimaryExp"
    // InternalMetaCrySL.g:379:1: entryRulePrimaryExp : rulePrimaryExp EOF ;
    public final void entryRulePrimaryExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:380:1: ( rulePrimaryExp EOF )
            // InternalMetaCrySL.g:381:1: rulePrimaryExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExp"


    // $ANTLR start "rulePrimaryExp"
    // InternalMetaCrySL.g:388:1: rulePrimaryExp : ( ( rule__PrimaryExp__Alternatives ) ) ;
    public final void rulePrimaryExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:392:2: ( ( ( rule__PrimaryExp__Alternatives ) ) )
            // InternalMetaCrySL.g:393:2: ( ( rule__PrimaryExp__Alternatives ) )
            {
            // InternalMetaCrySL.g:393:2: ( ( rule__PrimaryExp__Alternatives ) )
            // InternalMetaCrySL.g:394:3: ( rule__PrimaryExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:395:3: ( rule__PrimaryExp__Alternatives )
            // InternalMetaCrySL.g:395:4: rule__PrimaryExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExp"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalMetaCrySL.g:404:1: entryRuleJvmTypeReference : ruleJvmTypeReference EOF ;
    public final void entryRuleJvmTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:405:1: ( ruleJvmTypeReference EOF )
            // InternalMetaCrySL.g:406:1: ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalMetaCrySL.g:413:1: ruleJvmTypeReference : ( ( rule__JvmTypeReference__Alternatives ) ) ;
    public final void ruleJvmTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:417:2: ( ( ( rule__JvmTypeReference__Alternatives ) ) )
            // InternalMetaCrySL.g:418:2: ( ( rule__JvmTypeReference__Alternatives ) )
            {
            // InternalMetaCrySL.g:418:2: ( ( rule__JvmTypeReference__Alternatives ) )
            // InternalMetaCrySL.g:419:3: ( rule__JvmTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:420:3: ( rule__JvmTypeReference__Alternatives )
            // InternalMetaCrySL.g:420:4: rule__JvmTypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalMetaCrySL.g:429:1: entryRuleArrayBrackets : ruleArrayBrackets EOF ;
    public final void entryRuleArrayBrackets() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:430:1: ( ruleArrayBrackets EOF )
            // InternalMetaCrySL.g:431:1: ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalMetaCrySL.g:438:1: ruleArrayBrackets : ( ( rule__ArrayBrackets__Group__0 ) ) ;
    public final void ruleArrayBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:442:2: ( ( ( rule__ArrayBrackets__Group__0 ) ) )
            // InternalMetaCrySL.g:443:2: ( ( rule__ArrayBrackets__Group__0 ) )
            {
            // InternalMetaCrySL.g:443:2: ( ( rule__ArrayBrackets__Group__0 ) )
            // InternalMetaCrySL.g:444:3: ( rule__ArrayBrackets__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:445:3: ( rule__ArrayBrackets__Group__0 )
            // InternalMetaCrySL.g:445:4: rule__ArrayBrackets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalMetaCrySL.g:454:1: entryRuleXFunctionTypeRef : ruleXFunctionTypeRef EOF ;
    public final void entryRuleXFunctionTypeRef() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:455:1: ( ruleXFunctionTypeRef EOF )
            // InternalMetaCrySL.g:456:1: ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalMetaCrySL.g:463:1: ruleXFunctionTypeRef : ( ( rule__XFunctionTypeRef__Group__0 ) ) ;
    public final void ruleXFunctionTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:467:2: ( ( ( rule__XFunctionTypeRef__Group__0 ) ) )
            // InternalMetaCrySL.g:468:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            {
            // InternalMetaCrySL.g:468:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            // InternalMetaCrySL.g:469:3: ( rule__XFunctionTypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:470:3: ( rule__XFunctionTypeRef__Group__0 )
            // InternalMetaCrySL.g:470:4: rule__XFunctionTypeRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalMetaCrySL.g:479:1: entryRuleJvmParameterizedTypeReference : ruleJvmParameterizedTypeReference EOF ;
    public final void entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:480:1: ( ruleJvmParameterizedTypeReference EOF )
            // InternalMetaCrySL.g:481:1: ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalMetaCrySL.g:488:1: ruleJvmParameterizedTypeReference : ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) ;
    public final void ruleJvmParameterizedTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:492:2: ( ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) )
            // InternalMetaCrySL.g:493:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            {
            // InternalMetaCrySL.g:493:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            // InternalMetaCrySL.g:494:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:495:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            // InternalMetaCrySL.g:495:4: rule__JvmParameterizedTypeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalMetaCrySL.g:504:1: entryRuleJvmArgumentTypeReference : ruleJvmArgumentTypeReference EOF ;
    public final void entryRuleJvmArgumentTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:505:1: ( ruleJvmArgumentTypeReference EOF )
            // InternalMetaCrySL.g:506:1: ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalMetaCrySL.g:513:1: ruleJvmArgumentTypeReference : ( ( rule__JvmArgumentTypeReference__Alternatives ) ) ;
    public final void ruleJvmArgumentTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:517:2: ( ( ( rule__JvmArgumentTypeReference__Alternatives ) ) )
            // InternalMetaCrySL.g:518:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            {
            // InternalMetaCrySL.g:518:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            // InternalMetaCrySL.g:519:3: ( rule__JvmArgumentTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:520:3: ( rule__JvmArgumentTypeReference__Alternatives )
            // InternalMetaCrySL.g:520:4: rule__JvmArgumentTypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JvmArgumentTypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalMetaCrySL.g:529:1: entryRuleJvmWildcardTypeReference : ruleJvmWildcardTypeReference EOF ;
    public final void entryRuleJvmWildcardTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:530:1: ( ruleJvmWildcardTypeReference EOF )
            // InternalMetaCrySL.g:531:1: ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalMetaCrySL.g:538:1: ruleJvmWildcardTypeReference : ( ( rule__JvmWildcardTypeReference__Group__0 ) ) ;
    public final void ruleJvmWildcardTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:542:2: ( ( ( rule__JvmWildcardTypeReference__Group__0 ) ) )
            // InternalMetaCrySL.g:543:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            {
            // InternalMetaCrySL.g:543:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            // InternalMetaCrySL.g:544:3: ( rule__JvmWildcardTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:545:3: ( rule__JvmWildcardTypeReference__Group__0 )
            // InternalMetaCrySL.g:545:4: rule__JvmWildcardTypeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalMetaCrySL.g:554:1: entryRuleJvmUpperBound : ruleJvmUpperBound EOF ;
    public final void entryRuleJvmUpperBound() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:555:1: ( ruleJvmUpperBound EOF )
            // InternalMetaCrySL.g:556:1: ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalMetaCrySL.g:563:1: ruleJvmUpperBound : ( ( rule__JvmUpperBound__Group__0 ) ) ;
    public final void ruleJvmUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:567:2: ( ( ( rule__JvmUpperBound__Group__0 ) ) )
            // InternalMetaCrySL.g:568:2: ( ( rule__JvmUpperBound__Group__0 ) )
            {
            // InternalMetaCrySL.g:568:2: ( ( rule__JvmUpperBound__Group__0 ) )
            // InternalMetaCrySL.g:569:3: ( rule__JvmUpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:570:3: ( rule__JvmUpperBound__Group__0 )
            // InternalMetaCrySL.g:570:4: rule__JvmUpperBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalMetaCrySL.g:579:1: entryRuleJvmUpperBoundAnded : ruleJvmUpperBoundAnded EOF ;
    public final void entryRuleJvmUpperBoundAnded() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:580:1: ( ruleJvmUpperBoundAnded EOF )
            // InternalMetaCrySL.g:581:1: ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalMetaCrySL.g:588:1: ruleJvmUpperBoundAnded : ( ( rule__JvmUpperBoundAnded__Group__0 ) ) ;
    public final void ruleJvmUpperBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:592:2: ( ( ( rule__JvmUpperBoundAnded__Group__0 ) ) )
            // InternalMetaCrySL.g:593:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            {
            // InternalMetaCrySL.g:593:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            // InternalMetaCrySL.g:594:3: ( rule__JvmUpperBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:595:3: ( rule__JvmUpperBoundAnded__Group__0 )
            // InternalMetaCrySL.g:595:4: rule__JvmUpperBoundAnded__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalMetaCrySL.g:604:1: entryRuleJvmLowerBound : ruleJvmLowerBound EOF ;
    public final void entryRuleJvmLowerBound() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:605:1: ( ruleJvmLowerBound EOF )
            // InternalMetaCrySL.g:606:1: ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalMetaCrySL.g:613:1: ruleJvmLowerBound : ( ( rule__JvmLowerBound__Group__0 ) ) ;
    public final void ruleJvmLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:617:2: ( ( ( rule__JvmLowerBound__Group__0 ) ) )
            // InternalMetaCrySL.g:618:2: ( ( rule__JvmLowerBound__Group__0 ) )
            {
            // InternalMetaCrySL.g:618:2: ( ( rule__JvmLowerBound__Group__0 ) )
            // InternalMetaCrySL.g:619:3: ( rule__JvmLowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:620:3: ( rule__JvmLowerBound__Group__0 )
            // InternalMetaCrySL.g:620:4: rule__JvmLowerBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalMetaCrySL.g:629:1: entryRuleJvmLowerBoundAnded : ruleJvmLowerBoundAnded EOF ;
    public final void entryRuleJvmLowerBoundAnded() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:630:1: ( ruleJvmLowerBoundAnded EOF )
            // InternalMetaCrySL.g:631:1: ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalMetaCrySL.g:638:1: ruleJvmLowerBoundAnded : ( ( rule__JvmLowerBoundAnded__Group__0 ) ) ;
    public final void ruleJvmLowerBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:642:2: ( ( ( rule__JvmLowerBoundAnded__Group__0 ) ) )
            // InternalMetaCrySL.g:643:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            {
            // InternalMetaCrySL.g:643:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            // InternalMetaCrySL.g:644:3: ( rule__JvmLowerBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:645:3: ( rule__JvmLowerBoundAnded__Group__0 )
            // InternalMetaCrySL.g:645:4: rule__JvmLowerBoundAnded__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMetaCrySL.g:654:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:655:1: ( ruleQualifiedName EOF )
            // InternalMetaCrySL.g:656:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMetaCrySL.g:663:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:667:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMetaCrySL.g:668:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMetaCrySL.g:668:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMetaCrySL.g:669:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:670:3: ( rule__QualifiedName__Group__0 )
            // InternalMetaCrySL.g:670:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMetaCrySL.g:679:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:680:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMetaCrySL.g:681:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMetaCrySL.g:688:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:692:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMetaCrySL.g:693:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMetaCrySL.g:693:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMetaCrySL.g:694:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:695:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMetaCrySL.g:695:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalMetaCrySL.g:704:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:705:1: ( ruleValidID EOF )
            // InternalMetaCrySL.g:706:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalMetaCrySL.g:713:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:717:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:718:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:718:2: ( RULE_ID )
            // InternalMetaCrySL.g:719:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalMetaCrySL.g:729:1: entryRuleXImportDeclaration : ruleXImportDeclaration EOF ;
    public final void entryRuleXImportDeclaration() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:730:1: ( ruleXImportDeclaration EOF )
            // InternalMetaCrySL.g:731:1: ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalMetaCrySL.g:738:1: ruleXImportDeclaration : ( ( rule__XImportDeclaration__Group__0 ) ) ;
    public final void ruleXImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:742:2: ( ( ( rule__XImportDeclaration__Group__0 ) ) )
            // InternalMetaCrySL.g:743:2: ( ( rule__XImportDeclaration__Group__0 ) )
            {
            // InternalMetaCrySL.g:743:2: ( ( rule__XImportDeclaration__Group__0 ) )
            // InternalMetaCrySL.g:744:3: ( rule__XImportDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:745:3: ( rule__XImportDeclaration__Group__0 )
            // InternalMetaCrySL.g:745:4: rule__XImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalMetaCrySL.g:754:1: entryRuleQualifiedNameInStaticImport : ruleQualifiedNameInStaticImport EOF ;
    public final void entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:755:1: ( ruleQualifiedNameInStaticImport EOF )
            // InternalMetaCrySL.g:756:1: ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalMetaCrySL.g:763:1: ruleQualifiedNameInStaticImport : ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) ;
    public final void ruleQualifiedNameInStaticImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:767:2: ( ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) )
            // InternalMetaCrySL.g:768:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            {
            // InternalMetaCrySL.g:768:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            // InternalMetaCrySL.g:769:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            {
            // InternalMetaCrySL.g:769:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) )
            // InternalMetaCrySL.g:770:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:771:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            // InternalMetaCrySL.g:771:5: rule__QualifiedNameInStaticImport__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedNameInStaticImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }

            // InternalMetaCrySL.g:774:3: ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            // InternalMetaCrySL.g:775:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:776:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==31) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMetaCrySL.g:776:5: rule__QualifiedNameInStaticImport__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__QualifiedNameInStaticImport__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }

            }


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
    // $ANTLR end "ruleQualifiedNameInStaticImport"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalMetaCrySL.g:785:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:789:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    alt2=2;
                }
                else if ( (LA2_1==13) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMetaCrySL.g:790:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:790:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalMetaCrySL.g:791:3: ( rule__Event__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:792:3: ( rule__Event__Group_0__0 )
                    // InternalMetaCrySL.g:792:4: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:796:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:796:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalMetaCrySL.g:797:3: ( rule__Event__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:798:3: ( rule__Event__Group_1__0 )
                    // InternalMetaCrySL.g:798:4: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__EventExp__Alternatives"
    // InternalMetaCrySL.g:806:1: rule__EventExp__Alternatives : ( ( ( rule__EventExp__Group_0__0 ) ) | ( ( rule__EventExp__Group_1__0 ) ) | ( ( rule__EventExp__Group_2__0 ) ) | ( ( rule__EventExp__Group_3__0 ) ) );
    public final void rule__EventExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:810:1: ( ( ( rule__EventExp__Group_0__0 ) ) | ( ( rule__EventExp__Group_1__0 ) ) | ( ( rule__EventExp__Group_2__0 ) ) | ( ( rule__EventExp__Group_3__0 ) ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalMetaCrySL()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalMetaCrySL()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalMetaCrySL()) ) {
                    alt3=3;
                }
                else if ( (true) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==19) ) {
                int LA3_2 = input.LA(2);

                if ( (synpred3_InternalMetaCrySL()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalMetaCrySL()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalMetaCrySL()) ) {
                    alt3=3;
                }
                else if ( (true) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMetaCrySL.g:811:2: ( ( rule__EventExp__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:811:2: ( ( rule__EventExp__Group_0__0 ) )
                    // InternalMetaCrySL.g:812:3: ( rule__EventExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:813:3: ( rule__EventExp__Group_0__0 )
                    // InternalMetaCrySL.g:813:4: rule__EventExp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventExp__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventExpAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:817:2: ( ( rule__EventExp__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:817:2: ( ( rule__EventExp__Group_1__0 ) )
                    // InternalMetaCrySL.g:818:3: ( rule__EventExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:819:3: ( rule__EventExp__Group_1__0 )
                    // InternalMetaCrySL.g:819:4: rule__EventExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventExpAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaCrySL.g:823:2: ( ( rule__EventExp__Group_2__0 ) )
                    {
                    // InternalMetaCrySL.g:823:2: ( ( rule__EventExp__Group_2__0 ) )
                    // InternalMetaCrySL.g:824:3: ( rule__EventExp__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_2()); 
                    }
                    // InternalMetaCrySL.g:825:3: ( rule__EventExp__Group_2__0 )
                    // InternalMetaCrySL.g:825:4: rule__EventExp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventExp__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventExpAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaCrySL.g:829:2: ( ( rule__EventExp__Group_3__0 ) )
                    {
                    // InternalMetaCrySL.g:829:2: ( ( rule__EventExp__Group_3__0 ) )
                    // InternalMetaCrySL.g:830:3: ( rule__EventExp__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_3()); 
                    }
                    // InternalMetaCrySL.g:831:3: ( rule__EventExp__Group_3__0 )
                    // InternalMetaCrySL.g:831:4: rule__EventExp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventExp__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventExpAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EventExp__Alternatives"


    // $ANTLR start "rule__PrimaryExp__Alternatives"
    // InternalMetaCrySL.g:839:1: rule__PrimaryExp__Alternatives : ( ( ( rule__PrimaryExp__LabelAssignment_0 ) ) | ( ( rule__PrimaryExp__Group_1__0 ) ) );
    public final void rule__PrimaryExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:843:1: ( ( ( rule__PrimaryExp__LabelAssignment_0 ) ) | ( ( rule__PrimaryExp__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaCrySL.g:844:2: ( ( rule__PrimaryExp__LabelAssignment_0 ) )
                    {
                    // InternalMetaCrySL.g:844:2: ( ( rule__PrimaryExp__LabelAssignment_0 ) )
                    // InternalMetaCrySL.g:845:3: ( rule__PrimaryExp__LabelAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpAccess().getLabelAssignment_0()); 
                    }
                    // InternalMetaCrySL.g:846:3: ( rule__PrimaryExp__LabelAssignment_0 )
                    // InternalMetaCrySL.g:846:4: rule__PrimaryExp__LabelAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExp__LabelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpAccess().getLabelAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:850:2: ( ( rule__PrimaryExp__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:850:2: ( ( rule__PrimaryExp__Group_1__0 ) )
                    // InternalMetaCrySL.g:851:3: ( rule__PrimaryExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:852:3: ( rule__PrimaryExp__Group_1__0 )
                    // InternalMetaCrySL.g:852:4: rule__PrimaryExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PrimaryExp__Alternatives"


    // $ANTLR start "rule__JvmTypeReference__Alternatives"
    // InternalMetaCrySL.g:860:1: rule__JvmTypeReference__Alternatives : ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) );
    public final void rule__JvmTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:864:1: ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==19||LA5_0==28) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaCrySL.g:865:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:865:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    // InternalMetaCrySL.g:866:3: ( rule__JvmTypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:867:3: ( rule__JvmTypeReference__Group_0__0 )
                    // InternalMetaCrySL.g:867:4: rule__JvmTypeReference__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmTypeReference__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:871:2: ( ruleXFunctionTypeRef )
                    {
                    // InternalMetaCrySL.g:871:2: ( ruleXFunctionTypeRef )
                    // InternalMetaCrySL.g:872:3: ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__JvmTypeReference__Alternatives"


    // $ANTLR start "rule__JvmArgumentTypeReference__Alternatives"
    // InternalMetaCrySL.g:881:1: rule__JvmArgumentTypeReference__Alternatives : ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) );
    public final void rule__JvmArgumentTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:885:1: ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==19||LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMetaCrySL.g:886:2: ( ruleJvmTypeReference )
                    {
                    // InternalMetaCrySL.g:886:2: ( ruleJvmTypeReference )
                    // InternalMetaCrySL.g:887:3: ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:892:2: ( ruleJvmWildcardTypeReference )
                    {
                    // InternalMetaCrySL.g:892:2: ( ruleJvmWildcardTypeReference )
                    // InternalMetaCrySL.g:893:3: ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__JvmArgumentTypeReference__Alternatives"


    // $ANTLR start "rule__JvmWildcardTypeReference__Alternatives_2"
    // InternalMetaCrySL.g:902:1: rule__JvmWildcardTypeReference__Alternatives_2 : ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) );
    public final void rule__JvmWildcardTypeReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:906:1: ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMetaCrySL.g:907:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    {
                    // InternalMetaCrySL.g:907:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    // InternalMetaCrySL.g:908:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }
                    // InternalMetaCrySL.g:909:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    // InternalMetaCrySL.g:909:4: rule__JvmWildcardTypeReference__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:913:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    {
                    // InternalMetaCrySL.g:913:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    // InternalMetaCrySL.g:914:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }
                    // InternalMetaCrySL.g:915:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    // InternalMetaCrySL.g:915:4: rule__JvmWildcardTypeReference__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Alternatives_2"


    // $ANTLR start "rule__XImportDeclaration__Alternatives_1"
    // InternalMetaCrySL.g:923:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:927:1: ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMetaCrySL.g:928:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    {
                    // InternalMetaCrySL.g:928:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    // InternalMetaCrySL.g:929:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }
                    // InternalMetaCrySL.g:930:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    // InternalMetaCrySL.g:930:4: rule__XImportDeclaration__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:934:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    {
                    // InternalMetaCrySL.g:934:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    // InternalMetaCrySL.g:935:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }
                    // InternalMetaCrySL.g:936:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    // InternalMetaCrySL.g:936:4: rule__XImportDeclaration__ImportedTypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ImportedTypeAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaCrySL.g:940:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    {
                    // InternalMetaCrySL.g:940:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    // InternalMetaCrySL.g:941:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }
                    // InternalMetaCrySL.g:942:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    // InternalMetaCrySL.g:942:4: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ImportedNamespaceAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__XImportDeclaration__Alternatives_1"


    // $ANTLR start "rule__XImportDeclaration__Alternatives_1_0_3"
    // InternalMetaCrySL.g:950:1: rule__XImportDeclaration__Alternatives_1_0_3 : ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:954:1: ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMetaCrySL.g:955:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    {
                    // InternalMetaCrySL.g:955:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    // InternalMetaCrySL.g:956:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }
                    // InternalMetaCrySL.g:957:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    // InternalMetaCrySL.g:957:4: rule__XImportDeclaration__WildcardAssignment_1_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__WildcardAssignment_1_0_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:961:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    {
                    // InternalMetaCrySL.g:961:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    // InternalMetaCrySL.g:962:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }
                    // InternalMetaCrySL.g:963:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    // InternalMetaCrySL.g:963:4: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__MemberNameAssignment_1_0_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }

                    }


                    }
                    break;

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
    // $ANTLR end "rule__XImportDeclaration__Alternatives_1_0_3"


    // $ANTLR start "rule__Spec__Group__0"
    // InternalMetaCrySL.g:971:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:975:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // InternalMetaCrySL.g:976:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Spec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // InternalMetaCrySL.g:983:1: rule__Spec__Group__0__Impl : ( ( 'ABSTRACT' )? ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:987:1: ( ( ( 'ABSTRACT' )? ) )
            // InternalMetaCrySL.g:988:1: ( ( 'ABSTRACT' )? )
            {
            // InternalMetaCrySL.g:988:1: ( ( 'ABSTRACT' )? )
            // InternalMetaCrySL.g:989:2: ( 'ABSTRACT' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getABSTRACTKeyword_0()); 
            }
            // InternalMetaCrySL.g:990:2: ( 'ABSTRACT' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMetaCrySL.g:990:3: 'ABSTRACT'
                    {
                    match(input,10,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getABSTRACTKeyword_0()); 
            }

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
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // InternalMetaCrySL.g:998:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1002:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // InternalMetaCrySL.g:1003:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Spec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // InternalMetaCrySL.g:1010:1: rule__Spec__Group__1__Impl : ( 'SPEC' ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1014:1: ( ( 'SPEC' ) )
            // InternalMetaCrySL.g:1015:1: ( 'SPEC' )
            {
            // InternalMetaCrySL.g:1015:1: ( 'SPEC' )
            // InternalMetaCrySL.g:1016:2: 'SPEC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getSPECKeyword_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getSPECKeyword_1()); 
            }

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
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group__2"
    // InternalMetaCrySL.g:1025:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl rule__Spec__Group__3 ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1029:1: ( rule__Spec__Group__2__Impl rule__Spec__Group__3 )
            // InternalMetaCrySL.g:1030:2: rule__Spec__Group__2__Impl rule__Spec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__2"


    // $ANTLR start "rule__Spec__Group__2__Impl"
    // InternalMetaCrySL.g:1037:1: rule__Spec__Group__2__Impl : ( ( rule__Spec__ClassNameAssignment_2 ) ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1041:1: ( ( ( rule__Spec__ClassNameAssignment_2 ) ) )
            // InternalMetaCrySL.g:1042:1: ( ( rule__Spec__ClassNameAssignment_2 ) )
            {
            // InternalMetaCrySL.g:1042:1: ( ( rule__Spec__ClassNameAssignment_2 ) )
            // InternalMetaCrySL.g:1043:2: ( rule__Spec__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getClassNameAssignment_2()); 
            }
            // InternalMetaCrySL.g:1044:2: ( rule__Spec__ClassNameAssignment_2 )
            // InternalMetaCrySL.g:1044:3: rule__Spec__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spec__ClassNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getClassNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Spec__Group__2__Impl"


    // $ANTLR start "rule__Spec__Group__3"
    // InternalMetaCrySL.g:1052:1: rule__Spec__Group__3 : rule__Spec__Group__3__Impl rule__Spec__Group__4 ;
    public final void rule__Spec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1056:1: ( rule__Spec__Group__3__Impl rule__Spec__Group__4 )
            // InternalMetaCrySL.g:1057:2: rule__Spec__Group__3__Impl rule__Spec__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__3"


    // $ANTLR start "rule__Spec__Group__3__Impl"
    // InternalMetaCrySL.g:1064:1: rule__Spec__Group__3__Impl : ( ( rule__Spec__ObjectSpecAssignment_3 )? ) ;
    public final void rule__Spec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1068:1: ( ( ( rule__Spec__ObjectSpecAssignment_3 )? ) )
            // InternalMetaCrySL.g:1069:1: ( ( rule__Spec__ObjectSpecAssignment_3 )? )
            {
            // InternalMetaCrySL.g:1069:1: ( ( rule__Spec__ObjectSpecAssignment_3 )? )
            // InternalMetaCrySL.g:1070:2: ( rule__Spec__ObjectSpecAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getObjectSpecAssignment_3()); 
            }
            // InternalMetaCrySL.g:1071:2: ( rule__Spec__ObjectSpecAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaCrySL.g:1071:3: rule__Spec__ObjectSpecAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__ObjectSpecAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getObjectSpecAssignment_3()); 
            }

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
    // $ANTLR end "rule__Spec__Group__3__Impl"


    // $ANTLR start "rule__Spec__Group__4"
    // InternalMetaCrySL.g:1079:1: rule__Spec__Group__4 : rule__Spec__Group__4__Impl rule__Spec__Group__5 ;
    public final void rule__Spec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1083:1: ( rule__Spec__Group__4__Impl rule__Spec__Group__5 )
            // InternalMetaCrySL.g:1084:2: rule__Spec__Group__4__Impl rule__Spec__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__4"


    // $ANTLR start "rule__Spec__Group__4__Impl"
    // InternalMetaCrySL.g:1091:1: rule__Spec__Group__4__Impl : ( ( rule__Spec__EventSpecAssignment_4 )? ) ;
    public final void rule__Spec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1095:1: ( ( ( rule__Spec__EventSpecAssignment_4 )? ) )
            // InternalMetaCrySL.g:1096:1: ( ( rule__Spec__EventSpecAssignment_4 )? )
            {
            // InternalMetaCrySL.g:1096:1: ( ( rule__Spec__EventSpecAssignment_4 )? )
            // InternalMetaCrySL.g:1097:2: ( rule__Spec__EventSpecAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getEventSpecAssignment_4()); 
            }
            // InternalMetaCrySL.g:1098:2: ( rule__Spec__EventSpecAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaCrySL.g:1098:3: rule__Spec__EventSpecAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__EventSpecAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getEventSpecAssignment_4()); 
            }

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
    // $ANTLR end "rule__Spec__Group__4__Impl"


    // $ANTLR start "rule__Spec__Group__5"
    // InternalMetaCrySL.g:1106:1: rule__Spec__Group__5 : rule__Spec__Group__5__Impl ;
    public final void rule__Spec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1110:1: ( rule__Spec__Group__5__Impl )
            // InternalMetaCrySL.g:1111:2: rule__Spec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Spec__Group__5"


    // $ANTLR start "rule__Spec__Group__5__Impl"
    // InternalMetaCrySL.g:1117:1: rule__Spec__Group__5__Impl : ( ( rule__Spec__OrderSpecAssignment_5 )? ) ;
    public final void rule__Spec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1121:1: ( ( ( rule__Spec__OrderSpecAssignment_5 )? ) )
            // InternalMetaCrySL.g:1122:1: ( ( rule__Spec__OrderSpecAssignment_5 )? )
            {
            // InternalMetaCrySL.g:1122:1: ( ( rule__Spec__OrderSpecAssignment_5 )? )
            // InternalMetaCrySL.g:1123:2: ( rule__Spec__OrderSpecAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getOrderSpecAssignment_5()); 
            }
            // InternalMetaCrySL.g:1124:2: ( rule__Spec__OrderSpecAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaCrySL.g:1124:3: rule__Spec__OrderSpecAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__OrderSpecAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getOrderSpecAssignment_5()); 
            }

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
    // $ANTLR end "rule__Spec__Group__5__Impl"


    // $ANTLR start "rule__ObjectSpec__Group__0"
    // InternalMetaCrySL.g:1133:1: rule__ObjectSpec__Group__0 : rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1 ;
    public final void rule__ObjectSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1137:1: ( rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1 )
            // InternalMetaCrySL.g:1138:2: rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ObjectSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectSpec__Group__0"


    // $ANTLR start "rule__ObjectSpec__Group__0__Impl"
    // InternalMetaCrySL.g:1145:1: rule__ObjectSpec__Group__0__Impl : ( () ) ;
    public final void rule__ObjectSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1149:1: ( ( () ) )
            // InternalMetaCrySL.g:1150:1: ( () )
            {
            // InternalMetaCrySL.g:1150:1: ( () )
            // InternalMetaCrySL.g:1151:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectSpecAction_0()); 
            }
            // InternalMetaCrySL.g:1152:2: ()
            // InternalMetaCrySL.g:1152:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getObjectSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectSpec__Group__0__Impl"


    // $ANTLR start "rule__ObjectSpec__Group__1"
    // InternalMetaCrySL.g:1160:1: rule__ObjectSpec__Group__1 : rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2 ;
    public final void rule__ObjectSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1164:1: ( rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2 )
            // InternalMetaCrySL.g:1165:2: rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ObjectSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectSpec__Group__1"


    // $ANTLR start "rule__ObjectSpec__Group__1__Impl"
    // InternalMetaCrySL.g:1172:1: rule__ObjectSpec__Group__1__Impl : ( 'OBJECTS' ) ;
    public final void rule__ObjectSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1176:1: ( ( 'OBJECTS' ) )
            // InternalMetaCrySL.g:1177:1: ( 'OBJECTS' )
            {
            // InternalMetaCrySL.g:1177:1: ( 'OBJECTS' )
            // InternalMetaCrySL.g:1178:2: 'OBJECTS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getOBJECTSKeyword_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getOBJECTSKeyword_1()); 
            }

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
    // $ANTLR end "rule__ObjectSpec__Group__1__Impl"


    // $ANTLR start "rule__ObjectSpec__Group__2"
    // InternalMetaCrySL.g:1187:1: rule__ObjectSpec__Group__2 : rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3 ;
    public final void rule__ObjectSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1191:1: ( rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3 )
            // InternalMetaCrySL.g:1192:2: rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ObjectSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectSpec__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectSpec__Group__2"


    // $ANTLR start "rule__ObjectSpec__Group__2__Impl"
    // InternalMetaCrySL.g:1199:1: rule__ObjectSpec__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1203:1: ( ( ':' ) )
            // InternalMetaCrySL.g:1204:1: ( ':' )
            {
            // InternalMetaCrySL.g:1204:1: ( ':' )
            // InternalMetaCrySL.g:1205:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getColonKeyword_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getColonKeyword_2()); 
            }

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
    // $ANTLR end "rule__ObjectSpec__Group__2__Impl"


    // $ANTLR start "rule__ObjectSpec__Group__3"
    // InternalMetaCrySL.g:1214:1: rule__ObjectSpec__Group__3 : rule__ObjectSpec__Group__3__Impl ;
    public final void rule__ObjectSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1218:1: ( rule__ObjectSpec__Group__3__Impl )
            // InternalMetaCrySL.g:1219:2: rule__ObjectSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ObjectSpec__Group__3"


    // $ANTLR start "rule__ObjectSpec__Group__3__Impl"
    // InternalMetaCrySL.g:1225:1: rule__ObjectSpec__Group__3__Impl : ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) ) ;
    public final void rule__ObjectSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1229:1: ( ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) ) )
            // InternalMetaCrySL.g:1230:1: ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) )
            {
            // InternalMetaCrySL.g:1230:1: ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) )
            // InternalMetaCrySL.g:1231:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* )
            {
            // InternalMetaCrySL.g:1231:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 ) )
            // InternalMetaCrySL.g:1232:3: ( rule__ObjectSpec__ObjectsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }
            // InternalMetaCrySL.g:1233:3: ( rule__ObjectSpec__ObjectsAssignment_3 )
            // InternalMetaCrySL.g:1233:4: rule__ObjectSpec__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__ObjectSpec__ObjectsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }

            }

            // InternalMetaCrySL.g:1236:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 )* )
            // InternalMetaCrySL.g:1237:3: ( rule__ObjectSpec__ObjectsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }
            // InternalMetaCrySL.g:1238:3: ( rule__ObjectSpec__ObjectsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==19||LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaCrySL.g:1238:4: rule__ObjectSpec__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ObjectSpec__ObjectsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }

            }


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
    // $ANTLR end "rule__ObjectSpec__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalMetaCrySL.g:1248:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1252:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMetaCrySL.g:1253:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalMetaCrySL.g:1260:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1264:1: ( ( () ) )
            // InternalMetaCrySL.g:1265:1: ( () )
            {
            // InternalMetaCrySL.g:1265:1: ( () )
            // InternalMetaCrySL.g:1266:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }
            // InternalMetaCrySL.g:1267:2: ()
            // InternalMetaCrySL.g:1267:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalMetaCrySL.g:1275:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1279:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMetaCrySL.g:1280:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalMetaCrySL.g:1287:1: rule__Object__Group__1__Impl : ( ( rule__Object__TypeAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1291:1: ( ( ( rule__Object__TypeAssignment_1 ) ) )
            // InternalMetaCrySL.g:1292:1: ( ( rule__Object__TypeAssignment_1 ) )
            {
            // InternalMetaCrySL.g:1292:1: ( ( rule__Object__TypeAssignment_1 ) )
            // InternalMetaCrySL.g:1293:2: ( rule__Object__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getTypeAssignment_1()); 
            }
            // InternalMetaCrySL.g:1294:2: ( rule__Object__TypeAssignment_1 )
            // InternalMetaCrySL.g:1294:3: rule__Object__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getTypeAssignment_1()); 
            }

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
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalMetaCrySL.g:1302:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1306:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalMetaCrySL.g:1307:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Object__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalMetaCrySL.g:1314:1: rule__Object__Group__2__Impl : ( ( rule__Object__VarNameAssignment_2 ) ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1318:1: ( ( ( rule__Object__VarNameAssignment_2 ) ) )
            // InternalMetaCrySL.g:1319:1: ( ( rule__Object__VarNameAssignment_2 ) )
            {
            // InternalMetaCrySL.g:1319:1: ( ( rule__Object__VarNameAssignment_2 ) )
            // InternalMetaCrySL.g:1320:2: ( rule__Object__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getVarNameAssignment_2()); 
            }
            // InternalMetaCrySL.g:1321:2: ( rule__Object__VarNameAssignment_2 )
            // InternalMetaCrySL.g:1321:3: rule__Object__VarNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__VarNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getVarNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalMetaCrySL.g:1329:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1333:1: ( rule__Object__Group__3__Impl )
            // InternalMetaCrySL.g:1334:2: rule__Object__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalMetaCrySL.g:1340:1: rule__Object__Group__3__Impl : ( ';' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1344:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1345:1: ( ';' )
            {
            // InternalMetaCrySL.g:1345:1: ( ';' )
            // InternalMetaCrySL.g:1346:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getSemicolonKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getSemicolonKeyword_3()); 
            }

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
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__EventSpec__Group__0"
    // InternalMetaCrySL.g:1356:1: rule__EventSpec__Group__0 : rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1 ;
    public final void rule__EventSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1360:1: ( rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1 )
            // InternalMetaCrySL.g:1361:2: rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EventSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventSpec__Group__0"


    // $ANTLR start "rule__EventSpec__Group__0__Impl"
    // InternalMetaCrySL.g:1368:1: rule__EventSpec__Group__0__Impl : ( () ) ;
    public final void rule__EventSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1372:1: ( ( () ) )
            // InternalMetaCrySL.g:1373:1: ( () )
            {
            // InternalMetaCrySL.g:1373:1: ( () )
            // InternalMetaCrySL.g:1374:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventSpecAction_0()); 
            }
            // InternalMetaCrySL.g:1375:2: ()
            // InternalMetaCrySL.g:1375:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getEventSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSpec__Group__0__Impl"


    // $ANTLR start "rule__EventSpec__Group__1"
    // InternalMetaCrySL.g:1383:1: rule__EventSpec__Group__1 : rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2 ;
    public final void rule__EventSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1387:1: ( rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2 )
            // InternalMetaCrySL.g:1388:2: rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EventSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventSpec__Group__1"


    // $ANTLR start "rule__EventSpec__Group__1__Impl"
    // InternalMetaCrySL.g:1395:1: rule__EventSpec__Group__1__Impl : ( 'EVENTS' ) ;
    public final void rule__EventSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1399:1: ( ( 'EVENTS' ) )
            // InternalMetaCrySL.g:1400:1: ( 'EVENTS' )
            {
            // InternalMetaCrySL.g:1400:1: ( 'EVENTS' )
            // InternalMetaCrySL.g:1401:2: 'EVENTS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEVENTSKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getEVENTSKeyword_1()); 
            }

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
    // $ANTLR end "rule__EventSpec__Group__1__Impl"


    // $ANTLR start "rule__EventSpec__Group__2"
    // InternalMetaCrySL.g:1410:1: rule__EventSpec__Group__2 : rule__EventSpec__Group__2__Impl ;
    public final void rule__EventSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1414:1: ( rule__EventSpec__Group__2__Impl )
            // InternalMetaCrySL.g:1415:2: rule__EventSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventSpec__Group__2"


    // $ANTLR start "rule__EventSpec__Group__2__Impl"
    // InternalMetaCrySL.g:1421:1: rule__EventSpec__Group__2__Impl : ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) ) ;
    public final void rule__EventSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1425:1: ( ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) ) )
            // InternalMetaCrySL.g:1426:1: ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) )
            {
            // InternalMetaCrySL.g:1426:1: ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) )
            // InternalMetaCrySL.g:1427:2: ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* )
            {
            // InternalMetaCrySL.g:1427:2: ( ( rule__EventSpec__EventsAssignment_2 ) )
            // InternalMetaCrySL.g:1428:3: ( rule__EventSpec__EventsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1429:3: ( rule__EventSpec__EventsAssignment_2 )
            // InternalMetaCrySL.g:1429:4: rule__EventSpec__EventsAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__EventSpec__EventsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }

            }

            // InternalMetaCrySL.g:1432:2: ( ( rule__EventSpec__EventsAssignment_2 )* )
            // InternalMetaCrySL.g:1433:3: ( rule__EventSpec__EventsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1434:3: ( rule__EventSpec__EventsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaCrySL.g:1434:4: rule__EventSpec__EventsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EventSpec__EventsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }

            }


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
    // $ANTLR end "rule__EventSpec__Group__2__Impl"


    // $ANTLR start "rule__Event__Group_0__0"
    // InternalMetaCrySL.g:1444:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1448:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalMetaCrySL.g:1449:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0__0"


    // $ANTLR start "rule__Event__Group_0__0__Impl"
    // InternalMetaCrySL.g:1456:1: rule__Event__Group_0__0__Impl : ( () ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1460:1: ( ( () ) )
            // InternalMetaCrySL.g:1461:1: ( () )
            {
            // InternalMetaCrySL.g:1461:1: ( () )
            // InternalMetaCrySL.g:1462:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventMethodAction_0_0()); 
            }
            // InternalMetaCrySL.g:1463:2: ()
            // InternalMetaCrySL.g:1463:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventMethodAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__0__Impl"


    // $ANTLR start "rule__Event__Group_0__1"
    // InternalMetaCrySL.g:1471:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1475:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // InternalMetaCrySL.g:1476:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0__1"


    // $ANTLR start "rule__Event__Group_0__1__Impl"
    // InternalMetaCrySL.g:1483:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__Group_0_1__0 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1487:1: ( ( ( rule__Event__Group_0_1__0 ) ) )
            // InternalMetaCrySL.g:1488:1: ( ( rule__Event__Group_0_1__0 ) )
            {
            // InternalMetaCrySL.g:1488:1: ( ( rule__Event__Group_0_1__0 ) )
            // InternalMetaCrySL.g:1489:2: ( rule__Event__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:1490:2: ( rule__Event__Group_0_1__0 )
            // InternalMetaCrySL.g:1490:3: rule__Event__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_0_1()); 
            }

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
    // $ANTLR end "rule__Event__Group_0__1__Impl"


    // $ANTLR start "rule__Event__Group_0__2"
    // InternalMetaCrySL.g:1498:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl rule__Event__Group_0__3 ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1502:1: ( rule__Event__Group_0__2__Impl rule__Event__Group_0__3 )
            // InternalMetaCrySL.g:1503:2: rule__Event__Group_0__2__Impl rule__Event__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0__2"


    // $ANTLR start "rule__Event__Group_0__2__Impl"
    // InternalMetaCrySL.g:1510:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__Group_0_2__0 )? ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1514:1: ( ( ( rule__Event__Group_0_2__0 )? ) )
            // InternalMetaCrySL.g:1515:1: ( ( rule__Event__Group_0_2__0 )? )
            {
            // InternalMetaCrySL.g:1515:1: ( ( rule__Event__Group_0_2__0 )? )
            // InternalMetaCrySL.g:1516:2: ( rule__Event__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_2()); 
            }
            // InternalMetaCrySL.g:1517:2: ( rule__Event__Group_0_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==16) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaCrySL.g:1517:3: rule__Event__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_0_2()); 
            }

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
    // $ANTLR end "rule__Event__Group_0__2__Impl"


    // $ANTLR start "rule__Event__Group_0__3"
    // InternalMetaCrySL.g:1525:1: rule__Event__Group_0__3 : rule__Event__Group_0__3__Impl rule__Event__Group_0__4 ;
    public final void rule__Event__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1529:1: ( rule__Event__Group_0__3__Impl rule__Event__Group_0__4 )
            // InternalMetaCrySL.g:1530:2: rule__Event__Group_0__3__Impl rule__Event__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0__3"


    // $ANTLR start "rule__Event__Group_0__3__Impl"
    // InternalMetaCrySL.g:1537:1: rule__Event__Group_0__3__Impl : ( ( rule__Event__MethodAssignment_0_3 ) ) ;
    public final void rule__Event__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1541:1: ( ( ( rule__Event__MethodAssignment_0_3 ) ) )
            // InternalMetaCrySL.g:1542:1: ( ( rule__Event__MethodAssignment_0_3 ) )
            {
            // InternalMetaCrySL.g:1542:1: ( ( rule__Event__MethodAssignment_0_3 ) )
            // InternalMetaCrySL.g:1543:2: ( rule__Event__MethodAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getMethodAssignment_0_3()); 
            }
            // InternalMetaCrySL.g:1544:2: ( rule__Event__MethodAssignment_0_3 )
            // InternalMetaCrySL.g:1544:3: rule__Event__MethodAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__MethodAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getMethodAssignment_0_3()); 
            }

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
    // $ANTLR end "rule__Event__Group_0__3__Impl"


    // $ANTLR start "rule__Event__Group_0__4"
    // InternalMetaCrySL.g:1552:1: rule__Event__Group_0__4 : rule__Event__Group_0__4__Impl ;
    public final void rule__Event__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1556:1: ( rule__Event__Group_0__4__Impl )
            // InternalMetaCrySL.g:1557:2: rule__Event__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0__4"


    // $ANTLR start "rule__Event__Group_0__4__Impl"
    // InternalMetaCrySL.g:1563:1: rule__Event__Group_0__4__Impl : ( ';' ) ;
    public final void rule__Event__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1567:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1568:1: ( ';' )
            {
            // InternalMetaCrySL.g:1568:1: ( ';' )
            // InternalMetaCrySL.g:1569:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getSemicolonKeyword_0_4()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getSemicolonKeyword_0_4()); 
            }

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
    // $ANTLR end "rule__Event__Group_0__4__Impl"


    // $ANTLR start "rule__Event__Group_0_1__0"
    // InternalMetaCrySL.g:1579:1: rule__Event__Group_0_1__0 : rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 ;
    public final void rule__Event__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1583:1: ( rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 )
            // InternalMetaCrySL.g:1584:2: rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0_1__0"


    // $ANTLR start "rule__Event__Group_0_1__0__Impl"
    // InternalMetaCrySL.g:1591:1: rule__Event__Group_0_1__0__Impl : ( ( rule__Event__LabelAssignment_0_1_0 ) ) ;
    public final void rule__Event__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1595:1: ( ( ( rule__Event__LabelAssignment_0_1_0 ) ) )
            // InternalMetaCrySL.g:1596:1: ( ( rule__Event__LabelAssignment_0_1_0 ) )
            {
            // InternalMetaCrySL.g:1596:1: ( ( rule__Event__LabelAssignment_0_1_0 ) )
            // InternalMetaCrySL.g:1597:2: ( rule__Event__LabelAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelAssignment_0_1_0()); 
            }
            // InternalMetaCrySL.g:1598:2: ( rule__Event__LabelAssignment_0_1_0 )
            // InternalMetaCrySL.g:1598:3: rule__Event__LabelAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__LabelAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLabelAssignment_0_1_0()); 
            }

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
    // $ANTLR end "rule__Event__Group_0_1__0__Impl"


    // $ANTLR start "rule__Event__Group_0_1__1"
    // InternalMetaCrySL.g:1606:1: rule__Event__Group_0_1__1 : rule__Event__Group_0_1__1__Impl ;
    public final void rule__Event__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1610:1: ( rule__Event__Group_0_1__1__Impl )
            // InternalMetaCrySL.g:1611:2: rule__Event__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0_1__1"


    // $ANTLR start "rule__Event__Group_0_1__1__Impl"
    // InternalMetaCrySL.g:1617:1: rule__Event__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__Event__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1621:1: ( ( ':' ) )
            // InternalMetaCrySL.g:1622:1: ( ':' )
            {
            // InternalMetaCrySL.g:1622:1: ( ':' )
            // InternalMetaCrySL.g:1623:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getColonKeyword_0_1_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getColonKeyword_0_1_1()); 
            }

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
    // $ANTLR end "rule__Event__Group_0_1__1__Impl"


    // $ANTLR start "rule__Event__Group_0_2__0"
    // InternalMetaCrySL.g:1633:1: rule__Event__Group_0_2__0 : rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1 ;
    public final void rule__Event__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1637:1: ( rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1 )
            // InternalMetaCrySL.g:1638:2: rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0_2__0"


    // $ANTLR start "rule__Event__Group_0_2__0__Impl"
    // InternalMetaCrySL.g:1645:1: rule__Event__Group_0_2__0__Impl : ( ( rule__Event__VarAssignment_0_2_0 ) ) ;
    public final void rule__Event__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1649:1: ( ( ( rule__Event__VarAssignment_0_2_0 ) ) )
            // InternalMetaCrySL.g:1650:1: ( ( rule__Event__VarAssignment_0_2_0 ) )
            {
            // InternalMetaCrySL.g:1650:1: ( ( rule__Event__VarAssignment_0_2_0 ) )
            // InternalMetaCrySL.g:1651:2: ( rule__Event__VarAssignment_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getVarAssignment_0_2_0()); 
            }
            // InternalMetaCrySL.g:1652:2: ( rule__Event__VarAssignment_0_2_0 )
            // InternalMetaCrySL.g:1652:3: rule__Event__VarAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__VarAssignment_0_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getVarAssignment_0_2_0()); 
            }

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
    // $ANTLR end "rule__Event__Group_0_2__0__Impl"


    // $ANTLR start "rule__Event__Group_0_2__1"
    // InternalMetaCrySL.g:1660:1: rule__Event__Group_0_2__1 : rule__Event__Group_0_2__1__Impl ;
    public final void rule__Event__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1664:1: ( rule__Event__Group_0_2__1__Impl )
            // InternalMetaCrySL.g:1665:2: rule__Event__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_0_2__1"


    // $ANTLR start "rule__Event__Group_0_2__1__Impl"
    // InternalMetaCrySL.g:1671:1: rule__Event__Group_0_2__1__Impl : ( '=' ) ;
    public final void rule__Event__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1675:1: ( ( '=' ) )
            // InternalMetaCrySL.g:1676:1: ( '=' )
            {
            // InternalMetaCrySL.g:1676:1: ( '=' )
            // InternalMetaCrySL.g:1677:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEqualsSignKeyword_0_2_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEqualsSignKeyword_0_2_1()); 
            }

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
    // $ANTLR end "rule__Event__Group_0_2__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalMetaCrySL.g:1687:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1691:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalMetaCrySL.g:1692:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // InternalMetaCrySL.g:1699:1: rule__Event__Group_1__0__Impl : ( () ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1703:1: ( ( () ) )
            // InternalMetaCrySL.g:1704:1: ( () )
            {
            // InternalMetaCrySL.g:1704:1: ( () )
            // InternalMetaCrySL.g:1705:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventAggregateAction_1_0()); 
            }
            // InternalMetaCrySL.g:1706:2: ()
            // InternalMetaCrySL.g:1706:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventAggregateAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // InternalMetaCrySL.g:1714:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1718:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // InternalMetaCrySL.g:1719:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // InternalMetaCrySL.g:1726:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__Group_1_1__0 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1730:1: ( ( ( rule__Event__Group_1_1__0 ) ) )
            // InternalMetaCrySL.g:1731:1: ( ( rule__Event__Group_1_1__0 ) )
            {
            // InternalMetaCrySL.g:1731:1: ( ( rule__Event__Group_1_1__0 ) )
            // InternalMetaCrySL.g:1732:2: ( rule__Event__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_1()); 
            }
            // InternalMetaCrySL.g:1733:2: ( rule__Event__Group_1_1__0 )
            // InternalMetaCrySL.g:1733:3: rule__Event__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_1_1()); 
            }

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
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__2"
    // InternalMetaCrySL.g:1741:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1745:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // InternalMetaCrySL.g:1746:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1__2"


    // $ANTLR start "rule__Event__Group_1__2__Impl"
    // InternalMetaCrySL.g:1753:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__AggregateAssignment_1_2 ) ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1757:1: ( ( ( rule__Event__AggregateAssignment_1_2 ) ) )
            // InternalMetaCrySL.g:1758:1: ( ( rule__Event__AggregateAssignment_1_2 ) )
            {
            // InternalMetaCrySL.g:1758:1: ( ( rule__Event__AggregateAssignment_1_2 ) )
            // InternalMetaCrySL.g:1759:2: ( rule__Event__AggregateAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAggregateAssignment_1_2()); 
            }
            // InternalMetaCrySL.g:1760:2: ( rule__Event__AggregateAssignment_1_2 )
            // InternalMetaCrySL.g:1760:3: rule__Event__AggregateAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__AggregateAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getAggregateAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Event__Group_1__2__Impl"


    // $ANTLR start "rule__Event__Group_1__3"
    // InternalMetaCrySL.g:1768:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1772:1: ( rule__Event__Group_1__3__Impl )
            // InternalMetaCrySL.g:1773:2: rule__Event__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1__3"


    // $ANTLR start "rule__Event__Group_1__3__Impl"
    // InternalMetaCrySL.g:1779:1: rule__Event__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1783:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1784:1: ( ';' )
            {
            // InternalMetaCrySL.g:1784:1: ( ';' )
            // InternalMetaCrySL.g:1785:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getSemicolonKeyword_1_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getSemicolonKeyword_1_3()); 
            }

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
    // $ANTLR end "rule__Event__Group_1__3__Impl"


    // $ANTLR start "rule__Event__Group_1_1__0"
    // InternalMetaCrySL.g:1795:1: rule__Event__Group_1_1__0 : rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1 ;
    public final void rule__Event__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1799:1: ( rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1 )
            // InternalMetaCrySL.g:1800:2: rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1_1__0"


    // $ANTLR start "rule__Event__Group_1_1__0__Impl"
    // InternalMetaCrySL.g:1807:1: rule__Event__Group_1_1__0__Impl : ( ( rule__Event__LabelAssignment_1_1_0 ) ) ;
    public final void rule__Event__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1811:1: ( ( ( rule__Event__LabelAssignment_1_1_0 ) ) )
            // InternalMetaCrySL.g:1812:1: ( ( rule__Event__LabelAssignment_1_1_0 ) )
            {
            // InternalMetaCrySL.g:1812:1: ( ( rule__Event__LabelAssignment_1_1_0 ) )
            // InternalMetaCrySL.g:1813:2: ( rule__Event__LabelAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelAssignment_1_1_0()); 
            }
            // InternalMetaCrySL.g:1814:2: ( rule__Event__LabelAssignment_1_1_0 )
            // InternalMetaCrySL.g:1814:3: rule__Event__LabelAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__LabelAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLabelAssignment_1_1_0()); 
            }

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
    // $ANTLR end "rule__Event__Group_1_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1_1__1"
    // InternalMetaCrySL.g:1822:1: rule__Event__Group_1_1__1 : rule__Event__Group_1_1__1__Impl ;
    public final void rule__Event__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1826:1: ( rule__Event__Group_1_1__1__Impl )
            // InternalMetaCrySL.g:1827:2: rule__Event__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Event__Group_1_1__1"


    // $ANTLR start "rule__Event__Group_1_1__1__Impl"
    // InternalMetaCrySL.g:1833:1: rule__Event__Group_1_1__1__Impl : ( ':=' ) ;
    public final void rule__Event__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1837:1: ( ( ':=' ) )
            // InternalMetaCrySL.g:1838:1: ( ':=' )
            {
            // InternalMetaCrySL.g:1838:1: ( ':=' )
            // InternalMetaCrySL.g:1839:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getColonEqualsSignKeyword_1_1_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getColonEqualsSignKeyword_1_1_1()); 
            }

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
    // $ANTLR end "rule__Event__Group_1_1__1__Impl"


    // $ANTLR start "rule__AggregateList__Group__0"
    // InternalMetaCrySL.g:1849:1: rule__AggregateList__Group__0 : rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1 ;
    public final void rule__AggregateList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1853:1: ( rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1 )
            // InternalMetaCrySL.g:1854:2: rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AggregateList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregateList__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregateList__Group__0"


    // $ANTLR start "rule__AggregateList__Group__0__Impl"
    // InternalMetaCrySL.g:1861:1: rule__AggregateList__Group__0__Impl : ( ( rule__AggregateList__LabelsAssignment_0 ) ) ;
    public final void rule__AggregateList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1865:1: ( ( ( rule__AggregateList__LabelsAssignment_0 ) ) )
            // InternalMetaCrySL.g:1866:1: ( ( rule__AggregateList__LabelsAssignment_0 ) )
            {
            // InternalMetaCrySL.g:1866:1: ( ( rule__AggregateList__LabelsAssignment_0 ) )
            // InternalMetaCrySL.g:1867:2: ( rule__AggregateList__LabelsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsAssignment_0()); 
            }
            // InternalMetaCrySL.g:1868:2: ( rule__AggregateList__LabelsAssignment_0 )
            // InternalMetaCrySL.g:1868:3: rule__AggregateList__LabelsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AggregateList__LabelsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getLabelsAssignment_0()); 
            }

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
    // $ANTLR end "rule__AggregateList__Group__0__Impl"


    // $ANTLR start "rule__AggregateList__Group__1"
    // InternalMetaCrySL.g:1876:1: rule__AggregateList__Group__1 : rule__AggregateList__Group__1__Impl ;
    public final void rule__AggregateList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1880:1: ( rule__AggregateList__Group__1__Impl )
            // InternalMetaCrySL.g:1881:2: rule__AggregateList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregateList__Group__1"


    // $ANTLR start "rule__AggregateList__Group__1__Impl"
    // InternalMetaCrySL.g:1887:1: rule__AggregateList__Group__1__Impl : ( ( rule__AggregateList__Group_1__0 )* ) ;
    public final void rule__AggregateList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1891:1: ( ( ( rule__AggregateList__Group_1__0 )* ) )
            // InternalMetaCrySL.g:1892:1: ( ( rule__AggregateList__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:1892:1: ( ( rule__AggregateList__Group_1__0 )* )
            // InternalMetaCrySL.g:1893:2: ( rule__AggregateList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:1894:2: ( rule__AggregateList__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMetaCrySL.g:1894:3: rule__AggregateList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AggregateList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AggregateList__Group__1__Impl"


    // $ANTLR start "rule__AggregateList__Group_1__0"
    // InternalMetaCrySL.g:1903:1: rule__AggregateList__Group_1__0 : rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1 ;
    public final void rule__AggregateList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1907:1: ( rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1 )
            // InternalMetaCrySL.g:1908:2: rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AggregateList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregateList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregateList__Group_1__0"


    // $ANTLR start "rule__AggregateList__Group_1__0__Impl"
    // InternalMetaCrySL.g:1915:1: rule__AggregateList__Group_1__0__Impl : ( '|' ) ;
    public final void rule__AggregateList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1919:1: ( ( '|' ) )
            // InternalMetaCrySL.g:1920:1: ( '|' )
            {
            // InternalMetaCrySL.g:1920:1: ( '|' )
            // InternalMetaCrySL.g:1921:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getVerticalLineKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__AggregateList__Group_1__0__Impl"


    // $ANTLR start "rule__AggregateList__Group_1__1"
    // InternalMetaCrySL.g:1930:1: rule__AggregateList__Group_1__1 : rule__AggregateList__Group_1__1__Impl ;
    public final void rule__AggregateList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1934:1: ( rule__AggregateList__Group_1__1__Impl )
            // InternalMetaCrySL.g:1935:2: rule__AggregateList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AggregateList__Group_1__1"


    // $ANTLR start "rule__AggregateList__Group_1__1__Impl"
    // InternalMetaCrySL.g:1941:1: rule__AggregateList__Group_1__1__Impl : ( ( rule__AggregateList__LabelsAssignment_1_1 ) ) ;
    public final void rule__AggregateList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1945:1: ( ( ( rule__AggregateList__LabelsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:1946:1: ( ( rule__AggregateList__LabelsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:1946:1: ( ( rule__AggregateList__LabelsAssignment_1_1 ) )
            // InternalMetaCrySL.g:1947:2: ( rule__AggregateList__LabelsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:1948:2: ( rule__AggregateList__LabelsAssignment_1_1 )
            // InternalMetaCrySL.g:1948:3: rule__AggregateList__LabelsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregateList__LabelsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getLabelsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AggregateList__Group_1__1__Impl"


    // $ANTLR start "rule__MethodDef__Group__0"
    // InternalMetaCrySL.g:1957:1: rule__MethodDef__Group__0 : rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1 ;
    public final void rule__MethodDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1961:1: ( rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1 )
            // InternalMetaCrySL.g:1962:2: rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__MethodDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodDef__Group__0"


    // $ANTLR start "rule__MethodDef__Group__0__Impl"
    // InternalMetaCrySL.g:1969:1: rule__MethodDef__Group__0__Impl : ( ( rule__MethodDef__MethodNameAssignment_0 ) ) ;
    public final void rule__MethodDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1973:1: ( ( ( rule__MethodDef__MethodNameAssignment_0 ) ) )
            // InternalMetaCrySL.g:1974:1: ( ( rule__MethodDef__MethodNameAssignment_0 ) )
            {
            // InternalMetaCrySL.g:1974:1: ( ( rule__MethodDef__MethodNameAssignment_0 ) )
            // InternalMetaCrySL.g:1975:2: ( rule__MethodDef__MethodNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getMethodNameAssignment_0()); 
            }
            // InternalMetaCrySL.g:1976:2: ( rule__MethodDef__MethodNameAssignment_0 )
            // InternalMetaCrySL.g:1976:3: rule__MethodDef__MethodNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDef__MethodNameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getMethodNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__MethodDef__Group__0__Impl"


    // $ANTLR start "rule__MethodDef__Group__1"
    // InternalMetaCrySL.g:1984:1: rule__MethodDef__Group__1 : rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2 ;
    public final void rule__MethodDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1988:1: ( rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2 )
            // InternalMetaCrySL.g:1989:2: rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__MethodDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodDef__Group__1"


    // $ANTLR start "rule__MethodDef__Group__1__Impl"
    // InternalMetaCrySL.g:1996:1: rule__MethodDef__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2000:1: ( ( '(' ) )
            // InternalMetaCrySL.g:2001:1: ( '(' )
            {
            // InternalMetaCrySL.g:2001:1: ( '(' )
            // InternalMetaCrySL.g:2002:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__MethodDef__Group__1__Impl"


    // $ANTLR start "rule__MethodDef__Group__2"
    // InternalMetaCrySL.g:2011:1: rule__MethodDef__Group__2 : rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3 ;
    public final void rule__MethodDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2015:1: ( rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3 )
            // InternalMetaCrySL.g:2016:2: rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__MethodDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodDef__Group__2"


    // $ANTLR start "rule__MethodDef__Group__2__Impl"
    // InternalMetaCrySL.g:2023:1: rule__MethodDef__Group__2__Impl : ( ( rule__MethodDef__ArgsAssignment_2 )? ) ;
    public final void rule__MethodDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2027:1: ( ( ( rule__MethodDef__ArgsAssignment_2 )? ) )
            // InternalMetaCrySL.g:2028:1: ( ( rule__MethodDef__ArgsAssignment_2 )? )
            {
            // InternalMetaCrySL.g:2028:1: ( ( rule__MethodDef__ArgsAssignment_2 )? )
            // InternalMetaCrySL.g:2029:2: ( rule__MethodDef__ArgsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getArgsAssignment_2()); 
            }
            // InternalMetaCrySL.g:2030:2: ( rule__MethodDef__ArgsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMetaCrySL.g:2030:3: rule__MethodDef__ArgsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDef__ArgsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getArgsAssignment_2()); 
            }

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
    // $ANTLR end "rule__MethodDef__Group__2__Impl"


    // $ANTLR start "rule__MethodDef__Group__3"
    // InternalMetaCrySL.g:2038:1: rule__MethodDef__Group__3 : rule__MethodDef__Group__3__Impl ;
    public final void rule__MethodDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2042:1: ( rule__MethodDef__Group__3__Impl )
            // InternalMetaCrySL.g:2043:2: rule__MethodDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MethodDef__Group__3"


    // $ANTLR start "rule__MethodDef__Group__3__Impl"
    // InternalMetaCrySL.g:2049:1: rule__MethodDef__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2053:1: ( ( ')' ) )
            // InternalMetaCrySL.g:2054:1: ( ')' )
            {
            // InternalMetaCrySL.g:2054:1: ( ')' )
            // InternalMetaCrySL.g:2055:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__MethodDef__Group__3__Impl"


    // $ANTLR start "rule__FormalArgs__Group__0"
    // InternalMetaCrySL.g:2065:1: rule__FormalArgs__Group__0 : rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1 ;
    public final void rule__FormalArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2069:1: ( rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1 )
            // InternalMetaCrySL.g:2070:2: rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FormalArgs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FormalArgs__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormalArgs__Group__0"


    // $ANTLR start "rule__FormalArgs__Group__0__Impl"
    // InternalMetaCrySL.g:2077:1: rule__FormalArgs__Group__0__Impl : ( ( rule__FormalArgs__ArgsAssignment_0 ) ) ;
    public final void rule__FormalArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2081:1: ( ( ( rule__FormalArgs__ArgsAssignment_0 ) ) )
            // InternalMetaCrySL.g:2082:1: ( ( rule__FormalArgs__ArgsAssignment_0 ) )
            {
            // InternalMetaCrySL.g:2082:1: ( ( rule__FormalArgs__ArgsAssignment_0 ) )
            // InternalMetaCrySL.g:2083:2: ( rule__FormalArgs__ArgsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsAssignment_0()); 
            }
            // InternalMetaCrySL.g:2084:2: ( rule__FormalArgs__ArgsAssignment_0 )
            // InternalMetaCrySL.g:2084:3: rule__FormalArgs__ArgsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FormalArgs__ArgsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsAssignment_0()); 
            }

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
    // $ANTLR end "rule__FormalArgs__Group__0__Impl"


    // $ANTLR start "rule__FormalArgs__Group__1"
    // InternalMetaCrySL.g:2092:1: rule__FormalArgs__Group__1 : rule__FormalArgs__Group__1__Impl ;
    public final void rule__FormalArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2096:1: ( rule__FormalArgs__Group__1__Impl )
            // InternalMetaCrySL.g:2097:2: rule__FormalArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalArgs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormalArgs__Group__1"


    // $ANTLR start "rule__FormalArgs__Group__1__Impl"
    // InternalMetaCrySL.g:2103:1: rule__FormalArgs__Group__1__Impl : ( ( rule__FormalArgs__Group_1__0 )* ) ;
    public final void rule__FormalArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2107:1: ( ( ( rule__FormalArgs__Group_1__0 )* ) )
            // InternalMetaCrySL.g:2108:1: ( ( rule__FormalArgs__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:2108:1: ( ( rule__FormalArgs__Group_1__0 )* )
            // InternalMetaCrySL.g:2109:2: ( rule__FormalArgs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:2110:2: ( rule__FormalArgs__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMetaCrySL.g:2110:3: rule__FormalArgs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FormalArgs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__FormalArgs__Group__1__Impl"


    // $ANTLR start "rule__FormalArgs__Group_1__0"
    // InternalMetaCrySL.g:2119:1: rule__FormalArgs__Group_1__0 : rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1 ;
    public final void rule__FormalArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2123:1: ( rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1 )
            // InternalMetaCrySL.g:2124:2: rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__FormalArgs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FormalArgs__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormalArgs__Group_1__0"


    // $ANTLR start "rule__FormalArgs__Group_1__0__Impl"
    // InternalMetaCrySL.g:2131:1: rule__FormalArgs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FormalArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2135:1: ( ( ',' ) )
            // InternalMetaCrySL.g:2136:1: ( ',' )
            {
            // InternalMetaCrySL.g:2136:1: ( ',' )
            // InternalMetaCrySL.g:2137:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getCommaKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__FormalArgs__Group_1__0__Impl"


    // $ANTLR start "rule__FormalArgs__Group_1__1"
    // InternalMetaCrySL.g:2146:1: rule__FormalArgs__Group_1__1 : rule__FormalArgs__Group_1__1__Impl ;
    public final void rule__FormalArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2150:1: ( rule__FormalArgs__Group_1__1__Impl )
            // InternalMetaCrySL.g:2151:2: rule__FormalArgs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormalArgs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FormalArgs__Group_1__1"


    // $ANTLR start "rule__FormalArgs__Group_1__1__Impl"
    // InternalMetaCrySL.g:2157:1: rule__FormalArgs__Group_1__1__Impl : ( ( rule__FormalArgs__ArgsAssignment_1_1 ) ) ;
    public final void rule__FormalArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2161:1: ( ( ( rule__FormalArgs__ArgsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:2162:1: ( ( rule__FormalArgs__ArgsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:2162:1: ( ( rule__FormalArgs__ArgsAssignment_1_1 ) )
            // InternalMetaCrySL.g:2163:2: ( rule__FormalArgs__ArgsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:2164:2: ( rule__FormalArgs__ArgsAssignment_1_1 )
            // InternalMetaCrySL.g:2164:3: rule__FormalArgs__ArgsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormalArgs__ArgsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__FormalArgs__Group_1__1__Impl"


    // $ANTLR start "rule__OrderSpec__Group__0"
    // InternalMetaCrySL.g:2173:1: rule__OrderSpec__Group__0 : rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1 ;
    public final void rule__OrderSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2177:1: ( rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1 )
            // InternalMetaCrySL.g:2178:2: rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OrderSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrderSpec__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrderSpec__Group__0"


    // $ANTLR start "rule__OrderSpec__Group__0__Impl"
    // InternalMetaCrySL.g:2185:1: rule__OrderSpec__Group__0__Impl : ( () ) ;
    public final void rule__OrderSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2189:1: ( ( () ) )
            // InternalMetaCrySL.g:2190:1: ( () )
            {
            // InternalMetaCrySL.g:2190:1: ( () )
            // InternalMetaCrySL.g:2191:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getOrderSpecAction_0()); 
            }
            // InternalMetaCrySL.g:2192:2: ()
            // InternalMetaCrySL.g:2192:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecAccess().getOrderSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderSpec__Group__0__Impl"


    // $ANTLR start "rule__OrderSpec__Group__1"
    // InternalMetaCrySL.g:2200:1: rule__OrderSpec__Group__1 : rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2 ;
    public final void rule__OrderSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2204:1: ( rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2 )
            // InternalMetaCrySL.g:2205:2: rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__OrderSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrderSpec__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrderSpec__Group__1"


    // $ANTLR start "rule__OrderSpec__Group__1__Impl"
    // InternalMetaCrySL.g:2212:1: rule__OrderSpec__Group__1__Impl : ( 'ORDER' ) ;
    public final void rule__OrderSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2216:1: ( ( 'ORDER' ) )
            // InternalMetaCrySL.g:2217:1: ( 'ORDER' )
            {
            // InternalMetaCrySL.g:2217:1: ( 'ORDER' )
            // InternalMetaCrySL.g:2218:2: 'ORDER'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getORDERKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecAccess().getORDERKeyword_1()); 
            }

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
    // $ANTLR end "rule__OrderSpec__Group__1__Impl"


    // $ANTLR start "rule__OrderSpec__Group__2"
    // InternalMetaCrySL.g:2227:1: rule__OrderSpec__Group__2 : rule__OrderSpec__Group__2__Impl ;
    public final void rule__OrderSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2231:1: ( rule__OrderSpec__Group__2__Impl )
            // InternalMetaCrySL.g:2232:2: rule__OrderSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrderSpec__Group__2"


    // $ANTLR start "rule__OrderSpec__Group__2__Impl"
    // InternalMetaCrySL.g:2238:1: rule__OrderSpec__Group__2__Impl : ( ( rule__OrderSpec__OrderAssignment_2 ) ) ;
    public final void rule__OrderSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2242:1: ( ( ( rule__OrderSpec__OrderAssignment_2 ) ) )
            // InternalMetaCrySL.g:2243:1: ( ( rule__OrderSpec__OrderAssignment_2 ) )
            {
            // InternalMetaCrySL.g:2243:1: ( ( rule__OrderSpec__OrderAssignment_2 ) )
            // InternalMetaCrySL.g:2244:2: ( rule__OrderSpec__OrderAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getOrderAssignment_2()); 
            }
            // InternalMetaCrySL.g:2245:2: ( rule__OrderSpec__OrderAssignment_2 )
            // InternalMetaCrySL.g:2245:3: rule__OrderSpec__OrderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderSpec__OrderAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecAccess().getOrderAssignment_2()); 
            }

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
    // $ANTLR end "rule__OrderSpec__Group__2__Impl"


    // $ANTLR start "rule__EventExp__Group_0__0"
    // InternalMetaCrySL.g:2254:1: rule__EventExp__Group_0__0 : rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1 ;
    public final void rule__EventExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2258:1: ( rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1 )
            // InternalMetaCrySL.g:2259:2: rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__EventExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_0__0"


    // $ANTLR start "rule__EventExp__Group_0__0__Impl"
    // InternalMetaCrySL.g:2266:1: rule__EventExp__Group_0__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2270:1: ( ( () ) )
            // InternalMetaCrySL.g:2271:1: ( () )
            {
            // InternalMetaCrySL.g:2271:1: ( () )
            // InternalMetaCrySL.g:2272:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getOptionalAction_0_0()); 
            }
            // InternalMetaCrySL.g:2273:2: ()
            // InternalMetaCrySL.g:2273:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getOptionalAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExp__Group_0__0__Impl"


    // $ANTLR start "rule__EventExp__Group_0__1"
    // InternalMetaCrySL.g:2281:1: rule__EventExp__Group_0__1 : rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2 ;
    public final void rule__EventExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2285:1: ( rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2 )
            // InternalMetaCrySL.g:2286:2: rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2
            {
            pushFollow(FOLLOW_23);
            rule__EventExp__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_0__1"


    // $ANTLR start "rule__EventExp__Group_0__1__Impl"
    // InternalMetaCrySL.g:2293:1: rule__EventExp__Group_0__1__Impl : ( ( rule__EventExp__ExpAssignment_0_1 ) ) ;
    public final void rule__EventExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2297:1: ( ( ( rule__EventExp__ExpAssignment_0_1 ) ) )
            // InternalMetaCrySL.g:2298:1: ( ( rule__EventExp__ExpAssignment_0_1 ) )
            {
            // InternalMetaCrySL.g:2298:1: ( ( rule__EventExp__ExpAssignment_0_1 ) )
            // InternalMetaCrySL.g:2299:2: ( rule__EventExp__ExpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_0_1()); 
            }
            // InternalMetaCrySL.g:2300:2: ( rule__EventExp__ExpAssignment_0_1 )
            // InternalMetaCrySL.g:2300:3: rule__EventExp__ExpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__ExpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_0__1__Impl"


    // $ANTLR start "rule__EventExp__Group_0__2"
    // InternalMetaCrySL.g:2308:1: rule__EventExp__Group_0__2 : rule__EventExp__Group_0__2__Impl ;
    public final void rule__EventExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2312:1: ( rule__EventExp__Group_0__2__Impl )
            // InternalMetaCrySL.g:2313:2: rule__EventExp__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_0__2"


    // $ANTLR start "rule__EventExp__Group_0__2__Impl"
    // InternalMetaCrySL.g:2319:1: rule__EventExp__Group_0__2__Impl : ( '?' ) ;
    public final void rule__EventExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2323:1: ( ( '?' ) )
            // InternalMetaCrySL.g:2324:1: ( '?' )
            {
            // InternalMetaCrySL.g:2324:1: ( '?' )
            // InternalMetaCrySL.g:2325:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getQuestionMarkKeyword_0_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getQuestionMarkKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_0__2__Impl"


    // $ANTLR start "rule__EventExp__Group_1__0"
    // InternalMetaCrySL.g:2335:1: rule__EventExp__Group_1__0 : rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1 ;
    public final void rule__EventExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2339:1: ( rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1 )
            // InternalMetaCrySL.g:2340:2: rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__EventExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_1__0"


    // $ANTLR start "rule__EventExp__Group_1__0__Impl"
    // InternalMetaCrySL.g:2347:1: rule__EventExp__Group_1__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2351:1: ( ( () ) )
            // InternalMetaCrySL.g:2352:1: ( () )
            {
            // InternalMetaCrySL.g:2352:1: ( () )
            // InternalMetaCrySL.g:2353:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getZeroOrMoreAction_1_0()); 
            }
            // InternalMetaCrySL.g:2354:2: ()
            // InternalMetaCrySL.g:2354:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getZeroOrMoreAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExp__Group_1__0__Impl"


    // $ANTLR start "rule__EventExp__Group_1__1"
    // InternalMetaCrySL.g:2362:1: rule__EventExp__Group_1__1 : rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2 ;
    public final void rule__EventExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2366:1: ( rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2 )
            // InternalMetaCrySL.g:2367:2: rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__EventExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_1__1"


    // $ANTLR start "rule__EventExp__Group_1__1__Impl"
    // InternalMetaCrySL.g:2374:1: rule__EventExp__Group_1__1__Impl : ( ( rule__EventExp__ExpAssignment_1_1 ) ) ;
    public final void rule__EventExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2378:1: ( ( ( rule__EventExp__ExpAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:2379:1: ( ( rule__EventExp__ExpAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:2379:1: ( ( rule__EventExp__ExpAssignment_1_1 ) )
            // InternalMetaCrySL.g:2380:2: ( rule__EventExp__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:2381:2: ( rule__EventExp__ExpAssignment_1_1 )
            // InternalMetaCrySL.g:2381:3: rule__EventExp__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__ExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_1__1__Impl"


    // $ANTLR start "rule__EventExp__Group_1__2"
    // InternalMetaCrySL.g:2389:1: rule__EventExp__Group_1__2 : rule__EventExp__Group_1__2__Impl ;
    public final void rule__EventExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2393:1: ( rule__EventExp__Group_1__2__Impl )
            // InternalMetaCrySL.g:2394:2: rule__EventExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_1__2"


    // $ANTLR start "rule__EventExp__Group_1__2__Impl"
    // InternalMetaCrySL.g:2400:1: rule__EventExp__Group_1__2__Impl : ( '*' ) ;
    public final void rule__EventExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2404:1: ( ( '*' ) )
            // InternalMetaCrySL.g:2405:1: ( '*' )
            {
            // InternalMetaCrySL.g:2405:1: ( '*' )
            // InternalMetaCrySL.g:2406:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getAsteriskKeyword_1_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getAsteriskKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_1__2__Impl"


    // $ANTLR start "rule__EventExp__Group_2__0"
    // InternalMetaCrySL.g:2416:1: rule__EventExp__Group_2__0 : rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1 ;
    public final void rule__EventExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2420:1: ( rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1 )
            // InternalMetaCrySL.g:2421:2: rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__EventExp__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_2__0"


    // $ANTLR start "rule__EventExp__Group_2__0__Impl"
    // InternalMetaCrySL.g:2428:1: rule__EventExp__Group_2__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2432:1: ( ( () ) )
            // InternalMetaCrySL.g:2433:1: ( () )
            {
            // InternalMetaCrySL.g:2433:1: ( () )
            // InternalMetaCrySL.g:2434:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getOneOrMoreAction_2_0()); 
            }
            // InternalMetaCrySL.g:2435:2: ()
            // InternalMetaCrySL.g:2435:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getOneOrMoreAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExp__Group_2__0__Impl"


    // $ANTLR start "rule__EventExp__Group_2__1"
    // InternalMetaCrySL.g:2443:1: rule__EventExp__Group_2__1 : rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2 ;
    public final void rule__EventExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2447:1: ( rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2 )
            // InternalMetaCrySL.g:2448:2: rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__EventExp__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_2__1"


    // $ANTLR start "rule__EventExp__Group_2__1__Impl"
    // InternalMetaCrySL.g:2455:1: rule__EventExp__Group_2__1__Impl : ( ( rule__EventExp__ExpAssignment_2_1 ) ) ;
    public final void rule__EventExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2459:1: ( ( ( rule__EventExp__ExpAssignment_2_1 ) ) )
            // InternalMetaCrySL.g:2460:1: ( ( rule__EventExp__ExpAssignment_2_1 ) )
            {
            // InternalMetaCrySL.g:2460:1: ( ( rule__EventExp__ExpAssignment_2_1 ) )
            // InternalMetaCrySL.g:2461:2: ( rule__EventExp__ExpAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_2_1()); 
            }
            // InternalMetaCrySL.g:2462:2: ( rule__EventExp__ExpAssignment_2_1 )
            // InternalMetaCrySL.g:2462:3: rule__EventExp__ExpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__ExpAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_2__1__Impl"


    // $ANTLR start "rule__EventExp__Group_2__2"
    // InternalMetaCrySL.g:2470:1: rule__EventExp__Group_2__2 : rule__EventExp__Group_2__2__Impl ;
    public final void rule__EventExp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2474:1: ( rule__EventExp__Group_2__2__Impl )
            // InternalMetaCrySL.g:2475:2: rule__EventExp__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_2__2"


    // $ANTLR start "rule__EventExp__Group_2__2__Impl"
    // InternalMetaCrySL.g:2481:1: rule__EventExp__Group_2__2__Impl : ( '+' ) ;
    public final void rule__EventExp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2485:1: ( ( '+' ) )
            // InternalMetaCrySL.g:2486:1: ( '+' )
            {
            // InternalMetaCrySL.g:2486:1: ( '+' )
            // InternalMetaCrySL.g:2487:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getPlusSignKeyword_2_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getPlusSignKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_2__2__Impl"


    // $ANTLR start "rule__EventExp__Group_3__0"
    // InternalMetaCrySL.g:2497:1: rule__EventExp__Group_3__0 : rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1 ;
    public final void rule__EventExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2501:1: ( rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1 )
            // InternalMetaCrySL.g:2502:2: rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__EventExp__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_3__0"


    // $ANTLR start "rule__EventExp__Group_3__0__Impl"
    // InternalMetaCrySL.g:2509:1: rule__EventExp__Group_3__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2513:1: ( ( () ) )
            // InternalMetaCrySL.g:2514:1: ( () )
            {
            // InternalMetaCrySL.g:2514:1: ( () )
            // InternalMetaCrySL.g:2515:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getChoiceExpAction_3_0()); 
            }
            // InternalMetaCrySL.g:2516:2: ()
            // InternalMetaCrySL.g:2516:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getChoiceExpAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExp__Group_3__0__Impl"


    // $ANTLR start "rule__EventExp__Group_3__1"
    // InternalMetaCrySL.g:2524:1: rule__EventExp__Group_3__1 : rule__EventExp__Group_3__1__Impl ;
    public final void rule__EventExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2528:1: ( rule__EventExp__Group_3__1__Impl )
            // InternalMetaCrySL.g:2529:2: rule__EventExp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EventExp__Group_3__1"


    // $ANTLR start "rule__EventExp__Group_3__1__Impl"
    // InternalMetaCrySL.g:2535:1: rule__EventExp__Group_3__1__Impl : ( ( rule__EventExp__ExpAssignment_3_1 ) ) ;
    public final void rule__EventExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2539:1: ( ( ( rule__EventExp__ExpAssignment_3_1 ) ) )
            // InternalMetaCrySL.g:2540:1: ( ( rule__EventExp__ExpAssignment_3_1 ) )
            {
            // InternalMetaCrySL.g:2540:1: ( ( rule__EventExp__ExpAssignment_3_1 ) )
            // InternalMetaCrySL.g:2541:2: ( rule__EventExp__ExpAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_3_1()); 
            }
            // InternalMetaCrySL.g:2542:2: ( rule__EventExp__ExpAssignment_3_1 )
            // InternalMetaCrySL.g:2542:3: rule__EventExp__ExpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EventExp__ExpAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpAssignment_3_1()); 
            }

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
    // $ANTLR end "rule__EventExp__Group_3__1__Impl"


    // $ANTLR start "rule__ChoiceExp__Group__0"
    // InternalMetaCrySL.g:2551:1: rule__ChoiceExp__Group__0 : rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1 ;
    public final void rule__ChoiceExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2555:1: ( rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1 )
            // InternalMetaCrySL.g:2556:2: rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ChoiceExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group__0"


    // $ANTLR start "rule__ChoiceExp__Group__0__Impl"
    // InternalMetaCrySL.g:2563:1: rule__ChoiceExp__Group__0__Impl : ( ruleSequenceExp ) ;
    public final void rule__ChoiceExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2567:1: ( ( ruleSequenceExp ) )
            // InternalMetaCrySL.g:2568:1: ( ruleSequenceExp )
            {
            // InternalMetaCrySL.g:2568:1: ( ruleSequenceExp )
            // InternalMetaCrySL.g:2569:2: ruleSequenceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getSequenceExpParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getSequenceExpParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__Group__0__Impl"


    // $ANTLR start "rule__ChoiceExp__Group__1"
    // InternalMetaCrySL.g:2578:1: rule__ChoiceExp__Group__1 : rule__ChoiceExp__Group__1__Impl ;
    public final void rule__ChoiceExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2582:1: ( rule__ChoiceExp__Group__1__Impl )
            // InternalMetaCrySL.g:2583:2: rule__ChoiceExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group__1"


    // $ANTLR start "rule__ChoiceExp__Group__1__Impl"
    // InternalMetaCrySL.g:2589:1: rule__ChoiceExp__Group__1__Impl : ( ( rule__ChoiceExp__Group_1__0 )* ) ;
    public final void rule__ChoiceExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2593:1: ( ( ( rule__ChoiceExp__Group_1__0 )* ) )
            // InternalMetaCrySL.g:2594:1: ( ( rule__ChoiceExp__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:2594:1: ( ( rule__ChoiceExp__Group_1__0 )* )
            // InternalMetaCrySL.g:2595:2: ( rule__ChoiceExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:2596:2: ( rule__ChoiceExp__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMetaCrySL.g:2596:3: rule__ChoiceExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ChoiceExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__Group__1__Impl"


    // $ANTLR start "rule__ChoiceExp__Group_1__0"
    // InternalMetaCrySL.g:2605:1: rule__ChoiceExp__Group_1__0 : rule__ChoiceExp__Group_1__0__Impl ;
    public final void rule__ChoiceExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2609:1: ( rule__ChoiceExp__Group_1__0__Impl )
            // InternalMetaCrySL.g:2610:2: rule__ChoiceExp__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group_1__0"


    // $ANTLR start "rule__ChoiceExp__Group_1__0__Impl"
    // InternalMetaCrySL.g:2616:1: rule__ChoiceExp__Group_1__0__Impl : ( ( rule__ChoiceExp__Group_1_0__0 ) ) ;
    public final void rule__ChoiceExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2620:1: ( ( ( rule__ChoiceExp__Group_1_0__0 ) ) )
            // InternalMetaCrySL.g:2621:1: ( ( rule__ChoiceExp__Group_1_0__0 ) )
            {
            // InternalMetaCrySL.g:2621:1: ( ( rule__ChoiceExp__Group_1_0__0 ) )
            // InternalMetaCrySL.g:2622:2: ( rule__ChoiceExp__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup_1_0()); 
            }
            // InternalMetaCrySL.g:2623:2: ( rule__ChoiceExp__Group_1_0__0 )
            // InternalMetaCrySL.g:2623:3: rule__ChoiceExp__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__Group_1__0__Impl"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__0"
    // InternalMetaCrySL.g:2632:1: rule__ChoiceExp__Group_1_0__0 : rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1 ;
    public final void rule__ChoiceExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2636:1: ( rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1 )
            // InternalMetaCrySL.g:2637:2: rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__ChoiceExp__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group_1_0__0"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__0__Impl"
    // InternalMetaCrySL.g:2644:1: rule__ChoiceExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ChoiceExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2648:1: ( ( () ) )
            // InternalMetaCrySL.g:2649:1: ( () )
            {
            // InternalMetaCrySL.g:2649:1: ( () )
            // InternalMetaCrySL.g:2650:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0()); 
            }
            // InternalMetaCrySL.g:2651:2: ()
            // InternalMetaCrySL.g:2651:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__1"
    // InternalMetaCrySL.g:2659:1: rule__ChoiceExp__Group_1_0__1 : rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2 ;
    public final void rule__ChoiceExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2663:1: ( rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2 )
            // InternalMetaCrySL.g:2664:2: rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ChoiceExp__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group_1_0__1"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__1__Impl"
    // InternalMetaCrySL.g:2671:1: rule__ChoiceExp__Group_1_0__1__Impl : ( '|' ) ;
    public final void rule__ChoiceExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2675:1: ( ( '|' ) )
            // InternalMetaCrySL.g:2676:1: ( '|' )
            {
            // InternalMetaCrySL.g:2676:1: ( '|' )
            // InternalMetaCrySL.g:2677:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getVerticalLineKeyword_1_0_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getVerticalLineKeyword_1_0_1()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__2"
    // InternalMetaCrySL.g:2686:1: rule__ChoiceExp__Group_1_0__2 : rule__ChoiceExp__Group_1_0__2__Impl ;
    public final void rule__ChoiceExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2690:1: ( rule__ChoiceExp__Group_1_0__2__Impl )
            // InternalMetaCrySL.g:2691:2: rule__ChoiceExp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ChoiceExp__Group_1_0__2"


    // $ANTLR start "rule__ChoiceExp__Group_1_0__2__Impl"
    // InternalMetaCrySL.g:2697:1: rule__ChoiceExp__Group_1_0__2__Impl : ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__ChoiceExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2701:1: ( ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:2702:1: ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:2702:1: ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:2703:2: ( rule__ChoiceExp__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getRightAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:2704:2: ( rule__ChoiceExp__RightAssignment_1_0_2 )
            // InternalMetaCrySL.g:2704:3: rule__ChoiceExp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ChoiceExp__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getRightAssignment_1_0_2()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__Group_1_0__2__Impl"


    // $ANTLR start "rule__SequenceExp__Group__0"
    // InternalMetaCrySL.g:2713:1: rule__SequenceExp__Group__0 : rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1 ;
    public final void rule__SequenceExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2717:1: ( rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1 )
            // InternalMetaCrySL.g:2718:2: rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SequenceExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group__0"


    // $ANTLR start "rule__SequenceExp__Group__0__Impl"
    // InternalMetaCrySL.g:2725:1: rule__SequenceExp__Group__0__Impl : ( rulePrimaryExp ) ;
    public final void rule__SequenceExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2729:1: ( ( rulePrimaryExp ) )
            // InternalMetaCrySL.g:2730:1: ( rulePrimaryExp )
            {
            // InternalMetaCrySL.g:2730:1: ( rulePrimaryExp )
            // InternalMetaCrySL.g:2731:2: rulePrimaryExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getPrimaryExpParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getPrimaryExpParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__SequenceExp__Group__0__Impl"


    // $ANTLR start "rule__SequenceExp__Group__1"
    // InternalMetaCrySL.g:2740:1: rule__SequenceExp__Group__1 : rule__SequenceExp__Group__1__Impl ;
    public final void rule__SequenceExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2744:1: ( rule__SequenceExp__Group__1__Impl )
            // InternalMetaCrySL.g:2745:2: rule__SequenceExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group__1"


    // $ANTLR start "rule__SequenceExp__Group__1__Impl"
    // InternalMetaCrySL.g:2751:1: rule__SequenceExp__Group__1__Impl : ( ( rule__SequenceExp__Group_1__0 )* ) ;
    public final void rule__SequenceExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2755:1: ( ( ( rule__SequenceExp__Group_1__0 )* ) )
            // InternalMetaCrySL.g:2756:1: ( ( rule__SequenceExp__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:2756:1: ( ( rule__SequenceExp__Group_1__0 )* )
            // InternalMetaCrySL.g:2757:2: ( rule__SequenceExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:2758:2: ( rule__SequenceExp__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMetaCrySL.g:2758:3: rule__SequenceExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SequenceExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__SequenceExp__Group__1__Impl"


    // $ANTLR start "rule__SequenceExp__Group_1__0"
    // InternalMetaCrySL.g:2767:1: rule__SequenceExp__Group_1__0 : rule__SequenceExp__Group_1__0__Impl ;
    public final void rule__SequenceExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2771:1: ( rule__SequenceExp__Group_1__0__Impl )
            // InternalMetaCrySL.g:2772:2: rule__SequenceExp__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group_1__0"


    // $ANTLR start "rule__SequenceExp__Group_1__0__Impl"
    // InternalMetaCrySL.g:2778:1: rule__SequenceExp__Group_1__0__Impl : ( ( rule__SequenceExp__Group_1_0__0 ) ) ;
    public final void rule__SequenceExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2782:1: ( ( ( rule__SequenceExp__Group_1_0__0 ) ) )
            // InternalMetaCrySL.g:2783:1: ( ( rule__SequenceExp__Group_1_0__0 ) )
            {
            // InternalMetaCrySL.g:2783:1: ( ( rule__SequenceExp__Group_1_0__0 ) )
            // InternalMetaCrySL.g:2784:2: ( rule__SequenceExp__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup_1_0()); 
            }
            // InternalMetaCrySL.g:2785:2: ( rule__SequenceExp__Group_1_0__0 )
            // InternalMetaCrySL.g:2785:3: rule__SequenceExp__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__SequenceExp__Group_1__0__Impl"


    // $ANTLR start "rule__SequenceExp__Group_1_0__0"
    // InternalMetaCrySL.g:2794:1: rule__SequenceExp__Group_1_0__0 : rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1 ;
    public final void rule__SequenceExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2798:1: ( rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1 )
            // InternalMetaCrySL.g:2799:2: rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__SequenceExp__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group_1_0__0"


    // $ANTLR start "rule__SequenceExp__Group_1_0__0__Impl"
    // InternalMetaCrySL.g:2806:1: rule__SequenceExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SequenceExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2810:1: ( ( () ) )
            // InternalMetaCrySL.g:2811:1: ( () )
            {
            // InternalMetaCrySL.g:2811:1: ( () )
            // InternalMetaCrySL.g:2812:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0()); 
            }
            // InternalMetaCrySL.g:2813:2: ()
            // InternalMetaCrySL.g:2813:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__SequenceExp__Group_1_0__1"
    // InternalMetaCrySL.g:2821:1: rule__SequenceExp__Group_1_0__1 : rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2 ;
    public final void rule__SequenceExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2825:1: ( rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2 )
            // InternalMetaCrySL.g:2826:2: rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2
            {
            pushFollow(FOLLOW_22);
            rule__SequenceExp__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group_1_0__1"


    // $ANTLR start "rule__SequenceExp__Group_1_0__1__Impl"
    // InternalMetaCrySL.g:2833:1: rule__SequenceExp__Group_1_0__1__Impl : ( ',' ) ;
    public final void rule__SequenceExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2837:1: ( ( ',' ) )
            // InternalMetaCrySL.g:2838:1: ( ',' )
            {
            // InternalMetaCrySL.g:2838:1: ( ',' )
            // InternalMetaCrySL.g:2839:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getCommaKeyword_1_0_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getCommaKeyword_1_0_1()); 
            }

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
    // $ANTLR end "rule__SequenceExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__SequenceExp__Group_1_0__2"
    // InternalMetaCrySL.g:2848:1: rule__SequenceExp__Group_1_0__2 : rule__SequenceExp__Group_1_0__2__Impl ;
    public final void rule__SequenceExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2852:1: ( rule__SequenceExp__Group_1_0__2__Impl )
            // InternalMetaCrySL.g:2853:2: rule__SequenceExp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SequenceExp__Group_1_0__2"


    // $ANTLR start "rule__SequenceExp__Group_1_0__2__Impl"
    // InternalMetaCrySL.g:2859:1: rule__SequenceExp__Group_1_0__2__Impl : ( ( rule__SequenceExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__SequenceExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2863:1: ( ( ( rule__SequenceExp__RightAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:2864:1: ( ( rule__SequenceExp__RightAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:2864:1: ( ( rule__SequenceExp__RightAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:2865:2: ( rule__SequenceExp__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getRightAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:2866:2: ( rule__SequenceExp__RightAssignment_1_0_2 )
            // InternalMetaCrySL.g:2866:3: rule__SequenceExp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceExp__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getRightAssignment_1_0_2()); 
            }

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
    // $ANTLR end "rule__SequenceExp__Group_1_0__2__Impl"


    // $ANTLR start "rule__PrimaryExp__Group_1__0"
    // InternalMetaCrySL.g:2875:1: rule__PrimaryExp__Group_1__0 : rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1 ;
    public final void rule__PrimaryExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2879:1: ( rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1 )
            // InternalMetaCrySL.g:2880:2: rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PrimaryExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExp__Group_1__0"


    // $ANTLR start "rule__PrimaryExp__Group_1__0__Impl"
    // InternalMetaCrySL.g:2887:1: rule__PrimaryExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2891:1: ( ( '(' ) )
            // InternalMetaCrySL.g:2892:1: ( '(' )
            {
            // InternalMetaCrySL.g:2892:1: ( '(' )
            // InternalMetaCrySL.g:2893:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpAccess().getLeftParenthesisKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExp__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExp__Group_1__1"
    // InternalMetaCrySL.g:2902:1: rule__PrimaryExp__Group_1__1 : rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2 ;
    public final void rule__PrimaryExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2906:1: ( rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2 )
            // InternalMetaCrySL.g:2907:2: rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExp__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExp__Group_1__1"


    // $ANTLR start "rule__PrimaryExp__Group_1__1__Impl"
    // InternalMetaCrySL.g:2914:1: rule__PrimaryExp__Group_1__1__Impl : ( ruleChoiceExp ) ;
    public final void rule__PrimaryExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2918:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:2919:1: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:2919:1: ( ruleChoiceExp )
            // InternalMetaCrySL.g:2920:2: ruleChoiceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getChoiceExpParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpAccess().getChoiceExpParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__PrimaryExp__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExp__Group_1__2"
    // InternalMetaCrySL.g:2929:1: rule__PrimaryExp__Group_1__2 : rule__PrimaryExp__Group_1__2__Impl ;
    public final void rule__PrimaryExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2933:1: ( rule__PrimaryExp__Group_1__2__Impl )
            // InternalMetaCrySL.g:2934:2: rule__PrimaryExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExp__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExp__Group_1__2"


    // $ANTLR start "rule__PrimaryExp__Group_1__2__Impl"
    // InternalMetaCrySL.g:2940:1: rule__PrimaryExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2944:1: ( ( ')' ) )
            // InternalMetaCrySL.g:2945:1: ( ')' )
            {
            // InternalMetaCrySL.g:2945:1: ( ')' )
            // InternalMetaCrySL.g:2946:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpAccess().getRightParenthesisKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__PrimaryExp__Group_1__2__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0"
    // InternalMetaCrySL.g:2956:1: rule__JvmTypeReference__Group_0__0 : rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 ;
    public final void rule__JvmTypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2960:1: ( rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 )
            // InternalMetaCrySL.g:2961:2: rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__JvmTypeReference__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0__0__Impl"
    // InternalMetaCrySL.g:2968:1: rule__JvmTypeReference__Group_0__0__Impl : ( ruleJvmParameterizedTypeReference ) ;
    public final void rule__JvmTypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2972:1: ( ( ruleJvmParameterizedTypeReference ) )
            // InternalMetaCrySL.g:2973:1: ( ruleJvmParameterizedTypeReference )
            {
            // InternalMetaCrySL.g:2973:1: ( ruleJvmParameterizedTypeReference )
            // InternalMetaCrySL.g:2974:2: ruleJvmParameterizedTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1"
    // InternalMetaCrySL.g:2983:1: rule__JvmTypeReference__Group_0__1 : rule__JvmTypeReference__Group_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2987:1: ( rule__JvmTypeReference__Group_0__1__Impl )
            // InternalMetaCrySL.g:2988:2: rule__JvmTypeReference__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0__1__Impl"
    // InternalMetaCrySL.g:2994:1: rule__JvmTypeReference__Group_0__1__Impl : ( ( rule__JvmTypeReference__Group_0_1__0 )* ) ;
    public final void rule__JvmTypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2998:1: ( ( ( rule__JvmTypeReference__Group_0_1__0 )* ) )
            // InternalMetaCrySL.g:2999:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            {
            // InternalMetaCrySL.g:2999:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            // InternalMetaCrySL.g:3000:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:3001:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMetaCrySL.g:3001:3: rule__JvmTypeReference__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__JvmTypeReference__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }

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
    // $ANTLR end "rule__JvmTypeReference__Group_0__1__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0"
    // InternalMetaCrySL.g:3010:1: rule__JvmTypeReference__Group_0_1__0 : rule__JvmTypeReference__Group_0_1__0__Impl ;
    public final void rule__JvmTypeReference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3014:1: ( rule__JvmTypeReference__Group_0_1__0__Impl )
            // InternalMetaCrySL.g:3015:2: rule__JvmTypeReference__Group_0_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1__0__Impl"
    // InternalMetaCrySL.g:3021:1: rule__JvmTypeReference__Group_0_1__0__Impl : ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) ;
    public final void rule__JvmTypeReference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3025:1: ( ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) )
            // InternalMetaCrySL.g:3026:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            {
            // InternalMetaCrySL.g:3026:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            // InternalMetaCrySL.g:3027:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }
            // InternalMetaCrySL.g:3028:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            // InternalMetaCrySL.g:3028:3: rule__JvmTypeReference__Group_0_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0"
    // InternalMetaCrySL.g:3037:1: rule__JvmTypeReference__Group_0_1_0__0 : rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 ;
    public final void rule__JvmTypeReference__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3041:1: ( rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 )
            // InternalMetaCrySL.g:3042:2: rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1
            {
            pushFollow(FOLLOW_27);
            rule__JvmTypeReference__Group_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__0__Impl"
    // InternalMetaCrySL.g:3049:1: rule__JvmTypeReference__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3053:1: ( ( () ) )
            // InternalMetaCrySL.g:3054:1: ( () )
            {
            // InternalMetaCrySL.g:3054:1: ( () )
            // InternalMetaCrySL.g:3055:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }
            // InternalMetaCrySL.g:3056:2: ()
            // InternalMetaCrySL.g:3056:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1"
    // InternalMetaCrySL.g:3064:1: rule__JvmTypeReference__Group_0_1_0__1 : rule__JvmTypeReference__Group_0_1_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3068:1: ( rule__JvmTypeReference__Group_0_1_0__1__Impl )
            // InternalMetaCrySL.g:3069:2: rule__JvmTypeReference__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmTypeReference__Group_0_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1"


    // $ANTLR start "rule__JvmTypeReference__Group_0_1_0__1__Impl"
    // InternalMetaCrySL.g:3075:1: rule__JvmTypeReference__Group_0_1_0__1__Impl : ( ruleArrayBrackets ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3079:1: ( ( ruleArrayBrackets ) )
            // InternalMetaCrySL.g:3080:1: ( ruleArrayBrackets )
            {
            // InternalMetaCrySL.g:3080:1: ( ruleArrayBrackets )
            // InternalMetaCrySL.g:3081:2: ruleArrayBrackets
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
            }

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
    // $ANTLR end "rule__JvmTypeReference__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__ArrayBrackets__Group__0"
    // InternalMetaCrySL.g:3091:1: rule__ArrayBrackets__Group__0 : rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 ;
    public final void rule__ArrayBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3095:1: ( rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 )
            // InternalMetaCrySL.g:3096:2: rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ArrayBrackets__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayBrackets__Group__0"


    // $ANTLR start "rule__ArrayBrackets__Group__0__Impl"
    // InternalMetaCrySL.g:3103:1: rule__ArrayBrackets__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3107:1: ( ( '[' ) )
            // InternalMetaCrySL.g:3108:1: ( '[' )
            {
            // InternalMetaCrySL.g:3108:1: ( '[' )
            // InternalMetaCrySL.g:3109:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }

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
    // $ANTLR end "rule__ArrayBrackets__Group__0__Impl"


    // $ANTLR start "rule__ArrayBrackets__Group__1"
    // InternalMetaCrySL.g:3118:1: rule__ArrayBrackets__Group__1 : rule__ArrayBrackets__Group__1__Impl ;
    public final void rule__ArrayBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3122:1: ( rule__ArrayBrackets__Group__1__Impl )
            // InternalMetaCrySL.g:3123:2: rule__ArrayBrackets__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayBrackets__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayBrackets__Group__1"


    // $ANTLR start "rule__ArrayBrackets__Group__1__Impl"
    // InternalMetaCrySL.g:3129:1: rule__ArrayBrackets__Group__1__Impl : ( ']' ) ;
    public final void rule__ArrayBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3133:1: ( ( ']' ) )
            // InternalMetaCrySL.g:3134:1: ( ']' )
            {
            // InternalMetaCrySL.g:3134:1: ( ']' )
            // InternalMetaCrySL.g:3135:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__ArrayBrackets__Group__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0"
    // InternalMetaCrySL.g:3145:1: rule__XFunctionTypeRef__Group__0 : rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 ;
    public final void rule__XFunctionTypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3149:1: ( rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 )
            // InternalMetaCrySL.g:3150:2: rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XFunctionTypeRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group__0__Impl"
    // InternalMetaCrySL.g:3157:1: rule__XFunctionTypeRef__Group__0__Impl : ( ( rule__XFunctionTypeRef__Group_0__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3161:1: ( ( ( rule__XFunctionTypeRef__Group_0__0 )? ) )
            // InternalMetaCrySL.g:3162:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            {
            // InternalMetaCrySL.g:3162:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            // InternalMetaCrySL.g:3163:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }
            // InternalMetaCrySL.g:3164:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMetaCrySL.g:3164:3: rule__XFunctionTypeRef__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XFunctionTypeRef__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1"
    // InternalMetaCrySL.g:3172:1: rule__XFunctionTypeRef__Group__1 : rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 ;
    public final void rule__XFunctionTypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3176:1: ( rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 )
            // InternalMetaCrySL.g:3177:2: rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__XFunctionTypeRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group__1__Impl"
    // InternalMetaCrySL.g:3184:1: rule__XFunctionTypeRef__Group__1__Impl : ( '=>' ) ;
    public final void rule__XFunctionTypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3188:1: ( ( '=>' ) )
            // InternalMetaCrySL.g:3189:1: ( '=>' )
            {
            // InternalMetaCrySL.g:3189:1: ( '=>' )
            // InternalMetaCrySL.g:3190:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2"
    // InternalMetaCrySL.g:3199:1: rule__XFunctionTypeRef__Group__2 : rule__XFunctionTypeRef__Group__2__Impl ;
    public final void rule__XFunctionTypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3203:1: ( rule__XFunctionTypeRef__Group__2__Impl )
            // InternalMetaCrySL.g:3204:2: rule__XFunctionTypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group__2__Impl"
    // InternalMetaCrySL.g:3210:1: rule__XFunctionTypeRef__Group__2__Impl : ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) ;
    public final void rule__XFunctionTypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3214:1: ( ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) )
            // InternalMetaCrySL.g:3215:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            {
            // InternalMetaCrySL.g:3215:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            // InternalMetaCrySL.g:3216:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }
            // InternalMetaCrySL.g:3217:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            // InternalMetaCrySL.g:3217:3: rule__XFunctionTypeRef__ReturnTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ReturnTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0"
    // InternalMetaCrySL.g:3226:1: rule__XFunctionTypeRef__Group_0__0 : rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 ;
    public final void rule__XFunctionTypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3230:1: ( rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 )
            // InternalMetaCrySL.g:3231:2: rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__XFunctionTypeRef__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__0__Impl"
    // InternalMetaCrySL.g:3238:1: rule__XFunctionTypeRef__Group_0__0__Impl : ( '(' ) ;
    public final void rule__XFunctionTypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3242:1: ( ( '(' ) )
            // InternalMetaCrySL.g:3243:1: ( '(' )
            {
            // InternalMetaCrySL.g:3243:1: ( '(' )
            // InternalMetaCrySL.g:3244:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1"
    // InternalMetaCrySL.g:3253:1: rule__XFunctionTypeRef__Group_0__1 : rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 ;
    public final void rule__XFunctionTypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3257:1: ( rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 )
            // InternalMetaCrySL.g:3258:2: rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2
            {
            pushFollow(FOLLOW_30);
            rule__XFunctionTypeRef__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__1__Impl"
    // InternalMetaCrySL.g:3265:1: rule__XFunctionTypeRef__Group_0__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3269:1: ( ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) )
            // InternalMetaCrySL.g:3270:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            {
            // InternalMetaCrySL.g:3270:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            // InternalMetaCrySL.g:3271:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:3272:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||LA24_0==19||LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMetaCrySL.g:3272:3: rule__XFunctionTypeRef__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XFunctionTypeRef__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2"
    // InternalMetaCrySL.g:3280:1: rule__XFunctionTypeRef__Group_0__2 : rule__XFunctionTypeRef__Group_0__2__Impl ;
    public final void rule__XFunctionTypeRef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3284:1: ( rule__XFunctionTypeRef__Group_0__2__Impl )
            // InternalMetaCrySL.g:3285:2: rule__XFunctionTypeRef__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0__2__Impl"
    // InternalMetaCrySL.g:3291:1: rule__XFunctionTypeRef__Group_0__2__Impl : ( ')' ) ;
    public final void rule__XFunctionTypeRef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3295:1: ( ( ')' ) )
            // InternalMetaCrySL.g:3296:1: ( ')' )
            {
            // InternalMetaCrySL.g:3296:1: ( ')' )
            // InternalMetaCrySL.g:3297:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0__2__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0"
    // InternalMetaCrySL.g:3307:1: rule__XFunctionTypeRef__Group_0_1__0 : rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3311:1: ( rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 )
            // InternalMetaCrySL.g:3312:2: rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_19);
            rule__XFunctionTypeRef__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__0__Impl"
    // InternalMetaCrySL.g:3319:1: rule__XFunctionTypeRef__Group_0_1__0__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3323:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) )
            // InternalMetaCrySL.g:3324:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            {
            // InternalMetaCrySL.g:3324:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            // InternalMetaCrySL.g:3325:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }
            // InternalMetaCrySL.g:3326:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            // InternalMetaCrySL.g:3326:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1"
    // InternalMetaCrySL.g:3334:1: rule__XFunctionTypeRef__Group_0_1__1 : rule__XFunctionTypeRef__Group_0_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3338:1: ( rule__XFunctionTypeRef__Group_0_1__1__Impl )
            // InternalMetaCrySL.g:3339:2: rule__XFunctionTypeRef__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1__1__Impl"
    // InternalMetaCrySL.g:3345:1: rule__XFunctionTypeRef__Group_0_1__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3349:1: ( ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) )
            // InternalMetaCrySL.g:3350:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            {
            // InternalMetaCrySL.g:3350:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            // InternalMetaCrySL.g:3351:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }
            // InternalMetaCrySL.g:3352:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMetaCrySL.g:3352:3: rule__XFunctionTypeRef__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__XFunctionTypeRef__Group_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1__1__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0"
    // InternalMetaCrySL.g:3361:1: rule__XFunctionTypeRef__Group_0_1_1__0 : rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3365:1: ( rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 )
            // InternalMetaCrySL.g:3366:2: rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__XFunctionTypeRef__Group_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"
    // InternalMetaCrySL.g:3373:1: rule__XFunctionTypeRef__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3377:1: ( ( ',' ) )
            // InternalMetaCrySL.g:3378:1: ( ',' )
            {
            // InternalMetaCrySL.g:3378:1: ( ',' )
            // InternalMetaCrySL.g:3379:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1"
    // InternalMetaCrySL.g:3388:1: rule__XFunctionTypeRef__Group_0_1_1__1 : rule__XFunctionTypeRef__Group_0_1_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3392:1: ( rule__XFunctionTypeRef__Group_0_1_1__1__Impl )
            // InternalMetaCrySL.g:3393:2: rule__XFunctionTypeRef__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__Group_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1"


    // $ANTLR start "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"
    // InternalMetaCrySL.g:3399:1: rule__XFunctionTypeRef__Group_0_1_1__1__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3403:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) )
            // InternalMetaCrySL.g:3404:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            {
            // InternalMetaCrySL.g:3404:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            // InternalMetaCrySL.g:3405:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }
            // InternalMetaCrySL.g:3406:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            // InternalMetaCrySL.g:3406:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0"
    // InternalMetaCrySL.g:3415:1: rule__JvmParameterizedTypeReference__Group__0 : rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 ;
    public final void rule__JvmParameterizedTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3419:1: ( rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 )
            // InternalMetaCrySL.g:3420:2: rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__JvmParameterizedTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__0__Impl"
    // InternalMetaCrySL.g:3427:1: rule__JvmParameterizedTypeReference__Group__0__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3431:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) )
            // InternalMetaCrySL.g:3432:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            {
            // InternalMetaCrySL.g:3432:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            // InternalMetaCrySL.g:3433:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalMetaCrySL.g:3434:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            // InternalMetaCrySL.g:3434:3: rule__JvmParameterizedTypeReference__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1"
    // InternalMetaCrySL.g:3442:1: rule__JvmParameterizedTypeReference__Group__1 : rule__JvmParameterizedTypeReference__Group__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3446:1: ( rule__JvmParameterizedTypeReference__Group__1__Impl )
            // InternalMetaCrySL.g:3447:2: rule__JvmParameterizedTypeReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group__1__Impl"
    // InternalMetaCrySL.g:3453:1: rule__JvmParameterizedTypeReference__Group__1__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3457:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) )
            // InternalMetaCrySL.g:3458:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            {
            // InternalMetaCrySL.g:3458:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            // InternalMetaCrySL.g:3459:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:3460:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMetaCrySL.g:3460:3: rule__JvmParameterizedTypeReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmParameterizedTypeReference__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0"
    // InternalMetaCrySL.g:3469:1: rule__JvmParameterizedTypeReference__Group_1__0 : rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3473:1: ( rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 )
            // InternalMetaCrySL.g:3474:2: rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__JvmParameterizedTypeReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__0__Impl"
    // InternalMetaCrySL.g:3481:1: rule__JvmParameterizedTypeReference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3485:1: ( ( ( '<' ) ) )
            // InternalMetaCrySL.g:3486:1: ( ( '<' ) )
            {
            // InternalMetaCrySL.g:3486:1: ( ( '<' ) )
            // InternalMetaCrySL.g:3487:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // InternalMetaCrySL.g:3488:2: ( '<' )
            // InternalMetaCrySL.g:3488:3: '<'
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1"
    // InternalMetaCrySL.g:3496:1: rule__JvmParameterizedTypeReference__Group_1__1 : rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3500:1: ( rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 )
            // InternalMetaCrySL.g:3501:2: rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__JvmParameterizedTypeReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__1__Impl"
    // InternalMetaCrySL.g:3508:1: rule__JvmParameterizedTypeReference__Group_1__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3512:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:3513:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:3513:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            // InternalMetaCrySL.g:3514:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:3515:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            // InternalMetaCrySL.g:3515:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2"
    // InternalMetaCrySL.g:3523:1: rule__JvmParameterizedTypeReference__Group_1__2 : rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3527:1: ( rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 )
            // InternalMetaCrySL.g:3528:2: rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3
            {
            pushFollow(FOLLOW_33);
            rule__JvmParameterizedTypeReference__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__2__Impl"
    // InternalMetaCrySL.g:3535:1: rule__JvmParameterizedTypeReference__Group_1__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3539:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) )
            // InternalMetaCrySL.g:3540:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            {
            // InternalMetaCrySL.g:3540:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            // InternalMetaCrySL.g:3541:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }
            // InternalMetaCrySL.g:3542:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMetaCrySL.g:3542:3: rule__JvmParameterizedTypeReference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__JvmParameterizedTypeReference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3"
    // InternalMetaCrySL.g:3550:1: rule__JvmParameterizedTypeReference__Group_1__3 : rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3554:1: ( rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 )
            // InternalMetaCrySL.g:3555:2: rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4
            {
            pushFollow(FOLLOW_34);
            rule__JvmParameterizedTypeReference__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__3__Impl"
    // InternalMetaCrySL.g:3562:1: rule__JvmParameterizedTypeReference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3566:1: ( ( '>' ) )
            // InternalMetaCrySL.g:3567:1: ( '>' )
            {
            // InternalMetaCrySL.g:3567:1: ( '>' )
            // InternalMetaCrySL.g:3568:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__3__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__4"
    // InternalMetaCrySL.g:3577:1: rule__JvmParameterizedTypeReference__Group_1__4 : rule__JvmParameterizedTypeReference__Group_1__4__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3581:1: ( rule__JvmParameterizedTypeReference__Group_1__4__Impl )
            // InternalMetaCrySL.g:3582:2: rule__JvmParameterizedTypeReference__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__4"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1__4__Impl"
    // InternalMetaCrySL.g:3588:1: rule__JvmParameterizedTypeReference__Group_1__4__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3592:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) )
            // InternalMetaCrySL.g:3593:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            {
            // InternalMetaCrySL.g:3593:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            // InternalMetaCrySL.g:3594:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }
            // InternalMetaCrySL.g:3595:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMetaCrySL.g:3595:3: rule__JvmParameterizedTypeReference__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__JvmParameterizedTypeReference__Group_1_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1__4__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0"
    // InternalMetaCrySL.g:3604:1: rule__JvmParameterizedTypeReference__Group_1_2__0 : rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3608:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 )
            // InternalMetaCrySL.g:3609:2: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_32);
            rule__JvmParameterizedTypeReference__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"
    // InternalMetaCrySL.g:3616:1: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3620:1: ( ( ',' ) )
            // InternalMetaCrySL.g:3621:1: ( ',' )
            {
            // InternalMetaCrySL.g:3621:1: ( ',' )
            // InternalMetaCrySL.g:3622:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1"
    // InternalMetaCrySL.g:3631:1: rule__JvmParameterizedTypeReference__Group_1_2__1 : rule__JvmParameterizedTypeReference__Group_1_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3635:1: ( rule__JvmParameterizedTypeReference__Group_1_2__1__Impl )
            // InternalMetaCrySL.g:3636:2: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"
    // InternalMetaCrySL.g:3642:1: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3646:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) )
            // InternalMetaCrySL.g:3647:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalMetaCrySL.g:3647:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            // InternalMetaCrySL.g:3648:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalMetaCrySL.g:3649:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            // InternalMetaCrySL.g:3649:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_2__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__0"
    // InternalMetaCrySL.g:3658:1: rule__JvmParameterizedTypeReference__Group_1_4__0 : rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3662:1: ( rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 )
            // InternalMetaCrySL.g:3663:2: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1
            {
            pushFollow(FOLLOW_10);
            rule__JvmParameterizedTypeReference__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__0__Impl"
    // InternalMetaCrySL.g:3670:1: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3674:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) )
            // InternalMetaCrySL.g:3675:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            {
            // InternalMetaCrySL.g:3675:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            // InternalMetaCrySL.g:3676:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }
            // InternalMetaCrySL.g:3677:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            // InternalMetaCrySL.g:3677:3: rule__JvmParameterizedTypeReference__Group_1_4_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__1"
    // InternalMetaCrySL.g:3685:1: rule__JvmParameterizedTypeReference__Group_1_4__1 : rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3689:1: ( rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 )
            // InternalMetaCrySL.g:3690:2: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2
            {
            pushFollow(FOLLOW_31);
            rule__JvmParameterizedTypeReference__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__1__Impl"
    // InternalMetaCrySL.g:3697:1: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3701:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) )
            // InternalMetaCrySL.g:3702:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            {
            // InternalMetaCrySL.g:3702:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            // InternalMetaCrySL.g:3703:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }
            // InternalMetaCrySL.g:3704:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            // InternalMetaCrySL.g:3704:3: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__2"
    // InternalMetaCrySL.g:3712:1: rule__JvmParameterizedTypeReference__Group_1_4__2 : rule__JvmParameterizedTypeReference__Group_1_4__2__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3716:1: ( rule__JvmParameterizedTypeReference__Group_1_4__2__Impl )
            // InternalMetaCrySL.g:3717:2: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4__2__Impl"
    // InternalMetaCrySL.g:3723:1: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3727:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) )
            // InternalMetaCrySL.g:3728:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            {
            // InternalMetaCrySL.g:3728:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            // InternalMetaCrySL.g:3729:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }
            // InternalMetaCrySL.g:3730:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMetaCrySL.g:3730:3: rule__JvmParameterizedTypeReference__Group_1_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmParameterizedTypeReference__Group_1_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0__0"
    // InternalMetaCrySL.g:3739:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3743:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl )
            // InternalMetaCrySL.g:3744:2: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl"
    // InternalMetaCrySL.g:3750:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3754:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) )
            // InternalMetaCrySL.g:3755:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            {
            // InternalMetaCrySL.g:3755:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            // InternalMetaCrySL.g:3756:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }
            // InternalMetaCrySL.g:3757:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            // InternalMetaCrySL.g:3757:3: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0"
    // InternalMetaCrySL.g:3766:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3770:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 )
            // InternalMetaCrySL.g:3771:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1
            {
            pushFollow(FOLLOW_34);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl"
    // InternalMetaCrySL.g:3778:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl : ( () ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3782:1: ( ( () ) )
            // InternalMetaCrySL.g:3783:1: ( () )
            {
            // InternalMetaCrySL.g:3783:1: ( () )
            // InternalMetaCrySL.g:3784:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }
            // InternalMetaCrySL.g:3785:2: ()
            // InternalMetaCrySL.g:3785:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1"
    // InternalMetaCrySL.g:3793:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3797:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl )
            // InternalMetaCrySL.g:3798:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl"
    // InternalMetaCrySL.g:3804:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl : ( '.' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3808:1: ( ( '.' ) )
            // InternalMetaCrySL.g:3809:1: ( '.' )
            {
            // InternalMetaCrySL.g:3809:1: ( '.' )
            // InternalMetaCrySL.g:3810:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__0"
    // InternalMetaCrySL.g:3820:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3824:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 )
            // InternalMetaCrySL.g:3825:2: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1
            {
            pushFollow(FOLLOW_32);
            rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl"
    // InternalMetaCrySL.g:3832:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3836:1: ( ( ( '<' ) ) )
            // InternalMetaCrySL.g:3837:1: ( ( '<' ) )
            {
            // InternalMetaCrySL.g:3837:1: ( ( '<' ) )
            // InternalMetaCrySL.g:3838:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }
            // InternalMetaCrySL.g:3839:2: ( '<' )
            // InternalMetaCrySL.g:3839:3: '<'
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__1"
    // InternalMetaCrySL.g:3847:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3851:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 )
            // InternalMetaCrySL.g:3852:2: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2
            {
            pushFollow(FOLLOW_33);
            rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl"
    // InternalMetaCrySL.g:3859:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3863:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) )
            // InternalMetaCrySL.g:3864:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            {
            // InternalMetaCrySL.g:3864:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            // InternalMetaCrySL.g:3865:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }
            // InternalMetaCrySL.g:3866:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            // InternalMetaCrySL.g:3866:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__2"
    // InternalMetaCrySL.g:3874:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2 : rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3878:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 )
            // InternalMetaCrySL.g:3879:2: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3
            {
            pushFollow(FOLLOW_33);
            rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl"
    // InternalMetaCrySL.g:3886:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3890:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) )
            // InternalMetaCrySL.g:3891:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            {
            // InternalMetaCrySL.g:3891:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            // InternalMetaCrySL.g:3892:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }
            // InternalMetaCrySL.g:3893:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMetaCrySL.g:3893:3: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__JvmParameterizedTypeReference__Group_1_4_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__3"
    // InternalMetaCrySL.g:3901:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3 : rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3905:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl )
            // InternalMetaCrySL.g:3906:2: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__3"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl"
    // InternalMetaCrySL.g:3912:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3916:1: ( ( '>' ) )
            // InternalMetaCrySL.g:3917:1: ( '>' )
            {
            // InternalMetaCrySL.g:3917:1: ( '>' )
            // InternalMetaCrySL.g:3918:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0"
    // InternalMetaCrySL.g:3928:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3932:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 )
            // InternalMetaCrySL.g:3933:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1
            {
            pushFollow(FOLLOW_32);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl"
    // InternalMetaCrySL.g:3940:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3944:1: ( ( ',' ) )
            // InternalMetaCrySL.g:3945:1: ( ',' )
            {
            // InternalMetaCrySL.g:3945:1: ( ',' )
            // InternalMetaCrySL.g:3946:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1"
    // InternalMetaCrySL.g:3955:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3959:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl )
            // InternalMetaCrySL.g:3960:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl"
    // InternalMetaCrySL.g:3966:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3970:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) )
            // InternalMetaCrySL.g:3971:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            {
            // InternalMetaCrySL.g:3971:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            // InternalMetaCrySL.g:3972:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }
            // InternalMetaCrySL.g:3973:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            // InternalMetaCrySL.g:3973:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0"
    // InternalMetaCrySL.g:3982:1: rule__JvmWildcardTypeReference__Group__0 : rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 ;
    public final void rule__JvmWildcardTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3986:1: ( rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 )
            // InternalMetaCrySL.g:3987:2: rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__JvmWildcardTypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__0__Impl"
    // InternalMetaCrySL.g:3994:1: rule__JvmWildcardTypeReference__Group__0__Impl : ( () ) ;
    public final void rule__JvmWildcardTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3998:1: ( ( () ) )
            // InternalMetaCrySL.g:3999:1: ( () )
            {
            // InternalMetaCrySL.g:3999:1: ( () )
            // InternalMetaCrySL.g:4000:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }
            // InternalMetaCrySL.g:4001:2: ()
            // InternalMetaCrySL.g:4001:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1"
    // InternalMetaCrySL.g:4009:1: rule__JvmWildcardTypeReference__Group__1 : rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 ;
    public final void rule__JvmWildcardTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4013:1: ( rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 )
            // InternalMetaCrySL.g:4014:2: rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__JvmWildcardTypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__1__Impl"
    // InternalMetaCrySL.g:4021:1: rule__JvmWildcardTypeReference__Group__1__Impl : ( '?' ) ;
    public final void rule__JvmWildcardTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4025:1: ( ( '?' ) )
            // InternalMetaCrySL.g:4026:1: ( '?' )
            {
            // InternalMetaCrySL.g:4026:1: ( '?' )
            // InternalMetaCrySL.g:4027:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2"
    // InternalMetaCrySL.g:4036:1: rule__JvmWildcardTypeReference__Group__2 : rule__JvmWildcardTypeReference__Group__2__Impl ;
    public final void rule__JvmWildcardTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4040:1: ( rule__JvmWildcardTypeReference__Group__2__Impl )
            // InternalMetaCrySL.g:4041:2: rule__JvmWildcardTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group__2__Impl"
    // InternalMetaCrySL.g:4047:1: rule__JvmWildcardTypeReference__Group__2__Impl : ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) ;
    public final void rule__JvmWildcardTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4051:1: ( ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) )
            // InternalMetaCrySL.g:4052:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            {
            // InternalMetaCrySL.g:4052:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            // InternalMetaCrySL.g:4053:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }
            // InternalMetaCrySL.g:4054:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32||LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMetaCrySL.g:4054:3: rule__JvmWildcardTypeReference__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JvmWildcardTypeReference__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group__2__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__0"
    // InternalMetaCrySL.g:4063:1: rule__JvmWildcardTypeReference__Group_2_0__0 : rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4067:1: ( rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 )
            // InternalMetaCrySL.g:4068:2: rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1
            {
            pushFollow(FOLLOW_37);
            rule__JvmWildcardTypeReference__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__0__Impl"
    // InternalMetaCrySL.g:4075:1: rule__JvmWildcardTypeReference__Group_2_0__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4079:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) )
            // InternalMetaCrySL.g:4080:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            {
            // InternalMetaCrySL.g:4080:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            // InternalMetaCrySL.g:4081:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }
            // InternalMetaCrySL.g:4082:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            // InternalMetaCrySL.g:4082:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__1"
    // InternalMetaCrySL.g:4090:1: rule__JvmWildcardTypeReference__Group_2_0__1 : rule__JvmWildcardTypeReference__Group_2_0__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4094:1: ( rule__JvmWildcardTypeReference__Group_2_0__1__Impl )
            // InternalMetaCrySL.g:4095:2: rule__JvmWildcardTypeReference__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_0__1__Impl"
    // InternalMetaCrySL.g:4101:1: rule__JvmWildcardTypeReference__Group_2_0__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4105:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) )
            // InternalMetaCrySL.g:4106:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            {
            // InternalMetaCrySL.g:4106:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            // InternalMetaCrySL.g:4107:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }
            // InternalMetaCrySL.g:4108:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMetaCrySL.g:4108:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_0__1__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__0"
    // InternalMetaCrySL.g:4117:1: rule__JvmWildcardTypeReference__Group_2_1__0 : rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4121:1: ( rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 )
            // InternalMetaCrySL.g:4122:2: rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1
            {
            pushFollow(FOLLOW_37);
            rule__JvmWildcardTypeReference__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__0"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__0__Impl"
    // InternalMetaCrySL.g:4129:1: rule__JvmWildcardTypeReference__Group_2_1__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4133:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) )
            // InternalMetaCrySL.g:4134:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            {
            // InternalMetaCrySL.g:4134:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            // InternalMetaCrySL.g:4135:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }
            // InternalMetaCrySL.g:4136:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            // InternalMetaCrySL.g:4136:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__0__Impl"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__1"
    // InternalMetaCrySL.g:4144:1: rule__JvmWildcardTypeReference__Group_2_1__1 : rule__JvmWildcardTypeReference__Group_2_1__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4148:1: ( rule__JvmWildcardTypeReference__Group_2_1__1__Impl )
            // InternalMetaCrySL.g:4149:2: rule__JvmWildcardTypeReference__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmWildcardTypeReference__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__1"


    // $ANTLR start "rule__JvmWildcardTypeReference__Group_2_1__1__Impl"
    // InternalMetaCrySL.g:4155:1: rule__JvmWildcardTypeReference__Group_2_1__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4159:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) )
            // InternalMetaCrySL.g:4160:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            {
            // InternalMetaCrySL.g:4160:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            // InternalMetaCrySL.g:4161:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }
            // InternalMetaCrySL.g:4162:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMetaCrySL.g:4162:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__Group_2_1__1__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__0"
    // InternalMetaCrySL.g:4171:1: rule__JvmUpperBound__Group__0 : rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 ;
    public final void rule__JvmUpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4175:1: ( rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 )
            // InternalMetaCrySL.g:4176:2: rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JvmUpperBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBound__Group__0"


    // $ANTLR start "rule__JvmUpperBound__Group__0__Impl"
    // InternalMetaCrySL.g:4183:1: rule__JvmUpperBound__Group__0__Impl : ( 'extends' ) ;
    public final void rule__JvmUpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4187:1: ( ( 'extends' ) )
            // InternalMetaCrySL.g:4188:1: ( 'extends' )
            {
            // InternalMetaCrySL.g:4188:1: ( 'extends' )
            // InternalMetaCrySL.g:4189:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }

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
    // $ANTLR end "rule__JvmUpperBound__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBound__Group__1"
    // InternalMetaCrySL.g:4198:1: rule__JvmUpperBound__Group__1 : rule__JvmUpperBound__Group__1__Impl ;
    public final void rule__JvmUpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4202:1: ( rule__JvmUpperBound__Group__1__Impl )
            // InternalMetaCrySL.g:4203:2: rule__JvmUpperBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBound__Group__1"


    // $ANTLR start "rule__JvmUpperBound__Group__1__Impl"
    // InternalMetaCrySL.g:4209:1: rule__JvmUpperBound__Group__1__Impl : ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4213:1: ( ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4214:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4214:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4215:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4216:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4216:3: rule__JvmUpperBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }

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
    // $ANTLR end "rule__JvmUpperBound__Group__1__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0"
    // InternalMetaCrySL.g:4225:1: rule__JvmUpperBoundAnded__Group__0 : rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 ;
    public final void rule__JvmUpperBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4229:1: ( rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 )
            // InternalMetaCrySL.g:4230:2: rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JvmUpperBoundAnded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__0__Impl"
    // InternalMetaCrySL.g:4237:1: rule__JvmUpperBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmUpperBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4241:1: ( ( '&' ) )
            // InternalMetaCrySL.g:4242:1: ( '&' )
            {
            // InternalMetaCrySL.g:4242:1: ( '&' )
            // InternalMetaCrySL.g:4243:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__0__Impl"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1"
    // InternalMetaCrySL.g:4252:1: rule__JvmUpperBoundAnded__Group__1 : rule__JvmUpperBoundAnded__Group__1__Impl ;
    public final void rule__JvmUpperBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4256:1: ( rule__JvmUpperBoundAnded__Group__1__Impl )
            // InternalMetaCrySL.g:4257:2: rule__JvmUpperBoundAnded__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1"


    // $ANTLR start "rule__JvmUpperBoundAnded__Group__1__Impl"
    // InternalMetaCrySL.g:4263:1: rule__JvmUpperBoundAnded__Group__1__Impl : ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4267:1: ( ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4268:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4268:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4269:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4270:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4270:3: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmUpperBoundAnded__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }

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
    // $ANTLR end "rule__JvmUpperBoundAnded__Group__1__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__0"
    // InternalMetaCrySL.g:4279:1: rule__JvmLowerBound__Group__0 : rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 ;
    public final void rule__JvmLowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4283:1: ( rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 )
            // InternalMetaCrySL.g:4284:2: rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JvmLowerBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBound__Group__0"


    // $ANTLR start "rule__JvmLowerBound__Group__0__Impl"
    // InternalMetaCrySL.g:4291:1: rule__JvmLowerBound__Group__0__Impl : ( 'super' ) ;
    public final void rule__JvmLowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4295:1: ( ( 'super' ) )
            // InternalMetaCrySL.g:4296:1: ( 'super' )
            {
            // InternalMetaCrySL.g:4296:1: ( 'super' )
            // InternalMetaCrySL.g:4297:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }

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
    // $ANTLR end "rule__JvmLowerBound__Group__0__Impl"


    // $ANTLR start "rule__JvmLowerBound__Group__1"
    // InternalMetaCrySL.g:4306:1: rule__JvmLowerBound__Group__1 : rule__JvmLowerBound__Group__1__Impl ;
    public final void rule__JvmLowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4310:1: ( rule__JvmLowerBound__Group__1__Impl )
            // InternalMetaCrySL.g:4311:2: rule__JvmLowerBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBound__Group__1"


    // $ANTLR start "rule__JvmLowerBound__Group__1__Impl"
    // InternalMetaCrySL.g:4317:1: rule__JvmLowerBound__Group__1__Impl : ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4321:1: ( ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4322:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4322:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4323:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4324:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4324:3: rule__JvmLowerBound__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBound__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }

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
    // $ANTLR end "rule__JvmLowerBound__Group__1__Impl"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__0"
    // InternalMetaCrySL.g:4333:1: rule__JvmLowerBoundAnded__Group__0 : rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 ;
    public final void rule__JvmLowerBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4337:1: ( rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 )
            // InternalMetaCrySL.g:4338:2: rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JvmLowerBoundAnded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__0"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__0__Impl"
    // InternalMetaCrySL.g:4345:1: rule__JvmLowerBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmLowerBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4349:1: ( ( '&' ) )
            // InternalMetaCrySL.g:4350:1: ( '&' )
            {
            // InternalMetaCrySL.g:4350:1: ( '&' )
            // InternalMetaCrySL.g:4351:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }

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
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__0__Impl"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__1"
    // InternalMetaCrySL.g:4360:1: rule__JvmLowerBoundAnded__Group__1 : rule__JvmLowerBoundAnded__Group__1__Impl ;
    public final void rule__JvmLowerBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4364:1: ( rule__JvmLowerBoundAnded__Group__1__Impl )
            // InternalMetaCrySL.g:4365:2: rule__JvmLowerBoundAnded__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__1"


    // $ANTLR start "rule__JvmLowerBoundAnded__Group__1__Impl"
    // InternalMetaCrySL.g:4371:1: rule__JvmLowerBoundAnded__Group__1__Impl : ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4375:1: ( ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4376:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4376:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4377:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4378:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4378:3: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JvmLowerBoundAnded__TypeReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }

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
    // $ANTLR end "rule__JvmLowerBoundAnded__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMetaCrySL.g:4387:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4391:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMetaCrySL.g:4392:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMetaCrySL.g:4399:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4403:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:4404:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:4404:1: ( ruleValidID )
            // InternalMetaCrySL.g:4405:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMetaCrySL.g:4414:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4418:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMetaCrySL.g:4419:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMetaCrySL.g:4425:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4429:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMetaCrySL.g:4430:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:4430:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMetaCrySL.g:4431:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:4432:2: ( rule__QualifiedName__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMetaCrySL.g:4432:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMetaCrySL.g:4441:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4445:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMetaCrySL.g:4446:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMetaCrySL.g:4453:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4457:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4458:1: ( '.' )
            {
            // InternalMetaCrySL.g:4458:1: ( '.' )
            // InternalMetaCrySL.g:4459:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMetaCrySL.g:4468:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4472:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMetaCrySL.g:4473:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMetaCrySL.g:4479:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4483:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:4484:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:4484:1: ( ruleValidID )
            // InternalMetaCrySL.g:4485:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMetaCrySL.g:4495:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4499:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMetaCrySL.g:4500:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMetaCrySL.g:4507:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4511:1: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:4512:1: ( ruleQualifiedName )
            {
            // InternalMetaCrySL.g:4512:1: ( ruleQualifiedName )
            // InternalMetaCrySL.g:4513:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMetaCrySL.g:4522:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4526:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // InternalMetaCrySL.g:4527:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMetaCrySL.g:4534:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4538:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4539:1: ( '.' )
            {
            // InternalMetaCrySL.g:4539:1: ( '.' )
            // InternalMetaCrySL.g:4540:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2"
    // InternalMetaCrySL.g:4549:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4553:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // InternalMetaCrySL.g:4554:2: rule__QualifiedNameWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__2__Impl"
    // InternalMetaCrySL.g:4560:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4564:1: ( ( '*' ) )
            // InternalMetaCrySL.g:4565:1: ( '*' )
            {
            // InternalMetaCrySL.g:4565:1: ( '*' )
            // InternalMetaCrySL.g:4566:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__0"
    // InternalMetaCrySL.g:4576:1: rule__XImportDeclaration__Group__0 : rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 ;
    public final void rule__XImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4580:1: ( rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 )
            // InternalMetaCrySL.g:4581:2: rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__XImportDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group__0"


    // $ANTLR start "rule__XImportDeclaration__Group__0__Impl"
    // InternalMetaCrySL.g:4588:1: rule__XImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__XImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4592:1: ( ( 'import' ) )
            // InternalMetaCrySL.g:4593:1: ( 'import' )
            {
            // InternalMetaCrySL.g:4593:1: ( 'import' )
            // InternalMetaCrySL.g:4594:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__1"
    // InternalMetaCrySL.g:4603:1: rule__XImportDeclaration__Group__1 : rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 ;
    public final void rule__XImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4607:1: ( rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 )
            // InternalMetaCrySL.g:4608:2: rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__XImportDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group__1"


    // $ANTLR start "rule__XImportDeclaration__Group__1__Impl"
    // InternalMetaCrySL.g:4615:1: rule__XImportDeclaration__Group__1__Impl : ( ( rule__XImportDeclaration__Alternatives_1 ) ) ;
    public final void rule__XImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4619:1: ( ( ( rule__XImportDeclaration__Alternatives_1 ) ) )
            // InternalMetaCrySL.g:4620:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            {
            // InternalMetaCrySL.g:4620:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            // InternalMetaCrySL.g:4621:2: ( rule__XImportDeclaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }
            // InternalMetaCrySL.g:4622:2: ( rule__XImportDeclaration__Alternatives_1 )
            // InternalMetaCrySL.g:4622:3: rule__XImportDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group__2"
    // InternalMetaCrySL.g:4630:1: rule__XImportDeclaration__Group__2 : rule__XImportDeclaration__Group__2__Impl ;
    public final void rule__XImportDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4634:1: ( rule__XImportDeclaration__Group__2__Impl )
            // InternalMetaCrySL.g:4635:2: rule__XImportDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group__2"


    // $ANTLR start "rule__XImportDeclaration__Group__2__Impl"
    // InternalMetaCrySL.g:4641:1: rule__XImportDeclaration__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__XImportDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4645:1: ( ( ( ';' )? ) )
            // InternalMetaCrySL.g:4646:1: ( ( ';' )? )
            {
            // InternalMetaCrySL.g:4646:1: ( ( ';' )? )
            // InternalMetaCrySL.g:4647:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }
            // InternalMetaCrySL.g:4648:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMetaCrySL.g:4648:3: ';'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__0"
    // InternalMetaCrySL.g:4657:1: rule__XImportDeclaration__Group_1_0__0 : rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 ;
    public final void rule__XImportDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4661:1: ( rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 )
            // InternalMetaCrySL.g:4662:2: rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_40);
            rule__XImportDeclaration__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__0"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__0__Impl"
    // InternalMetaCrySL.g:4669:1: rule__XImportDeclaration__Group_1_0__0__Impl : ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4673:1: ( ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) )
            // InternalMetaCrySL.g:4674:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            {
            // InternalMetaCrySL.g:4674:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            // InternalMetaCrySL.g:4675:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }
            // InternalMetaCrySL.g:4676:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            // InternalMetaCrySL.g:4676:3: rule__XImportDeclaration__StaticAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__StaticAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__0__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__1"
    // InternalMetaCrySL.g:4684:1: rule__XImportDeclaration__Group_1_0__1 : rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 ;
    public final void rule__XImportDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4688:1: ( rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 )
            // InternalMetaCrySL.g:4689:2: rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_40);
            rule__XImportDeclaration__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__1"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__1__Impl"
    // InternalMetaCrySL.g:4696:1: rule__XImportDeclaration__Group_1_0__1__Impl : ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) ;
    public final void rule__XImportDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4700:1: ( ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) )
            // InternalMetaCrySL.g:4701:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            {
            // InternalMetaCrySL.g:4701:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            // InternalMetaCrySL.g:4702:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }
            // InternalMetaCrySL.g:4703:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMetaCrySL.g:4703:3: rule__XImportDeclaration__ExtensionAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__XImportDeclaration__ExtensionAssignment_1_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__1__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__2"
    // InternalMetaCrySL.g:4711:1: rule__XImportDeclaration__Group_1_0__2 : rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 ;
    public final void rule__XImportDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4715:1: ( rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 )
            // InternalMetaCrySL.g:4716:2: rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3
            {
            pushFollow(FOLLOW_41);
            rule__XImportDeclaration__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__2"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__2__Impl"
    // InternalMetaCrySL.g:4723:1: rule__XImportDeclaration__Group_1_0__2__Impl : ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4727:1: ( ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:4728:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:4728:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:4729:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:4730:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            // InternalMetaCrySL.g:4730:3: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__ImportedTypeAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__2__Impl"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__3"
    // InternalMetaCrySL.g:4738:1: rule__XImportDeclaration__Group_1_0__3 : rule__XImportDeclaration__Group_1_0__3__Impl ;
    public final void rule__XImportDeclaration__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4742:1: ( rule__XImportDeclaration__Group_1_0__3__Impl )
            // InternalMetaCrySL.g:4743:2: rule__XImportDeclaration__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__3"


    // $ANTLR start "rule__XImportDeclaration__Group_1_0__3__Impl"
    // InternalMetaCrySL.g:4749:1: rule__XImportDeclaration__Group_1_0__3__Impl : ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4753:1: ( ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) )
            // InternalMetaCrySL.g:4754:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            {
            // InternalMetaCrySL.g:4754:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            // InternalMetaCrySL.g:4755:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }
            // InternalMetaCrySL.g:4756:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            // InternalMetaCrySL.g:4756:3: rule__XImportDeclaration__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__XImportDeclaration__Alternatives_1_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__Group_1_0__3__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0"
    // InternalMetaCrySL.g:4765:1: rule__QualifiedNameInStaticImport__Group__0 : rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 ;
    public final void rule__QualifiedNameInStaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4769:1: ( rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 )
            // InternalMetaCrySL.g:4770:2: rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedNameInStaticImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__0__Impl"
    // InternalMetaCrySL.g:4777:1: rule__QualifiedNameInStaticImport__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedNameInStaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4781:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:4782:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:4782:1: ( ruleValidID )
            // InternalMetaCrySL.g:4783:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1"
    // InternalMetaCrySL.g:4792:1: rule__QualifiedNameInStaticImport__Group__1 : rule__QualifiedNameInStaticImport__Group__1__Impl ;
    public final void rule__QualifiedNameInStaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4796:1: ( rule__QualifiedNameInStaticImport__Group__1__Impl )
            // InternalMetaCrySL.g:4797:2: rule__QualifiedNameInStaticImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameInStaticImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1"


    // $ANTLR start "rule__QualifiedNameInStaticImport__Group__1__Impl"
    // InternalMetaCrySL.g:4803:1: rule__QualifiedNameInStaticImport__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameInStaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4807:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4808:1: ( '.' )
            {
            // InternalMetaCrySL.g:4808:1: ( '.' )
            // InternalMetaCrySL.g:4809:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }

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
    // $ANTLR end "rule__QualifiedNameInStaticImport__Group__1__Impl"


    // $ANTLR start "rule__Model__MetaCrySLAssignment"
    // InternalMetaCrySL.g:4819:1: rule__Model__MetaCrySLAssignment : ( ruleSpec ) ;
    public final void rule__Model__MetaCrySLAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4823:1: ( ( ruleSpec ) )
            // InternalMetaCrySL.g:4824:2: ( ruleSpec )
            {
            // InternalMetaCrySL.g:4824:2: ( ruleSpec )
            // InternalMetaCrySL.g:4825:3: ruleSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetaCrySLSpecParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetaCrySLSpecParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Model__MetaCrySLAssignment"


    // $ANTLR start "rule__Spec__ClassNameAssignment_2"
    // InternalMetaCrySL.g:4834:1: rule__Spec__ClassNameAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__Spec__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4838:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:4839:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:4839:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:4840:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getClassNameJvmTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getClassNameJvmTypeReferenceParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Spec__ClassNameAssignment_2"


    // $ANTLR start "rule__Spec__ObjectSpecAssignment_3"
    // InternalMetaCrySL.g:4849:1: rule__Spec__ObjectSpecAssignment_3 : ( ruleObjectSpec ) ;
    public final void rule__Spec__ObjectSpecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4853:1: ( ( ruleObjectSpec ) )
            // InternalMetaCrySL.g:4854:2: ( ruleObjectSpec )
            {
            // InternalMetaCrySL.g:4854:2: ( ruleObjectSpec )
            // InternalMetaCrySL.g:4855:3: ruleObjectSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getObjectSpecObjectSpecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObjectSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getObjectSpecObjectSpecParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Spec__ObjectSpecAssignment_3"


    // $ANTLR start "rule__Spec__EventSpecAssignment_4"
    // InternalMetaCrySL.g:4864:1: rule__Spec__EventSpecAssignment_4 : ( ruleEventSpec ) ;
    public final void rule__Spec__EventSpecAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4868:1: ( ( ruleEventSpec ) )
            // InternalMetaCrySL.g:4869:2: ( ruleEventSpec )
            {
            // InternalMetaCrySL.g:4869:2: ( ruleEventSpec )
            // InternalMetaCrySL.g:4870:3: ruleEventSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getEventSpecEventSpecParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getEventSpecEventSpecParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__Spec__EventSpecAssignment_4"


    // $ANTLR start "rule__Spec__OrderSpecAssignment_5"
    // InternalMetaCrySL.g:4879:1: rule__Spec__OrderSpecAssignment_5 : ( ruleOrderSpec ) ;
    public final void rule__Spec__OrderSpecAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4883:1: ( ( ruleOrderSpec ) )
            // InternalMetaCrySL.g:4884:2: ( ruleOrderSpec )
            {
            // InternalMetaCrySL.g:4884:2: ( ruleOrderSpec )
            // InternalMetaCrySL.g:4885:3: ruleOrderSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getOrderSpecOrderSpecParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrderSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getOrderSpecOrderSpecParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__Spec__OrderSpecAssignment_5"


    // $ANTLR start "rule__ObjectSpec__ObjectsAssignment_3"
    // InternalMetaCrySL.g:4894:1: rule__ObjectSpec__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__ObjectSpec__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4898:1: ( ( ruleObject ) )
            // InternalMetaCrySL.g:4899:2: ( ruleObject )
            {
            // InternalMetaCrySL.g:4899:2: ( ruleObject )
            // InternalMetaCrySL.g:4900:3: ruleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectsObjectParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectSpecAccess().getObjectsObjectParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__ObjectSpec__ObjectsAssignment_3"


    // $ANTLR start "rule__Object__TypeAssignment_1"
    // InternalMetaCrySL.g:4909:1: rule__Object__TypeAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__Object__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4913:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:4914:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:4914:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:4915:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Object__TypeAssignment_1"


    // $ANTLR start "rule__Object__VarNameAssignment_2"
    // InternalMetaCrySL.g:4924:1: rule__Object__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Object__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4928:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:4929:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:4929:2: ( RULE_ID )
            // InternalMetaCrySL.g:4930:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Object__VarNameAssignment_2"


    // $ANTLR start "rule__EventSpec__EventsAssignment_2"
    // InternalMetaCrySL.g:4939:1: rule__EventSpec__EventsAssignment_2 : ( ruleEvent ) ;
    public final void rule__EventSpec__EventsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4943:1: ( ( ruleEvent ) )
            // InternalMetaCrySL.g:4944:2: ( ruleEvent )
            {
            // InternalMetaCrySL.g:4944:2: ( ruleEvent )
            // InternalMetaCrySL.g:4945:3: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventsEventParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventSpecAccess().getEventsEventParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__EventSpec__EventsAssignment_2"


    // $ANTLR start "rule__Event__LabelAssignment_0_1_0"
    // InternalMetaCrySL.g:4954:1: rule__Event__LabelAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4958:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:4959:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:4959:2: ( RULE_ID )
            // InternalMetaCrySL.g:4960:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_0_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_0_1_0_0()); 
            }

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
    // $ANTLR end "rule__Event__LabelAssignment_0_1_0"


    // $ANTLR start "rule__Event__VarAssignment_0_2_0"
    // InternalMetaCrySL.g:4969:1: rule__Event__VarAssignment_0_2_0 : ( RULE_ID ) ;
    public final void rule__Event__VarAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4973:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:4974:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:4974:2: ( RULE_ID )
            // InternalMetaCrySL.g:4975:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getVarIDTerminalRuleCall_0_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getVarIDTerminalRuleCall_0_2_0_0()); 
            }

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
    // $ANTLR end "rule__Event__VarAssignment_0_2_0"


    // $ANTLR start "rule__Event__MethodAssignment_0_3"
    // InternalMetaCrySL.g:4984:1: rule__Event__MethodAssignment_0_3 : ( ruleMethodDef ) ;
    public final void rule__Event__MethodAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4988:1: ( ( ruleMethodDef ) )
            // InternalMetaCrySL.g:4989:2: ( ruleMethodDef )
            {
            // InternalMetaCrySL.g:4989:2: ( ruleMethodDef )
            // InternalMetaCrySL.g:4990:3: ruleMethodDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getMethodMethodDefParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getMethodMethodDefParserRuleCall_0_3_0()); 
            }

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
    // $ANTLR end "rule__Event__MethodAssignment_0_3"


    // $ANTLR start "rule__Event__LabelAssignment_1_1_0"
    // InternalMetaCrySL.g:4999:1: rule__Event__LabelAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5003:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5004:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5004:2: ( RULE_ID )
            // InternalMetaCrySL.g:5005:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0_0()); 
            }

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
    // $ANTLR end "rule__Event__LabelAssignment_1_1_0"


    // $ANTLR start "rule__Event__AggregateAssignment_1_2"
    // InternalMetaCrySL.g:5014:1: rule__Event__AggregateAssignment_1_2 : ( ruleAggregateList ) ;
    public final void rule__Event__AggregateAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5018:1: ( ( ruleAggregateList ) )
            // InternalMetaCrySL.g:5019:2: ( ruleAggregateList )
            {
            // InternalMetaCrySL.g:5019:2: ( ruleAggregateList )
            // InternalMetaCrySL.g:5020:3: ruleAggregateList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAggregateAggregateListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAggregateList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getAggregateAggregateListParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Event__AggregateAssignment_1_2"


    // $ANTLR start "rule__AggregateList__LabelsAssignment_0"
    // InternalMetaCrySL.g:5029:1: rule__AggregateList__LabelsAssignment_0 : ( RULE_ID ) ;
    public final void rule__AggregateList__LabelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5033:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5034:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5034:2: ( RULE_ID )
            // InternalMetaCrySL.g:5035:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__AggregateList__LabelsAssignment_0"


    // $ANTLR start "rule__AggregateList__LabelsAssignment_1_1"
    // InternalMetaCrySL.g:5044:1: rule__AggregateList__LabelsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AggregateList__LabelsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5048:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5049:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5049:2: ( RULE_ID )
            // InternalMetaCrySL.g:5050:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__AggregateList__LabelsAssignment_1_1"


    // $ANTLR start "rule__MethodDef__MethodNameAssignment_0"
    // InternalMetaCrySL.g:5059:1: rule__MethodDef__MethodNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MethodDef__MethodNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5063:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5064:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5064:2: ( RULE_ID )
            // InternalMetaCrySL.g:5065:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getMethodNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getMethodNameIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__MethodDef__MethodNameAssignment_0"


    // $ANTLR start "rule__MethodDef__ArgsAssignment_2"
    // InternalMetaCrySL.g:5074:1: rule__MethodDef__ArgsAssignment_2 : ( ruleFormalArgs ) ;
    public final void rule__MethodDef__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5078:1: ( ( ruleFormalArgs ) )
            // InternalMetaCrySL.g:5079:2: ( ruleFormalArgs )
            {
            // InternalMetaCrySL.g:5079:2: ( ruleFormalArgs )
            // InternalMetaCrySL.g:5080:3: ruleFormalArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getArgsFormalArgsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormalArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDefAccess().getArgsFormalArgsParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__MethodDef__ArgsAssignment_2"


    // $ANTLR start "rule__FormalArgs__ArgsAssignment_0"
    // InternalMetaCrySL.g:5089:1: rule__FormalArgs__ArgsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FormalArgs__ArgsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5093:1: ( ( ( RULE_ID ) ) )
            // InternalMetaCrySL.g:5094:2: ( ( RULE_ID ) )
            {
            // InternalMetaCrySL.g:5094:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5095:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_0_0()); 
            }
            // InternalMetaCrySL.g:5096:3: ( RULE_ID )
            // InternalMetaCrySL.g:5097:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsFormalArgIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__FormalArgs__ArgsAssignment_0"


    // $ANTLR start "rule__FormalArgs__ArgsAssignment_1_1"
    // InternalMetaCrySL.g:5108:1: rule__FormalArgs__ArgsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FormalArgs__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5112:1: ( ( ( RULE_ID ) ) )
            // InternalMetaCrySL.g:5113:2: ( ( RULE_ID ) )
            {
            // InternalMetaCrySL.g:5113:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5114:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_1_1_0()); 
            }
            // InternalMetaCrySL.g:5115:3: ( RULE_ID )
            // InternalMetaCrySL.g:5116:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsFormalArgIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_1_1_0()); 
            }

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
    // $ANTLR end "rule__FormalArgs__ArgsAssignment_1_1"


    // $ANTLR start "rule__OrderSpec__OrderAssignment_2"
    // InternalMetaCrySL.g:5127:1: rule__OrderSpec__OrderAssignment_2 : ( ruleEventExp ) ;
    public final void rule__OrderSpec__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5131:1: ( ( ruleEventExp ) )
            // InternalMetaCrySL.g:5132:2: ( ruleEventExp )
            {
            // InternalMetaCrySL.g:5132:2: ( ruleEventExp )
            // InternalMetaCrySL.g:5133:3: ruleEventExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getOrderEventExpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderSpecAccess().getOrderEventExpParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__OrderSpec__OrderAssignment_2"


    // $ANTLR start "rule__EventExp__ExpAssignment_0_1"
    // InternalMetaCrySL.g:5142:1: rule__EventExp__ExpAssignment_0_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5146:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5147:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5147:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5148:3: ruleChoiceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__EventExp__ExpAssignment_0_1"


    // $ANTLR start "rule__EventExp__ExpAssignment_1_1"
    // InternalMetaCrySL.g:5157:1: rule__EventExp__ExpAssignment_1_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5161:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5162:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5162:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5163:3: ruleChoiceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__EventExp__ExpAssignment_1_1"


    // $ANTLR start "rule__EventExp__ExpAssignment_2_1"
    // InternalMetaCrySL.g:5172:1: rule__EventExp__ExpAssignment_2_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5176:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5177:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5177:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5178:3: ruleChoiceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__EventExp__ExpAssignment_2_1"


    // $ANTLR start "rule__EventExp__ExpAssignment_3_1"
    // InternalMetaCrySL.g:5187:1: rule__EventExp__ExpAssignment_3_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5191:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5192:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5192:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5193:3: ruleChoiceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoiceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_3_1_0()); 
            }

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
    // $ANTLR end "rule__EventExp__ExpAssignment_3_1"


    // $ANTLR start "rule__ChoiceExp__RightAssignment_1_0_2"
    // InternalMetaCrySL.g:5202:1: rule__ChoiceExp__RightAssignment_1_0_2 : ( ruleSequenceExp ) ;
    public final void rule__ChoiceExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5206:1: ( ( ruleSequenceExp ) )
            // InternalMetaCrySL.g:5207:2: ( ruleSequenceExp )
            {
            // InternalMetaCrySL.g:5207:2: ( ruleSequenceExp )
            // InternalMetaCrySL.g:5208:3: ruleSequenceExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getRightSequenceExpParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenceExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceExpAccess().getRightSequenceExpParserRuleCall_1_0_2_0()); 
            }

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
    // $ANTLR end "rule__ChoiceExp__RightAssignment_1_0_2"


    // $ANTLR start "rule__SequenceExp__RightAssignment_1_0_2"
    // InternalMetaCrySL.g:5217:1: rule__SequenceExp__RightAssignment_1_0_2 : ( rulePrimaryExp ) ;
    public final void rule__SequenceExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5221:1: ( ( rulePrimaryExp ) )
            // InternalMetaCrySL.g:5222:2: ( rulePrimaryExp )
            {
            // InternalMetaCrySL.g:5222:2: ( rulePrimaryExp )
            // InternalMetaCrySL.g:5223:3: rulePrimaryExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getRightPrimaryExpParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceExpAccess().getRightPrimaryExpParserRuleCall_1_0_2_0()); 
            }

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
    // $ANTLR end "rule__SequenceExp__RightAssignment_1_0_2"


    // $ANTLR start "rule__PrimaryExp__LabelAssignment_0"
    // InternalMetaCrySL.g:5232:1: rule__PrimaryExp__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__PrimaryExp__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5236:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5237:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5237:2: ( RULE_ID )
            // InternalMetaCrySL.g:5238:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpAccess().getLabelIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExp__LabelAssignment_0"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"
    // InternalMetaCrySL.g:5247:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5251:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5252:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5252:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5253:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0"


    // $ANTLR start "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"
    // InternalMetaCrySL.g:5262:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5266:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5267:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5267:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5268:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1"


    // $ANTLR start "rule__XFunctionTypeRef__ReturnTypeAssignment_2"
    // InternalMetaCrySL.g:5277:1: rule__XFunctionTypeRef__ReturnTypeAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5281:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5282:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5282:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5283:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__XFunctionTypeRef__ReturnTypeAssignment_2"


    // $ANTLR start "rule__JvmParameterizedTypeReference__TypeAssignment_0"
    // InternalMetaCrySL.g:5292:1: rule__JvmParameterizedTypeReference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5296:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMetaCrySL.g:5297:2: ( ( ruleQualifiedName ) )
            {
            // InternalMetaCrySL.g:5297:2: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:5298:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }
            // InternalMetaCrySL.g:5299:3: ( ruleQualifiedName )
            // InternalMetaCrySL.g:5300:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__TypeAssignment_0"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"
    // InternalMetaCrySL.g:5311:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5315:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5316:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5316:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5317:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"
    // InternalMetaCrySL.g:5326:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5330:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5331:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5331:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5332:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1"
    // InternalMetaCrySL.g:5341:1: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 : ( ( ruleValidID ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5345:1: ( ( ( ruleValidID ) ) )
            // InternalMetaCrySL.g:5346:2: ( ( ruleValidID ) )
            {
            // InternalMetaCrySL.g:5346:2: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:5347:3: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }
            // InternalMetaCrySL.g:5348:3: ( ruleValidID )
            // InternalMetaCrySL.g:5349:4: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeValidIDParserRuleCall_1_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeValidIDParserRuleCall_1_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1"
    // InternalMetaCrySL.g:5360:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5364:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5365:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5365:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5366:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1"


    // $ANTLR start "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1"
    // InternalMetaCrySL.g:5375:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5379:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5380:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5380:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5381:3: ruleJvmArgumentTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0()); 
            }

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
    // $ANTLR end "rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0"
    // InternalMetaCrySL.g:5390:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 : ( ruleJvmUpperBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5394:1: ( ( ruleJvmUpperBound ) )
            // InternalMetaCrySL.g:5395:2: ( ruleJvmUpperBound )
            {
            // InternalMetaCrySL.g:5395:2: ( ruleJvmUpperBound )
            // InternalMetaCrySL.g:5396:3: ruleJvmUpperBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1"
    // InternalMetaCrySL.g:5405:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 : ( ruleJvmUpperBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5409:1: ( ( ruleJvmUpperBoundAnded ) )
            // InternalMetaCrySL.g:5410:2: ( ruleJvmUpperBoundAnded )
            {
            // InternalMetaCrySL.g:5410:2: ( ruleJvmUpperBoundAnded )
            // InternalMetaCrySL.g:5411:3: ruleJvmUpperBoundAnded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0"
    // InternalMetaCrySL.g:5420:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 : ( ruleJvmLowerBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5424:1: ( ( ruleJvmLowerBound ) )
            // InternalMetaCrySL.g:5425:2: ( ruleJvmLowerBound )
            {
            // InternalMetaCrySL.g:5425:2: ( ruleJvmLowerBound )
            // InternalMetaCrySL.g:5426:3: ruleJvmLowerBound
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0"


    // $ANTLR start "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1"
    // InternalMetaCrySL.g:5435:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 : ( ruleJvmLowerBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5439:1: ( ( ruleJvmLowerBoundAnded ) )
            // InternalMetaCrySL.g:5440:2: ( ruleJvmLowerBoundAnded )
            {
            // InternalMetaCrySL.g:5440:2: ( ruleJvmLowerBoundAnded )
            // InternalMetaCrySL.g:5441:3: ruleJvmLowerBoundAnded
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0()); 
            }

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
    // $ANTLR end "rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1"


    // $ANTLR start "rule__JvmUpperBound__TypeReferenceAssignment_1"
    // InternalMetaCrySL.g:5450:1: rule__JvmUpperBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5454:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5455:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5455:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5456:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__JvmUpperBound__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"
    // InternalMetaCrySL.g:5465:1: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5469:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5470:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5470:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5471:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__JvmUpperBoundAnded__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmLowerBound__TypeReferenceAssignment_1"
    // InternalMetaCrySL.g:5480:1: rule__JvmLowerBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5484:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5485:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5485:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5486:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__JvmLowerBound__TypeReferenceAssignment_1"


    // $ANTLR start "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1"
    // InternalMetaCrySL.g:5495:1: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5499:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5500:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5500:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5501:3: ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__JvmLowerBoundAnded__TypeReferenceAssignment_1"


    // $ANTLR start "rule__XImportDeclaration__StaticAssignment_1_0_0"
    // InternalMetaCrySL.g:5510:1: rule__XImportDeclaration__StaticAssignment_1_0_0 : ( ( 'static' ) ) ;
    public final void rule__XImportDeclaration__StaticAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5514:1: ( ( ( 'static' ) ) )
            // InternalMetaCrySL.g:5515:2: ( ( 'static' ) )
            {
            // InternalMetaCrySL.g:5515:2: ( ( 'static' ) )
            // InternalMetaCrySL.g:5516:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            // InternalMetaCrySL.g:5517:3: ( 'static' )
            // InternalMetaCrySL.g:5518:4: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__StaticAssignment_1_0_0"


    // $ANTLR start "rule__XImportDeclaration__ExtensionAssignment_1_0_1"
    // InternalMetaCrySL.g:5529:1: rule__XImportDeclaration__ExtensionAssignment_1_0_1 : ( ( 'extension' ) ) ;
    public final void rule__XImportDeclaration__ExtensionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5533:1: ( ( ( 'extension' ) ) )
            // InternalMetaCrySL.g:5534:2: ( ( 'extension' ) )
            {
            // InternalMetaCrySL.g:5534:2: ( ( 'extension' ) )
            // InternalMetaCrySL.g:5535:3: ( 'extension' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            // InternalMetaCrySL.g:5536:3: ( 'extension' )
            // InternalMetaCrySL.g:5537:4: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__ExtensionAssignment_1_0_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2"
    // InternalMetaCrySL.g:5548:1: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 : ( ( ruleQualifiedNameInStaticImport ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5552:1: ( ( ( ruleQualifiedNameInStaticImport ) ) )
            // InternalMetaCrySL.g:5553:2: ( ( ruleQualifiedNameInStaticImport ) )
            {
            // InternalMetaCrySL.g:5553:2: ( ( ruleQualifiedNameInStaticImport ) )
            // InternalMetaCrySL.g:5554:3: ( ruleQualifiedNameInStaticImport )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }
            // InternalMetaCrySL.g:5555:3: ( ruleQualifiedNameInStaticImport )
            // InternalMetaCrySL.g:5556:4: ruleQualifiedNameInStaticImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameInStaticImportParserRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__ImportedTypeAssignment_1_0_2"


    // $ANTLR start "rule__XImportDeclaration__WildcardAssignment_1_0_3_0"
    // InternalMetaCrySL.g:5567:1: rule__XImportDeclaration__WildcardAssignment_1_0_3_0 : ( ( '*' ) ) ;
    public final void rule__XImportDeclaration__WildcardAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5571:1: ( ( ( '*' ) ) )
            // InternalMetaCrySL.g:5572:2: ( ( '*' ) )
            {
            // InternalMetaCrySL.g:5572:2: ( ( '*' ) )
            // InternalMetaCrySL.g:5573:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            // InternalMetaCrySL.g:5574:3: ( '*' )
            // InternalMetaCrySL.g:5575:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__WildcardAssignment_1_0_3_0"


    // $ANTLR start "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1"
    // InternalMetaCrySL.g:5586:1: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 : ( ruleValidID ) ;
    public final void rule__XImportDeclaration__MemberNameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5590:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:5591:2: ( ruleValidID )
            {
            // InternalMetaCrySL.g:5591:2: ( ruleValidID )
            // InternalMetaCrySL.g:5592:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__MemberNameAssignment_1_0_3_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedTypeAssignment_1_1"
    // InternalMetaCrySL.g:5601:1: rule__XImportDeclaration__ImportedTypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5605:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMetaCrySL.g:5606:2: ( ( ruleQualifiedName ) )
            {
            // InternalMetaCrySL.g:5606:2: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:5607:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }
            // InternalMetaCrySL.g:5608:3: ( ruleQualifiedName )
            // InternalMetaCrySL.g:5609:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__ImportedTypeAssignment_1_1"


    // $ANTLR start "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2"
    // InternalMetaCrySL.g:5620:1: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__XImportDeclaration__ImportedNamespaceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5624:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMetaCrySL.g:5625:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMetaCrySL.g:5625:2: ( ruleQualifiedNameWithWildcard )
            // InternalMetaCrySL.g:5626:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__XImportDeclaration__ImportedNamespaceAssignment_1_2"

    // $ANTLR start synpred3_InternalMetaCrySL
    public final void synpred3_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:811:2: ( ( ( rule__EventExp__Group_0__0 ) ) )
        // InternalMetaCrySL.g:811:2: ( ( rule__EventExp__Group_0__0 ) )
        {
        // InternalMetaCrySL.g:811:2: ( ( rule__EventExp__Group_0__0 ) )
        // InternalMetaCrySL.g:812:3: ( rule__EventExp__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_0()); 
        }
        // InternalMetaCrySL.g:813:3: ( rule__EventExp__Group_0__0 )
        // InternalMetaCrySL.g:813:4: rule__EventExp__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__EventExp__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalMetaCrySL

    // $ANTLR start synpred4_InternalMetaCrySL
    public final void synpred4_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:817:2: ( ( ( rule__EventExp__Group_1__0 ) ) )
        // InternalMetaCrySL.g:817:2: ( ( rule__EventExp__Group_1__0 ) )
        {
        // InternalMetaCrySL.g:817:2: ( ( rule__EventExp__Group_1__0 ) )
        // InternalMetaCrySL.g:818:3: ( rule__EventExp__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_1()); 
        }
        // InternalMetaCrySL.g:819:3: ( rule__EventExp__Group_1__0 )
        // InternalMetaCrySL.g:819:4: rule__EventExp__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__EventExp__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalMetaCrySL

    // $ANTLR start synpred5_InternalMetaCrySL
    public final void synpred5_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:823:2: ( ( ( rule__EventExp__Group_2__0 ) ) )
        // InternalMetaCrySL.g:823:2: ( ( rule__EventExp__Group_2__0 ) )
        {
        // InternalMetaCrySL.g:823:2: ( ( rule__EventExp__Group_2__0 ) )
        // InternalMetaCrySL.g:824:3: ( rule__EventExp__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_2()); 
        }
        // InternalMetaCrySL.g:825:3: ( rule__EventExp__Group_2__0 )
        // InternalMetaCrySL.g:825:4: rule__EventExp__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__EventExp__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMetaCrySL

    // Delegated rules

    public final boolean synpred3_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\16\1\4\1\uffff\1\16\1\uffff";
    static final String dfa_4s = "\1\44\1\uffff\1\37\1\30\1\uffff\1\37\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\37\uffff\1\1",
            "",
            "\1\4\20\uffff\1\3",
            "\1\5\23\uffff\1\6",
            "",
            "\1\4\20\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "923:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010080010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000409000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010080012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010180010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010880010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000010L});

}