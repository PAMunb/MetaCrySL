package br.unb.cic.mcsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.unb.cic.mcsl.services.MetaCrySLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMetaCrySLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ABSTRACT'", "'SPEC'", "'OBJECTS'", "':'", "';'", "'EVENTS'", "'='", "':='", "'|'", "'('", "')'", "','", "'ORDER'", "'?'", "'*'", "'+'", "'CONSTRAINTS'", "'in'", "'{'", "'}'", "'['", "']'", "'=>'", "'<'", "'>'", "'.'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MetaCrySLGrammarAccess grammarAccess;

        public InternalMetaCrySLParser(TokenStream input, MetaCrySLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MetaCrySLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMetaCrySL.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMetaCrySL.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalMetaCrySL.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMetaCrySL.g:77:1: ruleModel returns [EObject current=null] : ( (lv_metaCrySL_0_0= ruleSpec ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_metaCrySL_0_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:83:2: ( ( (lv_metaCrySL_0_0= ruleSpec ) ) )
            // InternalMetaCrySL.g:84:2: ( (lv_metaCrySL_0_0= ruleSpec ) )
            {
            // InternalMetaCrySL.g:84:2: ( (lv_metaCrySL_0_0= ruleSpec ) )
            // InternalMetaCrySL.g:85:3: (lv_metaCrySL_0_0= ruleSpec )
            {
            // InternalMetaCrySL.g:85:3: (lv_metaCrySL_0_0= ruleSpec )
            // InternalMetaCrySL.g:86:4: lv_metaCrySL_0_0= ruleSpec
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getMetaCrySLSpecParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_metaCrySL_0_0=ruleSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelRule());
              				}
              				set(
              					current,
              					"metaCrySL",
              					lv_metaCrySL_0_0,
              					"br.unb.cic.mcsl.MetaCrySL.Spec");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpec"
    // InternalMetaCrySL.g:106:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // InternalMetaCrySL.g:106:45: (iv_ruleSpec= ruleSpec EOF )
            // InternalMetaCrySL.g:107:2: iv_ruleSpec= ruleSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpec=ruleSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalMetaCrySL.g:113:1: ruleSpec returns [EObject current=null] : ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( (lv_className_2_0= ruleJvmTypeReference ) ) ( (lv_objectSpec_3_0= ruleObjectSpec ) )? ( (lv_eventSpec_4_0= ruleEventSpec ) )? ( (lv_orderSpec_5_0= ruleOrderSpec ) )? ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )? ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_className_2_0 = null;

        EObject lv_objectSpec_3_0 = null;

        EObject lv_eventSpec_4_0 = null;

        EObject lv_orderSpec_5_0 = null;

        EObject lv_constraintSpec_6_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:119:2: ( ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( (lv_className_2_0= ruleJvmTypeReference ) ) ( (lv_objectSpec_3_0= ruleObjectSpec ) )? ( (lv_eventSpec_4_0= ruleEventSpec ) )? ( (lv_orderSpec_5_0= ruleOrderSpec ) )? ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )? ) )
            // InternalMetaCrySL.g:120:2: ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( (lv_className_2_0= ruleJvmTypeReference ) ) ( (lv_objectSpec_3_0= ruleObjectSpec ) )? ( (lv_eventSpec_4_0= ruleEventSpec ) )? ( (lv_orderSpec_5_0= ruleOrderSpec ) )? ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )? )
            {
            // InternalMetaCrySL.g:120:2: ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( (lv_className_2_0= ruleJvmTypeReference ) ) ( (lv_objectSpec_3_0= ruleObjectSpec ) )? ( (lv_eventSpec_4_0= ruleEventSpec ) )? ( (lv_orderSpec_5_0= ruleOrderSpec ) )? ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )? )
            // InternalMetaCrySL.g:121:3: (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( (lv_className_2_0= ruleJvmTypeReference ) ) ( (lv_objectSpec_3_0= ruleObjectSpec ) )? ( (lv_eventSpec_4_0= ruleEventSpec ) )? ( (lv_orderSpec_5_0= ruleOrderSpec ) )? ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )?
            {
            // InternalMetaCrySL.g:121:3: (otherlv_0= 'ABSTRACT' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMetaCrySL.g:122:4: otherlv_0= 'ABSTRACT'
                    {
                    otherlv_0=(Token)match(input,10,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getSpecAccess().getABSTRACTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecAccess().getSPECKeyword_1());
              		
            }
            // InternalMetaCrySL.g:131:3: ( (lv_className_2_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:132:4: (lv_className_2_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:132:4: (lv_className_2_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:133:5: lv_className_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecAccess().getClassNameJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_className_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecRule());
              					}
              					set(
              						current,
              						"className",
              						lv_className_2_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMetaCrySL.g:150:3: ( (lv_objectSpec_3_0= ruleObjectSpec ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMetaCrySL.g:151:4: (lv_objectSpec_3_0= ruleObjectSpec )
                    {
                    // InternalMetaCrySL.g:151:4: (lv_objectSpec_3_0= ruleObjectSpec )
                    // InternalMetaCrySL.g:152:5: lv_objectSpec_3_0= ruleObjectSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecAccess().getObjectSpecObjectSpecParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_objectSpec_3_0=ruleObjectSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecRule());
                      					}
                      					set(
                      						current,
                      						"objectSpec",
                      						lv_objectSpec_3_0,
                      						"br.unb.cic.mcsl.MetaCrySL.ObjectSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMetaCrySL.g:169:3: ( (lv_eventSpec_4_0= ruleEventSpec ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMetaCrySL.g:170:4: (lv_eventSpec_4_0= ruleEventSpec )
                    {
                    // InternalMetaCrySL.g:170:4: (lv_eventSpec_4_0= ruleEventSpec )
                    // InternalMetaCrySL.g:171:5: lv_eventSpec_4_0= ruleEventSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecAccess().getEventSpecEventSpecParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_eventSpec_4_0=ruleEventSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecRule());
                      					}
                      					set(
                      						current,
                      						"eventSpec",
                      						lv_eventSpec_4_0,
                      						"br.unb.cic.mcsl.MetaCrySL.EventSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMetaCrySL.g:188:3: ( (lv_orderSpec_5_0= ruleOrderSpec ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMetaCrySL.g:189:4: (lv_orderSpec_5_0= ruleOrderSpec )
                    {
                    // InternalMetaCrySL.g:189:4: (lv_orderSpec_5_0= ruleOrderSpec )
                    // InternalMetaCrySL.g:190:5: lv_orderSpec_5_0= ruleOrderSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecAccess().getOrderSpecOrderSpecParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_orderSpec_5_0=ruleOrderSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecRule());
                      					}
                      					set(
                      						current,
                      						"orderSpec",
                      						lv_orderSpec_5_0,
                      						"br.unb.cic.mcsl.MetaCrySL.OrderSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMetaCrySL.g:207:3: ( (lv_constraintSpec_6_0= ruleConstraintSpec ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMetaCrySL.g:208:4: (lv_constraintSpec_6_0= ruleConstraintSpec )
                    {
                    // InternalMetaCrySL.g:208:4: (lv_constraintSpec_6_0= ruleConstraintSpec )
                    // InternalMetaCrySL.g:209:5: lv_constraintSpec_6_0= ruleConstraintSpec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecAccess().getConstraintSpecConstraintSpecParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_constraintSpec_6_0=ruleConstraintSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecRule());
                      					}
                      					set(
                      						current,
                      						"constraintSpec",
                      						lv_constraintSpec_6_0,
                      						"br.unb.cic.mcsl.MetaCrySL.ConstraintSpec");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRuleObjectSpec"
    // InternalMetaCrySL.g:230:1: entryRuleObjectSpec returns [EObject current=null] : iv_ruleObjectSpec= ruleObjectSpec EOF ;
    public final EObject entryRuleObjectSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpec = null;


        try {
            // InternalMetaCrySL.g:230:51: (iv_ruleObjectSpec= ruleObjectSpec EOF )
            // InternalMetaCrySL.g:231:2: iv_ruleObjectSpec= ruleObjectSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectSpec=ruleObjectSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectSpec"


    // $ANTLR start "ruleObjectSpec"
    // InternalMetaCrySL.g:237:1: ruleObjectSpec returns [EObject current=null] : ( () otherlv_1= 'OBJECTS' otherlv_2= ':' ( (lv_objects_3_0= ruleObject ) )+ ) ;
    public final EObject ruleObjectSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:243:2: ( ( () otherlv_1= 'OBJECTS' otherlv_2= ':' ( (lv_objects_3_0= ruleObject ) )+ ) )
            // InternalMetaCrySL.g:244:2: ( () otherlv_1= 'OBJECTS' otherlv_2= ':' ( (lv_objects_3_0= ruleObject ) )+ )
            {
            // InternalMetaCrySL.g:244:2: ( () otherlv_1= 'OBJECTS' otherlv_2= ':' ( (lv_objects_3_0= ruleObject ) )+ )
            // InternalMetaCrySL.g:245:3: () otherlv_1= 'OBJECTS' otherlv_2= ':' ( (lv_objects_3_0= ruleObject ) )+
            {
            // InternalMetaCrySL.g:245:3: ()
            // InternalMetaCrySL.g:246:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectSpecAccess().getObjectSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectSpecAccess().getOBJECTSKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObjectSpecAccess().getColonKeyword_2());
              		
            }
            // InternalMetaCrySL.g:263:3: ( (lv_objects_3_0= ruleObject ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==19||LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMetaCrySL.g:264:4: (lv_objects_3_0= ruleObject )
            	    {
            	    // InternalMetaCrySL.g:264:4: (lv_objects_3_0= ruleObject )
            	    // InternalMetaCrySL.g:265:5: lv_objects_3_0= ruleObject
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getObjectSpecAccess().getObjectsObjectParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_objects_3_0=ruleObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getObjectSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"objects",
            	      						lv_objects_3_0,
            	      						"br.unb.cic.mcsl.MetaCrySL.Object");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObjectSpec"


    // $ANTLR start "entryRuleObject"
    // InternalMetaCrySL.g:286:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalMetaCrySL.g:286:47: (iv_ruleObject= ruleObject EOF )
            // InternalMetaCrySL.g:287:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalMetaCrySL.g:293:1: ruleObject returns [EObject current=null] : ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:299:2: ( ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalMetaCrySL.g:300:2: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalMetaCrySL.g:300:2: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalMetaCrySL.g:301:3: () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalMetaCrySL.g:301:3: ()
            // InternalMetaCrySL.g:302:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            // InternalMetaCrySL.g:311:3: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:312:4: (lv_type_1_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:312:4: (lv_type_1_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:313:5: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectAccess().getTypeJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getObjectRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMetaCrySL.g:330:3: ( (lv_varName_2_0= RULE_ID ) )
            // InternalMetaCrySL.g:331:4: (lv_varName_2_0= RULE_ID )
            {
            // InternalMetaCrySL.g:331:4: (lv_varName_2_0= RULE_ID )
            // InternalMetaCrySL.g:332:5: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_2_0, grammarAccess.getObjectAccess().getVarNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"varName",
              						lv_varName_2_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleEventSpec"
    // InternalMetaCrySL.g:356:1: entryRuleEventSpec returns [EObject current=null] : iv_ruleEventSpec= ruleEventSpec EOF ;
    public final EObject entryRuleEventSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpec = null;


        try {
            // InternalMetaCrySL.g:356:50: (iv_ruleEventSpec= ruleEventSpec EOF )
            // InternalMetaCrySL.g:357:2: iv_ruleEventSpec= ruleEventSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventSpec=ruleEventSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventSpec"


    // $ANTLR start "ruleEventSpec"
    // InternalMetaCrySL.g:363:1: ruleEventSpec returns [EObject current=null] : ( () otherlv_1= 'EVENTS' ( (lv_events_2_0= ruleEvent ) )+ ) ;
    public final EObject ruleEventSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_events_2_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:369:2: ( ( () otherlv_1= 'EVENTS' ( (lv_events_2_0= ruleEvent ) )+ ) )
            // InternalMetaCrySL.g:370:2: ( () otherlv_1= 'EVENTS' ( (lv_events_2_0= ruleEvent ) )+ )
            {
            // InternalMetaCrySL.g:370:2: ( () otherlv_1= 'EVENTS' ( (lv_events_2_0= ruleEvent ) )+ )
            // InternalMetaCrySL.g:371:3: () otherlv_1= 'EVENTS' ( (lv_events_2_0= ruleEvent ) )+
            {
            // InternalMetaCrySL.g:371:3: ()
            // InternalMetaCrySL.g:372:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEventSpecAccess().getEventSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEventSpecAccess().getEVENTSKeyword_1());
              		
            }
            // InternalMetaCrySL.g:385:3: ( (lv_events_2_0= ruleEvent ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMetaCrySL.g:386:4: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalMetaCrySL.g:386:4: (lv_events_2_0= ruleEvent )
            	    // InternalMetaCrySL.g:387:5: lv_events_2_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEventSpecAccess().getEventsEventParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEventSpecRule());
            	      					}
            	      					add(
            	      						current,
            	      						"events",
            	      						lv_events_2_0,
            	      						"br.unb.cic.mcsl.MetaCrySL.Event");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEventSpec"


    // $ANTLR start "entryRuleEvent"
    // InternalMetaCrySL.g:408:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMetaCrySL.g:408:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMetaCrySL.g:409:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMetaCrySL.g:415:1: ruleEvent returns [EObject current=null] : ( ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' ) | ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_var_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_method_5_0 = null;

        EObject lv_aggregate_10_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:421:2: ( ( ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' ) | ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' ) ) )
            // InternalMetaCrySL.g:422:2: ( ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' ) | ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' ) )
            {
            // InternalMetaCrySL.g:422:2: ( ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' ) | ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==13) ) {
                    alt9=1;
                }
                else if ( (LA9_1==17) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMetaCrySL.g:423:3: ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' )
                    {
                    // InternalMetaCrySL.g:423:3: ( () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';' )
                    // InternalMetaCrySL.g:424:4: () ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ) ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )? ( (lv_method_5_0= ruleMethodDef ) ) otherlv_6= ';'
                    {
                    // InternalMetaCrySL.g:424:4: ()
                    // InternalMetaCrySL.g:425:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventAccess().getEventMethodAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:434:4: ( ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' )
                    // InternalMetaCrySL.g:435:5: ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // InternalMetaCrySL.g:435:5: ( (lv_label_1_0= RULE_ID ) )
                    // InternalMetaCrySL.g:436:6: (lv_label_1_0= RULE_ID )
                    {
                    // InternalMetaCrySL.g:436:6: (lv_label_1_0= RULE_ID )
                    // InternalMetaCrySL.g:437:7: lv_label_1_0= RULE_ID
                    {
                    lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_label_1_0, grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_0_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getEventRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"label",
                      								lv_label_1_0,
                      								"org.eclipse.xtext.xbase.Xtype.ID");
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_0_1_1());
                      				
                    }

                    }

                    // InternalMetaCrySL.g:458:4: ( ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '=' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==16) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMetaCrySL.g:459:5: ( (lv_var_3_0= RULE_ID ) ) otherlv_4= '='
                            {
                            // InternalMetaCrySL.g:459:5: ( (lv_var_3_0= RULE_ID ) )
                            // InternalMetaCrySL.g:460:6: (lv_var_3_0= RULE_ID )
                            {
                            // InternalMetaCrySL.g:460:6: (lv_var_3_0= RULE_ID )
                            // InternalMetaCrySL.g:461:7: lv_var_3_0= RULE_ID
                            {
                            lv_var_3_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_var_3_0, grammarAccess.getEventAccess().getVarIDTerminalRuleCall_0_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getEventRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"var",
                              								lv_var_3_0,
                              								"org.eclipse.xtext.xbase.Xtype.ID");
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getEventAccess().getEqualsSignKeyword_0_2_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMetaCrySL.g:482:4: ( (lv_method_5_0= ruleMethodDef ) )
                    // InternalMetaCrySL.g:483:5: (lv_method_5_0= ruleMethodDef )
                    {
                    // InternalMetaCrySL.g:483:5: (lv_method_5_0= ruleMethodDef )
                    // InternalMetaCrySL.g:484:6: lv_method_5_0= ruleMethodDef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getMethodMethodDefParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_method_5_0=ruleMethodDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventRule());
                      						}
                      						set(
                      							current,
                      							"method",
                      							lv_method_5_0,
                      							"br.unb.cic.mcsl.MetaCrySL.MethodDef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:507:3: ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' )
                    {
                    // InternalMetaCrySL.g:507:3: ( () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';' )
                    // InternalMetaCrySL.g:508:4: () ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' ) ( (lv_aggregate_10_0= ruleAggregateList ) ) otherlv_11= ';'
                    {
                    // InternalMetaCrySL.g:508:4: ()
                    // InternalMetaCrySL.g:509:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventAccess().getEventAggregateAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:518:4: ( ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':=' )
                    // InternalMetaCrySL.g:519:5: ( (lv_label_8_0= RULE_ID ) ) otherlv_9= ':='
                    {
                    // InternalMetaCrySL.g:519:5: ( (lv_label_8_0= RULE_ID ) )
                    // InternalMetaCrySL.g:520:6: (lv_label_8_0= RULE_ID )
                    {
                    // InternalMetaCrySL.g:520:6: (lv_label_8_0= RULE_ID )
                    // InternalMetaCrySL.g:521:7: lv_label_8_0= RULE_ID
                    {
                    lv_label_8_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_label_8_0, grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getEventRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"label",
                      								lv_label_8_0,
                      								"org.eclipse.xtext.xbase.Xtype.ID");
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getEventAccess().getColonEqualsSignKeyword_1_1_1());
                      				
                    }

                    }

                    // InternalMetaCrySL.g:542:4: ( (lv_aggregate_10_0= ruleAggregateList ) )
                    // InternalMetaCrySL.g:543:5: (lv_aggregate_10_0= ruleAggregateList )
                    {
                    // InternalMetaCrySL.g:543:5: (lv_aggregate_10_0= ruleAggregateList )
                    // InternalMetaCrySL.g:544:6: lv_aggregate_10_0= ruleAggregateList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getAggregateAggregateListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_aggregate_10_0=ruleAggregateList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventRule());
                      						}
                      						set(
                      							current,
                      							"aggregate",
                      							lv_aggregate_10_0,
                      							"br.unb.cic.mcsl.MetaCrySL.AggregateList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getSemicolonKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAggregateList"
    // InternalMetaCrySL.g:570:1: entryRuleAggregateList returns [EObject current=null] : iv_ruleAggregateList= ruleAggregateList EOF ;
    public final EObject entryRuleAggregateList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateList = null;


        try {
            // InternalMetaCrySL.g:570:54: (iv_ruleAggregateList= ruleAggregateList EOF )
            // InternalMetaCrySL.g:571:2: iv_ruleAggregateList= ruleAggregateList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregateList=ruleAggregateList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregateList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAggregateList"


    // $ANTLR start "ruleAggregateList"
    // InternalMetaCrySL.g:577:1: ruleAggregateList returns [EObject current=null] : ( ( (lv_labels_0_0= RULE_ID ) ) (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAggregateList() throws RecognitionException {
        EObject current = null;

        Token lv_labels_0_0=null;
        Token otherlv_1=null;
        Token lv_labels_2_0=null;


        	enterRule();

        try {
            // InternalMetaCrySL.g:583:2: ( ( ( (lv_labels_0_0= RULE_ID ) ) (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )* ) )
            // InternalMetaCrySL.g:584:2: ( ( (lv_labels_0_0= RULE_ID ) ) (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )* )
            {
            // InternalMetaCrySL.g:584:2: ( ( (lv_labels_0_0= RULE_ID ) ) (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )* )
            // InternalMetaCrySL.g:585:3: ( (lv_labels_0_0= RULE_ID ) ) (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )*
            {
            // InternalMetaCrySL.g:585:3: ( (lv_labels_0_0= RULE_ID ) )
            // InternalMetaCrySL.g:586:4: (lv_labels_0_0= RULE_ID )
            {
            // InternalMetaCrySL.g:586:4: (lv_labels_0_0= RULE_ID )
            // InternalMetaCrySL.g:587:5: lv_labels_0_0= RULE_ID
            {
            lv_labels_0_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_labels_0_0, grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAggregateListRule());
              					}
              					addWithLastConsumed(
              						current,
              						"labels",
              						lv_labels_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            // InternalMetaCrySL.g:603:3: (otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMetaCrySL.g:604:4: otherlv_1= '|' ( (lv_labels_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAggregateListAccess().getVerticalLineKeyword_1_0());
            	      			
            	    }
            	    // InternalMetaCrySL.g:608:4: ( (lv_labels_2_0= RULE_ID ) )
            	    // InternalMetaCrySL.g:609:5: (lv_labels_2_0= RULE_ID )
            	    {
            	    // InternalMetaCrySL.g:609:5: (lv_labels_2_0= RULE_ID )
            	    // InternalMetaCrySL.g:610:6: lv_labels_2_0= RULE_ID
            	    {
            	    lv_labels_2_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_labels_2_0, grammarAccess.getAggregateListAccess().getLabelsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAggregateListRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"labels",
            	      							lv_labels_2_0,
            	      							"org.eclipse.xtext.xbase.Xtype.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAggregateList"


    // $ANTLR start "entryRuleMethodDef"
    // InternalMetaCrySL.g:631:1: entryRuleMethodDef returns [EObject current=null] : iv_ruleMethodDef= ruleMethodDef EOF ;
    public final EObject entryRuleMethodDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDef = null;


        try {
            // InternalMetaCrySL.g:631:50: (iv_ruleMethodDef= ruleMethodDef EOF )
            // InternalMetaCrySL.g:632:2: iv_ruleMethodDef= ruleMethodDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodDef=ruleMethodDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodDef"


    // $ANTLR start "ruleMethodDef"
    // InternalMetaCrySL.g:638:1: ruleMethodDef returns [EObject current=null] : ( ( (lv_methodName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleFormalArgs ) )? otherlv_3= ')' ) ;
    public final EObject ruleMethodDef() throws RecognitionException {
        EObject current = null;

        Token lv_methodName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:644:2: ( ( ( (lv_methodName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleFormalArgs ) )? otherlv_3= ')' ) )
            // InternalMetaCrySL.g:645:2: ( ( (lv_methodName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleFormalArgs ) )? otherlv_3= ')' )
            {
            // InternalMetaCrySL.g:645:2: ( ( (lv_methodName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleFormalArgs ) )? otherlv_3= ')' )
            // InternalMetaCrySL.g:646:3: ( (lv_methodName_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_args_2_0= ruleFormalArgs ) )? otherlv_3= ')'
            {
            // InternalMetaCrySL.g:646:3: ( (lv_methodName_0_0= RULE_ID ) )
            // InternalMetaCrySL.g:647:4: (lv_methodName_0_0= RULE_ID )
            {
            // InternalMetaCrySL.g:647:4: (lv_methodName_0_0= RULE_ID )
            // InternalMetaCrySL.g:648:5: lv_methodName_0_0= RULE_ID
            {
            lv_methodName_0_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_methodName_0_0, grammarAccess.getMethodDefAccess().getMethodNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"methodName",
              						lv_methodName_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodDefAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMetaCrySL.g:668:3: ( (lv_args_2_0= ruleFormalArgs ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMetaCrySL.g:669:4: (lv_args_2_0= ruleFormalArgs )
                    {
                    // InternalMetaCrySL.g:669:4: (lv_args_2_0= ruleFormalArgs )
                    // InternalMetaCrySL.g:670:5: lv_args_2_0= ruleFormalArgs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodDefAccess().getArgsFormalArgsParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_args_2_0=ruleFormalArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodDefRule());
                      					}
                      					set(
                      						current,
                      						"args",
                      						lv_args_2_0 != null,
                      						"br.unb.cic.mcsl.MetaCrySL.FormalArgs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodDefAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodDef"


    // $ANTLR start "entryRuleFormalArgs"
    // InternalMetaCrySL.g:695:1: entryRuleFormalArgs returns [EObject current=null] : iv_ruleFormalArgs= ruleFormalArgs EOF ;
    public final EObject entryRuleFormalArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgs = null;


        try {
            // InternalMetaCrySL.g:695:51: (iv_ruleFormalArgs= ruleFormalArgs EOF )
            // InternalMetaCrySL.g:696:2: iv_ruleFormalArgs= ruleFormalArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormalArgs=ruleFormalArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormalArgs"


    // $ANTLR start "ruleFormalArgs"
    // InternalMetaCrySL.g:702:1: ruleFormalArgs returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleFormalArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMetaCrySL.g:708:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalMetaCrySL.g:709:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalMetaCrySL.g:709:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalMetaCrySL.g:710:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalMetaCrySL.g:710:3: ( (otherlv_0= RULE_ID ) )
            // InternalMetaCrySL.g:711:4: (otherlv_0= RULE_ID )
            {
            // InternalMetaCrySL.g:711:4: (otherlv_0= RULE_ID )
            // InternalMetaCrySL.g:712:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFormalArgsRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_0_0());
              				
            }

            }


            }

            // InternalMetaCrySL.g:726:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMetaCrySL.g:727:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getFormalArgsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMetaCrySL.g:731:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMetaCrySL.g:732:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMetaCrySL.g:732:5: (otherlv_2= RULE_ID )
            	    // InternalMetaCrySL.g:733:6: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getFormalArgsRule());
            	      						}
            	      					
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getFormalArgsAccess().getArgsFormalArgCrossReference_1_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFormalArgs"


    // $ANTLR start "entryRuleOrderSpec"
    // InternalMetaCrySL.g:752:1: entryRuleOrderSpec returns [EObject current=null] : iv_ruleOrderSpec= ruleOrderSpec EOF ;
    public final EObject entryRuleOrderSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderSpec = null;


        try {
            // InternalMetaCrySL.g:752:50: (iv_ruleOrderSpec= ruleOrderSpec EOF )
            // InternalMetaCrySL.g:753:2: iv_ruleOrderSpec= ruleOrderSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrderSpec=ruleOrderSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderSpec"


    // $ANTLR start "ruleOrderSpec"
    // InternalMetaCrySL.g:759:1: ruleOrderSpec returns [EObject current=null] : ( () otherlv_1= 'ORDER' ( (lv_order_2_0= ruleEventExp ) ) ) ;
    public final EObject ruleOrderSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_order_2_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:765:2: ( ( () otherlv_1= 'ORDER' ( (lv_order_2_0= ruleEventExp ) ) ) )
            // InternalMetaCrySL.g:766:2: ( () otherlv_1= 'ORDER' ( (lv_order_2_0= ruleEventExp ) ) )
            {
            // InternalMetaCrySL.g:766:2: ( () otherlv_1= 'ORDER' ( (lv_order_2_0= ruleEventExp ) ) )
            // InternalMetaCrySL.g:767:3: () otherlv_1= 'ORDER' ( (lv_order_2_0= ruleEventExp ) )
            {
            // InternalMetaCrySL.g:767:3: ()
            // InternalMetaCrySL.g:768:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOrderSpecAccess().getOrderSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getOrderSpecAccess().getORDERKeyword_1());
              		
            }
            // InternalMetaCrySL.g:781:3: ( (lv_order_2_0= ruleEventExp ) )
            // InternalMetaCrySL.g:782:4: (lv_order_2_0= ruleEventExp )
            {
            // InternalMetaCrySL.g:782:4: (lv_order_2_0= ruleEventExp )
            // InternalMetaCrySL.g:783:5: lv_order_2_0= ruleEventExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrderSpecAccess().getOrderEventExpParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_order_2_0=ruleEventExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrderSpecRule());
              					}
              					set(
              						current,
              						"order",
              						lv_order_2_0,
              						"br.unb.cic.mcsl.MetaCrySL.EventExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrderSpec"


    // $ANTLR start "entryRuleEventExp"
    // InternalMetaCrySL.g:804:1: entryRuleEventExp returns [EObject current=null] : iv_ruleEventExp= ruleEventExp EOF ;
    public final EObject entryRuleEventExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventExp = null;


        try {
            // InternalMetaCrySL.g:804:49: (iv_ruleEventExp= ruleEventExp EOF )
            // InternalMetaCrySL.g:805:2: iv_ruleEventExp= ruleEventExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventExp=ruleEventExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventExp"


    // $ANTLR start "ruleEventExp"
    // InternalMetaCrySL.g:811:1: ruleEventExp returns [EObject current=null] : ( ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' ) | ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' ) | ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' ) | ( () ( (lv_exp_10_0= ruleChoiceExp ) ) ) ) ;
    public final EObject ruleEventExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_exp_1_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_exp_7_0 = null;

        EObject lv_exp_10_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:817:2: ( ( ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' ) | ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' ) | ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' ) | ( () ( (lv_exp_10_0= ruleChoiceExp ) ) ) ) )
            // InternalMetaCrySL.g:818:2: ( ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' ) | ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' ) | ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' ) | ( () ( (lv_exp_10_0= ruleChoiceExp ) ) ) )
            {
            // InternalMetaCrySL.g:818:2: ( ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' ) | ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' ) | ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' ) | ( () ( (lv_exp_10_0= ruleChoiceExp ) ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred13_InternalMetaCrySL()) ) {
                    alt13=1;
                }
                else if ( (synpred14_InternalMetaCrySL()) ) {
                    alt13=2;
                }
                else if ( (synpred15_InternalMetaCrySL()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==19) ) {
                int LA13_2 = input.LA(2);

                if ( (synpred13_InternalMetaCrySL()) ) {
                    alt13=1;
                }
                else if ( (synpred14_InternalMetaCrySL()) ) {
                    alt13=2;
                }
                else if ( (synpred15_InternalMetaCrySL()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMetaCrySL.g:819:3: ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' )
                    {
                    // InternalMetaCrySL.g:819:3: ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' )
                    // InternalMetaCrySL.g:820:4: () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?'
                    {
                    // InternalMetaCrySL.g:820:4: ()
                    // InternalMetaCrySL.g:821:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventExpAccess().getOptionalAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:830:4: ( (lv_exp_1_0= ruleChoiceExp ) )
                    // InternalMetaCrySL.g:831:5: (lv_exp_1_0= ruleChoiceExp )
                    {
                    // InternalMetaCrySL.g:831:5: (lv_exp_1_0= ruleChoiceExp )
                    // InternalMetaCrySL.g:832:6: lv_exp_1_0= ruleChoiceExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exp_1_0=ruleChoiceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventExpRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_1_0,
                      							"br.unb.cic.mcsl.MetaCrySL.ChoiceExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEventExpAccess().getQuestionMarkKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:855:3: ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' )
                    {
                    // InternalMetaCrySL.g:855:3: ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' )
                    // InternalMetaCrySL.g:856:4: () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*'
                    {
                    // InternalMetaCrySL.g:856:4: ()
                    // InternalMetaCrySL.g:857:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventExpAccess().getZeroOrMoreAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:866:4: ( (lv_exp_4_0= ruleChoiceExp ) )
                    // InternalMetaCrySL.g:867:5: (lv_exp_4_0= ruleChoiceExp )
                    {
                    // InternalMetaCrySL.g:867:5: (lv_exp_4_0= ruleChoiceExp )
                    // InternalMetaCrySL.g:868:6: lv_exp_4_0= ruleChoiceExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_exp_4_0=ruleChoiceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventExpRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_4_0,
                      							"br.unb.cic.mcsl.MetaCrySL.ChoiceExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEventExpAccess().getAsteriskKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMetaCrySL.g:891:3: ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' )
                    {
                    // InternalMetaCrySL.g:891:3: ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' )
                    // InternalMetaCrySL.g:892:4: () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+'
                    {
                    // InternalMetaCrySL.g:892:4: ()
                    // InternalMetaCrySL.g:893:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventExpAccess().getOneOrMoreAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:902:4: ( (lv_exp_7_0= ruleChoiceExp ) )
                    // InternalMetaCrySL.g:903:5: (lv_exp_7_0= ruleChoiceExp )
                    {
                    // InternalMetaCrySL.g:903:5: (lv_exp_7_0= ruleChoiceExp )
                    // InternalMetaCrySL.g:904:6: lv_exp_7_0= ruleChoiceExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_exp_7_0=ruleChoiceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventExpRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_7_0,
                      							"br.unb.cic.mcsl.MetaCrySL.ChoiceExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getEventExpAccess().getPlusSignKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMetaCrySL.g:927:3: ( () ( (lv_exp_10_0= ruleChoiceExp ) ) )
                    {
                    // InternalMetaCrySL.g:927:3: ( () ( (lv_exp_10_0= ruleChoiceExp ) ) )
                    // InternalMetaCrySL.g:928:4: () ( (lv_exp_10_0= ruleChoiceExp ) )
                    {
                    // InternalMetaCrySL.g:928:4: ()
                    // InternalMetaCrySL.g:929:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventExpAccess().getChoiceExpAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMetaCrySL.g:938:4: ( (lv_exp_10_0= ruleChoiceExp ) )
                    // InternalMetaCrySL.g:939:5: (lv_exp_10_0= ruleChoiceExp )
                    {
                    // InternalMetaCrySL.g:939:5: (lv_exp_10_0= ruleChoiceExp )
                    // InternalMetaCrySL.g:940:6: lv_exp_10_0= ruleChoiceExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_exp_10_0=ruleChoiceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventExpRule());
                      						}
                      						set(
                      							current,
                      							"exp",
                      							lv_exp_10_0,
                      							"br.unb.cic.mcsl.MetaCrySL.ChoiceExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEventExp"


    // $ANTLR start "entryRuleChoiceExp"
    // InternalMetaCrySL.g:962:1: entryRuleChoiceExp returns [EObject current=null] : iv_ruleChoiceExp= ruleChoiceExp EOF ;
    public final EObject entryRuleChoiceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceExp = null;


        try {
            // InternalMetaCrySL.g:962:50: (iv_ruleChoiceExp= ruleChoiceExp EOF )
            // InternalMetaCrySL.g:963:2: iv_ruleChoiceExp= ruleChoiceExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoiceExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChoiceExp=ruleChoiceExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoiceExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChoiceExp"


    // $ANTLR start "ruleChoiceExp"
    // InternalMetaCrySL.g:969:1: ruleChoiceExp returns [EObject current=null] : (this_SequenceExp_0= ruleSequenceExp ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )* ) ;
    public final EObject ruleChoiceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SequenceExp_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:975:2: ( (this_SequenceExp_0= ruleSequenceExp ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )* ) )
            // InternalMetaCrySL.g:976:2: (this_SequenceExp_0= ruleSequenceExp ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )* )
            {
            // InternalMetaCrySL.g:976:2: (this_SequenceExp_0= ruleSequenceExp ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )* )
            // InternalMetaCrySL.g:977:3: this_SequenceExp_0= ruleSequenceExp ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChoiceExpAccess().getSequenceExpParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_SequenceExp_0=ruleSequenceExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SequenceExp_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMetaCrySL.g:988:3: ( ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) && (synpred16_InternalMetaCrySL())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMetaCrySL.g:989:4: ( ( () '|' ( ( ruleSequenceExp ) ) ) )=> ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) )
            	    {
            	    // InternalMetaCrySL.g:1000:4: ( () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) ) )
            	    // InternalMetaCrySL.g:1001:5: () otherlv_2= '|' ( (lv_right_3_0= ruleSequenceExp ) )
            	    {
            	    // InternalMetaCrySL.g:1001:5: ()
            	    // InternalMetaCrySL.g:1002:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getChoiceExpAccess().getVerticalLineKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMetaCrySL.g:1015:5: ( (lv_right_3_0= ruleSequenceExp ) )
            	    // InternalMetaCrySL.g:1016:6: (lv_right_3_0= ruleSequenceExp )
            	    {
            	    // InternalMetaCrySL.g:1016:6: (lv_right_3_0= ruleSequenceExp )
            	    // InternalMetaCrySL.g:1017:7: lv_right_3_0= ruleSequenceExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getChoiceExpAccess().getRightSequenceExpParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleSequenceExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getChoiceExpRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"br.unb.cic.mcsl.MetaCrySL.SequenceExp");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChoiceExp"


    // $ANTLR start "entryRuleSequenceExp"
    // InternalMetaCrySL.g:1040:1: entryRuleSequenceExp returns [EObject current=null] : iv_ruleSequenceExp= ruleSequenceExp EOF ;
    public final EObject entryRuleSequenceExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceExp = null;


        try {
            // InternalMetaCrySL.g:1040:52: (iv_ruleSequenceExp= ruleSequenceExp EOF )
            // InternalMetaCrySL.g:1041:2: iv_ruleSequenceExp= ruleSequenceExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenceExp=ruleSequenceExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenceExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSequenceExp"


    // $ANTLR start "ruleSequenceExp"
    // InternalMetaCrySL.g:1047:1: ruleSequenceExp returns [EObject current=null] : (this_PrimaryExp_0= rulePrimaryExp ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )* ) ;
    public final EObject ruleSequenceExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExp_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1053:2: ( (this_PrimaryExp_0= rulePrimaryExp ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )* ) )
            // InternalMetaCrySL.g:1054:2: (this_PrimaryExp_0= rulePrimaryExp ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )* )
            {
            // InternalMetaCrySL.g:1054:2: (this_PrimaryExp_0= rulePrimaryExp ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )* )
            // InternalMetaCrySL.g:1055:3: this_PrimaryExp_0= rulePrimaryExp ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSequenceExpAccess().getPrimaryExpParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_PrimaryExp_0=rulePrimaryExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExp_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMetaCrySL.g:1066:3: ( ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) && (synpred17_InternalMetaCrySL())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMetaCrySL.g:1067:4: ( ( () ',' ( ( rulePrimaryExp ) ) ) )=> ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) )
            	    {
            	    // InternalMetaCrySL.g:1078:4: ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) ) )
            	    // InternalMetaCrySL.g:1079:5: () otherlv_2= ',' ( (lv_right_3_0= rulePrimaryExp ) )
            	    {
            	    // InternalMetaCrySL.g:1079:5: ()
            	    // InternalMetaCrySL.g:1080:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getSequenceExpAccess().getCommaKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMetaCrySL.g:1093:5: ( (lv_right_3_0= rulePrimaryExp ) )
            	    // InternalMetaCrySL.g:1094:6: (lv_right_3_0= rulePrimaryExp )
            	    {
            	    // InternalMetaCrySL.g:1094:6: (lv_right_3_0= rulePrimaryExp )
            	    // InternalMetaCrySL.g:1095:7: lv_right_3_0= rulePrimaryExp
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSequenceExpAccess().getRightPrimaryExpParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=rulePrimaryExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSequenceExpRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"br.unb.cic.mcsl.MetaCrySL.PrimaryExp");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSequenceExp"


    // $ANTLR start "entryRulePrimaryExp"
    // InternalMetaCrySL.g:1118:1: entryRulePrimaryExp returns [EObject current=null] : iv_rulePrimaryExp= rulePrimaryExp EOF ;
    public final EObject entryRulePrimaryExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExp = null;


        try {
            // InternalMetaCrySL.g:1118:51: (iv_rulePrimaryExp= rulePrimaryExp EOF )
            // InternalMetaCrySL.g:1119:2: iv_rulePrimaryExp= rulePrimaryExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExp=rulePrimaryExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExp"


    // $ANTLR start "rulePrimaryExp"
    // InternalMetaCrySL.g:1125:1: rulePrimaryExp returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) | (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExp() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ChoiceExp_2 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1131:2: ( ( ( (lv_label_0_0= RULE_ID ) ) | (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' ) ) )
            // InternalMetaCrySL.g:1132:2: ( ( (lv_label_0_0= RULE_ID ) ) | (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' ) )
            {
            // InternalMetaCrySL.g:1132:2: ( ( (lv_label_0_0= RULE_ID ) ) | (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMetaCrySL.g:1133:3: ( (lv_label_0_0= RULE_ID ) )
                    {
                    // InternalMetaCrySL.g:1133:3: ( (lv_label_0_0= RULE_ID ) )
                    // InternalMetaCrySL.g:1134:4: (lv_label_0_0= RULE_ID )
                    {
                    // InternalMetaCrySL.g:1134:4: (lv_label_0_0= RULE_ID )
                    // InternalMetaCrySL.g:1135:5: lv_label_0_0= RULE_ID
                    {
                    lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_label_0_0, grammarAccess.getPrimaryExpAccess().getLabelIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimaryExpRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"label",
                      						lv_label_0_0,
                      						"org.eclipse.xtext.xbase.Xtype.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:1152:3: (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' )
                    {
                    // InternalMetaCrySL.g:1152:3: (otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')' )
                    // InternalMetaCrySL.g:1153:4: otherlv_1= '(' this_ChoiceExp_2= ruleChoiceExp otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryExpAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpAccess().getChoiceExpParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_ChoiceExp_2=ruleChoiceExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ChoiceExp_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExp"


    // $ANTLR start "entryRuleConstraintSpec"
    // InternalMetaCrySL.g:1177:1: entryRuleConstraintSpec returns [EObject current=null] : iv_ruleConstraintSpec= ruleConstraintSpec EOF ;
    public final EObject entryRuleConstraintSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintSpec = null;


        try {
            // InternalMetaCrySL.g:1177:55: (iv_ruleConstraintSpec= ruleConstraintSpec EOF )
            // InternalMetaCrySL.g:1178:2: iv_ruleConstraintSpec= ruleConstraintSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintSpec=ruleConstraintSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraintSpec"


    // $ANTLR start "ruleConstraintSpec"
    // InternalMetaCrySL.g:1184:1: ruleConstraintSpec returns [EObject current=null] : ( () otherlv_1= 'CONSTRAINTS' ( (lv_constraints_2_0= ruleConstraintsExp ) ) ) ;
    public final EObject ruleConstraintSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1190:2: ( ( () otherlv_1= 'CONSTRAINTS' ( (lv_constraints_2_0= ruleConstraintsExp ) ) ) )
            // InternalMetaCrySL.g:1191:2: ( () otherlv_1= 'CONSTRAINTS' ( (lv_constraints_2_0= ruleConstraintsExp ) ) )
            {
            // InternalMetaCrySL.g:1191:2: ( () otherlv_1= 'CONSTRAINTS' ( (lv_constraints_2_0= ruleConstraintsExp ) ) )
            // InternalMetaCrySL.g:1192:3: () otherlv_1= 'CONSTRAINTS' ( (lv_constraints_2_0= ruleConstraintsExp ) )
            {
            // InternalMetaCrySL.g:1192:3: ()
            // InternalMetaCrySL.g:1193:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConstraintSpecAccess().getConstraintSpecAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstraintSpecAccess().getCONSTRAINTSKeyword_1());
              		
            }
            // InternalMetaCrySL.g:1206:3: ( (lv_constraints_2_0= ruleConstraintsExp ) )
            // InternalMetaCrySL.g:1207:4: (lv_constraints_2_0= ruleConstraintsExp )
            {
            // InternalMetaCrySL.g:1207:4: (lv_constraints_2_0= ruleConstraintsExp )
            // InternalMetaCrySL.g:1208:5: lv_constraints_2_0= ruleConstraintsExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstraintSpecAccess().getConstraintsConstraintsExpParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraints_2_0=ruleConstraintsExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstraintSpecRule());
              					}
              					add(
              						current,
              						"constraints",
              						lv_constraints_2_0,
              						"br.unb.cic.mcsl.MetaCrySL.ConstraintsExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraintSpec"


    // $ANTLR start "entryRuleConstraintsExp"
    // InternalMetaCrySL.g:1229:1: entryRuleConstraintsExp returns [EObject current=null] : iv_ruleConstraintsExp= ruleConstraintsExp EOF ;
    public final EObject entryRuleConstraintsExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintsExp = null;


        try {
            // InternalMetaCrySL.g:1229:55: (iv_ruleConstraintsExp= ruleConstraintsExp EOF )
            // InternalMetaCrySL.g:1230:2: iv_ruleConstraintsExp= ruleConstraintsExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintsExpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintsExp=ruleConstraintsExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintsExp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraintsExp"


    // $ANTLR start "ruleConstraintsExp"
    // InternalMetaCrySL.g:1236:1: ruleConstraintsExp returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleConstraintsExp() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_constraints_3_0=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMetaCrySL.g:1242:2: ( ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalMetaCrySL.g:1243:2: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalMetaCrySL.g:1243:2: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalMetaCrySL.g:1244:3: ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalMetaCrySL.g:1244:3: ( (lv_varName_0_0= RULE_ID ) )
            // InternalMetaCrySL.g:1245:4: (lv_varName_0_0= RULE_ID )
            {
            // InternalMetaCrySL.g:1245:4: (lv_varName_0_0= RULE_ID )
            // InternalMetaCrySL.g:1246:5: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_0_0, grammarAccess.getConstraintsExpAccess().getVarNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstraintsExpRule());
              					}
              					setWithLastConsumed(
              						current,
              						"varName",
              						lv_varName_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstraintsExpAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintsExpAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMetaCrySL.g:1270:3: ( (lv_constraints_3_0= RULE_STRING ) )
            // InternalMetaCrySL.g:1271:4: (lv_constraints_3_0= RULE_STRING )
            {
            // InternalMetaCrySL.g:1271:4: (lv_constraints_3_0= RULE_STRING )
            // InternalMetaCrySL.g:1272:5: lv_constraints_3_0= RULE_STRING
            {
            lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_constraints_3_0, grammarAccess.getConstraintsExpAccess().getConstraintsSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstraintsExpRule());
              					}
              					addWithLastConsumed(
              						current,
              						"constraints",
              						lv_constraints_3_0,
              						"org.eclipse.xtext.xbase.Xtype.STRING");
              				
            }

            }


            }

            // InternalMetaCrySL.g:1288:3: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMetaCrySL.g:1289:4: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConstraintsExpAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalMetaCrySL.g:1293:4: ( (lv_constraints_5_0= RULE_STRING ) )
            	    // InternalMetaCrySL.g:1294:5: (lv_constraints_5_0= RULE_STRING )
            	    {
            	    // InternalMetaCrySL.g:1294:5: (lv_constraints_5_0= RULE_STRING )
            	    // InternalMetaCrySL.g:1295:6: lv_constraints_5_0= RULE_STRING
            	    {
            	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_constraints_5_0, grammarAccess.getConstraintsExpAccess().getConstraintsSTRINGTerminalRuleCall_4_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getConstraintsExpRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_5_0,
            	      							"org.eclipse.xtext.xbase.Xtype.STRING");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConstraintsExpAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConstraintsExpAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraintsExp"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalMetaCrySL.g:1324:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalMetaCrySL.g:1324:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalMetaCrySL.g:1325:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalMetaCrySL.g:1331:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1337:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalMetaCrySL.g:1338:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalMetaCrySL.g:1338:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==19||LA19_0==32) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMetaCrySL.g:1339:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalMetaCrySL.g:1339:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalMetaCrySL.g:1340:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMetaCrySL.g:1351:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) && (synpred20_InternalMetaCrySL())) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:1352:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalMetaCrySL.g:1358:5: ( () ruleArrayBrackets )
                    	    // InternalMetaCrySL.g:1359:6: () ruleArrayBrackets
                    	    {
                    	    // InternalMetaCrySL.g:1359:6: ()
                    	    // InternalMetaCrySL.g:1360:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						/* */
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_29);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:1383:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalMetaCrySL.g:1398:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalMetaCrySL.g:1398:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalMetaCrySL.g:1399:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalMetaCrySL.g:1405:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMetaCrySL.g:1411:2: ( (kw= '[' kw= ']' ) )
            // InternalMetaCrySL.g:1412:2: (kw= '[' kw= ']' )
            {
            // InternalMetaCrySL.g:1412:2: (kw= '[' kw= ']' )
            // InternalMetaCrySL.g:1413:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,30,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalMetaCrySL.g:1427:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalMetaCrySL.g:1427:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalMetaCrySL.g:1428:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalMetaCrySL.g:1434:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1440:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalMetaCrySL.g:1441:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalMetaCrySL.g:1441:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalMetaCrySL.g:1442:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalMetaCrySL.g:1442:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMetaCrySL.g:1443:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalMetaCrySL.g:1447:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==19||LA21_0==32) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMetaCrySL.g:1448:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalMetaCrySL.g:1448:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalMetaCrySL.g:1449:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalMetaCrySL.g:1449:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalMetaCrySL.g:1450:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMetaCrySL.g:1467:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==21) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalMetaCrySL.g:1468:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalMetaCrySL.g:1472:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalMetaCrySL.g:1473:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalMetaCrySL.g:1473:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalMetaCrySL.g:1474:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalMetaCrySL.g:1502:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:1503:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:1503:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:1504:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalMetaCrySL.g:1525:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalMetaCrySL.g:1525:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalMetaCrySL.g:1526:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalMetaCrySL.g:1532:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1538:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalMetaCrySL.g:1539:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalMetaCrySL.g:1539:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalMetaCrySL.g:1540:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalMetaCrySL.g:1540:3: ( ( ruleQualifiedName ) )
            // InternalMetaCrySL.g:1541:4: ( ruleQualifiedName )
            {
            // InternalMetaCrySL.g:1541:4: ( ruleQualifiedName )
            // InternalMetaCrySL.g:1542:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMetaCrySL.g:1559:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMetaCrySL.g:1560:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalMetaCrySL.g:1560:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalMetaCrySL.g:1561:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalMetaCrySL.g:1567:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalMetaCrySL.g:1568:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalMetaCrySL.g:1568:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalMetaCrySL.g:1569:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMetaCrySL.g:1586:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==21) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:1587:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalMetaCrySL.g:1591:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalMetaCrySL.g:1592:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalMetaCrySL.g:1592:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalMetaCrySL.g:1593:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_36);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalMetaCrySL.g:1615:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:1616:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalMetaCrySL.g:1616:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalMetaCrySL.g:1617:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalMetaCrySL.g:1623:6: ( () otherlv_7= '.' )
                    	    // InternalMetaCrySL.g:1624:7: () otherlv_7= '.'
                    	    {
                    	    // InternalMetaCrySL.g:1624:7: ()
                    	    // InternalMetaCrySL.g:1625:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								/* */
                    	      							
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalMetaCrySL.g:1640:5: ( ( ruleValidID ) )
                    	    // InternalMetaCrySL.g:1641:6: ( ruleValidID )
                    	    {
                    	    // InternalMetaCrySL.g:1641:6: ( ruleValidID )
                    	    // InternalMetaCrySL.g:1642:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalMetaCrySL.g:1659:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==33) ) {
                    	        alt25=1;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // InternalMetaCrySL.g:1660:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalMetaCrySL.g:1660:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalMetaCrySL.g:1661:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,33,FOLLOW_35); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalMetaCrySL.g:1667:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalMetaCrySL.g:1668:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalMetaCrySL.g:1668:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalMetaCrySL.g:1669:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_36);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalMetaCrySL.g:1686:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop24:
                    	            do {
                    	                int alt24=2;
                    	                int LA24_0 = input.LA(1);

                    	                if ( (LA24_0==21) ) {
                    	                    alt24=1;
                    	                }


                    	                switch (alt24) {
                    	            	case 1 :
                    	            	    // InternalMetaCrySL.g:1687:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,21,FOLLOW_35); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalMetaCrySL.g:1691:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalMetaCrySL.g:1692:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalMetaCrySL.g:1692:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalMetaCrySL.g:1693:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_36);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop24;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,34,FOLLOW_37); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalMetaCrySL.g:1722:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalMetaCrySL.g:1722:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalMetaCrySL.g:1723:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalMetaCrySL.g:1729:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1735:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalMetaCrySL.g:1736:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalMetaCrySL.g:1736:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==19||LA28_0==32) ) {
                alt28=1;
            }
            else if ( (LA28_0==23) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMetaCrySL.g:1737:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:1749:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalMetaCrySL.g:1764:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalMetaCrySL.g:1764:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalMetaCrySL.g:1765:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalMetaCrySL.g:1771:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1777:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalMetaCrySL.g:1778:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalMetaCrySL.g:1778:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalMetaCrySL.g:1779:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalMetaCrySL.g:1779:3: ()
            // InternalMetaCrySL.g:1780:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalMetaCrySL.g:1793:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            else if ( (LA31_0==38) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalMetaCrySL.g:1794:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalMetaCrySL.g:1794:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalMetaCrySL.g:1795:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalMetaCrySL.g:1795:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalMetaCrySL.g:1796:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalMetaCrySL.g:1796:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalMetaCrySL.g:1797:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMetaCrySL.g:1814:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==37) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:1815:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalMetaCrySL.g:1815:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalMetaCrySL.g:1816:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:1835:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalMetaCrySL.g:1835:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalMetaCrySL.g:1836:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalMetaCrySL.g:1836:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalMetaCrySL.g:1837:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalMetaCrySL.g:1837:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalMetaCrySL.g:1838:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMetaCrySL.g:1855:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==37) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMetaCrySL.g:1856:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalMetaCrySL.g:1856:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalMetaCrySL.g:1857:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalMetaCrySL.g:1880:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalMetaCrySL.g:1880:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalMetaCrySL.g:1881:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalMetaCrySL.g:1887:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1893:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalMetaCrySL.g:1894:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalMetaCrySL.g:1894:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalMetaCrySL.g:1895:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalMetaCrySL.g:1899:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:1900:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:1900:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:1901:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalMetaCrySL.g:1922:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalMetaCrySL.g:1922:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalMetaCrySL.g:1923:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalMetaCrySL.g:1929:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1935:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalMetaCrySL.g:1936:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalMetaCrySL.g:1936:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalMetaCrySL.g:1937:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalMetaCrySL.g:1941:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:1942:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:1942:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:1943:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalMetaCrySL.g:1964:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalMetaCrySL.g:1964:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalMetaCrySL.g:1965:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalMetaCrySL.g:1971:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:1977:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalMetaCrySL.g:1978:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalMetaCrySL.g:1978:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalMetaCrySL.g:1979:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalMetaCrySL.g:1983:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:1984:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:1984:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:1985:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalMetaCrySL.g:2006:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalMetaCrySL.g:2006:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalMetaCrySL.g:2007:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalMetaCrySL.g:2013:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:2019:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalMetaCrySL.g:2020:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalMetaCrySL.g:2020:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalMetaCrySL.g:2021:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalMetaCrySL.g:2025:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalMetaCrySL.g:2026:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalMetaCrySL.g:2026:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalMetaCrySL.g:2027:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMetaCrySL.g:2048:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMetaCrySL.g:2048:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMetaCrySL.g:2049:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMetaCrySL.g:2055:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:2061:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalMetaCrySL.g:2062:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalMetaCrySL.g:2062:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalMetaCrySL.g:2063:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMetaCrySL.g:2073:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalMetaCrySL.g:2074:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMetaCrySL.g:2094:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMetaCrySL.g:2094:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMetaCrySL.g:2095:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMetaCrySL.g:2101:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:2107:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalMetaCrySL.g:2108:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalMetaCrySL.g:2108:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalMetaCrySL.g:2109:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalMetaCrySL.g:2133:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalMetaCrySL.g:2133:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalMetaCrySL.g:2134:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalMetaCrySL.g:2140:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMetaCrySL.g:2146:2: (this_ID_0= RULE_ID )
            // InternalMetaCrySL.g:2147:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalMetaCrySL.g:2157:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalMetaCrySL.g:2157:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalMetaCrySL.g:2158:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalMetaCrySL.g:2164:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:2170:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalMetaCrySL.g:2171:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalMetaCrySL.g:2171:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalMetaCrySL.g:2172:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalMetaCrySL.g:2176:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalMetaCrySL.g:2177:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalMetaCrySL.g:2177:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalMetaCrySL.g:2178:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalMetaCrySL.g:2178:5: ( (lv_static_1_0= 'static' ) )
                    // InternalMetaCrySL.g:2179:6: (lv_static_1_0= 'static' )
                    {
                    // InternalMetaCrySL.g:2179:6: (lv_static_1_0= 'static' )
                    // InternalMetaCrySL.g:2180:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,40,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", lv_static_1_0 != null, "static");
                      						
                    }

                    }


                    }

                    // InternalMetaCrySL.g:2192:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==41) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMetaCrySL.g:2193:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalMetaCrySL.g:2193:6: (lv_extension_2_0= 'extension' )
                            // InternalMetaCrySL.g:2194:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,41,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", lv_extension_2_0 != null, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalMetaCrySL.g:2206:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalMetaCrySL.g:2207:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalMetaCrySL.g:2207:6: ( ruleQualifiedNameInStaticImport )
                    // InternalMetaCrySL.g:2208:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_44);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalMetaCrySL.g:2225:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==24) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_ID) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMetaCrySL.g:2226:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalMetaCrySL.g:2226:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalMetaCrySL.g:2227:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalMetaCrySL.g:2227:7: (lv_wildcard_4_0= '*' )
                            // InternalMetaCrySL.g:2228:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,24,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", lv_wildcard_4_0 != null, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMetaCrySL.g:2241:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalMetaCrySL.g:2241:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalMetaCrySL.g:2242:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalMetaCrySL.g:2242:7: (lv_memberName_5_0= ruleValidID )
                            // InternalMetaCrySL.g:2243:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_45);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMetaCrySL.g:2263:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalMetaCrySL.g:2263:4: ( ( ruleQualifiedName ) )
                    // InternalMetaCrySL.g:2264:5: ( ruleQualifiedName )
                    {
                    // InternalMetaCrySL.g:2264:5: ( ruleQualifiedName )
                    // InternalMetaCrySL.g:2265:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMetaCrySL.g:2283:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalMetaCrySL.g:2283:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalMetaCrySL.g:2284:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalMetaCrySL.g:2284:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalMetaCrySL.g:2285:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMetaCrySL.g:2303:3: (otherlv_8= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMetaCrySL.g:2304:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalMetaCrySL.g:2313:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalMetaCrySL.g:2313:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalMetaCrySL.g:2314:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalMetaCrySL.g:2320:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalMetaCrySL.g:2326:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalMetaCrySL.g:2327:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalMetaCrySL.g:2327:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    int LA37_2 = input.LA(2);

                    if ( (LA37_2==35) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalMetaCrySL.g:2328:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_41);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred13_InternalMetaCrySL
    public final void synpred13_InternalMetaCrySL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;


        // InternalMetaCrySL.g:819:3: ( ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' ) )
        // InternalMetaCrySL.g:819:3: ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' )
        {
        // InternalMetaCrySL.g:819:3: ( () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?' )
        // InternalMetaCrySL.g:820:4: () ( (lv_exp_1_0= ruleChoiceExp ) ) otherlv_2= '?'
        {
        // InternalMetaCrySL.g:820:4: ()
        // InternalMetaCrySL.g:821:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMetaCrySL.g:830:4: ( (lv_exp_1_0= ruleChoiceExp ) )
        // InternalMetaCrySL.g:831:5: (lv_exp_1_0= ruleChoiceExp )
        {
        // InternalMetaCrySL.g:831:5: (lv_exp_1_0= ruleChoiceExp )
        // InternalMetaCrySL.g:832:6: lv_exp_1_0= ruleChoiceExp
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_22);
        lv_exp_1_0=ruleChoiceExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,23,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalMetaCrySL

    // $ANTLR start synpred14_InternalMetaCrySL
    public final void synpred14_InternalMetaCrySL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;


        // InternalMetaCrySL.g:855:3: ( ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' ) )
        // InternalMetaCrySL.g:855:3: ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' )
        {
        // InternalMetaCrySL.g:855:3: ( () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*' )
        // InternalMetaCrySL.g:856:4: () ( (lv_exp_4_0= ruleChoiceExp ) ) otherlv_5= '*'
        {
        // InternalMetaCrySL.g:856:4: ()
        // InternalMetaCrySL.g:857:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMetaCrySL.g:866:4: ( (lv_exp_4_0= ruleChoiceExp ) )
        // InternalMetaCrySL.g:867:5: (lv_exp_4_0= ruleChoiceExp )
        {
        // InternalMetaCrySL.g:867:5: (lv_exp_4_0= ruleChoiceExp )
        // InternalMetaCrySL.g:868:6: lv_exp_4_0= ruleChoiceExp
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_23);
        lv_exp_4_0=ruleChoiceExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalMetaCrySL

    // $ANTLR start synpred15_InternalMetaCrySL
    public final void synpred15_InternalMetaCrySL_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        EObject lv_exp_7_0 = null;


        // InternalMetaCrySL.g:891:3: ( ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' ) )
        // InternalMetaCrySL.g:891:3: ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' )
        {
        // InternalMetaCrySL.g:891:3: ( () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+' )
        // InternalMetaCrySL.g:892:4: () ( (lv_exp_7_0= ruleChoiceExp ) ) otherlv_8= '+'
        {
        // InternalMetaCrySL.g:892:4: ()
        // InternalMetaCrySL.g:893:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMetaCrySL.g:902:4: ( (lv_exp_7_0= ruleChoiceExp ) )
        // InternalMetaCrySL.g:903:5: (lv_exp_7_0= ruleChoiceExp )
        {
        // InternalMetaCrySL.g:903:5: (lv_exp_7_0= ruleChoiceExp )
        // InternalMetaCrySL.g:904:6: lv_exp_7_0= ruleChoiceExp
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_24);
        lv_exp_7_0=ruleChoiceExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalMetaCrySL

    // $ANTLR start synpred16_InternalMetaCrySL
    public final void synpred16_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:989:4: ( ( () '|' ( ( ruleSequenceExp ) ) ) )
        // InternalMetaCrySL.g:989:5: ( () '|' ( ( ruleSequenceExp ) ) )
        {
        // InternalMetaCrySL.g:989:5: ( () '|' ( ( ruleSequenceExp ) ) )
        // InternalMetaCrySL.g:990:5: () '|' ( ( ruleSequenceExp ) )
        {
        // InternalMetaCrySL.g:990:5: ()
        // InternalMetaCrySL.g:991:5: 
        {
        }

        match(input,18,FOLLOW_21); if (state.failed) return ;
        // InternalMetaCrySL.g:993:5: ( ( ruleSequenceExp ) )
        // InternalMetaCrySL.g:994:6: ( ruleSequenceExp )
        {
        // InternalMetaCrySL.g:994:6: ( ruleSequenceExp )
        // InternalMetaCrySL.g:995:7: ruleSequenceExp
        {
        pushFollow(FOLLOW_2);
        ruleSequenceExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalMetaCrySL

    // $ANTLR start synpred17_InternalMetaCrySL
    public final void synpred17_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:1067:4: ( ( () ',' ( ( rulePrimaryExp ) ) ) )
        // InternalMetaCrySL.g:1067:5: ( () ',' ( ( rulePrimaryExp ) ) )
        {
        // InternalMetaCrySL.g:1067:5: ( () ',' ( ( rulePrimaryExp ) ) )
        // InternalMetaCrySL.g:1068:5: () ',' ( ( rulePrimaryExp ) )
        {
        // InternalMetaCrySL.g:1068:5: ()
        // InternalMetaCrySL.g:1069:5: 
        {
        }

        match(input,21,FOLLOW_21); if (state.failed) return ;
        // InternalMetaCrySL.g:1071:5: ( ( rulePrimaryExp ) )
        // InternalMetaCrySL.g:1072:6: ( rulePrimaryExp )
        {
        // InternalMetaCrySL.g:1072:6: ( rulePrimaryExp )
        // InternalMetaCrySL.g:1073:7: rulePrimaryExp
        {
        pushFollow(FOLLOW_2);
        rulePrimaryExp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalMetaCrySL

    // $ANTLR start synpred20_InternalMetaCrySL
    public final void synpred20_InternalMetaCrySL_fragment() throws RecognitionException {   
        // InternalMetaCrySL.g:1352:5: ( ( () ruleArrayBrackets ) )
        // InternalMetaCrySL.g:1352:6: ( () ruleArrayBrackets )
        {
        // InternalMetaCrySL.g:1352:6: ( () ruleArrayBrackets )
        // InternalMetaCrySL.g:1353:6: () ruleArrayBrackets
        {
        // InternalMetaCrySL.g:1353:6: ()
        // InternalMetaCrySL.g:1354:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalMetaCrySL

    // Delegated rules

    public final boolean synpred14_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMetaCrySL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMetaCrySL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\16\1\4\1\uffff\1\16\1\uffff";
    static final String dfa_4s = "\1\50\1\uffff\1\43\1\30\1\uffff\1\43\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\43\uffff\1\1",
            "",
            "\1\4\24\uffff\1\3",
            "\1\5\23\uffff\1\6",
            "",
            "\1\4\24\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2176:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004409002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004408002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100080012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100180010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100880010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000004002L});

}