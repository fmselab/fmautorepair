package fmautorepair.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fmautorepair.services.KconfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKconfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_KCONFIG_HELP", "RULE_STRING", "RULE_HEX_TERMINAL", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'choice'", "'endchoice'", "'source'", "'.Kconfig'", "'config'", "'string'", "'bool'", "'tristate'", "'int'", "'hex'", "'if'", "'def_bool'", "'def_tristate'", "'depends on'", "'select'", "'default'", "'n'", "'m'", "'y'", "'prompt'", "'range'", "'='", "'!='", "'&&'", "'||'", "'!'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_KCONFIG_HELP=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_HEX_TERMINAL=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKconfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKconfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKconfigParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKconfig.g"; }



     	private KconfigGrammarAccess grammarAccess;

        public InternalKconfigParser(TokenStream input, KconfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected KconfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalKconfig.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalKconfig.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalKconfig.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKconfig.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_Choices_0_0= ruleChoice ) ) | ( (lv_Sources_1_0= ruleImport ) ) | ( (lv_configs_2_0= ruleConfig ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Choices_0_0 = null;

        EObject lv_Sources_1_0 = null;

        EObject lv_configs_2_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:77:2: ( ( ( (lv_Choices_0_0= ruleChoice ) ) | ( (lv_Sources_1_0= ruleImport ) ) | ( (lv_configs_2_0= ruleConfig ) ) )* )
            // InternalKconfig.g:78:2: ( ( (lv_Choices_0_0= ruleChoice ) ) | ( (lv_Sources_1_0= ruleImport ) ) | ( (lv_configs_2_0= ruleConfig ) ) )*
            {
            // InternalKconfig.g:78:2: ( ( (lv_Choices_0_0= ruleChoice ) ) | ( (lv_Sources_1_0= ruleImport ) ) | ( (lv_configs_2_0= ruleConfig ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 15:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalKconfig.g:79:3: ( (lv_Choices_0_0= ruleChoice ) )
            	    {
            	    // InternalKconfig.g:79:3: ( (lv_Choices_0_0= ruleChoice ) )
            	    // InternalKconfig.g:80:4: (lv_Choices_0_0= ruleChoice )
            	    {
            	    // InternalKconfig.g:80:4: (lv_Choices_0_0= ruleChoice )
            	    // InternalKconfig.g:81:5: lv_Choices_0_0= ruleChoice
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getChoicesChoiceParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Choices_0_0=ruleChoice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Choices",
            	    						lv_Choices_0_0,
            	    						"fmautorepair.Kconfig.Choice");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKconfig.g:99:3: ( (lv_Sources_1_0= ruleImport ) )
            	    {
            	    // InternalKconfig.g:99:3: ( (lv_Sources_1_0= ruleImport ) )
            	    // InternalKconfig.g:100:4: (lv_Sources_1_0= ruleImport )
            	    {
            	    // InternalKconfig.g:100:4: (lv_Sources_1_0= ruleImport )
            	    // InternalKconfig.g:101:5: lv_Sources_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSourcesImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Sources_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Sources",
            	    						lv_Sources_1_0,
            	    						"fmautorepair.Kconfig.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKconfig.g:119:3: ( (lv_configs_2_0= ruleConfig ) )
            	    {
            	    // InternalKconfig.g:119:3: ( (lv_configs_2_0= ruleConfig ) )
            	    // InternalKconfig.g:120:4: (lv_configs_2_0= ruleConfig )
            	    {
            	    // InternalKconfig.g:120:4: (lv_configs_2_0= ruleConfig )
            	    // InternalKconfig.g:121:5: lv_configs_2_0= ruleConfig
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConfigsConfigParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_configs_2_0=ruleConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_2_0,
            	    						"fmautorepair.Kconfig.Config");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleChoice"
    // InternalKconfig.g:142:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalKconfig.g:142:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalKconfig.g:143:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalKconfig.g:149:1: ruleChoice returns [EObject current=null] : ( ( (lv_Choice_0_0= 'choice' ) ) ( (lv_configs_1_0= ruleConfig ) )+ otherlv_2= 'endchoice' ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_Choice_0_0=null;
        Token otherlv_2=null;
        EObject lv_configs_1_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:155:2: ( ( ( (lv_Choice_0_0= 'choice' ) ) ( (lv_configs_1_0= ruleConfig ) )+ otherlv_2= 'endchoice' ) )
            // InternalKconfig.g:156:2: ( ( (lv_Choice_0_0= 'choice' ) ) ( (lv_configs_1_0= ruleConfig ) )+ otherlv_2= 'endchoice' )
            {
            // InternalKconfig.g:156:2: ( ( (lv_Choice_0_0= 'choice' ) ) ( (lv_configs_1_0= ruleConfig ) )+ otherlv_2= 'endchoice' )
            // InternalKconfig.g:157:3: ( (lv_Choice_0_0= 'choice' ) ) ( (lv_configs_1_0= ruleConfig ) )+ otherlv_2= 'endchoice'
            {
            // InternalKconfig.g:157:3: ( (lv_Choice_0_0= 'choice' ) )
            // InternalKconfig.g:158:4: (lv_Choice_0_0= 'choice' )
            {
            // InternalKconfig.g:158:4: (lv_Choice_0_0= 'choice' )
            // InternalKconfig.g:159:5: lv_Choice_0_0= 'choice'
            {
            lv_Choice_0_0=(Token)match(input,13,FOLLOW_4); 

            					newLeafNode(lv_Choice_0_0, grammarAccess.getChoiceAccess().getChoiceChoiceKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            					setWithLastConsumed(current, "Choice", lv_Choice_0_0, "choice");
            				

            }


            }

            // InternalKconfig.g:171:3: ( (lv_configs_1_0= ruleConfig ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKconfig.g:172:4: (lv_configs_1_0= ruleConfig )
            	    {
            	    // InternalKconfig.g:172:4: (lv_configs_1_0= ruleConfig )
            	    // InternalKconfig.g:173:5: lv_configs_1_0= ruleConfig
            	    {

            	    					newCompositeNode(grammarAccess.getChoiceAccess().getConfigsConfigParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_configs_1_0=ruleConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_1_0,
            	    						"fmautorepair.Kconfig.Config");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getChoiceAccess().getEndchoiceKeyword_2());
            		

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleImport"
    // InternalKconfig.g:198:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalKconfig.g:198:47: (iv_ruleImport= ruleImport EOF )
            // InternalKconfig.g:199:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalKconfig.g:205:1: ruleImport returns [EObject current=null] : (otherlv_0= 'source' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:211:2: ( (otherlv_0= 'source' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) ) )
            // InternalKconfig.g:212:2: (otherlv_0= 'source' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            {
            // InternalKconfig.g:212:2: (otherlv_0= 'source' ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) )
            // InternalKconfig.g:213:3: otherlv_0= 'source' ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getSourceKeyword_0());
            		
            // InternalKconfig.g:217:3: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // InternalKconfig.g:218:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // InternalKconfig.g:218:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            // InternalKconfig.g:219:5: lv_importedNamespace_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					add(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"fmautorepair.Kconfig.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKconfig.g:240:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalKconfig.g:240:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalKconfig.g:241:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalKconfig.g:247:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.Kconfig' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKconfig.g:253:2: ( (this_ID_0= RULE_ID kw= '.Kconfig' ) )
            // InternalKconfig.g:254:2: (this_ID_0= RULE_ID kw= '.Kconfig' )
            {
            // InternalKconfig.g:254:2: (this_ID_0= RULE_ID kw= '.Kconfig' )
            // InternalKconfig.g:255:3: this_ID_0= RULE_ID kw= '.Kconfig'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,16,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getKconfigKeyword_1());
            		

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleConfig"
    // InternalKconfig.g:271:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalKconfig.g:271:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalKconfig.g:272:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalKconfig.g:278:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) ) (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )? ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_KCONFIG_HELP_9=null;
        EObject lv_type_3_0 = null;

        EObject lv_prompts_4_0 = null;

        EObject lv_ranges_5_0 = null;

        EObject lv_dependencies_6_0 = null;

        EObject lv_selects_7_0 = null;

        EObject lv_defaults_8_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:284:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) ) (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )? ) )
            // InternalKconfig.g:285:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) ) (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )? )
            {
            // InternalKconfig.g:285:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) ) (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )? )
            // InternalKconfig.g:286:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) ) (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            // InternalKconfig.g:290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKconfig.g:291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKconfig.g:291:4: (lv_name_1_0= RULE_ID )
            // InternalKconfig.g:292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"fmautorepair.Kconfig.ID");
            				

            }


            }

            // InternalKconfig.g:308:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) ) )
            // InternalKconfig.g:309:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) )
            {
            // InternalKconfig.g:309:4: ( ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?) )
            // InternalKconfig.g:310:5: ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            				
            // InternalKconfig.g:313:5: ( ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?)
            // InternalKconfig.g:314:6: ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+ {...}?
            {
            // InternalKconfig.g:314:6: ( ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=7;
                int LA7_0 = input.LA(1);

                if ( ( LA7_0 >= 18 && LA7_0 <= 22 || LA7_0 >= 24 && LA7_0 <= 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                    alt7=6;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKconfig.g:315:4: ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) )
            	    {
            	    // InternalKconfig.g:315:4: ({...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) ) )
            	    // InternalKconfig.g:316:5: {...}? => ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalKconfig.g:316:103: ( ({...}? => ( (lv_type_3_0= ruleType ) ) ) )
            	    // InternalKconfig.g:317:6: ({...}? => ( (lv_type_3_0= ruleType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalKconfig.g:320:9: ({...}? => ( (lv_type_3_0= ruleType ) ) )
            	    // InternalKconfig.g:320:10: {...}? => ( (lv_type_3_0= ruleType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalKconfig.g:320:19: ( (lv_type_3_0= ruleType ) )
            	    // InternalKconfig.g:320:20: (lv_type_3_0= ruleType )
            	    {
            	    // InternalKconfig.g:320:20: (lv_type_3_0= ruleType )
            	    // InternalKconfig.g:321:10: lv_type_3_0= ruleType
            	    {

            	    										newCompositeNode(grammarAccess.getConfigAccess().getTypeTypeParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_type_3_0=ruleType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_3_0,
            	    											"fmautorepair.Kconfig.Type");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKconfig.g:343:4: ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) )
            	    {
            	    // InternalKconfig.g:343:4: ({...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) ) )
            	    // InternalKconfig.g:344:5: {...}? => ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalKconfig.g:344:103: ( ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) ) )
            	    // InternalKconfig.g:345:6: ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalKconfig.g:348:9: ({...}? => ( (lv_prompts_4_0= rulePrompt ) ) )
            	    // InternalKconfig.g:348:10: {...}? => ( (lv_prompts_4_0= rulePrompt ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    }
            	    // InternalKconfig.g:348:19: ( (lv_prompts_4_0= rulePrompt ) )
            	    // InternalKconfig.g:348:20: (lv_prompts_4_0= rulePrompt )
            	    {
            	    // InternalKconfig.g:348:20: (lv_prompts_4_0= rulePrompt )
            	    // InternalKconfig.g:349:10: lv_prompts_4_0= rulePrompt
            	    {

            	    										newCompositeNode(grammarAccess.getConfigAccess().getPromptsPromptParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_prompts_4_0=rulePrompt();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    										}
            	    										add(
            	    											current,
            	    											"prompts",
            	    											lv_prompts_4_0,
            	    											"fmautorepair.Kconfig.Prompt");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKconfig.g:371:4: ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) )
            	    {
            	    // InternalKconfig.g:371:4: ({...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ ) )
            	    // InternalKconfig.g:372:5: {...}? => ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalKconfig.g:372:103: ( ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+ )
            	    // InternalKconfig.g:373:6: ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalKconfig.g:376:9: ({...}? => ( (lv_ranges_5_0= ruleRange ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==33) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalKconfig.g:376:10: {...}? => ( (lv_ranges_5_0= ruleRange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    	    }
            	    	    // InternalKconfig.g:376:19: ( (lv_ranges_5_0= ruleRange ) )
            	    	    // InternalKconfig.g:376:20: (lv_ranges_5_0= ruleRange )
            	    	    {
            	    	    // InternalKconfig.g:376:20: (lv_ranges_5_0= ruleRange )
            	    	    // InternalKconfig.g:377:10: lv_ranges_5_0= ruleRange
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getConfigAccess().getRangesRangeParserRuleCall_2_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_ranges_5_0=ruleRange();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"ranges",
            	    	    											lv_ranges_5_0,
            	    	    											"fmautorepair.Kconfig.Range");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalKconfig.g:399:4: ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) )
            	    {
            	    // InternalKconfig.g:399:4: ({...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ ) )
            	    // InternalKconfig.g:400:5: {...}? => ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalKconfig.g:400:103: ( ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+ )
            	    // InternalKconfig.g:401:6: ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalKconfig.g:404:9: ({...}? => ( (lv_dependencies_6_0= ruleDependency ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==26) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalKconfig.g:404:10: {...}? => ( (lv_dependencies_6_0= ruleDependency ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    	    }
            	    	    // InternalKconfig.g:404:19: ( (lv_dependencies_6_0= ruleDependency ) )
            	    	    // InternalKconfig.g:404:20: (lv_dependencies_6_0= ruleDependency )
            	    	    {
            	    	    // InternalKconfig.g:404:20: (lv_dependencies_6_0= ruleDependency )
            	    	    // InternalKconfig.g:405:10: lv_dependencies_6_0= ruleDependency
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getConfigAccess().getDependenciesDependencyParserRuleCall_2_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_dependencies_6_0=ruleDependency();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"dependencies",
            	    	    											lv_dependencies_6_0,
            	    	    											"fmautorepair.Kconfig.Dependency");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalKconfig.g:427:4: ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) )
            	    {
            	    // InternalKconfig.g:427:4: ({...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ ) )
            	    // InternalKconfig.g:428:5: {...}? => ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalKconfig.g:428:103: ( ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+ )
            	    // InternalKconfig.g:429:6: ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalKconfig.g:432:9: ({...}? => ( (lv_selects_7_0= ruleSelect ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==27) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalKconfig.g:432:10: {...}? => ( (lv_selects_7_0= ruleSelect ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    	    }
            	    	    // InternalKconfig.g:432:19: ( (lv_selects_7_0= ruleSelect ) )
            	    	    // InternalKconfig.g:432:20: (lv_selects_7_0= ruleSelect )
            	    	    {
            	    	    // InternalKconfig.g:432:20: (lv_selects_7_0= ruleSelect )
            	    	    // InternalKconfig.g:433:10: lv_selects_7_0= ruleSelect
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getConfigAccess().getSelectsSelectParserRuleCall_2_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_selects_7_0=ruleSelect();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"selects",
            	    	    											lv_selects_7_0,
            	    	    											"fmautorepair.Kconfig.Select");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalKconfig.g:455:4: ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) )
            	    {
            	    // InternalKconfig.g:455:4: ({...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ ) )
            	    // InternalKconfig.g:456:5: {...}? => ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalKconfig.g:456:103: ( ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+ )
            	    // InternalKconfig.g:457:6: ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalKconfig.g:460:9: ({...}? => ( (lv_defaults_8_0= ruleDefault ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==28) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalKconfig.g:460:10: {...}? => ( (lv_defaults_8_0= ruleDefault ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleConfig", "true");
            	    	    }
            	    	    // InternalKconfig.g:460:19: ( (lv_defaults_8_0= ruleDefault ) )
            	    	    // InternalKconfig.g:460:20: (lv_defaults_8_0= ruleDefault )
            	    	    {
            	    	    // InternalKconfig.g:460:20: (lv_defaults_8_0= ruleDefault )
            	    	    // InternalKconfig.g:461:10: lv_defaults_8_0= ruleDefault
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getConfigAccess().getDefaultsDefaultParserRuleCall_2_5_0());
            	    	    									
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_defaults_8_0=ruleDefault();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getConfigRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"defaults",
            	    	    											lv_defaults_8_0,
            	    	    											"fmautorepair.Kconfig.Default");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            				

            }

            // InternalKconfig.g:491:3: (this_KCONFIG_HELP_9= RULE_KCONFIG_HELP )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_KCONFIG_HELP) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKconfig.g:492:4: this_KCONFIG_HELP_9= RULE_KCONFIG_HELP
                    {
                    this_KCONFIG_HELP_9=(Token)match(input,RULE_KCONFIG_HELP,FOLLOW_2); 

                    				newLeafNode(this_KCONFIG_HELP_9, grammarAccess.getConfigAccess().getKCONFIG_HELPTerminalRuleCall_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleType"
    // InternalKconfig.g:501:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalKconfig.g:501:45: (iv_ruleType= ruleType EOF )
            // InternalKconfig.g:502:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKconfig.g:508:1: ruleType returns [EObject current=null] : ( ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? ) | ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? ) | ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_tprompt_1_0=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token lv_tprompt_3_0=null;
        Token otherlv_4=null;
        Token lv_type_6_1=null;
        Token lv_type_6_2=null;
        Token otherlv_8=null;
        EObject lv_KconfigExpr_5_0 = null;

        EObject lv_def_7_0 = null;

        EObject lv_KconfigExpr_9_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:514:2: ( ( ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? ) | ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? ) | ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? ) ) )
            // InternalKconfig.g:515:2: ( ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? ) | ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? ) | ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? ) )
            {
            // InternalKconfig.g:515:2: ( ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? ) | ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? ) | ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt15=2;
                }
                break;
            case 24:
            case 25:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKconfig.g:516:3: ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? )
                    {
                    // InternalKconfig.g:516:3: ( ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )? )
                    // InternalKconfig.g:517:4: ( (lv_type_0_0= 'string' ) ) ( (lv_tprompt_1_0= RULE_STRING ) )?
                    {
                    // InternalKconfig.g:517:4: ( (lv_type_0_0= 'string' ) )
                    // InternalKconfig.g:518:5: (lv_type_0_0= 'string' )
                    {
                    // InternalKconfig.g:518:5: (lv_type_0_0= 'string' )
                    // InternalKconfig.g:519:6: lv_type_0_0= 'string'
                    {
                    lv_type_0_0=(Token)match(input,18,FOLLOW_9); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "string");
                    					

                    }


                    }

                    // InternalKconfig.g:531:4: ( (lv_tprompt_1_0= RULE_STRING ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKconfig.g:532:5: (lv_tprompt_1_0= RULE_STRING )
                            {
                            // InternalKconfig.g:532:5: (lv_tprompt_1_0= RULE_STRING )
                            // InternalKconfig.g:533:6: lv_tprompt_1_0= RULE_STRING
                            {
                            lv_tprompt_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            						newLeafNode(lv_tprompt_1_0, grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"tprompt",
                            							lv_tprompt_1_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:551:3: ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? )
                    {
                    // InternalKconfig.g:551:3: ( ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )? )
                    // InternalKconfig.g:552:4: ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) ) ( (lv_tprompt_3_0= RULE_STRING ) )? (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )?
                    {
                    // InternalKconfig.g:552:4: ( ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) ) )
                    // InternalKconfig.g:553:5: ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) )
                    {
                    // InternalKconfig.g:553:5: ( (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' ) )
                    // InternalKconfig.g:554:6: (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' )
                    {
                    // InternalKconfig.g:554:6: (lv_type_2_1= 'bool' | lv_type_2_2= 'tristate' | lv_type_2_3= 'int' | lv_type_2_4= 'hex' )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt10=1;
                        }
                        break;
                    case 20:
                        {
                        alt10=2;
                        }
                        break;
                    case 21:
                        {
                        alt10=3;
                        }
                        break;
                    case 22:
                        {
                        alt10=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalKconfig.g:555:7: lv_type_2_1= 'bool'
                            {
                            lv_type_2_1=(Token)match(input,19,FOLLOW_10); 

                            							newLeafNode(lv_type_2_1, grammarAccess.getTypeAccess().getTypeBoolKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalKconfig.g:566:7: lv_type_2_2= 'tristate'
                            {
                            lv_type_2_2=(Token)match(input,20,FOLLOW_10); 

                            							newLeafNode(lv_type_2_2, grammarAccess.getTypeAccess().getTypeTristateKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalKconfig.g:577:7: lv_type_2_3= 'int'
                            {
                            lv_type_2_3=(Token)match(input,21,FOLLOW_10); 

                            							newLeafNode(lv_type_2_3, grammarAccess.getTypeAccess().getTypeIntKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalKconfig.g:588:7: lv_type_2_4= 'hex'
                            {
                            lv_type_2_4=(Token)match(input,22,FOLLOW_10); 

                            							newLeafNode(lv_type_2_4, grammarAccess.getTypeAccess().getTypeHexKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalKconfig.g:601:4: ( (lv_tprompt_3_0= RULE_STRING ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_STRING) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKconfig.g:602:5: (lv_tprompt_3_0= RULE_STRING )
                            {
                            // InternalKconfig.g:602:5: (lv_tprompt_3_0= RULE_STRING )
                            // InternalKconfig.g:603:6: lv_tprompt_3_0= RULE_STRING
                            {
                            lv_tprompt_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                            						newLeafNode(lv_tprompt_3_0, grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"tprompt",
                            							lv_tprompt_3_0,
                            							"org.eclipse.xtext.common.Terminals.STRING");
                            					

                            }


                            }
                            break;

                    }

                    // InternalKconfig.g:619:4: (otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalKconfig.g:620:5: otherlv_4= 'if' ( (lv_KconfigExpr_5_0= ruleExpr ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getIfKeyword_1_2_0());
                            				
                            // InternalKconfig.g:624:5: ( (lv_KconfigExpr_5_0= ruleExpr ) )
                            // InternalKconfig.g:625:6: (lv_KconfigExpr_5_0= ruleExpr )
                            {
                            // InternalKconfig.g:625:6: (lv_KconfigExpr_5_0= ruleExpr )
                            // InternalKconfig.g:626:7: lv_KconfigExpr_5_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_KconfigExpr_5_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeRule());
                            							}
                            							set(
                            								current,
                            								"KconfigExpr",
                            								lv_KconfigExpr_5_0,
                            								"fmautorepair.Kconfig.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:646:3: ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? )
                    {
                    // InternalKconfig.g:646:3: ( ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )? )
                    // InternalKconfig.g:647:4: ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) ) ( (lv_def_7_0= ruleExpr ) ) (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )?
                    {
                    // InternalKconfig.g:647:4: ( ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) ) )
                    // InternalKconfig.g:648:5: ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) )
                    {
                    // InternalKconfig.g:648:5: ( (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' ) )
                    // InternalKconfig.g:649:6: (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' )
                    {
                    // InternalKconfig.g:649:6: (lv_type_6_1= 'def_bool' | lv_type_6_2= 'def_tristate' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==25) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalKconfig.g:650:7: lv_type_6_1= 'def_bool'
                            {
                            lv_type_6_1=(Token)match(input,24,FOLLOW_12); 

                            							newLeafNode(lv_type_6_1, grammarAccess.getTypeAccess().getTypeDef_boolKeyword_2_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_6_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalKconfig.g:661:7: lv_type_6_2= 'def_tristate'
                            {
                            lv_type_6_2=(Token)match(input,25,FOLLOW_12); 

                            							newLeafNode(lv_type_6_2, grammarAccess.getTypeAccess().getTypeDef_tristateKeyword_2_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTypeRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_6_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalKconfig.g:674:4: ( (lv_def_7_0= ruleExpr ) )
                    // InternalKconfig.g:675:5: (lv_def_7_0= ruleExpr )
                    {
                    // InternalKconfig.g:675:5: (lv_def_7_0= ruleExpr )
                    // InternalKconfig.g:676:6: lv_def_7_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getDefExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_def_7_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"def",
                    							lv_def_7_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKconfig.g:693:4: (otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalKconfig.g:694:5: otherlv_8= 'if' ( (lv_KconfigExpr_9_0= ruleExpr ) )
                            {
                            otherlv_8=(Token)match(input,23,FOLLOW_12); 

                            					newLeafNode(otherlv_8, grammarAccess.getTypeAccess().getIfKeyword_2_2_0());
                            				
                            // InternalKconfig.g:698:5: ( (lv_KconfigExpr_9_0= ruleExpr ) )
                            // InternalKconfig.g:699:6: (lv_KconfigExpr_9_0= ruleExpr )
                            {
                            // InternalKconfig.g:699:6: (lv_KconfigExpr_9_0= ruleExpr )
                            // InternalKconfig.g:700:7: lv_KconfigExpr_9_0= ruleExpr
                            {

                            							newCompositeNode(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_KconfigExpr_9_0=ruleExpr();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeRule());
                            							}
                            							set(
                            								current,
                            								"KconfigExpr",
                            								lv_KconfigExpr_9_0,
                            								"fmautorepair.Kconfig.Expr");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDependency"
    // InternalKconfig.g:723:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalKconfig.g:723:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalKconfig.g:724:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalKconfig.g:730:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'depends on' ( (lv_deps_1_0= ruleExpr ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_deps_1_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:736:2: ( (otherlv_0= 'depends on' ( (lv_deps_1_0= ruleExpr ) ) ) )
            // InternalKconfig.g:737:2: (otherlv_0= 'depends on' ( (lv_deps_1_0= ruleExpr ) ) )
            {
            // InternalKconfig.g:737:2: (otherlv_0= 'depends on' ( (lv_deps_1_0= ruleExpr ) ) )
            // InternalKconfig.g:738:3: otherlv_0= 'depends on' ( (lv_deps_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependsOnKeyword_0());
            		
            // InternalKconfig.g:742:3: ( (lv_deps_1_0= ruleExpr ) )
            // InternalKconfig.g:743:4: (lv_deps_1_0= ruleExpr )
            {
            // InternalKconfig.g:743:4: (lv_deps_1_0= ruleExpr )
            // InternalKconfig.g:744:5: lv_deps_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getDependencyAccess().getDepsExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_deps_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDependencyRule());
            					}
            					set(
            						current,
            						"deps",
            						lv_deps_1_0,
            						"fmautorepair.Kconfig.Expr");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleSelect"
    // InternalKconfig.g:765:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalKconfig.g:765:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalKconfig.g:766:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalKconfig.g:772:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_Expr_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:778:2: ( (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )? ) )
            // InternalKconfig.g:779:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )? )
            {
            // InternalKconfig.g:779:2: (otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )? )
            // InternalKconfig.g:780:3: otherlv_0= 'select' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalKconfig.g:784:3: ( (otherlv_1= RULE_ID ) )
            // InternalKconfig.g:785:4: (otherlv_1= RULE_ID )
            {
            // InternalKconfig.g:785:4: (otherlv_1= RULE_ID )
            // InternalKconfig.g:786:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getSelectConfigCrossReference_1_0());
            				

            }


            }

            // InternalKconfig.g:797:3: (otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKconfig.g:798:4: otherlv_2= 'if' ( (lv_Expr_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getIfKeyword_2_0());
                    			
                    // InternalKconfig.g:802:4: ( (lv_Expr_3_0= ruleExpr ) )
                    // InternalKconfig.g:803:5: (lv_Expr_3_0= ruleExpr )
                    {
                    // InternalKconfig.g:803:5: (lv_Expr_3_0= ruleExpr )
                    // InternalKconfig.g:804:6: lv_Expr_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Expr_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"Expr",
                    							lv_Expr_3_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDefault"
    // InternalKconfig.g:826:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalKconfig.g:826:48: (iv_ruleDefault= ruleDefault EOF )
            // InternalKconfig.g:827:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalKconfig.g:833:1: ruleDefault returns [EObject current=null] : (otherlv_0= 'default' ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) ) (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )? ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trival_2_1=null;
        Token lv_trival_2_2=null;
        Token lv_trival_2_3=null;
        Token lv_hex_3_0=null;
        Token lv_int_4_0=null;
        Token otherlv_5=null;
        EObject lv_value_1_0 = null;

        EObject lv_KconfigExpr_6_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:839:2: ( (otherlv_0= 'default' ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) ) (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )? ) )
            // InternalKconfig.g:840:2: (otherlv_0= 'default' ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) ) (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )? )
            {
            // InternalKconfig.g:840:2: (otherlv_0= 'default' ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) ) (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )? )
            // InternalKconfig.g:841:3: otherlv_0= 'default' ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) ) (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAccess().getDefaultKeyword_0());
            		
            // InternalKconfig.g:845:3: ( ( (lv_value_1_0= ruleExpr ) ) | ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) ) | ( (lv_hex_3_0= RULE_HEX_TERMINAL ) ) | ( (lv_int_4_0= RULE_INT ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case 38:
            case 39:
                {
                alt18=1;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt18=2;
                }
                break;
            case RULE_HEX_TERMINAL:
                {
                alt18=3;
                }
                break;
            case RULE_INT:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKconfig.g:846:4: ( (lv_value_1_0= ruleExpr ) )
                    {
                    // InternalKconfig.g:846:4: ( (lv_value_1_0= ruleExpr ) )
                    // InternalKconfig.g:847:5: (lv_value_1_0= ruleExpr )
                    {
                    // InternalKconfig.g:847:5: (lv_value_1_0= ruleExpr )
                    // InternalKconfig.g:848:6: lv_value_1_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDefaultAccess().getValueExprParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_1_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:866:4: ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) )
                    {
                    // InternalKconfig.g:866:4: ( ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) ) )
                    // InternalKconfig.g:867:5: ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) )
                    {
                    // InternalKconfig.g:867:5: ( (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' ) )
                    // InternalKconfig.g:868:6: (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' )
                    {
                    // InternalKconfig.g:868:6: (lv_trival_2_1= 'n' | lv_trival_2_2= 'm' | lv_trival_2_3= 'y' )
                    int alt17=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt17=1;
                        }
                        break;
                    case 30:
                        {
                        alt17=2;
                        }
                        break;
                    case 31:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // InternalKconfig.g:869:7: lv_trival_2_1= 'n'
                            {
                            lv_trival_2_1=(Token)match(input,29,FOLLOW_11); 

                            							newLeafNode(lv_trival_2_1, grammarAccess.getDefaultAccess().getTrivalNKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDefaultRule());
                            							}
                            							setWithLastConsumed(current, "trival", lv_trival_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalKconfig.g:880:7: lv_trival_2_2= 'm'
                            {
                            lv_trival_2_2=(Token)match(input,30,FOLLOW_11); 

                            							newLeafNode(lv_trival_2_2, grammarAccess.getDefaultAccess().getTrivalMKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDefaultRule());
                            							}
                            							setWithLastConsumed(current, "trival", lv_trival_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalKconfig.g:891:7: lv_trival_2_3= 'y'
                            {
                            lv_trival_2_3=(Token)match(input,31,FOLLOW_11); 

                            							newLeafNode(lv_trival_2_3, grammarAccess.getDefaultAccess().getTrivalYKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDefaultRule());
                            							}
                            							setWithLastConsumed(current, "trival", lv_trival_2_3, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:905:4: ( (lv_hex_3_0= RULE_HEX_TERMINAL ) )
                    {
                    // InternalKconfig.g:905:4: ( (lv_hex_3_0= RULE_HEX_TERMINAL ) )
                    // InternalKconfig.g:906:5: (lv_hex_3_0= RULE_HEX_TERMINAL )
                    {
                    // InternalKconfig.g:906:5: (lv_hex_3_0= RULE_HEX_TERMINAL )
                    // InternalKconfig.g:907:6: lv_hex_3_0= RULE_HEX_TERMINAL
                    {
                    lv_hex_3_0=(Token)match(input,RULE_HEX_TERMINAL,FOLLOW_11); 

                    						newLeafNode(lv_hex_3_0, grammarAccess.getDefaultAccess().getHexHEX_TERMINALTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefaultRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hex",
                    							lv_hex_3_0,
                    							"fmautorepair.Kconfig.HEX_TERMINAL");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:924:4: ( (lv_int_4_0= RULE_INT ) )
                    {
                    // InternalKconfig.g:924:4: ( (lv_int_4_0= RULE_INT ) )
                    // InternalKconfig.g:925:5: (lv_int_4_0= RULE_INT )
                    {
                    // InternalKconfig.g:925:5: (lv_int_4_0= RULE_INT )
                    // InternalKconfig.g:926:6: lv_int_4_0= RULE_INT
                    {
                    lv_int_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_int_4_0, grammarAccess.getDefaultAccess().getIntINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefaultRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"int",
                    							lv_int_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKconfig.g:943:3: (otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKconfig.g:944:4: otherlv_5= 'if' ( (lv_KconfigExpr_6_0= ruleExpr ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getDefaultAccess().getIfKeyword_2_0());
                    			
                    // InternalKconfig.g:948:4: ( (lv_KconfigExpr_6_0= ruleExpr ) )
                    // InternalKconfig.g:949:5: (lv_KconfigExpr_6_0= ruleExpr )
                    {
                    // InternalKconfig.g:949:5: (lv_KconfigExpr_6_0= ruleExpr )
                    // InternalKconfig.g:950:6: lv_KconfigExpr_6_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getDefaultAccess().getKconfigExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_KconfigExpr_6_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultRule());
                    						}
                    						set(
                    							current,
                    							"KconfigExpr",
                    							lv_KconfigExpr_6_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRulePrompt"
    // InternalKconfig.g:972:1: entryRulePrompt returns [EObject current=null] : iv_rulePrompt= rulePrompt EOF ;
    public final EObject entryRulePrompt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrompt = null;


        try {
            // InternalKconfig.g:972:47: (iv_rulePrompt= rulePrompt EOF )
            // InternalKconfig.g:973:2: iv_rulePrompt= rulePrompt EOF
            {
             newCompositeNode(grammarAccess.getPromptRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrompt=rulePrompt();

            state._fsp--;

             current =iv_rulePrompt; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrompt"


    // $ANTLR start "rulePrompt"
    // InternalKconfig.g:979:1: rulePrompt returns [EObject current=null] : (otherlv_0= 'prompt' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )? ) ;
    public final EObject rulePrompt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_KconfigExpr_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:985:2: ( (otherlv_0= 'prompt' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )? ) )
            // InternalKconfig.g:986:2: (otherlv_0= 'prompt' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )? )
            {
            // InternalKconfig.g:986:2: (otherlv_0= 'prompt' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )? )
            // InternalKconfig.g:987:3: otherlv_0= 'prompt' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPromptAccess().getPromptKeyword_0());
            		
            // InternalKconfig.g:991:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalKconfig.g:992:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalKconfig.g:992:4: (lv_value_1_0= RULE_STRING )
            // InternalKconfig.g:993:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPromptAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPromptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalKconfig.g:1009:3: (otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKconfig.g:1010:4: otherlv_2= 'if' ( (lv_KconfigExpr_3_0= ruleExpr ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getPromptAccess().getIfKeyword_2_0());
                    			
                    // InternalKconfig.g:1014:4: ( (lv_KconfigExpr_3_0= ruleExpr ) )
                    // InternalKconfig.g:1015:5: (lv_KconfigExpr_3_0= ruleExpr )
                    {
                    // InternalKconfig.g:1015:5: (lv_KconfigExpr_3_0= ruleExpr )
                    // InternalKconfig.g:1016:6: lv_KconfigExpr_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getPromptAccess().getKconfigExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_KconfigExpr_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPromptRule());
                    						}
                    						set(
                    							current,
                    							"KconfigExpr",
                    							lv_KconfigExpr_3_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePrompt"


    // $ANTLR start "entryRuleRange"
    // InternalKconfig.g:1038:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalKconfig.g:1038:46: (iv_ruleRange= ruleRange EOF )
            // InternalKconfig.g:1039:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalKconfig.g:1045:1: ruleRange returns [EObject current=null] : (otherlv_0= 'range' ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) ) (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_hfrom_5_0=null;
        Token lv_hto_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ifrom_1_0 = null;

        AntlrDatatypeRuleToken lv_ito_3_0 = null;

        EObject lv_KconfigExpr_8_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1051:2: ( (otherlv_0= 'range' ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) ) (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )? ) )
            // InternalKconfig.g:1052:2: (otherlv_0= 'range' ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) ) (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )? )
            {
            // InternalKconfig.g:1052:2: (otherlv_0= 'range' ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) ) (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )? )
            // InternalKconfig.g:1053:3: otherlv_0= 'range' ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) ) (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getRangeKeyword_0());
            		
            // InternalKconfig.g:1057:3: ( ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) ) | ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_INT||LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_HEX_TERMINAL) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalKconfig.g:1058:4: ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) )
                    {
                    // InternalKconfig.g:1058:4: ( ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) ) )
                    // InternalKconfig.g:1059:5: ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalKconfig.g:1059:5: ( ( (lv_ifrom_1_0= ruleSIGNED_INT ) ) | ( (otherlv_2= RULE_ID ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_INT||LA21_0==41) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalKconfig.g:1060:6: ( (lv_ifrom_1_0= ruleSIGNED_INT ) )
                            {
                            // InternalKconfig.g:1060:6: ( (lv_ifrom_1_0= ruleSIGNED_INT ) )
                            // InternalKconfig.g:1061:7: (lv_ifrom_1_0= ruleSIGNED_INT )
                            {
                            // InternalKconfig.g:1061:7: (lv_ifrom_1_0= ruleSIGNED_INT )
                            // InternalKconfig.g:1062:8: lv_ifrom_1_0= ruleSIGNED_INT
                            {

                            								newCompositeNode(grammarAccess.getRangeAccess().getIfromSIGNED_INTParserRuleCall_1_0_0_0_0());
                            							
                            pushFollow(FOLLOW_16);
                            lv_ifrom_1_0=ruleSIGNED_INT();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRangeRule());
                            								}
                            								set(
                            									current,
                            									"ifrom",
                            									lv_ifrom_1_0,
                            									"fmautorepair.Kconfig.SIGNED_INT");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKconfig.g:1080:6: ( (otherlv_2= RULE_ID ) )
                            {
                            // InternalKconfig.g:1080:6: ( (otherlv_2= RULE_ID ) )
                            // InternalKconfig.g:1081:7: (otherlv_2= RULE_ID )
                            {
                            // InternalKconfig.g:1081:7: (otherlv_2= RULE_ID )
                            // InternalKconfig.g:1082:8: otherlv_2= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getRangeRule());
                            								}
                            							
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

                            								newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getIconfromConfigCrossReference_1_0_0_1_0());
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalKconfig.g:1094:5: ( ( (lv_ito_3_0= ruleSIGNED_INT ) ) | ( (otherlv_4= RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT||LA22_0==41) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalKconfig.g:1095:6: ( (lv_ito_3_0= ruleSIGNED_INT ) )
                            {
                            // InternalKconfig.g:1095:6: ( (lv_ito_3_0= ruleSIGNED_INT ) )
                            // InternalKconfig.g:1096:7: (lv_ito_3_0= ruleSIGNED_INT )
                            {
                            // InternalKconfig.g:1096:7: (lv_ito_3_0= ruleSIGNED_INT )
                            // InternalKconfig.g:1097:8: lv_ito_3_0= ruleSIGNED_INT
                            {

                            								newCompositeNode(grammarAccess.getRangeAccess().getItoSIGNED_INTParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_11);
                            lv_ito_3_0=ruleSIGNED_INT();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRangeRule());
                            								}
                            								set(
                            									current,
                            									"ito",
                            									lv_ito_3_0,
                            									"fmautorepair.Kconfig.SIGNED_INT");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKconfig.g:1115:6: ( (otherlv_4= RULE_ID ) )
                            {
                            // InternalKconfig.g:1115:6: ( (otherlv_4= RULE_ID ) )
                            // InternalKconfig.g:1116:7: (otherlv_4= RULE_ID )
                            {
                            // InternalKconfig.g:1116:7: (otherlv_4= RULE_ID )
                            // InternalKconfig.g:1117:8: otherlv_4= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getRangeRule());
                            								}
                            							
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                            								newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getIconftoConfigCrossReference_1_0_1_1_0());
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:1131:4: ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) )
                    {
                    // InternalKconfig.g:1131:4: ( ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) ) )
                    // InternalKconfig.g:1132:5: ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) ) ( (lv_hto_6_0= RULE_HEX_TERMINAL ) )
                    {
                    // InternalKconfig.g:1132:5: ( (lv_hfrom_5_0= RULE_HEX_TERMINAL ) )
                    // InternalKconfig.g:1133:6: (lv_hfrom_5_0= RULE_HEX_TERMINAL )
                    {
                    // InternalKconfig.g:1133:6: (lv_hfrom_5_0= RULE_HEX_TERMINAL )
                    // InternalKconfig.g:1134:7: lv_hfrom_5_0= RULE_HEX_TERMINAL
                    {
                    lv_hfrom_5_0=(Token)match(input,RULE_HEX_TERMINAL,FOLLOW_17); 

                    							newLeafNode(lv_hfrom_5_0, grammarAccess.getRangeAccess().getHfromHEX_TERMINALTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRangeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"hfrom",
                    								lv_hfrom_5_0,
                    								"fmautorepair.Kconfig.HEX_TERMINAL");
                    						

                    }


                    }

                    // InternalKconfig.g:1150:5: ( (lv_hto_6_0= RULE_HEX_TERMINAL ) )
                    // InternalKconfig.g:1151:6: (lv_hto_6_0= RULE_HEX_TERMINAL )
                    {
                    // InternalKconfig.g:1151:6: (lv_hto_6_0= RULE_HEX_TERMINAL )
                    // InternalKconfig.g:1152:7: lv_hto_6_0= RULE_HEX_TERMINAL
                    {
                    lv_hto_6_0=(Token)match(input,RULE_HEX_TERMINAL,FOLLOW_11); 

                    							newLeafNode(lv_hto_6_0, grammarAccess.getRangeAccess().getHtoHEX_TERMINALTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRangeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"hto",
                    								lv_hto_6_0,
                    								"fmautorepair.Kconfig.HEX_TERMINAL");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalKconfig.g:1170:3: (otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKconfig.g:1171:4: otherlv_7= 'if' ( (lv_KconfigExpr_8_0= ruleExpr ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangeAccess().getIfKeyword_2_0());
                    			
                    // InternalKconfig.g:1175:4: ( (lv_KconfigExpr_8_0= ruleExpr ) )
                    // InternalKconfig.g:1176:5: (lv_KconfigExpr_8_0= ruleExpr )
                    {
                    // InternalKconfig.g:1176:5: (lv_KconfigExpr_8_0= ruleExpr )
                    // InternalKconfig.g:1177:6: lv_KconfigExpr_8_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getKconfigExprExprParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_KconfigExpr_8_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"KconfigExpr",
                    							lv_KconfigExpr_8_0,
                    							"fmautorepair.Kconfig.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleExpr"
    // InternalKconfig.g:1199:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalKconfig.g:1199:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalKconfig.g:1200:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalKconfig.g:1206:1: ruleExpr returns [EObject current=null] : (this_NeqLiteral_0= ruleNeqLiteral ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NeqLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1212:2: ( (this_NeqLiteral_0= ruleNeqLiteral ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )* ) )
            // InternalKconfig.g:1213:2: (this_NeqLiteral_0= ruleNeqLiteral ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )* )
            {
            // InternalKconfig.g:1213:2: (this_NeqLiteral_0= ruleNeqLiteral ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )* )
            // InternalKconfig.g:1214:3: this_NeqLiteral_0= ruleNeqLiteral ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getExprAccess().getNeqLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_NeqLiteral_0=ruleNeqLiteral();

            state._fsp--;


            			current = this_NeqLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKconfig.g:1222:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKconfig.g:1223:4: () otherlv_2= '=' ( (lv_right_3_0= ruleNeqLiteral ) )
            	    {
            	    // InternalKconfig.g:1223:4: ()
            	    // InternalKconfig.g:1224:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExprAccess().getExprLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExprAccess().getEqualsSignKeyword_1_1());
            	    			
            	    // InternalKconfig.g:1234:4: ( (lv_right_3_0= ruleNeqLiteral ) )
            	    // InternalKconfig.g:1235:5: (lv_right_3_0= ruleNeqLiteral )
            	    {
            	    // InternalKconfig.g:1235:5: (lv_right_3_0= ruleNeqLiteral )
            	    // InternalKconfig.g:1236:6: lv_right_3_0= ruleNeqLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getExprAccess().getRightNeqLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleNeqLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fmautorepair.Kconfig.NeqLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleNeqLiteral"
    // InternalKconfig.g:1258:1: entryRuleNeqLiteral returns [EObject current=null] : iv_ruleNeqLiteral= ruleNeqLiteral EOF ;
    public final EObject entryRuleNeqLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeqLiteral = null;


        try {
            // InternalKconfig.g:1258:51: (iv_ruleNeqLiteral= ruleNeqLiteral EOF )
            // InternalKconfig.g:1259:2: iv_ruleNeqLiteral= ruleNeqLiteral EOF
            {
             newCompositeNode(grammarAccess.getNeqLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeqLiteral=ruleNeqLiteral();

            state._fsp--;

             current =iv_ruleNeqLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeqLiteral"


    // $ANTLR start "ruleNeqLiteral"
    // InternalKconfig.g:1265:1: ruleNeqLiteral returns [EObject current=null] : (this_SecondaryLiteral_0= ruleSecondaryLiteral ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )* ) ;
    public final EObject ruleNeqLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SecondaryLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1271:2: ( (this_SecondaryLiteral_0= ruleSecondaryLiteral ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )* ) )
            // InternalKconfig.g:1272:2: (this_SecondaryLiteral_0= ruleSecondaryLiteral ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )* )
            {
            // InternalKconfig.g:1272:2: (this_SecondaryLiteral_0= ruleSecondaryLiteral ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )* )
            // InternalKconfig.g:1273:3: this_SecondaryLiteral_0= ruleSecondaryLiteral ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getNeqLiteralAccess().getSecondaryLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_SecondaryLiteral_0=ruleSecondaryLiteral();

            state._fsp--;


            			current = this_SecondaryLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKconfig.g:1281:3: ( () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKconfig.g:1282:4: () otherlv_2= '!=' ( (lv_right_3_0= ruleSecondaryLiteral ) )
            	    {
            	    // InternalKconfig.g:1282:4: ()
            	    // InternalKconfig.g:1283:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNeqLiteralAccess().getNeqLiteralLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getNeqLiteralAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	    			
            	    // InternalKconfig.g:1293:4: ( (lv_right_3_0= ruleSecondaryLiteral ) )
            	    // InternalKconfig.g:1294:5: (lv_right_3_0= ruleSecondaryLiteral )
            	    {
            	    // InternalKconfig.g:1294:5: (lv_right_3_0= ruleSecondaryLiteral )
            	    // InternalKconfig.g:1295:6: lv_right_3_0= ruleSecondaryLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getNeqLiteralAccess().getRightSecondaryLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleSecondaryLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNeqLiteralRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fmautorepair.Kconfig.SecondaryLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
    // $ANTLR end "ruleNeqLiteral"


    // $ANTLR start "entryRuleSecondaryLiteral"
    // InternalKconfig.g:1317:1: entryRuleSecondaryLiteral returns [EObject current=null] : iv_ruleSecondaryLiteral= ruleSecondaryLiteral EOF ;
    public final EObject entryRuleSecondaryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryLiteral = null;


        try {
            // InternalKconfig.g:1317:57: (iv_ruleSecondaryLiteral= ruleSecondaryLiteral EOF )
            // InternalKconfig.g:1318:2: iv_ruleSecondaryLiteral= ruleSecondaryLiteral EOF
            {
             newCompositeNode(grammarAccess.getSecondaryLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryLiteral=ruleSecondaryLiteral();

            state._fsp--;

             current =iv_ruleSecondaryLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSecondaryLiteral"


    // $ANTLR start "ruleSecondaryLiteral"
    // InternalKconfig.g:1324:1: ruleSecondaryLiteral returns [EObject current=null] : this_AndLiteral_0= ruleAndLiteral ;
    public final EObject ruleSecondaryLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_AndLiteral_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1330:2: (this_AndLiteral_0= ruleAndLiteral )
            // InternalKconfig.g:1331:2: this_AndLiteral_0= ruleAndLiteral
            {

            		newCompositeNode(grammarAccess.getSecondaryLiteralAccess().getAndLiteralParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AndLiteral_0=ruleAndLiteral();

            state._fsp--;


            		current = this_AndLiteral_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleSecondaryLiteral"


    // $ANTLR start "entryRuleAndLiteral"
    // InternalKconfig.g:1342:1: entryRuleAndLiteral returns [EObject current=null] : iv_ruleAndLiteral= ruleAndLiteral EOF ;
    public final EObject entryRuleAndLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndLiteral = null;


        try {
            // InternalKconfig.g:1342:51: (iv_ruleAndLiteral= ruleAndLiteral EOF )
            // InternalKconfig.g:1343:2: iv_ruleAndLiteral= ruleAndLiteral EOF
            {
             newCompositeNode(grammarAccess.getAndLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndLiteral=ruleAndLiteral();

            state._fsp--;

             current =iv_ruleAndLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndLiteral"


    // $ANTLR start "ruleAndLiteral"
    // InternalKconfig.g:1349:1: ruleAndLiteral returns [EObject current=null] : (this_OrLiteral_0= ruleOrLiteral ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )* ) ;
    public final EObject ruleAndLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1355:2: ( (this_OrLiteral_0= ruleOrLiteral ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )* ) )
            // InternalKconfig.g:1356:2: (this_OrLiteral_0= ruleOrLiteral ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )* )
            {
            // InternalKconfig.g:1356:2: (this_OrLiteral_0= ruleOrLiteral ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )* )
            // InternalKconfig.g:1357:3: this_OrLiteral_0= ruleOrLiteral ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndLiteralAccess().getOrLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_OrLiteral_0=ruleOrLiteral();

            state._fsp--;


            			current = this_OrLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKconfig.g:1365:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKconfig.g:1366:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleOrLiteral ) )
            	    {
            	    // InternalKconfig.g:1366:4: ()
            	    // InternalKconfig.g:1367:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndLiteralAccess().getAndLiteralLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndLiteralAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalKconfig.g:1377:4: ( (lv_right_3_0= ruleOrLiteral ) )
            	    // InternalKconfig.g:1378:5: (lv_right_3_0= ruleOrLiteral )
            	    {
            	    // InternalKconfig.g:1378:5: (lv_right_3_0= ruleOrLiteral )
            	    // InternalKconfig.g:1379:6: lv_right_3_0= ruleOrLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getAndLiteralAccess().getRightOrLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleOrLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndLiteralRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fmautorepair.Kconfig.OrLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleAndLiteral"


    // $ANTLR start "entryRuleOrLiteral"
    // InternalKconfig.g:1401:1: entryRuleOrLiteral returns [EObject current=null] : iv_ruleOrLiteral= ruleOrLiteral EOF ;
    public final EObject entryRuleOrLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrLiteral = null;


        try {
            // InternalKconfig.g:1401:50: (iv_ruleOrLiteral= ruleOrLiteral EOF )
            // InternalKconfig.g:1402:2: iv_ruleOrLiteral= ruleOrLiteral EOF
            {
             newCompositeNode(grammarAccess.getOrLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrLiteral=ruleOrLiteral();

            state._fsp--;

             current =iv_ruleOrLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrLiteral"


    // $ANTLR start "ruleOrLiteral"
    // InternalKconfig.g:1408:1: ruleOrLiteral returns [EObject current=null] : (this_PrimaryLiteral_0= rulePrimaryLiteral ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )* ) ;
    public final EObject ruleOrLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1414:2: ( (this_PrimaryLiteral_0= rulePrimaryLiteral ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )* ) )
            // InternalKconfig.g:1415:2: (this_PrimaryLiteral_0= rulePrimaryLiteral ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )* )
            {
            // InternalKconfig.g:1415:2: (this_PrimaryLiteral_0= rulePrimaryLiteral ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )* )
            // InternalKconfig.g:1416:3: this_PrimaryLiteral_0= rulePrimaryLiteral ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrLiteralAccess().getPrimaryLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_PrimaryLiteral_0=rulePrimaryLiteral();

            state._fsp--;


            			current = this_PrimaryLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalKconfig.g:1424:3: ( () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKconfig.g:1425:4: () otherlv_2= '||' ( (lv_right_3_0= rulePrimaryLiteral ) )
            	    {
            	    // InternalKconfig.g:1425:4: ()
            	    // InternalKconfig.g:1426:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrLiteralAccess().getOrLiteralLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrLiteralAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalKconfig.g:1436:4: ( (lv_right_3_0= rulePrimaryLiteral ) )
            	    // InternalKconfig.g:1437:5: (lv_right_3_0= rulePrimaryLiteral )
            	    {
            	    // InternalKconfig.g:1437:5: (lv_right_3_0= rulePrimaryLiteral )
            	    // InternalKconfig.g:1438:6: lv_right_3_0= rulePrimaryLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getOrLiteralAccess().getRightPrimaryLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePrimaryLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrLiteralRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fmautorepair.Kconfig.PrimaryLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
    // $ANTLR end "ruleOrLiteral"


    // $ANTLR start "entryRulePrimaryLiteral"
    // InternalKconfig.g:1460:1: entryRulePrimaryLiteral returns [EObject current=null] : iv_rulePrimaryLiteral= rulePrimaryLiteral EOF ;
    public final EObject entryRulePrimaryLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLiteral = null;


        try {
            // InternalKconfig.g:1460:55: (iv_rulePrimaryLiteral= rulePrimaryLiteral EOF )
            // InternalKconfig.g:1461:2: iv_rulePrimaryLiteral= rulePrimaryLiteral EOF
            {
             newCompositeNode(grammarAccess.getPrimaryLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryLiteral=rulePrimaryLiteral();

            state._fsp--;

             current =iv_rulePrimaryLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryLiteral"


    // $ANTLR start "rulePrimaryLiteral"
    // InternalKconfig.g:1467:1: rulePrimaryLiteral returns [EObject current=null] : ( ( (lv_confslit_0_0= ruleConfigLiteral ) ) | ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_confslit_0_0 = null;

        EObject this_Expr_3 = null;



        	enterRule();

        try {
            // InternalKconfig.g:1473:2: ( ( ( (lv_confslit_0_0= ruleConfigLiteral ) ) | ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' ) ) )
            // InternalKconfig.g:1474:2: ( ( (lv_confslit_0_0= ruleConfigLiteral ) ) | ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' ) )
            {
            // InternalKconfig.g:1474:2: ( ( (lv_confslit_0_0= ruleConfigLiteral ) ) | ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==39) ) {
                    alt30=2;
                }
                else if ( (LA30_1==RULE_ID) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case 39:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalKconfig.g:1475:3: ( (lv_confslit_0_0= ruleConfigLiteral ) )
                    {
                    // InternalKconfig.g:1475:3: ( (lv_confslit_0_0= ruleConfigLiteral ) )
                    // InternalKconfig.g:1476:4: (lv_confslit_0_0= ruleConfigLiteral )
                    {
                    // InternalKconfig.g:1476:4: (lv_confslit_0_0= ruleConfigLiteral )
                    // InternalKconfig.g:1477:5: lv_confslit_0_0= ruleConfigLiteral
                    {

                    					newCompositeNode(grammarAccess.getPrimaryLiteralAccess().getConfslitConfigLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_confslit_0_0=ruleConfigLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryLiteralRule());
                    					}
                    					add(
                    						current,
                    						"confslit",
                    						lv_confslit_0_0,
                    						"fmautorepair.Kconfig.ConfigLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:1495:3: ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' )
                    {
                    // InternalKconfig.g:1495:3: ( (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')' )
                    // InternalKconfig.g:1496:4: (otherlv_1= '!' )? otherlv_2= '(' this_Expr_3= ruleExpr otherlv_4= ')'
                    {
                    // InternalKconfig.g:1496:4: (otherlv_1= '!' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==38) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKconfig.g:1497:5: otherlv_1= '!'
                            {
                            otherlv_1=(Token)match(input,38,FOLLOW_22); 

                            					newLeafNode(otherlv_1, grammarAccess.getPrimaryLiteralAccess().getExclamationMarkKeyword_1_0());
                            				

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryLiteralAccess().getLeftParenthesisKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryLiteralAccess().getExprParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_23);
                    this_Expr_3=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryLiteralAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePrimaryLiteral"


    // $ANTLR start "entryRuleConfigLiteral"
    // InternalKconfig.g:1523:1: entryRuleConfigLiteral returns [EObject current=null] : iv_ruleConfigLiteral= ruleConfigLiteral EOF ;
    public final EObject entryRuleConfigLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigLiteral = null;


        try {
            // InternalKconfig.g:1523:54: (iv_ruleConfigLiteral= ruleConfigLiteral EOF )
            // InternalKconfig.g:1524:2: iv_ruleConfigLiteral= ruleConfigLiteral EOF
            {
             newCompositeNode(grammarAccess.getConfigLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigLiteral=ruleConfigLiteral();

            state._fsp--;

             current =iv_ruleConfigLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfigLiteral"


    // $ANTLR start "ruleConfigLiteral"
    // InternalKconfig.g:1530:1: ruleConfigLiteral returns [EObject current=null] : ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? ) | ( (lv_string_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_INT_7=null;
        Token lv_string_8_0=null;


        	enterRule();

        try {
            // InternalKconfig.g:1536:2: ( ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? ) | ( (lv_string_8_0= RULE_STRING ) ) ) )
            // InternalKconfig.g:1537:2: ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? ) | ( (lv_string_8_0= RULE_STRING ) ) )
            {
            // InternalKconfig.g:1537:2: ( ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? ) | ( (lv_string_8_0= RULE_STRING ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==38) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_STRING) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalKconfig.g:1538:3: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? )
                    {
                    // InternalKconfig.g:1538:3: ( (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )? )
                    // InternalKconfig.g:1539:4: (otherlv_0= '!' )? ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )?
                    {
                    // InternalKconfig.g:1539:4: (otherlv_0= '!' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==38) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalKconfig.g:1540:5: otherlv_0= '!'
                            {
                            otherlv_0=(Token)match(input,38,FOLLOW_5); 

                            					newLeafNode(otherlv_0, grammarAccess.getConfigLiteralAccess().getExclamationMarkKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalKconfig.g:1545:4: ( (otherlv_1= RULE_ID ) )
                    // InternalKconfig.g:1546:5: (otherlv_1= RULE_ID )
                    {
                    // InternalKconfig.g:1546:5: (otherlv_1= RULE_ID )
                    // InternalKconfig.g:1547:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigLiteralRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_1, grammarAccess.getConfigLiteralAccess().getConfConfigCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalKconfig.g:1558:4: ( (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==34) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==RULE_INT||(LA34_1>=29 && LA34_1<=31)) ) {
                            alt34=1;
                        }
                    }
                    else if ( (LA34_0==35) ) {
                        int LA34_2 = input.LA(2);

                        if ( (LA34_2==RULE_INT||(LA34_2>=29 && LA34_2<=31)) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalKconfig.g:1559:5: (otherlv_2= '=' | otherlv_3= '!=' ) (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT )
                            {
                            // InternalKconfig.g:1559:5: (otherlv_2= '=' | otherlv_3= '!=' )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==34) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==35) ) {
                                alt32=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalKconfig.g:1560:6: otherlv_2= '='
                                    {
                                    otherlv_2=(Token)match(input,34,FOLLOW_25); 

                                    						newLeafNode(otherlv_2, grammarAccess.getConfigLiteralAccess().getEqualsSignKeyword_0_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalKconfig.g:1565:6: otherlv_3= '!='
                                    {
                                    otherlv_3=(Token)match(input,35,FOLLOW_25); 

                                    						newLeafNode(otherlv_3, grammarAccess.getConfigLiteralAccess().getExclamationMarkEqualsSignKeyword_0_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalKconfig.g:1570:5: (otherlv_4= 'y' | otherlv_5= 'm' | otherlv_6= 'n' | this_INT_7= RULE_INT )
                            int alt33=4;
                            switch ( input.LA(1) ) {
                            case 31:
                                {
                                alt33=1;
                                }
                                break;
                            case 30:
                                {
                                alt33=2;
                                }
                                break;
                            case 29:
                                {
                                alt33=3;
                                }
                                break;
                            case RULE_INT:
                                {
                                alt33=4;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 33, 0, input);

                                throw nvae;
                            }

                            switch (alt33) {
                                case 1 :
                                    // InternalKconfig.g:1571:6: otherlv_4= 'y'
                                    {
                                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

                                    						newLeafNode(otherlv_4, grammarAccess.getConfigLiteralAccess().getYKeyword_0_2_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalKconfig.g:1576:6: otherlv_5= 'm'
                                    {
                                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                                    						newLeafNode(otherlv_5, grammarAccess.getConfigLiteralAccess().getMKeyword_0_2_1_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalKconfig.g:1581:6: otherlv_6= 'n'
                                    {
                                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                                    						newLeafNode(otherlv_6, grammarAccess.getConfigLiteralAccess().getNKeyword_0_2_1_2());
                                    					

                                    }
                                    break;
                                case 4 :
                                    // InternalKconfig.g:1586:6: this_INT_7= RULE_INT
                                    {
                                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                                    						newLeafNode(this_INT_7, grammarAccess.getConfigLiteralAccess().getINTTerminalRuleCall_0_2_1_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:1594:3: ( (lv_string_8_0= RULE_STRING ) )
                    {
                    // InternalKconfig.g:1594:3: ( (lv_string_8_0= RULE_STRING ) )
                    // InternalKconfig.g:1595:4: (lv_string_8_0= RULE_STRING )
                    {
                    // InternalKconfig.g:1595:4: (lv_string_8_0= RULE_STRING )
                    // InternalKconfig.g:1596:5: lv_string_8_0= RULE_STRING
                    {
                    lv_string_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_8_0, grammarAccess.getConfigLiteralAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConfigLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_8_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConfigLiteral"


    // $ANTLR start "entryRuleSIGNED_INT"
    // InternalKconfig.g:1616:1: entryRuleSIGNED_INT returns [String current=null] : iv_ruleSIGNED_INT= ruleSIGNED_INT EOF ;
    public final String entryRuleSIGNED_INT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_INT = null;


        try {
            // InternalKconfig.g:1616:50: (iv_ruleSIGNED_INT= ruleSIGNED_INT EOF )
            // InternalKconfig.g:1617:2: iv_ruleSIGNED_INT= ruleSIGNED_INT EOF
            {
             newCompositeNode(grammarAccess.getSIGNED_INTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNED_INT=ruleSIGNED_INT();

            state._fsp--;

             current =iv_ruleSIGNED_INT.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSIGNED_INT"


    // $ANTLR start "ruleSIGNED_INT"
    // InternalKconfig.g:1623:1: ruleSIGNED_INT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_INT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKconfig.g:1629:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKconfig.g:1630:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKconfig.g:1630:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKconfig.g:1631:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKconfig.g:1631:3: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKconfig.g:1632:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSIGNED_INTAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleSIGNED_INT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000002A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000031F7C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000031F7C0022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000C000000050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000C0E00001D0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000190L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000110L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});

}
