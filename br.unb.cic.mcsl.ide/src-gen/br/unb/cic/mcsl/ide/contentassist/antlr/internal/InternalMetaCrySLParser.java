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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ABSTRACT'", "'SPEC'", "'OBJECTS'", "':'", "';'", "'FORBIDDEN'", "'('", "')'", "'=>'", "'EVENTS'", "'='", "':='", "'|'", "','", "'ORDER'", "'?'", "'*'", "'+'", "'['", "']'", "'<'", "'>'", "'.'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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


    // $ANTLR start "entryRuleForbiddenSpec"
    // InternalMetaCrySL.g:154:1: entryRuleForbiddenSpec : ruleForbiddenSpec EOF ;
    public final void entryRuleForbiddenSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:155:1: ( ruleForbiddenSpec EOF )
            // InternalMetaCrySL.g:156:1: ruleForbiddenSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForbiddenSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecRule()); 
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
    // $ANTLR end "entryRuleForbiddenSpec"


    // $ANTLR start "ruleForbiddenSpec"
    // InternalMetaCrySL.g:163:1: ruleForbiddenSpec : ( ( rule__ForbiddenSpec__Group__0 ) ) ;
    public final void ruleForbiddenSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:167:2: ( ( ( rule__ForbiddenSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:168:2: ( ( rule__ForbiddenSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:168:2: ( ( rule__ForbiddenSpec__Group__0 ) )
            // InternalMetaCrySL.g:169:3: ( rule__ForbiddenSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:170:3: ( rule__ForbiddenSpec__Group__0 )
            // InternalMetaCrySL.g:170:4: rule__ForbiddenSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleForbiddenSpec"


    // $ANTLR start "entryRuleForbiddenMethod"
    // InternalMetaCrySL.g:179:1: entryRuleForbiddenMethod : ruleForbiddenMethod EOF ;
    public final void entryRuleForbiddenMethod() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:180:1: ( ruleForbiddenMethod EOF )
            // InternalMetaCrySL.g:181:1: ruleForbiddenMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForbiddenMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodRule()); 
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
    // $ANTLR end "entryRuleForbiddenMethod"


    // $ANTLR start "ruleForbiddenMethod"
    // InternalMetaCrySL.g:188:1: ruleForbiddenMethod : ( ( rule__ForbiddenMethod__Group__0 ) ) ;
    public final void ruleForbiddenMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:192:2: ( ( ( rule__ForbiddenMethod__Group__0 ) ) )
            // InternalMetaCrySL.g:193:2: ( ( rule__ForbiddenMethod__Group__0 ) )
            {
            // InternalMetaCrySL.g:193:2: ( ( rule__ForbiddenMethod__Group__0 ) )
            // InternalMetaCrySL.g:194:3: ( rule__ForbiddenMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:195:3: ( rule__ForbiddenMethod__Group__0 )
            // InternalMetaCrySL.g:195:4: rule__ForbiddenMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleForbiddenMethod"


    // $ANTLR start "entryRuleEventSpec"
    // InternalMetaCrySL.g:204:1: entryRuleEventSpec : ruleEventSpec EOF ;
    public final void entryRuleEventSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:205:1: ( ruleEventSpec EOF )
            // InternalMetaCrySL.g:206:1: ruleEventSpec EOF
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
    // InternalMetaCrySL.g:213:1: ruleEventSpec : ( ( rule__EventSpec__Group__0 ) ) ;
    public final void ruleEventSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:217:2: ( ( ( rule__EventSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:218:2: ( ( rule__EventSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:218:2: ( ( rule__EventSpec__Group__0 ) )
            // InternalMetaCrySL.g:219:3: ( rule__EventSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:220:3: ( rule__EventSpec__Group__0 )
            // InternalMetaCrySL.g:220:4: rule__EventSpec__Group__0
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
    // InternalMetaCrySL.g:229:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:230:1: ( ruleEvent EOF )
            // InternalMetaCrySL.g:231:1: ruleEvent EOF
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
    // InternalMetaCrySL.g:238:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:242:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMetaCrySL.g:243:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMetaCrySL.g:243:2: ( ( rule__Event__Alternatives ) )
            // InternalMetaCrySL.g:244:3: ( rule__Event__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:245:3: ( rule__Event__Alternatives )
            // InternalMetaCrySL.g:245:4: rule__Event__Alternatives
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
    // InternalMetaCrySL.g:254:1: entryRuleAggregateList : ruleAggregateList EOF ;
    public final void entryRuleAggregateList() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:255:1: ( ruleAggregateList EOF )
            // InternalMetaCrySL.g:256:1: ruleAggregateList EOF
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
    // InternalMetaCrySL.g:263:1: ruleAggregateList : ( ( rule__AggregateList__Group__0 ) ) ;
    public final void ruleAggregateList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:267:2: ( ( ( rule__AggregateList__Group__0 ) ) )
            // InternalMetaCrySL.g:268:2: ( ( rule__AggregateList__Group__0 ) )
            {
            // InternalMetaCrySL.g:268:2: ( ( rule__AggregateList__Group__0 ) )
            // InternalMetaCrySL.g:269:3: ( rule__AggregateList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:270:3: ( rule__AggregateList__Group__0 )
            // InternalMetaCrySL.g:270:4: rule__AggregateList__Group__0
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
    // InternalMetaCrySL.g:279:1: entryRuleMethodDef : ruleMethodDef EOF ;
    public final void entryRuleMethodDef() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:280:1: ( ruleMethodDef EOF )
            // InternalMetaCrySL.g:281:1: ruleMethodDef EOF
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
    // InternalMetaCrySL.g:288:1: ruleMethodDef : ( ( rule__MethodDef__Group__0 ) ) ;
    public final void ruleMethodDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:292:2: ( ( ( rule__MethodDef__Group__0 ) ) )
            // InternalMetaCrySL.g:293:2: ( ( rule__MethodDef__Group__0 ) )
            {
            // InternalMetaCrySL.g:293:2: ( ( rule__MethodDef__Group__0 ) )
            // InternalMetaCrySL.g:294:3: ( rule__MethodDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:295:3: ( rule__MethodDef__Group__0 )
            // InternalMetaCrySL.g:295:4: rule__MethodDef__Group__0
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
    // InternalMetaCrySL.g:304:1: entryRuleFormalArgs : ruleFormalArgs EOF ;
    public final void entryRuleFormalArgs() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:305:1: ( ruleFormalArgs EOF )
            // InternalMetaCrySL.g:306:1: ruleFormalArgs EOF
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
    // InternalMetaCrySL.g:313:1: ruleFormalArgs : ( ( rule__FormalArgs__Group__0 ) ) ;
    public final void ruleFormalArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:317:2: ( ( ( rule__FormalArgs__Group__0 ) ) )
            // InternalMetaCrySL.g:318:2: ( ( rule__FormalArgs__Group__0 ) )
            {
            // InternalMetaCrySL.g:318:2: ( ( rule__FormalArgs__Group__0 ) )
            // InternalMetaCrySL.g:319:3: ( rule__FormalArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:320:3: ( rule__FormalArgs__Group__0 )
            // InternalMetaCrySL.g:320:4: rule__FormalArgs__Group__0
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
    // InternalMetaCrySL.g:329:1: entryRuleOrderSpec : ruleOrderSpec EOF ;
    public final void entryRuleOrderSpec() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:330:1: ( ruleOrderSpec EOF )
            // InternalMetaCrySL.g:331:1: ruleOrderSpec EOF
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
    // InternalMetaCrySL.g:338:1: ruleOrderSpec : ( ( rule__OrderSpec__Group__0 ) ) ;
    public final void ruleOrderSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:342:2: ( ( ( rule__OrderSpec__Group__0 ) ) )
            // InternalMetaCrySL.g:343:2: ( ( rule__OrderSpec__Group__0 ) )
            {
            // InternalMetaCrySL.g:343:2: ( ( rule__OrderSpec__Group__0 ) )
            // InternalMetaCrySL.g:344:3: ( rule__OrderSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:345:3: ( rule__OrderSpec__Group__0 )
            // InternalMetaCrySL.g:345:4: rule__OrderSpec__Group__0
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
    // InternalMetaCrySL.g:354:1: entryRuleEventExp : ruleEventExp EOF ;
    public final void entryRuleEventExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:355:1: ( ruleEventExp EOF )
            // InternalMetaCrySL.g:356:1: ruleEventExp EOF
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
    // InternalMetaCrySL.g:363:1: ruleEventExp : ( ( rule__EventExp__Alternatives ) ) ;
    public final void ruleEventExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:367:2: ( ( ( rule__EventExp__Alternatives ) ) )
            // InternalMetaCrySL.g:368:2: ( ( rule__EventExp__Alternatives ) )
            {
            // InternalMetaCrySL.g:368:2: ( ( rule__EventExp__Alternatives ) )
            // InternalMetaCrySL.g:369:3: ( rule__EventExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:370:3: ( rule__EventExp__Alternatives )
            // InternalMetaCrySL.g:370:4: rule__EventExp__Alternatives
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
    // InternalMetaCrySL.g:379:1: entryRuleChoiceExp : ruleChoiceExp EOF ;
    public final void entryRuleChoiceExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:380:1: ( ruleChoiceExp EOF )
            // InternalMetaCrySL.g:381:1: ruleChoiceExp EOF
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
    // InternalMetaCrySL.g:388:1: ruleChoiceExp : ( ( rule__ChoiceExp__Group__0 ) ) ;
    public final void ruleChoiceExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:392:2: ( ( ( rule__ChoiceExp__Group__0 ) ) )
            // InternalMetaCrySL.g:393:2: ( ( rule__ChoiceExp__Group__0 ) )
            {
            // InternalMetaCrySL.g:393:2: ( ( rule__ChoiceExp__Group__0 ) )
            // InternalMetaCrySL.g:394:3: ( rule__ChoiceExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:395:3: ( rule__ChoiceExp__Group__0 )
            // InternalMetaCrySL.g:395:4: rule__ChoiceExp__Group__0
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
    // InternalMetaCrySL.g:404:1: entryRuleSequenceExp : ruleSequenceExp EOF ;
    public final void entryRuleSequenceExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:405:1: ( ruleSequenceExp EOF )
            // InternalMetaCrySL.g:406:1: ruleSequenceExp EOF
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
    // InternalMetaCrySL.g:413:1: ruleSequenceExp : ( ( rule__SequenceExp__Group__0 ) ) ;
    public final void ruleSequenceExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:417:2: ( ( ( rule__SequenceExp__Group__0 ) ) )
            // InternalMetaCrySL.g:418:2: ( ( rule__SequenceExp__Group__0 ) )
            {
            // InternalMetaCrySL.g:418:2: ( ( rule__SequenceExp__Group__0 ) )
            // InternalMetaCrySL.g:419:3: ( rule__SequenceExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:420:3: ( rule__SequenceExp__Group__0 )
            // InternalMetaCrySL.g:420:4: rule__SequenceExp__Group__0
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
    // InternalMetaCrySL.g:429:1: entryRulePrimaryExp : rulePrimaryExp EOF ;
    public final void entryRulePrimaryExp() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:430:1: ( rulePrimaryExp EOF )
            // InternalMetaCrySL.g:431:1: rulePrimaryExp EOF
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
    // InternalMetaCrySL.g:438:1: rulePrimaryExp : ( ( rule__PrimaryExp__Alternatives ) ) ;
    public final void rulePrimaryExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:442:2: ( ( ( rule__PrimaryExp__Alternatives ) ) )
            // InternalMetaCrySL.g:443:2: ( ( rule__PrimaryExp__Alternatives ) )
            {
            // InternalMetaCrySL.g:443:2: ( ( rule__PrimaryExp__Alternatives ) )
            // InternalMetaCrySL.g:444:3: ( rule__PrimaryExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:445:3: ( rule__PrimaryExp__Alternatives )
            // InternalMetaCrySL.g:445:4: rule__PrimaryExp__Alternatives
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
    // InternalMetaCrySL.g:454:1: entryRuleJvmTypeReference : ruleJvmTypeReference EOF ;
    public final void entryRuleJvmTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:455:1: ( ruleJvmTypeReference EOF )
            // InternalMetaCrySL.g:456:1: ruleJvmTypeReference EOF
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
    // InternalMetaCrySL.g:463:1: ruleJvmTypeReference : ( ( rule__JvmTypeReference__Alternatives ) ) ;
    public final void ruleJvmTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:467:2: ( ( ( rule__JvmTypeReference__Alternatives ) ) )
            // InternalMetaCrySL.g:468:2: ( ( rule__JvmTypeReference__Alternatives ) )
            {
            // InternalMetaCrySL.g:468:2: ( ( rule__JvmTypeReference__Alternatives ) )
            // InternalMetaCrySL.g:469:3: ( rule__JvmTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:470:3: ( rule__JvmTypeReference__Alternatives )
            // InternalMetaCrySL.g:470:4: rule__JvmTypeReference__Alternatives
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
    // InternalMetaCrySL.g:479:1: entryRuleArrayBrackets : ruleArrayBrackets EOF ;
    public final void entryRuleArrayBrackets() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:480:1: ( ruleArrayBrackets EOF )
            // InternalMetaCrySL.g:481:1: ruleArrayBrackets EOF
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
    // InternalMetaCrySL.g:488:1: ruleArrayBrackets : ( ( rule__ArrayBrackets__Group__0 ) ) ;
    public final void ruleArrayBrackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:492:2: ( ( ( rule__ArrayBrackets__Group__0 ) ) )
            // InternalMetaCrySL.g:493:2: ( ( rule__ArrayBrackets__Group__0 ) )
            {
            // InternalMetaCrySL.g:493:2: ( ( rule__ArrayBrackets__Group__0 ) )
            // InternalMetaCrySL.g:494:3: ( rule__ArrayBrackets__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:495:3: ( rule__ArrayBrackets__Group__0 )
            // InternalMetaCrySL.g:495:4: rule__ArrayBrackets__Group__0
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
    // InternalMetaCrySL.g:504:1: entryRuleXFunctionTypeRef : ruleXFunctionTypeRef EOF ;
    public final void entryRuleXFunctionTypeRef() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:505:1: ( ruleXFunctionTypeRef EOF )
            // InternalMetaCrySL.g:506:1: ruleXFunctionTypeRef EOF
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
    // InternalMetaCrySL.g:513:1: ruleXFunctionTypeRef : ( ( rule__XFunctionTypeRef__Group__0 ) ) ;
    public final void ruleXFunctionTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:517:2: ( ( ( rule__XFunctionTypeRef__Group__0 ) ) )
            // InternalMetaCrySL.g:518:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            {
            // InternalMetaCrySL.g:518:2: ( ( rule__XFunctionTypeRef__Group__0 ) )
            // InternalMetaCrySL.g:519:3: ( rule__XFunctionTypeRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:520:3: ( rule__XFunctionTypeRef__Group__0 )
            // InternalMetaCrySL.g:520:4: rule__XFunctionTypeRef__Group__0
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
    // InternalMetaCrySL.g:529:1: entryRuleJvmParameterizedTypeReference : ruleJvmParameterizedTypeReference EOF ;
    public final void entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:530:1: ( ruleJvmParameterizedTypeReference EOF )
            // InternalMetaCrySL.g:531:1: ruleJvmParameterizedTypeReference EOF
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
    // InternalMetaCrySL.g:538:1: ruleJvmParameterizedTypeReference : ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) ;
    public final void ruleJvmParameterizedTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:542:2: ( ( ( rule__JvmParameterizedTypeReference__Group__0 ) ) )
            // InternalMetaCrySL.g:543:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            {
            // InternalMetaCrySL.g:543:2: ( ( rule__JvmParameterizedTypeReference__Group__0 ) )
            // InternalMetaCrySL.g:544:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:545:3: ( rule__JvmParameterizedTypeReference__Group__0 )
            // InternalMetaCrySL.g:545:4: rule__JvmParameterizedTypeReference__Group__0
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
    // InternalMetaCrySL.g:554:1: entryRuleJvmArgumentTypeReference : ruleJvmArgumentTypeReference EOF ;
    public final void entryRuleJvmArgumentTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:555:1: ( ruleJvmArgumentTypeReference EOF )
            // InternalMetaCrySL.g:556:1: ruleJvmArgumentTypeReference EOF
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
    // InternalMetaCrySL.g:563:1: ruleJvmArgumentTypeReference : ( ( rule__JvmArgumentTypeReference__Alternatives ) ) ;
    public final void ruleJvmArgumentTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:567:2: ( ( ( rule__JvmArgumentTypeReference__Alternatives ) ) )
            // InternalMetaCrySL.g:568:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            {
            // InternalMetaCrySL.g:568:2: ( ( rule__JvmArgumentTypeReference__Alternatives ) )
            // InternalMetaCrySL.g:569:3: ( rule__JvmArgumentTypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmArgumentTypeReferenceAccess().getAlternatives()); 
            }
            // InternalMetaCrySL.g:570:3: ( rule__JvmArgumentTypeReference__Alternatives )
            // InternalMetaCrySL.g:570:4: rule__JvmArgumentTypeReference__Alternatives
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
    // InternalMetaCrySL.g:579:1: entryRuleJvmWildcardTypeReference : ruleJvmWildcardTypeReference EOF ;
    public final void entryRuleJvmWildcardTypeReference() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:580:1: ( ruleJvmWildcardTypeReference EOF )
            // InternalMetaCrySL.g:581:1: ruleJvmWildcardTypeReference EOF
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
    // InternalMetaCrySL.g:588:1: ruleJvmWildcardTypeReference : ( ( rule__JvmWildcardTypeReference__Group__0 ) ) ;
    public final void ruleJvmWildcardTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:592:2: ( ( ( rule__JvmWildcardTypeReference__Group__0 ) ) )
            // InternalMetaCrySL.g:593:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            {
            // InternalMetaCrySL.g:593:2: ( ( rule__JvmWildcardTypeReference__Group__0 ) )
            // InternalMetaCrySL.g:594:3: ( rule__JvmWildcardTypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:595:3: ( rule__JvmWildcardTypeReference__Group__0 )
            // InternalMetaCrySL.g:595:4: rule__JvmWildcardTypeReference__Group__0
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
    // InternalMetaCrySL.g:604:1: entryRuleJvmUpperBound : ruleJvmUpperBound EOF ;
    public final void entryRuleJvmUpperBound() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:605:1: ( ruleJvmUpperBound EOF )
            // InternalMetaCrySL.g:606:1: ruleJvmUpperBound EOF
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
    // InternalMetaCrySL.g:613:1: ruleJvmUpperBound : ( ( rule__JvmUpperBound__Group__0 ) ) ;
    public final void ruleJvmUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:617:2: ( ( ( rule__JvmUpperBound__Group__0 ) ) )
            // InternalMetaCrySL.g:618:2: ( ( rule__JvmUpperBound__Group__0 ) )
            {
            // InternalMetaCrySL.g:618:2: ( ( rule__JvmUpperBound__Group__0 ) )
            // InternalMetaCrySL.g:619:3: ( rule__JvmUpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:620:3: ( rule__JvmUpperBound__Group__0 )
            // InternalMetaCrySL.g:620:4: rule__JvmUpperBound__Group__0
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
    // InternalMetaCrySL.g:629:1: entryRuleJvmUpperBoundAnded : ruleJvmUpperBoundAnded EOF ;
    public final void entryRuleJvmUpperBoundAnded() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:630:1: ( ruleJvmUpperBoundAnded EOF )
            // InternalMetaCrySL.g:631:1: ruleJvmUpperBoundAnded EOF
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
    // InternalMetaCrySL.g:638:1: ruleJvmUpperBoundAnded : ( ( rule__JvmUpperBoundAnded__Group__0 ) ) ;
    public final void ruleJvmUpperBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:642:2: ( ( ( rule__JvmUpperBoundAnded__Group__0 ) ) )
            // InternalMetaCrySL.g:643:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            {
            // InternalMetaCrySL.g:643:2: ( ( rule__JvmUpperBoundAnded__Group__0 ) )
            // InternalMetaCrySL.g:644:3: ( rule__JvmUpperBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:645:3: ( rule__JvmUpperBoundAnded__Group__0 )
            // InternalMetaCrySL.g:645:4: rule__JvmUpperBoundAnded__Group__0
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
    // InternalMetaCrySL.g:654:1: entryRuleJvmLowerBound : ruleJvmLowerBound EOF ;
    public final void entryRuleJvmLowerBound() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:655:1: ( ruleJvmLowerBound EOF )
            // InternalMetaCrySL.g:656:1: ruleJvmLowerBound EOF
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
    // InternalMetaCrySL.g:663:1: ruleJvmLowerBound : ( ( rule__JvmLowerBound__Group__0 ) ) ;
    public final void ruleJvmLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:667:2: ( ( ( rule__JvmLowerBound__Group__0 ) ) )
            // InternalMetaCrySL.g:668:2: ( ( rule__JvmLowerBound__Group__0 ) )
            {
            // InternalMetaCrySL.g:668:2: ( ( rule__JvmLowerBound__Group__0 ) )
            // InternalMetaCrySL.g:669:3: ( rule__JvmLowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:670:3: ( rule__JvmLowerBound__Group__0 )
            // InternalMetaCrySL.g:670:4: rule__JvmLowerBound__Group__0
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
    // InternalMetaCrySL.g:679:1: entryRuleJvmLowerBoundAnded : ruleJvmLowerBoundAnded EOF ;
    public final void entryRuleJvmLowerBoundAnded() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:680:1: ( ruleJvmLowerBoundAnded EOF )
            // InternalMetaCrySL.g:681:1: ruleJvmLowerBoundAnded EOF
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
    // InternalMetaCrySL.g:688:1: ruleJvmLowerBoundAnded : ( ( rule__JvmLowerBoundAnded__Group__0 ) ) ;
    public final void ruleJvmLowerBoundAnded() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:692:2: ( ( ( rule__JvmLowerBoundAnded__Group__0 ) ) )
            // InternalMetaCrySL.g:693:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            {
            // InternalMetaCrySL.g:693:2: ( ( rule__JvmLowerBoundAnded__Group__0 ) )
            // InternalMetaCrySL.g:694:3: ( rule__JvmLowerBoundAnded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:695:3: ( rule__JvmLowerBoundAnded__Group__0 )
            // InternalMetaCrySL.g:695:4: rule__JvmLowerBoundAnded__Group__0
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
    // InternalMetaCrySL.g:704:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:705:1: ( ruleQualifiedName EOF )
            // InternalMetaCrySL.g:706:1: ruleQualifiedName EOF
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
    // InternalMetaCrySL.g:713:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:717:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMetaCrySL.g:718:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMetaCrySL.g:718:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMetaCrySL.g:719:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:720:3: ( rule__QualifiedName__Group__0 )
            // InternalMetaCrySL.g:720:4: rule__QualifiedName__Group__0
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
    // InternalMetaCrySL.g:729:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:730:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMetaCrySL.g:731:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalMetaCrySL.g:738:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:742:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMetaCrySL.g:743:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMetaCrySL.g:743:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMetaCrySL.g:744:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:745:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMetaCrySL.g:745:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalMetaCrySL.g:754:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:755:1: ( ruleValidID EOF )
            // InternalMetaCrySL.g:756:1: ruleValidID EOF
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
    // InternalMetaCrySL.g:763:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:767:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:768:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:768:2: ( RULE_ID )
            // InternalMetaCrySL.g:769:3: RULE_ID
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
    // InternalMetaCrySL.g:779:1: entryRuleXImportDeclaration : ruleXImportDeclaration EOF ;
    public final void entryRuleXImportDeclaration() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:780:1: ( ruleXImportDeclaration EOF )
            // InternalMetaCrySL.g:781:1: ruleXImportDeclaration EOF
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
    // InternalMetaCrySL.g:788:1: ruleXImportDeclaration : ( ( rule__XImportDeclaration__Group__0 ) ) ;
    public final void ruleXImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:792:2: ( ( ( rule__XImportDeclaration__Group__0 ) ) )
            // InternalMetaCrySL.g:793:2: ( ( rule__XImportDeclaration__Group__0 ) )
            {
            // InternalMetaCrySL.g:793:2: ( ( rule__XImportDeclaration__Group__0 ) )
            // InternalMetaCrySL.g:794:3: ( rule__XImportDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:795:3: ( rule__XImportDeclaration__Group__0 )
            // InternalMetaCrySL.g:795:4: rule__XImportDeclaration__Group__0
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
    // InternalMetaCrySL.g:804:1: entryRuleQualifiedNameInStaticImport : ruleQualifiedNameInStaticImport EOF ;
    public final void entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        try {
            // InternalMetaCrySL.g:805:1: ( ruleQualifiedNameInStaticImport EOF )
            // InternalMetaCrySL.g:806:1: ruleQualifiedNameInStaticImport EOF
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
    // InternalMetaCrySL.g:813:1: ruleQualifiedNameInStaticImport : ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) ;
    public final void ruleQualifiedNameInStaticImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:817:2: ( ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) ) )
            // InternalMetaCrySL.g:818:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            {
            // InternalMetaCrySL.g:818:2: ( ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* ) )
            // InternalMetaCrySL.g:819:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) ) ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            {
            // InternalMetaCrySL.g:819:3: ( ( rule__QualifiedNameInStaticImport__Group__0 ) )
            // InternalMetaCrySL.g:820:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:821:4: ( rule__QualifiedNameInStaticImport__Group__0 )
            // InternalMetaCrySL.g:821:5: rule__QualifiedNameInStaticImport__Group__0
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

            // InternalMetaCrySL.g:824:3: ( ( rule__QualifiedNameInStaticImport__Group__0 )* )
            // InternalMetaCrySL.g:825:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getGroup()); 
            }
            // InternalMetaCrySL.g:826:4: ( rule__QualifiedNameInStaticImport__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==32) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMetaCrySL.g:826:5: rule__QualifiedNameInStaticImport__Group__0
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
    // InternalMetaCrySL.g:835:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:839:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
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
                    // InternalMetaCrySL.g:840:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:840:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalMetaCrySL.g:841:3: ( rule__Event__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:842:3: ( rule__Event__Group_0__0 )
                    // InternalMetaCrySL.g:842:4: rule__Event__Group_0__0
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
                    // InternalMetaCrySL.g:846:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:846:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalMetaCrySL.g:847:3: ( rule__Event__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:848:3: ( rule__Event__Group_1__0 )
                    // InternalMetaCrySL.g:848:4: rule__Event__Group_1__0
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
    // InternalMetaCrySL.g:856:1: rule__EventExp__Alternatives : ( ( ( rule__EventExp__Group_0__0 ) ) | ( ( rule__EventExp__Group_1__0 ) ) | ( ( rule__EventExp__Group_2__0 ) ) | ( ( rule__EventExp__Group_3__0 ) ) );
    public final void rule__EventExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:860:1: ( ( ( rule__EventExp__Group_0__0 ) ) | ( ( rule__EventExp__Group_1__0 ) ) | ( ( rule__EventExp__Group_2__0 ) ) | ( ( rule__EventExp__Group_3__0 ) ) )
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
            else if ( (LA3_0==16) ) {
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
                    // InternalMetaCrySL.g:861:2: ( ( rule__EventExp__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:861:2: ( ( rule__EventExp__Group_0__0 ) )
                    // InternalMetaCrySL.g:862:3: ( rule__EventExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:863:3: ( rule__EventExp__Group_0__0 )
                    // InternalMetaCrySL.g:863:4: rule__EventExp__Group_0__0
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
                    // InternalMetaCrySL.g:867:2: ( ( rule__EventExp__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:867:2: ( ( rule__EventExp__Group_1__0 ) )
                    // InternalMetaCrySL.g:868:3: ( rule__EventExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:869:3: ( rule__EventExp__Group_1__0 )
                    // InternalMetaCrySL.g:869:4: rule__EventExp__Group_1__0
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
                    // InternalMetaCrySL.g:873:2: ( ( rule__EventExp__Group_2__0 ) )
                    {
                    // InternalMetaCrySL.g:873:2: ( ( rule__EventExp__Group_2__0 ) )
                    // InternalMetaCrySL.g:874:3: ( rule__EventExp__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_2()); 
                    }
                    // InternalMetaCrySL.g:875:3: ( rule__EventExp__Group_2__0 )
                    // InternalMetaCrySL.g:875:4: rule__EventExp__Group_2__0
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
                    // InternalMetaCrySL.g:879:2: ( ( rule__EventExp__Group_3__0 ) )
                    {
                    // InternalMetaCrySL.g:879:2: ( ( rule__EventExp__Group_3__0 ) )
                    // InternalMetaCrySL.g:880:3: ( rule__EventExp__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventExpAccess().getGroup_3()); 
                    }
                    // InternalMetaCrySL.g:881:3: ( rule__EventExp__Group_3__0 )
                    // InternalMetaCrySL.g:881:4: rule__EventExp__Group_3__0
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
    // InternalMetaCrySL.g:889:1: rule__PrimaryExp__Alternatives : ( ( ( rule__PrimaryExp__LabelAssignment_0 ) ) | ( ( rule__PrimaryExp__Group_1__0 ) ) );
    public final void rule__PrimaryExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:893:1: ( ( ( rule__PrimaryExp__LabelAssignment_0 ) ) | ( ( rule__PrimaryExp__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
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
                    // InternalMetaCrySL.g:894:2: ( ( rule__PrimaryExp__LabelAssignment_0 ) )
                    {
                    // InternalMetaCrySL.g:894:2: ( ( rule__PrimaryExp__LabelAssignment_0 ) )
                    // InternalMetaCrySL.g:895:3: ( rule__PrimaryExp__LabelAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpAccess().getLabelAssignment_0()); 
                    }
                    // InternalMetaCrySL.g:896:3: ( rule__PrimaryExp__LabelAssignment_0 )
                    // InternalMetaCrySL.g:896:4: rule__PrimaryExp__LabelAssignment_0
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
                    // InternalMetaCrySL.g:900:2: ( ( rule__PrimaryExp__Group_1__0 ) )
                    {
                    // InternalMetaCrySL.g:900:2: ( ( rule__PrimaryExp__Group_1__0 ) )
                    // InternalMetaCrySL.g:901:3: ( rule__PrimaryExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpAccess().getGroup_1()); 
                    }
                    // InternalMetaCrySL.g:902:3: ( rule__PrimaryExp__Group_1__0 )
                    // InternalMetaCrySL.g:902:4: rule__PrimaryExp__Group_1__0
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
    // InternalMetaCrySL.g:910:1: rule__JvmTypeReference__Alternatives : ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) );
    public final void rule__JvmTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:914:1: ( ( ( rule__JvmTypeReference__Group_0__0 ) ) | ( ruleXFunctionTypeRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==16||LA5_0==18) ) {
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
                    // InternalMetaCrySL.g:915:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    {
                    // InternalMetaCrySL.g:915:2: ( ( rule__JvmTypeReference__Group_0__0 ) )
                    // InternalMetaCrySL.g:916:3: ( rule__JvmTypeReference__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0()); 
                    }
                    // InternalMetaCrySL.g:917:3: ( rule__JvmTypeReference__Group_0__0 )
                    // InternalMetaCrySL.g:917:4: rule__JvmTypeReference__Group_0__0
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
                    // InternalMetaCrySL.g:921:2: ( ruleXFunctionTypeRef )
                    {
                    // InternalMetaCrySL.g:921:2: ( ruleXFunctionTypeRef )
                    // InternalMetaCrySL.g:922:3: ruleXFunctionTypeRef
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
    // InternalMetaCrySL.g:931:1: rule__JvmArgumentTypeReference__Alternatives : ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) );
    public final void rule__JvmArgumentTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:935:1: ( ( ruleJvmTypeReference ) | ( ruleJvmWildcardTypeReference ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==16||LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
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
                    // InternalMetaCrySL.g:936:2: ( ruleJvmTypeReference )
                    {
                    // InternalMetaCrySL.g:936:2: ( ruleJvmTypeReference )
                    // InternalMetaCrySL.g:937:3: ruleJvmTypeReference
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
                    // InternalMetaCrySL.g:942:2: ( ruleJvmWildcardTypeReference )
                    {
                    // InternalMetaCrySL.g:942:2: ( ruleJvmWildcardTypeReference )
                    // InternalMetaCrySL.g:943:3: ruleJvmWildcardTypeReference
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
    // InternalMetaCrySL.g:952:1: rule__JvmWildcardTypeReference__Alternatives_2 : ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) );
    public final void rule__JvmWildcardTypeReference__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:956:1: ( ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) ) | ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
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
                    // InternalMetaCrySL.g:957:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    {
                    // InternalMetaCrySL.g:957:2: ( ( rule__JvmWildcardTypeReference__Group_2_0__0 ) )
                    // InternalMetaCrySL.g:958:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_0()); 
                    }
                    // InternalMetaCrySL.g:959:3: ( rule__JvmWildcardTypeReference__Group_2_0__0 )
                    // InternalMetaCrySL.g:959:4: rule__JvmWildcardTypeReference__Group_2_0__0
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
                    // InternalMetaCrySL.g:963:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    {
                    // InternalMetaCrySL.g:963:2: ( ( rule__JvmWildcardTypeReference__Group_2_1__0 ) )
                    // InternalMetaCrySL.g:964:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJvmWildcardTypeReferenceAccess().getGroup_2_1()); 
                    }
                    // InternalMetaCrySL.g:965:3: ( rule__JvmWildcardTypeReference__Group_2_1__0 )
                    // InternalMetaCrySL.g:965:4: rule__JvmWildcardTypeReference__Group_2_1__0
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
    // InternalMetaCrySL.g:973:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:977:1: ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMetaCrySL.g:978:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    {
                    // InternalMetaCrySL.g:978:2: ( ( rule__XImportDeclaration__Group_1_0__0 ) )
                    // InternalMetaCrySL.g:979:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getGroup_1_0()); 
                    }
                    // InternalMetaCrySL.g:980:3: ( rule__XImportDeclaration__Group_1_0__0 )
                    // InternalMetaCrySL.g:980:4: rule__XImportDeclaration__Group_1_0__0
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
                    // InternalMetaCrySL.g:984:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    {
                    // InternalMetaCrySL.g:984:2: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) )
                    // InternalMetaCrySL.g:985:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_1()); 
                    }
                    // InternalMetaCrySL.g:986:3: ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 )
                    // InternalMetaCrySL.g:986:4: rule__XImportDeclaration__ImportedTypeAssignment_1_1
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
                    // InternalMetaCrySL.g:990:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    {
                    // InternalMetaCrySL.g:990:2: ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) )
                    // InternalMetaCrySL.g:991:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceAssignment_1_2()); 
                    }
                    // InternalMetaCrySL.g:992:3: ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 )
                    // InternalMetaCrySL.g:992:4: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2
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
    // InternalMetaCrySL.g:1000:1: rule__XImportDeclaration__Alternatives_1_0_3 : ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) );
    public final void rule__XImportDeclaration__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1004:1: ( ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) ) | ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
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
                    // InternalMetaCrySL.g:1005:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    {
                    // InternalMetaCrySL.g:1005:2: ( ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 ) )
                    // InternalMetaCrySL.g:1006:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getWildcardAssignment_1_0_3_0()); 
                    }
                    // InternalMetaCrySL.g:1007:3: ( rule__XImportDeclaration__WildcardAssignment_1_0_3_0 )
                    // InternalMetaCrySL.g:1007:4: rule__XImportDeclaration__WildcardAssignment_1_0_3_0
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
                    // InternalMetaCrySL.g:1011:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    {
                    // InternalMetaCrySL.g:1011:2: ( ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 ) )
                    // InternalMetaCrySL.g:1012:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXImportDeclarationAccess().getMemberNameAssignment_1_0_3_1()); 
                    }
                    // InternalMetaCrySL.g:1013:3: ( rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 )
                    // InternalMetaCrySL.g:1013:4: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1
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
    // InternalMetaCrySL.g:1021:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1025:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // InternalMetaCrySL.g:1026:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
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
    // InternalMetaCrySL.g:1033:1: rule__Spec__Group__0__Impl : ( ( 'ABSTRACT' )? ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1037:1: ( ( ( 'ABSTRACT' )? ) )
            // InternalMetaCrySL.g:1038:1: ( ( 'ABSTRACT' )? )
            {
            // InternalMetaCrySL.g:1038:1: ( ( 'ABSTRACT' )? )
            // InternalMetaCrySL.g:1039:2: ( 'ABSTRACT' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getABSTRACTKeyword_0()); 
            }
            // InternalMetaCrySL.g:1040:2: ( 'ABSTRACT' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMetaCrySL.g:1040:3: 'ABSTRACT'
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
    // InternalMetaCrySL.g:1048:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1052:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // InternalMetaCrySL.g:1053:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
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
    // InternalMetaCrySL.g:1060:1: rule__Spec__Group__1__Impl : ( 'SPEC' ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1064:1: ( ( 'SPEC' ) )
            // InternalMetaCrySL.g:1065:1: ( 'SPEC' )
            {
            // InternalMetaCrySL.g:1065:1: ( 'SPEC' )
            // InternalMetaCrySL.g:1066:2: 'SPEC'
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
    // InternalMetaCrySL.g:1075:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl rule__Spec__Group__3 ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1079:1: ( rule__Spec__Group__2__Impl rule__Spec__Group__3 )
            // InternalMetaCrySL.g:1080:2: rule__Spec__Group__2__Impl rule__Spec__Group__3
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
    // InternalMetaCrySL.g:1087:1: rule__Spec__Group__2__Impl : ( ( rule__Spec__ClassNameAssignment_2 ) ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1091:1: ( ( ( rule__Spec__ClassNameAssignment_2 ) ) )
            // InternalMetaCrySL.g:1092:1: ( ( rule__Spec__ClassNameAssignment_2 ) )
            {
            // InternalMetaCrySL.g:1092:1: ( ( rule__Spec__ClassNameAssignment_2 ) )
            // InternalMetaCrySL.g:1093:2: ( rule__Spec__ClassNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getClassNameAssignment_2()); 
            }
            // InternalMetaCrySL.g:1094:2: ( rule__Spec__ClassNameAssignment_2 )
            // InternalMetaCrySL.g:1094:3: rule__Spec__ClassNameAssignment_2
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
    // InternalMetaCrySL.g:1102:1: rule__Spec__Group__3 : rule__Spec__Group__3__Impl rule__Spec__Group__4 ;
    public final void rule__Spec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1106:1: ( rule__Spec__Group__3__Impl rule__Spec__Group__4 )
            // InternalMetaCrySL.g:1107:2: rule__Spec__Group__3__Impl rule__Spec__Group__4
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
    // InternalMetaCrySL.g:1114:1: rule__Spec__Group__3__Impl : ( ( rule__Spec__ObjectSpecAssignment_3 )? ) ;
    public final void rule__Spec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1118:1: ( ( ( rule__Spec__ObjectSpecAssignment_3 )? ) )
            // InternalMetaCrySL.g:1119:1: ( ( rule__Spec__ObjectSpecAssignment_3 )? )
            {
            // InternalMetaCrySL.g:1119:1: ( ( rule__Spec__ObjectSpecAssignment_3 )? )
            // InternalMetaCrySL.g:1120:2: ( rule__Spec__ObjectSpecAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getObjectSpecAssignment_3()); 
            }
            // InternalMetaCrySL.g:1121:2: ( rule__Spec__ObjectSpecAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaCrySL.g:1121:3: rule__Spec__ObjectSpecAssignment_3
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
    // InternalMetaCrySL.g:1129:1: rule__Spec__Group__4 : rule__Spec__Group__4__Impl rule__Spec__Group__5 ;
    public final void rule__Spec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1133:1: ( rule__Spec__Group__4__Impl rule__Spec__Group__5 )
            // InternalMetaCrySL.g:1134:2: rule__Spec__Group__4__Impl rule__Spec__Group__5
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
    // InternalMetaCrySL.g:1141:1: rule__Spec__Group__4__Impl : ( ( rule__Spec__ForbiddenSpecAssignment_4 )? ) ;
    public final void rule__Spec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1145:1: ( ( ( rule__Spec__ForbiddenSpecAssignment_4 )? ) )
            // InternalMetaCrySL.g:1146:1: ( ( rule__Spec__ForbiddenSpecAssignment_4 )? )
            {
            // InternalMetaCrySL.g:1146:1: ( ( rule__Spec__ForbiddenSpecAssignment_4 )? )
            // InternalMetaCrySL.g:1147:2: ( rule__Spec__ForbiddenSpecAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getForbiddenSpecAssignment_4()); 
            }
            // InternalMetaCrySL.g:1148:2: ( rule__Spec__ForbiddenSpecAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMetaCrySL.g:1148:3: rule__Spec__ForbiddenSpecAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__ForbiddenSpecAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getForbiddenSpecAssignment_4()); 
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
    // InternalMetaCrySL.g:1156:1: rule__Spec__Group__5 : rule__Spec__Group__5__Impl rule__Spec__Group__6 ;
    public final void rule__Spec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1160:1: ( rule__Spec__Group__5__Impl rule__Spec__Group__6 )
            // InternalMetaCrySL.g:1161:2: rule__Spec__Group__5__Impl rule__Spec__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Spec__Group__6();

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
    // InternalMetaCrySL.g:1168:1: rule__Spec__Group__5__Impl : ( ( rule__Spec__EventSpecAssignment_5 )? ) ;
    public final void rule__Spec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1172:1: ( ( ( rule__Spec__EventSpecAssignment_5 )? ) )
            // InternalMetaCrySL.g:1173:1: ( ( rule__Spec__EventSpecAssignment_5 )? )
            {
            // InternalMetaCrySL.g:1173:1: ( ( rule__Spec__EventSpecAssignment_5 )? )
            // InternalMetaCrySL.g:1174:2: ( rule__Spec__EventSpecAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getEventSpecAssignment_5()); 
            }
            // InternalMetaCrySL.g:1175:2: ( rule__Spec__EventSpecAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaCrySL.g:1175:3: rule__Spec__EventSpecAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__EventSpecAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getEventSpecAssignment_5()); 
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


    // $ANTLR start "rule__Spec__Group__6"
    // InternalMetaCrySL.g:1183:1: rule__Spec__Group__6 : rule__Spec__Group__6__Impl ;
    public final void rule__Spec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1187:1: ( rule__Spec__Group__6__Impl )
            // InternalMetaCrySL.g:1188:2: rule__Spec__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__6__Impl();

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
    // $ANTLR end "rule__Spec__Group__6"


    // $ANTLR start "rule__Spec__Group__6__Impl"
    // InternalMetaCrySL.g:1194:1: rule__Spec__Group__6__Impl : ( ( rule__Spec__OrderSpecAssignment_6 )? ) ;
    public final void rule__Spec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1198:1: ( ( ( rule__Spec__OrderSpecAssignment_6 )? ) )
            // InternalMetaCrySL.g:1199:1: ( ( rule__Spec__OrderSpecAssignment_6 )? )
            {
            // InternalMetaCrySL.g:1199:1: ( ( rule__Spec__OrderSpecAssignment_6 )? )
            // InternalMetaCrySL.g:1200:2: ( rule__Spec__OrderSpecAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getOrderSpecAssignment_6()); 
            }
            // InternalMetaCrySL.g:1201:2: ( rule__Spec__OrderSpecAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMetaCrySL.g:1201:3: rule__Spec__OrderSpecAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spec__OrderSpecAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getOrderSpecAssignment_6()); 
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
    // $ANTLR end "rule__Spec__Group__6__Impl"


    // $ANTLR start "rule__ObjectSpec__Group__0"
    // InternalMetaCrySL.g:1210:1: rule__ObjectSpec__Group__0 : rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1 ;
    public final void rule__ObjectSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1214:1: ( rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1 )
            // InternalMetaCrySL.g:1215:2: rule__ObjectSpec__Group__0__Impl rule__ObjectSpec__Group__1
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
    // InternalMetaCrySL.g:1222:1: rule__ObjectSpec__Group__0__Impl : ( () ) ;
    public final void rule__ObjectSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1226:1: ( ( () ) )
            // InternalMetaCrySL.g:1227:1: ( () )
            {
            // InternalMetaCrySL.g:1227:1: ( () )
            // InternalMetaCrySL.g:1228:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectSpecAction_0()); 
            }
            // InternalMetaCrySL.g:1229:2: ()
            // InternalMetaCrySL.g:1229:3: 
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
    // InternalMetaCrySL.g:1237:1: rule__ObjectSpec__Group__1 : rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2 ;
    public final void rule__ObjectSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1241:1: ( rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2 )
            // InternalMetaCrySL.g:1242:2: rule__ObjectSpec__Group__1__Impl rule__ObjectSpec__Group__2
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
    // InternalMetaCrySL.g:1249:1: rule__ObjectSpec__Group__1__Impl : ( 'OBJECTS' ) ;
    public final void rule__ObjectSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1253:1: ( ( 'OBJECTS' ) )
            // InternalMetaCrySL.g:1254:1: ( 'OBJECTS' )
            {
            // InternalMetaCrySL.g:1254:1: ( 'OBJECTS' )
            // InternalMetaCrySL.g:1255:2: 'OBJECTS'
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
    // InternalMetaCrySL.g:1264:1: rule__ObjectSpec__Group__2 : rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3 ;
    public final void rule__ObjectSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1268:1: ( rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3 )
            // InternalMetaCrySL.g:1269:2: rule__ObjectSpec__Group__2__Impl rule__ObjectSpec__Group__3
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
    // InternalMetaCrySL.g:1276:1: rule__ObjectSpec__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1280:1: ( ( ':' ) )
            // InternalMetaCrySL.g:1281:1: ( ':' )
            {
            // InternalMetaCrySL.g:1281:1: ( ':' )
            // InternalMetaCrySL.g:1282:2: ':'
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
    // InternalMetaCrySL.g:1291:1: rule__ObjectSpec__Group__3 : rule__ObjectSpec__Group__3__Impl ;
    public final void rule__ObjectSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1295:1: ( rule__ObjectSpec__Group__3__Impl )
            // InternalMetaCrySL.g:1296:2: rule__ObjectSpec__Group__3__Impl
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
    // InternalMetaCrySL.g:1302:1: rule__ObjectSpec__Group__3__Impl : ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) ) ;
    public final void rule__ObjectSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1306:1: ( ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) ) )
            // InternalMetaCrySL.g:1307:1: ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) )
            {
            // InternalMetaCrySL.g:1307:1: ( ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* ) )
            // InternalMetaCrySL.g:1308:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 ) ) ( ( rule__ObjectSpec__ObjectsAssignment_3 )* )
            {
            // InternalMetaCrySL.g:1308:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 ) )
            // InternalMetaCrySL.g:1309:3: ( rule__ObjectSpec__ObjectsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }
            // InternalMetaCrySL.g:1310:3: ( rule__ObjectSpec__ObjectsAssignment_3 )
            // InternalMetaCrySL.g:1310:4: rule__ObjectSpec__ObjectsAssignment_3
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

            // InternalMetaCrySL.g:1313:2: ( ( rule__ObjectSpec__ObjectsAssignment_3 )* )
            // InternalMetaCrySL.g:1314:3: ( rule__ObjectSpec__ObjectsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectSpecAccess().getObjectsAssignment_3()); 
            }
            // InternalMetaCrySL.g:1315:3: ( rule__ObjectSpec__ObjectsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==16||LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaCrySL.g:1315:4: rule__ObjectSpec__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ObjectSpec__ObjectsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMetaCrySL.g:1325:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1329:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalMetaCrySL.g:1330:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalMetaCrySL.g:1337:1: rule__Object__Group__0__Impl : ( () ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1341:1: ( ( () ) )
            // InternalMetaCrySL.g:1342:1: ( () )
            {
            // InternalMetaCrySL.g:1342:1: ( () )
            // InternalMetaCrySL.g:1343:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getObjectAction_0()); 
            }
            // InternalMetaCrySL.g:1344:2: ()
            // InternalMetaCrySL.g:1344:3: 
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
    // InternalMetaCrySL.g:1352:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1356:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalMetaCrySL.g:1357:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalMetaCrySL.g:1364:1: rule__Object__Group__1__Impl : ( ( rule__Object__TypeAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1368:1: ( ( ( rule__Object__TypeAssignment_1 ) ) )
            // InternalMetaCrySL.g:1369:1: ( ( rule__Object__TypeAssignment_1 ) )
            {
            // InternalMetaCrySL.g:1369:1: ( ( rule__Object__TypeAssignment_1 ) )
            // InternalMetaCrySL.g:1370:2: ( rule__Object__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getTypeAssignment_1()); 
            }
            // InternalMetaCrySL.g:1371:2: ( rule__Object__TypeAssignment_1 )
            // InternalMetaCrySL.g:1371:3: rule__Object__TypeAssignment_1
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
    // InternalMetaCrySL.g:1379:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1383:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalMetaCrySL.g:1384:2: rule__Object__Group__2__Impl rule__Object__Group__3
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
    // InternalMetaCrySL.g:1391:1: rule__Object__Group__2__Impl : ( ( rule__Object__VarNameAssignment_2 ) ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1395:1: ( ( ( rule__Object__VarNameAssignment_2 ) ) )
            // InternalMetaCrySL.g:1396:1: ( ( rule__Object__VarNameAssignment_2 ) )
            {
            // InternalMetaCrySL.g:1396:1: ( ( rule__Object__VarNameAssignment_2 ) )
            // InternalMetaCrySL.g:1397:2: ( rule__Object__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getVarNameAssignment_2()); 
            }
            // InternalMetaCrySL.g:1398:2: ( rule__Object__VarNameAssignment_2 )
            // InternalMetaCrySL.g:1398:3: rule__Object__VarNameAssignment_2
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
    // InternalMetaCrySL.g:1406:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1410:1: ( rule__Object__Group__3__Impl )
            // InternalMetaCrySL.g:1411:2: rule__Object__Group__3__Impl
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
    // InternalMetaCrySL.g:1417:1: rule__Object__Group__3__Impl : ( ';' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1421:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1422:1: ( ';' )
            {
            // InternalMetaCrySL.g:1422:1: ( ';' )
            // InternalMetaCrySL.g:1423:2: ';'
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


    // $ANTLR start "rule__ForbiddenSpec__Group__0"
    // InternalMetaCrySL.g:1433:1: rule__ForbiddenSpec__Group__0 : rule__ForbiddenSpec__Group__0__Impl rule__ForbiddenSpec__Group__1 ;
    public final void rule__ForbiddenSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1437:1: ( rule__ForbiddenSpec__Group__0__Impl rule__ForbiddenSpec__Group__1 )
            // InternalMetaCrySL.g:1438:2: rule__ForbiddenSpec__Group__0__Impl rule__ForbiddenSpec__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ForbiddenSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenSpec__Group__1();

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
    // $ANTLR end "rule__ForbiddenSpec__Group__0"


    // $ANTLR start "rule__ForbiddenSpec__Group__0__Impl"
    // InternalMetaCrySL.g:1445:1: rule__ForbiddenSpec__Group__0__Impl : ( () ) ;
    public final void rule__ForbiddenSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1449:1: ( ( () ) )
            // InternalMetaCrySL.g:1450:1: ( () )
            {
            // InternalMetaCrySL.g:1450:1: ( () )
            // InternalMetaCrySL.g:1451:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getForbiddenSpecAction_0()); 
            }
            // InternalMetaCrySL.g:1452:2: ()
            // InternalMetaCrySL.g:1452:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getForbiddenSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForbiddenSpec__Group__0__Impl"


    // $ANTLR start "rule__ForbiddenSpec__Group__1"
    // InternalMetaCrySL.g:1460:1: rule__ForbiddenSpec__Group__1 : rule__ForbiddenSpec__Group__1__Impl rule__ForbiddenSpec__Group__2 ;
    public final void rule__ForbiddenSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1464:1: ( rule__ForbiddenSpec__Group__1__Impl rule__ForbiddenSpec__Group__2 )
            // InternalMetaCrySL.g:1465:2: rule__ForbiddenSpec__Group__1__Impl rule__ForbiddenSpec__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ForbiddenSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenSpec__Group__2();

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
    // $ANTLR end "rule__ForbiddenSpec__Group__1"


    // $ANTLR start "rule__ForbiddenSpec__Group__1__Impl"
    // InternalMetaCrySL.g:1472:1: rule__ForbiddenSpec__Group__1__Impl : ( 'FORBIDDEN' ) ;
    public final void rule__ForbiddenSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1476:1: ( ( 'FORBIDDEN' ) )
            // InternalMetaCrySL.g:1477:1: ( 'FORBIDDEN' )
            {
            // InternalMetaCrySL.g:1477:1: ( 'FORBIDDEN' )
            // InternalMetaCrySL.g:1478:2: 'FORBIDDEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getFORBIDDENKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getFORBIDDENKeyword_1()); 
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
    // $ANTLR end "rule__ForbiddenSpec__Group__1__Impl"


    // $ANTLR start "rule__ForbiddenSpec__Group__2"
    // InternalMetaCrySL.g:1487:1: rule__ForbiddenSpec__Group__2 : rule__ForbiddenSpec__Group__2__Impl ;
    public final void rule__ForbiddenSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1491:1: ( rule__ForbiddenSpec__Group__2__Impl )
            // InternalMetaCrySL.g:1492:2: rule__ForbiddenSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenSpec__Group__2__Impl();

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
    // $ANTLR end "rule__ForbiddenSpec__Group__2"


    // $ANTLR start "rule__ForbiddenSpec__Group__2__Impl"
    // InternalMetaCrySL.g:1498:1: rule__ForbiddenSpec__Group__2__Impl : ( ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) ) ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* ) ) ;
    public final void rule__ForbiddenSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1502:1: ( ( ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) ) ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* ) ) )
            // InternalMetaCrySL.g:1503:1: ( ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) ) ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* ) )
            {
            // InternalMetaCrySL.g:1503:1: ( ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) ) ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* ) )
            // InternalMetaCrySL.g:1504:2: ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) ) ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* )
            {
            // InternalMetaCrySL.g:1504:2: ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 ) )
            // InternalMetaCrySL.g:1505:3: ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1506:3: ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )
            // InternalMetaCrySL.g:1506:4: rule__ForbiddenSpec__ForbidenMethodsAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__ForbiddenSpec__ForbidenMethodsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsAssignment_2()); 
            }

            }

            // InternalMetaCrySL.g:1509:2: ( ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )* )
            // InternalMetaCrySL.g:1510:3: ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1511:3: ( rule__ForbiddenSpec__ForbidenMethodsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMetaCrySL.g:1511:4: rule__ForbiddenSpec__ForbidenMethodsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ForbiddenSpec__ForbidenMethodsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsAssignment_2()); 
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
    // $ANTLR end "rule__ForbiddenSpec__Group__2__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__0"
    // InternalMetaCrySL.g:1521:1: rule__ForbiddenMethod__Group__0 : rule__ForbiddenMethod__Group__0__Impl rule__ForbiddenMethod__Group__1 ;
    public final void rule__ForbiddenMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1525:1: ( rule__ForbiddenMethod__Group__0__Impl rule__ForbiddenMethod__Group__1 )
            // InternalMetaCrySL.g:1526:2: rule__ForbiddenMethod__Group__0__Impl rule__ForbiddenMethod__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ForbiddenMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__1();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__0"


    // $ANTLR start "rule__ForbiddenMethod__Group__0__Impl"
    // InternalMetaCrySL.g:1533:1: rule__ForbiddenMethod__Group__0__Impl : ( () ) ;
    public final void rule__ForbiddenMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1537:1: ( ( () ) )
            // InternalMetaCrySL.g:1538:1: ( () )
            {
            // InternalMetaCrySL.g:1538:1: ( () )
            // InternalMetaCrySL.g:1539:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getForbiddenAction_0()); 
            }
            // InternalMetaCrySL.g:1540:2: ()
            // InternalMetaCrySL.g:1540:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getForbiddenAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForbiddenMethod__Group__0__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__1"
    // InternalMetaCrySL.g:1548:1: rule__ForbiddenMethod__Group__1 : rule__ForbiddenMethod__Group__1__Impl rule__ForbiddenMethod__Group__2 ;
    public final void rule__ForbiddenMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1552:1: ( rule__ForbiddenMethod__Group__1__Impl rule__ForbiddenMethod__Group__2 )
            // InternalMetaCrySL.g:1553:2: rule__ForbiddenMethod__Group__1__Impl rule__ForbiddenMethod__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ForbiddenMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__2();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__1"


    // $ANTLR start "rule__ForbiddenMethod__Group__1__Impl"
    // InternalMetaCrySL.g:1560:1: rule__ForbiddenMethod__Group__1__Impl : ( ( rule__ForbiddenMethod__MethodAssignment_1 ) ) ;
    public final void rule__ForbiddenMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1564:1: ( ( ( rule__ForbiddenMethod__MethodAssignment_1 ) ) )
            // InternalMetaCrySL.g:1565:1: ( ( rule__ForbiddenMethod__MethodAssignment_1 ) )
            {
            // InternalMetaCrySL.g:1565:1: ( ( rule__ForbiddenMethod__MethodAssignment_1 ) )
            // InternalMetaCrySL.g:1566:2: ( rule__ForbiddenMethod__MethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getMethodAssignment_1()); 
            }
            // InternalMetaCrySL.g:1567:2: ( rule__ForbiddenMethod__MethodAssignment_1 )
            // InternalMetaCrySL.g:1567:3: rule__ForbiddenMethod__MethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__MethodAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getMethodAssignment_1()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__1__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__2"
    // InternalMetaCrySL.g:1575:1: rule__ForbiddenMethod__Group__2 : rule__ForbiddenMethod__Group__2__Impl rule__ForbiddenMethod__Group__3 ;
    public final void rule__ForbiddenMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1579:1: ( rule__ForbiddenMethod__Group__2__Impl rule__ForbiddenMethod__Group__3 )
            // InternalMetaCrySL.g:1580:2: rule__ForbiddenMethod__Group__2__Impl rule__ForbiddenMethod__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ForbiddenMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__3();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__2"


    // $ANTLR start "rule__ForbiddenMethod__Group__2__Impl"
    // InternalMetaCrySL.g:1587:1: rule__ForbiddenMethod__Group__2__Impl : ( '(' ) ;
    public final void rule__ForbiddenMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1591:1: ( ( '(' ) )
            // InternalMetaCrySL.g:1592:1: ( '(' )
            {
            // InternalMetaCrySL.g:1592:1: ( '(' )
            // InternalMetaCrySL.g:1593:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__2__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__3"
    // InternalMetaCrySL.g:1602:1: rule__ForbiddenMethod__Group__3 : rule__ForbiddenMethod__Group__3__Impl rule__ForbiddenMethod__Group__4 ;
    public final void rule__ForbiddenMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1606:1: ( rule__ForbiddenMethod__Group__3__Impl rule__ForbiddenMethod__Group__4 )
            // InternalMetaCrySL.g:1607:2: rule__ForbiddenMethod__Group__3__Impl rule__ForbiddenMethod__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ForbiddenMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__4();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__3"


    // $ANTLR start "rule__ForbiddenMethod__Group__3__Impl"
    // InternalMetaCrySL.g:1614:1: rule__ForbiddenMethod__Group__3__Impl : ( ( rule__ForbiddenMethod__ArgsAssignment_3 )? ) ;
    public final void rule__ForbiddenMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1618:1: ( ( ( rule__ForbiddenMethod__ArgsAssignment_3 )? ) )
            // InternalMetaCrySL.g:1619:1: ( ( rule__ForbiddenMethod__ArgsAssignment_3 )? )
            {
            // InternalMetaCrySL.g:1619:1: ( ( rule__ForbiddenMethod__ArgsAssignment_3 )? )
            // InternalMetaCrySL.g:1620:2: ( rule__ForbiddenMethod__ArgsAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getArgsAssignment_3()); 
            }
            // InternalMetaCrySL.g:1621:2: ( rule__ForbiddenMethod__ArgsAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMetaCrySL.g:1621:3: rule__ForbiddenMethod__ArgsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForbiddenMethod__ArgsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getArgsAssignment_3()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__3__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__4"
    // InternalMetaCrySL.g:1629:1: rule__ForbiddenMethod__Group__4 : rule__ForbiddenMethod__Group__4__Impl rule__ForbiddenMethod__Group__5 ;
    public final void rule__ForbiddenMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1633:1: ( rule__ForbiddenMethod__Group__4__Impl rule__ForbiddenMethod__Group__5 )
            // InternalMetaCrySL.g:1634:2: rule__ForbiddenMethod__Group__4__Impl rule__ForbiddenMethod__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ForbiddenMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__5();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__4"


    // $ANTLR start "rule__ForbiddenMethod__Group__4__Impl"
    // InternalMetaCrySL.g:1641:1: rule__ForbiddenMethod__Group__4__Impl : ( ')' ) ;
    public final void rule__ForbiddenMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1645:1: ( ( ')' ) )
            // InternalMetaCrySL.g:1646:1: ( ')' )
            {
            // InternalMetaCrySL.g:1646:1: ( ')' )
            // InternalMetaCrySL.g:1647:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__4__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__5"
    // InternalMetaCrySL.g:1656:1: rule__ForbiddenMethod__Group__5 : rule__ForbiddenMethod__Group__5__Impl rule__ForbiddenMethod__Group__6 ;
    public final void rule__ForbiddenMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1660:1: ( rule__ForbiddenMethod__Group__5__Impl rule__ForbiddenMethod__Group__6 )
            // InternalMetaCrySL.g:1661:2: rule__ForbiddenMethod__Group__5__Impl rule__ForbiddenMethod__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ForbiddenMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__6();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__5"


    // $ANTLR start "rule__ForbiddenMethod__Group__5__Impl"
    // InternalMetaCrySL.g:1668:1: rule__ForbiddenMethod__Group__5__Impl : ( ( rule__ForbiddenMethod__Group_5__0 )? ) ;
    public final void rule__ForbiddenMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1672:1: ( ( ( rule__ForbiddenMethod__Group_5__0 )? ) )
            // InternalMetaCrySL.g:1673:1: ( ( rule__ForbiddenMethod__Group_5__0 )? )
            {
            // InternalMetaCrySL.g:1673:1: ( ( rule__ForbiddenMethod__Group_5__0 )? )
            // InternalMetaCrySL.g:1674:2: ( rule__ForbiddenMethod__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getGroup_5()); 
            }
            // InternalMetaCrySL.g:1675:2: ( rule__ForbiddenMethod__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMetaCrySL.g:1675:3: rule__ForbiddenMethod__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForbiddenMethod__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getGroup_5()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__5__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group__6"
    // InternalMetaCrySL.g:1683:1: rule__ForbiddenMethod__Group__6 : rule__ForbiddenMethod__Group__6__Impl ;
    public final void rule__ForbiddenMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1687:1: ( rule__ForbiddenMethod__Group__6__Impl )
            // InternalMetaCrySL.g:1688:2: rule__ForbiddenMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group__6__Impl();

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
    // $ANTLR end "rule__ForbiddenMethod__Group__6"


    // $ANTLR start "rule__ForbiddenMethod__Group__6__Impl"
    // InternalMetaCrySL.g:1694:1: rule__ForbiddenMethod__Group__6__Impl : ( ';' ) ;
    public final void rule__ForbiddenMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1698:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1699:1: ( ';' )
            {
            // InternalMetaCrySL.g:1699:1: ( ';' )
            // InternalMetaCrySL.g:1700:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getSemicolonKeyword_6()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group__6__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group_5__0"
    // InternalMetaCrySL.g:1710:1: rule__ForbiddenMethod__Group_5__0 : rule__ForbiddenMethod__Group_5__0__Impl rule__ForbiddenMethod__Group_5__1 ;
    public final void rule__ForbiddenMethod__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1714:1: ( rule__ForbiddenMethod__Group_5__0__Impl rule__ForbiddenMethod__Group_5__1 )
            // InternalMetaCrySL.g:1715:2: rule__ForbiddenMethod__Group_5__0__Impl rule__ForbiddenMethod__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__ForbiddenMethod__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group_5__1();

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
    // $ANTLR end "rule__ForbiddenMethod__Group_5__0"


    // $ANTLR start "rule__ForbiddenMethod__Group_5__0__Impl"
    // InternalMetaCrySL.g:1722:1: rule__ForbiddenMethod__Group_5__0__Impl : ( '=>' ) ;
    public final void rule__ForbiddenMethod__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1726:1: ( ( '=>' ) )
            // InternalMetaCrySL.g:1727:1: ( '=>' )
            {
            // InternalMetaCrySL.g:1727:1: ( '=>' )
            // InternalMetaCrySL.g:1728:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getEqualsSignGreaterThanSignKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getEqualsSignGreaterThanSignKeyword_5_0()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group_5__0__Impl"


    // $ANTLR start "rule__ForbiddenMethod__Group_5__1"
    // InternalMetaCrySL.g:1737:1: rule__ForbiddenMethod__Group_5__1 : rule__ForbiddenMethod__Group_5__1__Impl ;
    public final void rule__ForbiddenMethod__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1741:1: ( rule__ForbiddenMethod__Group_5__1__Impl )
            // InternalMetaCrySL.g:1742:2: rule__ForbiddenMethod__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__Group_5__1__Impl();

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
    // $ANTLR end "rule__ForbiddenMethod__Group_5__1"


    // $ANTLR start "rule__ForbiddenMethod__Group_5__1__Impl"
    // InternalMetaCrySL.g:1748:1: rule__ForbiddenMethod__Group_5__1__Impl : ( ( rule__ForbiddenMethod__AlternativeAssignment_5_1 ) ) ;
    public final void rule__ForbiddenMethod__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1752:1: ( ( ( rule__ForbiddenMethod__AlternativeAssignment_5_1 ) ) )
            // InternalMetaCrySL.g:1753:1: ( ( rule__ForbiddenMethod__AlternativeAssignment_5_1 ) )
            {
            // InternalMetaCrySL.g:1753:1: ( ( rule__ForbiddenMethod__AlternativeAssignment_5_1 ) )
            // InternalMetaCrySL.g:1754:2: ( rule__ForbiddenMethod__AlternativeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getAlternativeAssignment_5_1()); 
            }
            // InternalMetaCrySL.g:1755:2: ( rule__ForbiddenMethod__AlternativeAssignment_5_1 )
            // InternalMetaCrySL.g:1755:3: rule__ForbiddenMethod__AlternativeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ForbiddenMethod__AlternativeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getAlternativeAssignment_5_1()); 
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
    // $ANTLR end "rule__ForbiddenMethod__Group_5__1__Impl"


    // $ANTLR start "rule__EventSpec__Group__0"
    // InternalMetaCrySL.g:1764:1: rule__EventSpec__Group__0 : rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1 ;
    public final void rule__EventSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1768:1: ( rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1 )
            // InternalMetaCrySL.g:1769:2: rule__EventSpec__Group__0__Impl rule__EventSpec__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMetaCrySL.g:1776:1: rule__EventSpec__Group__0__Impl : ( () ) ;
    public final void rule__EventSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1780:1: ( ( () ) )
            // InternalMetaCrySL.g:1781:1: ( () )
            {
            // InternalMetaCrySL.g:1781:1: ( () )
            // InternalMetaCrySL.g:1782:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventSpecAction_0()); 
            }
            // InternalMetaCrySL.g:1783:2: ()
            // InternalMetaCrySL.g:1783:3: 
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
    // InternalMetaCrySL.g:1791:1: rule__EventSpec__Group__1 : rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2 ;
    public final void rule__EventSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1795:1: ( rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2 )
            // InternalMetaCrySL.g:1796:2: rule__EventSpec__Group__1__Impl rule__EventSpec__Group__2
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
    // InternalMetaCrySL.g:1803:1: rule__EventSpec__Group__1__Impl : ( 'EVENTS' ) ;
    public final void rule__EventSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1807:1: ( ( 'EVENTS' ) )
            // InternalMetaCrySL.g:1808:1: ( 'EVENTS' )
            {
            // InternalMetaCrySL.g:1808:1: ( 'EVENTS' )
            // InternalMetaCrySL.g:1809:2: 'EVENTS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEVENTSKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:1818:1: rule__EventSpec__Group__2 : rule__EventSpec__Group__2__Impl ;
    public final void rule__EventSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1822:1: ( rule__EventSpec__Group__2__Impl )
            // InternalMetaCrySL.g:1823:2: rule__EventSpec__Group__2__Impl
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
    // InternalMetaCrySL.g:1829:1: rule__EventSpec__Group__2__Impl : ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) ) ;
    public final void rule__EventSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1833:1: ( ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) ) )
            // InternalMetaCrySL.g:1834:1: ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) )
            {
            // InternalMetaCrySL.g:1834:1: ( ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* ) )
            // InternalMetaCrySL.g:1835:2: ( ( rule__EventSpec__EventsAssignment_2 ) ) ( ( rule__EventSpec__EventsAssignment_2 )* )
            {
            // InternalMetaCrySL.g:1835:2: ( ( rule__EventSpec__EventsAssignment_2 ) )
            // InternalMetaCrySL.g:1836:3: ( rule__EventSpec__EventsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1837:3: ( rule__EventSpec__EventsAssignment_2 )
            // InternalMetaCrySL.g:1837:4: rule__EventSpec__EventsAssignment_2
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

            // InternalMetaCrySL.g:1840:2: ( ( rule__EventSpec__EventsAssignment_2 )* )
            // InternalMetaCrySL.g:1841:3: ( rule__EventSpec__EventsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventSpecAccess().getEventsAssignment_2()); 
            }
            // InternalMetaCrySL.g:1842:3: ( rule__EventSpec__EventsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMetaCrySL.g:1842:4: rule__EventSpec__EventsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EventSpec__EventsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMetaCrySL.g:1852:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1856:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalMetaCrySL.g:1857:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
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
    // InternalMetaCrySL.g:1864:1: rule__Event__Group_0__0__Impl : ( () ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1868:1: ( ( () ) )
            // InternalMetaCrySL.g:1869:1: ( () )
            {
            // InternalMetaCrySL.g:1869:1: ( () )
            // InternalMetaCrySL.g:1870:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventMethodAction_0_0()); 
            }
            // InternalMetaCrySL.g:1871:2: ()
            // InternalMetaCrySL.g:1871:3: 
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
    // InternalMetaCrySL.g:1879:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1883:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // InternalMetaCrySL.g:1884:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
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
    // InternalMetaCrySL.g:1891:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__Group_0_1__0 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1895:1: ( ( ( rule__Event__Group_0_1__0 ) ) )
            // InternalMetaCrySL.g:1896:1: ( ( rule__Event__Group_0_1__0 ) )
            {
            // InternalMetaCrySL.g:1896:1: ( ( rule__Event__Group_0_1__0 ) )
            // InternalMetaCrySL.g:1897:2: ( rule__Event__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:1898:2: ( rule__Event__Group_0_1__0 )
            // InternalMetaCrySL.g:1898:3: rule__Event__Group_0_1__0
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
    // InternalMetaCrySL.g:1906:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl rule__Event__Group_0__3 ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1910:1: ( rule__Event__Group_0__2__Impl rule__Event__Group_0__3 )
            // InternalMetaCrySL.g:1911:2: rule__Event__Group_0__2__Impl rule__Event__Group_0__3
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
    // InternalMetaCrySL.g:1918:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__Group_0_2__0 )? ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1922:1: ( ( ( rule__Event__Group_0_2__0 )? ) )
            // InternalMetaCrySL.g:1923:1: ( ( rule__Event__Group_0_2__0 )? )
            {
            // InternalMetaCrySL.g:1923:1: ( ( rule__Event__Group_0_2__0 )? )
            // InternalMetaCrySL.g:1924:2: ( rule__Event__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_2()); 
            }
            // InternalMetaCrySL.g:1925:2: ( rule__Event__Group_0_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==20) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMetaCrySL.g:1925:3: rule__Event__Group_0_2__0
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
    // InternalMetaCrySL.g:1933:1: rule__Event__Group_0__3 : rule__Event__Group_0__3__Impl rule__Event__Group_0__4 ;
    public final void rule__Event__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1937:1: ( rule__Event__Group_0__3__Impl rule__Event__Group_0__4 )
            // InternalMetaCrySL.g:1938:2: rule__Event__Group_0__3__Impl rule__Event__Group_0__4
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
    // InternalMetaCrySL.g:1945:1: rule__Event__Group_0__3__Impl : ( ( rule__Event__MethodAssignment_0_3 ) ) ;
    public final void rule__Event__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1949:1: ( ( ( rule__Event__MethodAssignment_0_3 ) ) )
            // InternalMetaCrySL.g:1950:1: ( ( rule__Event__MethodAssignment_0_3 ) )
            {
            // InternalMetaCrySL.g:1950:1: ( ( rule__Event__MethodAssignment_0_3 ) )
            // InternalMetaCrySL.g:1951:2: ( rule__Event__MethodAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getMethodAssignment_0_3()); 
            }
            // InternalMetaCrySL.g:1952:2: ( rule__Event__MethodAssignment_0_3 )
            // InternalMetaCrySL.g:1952:3: rule__Event__MethodAssignment_0_3
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
    // InternalMetaCrySL.g:1960:1: rule__Event__Group_0__4 : rule__Event__Group_0__4__Impl ;
    public final void rule__Event__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1964:1: ( rule__Event__Group_0__4__Impl )
            // InternalMetaCrySL.g:1965:2: rule__Event__Group_0__4__Impl
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
    // InternalMetaCrySL.g:1971:1: rule__Event__Group_0__4__Impl : ( ';' ) ;
    public final void rule__Event__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1975:1: ( ( ';' ) )
            // InternalMetaCrySL.g:1976:1: ( ';' )
            {
            // InternalMetaCrySL.g:1976:1: ( ';' )
            // InternalMetaCrySL.g:1977:2: ';'
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
    // InternalMetaCrySL.g:1987:1: rule__Event__Group_0_1__0 : rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 ;
    public final void rule__Event__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:1991:1: ( rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 )
            // InternalMetaCrySL.g:1992:2: rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1
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
    // InternalMetaCrySL.g:1999:1: rule__Event__Group_0_1__0__Impl : ( ( rule__Event__LabelAssignment_0_1_0 ) ) ;
    public final void rule__Event__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2003:1: ( ( ( rule__Event__LabelAssignment_0_1_0 ) ) )
            // InternalMetaCrySL.g:2004:1: ( ( rule__Event__LabelAssignment_0_1_0 ) )
            {
            // InternalMetaCrySL.g:2004:1: ( ( rule__Event__LabelAssignment_0_1_0 ) )
            // InternalMetaCrySL.g:2005:2: ( rule__Event__LabelAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelAssignment_0_1_0()); 
            }
            // InternalMetaCrySL.g:2006:2: ( rule__Event__LabelAssignment_0_1_0 )
            // InternalMetaCrySL.g:2006:3: rule__Event__LabelAssignment_0_1_0
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
    // InternalMetaCrySL.g:2014:1: rule__Event__Group_0_1__1 : rule__Event__Group_0_1__1__Impl ;
    public final void rule__Event__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2018:1: ( rule__Event__Group_0_1__1__Impl )
            // InternalMetaCrySL.g:2019:2: rule__Event__Group_0_1__1__Impl
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
    // InternalMetaCrySL.g:2025:1: rule__Event__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__Event__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2029:1: ( ( ':' ) )
            // InternalMetaCrySL.g:2030:1: ( ':' )
            {
            // InternalMetaCrySL.g:2030:1: ( ':' )
            // InternalMetaCrySL.g:2031:2: ':'
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
    // InternalMetaCrySL.g:2041:1: rule__Event__Group_0_2__0 : rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1 ;
    public final void rule__Event__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2045:1: ( rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1 )
            // InternalMetaCrySL.g:2046:2: rule__Event__Group_0_2__0__Impl rule__Event__Group_0_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMetaCrySL.g:2053:1: rule__Event__Group_0_2__0__Impl : ( ( rule__Event__VarAssignment_0_2_0 ) ) ;
    public final void rule__Event__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2057:1: ( ( ( rule__Event__VarAssignment_0_2_0 ) ) )
            // InternalMetaCrySL.g:2058:1: ( ( rule__Event__VarAssignment_0_2_0 ) )
            {
            // InternalMetaCrySL.g:2058:1: ( ( rule__Event__VarAssignment_0_2_0 ) )
            // InternalMetaCrySL.g:2059:2: ( rule__Event__VarAssignment_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getVarAssignment_0_2_0()); 
            }
            // InternalMetaCrySL.g:2060:2: ( rule__Event__VarAssignment_0_2_0 )
            // InternalMetaCrySL.g:2060:3: rule__Event__VarAssignment_0_2_0
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
    // InternalMetaCrySL.g:2068:1: rule__Event__Group_0_2__1 : rule__Event__Group_0_2__1__Impl ;
    public final void rule__Event__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2072:1: ( rule__Event__Group_0_2__1__Impl )
            // InternalMetaCrySL.g:2073:2: rule__Event__Group_0_2__1__Impl
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
    // InternalMetaCrySL.g:2079:1: rule__Event__Group_0_2__1__Impl : ( '=' ) ;
    public final void rule__Event__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2083:1: ( ( '=' ) )
            // InternalMetaCrySL.g:2084:1: ( '=' )
            {
            // InternalMetaCrySL.g:2084:1: ( '=' )
            // InternalMetaCrySL.g:2085:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEqualsSignKeyword_0_2_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2095:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2099:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalMetaCrySL.g:2100:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
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
    // InternalMetaCrySL.g:2107:1: rule__Event__Group_1__0__Impl : ( () ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2111:1: ( ( () ) )
            // InternalMetaCrySL.g:2112:1: ( () )
            {
            // InternalMetaCrySL.g:2112:1: ( () )
            // InternalMetaCrySL.g:2113:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventAggregateAction_1_0()); 
            }
            // InternalMetaCrySL.g:2114:2: ()
            // InternalMetaCrySL.g:2114:3: 
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
    // InternalMetaCrySL.g:2122:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2126:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // InternalMetaCrySL.g:2127:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
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
    // InternalMetaCrySL.g:2134:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__Group_1_1__0 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2138:1: ( ( ( rule__Event__Group_1_1__0 ) ) )
            // InternalMetaCrySL.g:2139:1: ( ( rule__Event__Group_1_1__0 ) )
            {
            // InternalMetaCrySL.g:2139:1: ( ( rule__Event__Group_1_1__0 ) )
            // InternalMetaCrySL.g:2140:2: ( rule__Event__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_1()); 
            }
            // InternalMetaCrySL.g:2141:2: ( rule__Event__Group_1_1__0 )
            // InternalMetaCrySL.g:2141:3: rule__Event__Group_1_1__0
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
    // InternalMetaCrySL.g:2149:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2153:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // InternalMetaCrySL.g:2154:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
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
    // InternalMetaCrySL.g:2161:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__AggregateAssignment_1_2 ) ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2165:1: ( ( ( rule__Event__AggregateAssignment_1_2 ) ) )
            // InternalMetaCrySL.g:2166:1: ( ( rule__Event__AggregateAssignment_1_2 ) )
            {
            // InternalMetaCrySL.g:2166:1: ( ( rule__Event__AggregateAssignment_1_2 ) )
            // InternalMetaCrySL.g:2167:2: ( rule__Event__AggregateAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAggregateAssignment_1_2()); 
            }
            // InternalMetaCrySL.g:2168:2: ( rule__Event__AggregateAssignment_1_2 )
            // InternalMetaCrySL.g:2168:3: rule__Event__AggregateAssignment_1_2
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
    // InternalMetaCrySL.g:2176:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2180:1: ( rule__Event__Group_1__3__Impl )
            // InternalMetaCrySL.g:2181:2: rule__Event__Group_1__3__Impl
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
    // InternalMetaCrySL.g:2187:1: rule__Event__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2191:1: ( ( ';' ) )
            // InternalMetaCrySL.g:2192:1: ( ';' )
            {
            // InternalMetaCrySL.g:2192:1: ( ';' )
            // InternalMetaCrySL.g:2193:2: ';'
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
    // InternalMetaCrySL.g:2203:1: rule__Event__Group_1_1__0 : rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1 ;
    public final void rule__Event__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2207:1: ( rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1 )
            // InternalMetaCrySL.g:2208:2: rule__Event__Group_1_1__0__Impl rule__Event__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMetaCrySL.g:2215:1: rule__Event__Group_1_1__0__Impl : ( ( rule__Event__LabelAssignment_1_1_0 ) ) ;
    public final void rule__Event__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2219:1: ( ( ( rule__Event__LabelAssignment_1_1_0 ) ) )
            // InternalMetaCrySL.g:2220:1: ( ( rule__Event__LabelAssignment_1_1_0 ) )
            {
            // InternalMetaCrySL.g:2220:1: ( ( rule__Event__LabelAssignment_1_1_0 ) )
            // InternalMetaCrySL.g:2221:2: ( rule__Event__LabelAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLabelAssignment_1_1_0()); 
            }
            // InternalMetaCrySL.g:2222:2: ( rule__Event__LabelAssignment_1_1_0 )
            // InternalMetaCrySL.g:2222:3: rule__Event__LabelAssignment_1_1_0
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
    // InternalMetaCrySL.g:2230:1: rule__Event__Group_1_1__1 : rule__Event__Group_1_1__1__Impl ;
    public final void rule__Event__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2234:1: ( rule__Event__Group_1_1__1__Impl )
            // InternalMetaCrySL.g:2235:2: rule__Event__Group_1_1__1__Impl
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
    // InternalMetaCrySL.g:2241:1: rule__Event__Group_1_1__1__Impl : ( ':=' ) ;
    public final void rule__Event__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2245:1: ( ( ':=' ) )
            // InternalMetaCrySL.g:2246:1: ( ':=' )
            {
            // InternalMetaCrySL.g:2246:1: ( ':=' )
            // InternalMetaCrySL.g:2247:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getColonEqualsSignKeyword_1_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2257:1: rule__AggregateList__Group__0 : rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1 ;
    public final void rule__AggregateList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2261:1: ( rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1 )
            // InternalMetaCrySL.g:2262:2: rule__AggregateList__Group__0__Impl rule__AggregateList__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaCrySL.g:2269:1: rule__AggregateList__Group__0__Impl : ( ( rule__AggregateList__LabelsAssignment_0 ) ) ;
    public final void rule__AggregateList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2273:1: ( ( ( rule__AggregateList__LabelsAssignment_0 ) ) )
            // InternalMetaCrySL.g:2274:1: ( ( rule__AggregateList__LabelsAssignment_0 ) )
            {
            // InternalMetaCrySL.g:2274:1: ( ( rule__AggregateList__LabelsAssignment_0 ) )
            // InternalMetaCrySL.g:2275:2: ( rule__AggregateList__LabelsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsAssignment_0()); 
            }
            // InternalMetaCrySL.g:2276:2: ( rule__AggregateList__LabelsAssignment_0 )
            // InternalMetaCrySL.g:2276:3: rule__AggregateList__LabelsAssignment_0
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
    // InternalMetaCrySL.g:2284:1: rule__AggregateList__Group__1 : rule__AggregateList__Group__1__Impl ;
    public final void rule__AggregateList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2288:1: ( rule__AggregateList__Group__1__Impl )
            // InternalMetaCrySL.g:2289:2: rule__AggregateList__Group__1__Impl
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
    // InternalMetaCrySL.g:2295:1: rule__AggregateList__Group__1__Impl : ( ( rule__AggregateList__Group_1__0 )* ) ;
    public final void rule__AggregateList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2299:1: ( ( ( rule__AggregateList__Group_1__0 )* ) )
            // InternalMetaCrySL.g:2300:1: ( ( rule__AggregateList__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:2300:1: ( ( rule__AggregateList__Group_1__0 )* )
            // InternalMetaCrySL.g:2301:2: ( rule__AggregateList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:2302:2: ( rule__AggregateList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMetaCrySL.g:2302:3: rule__AggregateList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AggregateList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMetaCrySL.g:2311:1: rule__AggregateList__Group_1__0 : rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1 ;
    public final void rule__AggregateList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2315:1: ( rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1 )
            // InternalMetaCrySL.g:2316:2: rule__AggregateList__Group_1__0__Impl rule__AggregateList__Group_1__1
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
    // InternalMetaCrySL.g:2323:1: rule__AggregateList__Group_1__0__Impl : ( '|' ) ;
    public final void rule__AggregateList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2327:1: ( ( '|' ) )
            // InternalMetaCrySL.g:2328:1: ( '|' )
            {
            // InternalMetaCrySL.g:2328:1: ( '|' )
            // InternalMetaCrySL.g:2329:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getVerticalLineKeyword_1_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2338:1: rule__AggregateList__Group_1__1 : rule__AggregateList__Group_1__1__Impl ;
    public final void rule__AggregateList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2342:1: ( rule__AggregateList__Group_1__1__Impl )
            // InternalMetaCrySL.g:2343:2: rule__AggregateList__Group_1__1__Impl
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
    // InternalMetaCrySL.g:2349:1: rule__AggregateList__Group_1__1__Impl : ( ( rule__AggregateList__LabelsAssignment_1_1 ) ) ;
    public final void rule__AggregateList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2353:1: ( ( ( rule__AggregateList__LabelsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:2354:1: ( ( rule__AggregateList__LabelsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:2354:1: ( ( rule__AggregateList__LabelsAssignment_1_1 ) )
            // InternalMetaCrySL.g:2355:2: ( rule__AggregateList__LabelsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregateListAccess().getLabelsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:2356:2: ( rule__AggregateList__LabelsAssignment_1_1 )
            // InternalMetaCrySL.g:2356:3: rule__AggregateList__LabelsAssignment_1_1
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
    // InternalMetaCrySL.g:2365:1: rule__MethodDef__Group__0 : rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1 ;
    public final void rule__MethodDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2369:1: ( rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1 )
            // InternalMetaCrySL.g:2370:2: rule__MethodDef__Group__0__Impl rule__MethodDef__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMetaCrySL.g:2377:1: rule__MethodDef__Group__0__Impl : ( ( rule__MethodDef__MethodNameAssignment_0 ) ) ;
    public final void rule__MethodDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2381:1: ( ( ( rule__MethodDef__MethodNameAssignment_0 ) ) )
            // InternalMetaCrySL.g:2382:1: ( ( rule__MethodDef__MethodNameAssignment_0 ) )
            {
            // InternalMetaCrySL.g:2382:1: ( ( rule__MethodDef__MethodNameAssignment_0 ) )
            // InternalMetaCrySL.g:2383:2: ( rule__MethodDef__MethodNameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getMethodNameAssignment_0()); 
            }
            // InternalMetaCrySL.g:2384:2: ( rule__MethodDef__MethodNameAssignment_0 )
            // InternalMetaCrySL.g:2384:3: rule__MethodDef__MethodNameAssignment_0
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
    // InternalMetaCrySL.g:2392:1: rule__MethodDef__Group__1 : rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2 ;
    public final void rule__MethodDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2396:1: ( rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2 )
            // InternalMetaCrySL.g:2397:2: rule__MethodDef__Group__1__Impl rule__MethodDef__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaCrySL.g:2404:1: rule__MethodDef__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2408:1: ( ( '(' ) )
            // InternalMetaCrySL.g:2409:1: ( '(' )
            {
            // InternalMetaCrySL.g:2409:1: ( '(' )
            // InternalMetaCrySL.g:2410:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2419:1: rule__MethodDef__Group__2 : rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3 ;
    public final void rule__MethodDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2423:1: ( rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3 )
            // InternalMetaCrySL.g:2424:2: rule__MethodDef__Group__2__Impl rule__MethodDef__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMetaCrySL.g:2431:1: rule__MethodDef__Group__2__Impl : ( ( rule__MethodDef__ArgsAssignment_2 )? ) ;
    public final void rule__MethodDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2435:1: ( ( ( rule__MethodDef__ArgsAssignment_2 )? ) )
            // InternalMetaCrySL.g:2436:1: ( ( rule__MethodDef__ArgsAssignment_2 )? )
            {
            // InternalMetaCrySL.g:2436:1: ( ( rule__MethodDef__ArgsAssignment_2 )? )
            // InternalMetaCrySL.g:2437:2: ( rule__MethodDef__ArgsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getArgsAssignment_2()); 
            }
            // InternalMetaCrySL.g:2438:2: ( rule__MethodDef__ArgsAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMetaCrySL.g:2438:3: rule__MethodDef__ArgsAssignment_2
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
    // InternalMetaCrySL.g:2446:1: rule__MethodDef__Group__3 : rule__MethodDef__Group__3__Impl ;
    public final void rule__MethodDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2450:1: ( rule__MethodDef__Group__3__Impl )
            // InternalMetaCrySL.g:2451:2: rule__MethodDef__Group__3__Impl
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
    // InternalMetaCrySL.g:2457:1: rule__MethodDef__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2461:1: ( ( ')' ) )
            // InternalMetaCrySL.g:2462:1: ( ')' )
            {
            // InternalMetaCrySL.g:2462:1: ( ')' )
            // InternalMetaCrySL.g:2463:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDefAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2473:1: rule__FormalArgs__Group__0 : rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1 ;
    public final void rule__FormalArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2477:1: ( rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1 )
            // InternalMetaCrySL.g:2478:2: rule__FormalArgs__Group__0__Impl rule__FormalArgs__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaCrySL.g:2485:1: rule__FormalArgs__Group__0__Impl : ( ( rule__FormalArgs__ArgsAssignment_0 ) ) ;
    public final void rule__FormalArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2489:1: ( ( ( rule__FormalArgs__ArgsAssignment_0 ) ) )
            // InternalMetaCrySL.g:2490:1: ( ( rule__FormalArgs__ArgsAssignment_0 ) )
            {
            // InternalMetaCrySL.g:2490:1: ( ( rule__FormalArgs__ArgsAssignment_0 ) )
            // InternalMetaCrySL.g:2491:2: ( rule__FormalArgs__ArgsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsAssignment_0()); 
            }
            // InternalMetaCrySL.g:2492:2: ( rule__FormalArgs__ArgsAssignment_0 )
            // InternalMetaCrySL.g:2492:3: rule__FormalArgs__ArgsAssignment_0
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
    // InternalMetaCrySL.g:2500:1: rule__FormalArgs__Group__1 : rule__FormalArgs__Group__1__Impl ;
    public final void rule__FormalArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2504:1: ( rule__FormalArgs__Group__1__Impl )
            // InternalMetaCrySL.g:2505:2: rule__FormalArgs__Group__1__Impl
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
    // InternalMetaCrySL.g:2511:1: rule__FormalArgs__Group__1__Impl : ( ( rule__FormalArgs__Group_1__0 )* ) ;
    public final void rule__FormalArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2515:1: ( ( ( rule__FormalArgs__Group_1__0 )* ) )
            // InternalMetaCrySL.g:2516:1: ( ( rule__FormalArgs__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:2516:1: ( ( rule__FormalArgs__Group_1__0 )* )
            // InternalMetaCrySL.g:2517:2: ( rule__FormalArgs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:2518:2: ( rule__FormalArgs__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMetaCrySL.g:2518:3: rule__FormalArgs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FormalArgs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMetaCrySL.g:2527:1: rule__FormalArgs__Group_1__0 : rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1 ;
    public final void rule__FormalArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2531:1: ( rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1 )
            // InternalMetaCrySL.g:2532:2: rule__FormalArgs__Group_1__0__Impl rule__FormalArgs__Group_1__1
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
    // InternalMetaCrySL.g:2539:1: rule__FormalArgs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FormalArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2543:1: ( ( ',' ) )
            // InternalMetaCrySL.g:2544:1: ( ',' )
            {
            // InternalMetaCrySL.g:2544:1: ( ',' )
            // InternalMetaCrySL.g:2545:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2554:1: rule__FormalArgs__Group_1__1 : rule__FormalArgs__Group_1__1__Impl ;
    public final void rule__FormalArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2558:1: ( rule__FormalArgs__Group_1__1__Impl )
            // InternalMetaCrySL.g:2559:2: rule__FormalArgs__Group_1__1__Impl
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
    // InternalMetaCrySL.g:2565:1: rule__FormalArgs__Group_1__1__Impl : ( ( rule__FormalArgs__ArgsAssignment_1_1 ) ) ;
    public final void rule__FormalArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2569:1: ( ( ( rule__FormalArgs__ArgsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:2570:1: ( ( rule__FormalArgs__ArgsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:2570:1: ( ( rule__FormalArgs__ArgsAssignment_1_1 ) )
            // InternalMetaCrySL.g:2571:2: ( rule__FormalArgs__ArgsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:2572:2: ( rule__FormalArgs__ArgsAssignment_1_1 )
            // InternalMetaCrySL.g:2572:3: rule__FormalArgs__ArgsAssignment_1_1
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
    // InternalMetaCrySL.g:2581:1: rule__OrderSpec__Group__0 : rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1 ;
    public final void rule__OrderSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2585:1: ( rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1 )
            // InternalMetaCrySL.g:2586:2: rule__OrderSpec__Group__0__Impl rule__OrderSpec__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMetaCrySL.g:2593:1: rule__OrderSpec__Group__0__Impl : ( () ) ;
    public final void rule__OrderSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2597:1: ( ( () ) )
            // InternalMetaCrySL.g:2598:1: ( () )
            {
            // InternalMetaCrySL.g:2598:1: ( () )
            // InternalMetaCrySL.g:2599:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getOrderSpecAction_0()); 
            }
            // InternalMetaCrySL.g:2600:2: ()
            // InternalMetaCrySL.g:2600:3: 
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
    // InternalMetaCrySL.g:2608:1: rule__OrderSpec__Group__1 : rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2 ;
    public final void rule__OrderSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2612:1: ( rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2 )
            // InternalMetaCrySL.g:2613:2: rule__OrderSpec__Group__1__Impl rule__OrderSpec__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:2620:1: rule__OrderSpec__Group__1__Impl : ( 'ORDER' ) ;
    public final void rule__OrderSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2624:1: ( ( 'ORDER' ) )
            // InternalMetaCrySL.g:2625:1: ( 'ORDER' )
            {
            // InternalMetaCrySL.g:2625:1: ( 'ORDER' )
            // InternalMetaCrySL.g:2626:2: 'ORDER'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getORDERKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2635:1: rule__OrderSpec__Group__2 : rule__OrderSpec__Group__2__Impl ;
    public final void rule__OrderSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2639:1: ( rule__OrderSpec__Group__2__Impl )
            // InternalMetaCrySL.g:2640:2: rule__OrderSpec__Group__2__Impl
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
    // InternalMetaCrySL.g:2646:1: rule__OrderSpec__Group__2__Impl : ( ( rule__OrderSpec__OrderAssignment_2 ) ) ;
    public final void rule__OrderSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2650:1: ( ( ( rule__OrderSpec__OrderAssignment_2 ) ) )
            // InternalMetaCrySL.g:2651:1: ( ( rule__OrderSpec__OrderAssignment_2 ) )
            {
            // InternalMetaCrySL.g:2651:1: ( ( rule__OrderSpec__OrderAssignment_2 ) )
            // InternalMetaCrySL.g:2652:2: ( rule__OrderSpec__OrderAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderSpecAccess().getOrderAssignment_2()); 
            }
            // InternalMetaCrySL.g:2653:2: ( rule__OrderSpec__OrderAssignment_2 )
            // InternalMetaCrySL.g:2653:3: rule__OrderSpec__OrderAssignment_2
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
    // InternalMetaCrySL.g:2662:1: rule__EventExp__Group_0__0 : rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1 ;
    public final void rule__EventExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2666:1: ( rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1 )
            // InternalMetaCrySL.g:2667:2: rule__EventExp__Group_0__0__Impl rule__EventExp__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:2674:1: rule__EventExp__Group_0__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2678:1: ( ( () ) )
            // InternalMetaCrySL.g:2679:1: ( () )
            {
            // InternalMetaCrySL.g:2679:1: ( () )
            // InternalMetaCrySL.g:2680:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getOptionalAction_0_0()); 
            }
            // InternalMetaCrySL.g:2681:2: ()
            // InternalMetaCrySL.g:2681:3: 
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
    // InternalMetaCrySL.g:2689:1: rule__EventExp__Group_0__1 : rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2 ;
    public final void rule__EventExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2693:1: ( rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2 )
            // InternalMetaCrySL.g:2694:2: rule__EventExp__Group_0__1__Impl rule__EventExp__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMetaCrySL.g:2701:1: rule__EventExp__Group_0__1__Impl : ( ( rule__EventExp__ExpAssignment_0_1 ) ) ;
    public final void rule__EventExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2705:1: ( ( ( rule__EventExp__ExpAssignment_0_1 ) ) )
            // InternalMetaCrySL.g:2706:1: ( ( rule__EventExp__ExpAssignment_0_1 ) )
            {
            // InternalMetaCrySL.g:2706:1: ( ( rule__EventExp__ExpAssignment_0_1 ) )
            // InternalMetaCrySL.g:2707:2: ( rule__EventExp__ExpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_0_1()); 
            }
            // InternalMetaCrySL.g:2708:2: ( rule__EventExp__ExpAssignment_0_1 )
            // InternalMetaCrySL.g:2708:3: rule__EventExp__ExpAssignment_0_1
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
    // InternalMetaCrySL.g:2716:1: rule__EventExp__Group_0__2 : rule__EventExp__Group_0__2__Impl ;
    public final void rule__EventExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2720:1: ( rule__EventExp__Group_0__2__Impl )
            // InternalMetaCrySL.g:2721:2: rule__EventExp__Group_0__2__Impl
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
    // InternalMetaCrySL.g:2727:1: rule__EventExp__Group_0__2__Impl : ( '?' ) ;
    public final void rule__EventExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2731:1: ( ( '?' ) )
            // InternalMetaCrySL.g:2732:1: ( '?' )
            {
            // InternalMetaCrySL.g:2732:1: ( '?' )
            // InternalMetaCrySL.g:2733:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getQuestionMarkKeyword_0_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2743:1: rule__EventExp__Group_1__0 : rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1 ;
    public final void rule__EventExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2747:1: ( rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1 )
            // InternalMetaCrySL.g:2748:2: rule__EventExp__Group_1__0__Impl rule__EventExp__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:2755:1: rule__EventExp__Group_1__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2759:1: ( ( () ) )
            // InternalMetaCrySL.g:2760:1: ( () )
            {
            // InternalMetaCrySL.g:2760:1: ( () )
            // InternalMetaCrySL.g:2761:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getZeroOrMoreAction_1_0()); 
            }
            // InternalMetaCrySL.g:2762:2: ()
            // InternalMetaCrySL.g:2762:3: 
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
    // InternalMetaCrySL.g:2770:1: rule__EventExp__Group_1__1 : rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2 ;
    public final void rule__EventExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2774:1: ( rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2 )
            // InternalMetaCrySL.g:2775:2: rule__EventExp__Group_1__1__Impl rule__EventExp__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMetaCrySL.g:2782:1: rule__EventExp__Group_1__1__Impl : ( ( rule__EventExp__ExpAssignment_1_1 ) ) ;
    public final void rule__EventExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2786:1: ( ( ( rule__EventExp__ExpAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:2787:1: ( ( rule__EventExp__ExpAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:2787:1: ( ( rule__EventExp__ExpAssignment_1_1 ) )
            // InternalMetaCrySL.g:2788:2: ( rule__EventExp__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:2789:2: ( rule__EventExp__ExpAssignment_1_1 )
            // InternalMetaCrySL.g:2789:3: rule__EventExp__ExpAssignment_1_1
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
    // InternalMetaCrySL.g:2797:1: rule__EventExp__Group_1__2 : rule__EventExp__Group_1__2__Impl ;
    public final void rule__EventExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2801:1: ( rule__EventExp__Group_1__2__Impl )
            // InternalMetaCrySL.g:2802:2: rule__EventExp__Group_1__2__Impl
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
    // InternalMetaCrySL.g:2808:1: rule__EventExp__Group_1__2__Impl : ( '*' ) ;
    public final void rule__EventExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2812:1: ( ( '*' ) )
            // InternalMetaCrySL.g:2813:1: ( '*' )
            {
            // InternalMetaCrySL.g:2813:1: ( '*' )
            // InternalMetaCrySL.g:2814:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getAsteriskKeyword_1_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2824:1: rule__EventExp__Group_2__0 : rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1 ;
    public final void rule__EventExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2828:1: ( rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1 )
            // InternalMetaCrySL.g:2829:2: rule__EventExp__Group_2__0__Impl rule__EventExp__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:2836:1: rule__EventExp__Group_2__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2840:1: ( ( () ) )
            // InternalMetaCrySL.g:2841:1: ( () )
            {
            // InternalMetaCrySL.g:2841:1: ( () )
            // InternalMetaCrySL.g:2842:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getOneOrMoreAction_2_0()); 
            }
            // InternalMetaCrySL.g:2843:2: ()
            // InternalMetaCrySL.g:2843:3: 
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
    // InternalMetaCrySL.g:2851:1: rule__EventExp__Group_2__1 : rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2 ;
    public final void rule__EventExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2855:1: ( rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2 )
            // InternalMetaCrySL.g:2856:2: rule__EventExp__Group_2__1__Impl rule__EventExp__Group_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMetaCrySL.g:2863:1: rule__EventExp__Group_2__1__Impl : ( ( rule__EventExp__ExpAssignment_2_1 ) ) ;
    public final void rule__EventExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2867:1: ( ( ( rule__EventExp__ExpAssignment_2_1 ) ) )
            // InternalMetaCrySL.g:2868:1: ( ( rule__EventExp__ExpAssignment_2_1 ) )
            {
            // InternalMetaCrySL.g:2868:1: ( ( rule__EventExp__ExpAssignment_2_1 ) )
            // InternalMetaCrySL.g:2869:2: ( rule__EventExp__ExpAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_2_1()); 
            }
            // InternalMetaCrySL.g:2870:2: ( rule__EventExp__ExpAssignment_2_1 )
            // InternalMetaCrySL.g:2870:3: rule__EventExp__ExpAssignment_2_1
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
    // InternalMetaCrySL.g:2878:1: rule__EventExp__Group_2__2 : rule__EventExp__Group_2__2__Impl ;
    public final void rule__EventExp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2882:1: ( rule__EventExp__Group_2__2__Impl )
            // InternalMetaCrySL.g:2883:2: rule__EventExp__Group_2__2__Impl
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
    // InternalMetaCrySL.g:2889:1: rule__EventExp__Group_2__2__Impl : ( '+' ) ;
    public final void rule__EventExp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2893:1: ( ( '+' ) )
            // InternalMetaCrySL.g:2894:1: ( '+' )
            {
            // InternalMetaCrySL.g:2894:1: ( '+' )
            // InternalMetaCrySL.g:2895:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getPlusSignKeyword_2_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:2905:1: rule__EventExp__Group_3__0 : rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1 ;
    public final void rule__EventExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2909:1: ( rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1 )
            // InternalMetaCrySL.g:2910:2: rule__EventExp__Group_3__0__Impl rule__EventExp__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:2917:1: rule__EventExp__Group_3__0__Impl : ( () ) ;
    public final void rule__EventExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2921:1: ( ( () ) )
            // InternalMetaCrySL.g:2922:1: ( () )
            {
            // InternalMetaCrySL.g:2922:1: ( () )
            // InternalMetaCrySL.g:2923:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getChoiceExpAction_3_0()); 
            }
            // InternalMetaCrySL.g:2924:2: ()
            // InternalMetaCrySL.g:2924:3: 
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
    // InternalMetaCrySL.g:2932:1: rule__EventExp__Group_3__1 : rule__EventExp__Group_3__1__Impl ;
    public final void rule__EventExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2936:1: ( rule__EventExp__Group_3__1__Impl )
            // InternalMetaCrySL.g:2937:2: rule__EventExp__Group_3__1__Impl
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
    // InternalMetaCrySL.g:2943:1: rule__EventExp__Group_3__1__Impl : ( ( rule__EventExp__ExpAssignment_3_1 ) ) ;
    public final void rule__EventExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2947:1: ( ( ( rule__EventExp__ExpAssignment_3_1 ) ) )
            // InternalMetaCrySL.g:2948:1: ( ( rule__EventExp__ExpAssignment_3_1 ) )
            {
            // InternalMetaCrySL.g:2948:1: ( ( rule__EventExp__ExpAssignment_3_1 ) )
            // InternalMetaCrySL.g:2949:2: ( rule__EventExp__ExpAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventExpAccess().getExpAssignment_3_1()); 
            }
            // InternalMetaCrySL.g:2950:2: ( rule__EventExp__ExpAssignment_3_1 )
            // InternalMetaCrySL.g:2950:3: rule__EventExp__ExpAssignment_3_1
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
    // InternalMetaCrySL.g:2959:1: rule__ChoiceExp__Group__0 : rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1 ;
    public final void rule__ChoiceExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2963:1: ( rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1 )
            // InternalMetaCrySL.g:2964:2: rule__ChoiceExp__Group__0__Impl rule__ChoiceExp__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaCrySL.g:2971:1: rule__ChoiceExp__Group__0__Impl : ( ruleSequenceExp ) ;
    public final void rule__ChoiceExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2975:1: ( ( ruleSequenceExp ) )
            // InternalMetaCrySL.g:2976:1: ( ruleSequenceExp )
            {
            // InternalMetaCrySL.g:2976:1: ( ruleSequenceExp )
            // InternalMetaCrySL.g:2977:2: ruleSequenceExp
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
    // InternalMetaCrySL.g:2986:1: rule__ChoiceExp__Group__1 : rule__ChoiceExp__Group__1__Impl ;
    public final void rule__ChoiceExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:2990:1: ( rule__ChoiceExp__Group__1__Impl )
            // InternalMetaCrySL.g:2991:2: rule__ChoiceExp__Group__1__Impl
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
    // InternalMetaCrySL.g:2997:1: rule__ChoiceExp__Group__1__Impl : ( ( rule__ChoiceExp__Group_1__0 )* ) ;
    public final void rule__ChoiceExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3001:1: ( ( ( rule__ChoiceExp__Group_1__0 )* ) )
            // InternalMetaCrySL.g:3002:1: ( ( rule__ChoiceExp__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:3002:1: ( ( rule__ChoiceExp__Group_1__0 )* )
            // InternalMetaCrySL.g:3003:2: ( rule__ChoiceExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:3004:2: ( rule__ChoiceExp__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMetaCrySL.g:3004:3: rule__ChoiceExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ChoiceExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMetaCrySL.g:3013:1: rule__ChoiceExp__Group_1__0 : rule__ChoiceExp__Group_1__0__Impl ;
    public final void rule__ChoiceExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3017:1: ( rule__ChoiceExp__Group_1__0__Impl )
            // InternalMetaCrySL.g:3018:2: rule__ChoiceExp__Group_1__0__Impl
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
    // InternalMetaCrySL.g:3024:1: rule__ChoiceExp__Group_1__0__Impl : ( ( rule__ChoiceExp__Group_1_0__0 ) ) ;
    public final void rule__ChoiceExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3028:1: ( ( ( rule__ChoiceExp__Group_1_0__0 ) ) )
            // InternalMetaCrySL.g:3029:1: ( ( rule__ChoiceExp__Group_1_0__0 ) )
            {
            // InternalMetaCrySL.g:3029:1: ( ( rule__ChoiceExp__Group_1_0__0 ) )
            // InternalMetaCrySL.g:3030:2: ( rule__ChoiceExp__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getGroup_1_0()); 
            }
            // InternalMetaCrySL.g:3031:2: ( rule__ChoiceExp__Group_1_0__0 )
            // InternalMetaCrySL.g:3031:3: rule__ChoiceExp__Group_1_0__0
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
    // InternalMetaCrySL.g:3040:1: rule__ChoiceExp__Group_1_0__0 : rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1 ;
    public final void rule__ChoiceExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3044:1: ( rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1 )
            // InternalMetaCrySL.g:3045:2: rule__ChoiceExp__Group_1_0__0__Impl rule__ChoiceExp__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMetaCrySL.g:3052:1: rule__ChoiceExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ChoiceExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3056:1: ( ( () ) )
            // InternalMetaCrySL.g:3057:1: ( () )
            {
            // InternalMetaCrySL.g:3057:1: ( () )
            // InternalMetaCrySL.g:3058:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0()); 
            }
            // InternalMetaCrySL.g:3059:2: ()
            // InternalMetaCrySL.g:3059:3: 
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
    // InternalMetaCrySL.g:3067:1: rule__ChoiceExp__Group_1_0__1 : rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2 ;
    public final void rule__ChoiceExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3071:1: ( rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2 )
            // InternalMetaCrySL.g:3072:2: rule__ChoiceExp__Group_1_0__1__Impl rule__ChoiceExp__Group_1_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:3079:1: rule__ChoiceExp__Group_1_0__1__Impl : ( '|' ) ;
    public final void rule__ChoiceExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3083:1: ( ( '|' ) )
            // InternalMetaCrySL.g:3084:1: ( '|' )
            {
            // InternalMetaCrySL.g:3084:1: ( '|' )
            // InternalMetaCrySL.g:3085:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getVerticalLineKeyword_1_0_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3094:1: rule__ChoiceExp__Group_1_0__2 : rule__ChoiceExp__Group_1_0__2__Impl ;
    public final void rule__ChoiceExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3098:1: ( rule__ChoiceExp__Group_1_0__2__Impl )
            // InternalMetaCrySL.g:3099:2: rule__ChoiceExp__Group_1_0__2__Impl
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
    // InternalMetaCrySL.g:3105:1: rule__ChoiceExp__Group_1_0__2__Impl : ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__ChoiceExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3109:1: ( ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:3110:1: ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:3110:1: ( ( rule__ChoiceExp__RightAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:3111:2: ( rule__ChoiceExp__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceExpAccess().getRightAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:3112:2: ( rule__ChoiceExp__RightAssignment_1_0_2 )
            // InternalMetaCrySL.g:3112:3: rule__ChoiceExp__RightAssignment_1_0_2
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
    // InternalMetaCrySL.g:3121:1: rule__SequenceExp__Group__0 : rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1 ;
    public final void rule__SequenceExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3125:1: ( rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1 )
            // InternalMetaCrySL.g:3126:2: rule__SequenceExp__Group__0__Impl rule__SequenceExp__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaCrySL.g:3133:1: rule__SequenceExp__Group__0__Impl : ( rulePrimaryExp ) ;
    public final void rule__SequenceExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3137:1: ( ( rulePrimaryExp ) )
            // InternalMetaCrySL.g:3138:1: ( rulePrimaryExp )
            {
            // InternalMetaCrySL.g:3138:1: ( rulePrimaryExp )
            // InternalMetaCrySL.g:3139:2: rulePrimaryExp
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
    // InternalMetaCrySL.g:3148:1: rule__SequenceExp__Group__1 : rule__SequenceExp__Group__1__Impl ;
    public final void rule__SequenceExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3152:1: ( rule__SequenceExp__Group__1__Impl )
            // InternalMetaCrySL.g:3153:2: rule__SequenceExp__Group__1__Impl
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
    // InternalMetaCrySL.g:3159:1: rule__SequenceExp__Group__1__Impl : ( ( rule__SequenceExp__Group_1__0 )* ) ;
    public final void rule__SequenceExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3163:1: ( ( ( rule__SequenceExp__Group_1__0 )* ) )
            // InternalMetaCrySL.g:3164:1: ( ( rule__SequenceExp__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:3164:1: ( ( rule__SequenceExp__Group_1__0 )* )
            // InternalMetaCrySL.g:3165:2: ( rule__SequenceExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:3166:2: ( rule__SequenceExp__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMetaCrySL.g:3166:3: rule__SequenceExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SequenceExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMetaCrySL.g:3175:1: rule__SequenceExp__Group_1__0 : rule__SequenceExp__Group_1__0__Impl ;
    public final void rule__SequenceExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3179:1: ( rule__SequenceExp__Group_1__0__Impl )
            // InternalMetaCrySL.g:3180:2: rule__SequenceExp__Group_1__0__Impl
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
    // InternalMetaCrySL.g:3186:1: rule__SequenceExp__Group_1__0__Impl : ( ( rule__SequenceExp__Group_1_0__0 ) ) ;
    public final void rule__SequenceExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3190:1: ( ( ( rule__SequenceExp__Group_1_0__0 ) ) )
            // InternalMetaCrySL.g:3191:1: ( ( rule__SequenceExp__Group_1_0__0 ) )
            {
            // InternalMetaCrySL.g:3191:1: ( ( rule__SequenceExp__Group_1_0__0 ) )
            // InternalMetaCrySL.g:3192:2: ( rule__SequenceExp__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getGroup_1_0()); 
            }
            // InternalMetaCrySL.g:3193:2: ( rule__SequenceExp__Group_1_0__0 )
            // InternalMetaCrySL.g:3193:3: rule__SequenceExp__Group_1_0__0
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
    // InternalMetaCrySL.g:3202:1: rule__SequenceExp__Group_1_0__0 : rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1 ;
    public final void rule__SequenceExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3206:1: ( rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1 )
            // InternalMetaCrySL.g:3207:2: rule__SequenceExp__Group_1_0__0__Impl rule__SequenceExp__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaCrySL.g:3214:1: rule__SequenceExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__SequenceExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3218:1: ( ( () ) )
            // InternalMetaCrySL.g:3219:1: ( () )
            {
            // InternalMetaCrySL.g:3219:1: ( () )
            // InternalMetaCrySL.g:3220:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0()); 
            }
            // InternalMetaCrySL.g:3221:2: ()
            // InternalMetaCrySL.g:3221:3: 
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
    // InternalMetaCrySL.g:3229:1: rule__SequenceExp__Group_1_0__1 : rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2 ;
    public final void rule__SequenceExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3233:1: ( rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2 )
            // InternalMetaCrySL.g:3234:2: rule__SequenceExp__Group_1_0__1__Impl rule__SequenceExp__Group_1_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:3241:1: rule__SequenceExp__Group_1_0__1__Impl : ( ',' ) ;
    public final void rule__SequenceExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3245:1: ( ( ',' ) )
            // InternalMetaCrySL.g:3246:1: ( ',' )
            {
            // InternalMetaCrySL.g:3246:1: ( ',' )
            // InternalMetaCrySL.g:3247:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getCommaKeyword_1_0_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3256:1: rule__SequenceExp__Group_1_0__2 : rule__SequenceExp__Group_1_0__2__Impl ;
    public final void rule__SequenceExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3260:1: ( rule__SequenceExp__Group_1_0__2__Impl )
            // InternalMetaCrySL.g:3261:2: rule__SequenceExp__Group_1_0__2__Impl
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
    // InternalMetaCrySL.g:3267:1: rule__SequenceExp__Group_1_0__2__Impl : ( ( rule__SequenceExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__SequenceExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3271:1: ( ( ( rule__SequenceExp__RightAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:3272:1: ( ( rule__SequenceExp__RightAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:3272:1: ( ( rule__SequenceExp__RightAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:3273:2: ( rule__SequenceExp__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceExpAccess().getRightAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:3274:2: ( rule__SequenceExp__RightAssignment_1_0_2 )
            // InternalMetaCrySL.g:3274:3: rule__SequenceExp__RightAssignment_1_0_2
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
    // InternalMetaCrySL.g:3283:1: rule__PrimaryExp__Group_1__0 : rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1 ;
    public final void rule__PrimaryExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3287:1: ( rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1 )
            // InternalMetaCrySL.g:3288:2: rule__PrimaryExp__Group_1__0__Impl rule__PrimaryExp__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMetaCrySL.g:3295:1: rule__PrimaryExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3299:1: ( ( '(' ) )
            // InternalMetaCrySL.g:3300:1: ( '(' )
            {
            // InternalMetaCrySL.g:3300:1: ( '(' )
            // InternalMetaCrySL.g:3301:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3310:1: rule__PrimaryExp__Group_1__1 : rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2 ;
    public final void rule__PrimaryExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3314:1: ( rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2 )
            // InternalMetaCrySL.g:3315:2: rule__PrimaryExp__Group_1__1__Impl rule__PrimaryExp__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMetaCrySL.g:3322:1: rule__PrimaryExp__Group_1__1__Impl : ( ruleChoiceExp ) ;
    public final void rule__PrimaryExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3326:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:3327:1: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:3327:1: ( ruleChoiceExp )
            // InternalMetaCrySL.g:3328:2: ruleChoiceExp
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
    // InternalMetaCrySL.g:3337:1: rule__PrimaryExp__Group_1__2 : rule__PrimaryExp__Group_1__2__Impl ;
    public final void rule__PrimaryExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3341:1: ( rule__PrimaryExp__Group_1__2__Impl )
            // InternalMetaCrySL.g:3342:2: rule__PrimaryExp__Group_1__2__Impl
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
    // InternalMetaCrySL.g:3348:1: rule__PrimaryExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3352:1: ( ( ')' ) )
            // InternalMetaCrySL.g:3353:1: ( ')' )
            {
            // InternalMetaCrySL.g:3353:1: ( ')' )
            // InternalMetaCrySL.g:3354:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3364:1: rule__JvmTypeReference__Group_0__0 : rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 ;
    public final void rule__JvmTypeReference__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3368:1: ( rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1 )
            // InternalMetaCrySL.g:3369:2: rule__JvmTypeReference__Group_0__0__Impl rule__JvmTypeReference__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMetaCrySL.g:3376:1: rule__JvmTypeReference__Group_0__0__Impl : ( ruleJvmParameterizedTypeReference ) ;
    public final void rule__JvmTypeReference__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3380:1: ( ( ruleJvmParameterizedTypeReference ) )
            // InternalMetaCrySL.g:3381:1: ( ruleJvmParameterizedTypeReference )
            {
            // InternalMetaCrySL.g:3381:1: ( ruleJvmParameterizedTypeReference )
            // InternalMetaCrySL.g:3382:2: ruleJvmParameterizedTypeReference
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
    // InternalMetaCrySL.g:3391:1: rule__JvmTypeReference__Group_0__1 : rule__JvmTypeReference__Group_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3395:1: ( rule__JvmTypeReference__Group_0__1__Impl )
            // InternalMetaCrySL.g:3396:2: rule__JvmTypeReference__Group_0__1__Impl
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
    // InternalMetaCrySL.g:3402:1: rule__JvmTypeReference__Group_0__1__Impl : ( ( rule__JvmTypeReference__Group_0_1__0 )* ) ;
    public final void rule__JvmTypeReference__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3406:1: ( ( ( rule__JvmTypeReference__Group_0_1__0 )* ) )
            // InternalMetaCrySL.g:3407:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            {
            // InternalMetaCrySL.g:3407:1: ( ( rule__JvmTypeReference__Group_0_1__0 )* )
            // InternalMetaCrySL.g:3408:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:3409:2: ( rule__JvmTypeReference__Group_0_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMetaCrySL.g:3409:3: rule__JvmTypeReference__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__JvmTypeReference__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMetaCrySL.g:3418:1: rule__JvmTypeReference__Group_0_1__0 : rule__JvmTypeReference__Group_0_1__0__Impl ;
    public final void rule__JvmTypeReference__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3422:1: ( rule__JvmTypeReference__Group_0_1__0__Impl )
            // InternalMetaCrySL.g:3423:2: rule__JvmTypeReference__Group_0_1__0__Impl
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
    // InternalMetaCrySL.g:3429:1: rule__JvmTypeReference__Group_0_1__0__Impl : ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) ;
    public final void rule__JvmTypeReference__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3433:1: ( ( ( rule__JvmTypeReference__Group_0_1_0__0 ) ) )
            // InternalMetaCrySL.g:3434:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            {
            // InternalMetaCrySL.g:3434:1: ( ( rule__JvmTypeReference__Group_0_1_0__0 ) )
            // InternalMetaCrySL.g:3435:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getGroup_0_1_0()); 
            }
            // InternalMetaCrySL.g:3436:2: ( rule__JvmTypeReference__Group_0_1_0__0 )
            // InternalMetaCrySL.g:3436:3: rule__JvmTypeReference__Group_0_1_0__0
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
    // InternalMetaCrySL.g:3445:1: rule__JvmTypeReference__Group_0_1_0__0 : rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 ;
    public final void rule__JvmTypeReference__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3449:1: ( rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1 )
            // InternalMetaCrySL.g:3450:2: rule__JvmTypeReference__Group_0_1_0__0__Impl rule__JvmTypeReference__Group_0_1_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMetaCrySL.g:3457:1: rule__JvmTypeReference__Group_0_1_0__0__Impl : ( () ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3461:1: ( ( () ) )
            // InternalMetaCrySL.g:3462:1: ( () )
            {
            // InternalMetaCrySL.g:3462:1: ( () )
            // InternalMetaCrySL.g:3463:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()); 
            }
            // InternalMetaCrySL.g:3464:2: ()
            // InternalMetaCrySL.g:3464:3: 
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
    // InternalMetaCrySL.g:3472:1: rule__JvmTypeReference__Group_0_1_0__1 : rule__JvmTypeReference__Group_0_1_0__1__Impl ;
    public final void rule__JvmTypeReference__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3476:1: ( rule__JvmTypeReference__Group_0_1_0__1__Impl )
            // InternalMetaCrySL.g:3477:2: rule__JvmTypeReference__Group_0_1_0__1__Impl
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
    // InternalMetaCrySL.g:3483:1: rule__JvmTypeReference__Group_0_1_0__1__Impl : ( ruleArrayBrackets ) ;
    public final void rule__JvmTypeReference__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3487:1: ( ( ruleArrayBrackets ) )
            // InternalMetaCrySL.g:3488:1: ( ruleArrayBrackets )
            {
            // InternalMetaCrySL.g:3488:1: ( ruleArrayBrackets )
            // InternalMetaCrySL.g:3489:2: ruleArrayBrackets
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
    // InternalMetaCrySL.g:3499:1: rule__ArrayBrackets__Group__0 : rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 ;
    public final void rule__ArrayBrackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3503:1: ( rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1 )
            // InternalMetaCrySL.g:3504:2: rule__ArrayBrackets__Group__0__Impl rule__ArrayBrackets__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMetaCrySL.g:3511:1: rule__ArrayBrackets__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayBrackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3515:1: ( ( '[' ) )
            // InternalMetaCrySL.g:3516:1: ( '[' )
            {
            // InternalMetaCrySL.g:3516:1: ( '[' )
            // InternalMetaCrySL.g:3517:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3526:1: rule__ArrayBrackets__Group__1 : rule__ArrayBrackets__Group__1__Impl ;
    public final void rule__ArrayBrackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3530:1: ( rule__ArrayBrackets__Group__1__Impl )
            // InternalMetaCrySL.g:3531:2: rule__ArrayBrackets__Group__1__Impl
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
    // InternalMetaCrySL.g:3537:1: rule__ArrayBrackets__Group__1__Impl : ( ']' ) ;
    public final void rule__ArrayBrackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3541:1: ( ( ']' ) )
            // InternalMetaCrySL.g:3542:1: ( ']' )
            {
            // InternalMetaCrySL.g:3542:1: ( ']' )
            // InternalMetaCrySL.g:3543:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3553:1: rule__XFunctionTypeRef__Group__0 : rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 ;
    public final void rule__XFunctionTypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3557:1: ( rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1 )
            // InternalMetaCrySL.g:3558:2: rule__XFunctionTypeRef__Group__0__Impl rule__XFunctionTypeRef__Group__1
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
    // InternalMetaCrySL.g:3565:1: rule__XFunctionTypeRef__Group__0__Impl : ( ( rule__XFunctionTypeRef__Group_0__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3569:1: ( ( ( rule__XFunctionTypeRef__Group_0__0 )? ) )
            // InternalMetaCrySL.g:3570:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            {
            // InternalMetaCrySL.g:3570:1: ( ( rule__XFunctionTypeRef__Group_0__0 )? )
            // InternalMetaCrySL.g:3571:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0()); 
            }
            // InternalMetaCrySL.g:3572:2: ( rule__XFunctionTypeRef__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMetaCrySL.g:3572:3: rule__XFunctionTypeRef__Group_0__0
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
    // InternalMetaCrySL.g:3580:1: rule__XFunctionTypeRef__Group__1 : rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 ;
    public final void rule__XFunctionTypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3584:1: ( rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2 )
            // InternalMetaCrySL.g:3585:2: rule__XFunctionTypeRef__Group__1__Impl rule__XFunctionTypeRef__Group__2
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
    // InternalMetaCrySL.g:3592:1: rule__XFunctionTypeRef__Group__1__Impl : ( '=>' ) ;
    public final void rule__XFunctionTypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3596:1: ( ( '=>' ) )
            // InternalMetaCrySL.g:3597:1: ( '=>' )
            {
            // InternalMetaCrySL.g:3597:1: ( '=>' )
            // InternalMetaCrySL.g:3598:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3607:1: rule__XFunctionTypeRef__Group__2 : rule__XFunctionTypeRef__Group__2__Impl ;
    public final void rule__XFunctionTypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3611:1: ( rule__XFunctionTypeRef__Group__2__Impl )
            // InternalMetaCrySL.g:3612:2: rule__XFunctionTypeRef__Group__2__Impl
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
    // InternalMetaCrySL.g:3618:1: rule__XFunctionTypeRef__Group__2__Impl : ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) ;
    public final void rule__XFunctionTypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3622:1: ( ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) ) )
            // InternalMetaCrySL.g:3623:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            {
            // InternalMetaCrySL.g:3623:1: ( ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 ) )
            // InternalMetaCrySL.g:3624:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeAssignment_2()); 
            }
            // InternalMetaCrySL.g:3625:2: ( rule__XFunctionTypeRef__ReturnTypeAssignment_2 )
            // InternalMetaCrySL.g:3625:3: rule__XFunctionTypeRef__ReturnTypeAssignment_2
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
    // InternalMetaCrySL.g:3634:1: rule__XFunctionTypeRef__Group_0__0 : rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 ;
    public final void rule__XFunctionTypeRef__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3638:1: ( rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1 )
            // InternalMetaCrySL.g:3639:2: rule__XFunctionTypeRef__Group_0__0__Impl rule__XFunctionTypeRef__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMetaCrySL.g:3646:1: rule__XFunctionTypeRef__Group_0__0__Impl : ( '(' ) ;
    public final void rule__XFunctionTypeRef__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3650:1: ( ( '(' ) )
            // InternalMetaCrySL.g:3651:1: ( '(' )
            {
            // InternalMetaCrySL.g:3651:1: ( '(' )
            // InternalMetaCrySL.g:3652:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3661:1: rule__XFunctionTypeRef__Group_0__1 : rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 ;
    public final void rule__XFunctionTypeRef__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3665:1: ( rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2 )
            // InternalMetaCrySL.g:3666:2: rule__XFunctionTypeRef__Group_0__1__Impl rule__XFunctionTypeRef__Group_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMetaCrySL.g:3673:1: rule__XFunctionTypeRef__Group_0__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) ;
    public final void rule__XFunctionTypeRef__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3677:1: ( ( ( rule__XFunctionTypeRef__Group_0_1__0 )? ) )
            // InternalMetaCrySL.g:3678:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            {
            // InternalMetaCrySL.g:3678:1: ( ( rule__XFunctionTypeRef__Group_0_1__0 )? )
            // InternalMetaCrySL.g:3679:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1()); 
            }
            // InternalMetaCrySL.g:3680:2: ( rule__XFunctionTypeRef__Group_0_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==16||LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMetaCrySL.g:3680:3: rule__XFunctionTypeRef__Group_0_1__0
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
    // InternalMetaCrySL.g:3688:1: rule__XFunctionTypeRef__Group_0__2 : rule__XFunctionTypeRef__Group_0__2__Impl ;
    public final void rule__XFunctionTypeRef__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3692:1: ( rule__XFunctionTypeRef__Group_0__2__Impl )
            // InternalMetaCrySL.g:3693:2: rule__XFunctionTypeRef__Group_0__2__Impl
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
    // InternalMetaCrySL.g:3699:1: rule__XFunctionTypeRef__Group_0__2__Impl : ( ')' ) ;
    public final void rule__XFunctionTypeRef__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3703:1: ( ( ')' ) )
            // InternalMetaCrySL.g:3704:1: ( ')' )
            {
            // InternalMetaCrySL.g:3704:1: ( ')' )
            // InternalMetaCrySL.g:3705:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3715:1: rule__XFunctionTypeRef__Group_0_1__0 : rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3719:1: ( rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1 )
            // InternalMetaCrySL.g:3720:2: rule__XFunctionTypeRef__Group_0_1__0__Impl rule__XFunctionTypeRef__Group_0_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMetaCrySL.g:3727:1: rule__XFunctionTypeRef__Group_0_1__0__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3731:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) ) )
            // InternalMetaCrySL.g:3732:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            {
            // InternalMetaCrySL.g:3732:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 ) )
            // InternalMetaCrySL.g:3733:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_0()); 
            }
            // InternalMetaCrySL.g:3734:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 )
            // InternalMetaCrySL.g:3734:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0
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
    // InternalMetaCrySL.g:3742:1: rule__XFunctionTypeRef__Group_0_1__1 : rule__XFunctionTypeRef__Group_0_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3746:1: ( rule__XFunctionTypeRef__Group_0_1__1__Impl )
            // InternalMetaCrySL.g:3747:2: rule__XFunctionTypeRef__Group_0_1__1__Impl
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
    // InternalMetaCrySL.g:3753:1: rule__XFunctionTypeRef__Group_0_1__1__Impl : ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) ;
    public final void rule__XFunctionTypeRef__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3757:1: ( ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* ) )
            // InternalMetaCrySL.g:3758:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            {
            // InternalMetaCrySL.g:3758:1: ( ( rule__XFunctionTypeRef__Group_0_1_1__0 )* )
            // InternalMetaCrySL.g:3759:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getGroup_0_1_1()); 
            }
            // InternalMetaCrySL.g:3760:2: ( rule__XFunctionTypeRef__Group_0_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMetaCrySL.g:3760:3: rule__XFunctionTypeRef__Group_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__XFunctionTypeRef__Group_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMetaCrySL.g:3769:1: rule__XFunctionTypeRef__Group_0_1_1__0 : rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3773:1: ( rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1 )
            // InternalMetaCrySL.g:3774:2: rule__XFunctionTypeRef__Group_0_1_1__0__Impl rule__XFunctionTypeRef__Group_0_1_1__1
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
    // InternalMetaCrySL.g:3781:1: rule__XFunctionTypeRef__Group_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3785:1: ( ( ',' ) )
            // InternalMetaCrySL.g:3786:1: ( ',' )
            {
            // InternalMetaCrySL.g:3786:1: ( ',' )
            // InternalMetaCrySL.g:3787:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3796:1: rule__XFunctionTypeRef__Group_0_1_1__1 : rule__XFunctionTypeRef__Group_0_1_1__1__Impl ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3800:1: ( rule__XFunctionTypeRef__Group_0_1_1__1__Impl )
            // InternalMetaCrySL.g:3801:2: rule__XFunctionTypeRef__Group_0_1_1__1__Impl
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
    // InternalMetaCrySL.g:3807:1: rule__XFunctionTypeRef__Group_0_1_1__1__Impl : ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) ;
    public final void rule__XFunctionTypeRef__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3811:1: ( ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) ) )
            // InternalMetaCrySL.g:3812:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            {
            // InternalMetaCrySL.g:3812:1: ( ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 ) )
            // InternalMetaCrySL.g:3813:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXFunctionTypeRefAccess().getParamTypesAssignment_0_1_1_1()); 
            }
            // InternalMetaCrySL.g:3814:2: ( rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 )
            // InternalMetaCrySL.g:3814:3: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1
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
    // InternalMetaCrySL.g:3823:1: rule__JvmParameterizedTypeReference__Group__0 : rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 ;
    public final void rule__JvmParameterizedTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3827:1: ( rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1 )
            // InternalMetaCrySL.g:3828:2: rule__JvmParameterizedTypeReference__Group__0__Impl rule__JvmParameterizedTypeReference__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMetaCrySL.g:3835:1: rule__JvmParameterizedTypeReference__Group__0__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3839:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) ) )
            // InternalMetaCrySL.g:3840:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            {
            // InternalMetaCrySL.g:3840:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_0 ) )
            // InternalMetaCrySL.g:3841:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_0()); 
            }
            // InternalMetaCrySL.g:3842:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_0 )
            // InternalMetaCrySL.g:3842:3: rule__JvmParameterizedTypeReference__TypeAssignment_0
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
    // InternalMetaCrySL.g:3850:1: rule__JvmParameterizedTypeReference__Group__1 : rule__JvmParameterizedTypeReference__Group__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3854:1: ( rule__JvmParameterizedTypeReference__Group__1__Impl )
            // InternalMetaCrySL.g:3855:2: rule__JvmParameterizedTypeReference__Group__1__Impl
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
    // InternalMetaCrySL.g:3861:1: rule__JvmParameterizedTypeReference__Group__1__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3865:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? ) )
            // InternalMetaCrySL.g:3866:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            {
            // InternalMetaCrySL.g:3866:1: ( ( rule__JvmParameterizedTypeReference__Group_1__0 )? )
            // InternalMetaCrySL.g:3867:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:3868:2: ( rule__JvmParameterizedTypeReference__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMetaCrySL.g:3868:3: rule__JvmParameterizedTypeReference__Group_1__0
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
    // InternalMetaCrySL.g:3877:1: rule__JvmParameterizedTypeReference__Group_1__0 : rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3881:1: ( rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1 )
            // InternalMetaCrySL.g:3882:2: rule__JvmParameterizedTypeReference__Group_1__0__Impl rule__JvmParameterizedTypeReference__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMetaCrySL.g:3889:1: rule__JvmParameterizedTypeReference__Group_1__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3893:1: ( ( ( '<' ) ) )
            // InternalMetaCrySL.g:3894:1: ( ( '<' ) )
            {
            // InternalMetaCrySL.g:3894:1: ( ( '<' ) )
            // InternalMetaCrySL.g:3895:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0()); 
            }
            // InternalMetaCrySL.g:3896:2: ( '<' )
            // InternalMetaCrySL.g:3896:3: '<'
            {
            match(input,30,FOLLOW_2); if (state.failed) return ;

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
    // InternalMetaCrySL.g:3904:1: rule__JvmParameterizedTypeReference__Group_1__1 : rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3908:1: ( rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2 )
            // InternalMetaCrySL.g:3909:2: rule__JvmParameterizedTypeReference__Group_1__1__Impl rule__JvmParameterizedTypeReference__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMetaCrySL.g:3916:1: rule__JvmParameterizedTypeReference__Group_1__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3920:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) ) )
            // InternalMetaCrySL.g:3921:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            {
            // InternalMetaCrySL.g:3921:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 ) )
            // InternalMetaCrySL.g:3922:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_1()); 
            }
            // InternalMetaCrySL.g:3923:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 )
            // InternalMetaCrySL.g:3923:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1
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
    // InternalMetaCrySL.g:3931:1: rule__JvmParameterizedTypeReference__Group_1__2 : rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3935:1: ( rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3 )
            // InternalMetaCrySL.g:3936:2: rule__JvmParameterizedTypeReference__Group_1__2__Impl rule__JvmParameterizedTypeReference__Group_1__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMetaCrySL.g:3943:1: rule__JvmParameterizedTypeReference__Group_1__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3947:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* ) )
            // InternalMetaCrySL.g:3948:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            {
            // InternalMetaCrySL.g:3948:1: ( ( rule__JvmParameterizedTypeReference__Group_1_2__0 )* )
            // InternalMetaCrySL.g:3949:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_2()); 
            }
            // InternalMetaCrySL.g:3950:2: ( rule__JvmParameterizedTypeReference__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMetaCrySL.g:3950:3: rule__JvmParameterizedTypeReference__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__JvmParameterizedTypeReference__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMetaCrySL.g:3958:1: rule__JvmParameterizedTypeReference__Group_1__3 : rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3962:1: ( rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4 )
            // InternalMetaCrySL.g:3963:2: rule__JvmParameterizedTypeReference__Group_1__3__Impl rule__JvmParameterizedTypeReference__Group_1__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMetaCrySL.g:3970:1: rule__JvmParameterizedTypeReference__Group_1__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3974:1: ( ( '>' ) )
            // InternalMetaCrySL.g:3975:1: ( '>' )
            {
            // InternalMetaCrySL.g:3975:1: ( '>' )
            // InternalMetaCrySL.g:3976:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:3985:1: rule__JvmParameterizedTypeReference__Group_1__4 : rule__JvmParameterizedTypeReference__Group_1__4__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:3989:1: ( rule__JvmParameterizedTypeReference__Group_1__4__Impl )
            // InternalMetaCrySL.g:3990:2: rule__JvmParameterizedTypeReference__Group_1__4__Impl
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
    // InternalMetaCrySL.g:3996:1: rule__JvmParameterizedTypeReference__Group_1__4__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4000:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* ) )
            // InternalMetaCrySL.g:4001:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            {
            // InternalMetaCrySL.g:4001:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4__0 )* )
            // InternalMetaCrySL.g:4002:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4()); 
            }
            // InternalMetaCrySL.g:4003:2: ( rule__JvmParameterizedTypeReference__Group_1_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMetaCrySL.g:4003:3: rule__JvmParameterizedTypeReference__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__JvmParameterizedTypeReference__Group_1_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMetaCrySL.g:4012:1: rule__JvmParameterizedTypeReference__Group_1_2__0 : rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4016:1: ( rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1 )
            // InternalMetaCrySL.g:4017:2: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMetaCrySL.g:4024:1: rule__JvmParameterizedTypeReference__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4028:1: ( ( ',' ) )
            // InternalMetaCrySL.g:4029:1: ( ',' )
            {
            // InternalMetaCrySL.g:4029:1: ( ',' )
            // InternalMetaCrySL.g:4030:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4039:1: rule__JvmParameterizedTypeReference__Group_1_2__1 : rule__JvmParameterizedTypeReference__Group_1_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4043:1: ( rule__JvmParameterizedTypeReference__Group_1_2__1__Impl )
            // InternalMetaCrySL.g:4044:2: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl
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
    // InternalMetaCrySL.g:4050:1: rule__JvmParameterizedTypeReference__Group_1_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4054:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) ) )
            // InternalMetaCrySL.g:4055:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            {
            // InternalMetaCrySL.g:4055:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 ) )
            // InternalMetaCrySL.g:4056:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_2_1()); 
            }
            // InternalMetaCrySL.g:4057:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 )
            // InternalMetaCrySL.g:4057:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1
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
    // InternalMetaCrySL.g:4066:1: rule__JvmParameterizedTypeReference__Group_1_4__0 : rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4070:1: ( rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1 )
            // InternalMetaCrySL.g:4071:2: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl rule__JvmParameterizedTypeReference__Group_1_4__1
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
    // InternalMetaCrySL.g:4078:1: rule__JvmParameterizedTypeReference__Group_1_4__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4082:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) ) )
            // InternalMetaCrySL.g:4083:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            {
            // InternalMetaCrySL.g:4083:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 ) )
            // InternalMetaCrySL.g:4084:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0()); 
            }
            // InternalMetaCrySL.g:4085:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0 )
            // InternalMetaCrySL.g:4085:3: rule__JvmParameterizedTypeReference__Group_1_4_0__0
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
    // InternalMetaCrySL.g:4093:1: rule__JvmParameterizedTypeReference__Group_1_4__1 : rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4097:1: ( rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2 )
            // InternalMetaCrySL.g:4098:2: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl rule__JvmParameterizedTypeReference__Group_1_4__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMetaCrySL.g:4105:1: rule__JvmParameterizedTypeReference__Group_1_4__1__Impl : ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4109:1: ( ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) ) )
            // InternalMetaCrySL.g:4110:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            {
            // InternalMetaCrySL.g:4110:1: ( ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 ) )
            // InternalMetaCrySL.g:4111:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeAssignment_1_4_1()); 
            }
            // InternalMetaCrySL.g:4112:2: ( rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 )
            // InternalMetaCrySL.g:4112:3: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1
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
    // InternalMetaCrySL.g:4120:1: rule__JvmParameterizedTypeReference__Group_1_4__2 : rule__JvmParameterizedTypeReference__Group_1_4__2__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4124:1: ( rule__JvmParameterizedTypeReference__Group_1_4__2__Impl )
            // InternalMetaCrySL.g:4125:2: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl
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
    // InternalMetaCrySL.g:4131:1: rule__JvmParameterizedTypeReference__Group_1_4__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4135:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? ) )
            // InternalMetaCrySL.g:4136:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            {
            // InternalMetaCrySL.g:4136:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )? )
            // InternalMetaCrySL.g:4137:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2()); 
            }
            // InternalMetaCrySL.g:4138:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMetaCrySL.g:4138:3: rule__JvmParameterizedTypeReference__Group_1_4_2__0
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
    // InternalMetaCrySL.g:4147:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4151:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl )
            // InternalMetaCrySL.g:4152:2: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl
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
    // InternalMetaCrySL.g:4158:1: rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4162:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) ) )
            // InternalMetaCrySL.g:4163:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            {
            // InternalMetaCrySL.g:4163:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 ) )
            // InternalMetaCrySL.g:4164:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_0_0()); 
            }
            // InternalMetaCrySL.g:4165:2: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 )
            // InternalMetaCrySL.g:4165:3: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0
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
    // InternalMetaCrySL.g:4174:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4178:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 )
            // InternalMetaCrySL.g:4179:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMetaCrySL.g:4186:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl : ( () ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4190:1: ( ( () ) )
            // InternalMetaCrySL.g:4191:1: ( () )
            {
            // InternalMetaCrySL.g:4191:1: ( () )
            // InternalMetaCrySL.g:4192:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()); 
            }
            // InternalMetaCrySL.g:4193:2: ()
            // InternalMetaCrySL.g:4193:3: 
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
    // InternalMetaCrySL.g:4201:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1 : rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4205:1: ( rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl )
            // InternalMetaCrySL.g:4206:2: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl
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
    // InternalMetaCrySL.g:4212:1: rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl : ( '.' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4216:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4217:1: ( '.' )
            {
            // InternalMetaCrySL.g:4217:1: ( '.' )
            // InternalMetaCrySL.g:4218:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4228:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4232:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1 )
            // InternalMetaCrySL.g:4233:2: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMetaCrySL.g:4240:1: rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl : ( ( '<' ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4244:1: ( ( ( '<' ) ) )
            // InternalMetaCrySL.g:4245:1: ( ( '<' ) )
            {
            // InternalMetaCrySL.g:4245:1: ( ( '<' ) )
            // InternalMetaCrySL.g:4246:2: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0()); 
            }
            // InternalMetaCrySL.g:4247:2: ( '<' )
            // InternalMetaCrySL.g:4247:3: '<'
            {
            match(input,30,FOLLOW_2); if (state.failed) return ;

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
    // InternalMetaCrySL.g:4255:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4259:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2 )
            // InternalMetaCrySL.g:4260:2: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMetaCrySL.g:4267:1: rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4271:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) ) )
            // InternalMetaCrySL.g:4272:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            {
            // InternalMetaCrySL.g:4272:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 ) )
            // InternalMetaCrySL.g:4273:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_1()); 
            }
            // InternalMetaCrySL.g:4274:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 )
            // InternalMetaCrySL.g:4274:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1
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
    // InternalMetaCrySL.g:4282:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2 : rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4286:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3 )
            // InternalMetaCrySL.g:4287:2: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl rule__JvmParameterizedTypeReference__Group_1_4_2__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMetaCrySL.g:4294:1: rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl : ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4298:1: ( ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* ) )
            // InternalMetaCrySL.g:4299:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            {
            // InternalMetaCrySL.g:4299:1: ( ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )* )
            // InternalMetaCrySL.g:4300:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGroup_1_4_2_2()); 
            }
            // InternalMetaCrySL.g:4301:2: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==23) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMetaCrySL.g:4301:3: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__JvmParameterizedTypeReference__Group_1_4_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalMetaCrySL.g:4309:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3 : rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4313:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl )
            // InternalMetaCrySL.g:4314:2: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl
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
    // InternalMetaCrySL.g:4320:1: rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl : ( '>' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4324:1: ( ( '>' ) )
            // InternalMetaCrySL.g:4325:1: ( '>' )
            {
            // InternalMetaCrySL.g:4325:1: ( '>' )
            // InternalMetaCrySL.g:4326:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4336:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4340:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 )
            // InternalMetaCrySL.g:4341:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl rule__JvmParameterizedTypeReference__Group_1_4_2_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMetaCrySL.g:4348:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl : ( ',' ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4352:1: ( ( ',' ) )
            // InternalMetaCrySL.g:4353:1: ( ',' )
            {
            // InternalMetaCrySL.g:4353:1: ( ',' )
            // InternalMetaCrySL.g:4354:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4363:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1 : rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4367:1: ( rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl )
            // InternalMetaCrySL.g:4368:2: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl
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
    // InternalMetaCrySL.g:4374:1: rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl : ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) ;
    public final void rule__JvmParameterizedTypeReference__Group_1_4_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4378:1: ( ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) ) )
            // InternalMetaCrySL.g:4379:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            {
            // InternalMetaCrySL.g:4379:1: ( ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 ) )
            // InternalMetaCrySL.g:4380:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsAssignment_1_4_2_2_1()); 
            }
            // InternalMetaCrySL.g:4381:2: ( rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 )
            // InternalMetaCrySL.g:4381:3: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1
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
    // InternalMetaCrySL.g:4390:1: rule__JvmWildcardTypeReference__Group__0 : rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 ;
    public final void rule__JvmWildcardTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4394:1: ( rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1 )
            // InternalMetaCrySL.g:4395:2: rule__JvmWildcardTypeReference__Group__0__Impl rule__JvmWildcardTypeReference__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMetaCrySL.g:4402:1: rule__JvmWildcardTypeReference__Group__0__Impl : ( () ) ;
    public final void rule__JvmWildcardTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4406:1: ( ( () ) )
            // InternalMetaCrySL.g:4407:1: ( () )
            {
            // InternalMetaCrySL.g:4407:1: ( () )
            // InternalMetaCrySL.g:4408:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0()); 
            }
            // InternalMetaCrySL.g:4409:2: ()
            // InternalMetaCrySL.g:4409:3: 
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
    // InternalMetaCrySL.g:4417:1: rule__JvmWildcardTypeReference__Group__1 : rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 ;
    public final void rule__JvmWildcardTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4421:1: ( rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2 )
            // InternalMetaCrySL.g:4422:2: rule__JvmWildcardTypeReference__Group__1__Impl rule__JvmWildcardTypeReference__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMetaCrySL.g:4429:1: rule__JvmWildcardTypeReference__Group__1__Impl : ( '?' ) ;
    public final void rule__JvmWildcardTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4433:1: ( ( '?' ) )
            // InternalMetaCrySL.g:4434:1: ( '?' )
            {
            // InternalMetaCrySL.g:4434:1: ( '?' )
            // InternalMetaCrySL.g:4435:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4444:1: rule__JvmWildcardTypeReference__Group__2 : rule__JvmWildcardTypeReference__Group__2__Impl ;
    public final void rule__JvmWildcardTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4448:1: ( rule__JvmWildcardTypeReference__Group__2__Impl )
            // InternalMetaCrySL.g:4449:2: rule__JvmWildcardTypeReference__Group__2__Impl
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
    // InternalMetaCrySL.g:4455:1: rule__JvmWildcardTypeReference__Group__2__Impl : ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) ;
    public final void rule__JvmWildcardTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4459:1: ( ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? ) )
            // InternalMetaCrySL.g:4460:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            {
            // InternalMetaCrySL.g:4460:1: ( ( rule__JvmWildcardTypeReference__Alternatives_2 )? )
            // InternalMetaCrySL.g:4461:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getAlternatives_2()); 
            }
            // InternalMetaCrySL.g:4462:2: ( rule__JvmWildcardTypeReference__Alternatives_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33||LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMetaCrySL.g:4462:3: rule__JvmWildcardTypeReference__Alternatives_2
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
    // InternalMetaCrySL.g:4471:1: rule__JvmWildcardTypeReference__Group_2_0__0 : rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4475:1: ( rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1 )
            // InternalMetaCrySL.g:4476:2: rule__JvmWildcardTypeReference__Group_2_0__0__Impl rule__JvmWildcardTypeReference__Group_2_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMetaCrySL.g:4483:1: rule__JvmWildcardTypeReference__Group_2_0__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4487:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) ) )
            // InternalMetaCrySL.g:4488:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            {
            // InternalMetaCrySL.g:4488:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 ) )
            // InternalMetaCrySL.g:4489:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_0()); 
            }
            // InternalMetaCrySL.g:4490:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 )
            // InternalMetaCrySL.g:4490:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0
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
    // InternalMetaCrySL.g:4498:1: rule__JvmWildcardTypeReference__Group_2_0__1 : rule__JvmWildcardTypeReference__Group_2_0__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4502:1: ( rule__JvmWildcardTypeReference__Group_2_0__1__Impl )
            // InternalMetaCrySL.g:4503:2: rule__JvmWildcardTypeReference__Group_2_0__1__Impl
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
    // InternalMetaCrySL.g:4509:1: rule__JvmWildcardTypeReference__Group_2_0__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4513:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* ) )
            // InternalMetaCrySL.g:4514:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            {
            // InternalMetaCrySL.g:4514:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )* )
            // InternalMetaCrySL.g:4515:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_0_1()); 
            }
            // InternalMetaCrySL.g:4516:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMetaCrySL.g:4516:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalMetaCrySL.g:4525:1: rule__JvmWildcardTypeReference__Group_2_1__0 : rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4529:1: ( rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1 )
            // InternalMetaCrySL.g:4530:2: rule__JvmWildcardTypeReference__Group_2_1__0__Impl rule__JvmWildcardTypeReference__Group_2_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMetaCrySL.g:4537:1: rule__JvmWildcardTypeReference__Group_2_1__0__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4541:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) ) )
            // InternalMetaCrySL.g:4542:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            {
            // InternalMetaCrySL.g:4542:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 ) )
            // InternalMetaCrySL.g:4543:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_0()); 
            }
            // InternalMetaCrySL.g:4544:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 )
            // InternalMetaCrySL.g:4544:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0
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
    // InternalMetaCrySL.g:4552:1: rule__JvmWildcardTypeReference__Group_2_1__1 : rule__JvmWildcardTypeReference__Group_2_1__1__Impl ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4556:1: ( rule__JvmWildcardTypeReference__Group_2_1__1__Impl )
            // InternalMetaCrySL.g:4557:2: rule__JvmWildcardTypeReference__Group_2_1__1__Impl
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
    // InternalMetaCrySL.g:4563:1: rule__JvmWildcardTypeReference__Group_2_1__1__Impl : ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) ;
    public final void rule__JvmWildcardTypeReference__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4567:1: ( ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* ) )
            // InternalMetaCrySL.g:4568:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            {
            // InternalMetaCrySL.g:4568:1: ( ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )* )
            // InternalMetaCrySL.g:4569:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsAssignment_2_1_1()); 
            }
            // InternalMetaCrySL.g:4570:2: ( rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMetaCrySL.g:4570:3: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalMetaCrySL.g:4579:1: rule__JvmUpperBound__Group__0 : rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 ;
    public final void rule__JvmUpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4583:1: ( rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1 )
            // InternalMetaCrySL.g:4584:2: rule__JvmUpperBound__Group__0__Impl rule__JvmUpperBound__Group__1
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
    // InternalMetaCrySL.g:4591:1: rule__JvmUpperBound__Group__0__Impl : ( 'extends' ) ;
    public final void rule__JvmUpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4595:1: ( ( 'extends' ) )
            // InternalMetaCrySL.g:4596:1: ( 'extends' )
            {
            // InternalMetaCrySL.g:4596:1: ( 'extends' )
            // InternalMetaCrySL.g:4597:2: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4606:1: rule__JvmUpperBound__Group__1 : rule__JvmUpperBound__Group__1__Impl ;
    public final void rule__JvmUpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4610:1: ( rule__JvmUpperBound__Group__1__Impl )
            // InternalMetaCrySL.g:4611:2: rule__JvmUpperBound__Group__1__Impl
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
    // InternalMetaCrySL.g:4617:1: rule__JvmUpperBound__Group__1__Impl : ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4621:1: ( ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4622:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4622:1: ( ( rule__JvmUpperBound__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4623:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4624:2: ( rule__JvmUpperBound__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4624:3: rule__JvmUpperBound__TypeReferenceAssignment_1
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
    // InternalMetaCrySL.g:4633:1: rule__JvmUpperBoundAnded__Group__0 : rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 ;
    public final void rule__JvmUpperBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4637:1: ( rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1 )
            // InternalMetaCrySL.g:4638:2: rule__JvmUpperBoundAnded__Group__0__Impl rule__JvmUpperBoundAnded__Group__1
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
    // InternalMetaCrySL.g:4645:1: rule__JvmUpperBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmUpperBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4649:1: ( ( '&' ) )
            // InternalMetaCrySL.g:4650:1: ( '&' )
            {
            // InternalMetaCrySL.g:4650:1: ( '&' )
            // InternalMetaCrySL.g:4651:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4660:1: rule__JvmUpperBoundAnded__Group__1 : rule__JvmUpperBoundAnded__Group__1__Impl ;
    public final void rule__JvmUpperBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4664:1: ( rule__JvmUpperBoundAnded__Group__1__Impl )
            // InternalMetaCrySL.g:4665:2: rule__JvmUpperBoundAnded__Group__1__Impl
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
    // InternalMetaCrySL.g:4671:1: rule__JvmUpperBoundAnded__Group__1__Impl : ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmUpperBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4675:1: ( ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4676:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4676:1: ( ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4677:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4678:2: ( rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4678:3: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1
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
    // InternalMetaCrySL.g:4687:1: rule__JvmLowerBound__Group__0 : rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 ;
    public final void rule__JvmLowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4691:1: ( rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1 )
            // InternalMetaCrySL.g:4692:2: rule__JvmLowerBound__Group__0__Impl rule__JvmLowerBound__Group__1
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
    // InternalMetaCrySL.g:4699:1: rule__JvmLowerBound__Group__0__Impl : ( 'super' ) ;
    public final void rule__JvmLowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4703:1: ( ( 'super' ) )
            // InternalMetaCrySL.g:4704:1: ( 'super' )
            {
            // InternalMetaCrySL.g:4704:1: ( 'super' )
            // InternalMetaCrySL.g:4705:2: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4714:1: rule__JvmLowerBound__Group__1 : rule__JvmLowerBound__Group__1__Impl ;
    public final void rule__JvmLowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4718:1: ( rule__JvmLowerBound__Group__1__Impl )
            // InternalMetaCrySL.g:4719:2: rule__JvmLowerBound__Group__1__Impl
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
    // InternalMetaCrySL.g:4725:1: rule__JvmLowerBound__Group__1__Impl : ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4729:1: ( ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4730:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4730:1: ( ( rule__JvmLowerBound__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4731:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4732:2: ( rule__JvmLowerBound__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4732:3: rule__JvmLowerBound__TypeReferenceAssignment_1
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
    // InternalMetaCrySL.g:4741:1: rule__JvmLowerBoundAnded__Group__0 : rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 ;
    public final void rule__JvmLowerBoundAnded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4745:1: ( rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1 )
            // InternalMetaCrySL.g:4746:2: rule__JvmLowerBoundAnded__Group__0__Impl rule__JvmLowerBoundAnded__Group__1
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
    // InternalMetaCrySL.g:4753:1: rule__JvmLowerBoundAnded__Group__0__Impl : ( '&' ) ;
    public final void rule__JvmLowerBoundAnded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4757:1: ( ( '&' ) )
            // InternalMetaCrySL.g:4758:1: ( '&' )
            {
            // InternalMetaCrySL.g:4758:1: ( '&' )
            // InternalMetaCrySL.g:4759:2: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4768:1: rule__JvmLowerBoundAnded__Group__1 : rule__JvmLowerBoundAnded__Group__1__Impl ;
    public final void rule__JvmLowerBoundAnded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4772:1: ( rule__JvmLowerBoundAnded__Group__1__Impl )
            // InternalMetaCrySL.g:4773:2: rule__JvmLowerBoundAnded__Group__1__Impl
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
    // InternalMetaCrySL.g:4779:1: rule__JvmLowerBoundAnded__Group__1__Impl : ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) ;
    public final void rule__JvmLowerBoundAnded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4783:1: ( ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) ) )
            // InternalMetaCrySL.g:4784:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            {
            // InternalMetaCrySL.g:4784:1: ( ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 ) )
            // InternalMetaCrySL.g:4785:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceAssignment_1()); 
            }
            // InternalMetaCrySL.g:4786:2: ( rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 )
            // InternalMetaCrySL.g:4786:3: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1
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
    // InternalMetaCrySL.g:4795:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4799:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMetaCrySL.g:4800:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMetaCrySL.g:4807:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4811:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:4812:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:4812:1: ( ruleValidID )
            // InternalMetaCrySL.g:4813:2: ruleValidID
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
    // InternalMetaCrySL.g:4822:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4826:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMetaCrySL.g:4827:2: rule__QualifiedName__Group__1__Impl
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
    // InternalMetaCrySL.g:4833:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4837:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMetaCrySL.g:4838:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMetaCrySL.g:4838:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMetaCrySL.g:4839:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMetaCrySL.g:4840:2: ( rule__QualifiedName__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalMetaCrySL.g:4840:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalMetaCrySL.g:4849:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4853:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMetaCrySL.g:4854:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalMetaCrySL.g:4861:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4865:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4866:1: ( '.' )
            {
            // InternalMetaCrySL.g:4866:1: ( '.' )
            // InternalMetaCrySL.g:4867:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4876:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4880:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMetaCrySL.g:4881:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalMetaCrySL.g:4887:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4891:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:4892:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:4892:1: ( ruleValidID )
            // InternalMetaCrySL.g:4893:2: ruleValidID
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
    // InternalMetaCrySL.g:4903:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4907:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMetaCrySL.g:4908:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMetaCrySL.g:4915:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4919:1: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:4920:1: ( ruleQualifiedName )
            {
            // InternalMetaCrySL.g:4920:1: ( ruleQualifiedName )
            // InternalMetaCrySL.g:4921:2: ruleQualifiedName
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
    // InternalMetaCrySL.g:4930:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4934:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2 )
            // InternalMetaCrySL.g:4935:2: rule__QualifiedNameWithWildcard__Group__1__Impl rule__QualifiedNameWithWildcard__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMetaCrySL.g:4942:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4946:1: ( ( '.' ) )
            // InternalMetaCrySL.g:4947:1: ( '.' )
            {
            // InternalMetaCrySL.g:4947:1: ( '.' )
            // InternalMetaCrySL.g:4948:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4957:1: rule__QualifiedNameWithWildcard__Group__2 : rule__QualifiedNameWithWildcard__Group__2__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4961:1: ( rule__QualifiedNameWithWildcard__Group__2__Impl )
            // InternalMetaCrySL.g:4962:2: rule__QualifiedNameWithWildcard__Group__2__Impl
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
    // InternalMetaCrySL.g:4968:1: rule__QualifiedNameWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4972:1: ( ( '*' ) )
            // InternalMetaCrySL.g:4973:1: ( '*' )
            {
            // InternalMetaCrySL.g:4973:1: ( '*' )
            // InternalMetaCrySL.g:4974:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:4984:1: rule__XImportDeclaration__Group__0 : rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 ;
    public final void rule__XImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:4988:1: ( rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1 )
            // InternalMetaCrySL.g:4989:2: rule__XImportDeclaration__Group__0__Impl rule__XImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMetaCrySL.g:4996:1: rule__XImportDeclaration__Group__0__Impl : ( 'import' ) ;
    public final void rule__XImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5000:1: ( ( 'import' ) )
            // InternalMetaCrySL.g:5001:1: ( 'import' )
            {
            // InternalMetaCrySL.g:5001:1: ( 'import' )
            // InternalMetaCrySL.g:5002:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:5011:1: rule__XImportDeclaration__Group__1 : rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 ;
    public final void rule__XImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5015:1: ( rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2 )
            // InternalMetaCrySL.g:5016:2: rule__XImportDeclaration__Group__1__Impl rule__XImportDeclaration__Group__2
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
    // InternalMetaCrySL.g:5023:1: rule__XImportDeclaration__Group__1__Impl : ( ( rule__XImportDeclaration__Alternatives_1 ) ) ;
    public final void rule__XImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5027:1: ( ( ( rule__XImportDeclaration__Alternatives_1 ) ) )
            // InternalMetaCrySL.g:5028:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            {
            // InternalMetaCrySL.g:5028:1: ( ( rule__XImportDeclaration__Alternatives_1 ) )
            // InternalMetaCrySL.g:5029:2: ( rule__XImportDeclaration__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1()); 
            }
            // InternalMetaCrySL.g:5030:2: ( rule__XImportDeclaration__Alternatives_1 )
            // InternalMetaCrySL.g:5030:3: rule__XImportDeclaration__Alternatives_1
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
    // InternalMetaCrySL.g:5038:1: rule__XImportDeclaration__Group__2 : rule__XImportDeclaration__Group__2__Impl ;
    public final void rule__XImportDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5042:1: ( rule__XImportDeclaration__Group__2__Impl )
            // InternalMetaCrySL.g:5043:2: rule__XImportDeclaration__Group__2__Impl
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
    // InternalMetaCrySL.g:5049:1: rule__XImportDeclaration__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__XImportDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5053:1: ( ( ( ';' )? ) )
            // InternalMetaCrySL.g:5054:1: ( ( ';' )? )
            {
            // InternalMetaCrySL.g:5054:1: ( ( ';' )? )
            // InternalMetaCrySL.g:5055:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2()); 
            }
            // InternalMetaCrySL.g:5056:2: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMetaCrySL.g:5056:3: ';'
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
    // InternalMetaCrySL.g:5065:1: rule__XImportDeclaration__Group_1_0__0 : rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 ;
    public final void rule__XImportDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5069:1: ( rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1 )
            // InternalMetaCrySL.g:5070:2: rule__XImportDeclaration__Group_1_0__0__Impl rule__XImportDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMetaCrySL.g:5077:1: rule__XImportDeclaration__Group_1_0__0__Impl : ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5081:1: ( ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) ) )
            // InternalMetaCrySL.g:5082:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            {
            // InternalMetaCrySL.g:5082:1: ( ( rule__XImportDeclaration__StaticAssignment_1_0_0 ) )
            // InternalMetaCrySL.g:5083:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticAssignment_1_0_0()); 
            }
            // InternalMetaCrySL.g:5084:2: ( rule__XImportDeclaration__StaticAssignment_1_0_0 )
            // InternalMetaCrySL.g:5084:3: rule__XImportDeclaration__StaticAssignment_1_0_0
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
    // InternalMetaCrySL.g:5092:1: rule__XImportDeclaration__Group_1_0__1 : rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 ;
    public final void rule__XImportDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5096:1: ( rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2 )
            // InternalMetaCrySL.g:5097:2: rule__XImportDeclaration__Group_1_0__1__Impl rule__XImportDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMetaCrySL.g:5104:1: rule__XImportDeclaration__Group_1_0__1__Impl : ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) ;
    public final void rule__XImportDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5108:1: ( ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? ) )
            // InternalMetaCrySL.g:5109:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            {
            // InternalMetaCrySL.g:5109:1: ( ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )? )
            // InternalMetaCrySL.g:5110:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionAssignment_1_0_1()); 
            }
            // InternalMetaCrySL.g:5111:2: ( rule__XImportDeclaration__ExtensionAssignment_1_0_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMetaCrySL.g:5111:3: rule__XImportDeclaration__ExtensionAssignment_1_0_1
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
    // InternalMetaCrySL.g:5119:1: rule__XImportDeclaration__Group_1_0__2 : rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 ;
    public final void rule__XImportDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5123:1: ( rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3 )
            // InternalMetaCrySL.g:5124:2: rule__XImportDeclaration__Group_1_0__2__Impl rule__XImportDeclaration__Group_1_0__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMetaCrySL.g:5131:1: rule__XImportDeclaration__Group_1_0__2__Impl : ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5135:1: ( ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) ) )
            // InternalMetaCrySL.g:5136:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            {
            // InternalMetaCrySL.g:5136:1: ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 ) )
            // InternalMetaCrySL.g:5137:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeAssignment_1_0_2()); 
            }
            // InternalMetaCrySL.g:5138:2: ( rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 )
            // InternalMetaCrySL.g:5138:3: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2
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
    // InternalMetaCrySL.g:5146:1: rule__XImportDeclaration__Group_1_0__3 : rule__XImportDeclaration__Group_1_0__3__Impl ;
    public final void rule__XImportDeclaration__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5150:1: ( rule__XImportDeclaration__Group_1_0__3__Impl )
            // InternalMetaCrySL.g:5151:2: rule__XImportDeclaration__Group_1_0__3__Impl
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
    // InternalMetaCrySL.g:5157:1: rule__XImportDeclaration__Group_1_0__3__Impl : ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) ;
    public final void rule__XImportDeclaration__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5161:1: ( ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) ) )
            // InternalMetaCrySL.g:5162:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            {
            // InternalMetaCrySL.g:5162:1: ( ( rule__XImportDeclaration__Alternatives_1_0_3 ) )
            // InternalMetaCrySL.g:5163:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getAlternatives_1_0_3()); 
            }
            // InternalMetaCrySL.g:5164:2: ( rule__XImportDeclaration__Alternatives_1_0_3 )
            // InternalMetaCrySL.g:5164:3: rule__XImportDeclaration__Alternatives_1_0_3
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
    // InternalMetaCrySL.g:5173:1: rule__QualifiedNameInStaticImport__Group__0 : rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 ;
    public final void rule__QualifiedNameInStaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5177:1: ( rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1 )
            // InternalMetaCrySL.g:5178:2: rule__QualifiedNameInStaticImport__Group__0__Impl rule__QualifiedNameInStaticImport__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMetaCrySL.g:5185:1: rule__QualifiedNameInStaticImport__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedNameInStaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5189:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:5190:1: ( ruleValidID )
            {
            // InternalMetaCrySL.g:5190:1: ( ruleValidID )
            // InternalMetaCrySL.g:5191:2: ruleValidID
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
    // InternalMetaCrySL.g:5200:1: rule__QualifiedNameInStaticImport__Group__1 : rule__QualifiedNameInStaticImport__Group__1__Impl ;
    public final void rule__QualifiedNameInStaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5204:1: ( rule__QualifiedNameInStaticImport__Group__1__Impl )
            // InternalMetaCrySL.g:5205:2: rule__QualifiedNameInStaticImport__Group__1__Impl
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
    // InternalMetaCrySL.g:5211:1: rule__QualifiedNameInStaticImport__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedNameInStaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5215:1: ( ( '.' ) )
            // InternalMetaCrySL.g:5216:1: ( '.' )
            {
            // InternalMetaCrySL.g:5216:1: ( '.' )
            // InternalMetaCrySL.g:5217:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:5227:1: rule__Model__MetaCrySLAssignment : ( ruleSpec ) ;
    public final void rule__Model__MetaCrySLAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5231:1: ( ( ruleSpec ) )
            // InternalMetaCrySL.g:5232:2: ( ruleSpec )
            {
            // InternalMetaCrySL.g:5232:2: ( ruleSpec )
            // InternalMetaCrySL.g:5233:3: ruleSpec
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
    // InternalMetaCrySL.g:5242:1: rule__Spec__ClassNameAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__Spec__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5246:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5247:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5247:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5248:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5257:1: rule__Spec__ObjectSpecAssignment_3 : ( ruleObjectSpec ) ;
    public final void rule__Spec__ObjectSpecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5261:1: ( ( ruleObjectSpec ) )
            // InternalMetaCrySL.g:5262:2: ( ruleObjectSpec )
            {
            // InternalMetaCrySL.g:5262:2: ( ruleObjectSpec )
            // InternalMetaCrySL.g:5263:3: ruleObjectSpec
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


    // $ANTLR start "rule__Spec__ForbiddenSpecAssignment_4"
    // InternalMetaCrySL.g:5272:1: rule__Spec__ForbiddenSpecAssignment_4 : ( ruleForbiddenSpec ) ;
    public final void rule__Spec__ForbiddenSpecAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5276:1: ( ( ruleForbiddenSpec ) )
            // InternalMetaCrySL.g:5277:2: ( ruleForbiddenSpec )
            {
            // InternalMetaCrySL.g:5277:2: ( ruleForbiddenSpec )
            // InternalMetaCrySL.g:5278:3: ruleForbiddenSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getForbiddenSpecForbiddenSpecParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForbiddenSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getForbiddenSpecForbiddenSpecParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Spec__ForbiddenSpecAssignment_4"


    // $ANTLR start "rule__Spec__EventSpecAssignment_5"
    // InternalMetaCrySL.g:5287:1: rule__Spec__EventSpecAssignment_5 : ( ruleEventSpec ) ;
    public final void rule__Spec__EventSpecAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5291:1: ( ( ruleEventSpec ) )
            // InternalMetaCrySL.g:5292:2: ( ruleEventSpec )
            {
            // InternalMetaCrySL.g:5292:2: ( ruleEventSpec )
            // InternalMetaCrySL.g:5293:3: ruleEventSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getEventSpecEventSpecParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getEventSpecEventSpecParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Spec__EventSpecAssignment_5"


    // $ANTLR start "rule__Spec__OrderSpecAssignment_6"
    // InternalMetaCrySL.g:5302:1: rule__Spec__OrderSpecAssignment_6 : ( ruleOrderSpec ) ;
    public final void rule__Spec__OrderSpecAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5306:1: ( ( ruleOrderSpec ) )
            // InternalMetaCrySL.g:5307:2: ( ruleOrderSpec )
            {
            // InternalMetaCrySL.g:5307:2: ( ruleOrderSpec )
            // InternalMetaCrySL.g:5308:3: ruleOrderSpec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSpecAccess().getOrderSpecOrderSpecParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrderSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSpecAccess().getOrderSpecOrderSpecParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Spec__OrderSpecAssignment_6"


    // $ANTLR start "rule__ObjectSpec__ObjectsAssignment_3"
    // InternalMetaCrySL.g:5317:1: rule__ObjectSpec__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__ObjectSpec__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5321:1: ( ( ruleObject ) )
            // InternalMetaCrySL.g:5322:2: ( ruleObject )
            {
            // InternalMetaCrySL.g:5322:2: ( ruleObject )
            // InternalMetaCrySL.g:5323:3: ruleObject
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
    // InternalMetaCrySL.g:5332:1: rule__Object__TypeAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__Object__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5336:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5337:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5337:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5338:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5347:1: rule__Object__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Object__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5351:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5352:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5352:2: ( RULE_ID )
            // InternalMetaCrySL.g:5353:3: RULE_ID
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


    // $ANTLR start "rule__ForbiddenSpec__ForbidenMethodsAssignment_2"
    // InternalMetaCrySL.g:5362:1: rule__ForbiddenSpec__ForbidenMethodsAssignment_2 : ( ruleForbiddenMethod ) ;
    public final void rule__ForbiddenSpec__ForbidenMethodsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5366:1: ( ( ruleForbiddenMethod ) )
            // InternalMetaCrySL.g:5367:2: ( ruleForbiddenMethod )
            {
            // InternalMetaCrySL.g:5367:2: ( ruleForbiddenMethod )
            // InternalMetaCrySL.g:5368:3: ruleForbiddenMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsForbiddenMethodParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForbiddenMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenSpecAccess().getForbidenMethodsForbiddenMethodParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ForbiddenSpec__ForbidenMethodsAssignment_2"


    // $ANTLR start "rule__ForbiddenMethod__MethodAssignment_1"
    // InternalMetaCrySL.g:5377:1: rule__ForbiddenMethod__MethodAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForbiddenMethod__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5381:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5382:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5382:2: ( RULE_ID )
            // InternalMetaCrySL.g:5383:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getMethodIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getMethodIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ForbiddenMethod__MethodAssignment_1"


    // $ANTLR start "rule__ForbiddenMethod__ArgsAssignment_3"
    // InternalMetaCrySL.g:5392:1: rule__ForbiddenMethod__ArgsAssignment_3 : ( ruleFormalArgs ) ;
    public final void rule__ForbiddenMethod__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5396:1: ( ( ruleFormalArgs ) )
            // InternalMetaCrySL.g:5397:2: ( ruleFormalArgs )
            {
            // InternalMetaCrySL.g:5397:2: ( ruleFormalArgs )
            // InternalMetaCrySL.g:5398:3: ruleFormalArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getArgsFormalArgsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormalArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getArgsFormalArgsParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ForbiddenMethod__ArgsAssignment_3"


    // $ANTLR start "rule__ForbiddenMethod__AlternativeAssignment_5_1"
    // InternalMetaCrySL.g:5407:1: rule__ForbiddenMethod__AlternativeAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ForbiddenMethod__AlternativeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5411:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5412:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5412:2: ( RULE_ID )
            // InternalMetaCrySL.g:5413:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForbiddenMethodAccess().getAlternativeIDTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForbiddenMethodAccess().getAlternativeIDTerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__ForbiddenMethod__AlternativeAssignment_5_1"


    // $ANTLR start "rule__EventSpec__EventsAssignment_2"
    // InternalMetaCrySL.g:5422:1: rule__EventSpec__EventsAssignment_2 : ( ruleEvent ) ;
    public final void rule__EventSpec__EventsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5426:1: ( ( ruleEvent ) )
            // InternalMetaCrySL.g:5427:2: ( ruleEvent )
            {
            // InternalMetaCrySL.g:5427:2: ( ruleEvent )
            // InternalMetaCrySL.g:5428:3: ruleEvent
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
    // InternalMetaCrySL.g:5437:1: rule__Event__LabelAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5441:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5442:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5442:2: ( RULE_ID )
            // InternalMetaCrySL.g:5443:3: RULE_ID
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
    // InternalMetaCrySL.g:5452:1: rule__Event__VarAssignment_0_2_0 : ( RULE_ID ) ;
    public final void rule__Event__VarAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5456:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5457:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5457:2: ( RULE_ID )
            // InternalMetaCrySL.g:5458:3: RULE_ID
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
    // InternalMetaCrySL.g:5467:1: rule__Event__MethodAssignment_0_3 : ( ruleMethodDef ) ;
    public final void rule__Event__MethodAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5471:1: ( ( ruleMethodDef ) )
            // InternalMetaCrySL.g:5472:2: ( ruleMethodDef )
            {
            // InternalMetaCrySL.g:5472:2: ( ruleMethodDef )
            // InternalMetaCrySL.g:5473:3: ruleMethodDef
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
    // InternalMetaCrySL.g:5482:1: rule__Event__LabelAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Event__LabelAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5486:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5487:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5487:2: ( RULE_ID )
            // InternalMetaCrySL.g:5488:3: RULE_ID
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
    // InternalMetaCrySL.g:5497:1: rule__Event__AggregateAssignment_1_2 : ( ruleAggregateList ) ;
    public final void rule__Event__AggregateAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5501:1: ( ( ruleAggregateList ) )
            // InternalMetaCrySL.g:5502:2: ( ruleAggregateList )
            {
            // InternalMetaCrySL.g:5502:2: ( ruleAggregateList )
            // InternalMetaCrySL.g:5503:3: ruleAggregateList
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
    // InternalMetaCrySL.g:5512:1: rule__AggregateList__LabelsAssignment_0 : ( RULE_ID ) ;
    public final void rule__AggregateList__LabelsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5516:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5517:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5517:2: ( RULE_ID )
            // InternalMetaCrySL.g:5518:3: RULE_ID
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
    // InternalMetaCrySL.g:5527:1: rule__AggregateList__LabelsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AggregateList__LabelsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5531:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5532:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5532:2: ( RULE_ID )
            // InternalMetaCrySL.g:5533:3: RULE_ID
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
    // InternalMetaCrySL.g:5542:1: rule__MethodDef__MethodNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MethodDef__MethodNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5546:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5547:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5547:2: ( RULE_ID )
            // InternalMetaCrySL.g:5548:3: RULE_ID
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
    // InternalMetaCrySL.g:5557:1: rule__MethodDef__ArgsAssignment_2 : ( ruleFormalArgs ) ;
    public final void rule__MethodDef__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5561:1: ( ( ruleFormalArgs ) )
            // InternalMetaCrySL.g:5562:2: ( ruleFormalArgs )
            {
            // InternalMetaCrySL.g:5562:2: ( ruleFormalArgs )
            // InternalMetaCrySL.g:5563:3: ruleFormalArgs
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
    // InternalMetaCrySL.g:5572:1: rule__FormalArgs__ArgsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FormalArgs__ArgsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5576:1: ( ( ( RULE_ID ) ) )
            // InternalMetaCrySL.g:5577:2: ( ( RULE_ID ) )
            {
            // InternalMetaCrySL.g:5577:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5578:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_0_0()); 
            }
            // InternalMetaCrySL.g:5579:3: ( RULE_ID )
            // InternalMetaCrySL.g:5580:4: RULE_ID
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
    // InternalMetaCrySL.g:5591:1: rule__FormalArgs__ArgsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FormalArgs__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5595:1: ( ( ( RULE_ID ) ) )
            // InternalMetaCrySL.g:5596:2: ( ( RULE_ID ) )
            {
            // InternalMetaCrySL.g:5596:2: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5597:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_1_1_0()); 
            }
            // InternalMetaCrySL.g:5598:3: ( RULE_ID )
            // InternalMetaCrySL.g:5599:4: RULE_ID
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
    // InternalMetaCrySL.g:5610:1: rule__OrderSpec__OrderAssignment_2 : ( ruleEventExp ) ;
    public final void rule__OrderSpec__OrderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5614:1: ( ( ruleEventExp ) )
            // InternalMetaCrySL.g:5615:2: ( ruleEventExp )
            {
            // InternalMetaCrySL.g:5615:2: ( ruleEventExp )
            // InternalMetaCrySL.g:5616:3: ruleEventExp
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
    // InternalMetaCrySL.g:5625:1: rule__EventExp__ExpAssignment_0_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5629:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5630:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5630:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5631:3: ruleChoiceExp
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
    // InternalMetaCrySL.g:5640:1: rule__EventExp__ExpAssignment_1_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5644:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5645:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5645:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5646:3: ruleChoiceExp
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
    // InternalMetaCrySL.g:5655:1: rule__EventExp__ExpAssignment_2_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5659:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5660:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5660:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5661:3: ruleChoiceExp
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
    // InternalMetaCrySL.g:5670:1: rule__EventExp__ExpAssignment_3_1 : ( ruleChoiceExp ) ;
    public final void rule__EventExp__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5674:1: ( ( ruleChoiceExp ) )
            // InternalMetaCrySL.g:5675:2: ( ruleChoiceExp )
            {
            // InternalMetaCrySL.g:5675:2: ( ruleChoiceExp )
            // InternalMetaCrySL.g:5676:3: ruleChoiceExp
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
    // InternalMetaCrySL.g:5685:1: rule__ChoiceExp__RightAssignment_1_0_2 : ( ruleSequenceExp ) ;
    public final void rule__ChoiceExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5689:1: ( ( ruleSequenceExp ) )
            // InternalMetaCrySL.g:5690:2: ( ruleSequenceExp )
            {
            // InternalMetaCrySL.g:5690:2: ( ruleSequenceExp )
            // InternalMetaCrySL.g:5691:3: ruleSequenceExp
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
    // InternalMetaCrySL.g:5700:1: rule__SequenceExp__RightAssignment_1_0_2 : ( rulePrimaryExp ) ;
    public final void rule__SequenceExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5704:1: ( ( rulePrimaryExp ) )
            // InternalMetaCrySL.g:5705:2: ( rulePrimaryExp )
            {
            // InternalMetaCrySL.g:5705:2: ( rulePrimaryExp )
            // InternalMetaCrySL.g:5706:3: rulePrimaryExp
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
    // InternalMetaCrySL.g:5715:1: rule__PrimaryExp__LabelAssignment_0 : ( RULE_ID ) ;
    public final void rule__PrimaryExp__LabelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5719:1: ( ( RULE_ID ) )
            // InternalMetaCrySL.g:5720:2: ( RULE_ID )
            {
            // InternalMetaCrySL.g:5720:2: ( RULE_ID )
            // InternalMetaCrySL.g:5721:3: RULE_ID
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
    // InternalMetaCrySL.g:5730:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5734:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5735:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5735:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5736:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5745:1: rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ParamTypesAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5749:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5750:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5750:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5751:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5760:1: rule__XFunctionTypeRef__ReturnTypeAssignment_2 : ( ruleJvmTypeReference ) ;
    public final void rule__XFunctionTypeRef__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5764:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5765:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5765:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5766:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5775:1: rule__JvmParameterizedTypeReference__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5779:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMetaCrySL.g:5780:2: ( ( ruleQualifiedName ) )
            {
            // InternalMetaCrySL.g:5780:2: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:5781:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
            }
            // InternalMetaCrySL.g:5782:3: ( ruleQualifiedName )
            // InternalMetaCrySL.g:5783:4: ruleQualifiedName
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
    // InternalMetaCrySL.g:5794:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5798:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5799:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5799:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5800:3: ruleJvmArgumentTypeReference
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
    // InternalMetaCrySL.g:5809:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5813:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5814:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5814:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5815:3: ruleJvmArgumentTypeReference
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
    // InternalMetaCrySL.g:5824:1: rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1 : ( ( ruleValidID ) ) ;
    public final void rule__JvmParameterizedTypeReference__TypeAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5828:1: ( ( ( ruleValidID ) ) )
            // InternalMetaCrySL.g:5829:2: ( ( ruleValidID ) )
            {
            // InternalMetaCrySL.g:5829:2: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:5830:3: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0()); 
            }
            // InternalMetaCrySL.g:5831:3: ( ruleValidID )
            // InternalMetaCrySL.g:5832:4: ruleValidID
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
    // InternalMetaCrySL.g:5843:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5847:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5848:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5848:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5849:3: ruleJvmArgumentTypeReference
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
    // InternalMetaCrySL.g:5858:1: rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1 : ( ruleJvmArgumentTypeReference ) ;
    public final void rule__JvmParameterizedTypeReference__ArgumentsAssignment_1_4_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5862:1: ( ( ruleJvmArgumentTypeReference ) )
            // InternalMetaCrySL.g:5863:2: ( ruleJvmArgumentTypeReference )
            {
            // InternalMetaCrySL.g:5863:2: ( ruleJvmArgumentTypeReference )
            // InternalMetaCrySL.g:5864:3: ruleJvmArgumentTypeReference
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
    // InternalMetaCrySL.g:5873:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0 : ( ruleJvmUpperBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5877:1: ( ( ruleJvmUpperBound ) )
            // InternalMetaCrySL.g:5878:2: ( ruleJvmUpperBound )
            {
            // InternalMetaCrySL.g:5878:2: ( ruleJvmUpperBound )
            // InternalMetaCrySL.g:5879:3: ruleJvmUpperBound
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
    // InternalMetaCrySL.g:5888:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1 : ( ruleJvmUpperBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5892:1: ( ( ruleJvmUpperBoundAnded ) )
            // InternalMetaCrySL.g:5893:2: ( ruleJvmUpperBoundAnded )
            {
            // InternalMetaCrySL.g:5893:2: ( ruleJvmUpperBoundAnded )
            // InternalMetaCrySL.g:5894:3: ruleJvmUpperBoundAnded
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
    // InternalMetaCrySL.g:5903:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0 : ( ruleJvmLowerBound ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5907:1: ( ( ruleJvmLowerBound ) )
            // InternalMetaCrySL.g:5908:2: ( ruleJvmLowerBound )
            {
            // InternalMetaCrySL.g:5908:2: ( ruleJvmLowerBound )
            // InternalMetaCrySL.g:5909:3: ruleJvmLowerBound
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
    // InternalMetaCrySL.g:5918:1: rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1 : ( ruleJvmLowerBoundAnded ) ;
    public final void rule__JvmWildcardTypeReference__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5922:1: ( ( ruleJvmLowerBoundAnded ) )
            // InternalMetaCrySL.g:5923:2: ( ruleJvmLowerBoundAnded )
            {
            // InternalMetaCrySL.g:5923:2: ( ruleJvmLowerBoundAnded )
            // InternalMetaCrySL.g:5924:3: ruleJvmLowerBoundAnded
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
    // InternalMetaCrySL.g:5933:1: rule__JvmUpperBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5937:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5938:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5938:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5939:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5948:1: rule__JvmUpperBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmUpperBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5952:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5953:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5953:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5954:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5963:1: rule__JvmLowerBound__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBound__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5967:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5968:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5968:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5969:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5978:1: rule__JvmLowerBoundAnded__TypeReferenceAssignment_1 : ( ruleJvmTypeReference ) ;
    public final void rule__JvmLowerBoundAnded__TypeReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5982:1: ( ( ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:5983:2: ( ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:5983:2: ( ruleJvmTypeReference )
            // InternalMetaCrySL.g:5984:3: ruleJvmTypeReference
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
    // InternalMetaCrySL.g:5993:1: rule__XImportDeclaration__StaticAssignment_1_0_0 : ( ( 'static' ) ) ;
    public final void rule__XImportDeclaration__StaticAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:5997:1: ( ( ( 'static' ) ) )
            // InternalMetaCrySL.g:5998:2: ( ( 'static' ) )
            {
            // InternalMetaCrySL.g:5998:2: ( ( 'static' ) )
            // InternalMetaCrySL.g:5999:3: ( 'static' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            // InternalMetaCrySL.g:6000:3: ( 'static' )
            // InternalMetaCrySL.g:6001:4: 'static'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:6012:1: rule__XImportDeclaration__ExtensionAssignment_1_0_1 : ( ( 'extension' ) ) ;
    public final void rule__XImportDeclaration__ExtensionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6016:1: ( ( ( 'extension' ) ) )
            // InternalMetaCrySL.g:6017:2: ( ( 'extension' ) )
            {
            // InternalMetaCrySL.g:6017:2: ( ( 'extension' ) )
            // InternalMetaCrySL.g:6018:3: ( 'extension' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            // InternalMetaCrySL.g:6019:3: ( 'extension' )
            // InternalMetaCrySL.g:6020:4: 'extension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:6031:1: rule__XImportDeclaration__ImportedTypeAssignment_1_0_2 : ( ( ruleQualifiedNameInStaticImport ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6035:1: ( ( ( ruleQualifiedNameInStaticImport ) ) )
            // InternalMetaCrySL.g:6036:2: ( ( ruleQualifiedNameInStaticImport ) )
            {
            // InternalMetaCrySL.g:6036:2: ( ( ruleQualifiedNameInStaticImport ) )
            // InternalMetaCrySL.g:6037:3: ( ruleQualifiedNameInStaticImport )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
            }
            // InternalMetaCrySL.g:6038:3: ( ruleQualifiedNameInStaticImport )
            // InternalMetaCrySL.g:6039:4: ruleQualifiedNameInStaticImport
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
    // InternalMetaCrySL.g:6050:1: rule__XImportDeclaration__WildcardAssignment_1_0_3_0 : ( ( '*' ) ) ;
    public final void rule__XImportDeclaration__WildcardAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6054:1: ( ( ( '*' ) ) )
            // InternalMetaCrySL.g:6055:2: ( ( '*' ) )
            {
            // InternalMetaCrySL.g:6055:2: ( ( '*' ) )
            // InternalMetaCrySL.g:6056:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            // InternalMetaCrySL.g:6057:3: ( '*' )
            // InternalMetaCrySL.g:6058:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMetaCrySL.g:6069:1: rule__XImportDeclaration__MemberNameAssignment_1_0_3_1 : ( ruleValidID ) ;
    public final void rule__XImportDeclaration__MemberNameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6073:1: ( ( ruleValidID ) )
            // InternalMetaCrySL.g:6074:2: ( ruleValidID )
            {
            // InternalMetaCrySL.g:6074:2: ( ruleValidID )
            // InternalMetaCrySL.g:6075:3: ruleValidID
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
    // InternalMetaCrySL.g:6084:1: rule__XImportDeclaration__ImportedTypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__XImportDeclaration__ImportedTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6088:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMetaCrySL.g:6089:2: ( ( ruleQualifiedName ) )
            {
            // InternalMetaCrySL.g:6089:2: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:6090:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
            }
            // InternalMetaCrySL.g:6091:3: ( ruleQualifiedName )
            // InternalMetaCrySL.g:6092:4: ruleQualifiedName
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
    // InternalMetaCrySL.g:6103:1: rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__XImportDeclaration__ImportedNamespaceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMetaCrySL.g:6107:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMetaCrySL.g:6108:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMetaCrySL.g:6108:2: ( ruleQualifiedNameWithWildcard )
            // InternalMetaCrySL.g:6109:3: ruleQualifiedNameWithWildcard
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
        // InternalMetaCrySL.g:861:2: ( ( ( rule__EventExp__Group_0__0 ) ) )
        // InternalMetaCrySL.g:861:2: ( ( rule__EventExp__Group_0__0 ) )
        {
        // InternalMetaCrySL.g:861:2: ( ( rule__EventExp__Group_0__0 ) )
        // InternalMetaCrySL.g:862:3: ( rule__EventExp__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_0()); 
        }
        // InternalMetaCrySL.g:863:3: ( rule__EventExp__Group_0__0 )
        // InternalMetaCrySL.g:863:4: rule__EventExp__Group_0__0
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
        // InternalMetaCrySL.g:867:2: ( ( ( rule__EventExp__Group_1__0 ) ) )
        // InternalMetaCrySL.g:867:2: ( ( rule__EventExp__Group_1__0 ) )
        {
        // InternalMetaCrySL.g:867:2: ( ( rule__EventExp__Group_1__0 ) )
        // InternalMetaCrySL.g:868:3: ( rule__EventExp__Group_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_1()); 
        }
        // InternalMetaCrySL.g:869:3: ( rule__EventExp__Group_1__0 )
        // InternalMetaCrySL.g:869:4: rule__EventExp__Group_1__0
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
        // InternalMetaCrySL.g:873:2: ( ( ( rule__EventExp__Group_2__0 ) ) )
        // InternalMetaCrySL.g:873:2: ( ( rule__EventExp__Group_2__0 ) )
        {
        // InternalMetaCrySL.g:873:2: ( ( rule__EventExp__Group_2__0 ) )
        // InternalMetaCrySL.g:874:3: ( rule__EventExp__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEventExpAccess().getGroup_2()); 
        }
        // InternalMetaCrySL.g:875:3: ( rule__EventExp__Group_2__0 )
        // InternalMetaCrySL.g:875:4: rule__EventExp__Group_2__0
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
    static final String dfa_4s = "\1\45\1\uffff\1\40\1\32\1\uffff\1\40\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\40\uffff\1\1",
            "",
            "\1\4\21\uffff\1\3",
            "\1\5\25\uffff\1\6",
            "",
            "\1\4\21\uffff\1\3",
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
            return "973:1: rule__XImportDeclaration__Alternatives_1 : ( ( ( rule__XImportDeclaration__Group_1_0__0 ) ) | ( ( rule__XImportDeclaration__ImportedTypeAssignment_1_1 ) ) | ( ( rule__XImportDeclaration__ImportedNamespaceAssignment_1_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001089000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002050010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000010L});

}