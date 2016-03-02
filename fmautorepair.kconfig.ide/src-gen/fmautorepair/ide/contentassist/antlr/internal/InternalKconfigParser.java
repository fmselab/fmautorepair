package fmautorepair.ide.contentassist.antlr.internal;

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
import fmautorepair.services.KconfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKconfigParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_KCONFIG_HELP", "RULE_STRING", "RULE_HEX_TERMINAL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'tristate'", "'int'", "'hex'", "'def_bool'", "'def_tristate'", "'n'", "'m'", "'y'", "'='", "'!='", "'endchoice'", "'source'", "'.Kconfig'", "'config'", "'if'", "'depends on'", "'select'", "'default'", "'prompt'", "'range'", "'&&'", "'||'", "'!'", "'('", "')'", "'-'", "'choice'", "'string'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_KCONFIG_HELP=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_HEX_TERMINAL=8;
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

    	public void setGrammarAccess(KconfigGrammarAccess grammarAccess) {
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
    // InternalKconfig.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalKconfig.g:54:1: ( ruleModel EOF )
            // InternalKconfig.g:55:1: ruleModel EOF
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
    // InternalKconfig.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalKconfig.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalKconfig.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalKconfig.g:68:3: ( rule__Model__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives()); 
            }
            // InternalKconfig.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||LA1_0==27||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKconfig.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleChoice"
    // InternalKconfig.g:78:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalKconfig.g:79:1: ( ruleChoice EOF )
            // InternalKconfig.g:80:1: ruleChoice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChoice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceRule()); 
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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalKconfig.g:87:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:91:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalKconfig.g:92:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalKconfig.g:92:2: ( ( rule__Choice__Group__0 ) )
            // InternalKconfig.g:93:3: ( rule__Choice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getGroup()); 
            }
            // InternalKconfig.g:94:3: ( rule__Choice__Group__0 )
            // InternalKconfig.g:94:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleImport"
    // InternalKconfig.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalKconfig.g:104:1: ( ruleImport EOF )
            // InternalKconfig.g:105:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalKconfig.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalKconfig.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalKconfig.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalKconfig.g:118:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalKconfig.g:119:3: ( rule__Import__Group__0 )
            // InternalKconfig.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalKconfig.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalKconfig.g:129:1: ( ruleQualifiedName EOF )
            // InternalKconfig.g:130:1: ruleQualifiedName EOF
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
    // InternalKconfig.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalKconfig.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalKconfig.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalKconfig.g:143:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalKconfig.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalKconfig.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleConfig"
    // InternalKconfig.g:153:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalKconfig.g:154:1: ( ruleConfig EOF )
            // InternalKconfig.g:155:1: ruleConfig EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigRule()); 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalKconfig.g:162:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:166:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalKconfig.g:167:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalKconfig.g:167:2: ( ( rule__Config__Group__0 ) )
            // InternalKconfig.g:168:3: ( rule__Config__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getGroup()); 
            }
            // InternalKconfig.g:169:3: ( rule__Config__Group__0 )
            // InternalKconfig.g:169:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleType"
    // InternalKconfig.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalKconfig.g:179:1: ( ruleType EOF )
            // InternalKconfig.g:180:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKconfig.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalKconfig.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalKconfig.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalKconfig.g:193:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalKconfig.g:194:3: ( rule__Type__Alternatives )
            // InternalKconfig.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDependency"
    // InternalKconfig.g:203:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalKconfig.g:204:1: ( ruleDependency EOF )
            // InternalKconfig.g:205:1: ruleDependency EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDependencyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDependencyRule()); 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalKconfig.g:212:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:216:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalKconfig.g:217:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalKconfig.g:217:2: ( ( rule__Dependency__Group__0 ) )
            // InternalKconfig.g:218:3: ( rule__Dependency__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDependencyAccess().getGroup()); 
            }
            // InternalKconfig.g:219:3: ( rule__Dependency__Group__0 )
            // InternalKconfig.g:219:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDependencyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleSelect"
    // InternalKconfig.g:228:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalKconfig.g:229:1: ( ruleSelect EOF )
            // InternalKconfig.g:230:1: ruleSelect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalKconfig.g:237:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:241:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalKconfig.g:242:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalKconfig.g:242:2: ( ( rule__Select__Group__0 ) )
            // InternalKconfig.g:243:3: ( rule__Select__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup()); 
            }
            // InternalKconfig.g:244:3: ( rule__Select__Group__0 )
            // InternalKconfig.g:244:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDefault"
    // InternalKconfig.g:253:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // InternalKconfig.g:254:1: ( ruleDefault EOF )
            // InternalKconfig.g:255:1: ruleDefault EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultRule()); 
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
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalKconfig.g:262:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:266:2: ( ( ( rule__Default__Group__0 ) ) )
            // InternalKconfig.g:267:2: ( ( rule__Default__Group__0 ) )
            {
            // InternalKconfig.g:267:2: ( ( rule__Default__Group__0 ) )
            // InternalKconfig.g:268:3: ( rule__Default__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGroup()); 
            }
            // InternalKconfig.g:269:3: ( rule__Default__Group__0 )
            // InternalKconfig.g:269:4: rule__Default__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRulePrompt"
    // InternalKconfig.g:278:1: entryRulePrompt : rulePrompt EOF ;
    public final void entryRulePrompt() throws RecognitionException {
        try {
            // InternalKconfig.g:279:1: ( rulePrompt EOF )
            // InternalKconfig.g:280:1: rulePrompt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrompt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptRule()); 
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
    // $ANTLR end "entryRulePrompt"


    // $ANTLR start "rulePrompt"
    // InternalKconfig.g:287:1: rulePrompt : ( ( rule__Prompt__Group__0 ) ) ;
    public final void rulePrompt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:291:2: ( ( ( rule__Prompt__Group__0 ) ) )
            // InternalKconfig.g:292:2: ( ( rule__Prompt__Group__0 ) )
            {
            // InternalKconfig.g:292:2: ( ( rule__Prompt__Group__0 ) )
            // InternalKconfig.g:293:3: ( rule__Prompt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getGroup()); 
            }
            // InternalKconfig.g:294:3: ( rule__Prompt__Group__0 )
            // InternalKconfig.g:294:4: rule__Prompt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prompt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrompt"


    // $ANTLR start "entryRuleRange"
    // InternalKconfig.g:303:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalKconfig.g:304:1: ( ruleRange EOF )
            // InternalKconfig.g:305:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalKconfig.g:312:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:316:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalKconfig.g:317:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalKconfig.g:317:2: ( ( rule__Range__Group__0 ) )
            // InternalKconfig.g:318:3: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // InternalKconfig.g:319:3: ( rule__Range__Group__0 )
            // InternalKconfig.g:319:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleExpr"
    // InternalKconfig.g:328:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalKconfig.g:329:1: ( ruleExpr EOF )
            // InternalKconfig.g:330:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalKconfig.g:337:1: ruleExpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:341:2: ( ( ( rule__Expr__Group__0 ) ) )
            // InternalKconfig.g:342:2: ( ( rule__Expr__Group__0 ) )
            {
            // InternalKconfig.g:342:2: ( ( rule__Expr__Group__0 ) )
            // InternalKconfig.g:343:3: ( rule__Expr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup()); 
            }
            // InternalKconfig.g:344:3: ( rule__Expr__Group__0 )
            // InternalKconfig.g:344:4: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleNeqLiteral"
    // InternalKconfig.g:353:1: entryRuleNeqLiteral : ruleNeqLiteral EOF ;
    public final void entryRuleNeqLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:354:1: ( ruleNeqLiteral EOF )
            // InternalKconfig.g:355:1: ruleNeqLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNeqLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralRule()); 
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
    // $ANTLR end "entryRuleNeqLiteral"


    // $ANTLR start "ruleNeqLiteral"
    // InternalKconfig.g:362:1: ruleNeqLiteral : ( ( rule__NeqLiteral__Group__0 ) ) ;
    public final void ruleNeqLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:366:2: ( ( ( rule__NeqLiteral__Group__0 ) ) )
            // InternalKconfig.g:367:2: ( ( rule__NeqLiteral__Group__0 ) )
            {
            // InternalKconfig.g:367:2: ( ( rule__NeqLiteral__Group__0 ) )
            // InternalKconfig.g:368:3: ( rule__NeqLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getGroup()); 
            }
            // InternalKconfig.g:369:3: ( rule__NeqLiteral__Group__0 )
            // InternalKconfig.g:369:4: rule__NeqLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeqLiteral"


    // $ANTLR start "entryRuleSecondaryLiteral"
    // InternalKconfig.g:378:1: entryRuleSecondaryLiteral : ruleSecondaryLiteral EOF ;
    public final void entryRuleSecondaryLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:379:1: ( ruleSecondaryLiteral EOF )
            // InternalKconfig.g:380:1: ruleSecondaryLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSecondaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryLiteralRule()); 
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
    // $ANTLR end "entryRuleSecondaryLiteral"


    // $ANTLR start "ruleSecondaryLiteral"
    // InternalKconfig.g:387:1: ruleSecondaryLiteral : ( ruleAndLiteral ) ;
    public final void ruleSecondaryLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:391:2: ( ( ruleAndLiteral ) )
            // InternalKconfig.g:392:2: ( ruleAndLiteral )
            {
            // InternalKconfig.g:392:2: ( ruleAndLiteral )
            // InternalKconfig.g:393:3: ruleAndLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondaryLiteralAccess().getAndLiteralParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondaryLiteralAccess().getAndLiteralParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecondaryLiteral"


    // $ANTLR start "entryRuleAndLiteral"
    // InternalKconfig.g:403:1: entryRuleAndLiteral : ruleAndLiteral EOF ;
    public final void entryRuleAndLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:404:1: ( ruleAndLiteral EOF )
            // InternalKconfig.g:405:1: ruleAndLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralRule()); 
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
    // $ANTLR end "entryRuleAndLiteral"


    // $ANTLR start "ruleAndLiteral"
    // InternalKconfig.g:412:1: ruleAndLiteral : ( ( rule__AndLiteral__Group__0 ) ) ;
    public final void ruleAndLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:416:2: ( ( ( rule__AndLiteral__Group__0 ) ) )
            // InternalKconfig.g:417:2: ( ( rule__AndLiteral__Group__0 ) )
            {
            // InternalKconfig.g:417:2: ( ( rule__AndLiteral__Group__0 ) )
            // InternalKconfig.g:418:3: ( rule__AndLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getGroup()); 
            }
            // InternalKconfig.g:419:3: ( rule__AndLiteral__Group__0 )
            // InternalKconfig.g:419:4: rule__AndLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndLiteral"


    // $ANTLR start "entryRuleOrLiteral"
    // InternalKconfig.g:428:1: entryRuleOrLiteral : ruleOrLiteral EOF ;
    public final void entryRuleOrLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:429:1: ( ruleOrLiteral EOF )
            // InternalKconfig.g:430:1: ruleOrLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralRule()); 
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
    // $ANTLR end "entryRuleOrLiteral"


    // $ANTLR start "ruleOrLiteral"
    // InternalKconfig.g:437:1: ruleOrLiteral : ( ( rule__OrLiteral__Group__0 ) ) ;
    public final void ruleOrLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:441:2: ( ( ( rule__OrLiteral__Group__0 ) ) )
            // InternalKconfig.g:442:2: ( ( rule__OrLiteral__Group__0 ) )
            {
            // InternalKconfig.g:442:2: ( ( rule__OrLiteral__Group__0 ) )
            // InternalKconfig.g:443:3: ( rule__OrLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getGroup()); 
            }
            // InternalKconfig.g:444:3: ( rule__OrLiteral__Group__0 )
            // InternalKconfig.g:444:4: rule__OrLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrLiteral"


    // $ANTLR start "entryRulePrimaryLiteral"
    // InternalKconfig.g:453:1: entryRulePrimaryLiteral : rulePrimaryLiteral EOF ;
    public final void entryRulePrimaryLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:454:1: ( rulePrimaryLiteral EOF )
            // InternalKconfig.g:455:1: rulePrimaryLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralRule()); 
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
    // $ANTLR end "entryRulePrimaryLiteral"


    // $ANTLR start "rulePrimaryLiteral"
    // InternalKconfig.g:462:1: rulePrimaryLiteral : ( ( rule__PrimaryLiteral__Alternatives ) ) ;
    public final void rulePrimaryLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:466:2: ( ( ( rule__PrimaryLiteral__Alternatives ) ) )
            // InternalKconfig.g:467:2: ( ( rule__PrimaryLiteral__Alternatives ) )
            {
            // InternalKconfig.g:467:2: ( ( rule__PrimaryLiteral__Alternatives ) )
            // InternalKconfig.g:468:3: ( rule__PrimaryLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getAlternatives()); 
            }
            // InternalKconfig.g:469:3: ( rule__PrimaryLiteral__Alternatives )
            // InternalKconfig.g:469:4: rule__PrimaryLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryLiteral"


    // $ANTLR start "entryRuleConfigLiteral"
    // InternalKconfig.g:478:1: entryRuleConfigLiteral : ruleConfigLiteral EOF ;
    public final void entryRuleConfigLiteral() throws RecognitionException {
        try {
            // InternalKconfig.g:479:1: ( ruleConfigLiteral EOF )
            // InternalKconfig.g:480:1: ruleConfigLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralRule()); 
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
    // $ANTLR end "entryRuleConfigLiteral"


    // $ANTLR start "ruleConfigLiteral"
    // InternalKconfig.g:487:1: ruleConfigLiteral : ( ( rule__ConfigLiteral__Alternatives ) ) ;
    public final void ruleConfigLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:491:2: ( ( ( rule__ConfigLiteral__Alternatives ) ) )
            // InternalKconfig.g:492:2: ( ( rule__ConfigLiteral__Alternatives ) )
            {
            // InternalKconfig.g:492:2: ( ( rule__ConfigLiteral__Alternatives ) )
            // InternalKconfig.g:493:3: ( rule__ConfigLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getAlternatives()); 
            }
            // InternalKconfig.g:494:3: ( rule__ConfigLiteral__Alternatives )
            // InternalKconfig.g:494:4: rule__ConfigLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigLiteral"


    // $ANTLR start "entryRuleSIGNED_INT"
    // InternalKconfig.g:503:1: entryRuleSIGNED_INT : ruleSIGNED_INT EOF ;
    public final void entryRuleSIGNED_INT() throws RecognitionException {
        try {
            // InternalKconfig.g:504:1: ( ruleSIGNED_INT EOF )
            // InternalKconfig.g:505:1: ruleSIGNED_INT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTRule()); 
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
    // $ANTLR end "entryRuleSIGNED_INT"


    // $ANTLR start "ruleSIGNED_INT"
    // InternalKconfig.g:512:1: ruleSIGNED_INT : ( ( rule__SIGNED_INT__Group__0 ) ) ;
    public final void ruleSIGNED_INT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:516:2: ( ( ( rule__SIGNED_INT__Group__0 ) ) )
            // InternalKconfig.g:517:2: ( ( rule__SIGNED_INT__Group__0 ) )
            {
            // InternalKconfig.g:517:2: ( ( rule__SIGNED_INT__Group__0 ) )
            // InternalKconfig.g:518:3: ( rule__SIGNED_INT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getGroup()); 
            }
            // InternalKconfig.g:519:3: ( rule__SIGNED_INT__Group__0 )
            // InternalKconfig.g:519:4: rule__SIGNED_INT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_INT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGNED_INT"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalKconfig.g:527:1: rule__Model__Alternatives : ( ( ( rule__Model__ChoicesAssignment_0 ) ) | ( ( rule__Model__SourcesAssignment_1 ) ) | ( ( rule__Model__ConfigsAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:531:1: ( ( ( rule__Model__ChoicesAssignment_0 ) ) | ( ( rule__Model__SourcesAssignment_1 ) ) | ( ( rule__Model__ConfigsAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKconfig.g:532:2: ( ( rule__Model__ChoicesAssignment_0 ) )
                    {
                    // InternalKconfig.g:532:2: ( ( rule__Model__ChoicesAssignment_0 ) )
                    // InternalKconfig.g:533:3: ( rule__Model__ChoicesAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getChoicesAssignment_0()); 
                    }
                    // InternalKconfig.g:534:3: ( rule__Model__ChoicesAssignment_0 )
                    // InternalKconfig.g:534:4: rule__Model__ChoicesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ChoicesAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getChoicesAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:538:2: ( ( rule__Model__SourcesAssignment_1 ) )
                    {
                    // InternalKconfig.g:538:2: ( ( rule__Model__SourcesAssignment_1 ) )
                    // InternalKconfig.g:539:3: ( rule__Model__SourcesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getSourcesAssignment_1()); 
                    }
                    // InternalKconfig.g:540:3: ( rule__Model__SourcesAssignment_1 )
                    // InternalKconfig.g:540:4: rule__Model__SourcesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SourcesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getSourcesAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:544:2: ( ( rule__Model__ConfigsAssignment_2 ) )
                    {
                    // InternalKconfig.g:544:2: ( ( rule__Model__ConfigsAssignment_2 ) )
                    // InternalKconfig.g:545:3: ( rule__Model__ConfigsAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getConfigsAssignment_2()); 
                    }
                    // InternalKconfig.g:546:3: ( rule__Model__ConfigsAssignment_2 )
                    // InternalKconfig.g:546:4: rule__Model__ConfigsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConfigsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getConfigsAssignment_2()); 
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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalKconfig.g:554:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:558:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKconfig.g:559:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalKconfig.g:559:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalKconfig.g:560:3: ( rule__Type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_0()); 
                    }
                    // InternalKconfig.g:561:3: ( rule__Type__Group_0__0 )
                    // InternalKconfig.g:561:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:565:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalKconfig.g:565:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalKconfig.g:566:3: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // InternalKconfig.g:567:3: ( rule__Type__Group_1__0 )
                    // InternalKconfig.g:567:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:571:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalKconfig.g:571:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalKconfig.g:572:3: ( rule__Type__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_2()); 
                    }
                    // InternalKconfig.g:573:3: ( rule__Type__Group_2__0 )
                    // InternalKconfig.g:573:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Type__TypeAlternatives_1_0_0"
    // InternalKconfig.g:581:1: rule__Type__TypeAlternatives_1_0_0 : ( ( 'bool' ) | ( 'tristate' ) | ( 'int' ) | ( 'hex' ) );
    public final void rule__Type__TypeAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:585:1: ( ( 'bool' ) | ( 'tristate' ) | ( 'int' ) | ( 'hex' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKconfig.g:586:2: ( 'bool' )
                    {
                    // InternalKconfig.g:586:2: ( 'bool' )
                    // InternalKconfig.g:587:3: 'bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeBoolKeyword_1_0_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeBoolKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:592:2: ( 'tristate' )
                    {
                    // InternalKconfig.g:592:2: ( 'tristate' )
                    // InternalKconfig.g:593:3: 'tristate'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeTristateKeyword_1_0_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeTristateKeyword_1_0_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:598:2: ( 'int' )
                    {
                    // InternalKconfig.g:598:2: ( 'int' )
                    // InternalKconfig.g:599:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeIntKeyword_1_0_0_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeIntKeyword_1_0_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:604:2: ( 'hex' )
                    {
                    // InternalKconfig.g:604:2: ( 'hex' )
                    // InternalKconfig.g:605:3: 'hex'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeHexKeyword_1_0_0_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeHexKeyword_1_0_0_3()); 
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
    // $ANTLR end "rule__Type__TypeAlternatives_1_0_0"


    // $ANTLR start "rule__Type__TypeAlternatives_2_0_0"
    // InternalKconfig.g:614:1: rule__Type__TypeAlternatives_2_0_0 : ( ( 'def_bool' ) | ( 'def_tristate' ) );
    public final void rule__Type__TypeAlternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:618:1: ( ( 'def_bool' ) | ( 'def_tristate' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
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
                    // InternalKconfig.g:619:2: ( 'def_bool' )
                    {
                    // InternalKconfig.g:619:2: ( 'def_bool' )
                    // InternalKconfig.g:620:3: 'def_bool'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeDef_boolKeyword_2_0_0_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeDef_boolKeyword_2_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:625:2: ( 'def_tristate' )
                    {
                    // InternalKconfig.g:625:2: ( 'def_tristate' )
                    // InternalKconfig.g:626:3: 'def_tristate'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypeDef_tristateKeyword_2_0_0_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypeDef_tristateKeyword_2_0_0_1()); 
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
    // $ANTLR end "rule__Type__TypeAlternatives_2_0_0"


    // $ANTLR start "rule__Default__Alternatives_1"
    // InternalKconfig.g:635:1: rule__Default__Alternatives_1 : ( ( ( rule__Default__ValueAssignment_1_0 ) ) | ( ( rule__Default__TrivalAssignment_1_1 ) ) | ( ( rule__Default__HexAssignment_1_2 ) ) | ( ( rule__Default__IntAssignment_1_3 ) ) );
    public final void rule__Default__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:639:1: ( ( ( rule__Default__ValueAssignment_1_0 ) ) | ( ( rule__Default__TrivalAssignment_1_1 ) ) | ( ( rule__Default__HexAssignment_1_2 ) ) | ( ( rule__Default__IntAssignment_1_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case 36:
            case 37:
                {
                alt6=1;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt6=2;
                }
                break;
            case RULE_HEX_TERMINAL:
                {
                alt6=3;
                }
                break;
            case RULE_INT:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKconfig.g:640:2: ( ( rule__Default__ValueAssignment_1_0 ) )
                    {
                    // InternalKconfig.g:640:2: ( ( rule__Default__ValueAssignment_1_0 ) )
                    // InternalKconfig.g:641:3: ( rule__Default__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getValueAssignment_1_0()); 
                    }
                    // InternalKconfig.g:642:3: ( rule__Default__ValueAssignment_1_0 )
                    // InternalKconfig.g:642:4: rule__Default__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Default__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:646:2: ( ( rule__Default__TrivalAssignment_1_1 ) )
                    {
                    // InternalKconfig.g:646:2: ( ( rule__Default__TrivalAssignment_1_1 ) )
                    // InternalKconfig.g:647:3: ( rule__Default__TrivalAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getTrivalAssignment_1_1()); 
                    }
                    // InternalKconfig.g:648:3: ( rule__Default__TrivalAssignment_1_1 )
                    // InternalKconfig.g:648:4: rule__Default__TrivalAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Default__TrivalAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getTrivalAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:652:2: ( ( rule__Default__HexAssignment_1_2 ) )
                    {
                    // InternalKconfig.g:652:2: ( ( rule__Default__HexAssignment_1_2 ) )
                    // InternalKconfig.g:653:3: ( rule__Default__HexAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getHexAssignment_1_2()); 
                    }
                    // InternalKconfig.g:654:3: ( rule__Default__HexAssignment_1_2 )
                    // InternalKconfig.g:654:4: rule__Default__HexAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Default__HexAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getHexAssignment_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:658:2: ( ( rule__Default__IntAssignment_1_3 ) )
                    {
                    // InternalKconfig.g:658:2: ( ( rule__Default__IntAssignment_1_3 ) )
                    // InternalKconfig.g:659:3: ( rule__Default__IntAssignment_1_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getIntAssignment_1_3()); 
                    }
                    // InternalKconfig.g:660:3: ( rule__Default__IntAssignment_1_3 )
                    // InternalKconfig.g:660:4: rule__Default__IntAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Default__IntAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getIntAssignment_1_3()); 
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
    // $ANTLR end "rule__Default__Alternatives_1"


    // $ANTLR start "rule__Default__TrivalAlternatives_1_1_0"
    // InternalKconfig.g:668:1: rule__Default__TrivalAlternatives_1_1_0 : ( ( 'n' ) | ( 'm' ) | ( 'y' ) );
    public final void rule__Default__TrivalAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:672:1: ( ( 'n' ) | ( 'm' ) | ( 'y' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKconfig.g:673:2: ( 'n' )
                    {
                    // InternalKconfig.g:673:2: ( 'n' )
                    // InternalKconfig.g:674:3: 'n'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getTrivalNKeyword_1_1_0_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getTrivalNKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:679:2: ( 'm' )
                    {
                    // InternalKconfig.g:679:2: ( 'm' )
                    // InternalKconfig.g:680:3: 'm'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getTrivalMKeyword_1_1_0_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getTrivalMKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:685:2: ( 'y' )
                    {
                    // InternalKconfig.g:685:2: ( 'y' )
                    // InternalKconfig.g:686:3: 'y'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDefaultAccess().getTrivalYKeyword_1_1_0_2()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDefaultAccess().getTrivalYKeyword_1_1_0_2()); 
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
    // $ANTLR end "rule__Default__TrivalAlternatives_1_1_0"


    // $ANTLR start "rule__Range__Alternatives_1"
    // InternalKconfig.g:695:1: rule__Range__Alternatives_1 : ( ( ( rule__Range__Group_1_0__0 ) ) | ( ( rule__Range__Group_1_1__0 ) ) );
    public final void rule__Range__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:699:1: ( ( ( rule__Range__Group_1_0__0 ) ) | ( ( rule__Range__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)||LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HEX_TERMINAL) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKconfig.g:700:2: ( ( rule__Range__Group_1_0__0 ) )
                    {
                    // InternalKconfig.g:700:2: ( ( rule__Range__Group_1_0__0 ) )
                    // InternalKconfig.g:701:3: ( rule__Range__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getGroup_1_0()); 
                    }
                    // InternalKconfig.g:702:3: ( rule__Range__Group_1_0__0 )
                    // InternalKconfig.g:702:4: rule__Range__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:706:2: ( ( rule__Range__Group_1_1__0 ) )
                    {
                    // InternalKconfig.g:706:2: ( ( rule__Range__Group_1_1__0 ) )
                    // InternalKconfig.g:707:3: ( rule__Range__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getGroup_1_1()); 
                    }
                    // InternalKconfig.g:708:3: ( rule__Range__Group_1_1__0 )
                    // InternalKconfig.g:708:4: rule__Range__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Range__Alternatives_1"


    // $ANTLR start "rule__Range__Alternatives_1_0_0"
    // InternalKconfig.g:716:1: rule__Range__Alternatives_1_0_0 : ( ( ( rule__Range__IfromAssignment_1_0_0_0 ) ) | ( ( rule__Range__IconfromAssignment_1_0_0_1 ) ) );
    public final void rule__Range__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:720:1: ( ( ( rule__Range__IfromAssignment_1_0_0_0 ) ) | ( ( rule__Range__IconfromAssignment_1_0_0_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==39) ) {
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
                    // InternalKconfig.g:721:2: ( ( rule__Range__IfromAssignment_1_0_0_0 ) )
                    {
                    // InternalKconfig.g:721:2: ( ( rule__Range__IfromAssignment_1_0_0_0 ) )
                    // InternalKconfig.g:722:3: ( rule__Range__IfromAssignment_1_0_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getIfromAssignment_1_0_0_0()); 
                    }
                    // InternalKconfig.g:723:3: ( rule__Range__IfromAssignment_1_0_0_0 )
                    // InternalKconfig.g:723:4: rule__Range__IfromAssignment_1_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__IfromAssignment_1_0_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getIfromAssignment_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:727:2: ( ( rule__Range__IconfromAssignment_1_0_0_1 ) )
                    {
                    // InternalKconfig.g:727:2: ( ( rule__Range__IconfromAssignment_1_0_0_1 ) )
                    // InternalKconfig.g:728:3: ( rule__Range__IconfromAssignment_1_0_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getIconfromAssignment_1_0_0_1()); 
                    }
                    // InternalKconfig.g:729:3: ( rule__Range__IconfromAssignment_1_0_0_1 )
                    // InternalKconfig.g:729:4: rule__Range__IconfromAssignment_1_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__IconfromAssignment_1_0_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getIconfromAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__Range__Alternatives_1_0_0"


    // $ANTLR start "rule__Range__Alternatives_1_0_1"
    // InternalKconfig.g:737:1: rule__Range__Alternatives_1_0_1 : ( ( ( rule__Range__ItoAssignment_1_0_1_0 ) ) | ( ( rule__Range__IconftoAssignment_1_0_1_1 ) ) );
    public final void rule__Range__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:741:1: ( ( ( rule__Range__ItoAssignment_1_0_1_0 ) ) | ( ( rule__Range__IconftoAssignment_1_0_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==39) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKconfig.g:742:2: ( ( rule__Range__ItoAssignment_1_0_1_0 ) )
                    {
                    // InternalKconfig.g:742:2: ( ( rule__Range__ItoAssignment_1_0_1_0 ) )
                    // InternalKconfig.g:743:3: ( rule__Range__ItoAssignment_1_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getItoAssignment_1_0_1_0()); 
                    }
                    // InternalKconfig.g:744:3: ( rule__Range__ItoAssignment_1_0_1_0 )
                    // InternalKconfig.g:744:4: rule__Range__ItoAssignment_1_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__ItoAssignment_1_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getItoAssignment_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:748:2: ( ( rule__Range__IconftoAssignment_1_0_1_1 ) )
                    {
                    // InternalKconfig.g:748:2: ( ( rule__Range__IconftoAssignment_1_0_1_1 ) )
                    // InternalKconfig.g:749:3: ( rule__Range__IconftoAssignment_1_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRangeAccess().getIconftoAssignment_1_0_1_1()); 
                    }
                    // InternalKconfig.g:750:3: ( rule__Range__IconftoAssignment_1_0_1_1 )
                    // InternalKconfig.g:750:4: rule__Range__IconftoAssignment_1_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__IconftoAssignment_1_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRangeAccess().getIconftoAssignment_1_0_1_1()); 
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
    // $ANTLR end "rule__Range__Alternatives_1_0_1"


    // $ANTLR start "rule__PrimaryLiteral__Alternatives"
    // InternalKconfig.g:758:1: rule__PrimaryLiteral__Alternatives : ( ( ( rule__PrimaryLiteral__ConfslitAssignment_0 ) ) | ( ( rule__PrimaryLiteral__Group_1__0 ) ) );
    public final void rule__PrimaryLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:762:1: ( ( ( rule__PrimaryLiteral__ConfslitAssignment_0 ) ) | ( ( rule__PrimaryLiteral__Group_1__0 ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==37) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKconfig.g:763:2: ( ( rule__PrimaryLiteral__ConfslitAssignment_0 ) )
                    {
                    // InternalKconfig.g:763:2: ( ( rule__PrimaryLiteral__ConfslitAssignment_0 ) )
                    // InternalKconfig.g:764:3: ( rule__PrimaryLiteral__ConfslitAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryLiteralAccess().getConfslitAssignment_0()); 
                    }
                    // InternalKconfig.g:765:3: ( rule__PrimaryLiteral__ConfslitAssignment_0 )
                    // InternalKconfig.g:765:4: rule__PrimaryLiteral__ConfslitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryLiteral__ConfslitAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryLiteralAccess().getConfslitAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:769:2: ( ( rule__PrimaryLiteral__Group_1__0 ) )
                    {
                    // InternalKconfig.g:769:2: ( ( rule__PrimaryLiteral__Group_1__0 ) )
                    // InternalKconfig.g:770:3: ( rule__PrimaryLiteral__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryLiteralAccess().getGroup_1()); 
                    }
                    // InternalKconfig.g:771:3: ( rule__PrimaryLiteral__Group_1__0 )
                    // InternalKconfig.g:771:4: rule__PrimaryLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryLiteral__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryLiteralAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PrimaryLiteral__Alternatives"


    // $ANTLR start "rule__ConfigLiteral__Alternatives"
    // InternalKconfig.g:779:1: rule__ConfigLiteral__Alternatives : ( ( ( rule__ConfigLiteral__Group_0__0 ) ) | ( ( rule__ConfigLiteral__StringAssignment_1 ) ) );
    public final void rule__ConfigLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:783:1: ( ( ( rule__ConfigLiteral__Group_0__0 ) ) | ( ( rule__ConfigLiteral__StringAssignment_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalKconfig.g:784:2: ( ( rule__ConfigLiteral__Group_0__0 ) )
                    {
                    // InternalKconfig.g:784:2: ( ( rule__ConfigLiteral__Group_0__0 ) )
                    // InternalKconfig.g:785:3: ( rule__ConfigLiteral__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getGroup_0()); 
                    }
                    // InternalKconfig.g:786:3: ( rule__ConfigLiteral__Group_0__0 )
                    // InternalKconfig.g:786:4: rule__ConfigLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigLiteral__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:790:2: ( ( rule__ConfigLiteral__StringAssignment_1 ) )
                    {
                    // InternalKconfig.g:790:2: ( ( rule__ConfigLiteral__StringAssignment_1 ) )
                    // InternalKconfig.g:791:3: ( rule__ConfigLiteral__StringAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getStringAssignment_1()); 
                    }
                    // InternalKconfig.g:792:3: ( rule__ConfigLiteral__StringAssignment_1 )
                    // InternalKconfig.g:792:4: rule__ConfigLiteral__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigLiteral__StringAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getStringAssignment_1()); 
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
    // $ANTLR end "rule__ConfigLiteral__Alternatives"


    // $ANTLR start "rule__ConfigLiteral__Alternatives_0_2_0"
    // InternalKconfig.g:800:1: rule__ConfigLiteral__Alternatives_0_2_0 : ( ( '=' ) | ( '!=' ) );
    public final void rule__ConfigLiteral__Alternatives_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:804:1: ( ( '=' ) | ( '!=' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalKconfig.g:805:2: ( '=' )
                    {
                    // InternalKconfig.g:805:2: ( '=' )
                    // InternalKconfig.g:806:3: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getEqualsSignKeyword_0_2_0_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getEqualsSignKeyword_0_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:811:2: ( '!=' )
                    {
                    // InternalKconfig.g:811:2: ( '!=' )
                    // InternalKconfig.g:812:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getExclamationMarkEqualsSignKeyword_0_2_0_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getExclamationMarkEqualsSignKeyword_0_2_0_1()); 
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
    // $ANTLR end "rule__ConfigLiteral__Alternatives_0_2_0"


    // $ANTLR start "rule__ConfigLiteral__Alternatives_0_2_1"
    // InternalKconfig.g:821:1: rule__ConfigLiteral__Alternatives_0_2_1 : ( ( 'y' ) | ( 'm' ) | ( 'n' ) | ( RULE_INT ) );
    public final void rule__ConfigLiteral__Alternatives_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:825:1: ( ( 'y' ) | ( 'm' ) | ( 'n' ) | ( RULE_INT ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            case RULE_INT:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKconfig.g:826:2: ( 'y' )
                    {
                    // InternalKconfig.g:826:2: ( 'y' )
                    // InternalKconfig.g:827:3: 'y'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getYKeyword_0_2_1_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getYKeyword_0_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:832:2: ( 'm' )
                    {
                    // InternalKconfig.g:832:2: ( 'm' )
                    // InternalKconfig.g:833:3: 'm'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getMKeyword_0_2_1_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getMKeyword_0_2_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:838:2: ( 'n' )
                    {
                    // InternalKconfig.g:838:2: ( 'n' )
                    // InternalKconfig.g:839:3: 'n'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getNKeyword_0_2_1_2()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getNKeyword_0_2_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:844:2: ( RULE_INT )
                    {
                    // InternalKconfig.g:844:2: ( RULE_INT )
                    // InternalKconfig.g:845:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigLiteralAccess().getINTTerminalRuleCall_0_2_1_3()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigLiteralAccess().getINTTerminalRuleCall_0_2_1_3()); 
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
    // $ANTLR end "rule__ConfigLiteral__Alternatives_0_2_1"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalKconfig.g:854:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:858:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalKconfig.g:859:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalKconfig.g:866:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__ChoiceAssignment_0 ) ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:870:1: ( ( ( rule__Choice__ChoiceAssignment_0 ) ) )
            // InternalKconfig.g:871:1: ( ( rule__Choice__ChoiceAssignment_0 ) )
            {
            // InternalKconfig.g:871:1: ( ( rule__Choice__ChoiceAssignment_0 ) )
            // InternalKconfig.g:872:2: ( rule__Choice__ChoiceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceAssignment_0()); 
            }
            // InternalKconfig.g:873:2: ( rule__Choice__ChoiceAssignment_0 )
            // InternalKconfig.g:873:3: rule__Choice__ChoiceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__ChoiceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getChoiceAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalKconfig.g:881:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:885:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalKconfig.g:886:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Choice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Choice__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalKconfig.g:893:1: rule__Choice__Group__1__Impl : ( ( ( rule__Choice__ConfigsAssignment_1 ) ) ( ( rule__Choice__ConfigsAssignment_1 )* ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:897:1: ( ( ( ( rule__Choice__ConfigsAssignment_1 ) ) ( ( rule__Choice__ConfigsAssignment_1 )* ) ) )
            // InternalKconfig.g:898:1: ( ( ( rule__Choice__ConfigsAssignment_1 ) ) ( ( rule__Choice__ConfigsAssignment_1 )* ) )
            {
            // InternalKconfig.g:898:1: ( ( ( rule__Choice__ConfigsAssignment_1 ) ) ( ( rule__Choice__ConfigsAssignment_1 )* ) )
            // InternalKconfig.g:899:2: ( ( rule__Choice__ConfigsAssignment_1 ) ) ( ( rule__Choice__ConfigsAssignment_1 )* )
            {
            // InternalKconfig.g:899:2: ( ( rule__Choice__ConfigsAssignment_1 ) )
            // InternalKconfig.g:900:3: ( rule__Choice__ConfigsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getConfigsAssignment_1()); 
            }
            // InternalKconfig.g:901:3: ( rule__Choice__ConfigsAssignment_1 )
            // InternalKconfig.g:901:4: rule__Choice__ConfigsAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Choice__ConfigsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getConfigsAssignment_1()); 
            }

            }

            // InternalKconfig.g:904:2: ( ( rule__Choice__ConfigsAssignment_1 )* )
            // InternalKconfig.g:905:3: ( rule__Choice__ConfigsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getConfigsAssignment_1()); 
            }
            // InternalKconfig.g:906:3: ( rule__Choice__ConfigsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKconfig.g:906:4: rule__Choice__ConfigsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Choice__ConfigsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getConfigsAssignment_1()); 
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
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // InternalKconfig.g:915:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:919:1: ( rule__Choice__Group__2__Impl )
            // InternalKconfig.g:920:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // InternalKconfig.g:926:1: rule__Choice__Group__2__Impl : ( 'endchoice' ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:930:1: ( ( 'endchoice' ) )
            // InternalKconfig.g:931:1: ( 'endchoice' )
            {
            // InternalKconfig.g:931:1: ( 'endchoice' )
            // InternalKconfig.g:932:2: 'endchoice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getEndchoiceKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getEndchoiceKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalKconfig.g:942:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:946:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalKconfig.g:947:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalKconfig.g:954:1: rule__Import__Group__0__Impl : ( 'source' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:958:1: ( ( 'source' ) )
            // InternalKconfig.g:959:1: ( 'source' )
            {
            // InternalKconfig.g:959:1: ( 'source' )
            // InternalKconfig.g:960:2: 'source'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getSourceKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getSourceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalKconfig.g:969:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:973:1: ( rule__Import__Group__1__Impl )
            // InternalKconfig.g:974:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalKconfig.g:980:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:984:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalKconfig.g:985:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalKconfig.g:985:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalKconfig.g:986:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalKconfig.g:987:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalKconfig.g:987:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalKconfig.g:996:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1000:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalKconfig.g:1001:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalKconfig.g:1008:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1012:1: ( ( RULE_ID ) )
            // InternalKconfig.g:1013:1: ( RULE_ID )
            {
            // InternalKconfig.g:1013:1: ( RULE_ID )
            // InternalKconfig.g:1014:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalKconfig.g:1023:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1027:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalKconfig.g:1028:2: rule__QualifiedName__Group__1__Impl
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
    // InternalKconfig.g:1034:1: rule__QualifiedName__Group__1__Impl : ( '.Kconfig' ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1038:1: ( ( '.Kconfig' ) )
            // InternalKconfig.g:1039:1: ( '.Kconfig' )
            {
            // InternalKconfig.g:1039:1: ( '.Kconfig' )
            // InternalKconfig.g:1040:2: '.Kconfig'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getKconfigKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getKconfigKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Config__Group__0"
    // InternalKconfig.g:1050:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1054:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalKconfig.g:1055:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Config__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalKconfig.g:1062:1: rule__Config__Group__0__Impl : ( 'config' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1066:1: ( ( 'config' ) )
            // InternalKconfig.g:1067:1: ( 'config' )
            {
            // InternalKconfig.g:1067:1: ( 'config' )
            // InternalKconfig.g:1068:2: 'config'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalKconfig.g:1077:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1081:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalKconfig.g:1082:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalKconfig.g:1089:1: rule__Config__Group__1__Impl : ( ( rule__Config__NameAssignment_1 ) ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1093:1: ( ( ( rule__Config__NameAssignment_1 ) ) )
            // InternalKconfig.g:1094:1: ( ( rule__Config__NameAssignment_1 ) )
            {
            // InternalKconfig.g:1094:1: ( ( rule__Config__NameAssignment_1 ) )
            // InternalKconfig.g:1095:2: ( rule__Config__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getNameAssignment_1()); 
            }
            // InternalKconfig.g:1096:2: ( rule__Config__NameAssignment_1 )
            // InternalKconfig.g:1096:3: rule__Config__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalKconfig.g:1104:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1108:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalKconfig.g:1109:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Config__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalKconfig.g:1116:1: rule__Config__Group__2__Impl : ( ( rule__Config__UnorderedGroup_2 ) ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1120:1: ( ( ( rule__Config__UnorderedGroup_2 ) ) )
            // InternalKconfig.g:1121:1: ( ( rule__Config__UnorderedGroup_2 ) )
            {
            // InternalKconfig.g:1121:1: ( ( rule__Config__UnorderedGroup_2 ) )
            // InternalKconfig.g:1122:2: ( rule__Config__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getUnorderedGroup_2()); 
            }
            // InternalKconfig.g:1123:2: ( rule__Config__UnorderedGroup_2 )
            // InternalKconfig.g:1123:3: rule__Config__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Config__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalKconfig.g:1131:1: rule__Config__Group__3 : rule__Config__Group__3__Impl ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1135:1: ( rule__Config__Group__3__Impl )
            // InternalKconfig.g:1136:2: rule__Config__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalKconfig.g:1142:1: rule__Config__Group__3__Impl : ( ( RULE_KCONFIG_HELP )? ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1146:1: ( ( ( RULE_KCONFIG_HELP )? ) )
            // InternalKconfig.g:1147:1: ( ( RULE_KCONFIG_HELP )? )
            {
            // InternalKconfig.g:1147:1: ( ( RULE_KCONFIG_HELP )? )
            // InternalKconfig.g:1148:2: ( RULE_KCONFIG_HELP )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getKCONFIG_HELPTerminalRuleCall_3()); 
            }
            // InternalKconfig.g:1149:2: ( RULE_KCONFIG_HELP )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_KCONFIG_HELP) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKconfig.g:1149:3: RULE_KCONFIG_HELP
                    {
                    match(input,RULE_KCONFIG_HELP,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getKCONFIG_HELPTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalKconfig.g:1158:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1162:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalKconfig.g:1163:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalKconfig.g:1170:1: rule__Type__Group_0__0__Impl : ( ( rule__Type__TypeAssignment_0_0 ) ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1174:1: ( ( ( rule__Type__TypeAssignment_0_0 ) ) )
            // InternalKconfig.g:1175:1: ( ( rule__Type__TypeAssignment_0_0 ) )
            {
            // InternalKconfig.g:1175:1: ( ( rule__Type__TypeAssignment_0_0 ) )
            // InternalKconfig.g:1176:2: ( rule__Type__TypeAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAssignment_0_0()); 
            }
            // InternalKconfig.g:1177:2: ( rule__Type__TypeAssignment_0_0 )
            // InternalKconfig.g:1177:3: rule__Type__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalKconfig.g:1185:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1189:1: ( rule__Type__Group_0__1__Impl )
            // InternalKconfig.g:1190:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalKconfig.g:1196:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__TpromptAssignment_0_1 )? ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1200:1: ( ( ( rule__Type__TpromptAssignment_0_1 )? ) )
            // InternalKconfig.g:1201:1: ( ( rule__Type__TpromptAssignment_0_1 )? )
            {
            // InternalKconfig.g:1201:1: ( ( rule__Type__TpromptAssignment_0_1 )? )
            // InternalKconfig.g:1202:2: ( rule__Type__TpromptAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTpromptAssignment_0_1()); 
            }
            // InternalKconfig.g:1203:2: ( rule__Type__TpromptAssignment_0_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKconfig.g:1203:3: rule__Type__TpromptAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TpromptAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTpromptAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalKconfig.g:1212:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1216:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalKconfig.g:1217:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalKconfig.g:1224:1: rule__Type__Group_1__0__Impl : ( ( rule__Type__TypeAssignment_1_0 ) ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1228:1: ( ( ( rule__Type__TypeAssignment_1_0 ) ) )
            // InternalKconfig.g:1229:1: ( ( rule__Type__TypeAssignment_1_0 ) )
            {
            // InternalKconfig.g:1229:1: ( ( rule__Type__TypeAssignment_1_0 ) )
            // InternalKconfig.g:1230:2: ( rule__Type__TypeAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAssignment_1_0()); 
            }
            // InternalKconfig.g:1231:2: ( rule__Type__TypeAssignment_1_0 )
            // InternalKconfig.g:1231:3: rule__Type__TypeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalKconfig.g:1239:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl rule__Type__Group_1__2 ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1243:1: ( rule__Type__Group_1__1__Impl rule__Type__Group_1__2 )
            // InternalKconfig.g:1244:2: rule__Type__Group_1__1__Impl rule__Type__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalKconfig.g:1251:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TpromptAssignment_1_1 )? ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1255:1: ( ( ( rule__Type__TpromptAssignment_1_1 )? ) )
            // InternalKconfig.g:1256:1: ( ( rule__Type__TpromptAssignment_1_1 )? )
            {
            // InternalKconfig.g:1256:1: ( ( rule__Type__TpromptAssignment_1_1 )? )
            // InternalKconfig.g:1257:2: ( rule__Type__TpromptAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTpromptAssignment_1_1()); 
            }
            // InternalKconfig.g:1258:2: ( rule__Type__TpromptAssignment_1_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKconfig.g:1258:3: rule__Type__TpromptAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TpromptAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTpromptAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_1__2"
    // InternalKconfig.g:1266:1: rule__Type__Group_1__2 : rule__Type__Group_1__2__Impl ;
    public final void rule__Type__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1270:1: ( rule__Type__Group_1__2__Impl )
            // InternalKconfig.g:1271:2: rule__Type__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2"


    // $ANTLR start "rule__Type__Group_1__2__Impl"
    // InternalKconfig.g:1277:1: rule__Type__Group_1__2__Impl : ( ( rule__Type__Group_1_2__0 )? ) ;
    public final void rule__Type__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1281:1: ( ( ( rule__Type__Group_1_2__0 )? ) )
            // InternalKconfig.g:1282:1: ( ( rule__Type__Group_1_2__0 )? )
            {
            // InternalKconfig.g:1282:1: ( ( rule__Type__Group_1_2__0 )? )
            // InternalKconfig.g:1283:2: ( rule__Type__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup_1_2()); 
            }
            // InternalKconfig.g:1284:2: ( rule__Type__Group_1_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKconfig.g:1284:3: rule__Type__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__2__Impl"


    // $ANTLR start "rule__Type__Group_1_2__0"
    // InternalKconfig.g:1293:1: rule__Type__Group_1_2__0 : rule__Type__Group_1_2__0__Impl rule__Type__Group_1_2__1 ;
    public final void rule__Type__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1297:1: ( rule__Type__Group_1_2__0__Impl rule__Type__Group_1_2__1 )
            // InternalKconfig.g:1298:2: rule__Type__Group_1_2__0__Impl rule__Type__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_2__0"


    // $ANTLR start "rule__Type__Group_1_2__0__Impl"
    // InternalKconfig.g:1305:1: rule__Type__Group_1_2__0__Impl : ( 'if' ) ;
    public final void rule__Type__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1309:1: ( ( 'if' ) )
            // InternalKconfig.g:1310:1: ( 'if' )
            {
            // InternalKconfig.g:1310:1: ( 'if' )
            // InternalKconfig.g:1311:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIfKeyword_1_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIfKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_2__0__Impl"


    // $ANTLR start "rule__Type__Group_1_2__1"
    // InternalKconfig.g:1320:1: rule__Type__Group_1_2__1 : rule__Type__Group_1_2__1__Impl ;
    public final void rule__Type__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1324:1: ( rule__Type__Group_1_2__1__Impl )
            // InternalKconfig.g:1325:2: rule__Type__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_2__1"


    // $ANTLR start "rule__Type__Group_1_2__1__Impl"
    // InternalKconfig.g:1331:1: rule__Type__Group_1_2__1__Impl : ( ( rule__Type__KconfigExprAssignment_1_2_1 ) ) ;
    public final void rule__Type__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1335:1: ( ( ( rule__Type__KconfigExprAssignment_1_2_1 ) ) )
            // InternalKconfig.g:1336:1: ( ( rule__Type__KconfigExprAssignment_1_2_1 ) )
            {
            // InternalKconfig.g:1336:1: ( ( rule__Type__KconfigExprAssignment_1_2_1 ) )
            // InternalKconfig.g:1337:2: ( rule__Type__KconfigExprAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getKconfigExprAssignment_1_2_1()); 
            }
            // InternalKconfig.g:1338:2: ( rule__Type__KconfigExprAssignment_1_2_1 )
            // InternalKconfig.g:1338:3: rule__Type__KconfigExprAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__KconfigExprAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getKconfigExprAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalKconfig.g:1347:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1351:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalKconfig.g:1352:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalKconfig.g:1359:1: rule__Type__Group_2__0__Impl : ( ( rule__Type__TypeAssignment_2_0 ) ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1363:1: ( ( ( rule__Type__TypeAssignment_2_0 ) ) )
            // InternalKconfig.g:1364:1: ( ( rule__Type__TypeAssignment_2_0 ) )
            {
            // InternalKconfig.g:1364:1: ( ( rule__Type__TypeAssignment_2_0 ) )
            // InternalKconfig.g:1365:2: ( rule__Type__TypeAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAssignment_2_0()); 
            }
            // InternalKconfig.g:1366:2: ( rule__Type__TypeAssignment_2_0 )
            // InternalKconfig.g:1366:3: rule__Type__TypeAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalKconfig.g:1374:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1378:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalKconfig.g:1379:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalKconfig.g:1386:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__DefAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1390:1: ( ( ( rule__Type__DefAssignment_2_1 ) ) )
            // InternalKconfig.g:1391:1: ( ( rule__Type__DefAssignment_2_1 ) )
            {
            // InternalKconfig.g:1391:1: ( ( rule__Type__DefAssignment_2_1 ) )
            // InternalKconfig.g:1392:2: ( rule__Type__DefAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefAssignment_2_1()); 
            }
            // InternalKconfig.g:1393:2: ( rule__Type__DefAssignment_2_1 )
            // InternalKconfig.g:1393:3: rule__Type__DefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__DefAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getDefAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalKconfig.g:1401:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1405:1: ( rule__Type__Group_2__2__Impl )
            // InternalKconfig.g:1406:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalKconfig.g:1412:1: rule__Type__Group_2__2__Impl : ( ( rule__Type__Group_2_2__0 )? ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1416:1: ( ( ( rule__Type__Group_2_2__0 )? ) )
            // InternalKconfig.g:1417:1: ( ( rule__Type__Group_2_2__0 )? )
            {
            // InternalKconfig.g:1417:1: ( ( rule__Type__Group_2_2__0 )? )
            // InternalKconfig.g:1418:2: ( rule__Type__Group_2_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup_2_2()); 
            }
            // InternalKconfig.g:1419:2: ( rule__Type__Group_2_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKconfig.g:1419:3: rule__Type__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_2_2__0"
    // InternalKconfig.g:1428:1: rule__Type__Group_2_2__0 : rule__Type__Group_2_2__0__Impl rule__Type__Group_2_2__1 ;
    public final void rule__Type__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1432:1: ( rule__Type__Group_2_2__0__Impl rule__Type__Group_2_2__1 )
            // InternalKconfig.g:1433:2: rule__Type__Group_2_2__0__Impl rule__Type__Group_2_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Type__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_2__0"


    // $ANTLR start "rule__Type__Group_2_2__0__Impl"
    // InternalKconfig.g:1440:1: rule__Type__Group_2_2__0__Impl : ( 'if' ) ;
    public final void rule__Type__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1444:1: ( ( 'if' ) )
            // InternalKconfig.g:1445:1: ( 'if' )
            {
            // InternalKconfig.g:1445:1: ( 'if' )
            // InternalKconfig.g:1446:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIfKeyword_2_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIfKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2_2__1"
    // InternalKconfig.g:1455:1: rule__Type__Group_2_2__1 : rule__Type__Group_2_2__1__Impl ;
    public final void rule__Type__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1459:1: ( rule__Type__Group_2_2__1__Impl )
            // InternalKconfig.g:1460:2: rule__Type__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_2__1"


    // $ANTLR start "rule__Type__Group_2_2__1__Impl"
    // InternalKconfig.g:1466:1: rule__Type__Group_2_2__1__Impl : ( ( rule__Type__KconfigExprAssignment_2_2_1 ) ) ;
    public final void rule__Type__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1470:1: ( ( ( rule__Type__KconfigExprAssignment_2_2_1 ) ) )
            // InternalKconfig.g:1471:1: ( ( rule__Type__KconfigExprAssignment_2_2_1 ) )
            {
            // InternalKconfig.g:1471:1: ( ( rule__Type__KconfigExprAssignment_2_2_1 ) )
            // InternalKconfig.g:1472:2: ( rule__Type__KconfigExprAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getKconfigExprAssignment_2_2_1()); 
            }
            // InternalKconfig.g:1473:2: ( rule__Type__KconfigExprAssignment_2_2_1 )
            // InternalKconfig.g:1473:3: rule__Type__KconfigExprAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__KconfigExprAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getKconfigExprAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2_2__1__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalKconfig.g:1482:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1486:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalKconfig.g:1487:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Dependency__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalKconfig.g:1494:1: rule__Dependency__Group__0__Impl : ( 'depends on' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1498:1: ( ( 'depends on' ) )
            // InternalKconfig.g:1499:1: ( 'depends on' )
            {
            // InternalKconfig.g:1499:1: ( 'depends on' )
            // InternalKconfig.g:1500:2: 'depends on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDependencyAccess().getDependsOnKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDependencyAccess().getDependsOnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalKconfig.g:1509:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1513:1: ( rule__Dependency__Group__1__Impl )
            // InternalKconfig.g:1514:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalKconfig.g:1520:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__DepsAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1524:1: ( ( ( rule__Dependency__DepsAssignment_1 ) ) )
            // InternalKconfig.g:1525:1: ( ( rule__Dependency__DepsAssignment_1 ) )
            {
            // InternalKconfig.g:1525:1: ( ( rule__Dependency__DepsAssignment_1 ) )
            // InternalKconfig.g:1526:2: ( rule__Dependency__DepsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDependencyAccess().getDepsAssignment_1()); 
            }
            // InternalKconfig.g:1527:2: ( rule__Dependency__DepsAssignment_1 )
            // InternalKconfig.g:1527:3: rule__Dependency__DepsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__DepsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDependencyAccess().getDepsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalKconfig.g:1536:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1540:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalKconfig.g:1541:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Select__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalKconfig.g:1548:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1552:1: ( ( 'select' ) )
            // InternalKconfig.g:1553:1: ( 'select' )
            {
            // InternalKconfig.g:1553:1: ( 'select' )
            // InternalKconfig.g:1554:2: 'select'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalKconfig.g:1563:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1567:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalKconfig.g:1568:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Select__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalKconfig.g:1575:1: rule__Select__Group__1__Impl : ( ( rule__Select__SelectAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1579:1: ( ( ( rule__Select__SelectAssignment_1 ) ) )
            // InternalKconfig.g:1580:1: ( ( rule__Select__SelectAssignment_1 ) )
            {
            // InternalKconfig.g:1580:1: ( ( rule__Select__SelectAssignment_1 ) )
            // InternalKconfig.g:1581:2: ( rule__Select__SelectAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectAssignment_1()); 
            }
            // InternalKconfig.g:1582:2: ( rule__Select__SelectAssignment_1 )
            // InternalKconfig.g:1582:3: rule__Select__SelectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalKconfig.g:1590:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1594:1: ( rule__Select__Group__2__Impl )
            // InternalKconfig.g:1595:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalKconfig.g:1601:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )? ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1605:1: ( ( ( rule__Select__Group_2__0 )? ) )
            // InternalKconfig.g:1606:1: ( ( rule__Select__Group_2__0 )? )
            {
            // InternalKconfig.g:1606:1: ( ( rule__Select__Group_2__0 )? )
            // InternalKconfig.g:1607:2: ( rule__Select__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getGroup_2()); 
            }
            // InternalKconfig.g:1608:2: ( rule__Select__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKconfig.g:1608:3: rule__Select__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group_2__0"
    // InternalKconfig.g:1617:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1621:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalKconfig.g:1622:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Select__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0"


    // $ANTLR start "rule__Select__Group_2__0__Impl"
    // InternalKconfig.g:1629:1: rule__Select__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1633:1: ( ( 'if' ) )
            // InternalKconfig.g:1634:1: ( 'if' )
            {
            // InternalKconfig.g:1634:1: ( 'if' )
            // InternalKconfig.g:1635:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getIfKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getIfKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2__1"
    // InternalKconfig.g:1644:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1648:1: ( rule__Select__Group_2__1__Impl )
            // InternalKconfig.g:1649:2: rule__Select__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1"


    // $ANTLR start "rule__Select__Group_2__1__Impl"
    // InternalKconfig.g:1655:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ExprAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1659:1: ( ( ( rule__Select__ExprAssignment_2_1 ) ) )
            // InternalKconfig.g:1660:1: ( ( rule__Select__ExprAssignment_2_1 ) )
            {
            // InternalKconfig.g:1660:1: ( ( rule__Select__ExprAssignment_2_1 ) )
            // InternalKconfig.g:1661:2: ( rule__Select__ExprAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getExprAssignment_2_1()); 
            }
            // InternalKconfig.g:1662:2: ( rule__Select__ExprAssignment_2_1 )
            // InternalKconfig.g:1662:3: rule__Select__ExprAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ExprAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getExprAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // InternalKconfig.g:1671:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1675:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // InternalKconfig.g:1676:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Default__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Default__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // InternalKconfig.g:1683:1: rule__Default__Group__0__Impl : ( 'default' ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1687:1: ( ( 'default' ) )
            // InternalKconfig.g:1688:1: ( 'default' )
            {
            // InternalKconfig.g:1688:1: ( 'default' )
            // InternalKconfig.g:1689:2: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getDefaultKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // InternalKconfig.g:1698:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1702:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // InternalKconfig.g:1703:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Default__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Default__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // InternalKconfig.g:1710:1: rule__Default__Group__1__Impl : ( ( rule__Default__Alternatives_1 ) ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1714:1: ( ( ( rule__Default__Alternatives_1 ) ) )
            // InternalKconfig.g:1715:1: ( ( rule__Default__Alternatives_1 ) )
            {
            // InternalKconfig.g:1715:1: ( ( rule__Default__Alternatives_1 ) )
            // InternalKconfig.g:1716:2: ( rule__Default__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getAlternatives_1()); 
            }
            // InternalKconfig.g:1717:2: ( rule__Default__Alternatives_1 )
            // InternalKconfig.g:1717:3: rule__Default__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Default__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // InternalKconfig.g:1725:1: rule__Default__Group__2 : rule__Default__Group__2__Impl ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1729:1: ( rule__Default__Group__2__Impl )
            // InternalKconfig.g:1730:2: rule__Default__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // InternalKconfig.g:1736:1: rule__Default__Group__2__Impl : ( ( rule__Default__Group_2__0 )? ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1740:1: ( ( ( rule__Default__Group_2__0 )? ) )
            // InternalKconfig.g:1741:1: ( ( rule__Default__Group_2__0 )? )
            {
            // InternalKconfig.g:1741:1: ( ( rule__Default__Group_2__0 )? )
            // InternalKconfig.g:1742:2: ( rule__Default__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getGroup_2()); 
            }
            // InternalKconfig.g:1743:2: ( rule__Default__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKconfig.g:1743:3: rule__Default__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Default__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__Default__Group_2__0"
    // InternalKconfig.g:1752:1: rule__Default__Group_2__0 : rule__Default__Group_2__0__Impl rule__Default__Group_2__1 ;
    public final void rule__Default__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1756:1: ( rule__Default__Group_2__0__Impl rule__Default__Group_2__1 )
            // InternalKconfig.g:1757:2: rule__Default__Group_2__0__Impl rule__Default__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Default__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Default__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group_2__0"


    // $ANTLR start "rule__Default__Group_2__0__Impl"
    // InternalKconfig.g:1764:1: rule__Default__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Default__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1768:1: ( ( 'if' ) )
            // InternalKconfig.g:1769:1: ( 'if' )
            {
            // InternalKconfig.g:1769:1: ( 'if' )
            // InternalKconfig.g:1770:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getIfKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getIfKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group_2__0__Impl"


    // $ANTLR start "rule__Default__Group_2__1"
    // InternalKconfig.g:1779:1: rule__Default__Group_2__1 : rule__Default__Group_2__1__Impl ;
    public final void rule__Default__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1783:1: ( rule__Default__Group_2__1__Impl )
            // InternalKconfig.g:1784:2: rule__Default__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Default__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group_2__1"


    // $ANTLR start "rule__Default__Group_2__1__Impl"
    // InternalKconfig.g:1790:1: rule__Default__Group_2__1__Impl : ( ( rule__Default__KconfigExprAssignment_2_1 ) ) ;
    public final void rule__Default__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1794:1: ( ( ( rule__Default__KconfigExprAssignment_2_1 ) ) )
            // InternalKconfig.g:1795:1: ( ( rule__Default__KconfigExprAssignment_2_1 ) )
            {
            // InternalKconfig.g:1795:1: ( ( rule__Default__KconfigExprAssignment_2_1 ) )
            // InternalKconfig.g:1796:2: ( rule__Default__KconfigExprAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getKconfigExprAssignment_2_1()); 
            }
            // InternalKconfig.g:1797:2: ( rule__Default__KconfigExprAssignment_2_1 )
            // InternalKconfig.g:1797:3: rule__Default__KconfigExprAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Default__KconfigExprAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getKconfigExprAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group_2__1__Impl"


    // $ANTLR start "rule__Prompt__Group__0"
    // InternalKconfig.g:1806:1: rule__Prompt__Group__0 : rule__Prompt__Group__0__Impl rule__Prompt__Group__1 ;
    public final void rule__Prompt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1810:1: ( rule__Prompt__Group__0__Impl rule__Prompt__Group__1 )
            // InternalKconfig.g:1811:2: rule__Prompt__Group__0__Impl rule__Prompt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Prompt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prompt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__0"


    // $ANTLR start "rule__Prompt__Group__0__Impl"
    // InternalKconfig.g:1818:1: rule__Prompt__Group__0__Impl : ( 'prompt' ) ;
    public final void rule__Prompt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1822:1: ( ( 'prompt' ) )
            // InternalKconfig.g:1823:1: ( 'prompt' )
            {
            // InternalKconfig.g:1823:1: ( 'prompt' )
            // InternalKconfig.g:1824:2: 'prompt'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getPromptKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getPromptKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__0__Impl"


    // $ANTLR start "rule__Prompt__Group__1"
    // InternalKconfig.g:1833:1: rule__Prompt__Group__1 : rule__Prompt__Group__1__Impl rule__Prompt__Group__2 ;
    public final void rule__Prompt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1837:1: ( rule__Prompt__Group__1__Impl rule__Prompt__Group__2 )
            // InternalKconfig.g:1838:2: rule__Prompt__Group__1__Impl rule__Prompt__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Prompt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prompt__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__1"


    // $ANTLR start "rule__Prompt__Group__1__Impl"
    // InternalKconfig.g:1845:1: rule__Prompt__Group__1__Impl : ( ( rule__Prompt__ValueAssignment_1 ) ) ;
    public final void rule__Prompt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1849:1: ( ( ( rule__Prompt__ValueAssignment_1 ) ) )
            // InternalKconfig.g:1850:1: ( ( rule__Prompt__ValueAssignment_1 ) )
            {
            // InternalKconfig.g:1850:1: ( ( rule__Prompt__ValueAssignment_1 ) )
            // InternalKconfig.g:1851:2: ( rule__Prompt__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getValueAssignment_1()); 
            }
            // InternalKconfig.g:1852:2: ( rule__Prompt__ValueAssignment_1 )
            // InternalKconfig.g:1852:3: rule__Prompt__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prompt__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__1__Impl"


    // $ANTLR start "rule__Prompt__Group__2"
    // InternalKconfig.g:1860:1: rule__Prompt__Group__2 : rule__Prompt__Group__2__Impl ;
    public final void rule__Prompt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1864:1: ( rule__Prompt__Group__2__Impl )
            // InternalKconfig.g:1865:2: rule__Prompt__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prompt__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__2"


    // $ANTLR start "rule__Prompt__Group__2__Impl"
    // InternalKconfig.g:1871:1: rule__Prompt__Group__2__Impl : ( ( rule__Prompt__Group_2__0 )? ) ;
    public final void rule__Prompt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1875:1: ( ( ( rule__Prompt__Group_2__0 )? ) )
            // InternalKconfig.g:1876:1: ( ( rule__Prompt__Group_2__0 )? )
            {
            // InternalKconfig.g:1876:1: ( ( rule__Prompt__Group_2__0 )? )
            // InternalKconfig.g:1877:2: ( rule__Prompt__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getGroup_2()); 
            }
            // InternalKconfig.g:1878:2: ( rule__Prompt__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKconfig.g:1878:3: rule__Prompt__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Prompt__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group__2__Impl"


    // $ANTLR start "rule__Prompt__Group_2__0"
    // InternalKconfig.g:1887:1: rule__Prompt__Group_2__0 : rule__Prompt__Group_2__0__Impl rule__Prompt__Group_2__1 ;
    public final void rule__Prompt__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1891:1: ( rule__Prompt__Group_2__0__Impl rule__Prompt__Group_2__1 )
            // InternalKconfig.g:1892:2: rule__Prompt__Group_2__0__Impl rule__Prompt__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Prompt__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prompt__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group_2__0"


    // $ANTLR start "rule__Prompt__Group_2__0__Impl"
    // InternalKconfig.g:1899:1: rule__Prompt__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Prompt__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1903:1: ( ( 'if' ) )
            // InternalKconfig.g:1904:1: ( 'if' )
            {
            // InternalKconfig.g:1904:1: ( 'if' )
            // InternalKconfig.g:1905:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getIfKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getIfKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group_2__0__Impl"


    // $ANTLR start "rule__Prompt__Group_2__1"
    // InternalKconfig.g:1914:1: rule__Prompt__Group_2__1 : rule__Prompt__Group_2__1__Impl ;
    public final void rule__Prompt__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1918:1: ( rule__Prompt__Group_2__1__Impl )
            // InternalKconfig.g:1919:2: rule__Prompt__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prompt__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group_2__1"


    // $ANTLR start "rule__Prompt__Group_2__1__Impl"
    // InternalKconfig.g:1925:1: rule__Prompt__Group_2__1__Impl : ( ( rule__Prompt__KconfigExprAssignment_2_1 ) ) ;
    public final void rule__Prompt__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1929:1: ( ( ( rule__Prompt__KconfigExprAssignment_2_1 ) ) )
            // InternalKconfig.g:1930:1: ( ( rule__Prompt__KconfigExprAssignment_2_1 ) )
            {
            // InternalKconfig.g:1930:1: ( ( rule__Prompt__KconfigExprAssignment_2_1 ) )
            // InternalKconfig.g:1931:2: ( rule__Prompt__KconfigExprAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getKconfigExprAssignment_2_1()); 
            }
            // InternalKconfig.g:1932:2: ( rule__Prompt__KconfigExprAssignment_2_1 )
            // InternalKconfig.g:1932:3: rule__Prompt__KconfigExprAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Prompt__KconfigExprAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getKconfigExprAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__Group_2__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalKconfig.g:1941:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1945:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalKconfig.g:1946:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalKconfig.g:1953:1: rule__Range__Group__0__Impl : ( 'range' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1957:1: ( ( 'range' ) )
            // InternalKconfig.g:1958:1: ( 'range' )
            {
            // InternalKconfig.g:1958:1: ( 'range' )
            // InternalKconfig.g:1959:2: 'range'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getRangeKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getRangeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalKconfig.g:1968:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1972:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalKconfig.g:1973:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalKconfig.g:1980:1: rule__Range__Group__1__Impl : ( ( rule__Range__Alternatives_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1984:1: ( ( ( rule__Range__Alternatives_1 ) ) )
            // InternalKconfig.g:1985:1: ( ( rule__Range__Alternatives_1 ) )
            {
            // InternalKconfig.g:1985:1: ( ( rule__Range__Alternatives_1 ) )
            // InternalKconfig.g:1986:2: ( rule__Range__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1()); 
            }
            // InternalKconfig.g:1987:2: ( rule__Range__Alternatives_1 )
            // InternalKconfig.g:1987:3: rule__Range__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalKconfig.g:1995:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:1999:1: ( rule__Range__Group__2__Impl )
            // InternalKconfig.g:2000:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalKconfig.g:2006:1: rule__Range__Group__2__Impl : ( ( rule__Range__Group_2__0 )? ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2010:1: ( ( ( rule__Range__Group_2__0 )? ) )
            // InternalKconfig.g:2011:1: ( ( rule__Range__Group_2__0 )? )
            {
            // InternalKconfig.g:2011:1: ( ( rule__Range__Group_2__0 )? )
            // InternalKconfig.g:2012:2: ( rule__Range__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup_2()); 
            }
            // InternalKconfig.g:2013:2: ( rule__Range__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKconfig.g:2013:3: rule__Range__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group_1_0__0"
    // InternalKconfig.g:2022:1: rule__Range__Group_1_0__0 : rule__Range__Group_1_0__0__Impl rule__Range__Group_1_0__1 ;
    public final void rule__Range__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2026:1: ( rule__Range__Group_1_0__0__Impl rule__Range__Group_1_0__1 )
            // InternalKconfig.g:2027:2: rule__Range__Group_1_0__0__Impl rule__Range__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Range__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_0__0"


    // $ANTLR start "rule__Range__Group_1_0__0__Impl"
    // InternalKconfig.g:2034:1: rule__Range__Group_1_0__0__Impl : ( ( rule__Range__Alternatives_1_0_0 ) ) ;
    public final void rule__Range__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2038:1: ( ( ( rule__Range__Alternatives_1_0_0 ) ) )
            // InternalKconfig.g:2039:1: ( ( rule__Range__Alternatives_1_0_0 ) )
            {
            // InternalKconfig.g:2039:1: ( ( rule__Range__Alternatives_1_0_0 ) )
            // InternalKconfig.g:2040:2: ( rule__Range__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1_0_0()); 
            }
            // InternalKconfig.g:2041:2: ( rule__Range__Alternatives_1_0_0 )
            // InternalKconfig.g:2041:3: rule__Range__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_0__0__Impl"


    // $ANTLR start "rule__Range__Group_1_0__1"
    // InternalKconfig.g:2049:1: rule__Range__Group_1_0__1 : rule__Range__Group_1_0__1__Impl ;
    public final void rule__Range__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2053:1: ( rule__Range__Group_1_0__1__Impl )
            // InternalKconfig.g:2054:2: rule__Range__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_0__1"


    // $ANTLR start "rule__Range__Group_1_0__1__Impl"
    // InternalKconfig.g:2060:1: rule__Range__Group_1_0__1__Impl : ( ( rule__Range__Alternatives_1_0_1 ) ) ;
    public final void rule__Range__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2064:1: ( ( ( rule__Range__Alternatives_1_0_1 ) ) )
            // InternalKconfig.g:2065:1: ( ( rule__Range__Alternatives_1_0_1 ) )
            {
            // InternalKconfig.g:2065:1: ( ( rule__Range__Alternatives_1_0_1 ) )
            // InternalKconfig.g:2066:2: ( rule__Range__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getAlternatives_1_0_1()); 
            }
            // InternalKconfig.g:2067:2: ( rule__Range__Alternatives_1_0_1 )
            // InternalKconfig.g:2067:3: rule__Range__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getAlternatives_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_0__1__Impl"


    // $ANTLR start "rule__Range__Group_1_1__0"
    // InternalKconfig.g:2076:1: rule__Range__Group_1_1__0 : rule__Range__Group_1_1__0__Impl rule__Range__Group_1_1__1 ;
    public final void rule__Range__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2080:1: ( rule__Range__Group_1_1__0__Impl rule__Range__Group_1_1__1 )
            // InternalKconfig.g:2081:2: rule__Range__Group_1_1__0__Impl rule__Range__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Range__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_1__0"


    // $ANTLR start "rule__Range__Group_1_1__0__Impl"
    // InternalKconfig.g:2088:1: rule__Range__Group_1_1__0__Impl : ( ( rule__Range__HfromAssignment_1_1_0 ) ) ;
    public final void rule__Range__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2092:1: ( ( ( rule__Range__HfromAssignment_1_1_0 ) ) )
            // InternalKconfig.g:2093:1: ( ( rule__Range__HfromAssignment_1_1_0 ) )
            {
            // InternalKconfig.g:2093:1: ( ( rule__Range__HfromAssignment_1_1_0 ) )
            // InternalKconfig.g:2094:2: ( rule__Range__HfromAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHfromAssignment_1_1_0()); 
            }
            // InternalKconfig.g:2095:2: ( rule__Range__HfromAssignment_1_1_0 )
            // InternalKconfig.g:2095:3: rule__Range__HfromAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Range__HfromAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHfromAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_1__0__Impl"


    // $ANTLR start "rule__Range__Group_1_1__1"
    // InternalKconfig.g:2103:1: rule__Range__Group_1_1__1 : rule__Range__Group_1_1__1__Impl ;
    public final void rule__Range__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2107:1: ( rule__Range__Group_1_1__1__Impl )
            // InternalKconfig.g:2108:2: rule__Range__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_1__1"


    // $ANTLR start "rule__Range__Group_1_1__1__Impl"
    // InternalKconfig.g:2114:1: rule__Range__Group_1_1__1__Impl : ( ( rule__Range__HtoAssignment_1_1_1 ) ) ;
    public final void rule__Range__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2118:1: ( ( ( rule__Range__HtoAssignment_1_1_1 ) ) )
            // InternalKconfig.g:2119:1: ( ( rule__Range__HtoAssignment_1_1_1 ) )
            {
            // InternalKconfig.g:2119:1: ( ( rule__Range__HtoAssignment_1_1_1 ) )
            // InternalKconfig.g:2120:2: ( rule__Range__HtoAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHtoAssignment_1_1_1()); 
            }
            // InternalKconfig.g:2121:2: ( rule__Range__HtoAssignment_1_1_1 )
            // InternalKconfig.g:2121:3: rule__Range__HtoAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__HtoAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHtoAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_1_1__1__Impl"


    // $ANTLR start "rule__Range__Group_2__0"
    // InternalKconfig.g:2130:1: rule__Range__Group_2__0 : rule__Range__Group_2__0__Impl rule__Range__Group_2__1 ;
    public final void rule__Range__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2134:1: ( rule__Range__Group_2__0__Impl rule__Range__Group_2__1 )
            // InternalKconfig.g:2135:2: rule__Range__Group_2__0__Impl rule__Range__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Range__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Range__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__0"


    // $ANTLR start "rule__Range__Group_2__0__Impl"
    // InternalKconfig.g:2142:1: rule__Range__Group_2__0__Impl : ( 'if' ) ;
    public final void rule__Range__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2146:1: ( ( 'if' ) )
            // InternalKconfig.g:2147:1: ( 'if' )
            {
            // InternalKconfig.g:2147:1: ( 'if' )
            // InternalKconfig.g:2148:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIfKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIfKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__0__Impl"


    // $ANTLR start "rule__Range__Group_2__1"
    // InternalKconfig.g:2157:1: rule__Range__Group_2__1 : rule__Range__Group_2__1__Impl ;
    public final void rule__Range__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2161:1: ( rule__Range__Group_2__1__Impl )
            // InternalKconfig.g:2162:2: rule__Range__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__1"


    // $ANTLR start "rule__Range__Group_2__1__Impl"
    // InternalKconfig.g:2168:1: rule__Range__Group_2__1__Impl : ( ( rule__Range__KconfigExprAssignment_2_1 ) ) ;
    public final void rule__Range__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2172:1: ( ( ( rule__Range__KconfigExprAssignment_2_1 ) ) )
            // InternalKconfig.g:2173:1: ( ( rule__Range__KconfigExprAssignment_2_1 ) )
            {
            // InternalKconfig.g:2173:1: ( ( rule__Range__KconfigExprAssignment_2_1 ) )
            // InternalKconfig.g:2174:2: ( rule__Range__KconfigExprAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getKconfigExprAssignment_2_1()); 
            }
            // InternalKconfig.g:2175:2: ( rule__Range__KconfigExprAssignment_2_1 )
            // InternalKconfig.g:2175:3: rule__Range__KconfigExprAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__KconfigExprAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getKconfigExprAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__1__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // InternalKconfig.g:2184:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2188:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalKconfig.g:2189:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Expr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // InternalKconfig.g:2196:1: rule__Expr__Group__0__Impl : ( ruleNeqLiteral ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2200:1: ( ( ruleNeqLiteral ) )
            // InternalKconfig.g:2201:1: ( ruleNeqLiteral )
            {
            // InternalKconfig.g:2201:1: ( ruleNeqLiteral )
            // InternalKconfig.g:2202:2: ruleNeqLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getNeqLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNeqLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getNeqLiteralParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // InternalKconfig.g:2211:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2215:1: ( rule__Expr__Group__1__Impl )
            // InternalKconfig.g:2216:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // InternalKconfig.g:2222:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2226:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // InternalKconfig.g:2227:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // InternalKconfig.g:2227:1: ( ( rule__Expr__Group_1__0 )* )
            // InternalKconfig.g:2228:2: ( rule__Expr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup_1()); 
            }
            // InternalKconfig.g:2229:2: ( rule__Expr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKconfig.g:2229:3: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // InternalKconfig.g:2238:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2242:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalKconfig.g:2243:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // InternalKconfig.g:2250:1: rule__Expr__Group_1__0__Impl : ( () ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2254:1: ( ( () ) )
            // InternalKconfig.g:2255:1: ( () )
            {
            // InternalKconfig.g:2255:1: ( () )
            // InternalKconfig.g:2256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprLeftAction_1_0()); 
            }
            // InternalKconfig.g:2257:2: ()
            // InternalKconfig.g:2257:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // InternalKconfig.g:2265:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2 ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2269:1: ( rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2 )
            // InternalKconfig.g:2270:2: rule__Expr__Group_1__1__Impl rule__Expr__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // InternalKconfig.g:2277:1: rule__Expr__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2281:1: ( ( '=' ) )
            // InternalKconfig.g:2282:1: ( '=' )
            {
            // InternalKconfig.g:2282:1: ( '=' )
            // InternalKconfig.g:2283:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__2"
    // InternalKconfig.g:2292:1: rule__Expr__Group_1__2 : rule__Expr__Group_1__2__Impl ;
    public final void rule__Expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2296:1: ( rule__Expr__Group_1__2__Impl )
            // InternalKconfig.g:2297:2: rule__Expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__2"


    // $ANTLR start "rule__Expr__Group_1__2__Impl"
    // InternalKconfig.g:2303:1: rule__Expr__Group_1__2__Impl : ( ( rule__Expr__RightAssignment_1_2 ) ) ;
    public final void rule__Expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2307:1: ( ( ( rule__Expr__RightAssignment_1_2 ) ) )
            // InternalKconfig.g:2308:1: ( ( rule__Expr__RightAssignment_1_2 ) )
            {
            // InternalKconfig.g:2308:1: ( ( rule__Expr__RightAssignment_1_2 ) )
            // InternalKconfig.g:2309:2: ( rule__Expr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getRightAssignment_1_2()); 
            }
            // InternalKconfig.g:2310:2: ( rule__Expr__RightAssignment_1_2 )
            // InternalKconfig.g:2310:3: rule__Expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__2__Impl"


    // $ANTLR start "rule__NeqLiteral__Group__0"
    // InternalKconfig.g:2319:1: rule__NeqLiteral__Group__0 : rule__NeqLiteral__Group__0__Impl rule__NeqLiteral__Group__1 ;
    public final void rule__NeqLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2323:1: ( rule__NeqLiteral__Group__0__Impl rule__NeqLiteral__Group__1 )
            // InternalKconfig.g:2324:2: rule__NeqLiteral__Group__0__Impl rule__NeqLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NeqLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group__0"


    // $ANTLR start "rule__NeqLiteral__Group__0__Impl"
    // InternalKconfig.g:2331:1: rule__NeqLiteral__Group__0__Impl : ( ruleSecondaryLiteral ) ;
    public final void rule__NeqLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2335:1: ( ( ruleSecondaryLiteral ) )
            // InternalKconfig.g:2336:1: ( ruleSecondaryLiteral )
            {
            // InternalKconfig.g:2336:1: ( ruleSecondaryLiteral )
            // InternalKconfig.g:2337:2: ruleSecondaryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getSecondaryLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecondaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getSecondaryLiteralParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group__0__Impl"


    // $ANTLR start "rule__NeqLiteral__Group__1"
    // InternalKconfig.g:2346:1: rule__NeqLiteral__Group__1 : rule__NeqLiteral__Group__1__Impl ;
    public final void rule__NeqLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2350:1: ( rule__NeqLiteral__Group__1__Impl )
            // InternalKconfig.g:2351:2: rule__NeqLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group__1"


    // $ANTLR start "rule__NeqLiteral__Group__1__Impl"
    // InternalKconfig.g:2357:1: rule__NeqLiteral__Group__1__Impl : ( ( rule__NeqLiteral__Group_1__0 )* ) ;
    public final void rule__NeqLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2361:1: ( ( ( rule__NeqLiteral__Group_1__0 )* ) )
            // InternalKconfig.g:2362:1: ( ( rule__NeqLiteral__Group_1__0 )* )
            {
            // InternalKconfig.g:2362:1: ( ( rule__NeqLiteral__Group_1__0 )* )
            // InternalKconfig.g:2363:2: ( rule__NeqLiteral__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getGroup_1()); 
            }
            // InternalKconfig.g:2364:2: ( rule__NeqLiteral__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKconfig.g:2364:3: rule__NeqLiteral__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NeqLiteral__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group__1__Impl"


    // $ANTLR start "rule__NeqLiteral__Group_1__0"
    // InternalKconfig.g:2373:1: rule__NeqLiteral__Group_1__0 : rule__NeqLiteral__Group_1__0__Impl rule__NeqLiteral__Group_1__1 ;
    public final void rule__NeqLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2377:1: ( rule__NeqLiteral__Group_1__0__Impl rule__NeqLiteral__Group_1__1 )
            // InternalKconfig.g:2378:2: rule__NeqLiteral__Group_1__0__Impl rule__NeqLiteral__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__NeqLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__0"


    // $ANTLR start "rule__NeqLiteral__Group_1__0__Impl"
    // InternalKconfig.g:2385:1: rule__NeqLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__NeqLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2389:1: ( ( () ) )
            // InternalKconfig.g:2390:1: ( () )
            {
            // InternalKconfig.g:2390:1: ( () )
            // InternalKconfig.g:2391:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getNeqLiteralLeftAction_1_0()); 
            }
            // InternalKconfig.g:2392:2: ()
            // InternalKconfig.g:2392:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getNeqLiteralLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__NeqLiteral__Group_1__1"
    // InternalKconfig.g:2400:1: rule__NeqLiteral__Group_1__1 : rule__NeqLiteral__Group_1__1__Impl rule__NeqLiteral__Group_1__2 ;
    public final void rule__NeqLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2404:1: ( rule__NeqLiteral__Group_1__1__Impl rule__NeqLiteral__Group_1__2 )
            // InternalKconfig.g:2405:2: rule__NeqLiteral__Group_1__1__Impl rule__NeqLiteral__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__NeqLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__1"


    // $ANTLR start "rule__NeqLiteral__Group_1__1__Impl"
    // InternalKconfig.g:2412:1: rule__NeqLiteral__Group_1__1__Impl : ( '!=' ) ;
    public final void rule__NeqLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2416:1: ( ( '!=' ) )
            // InternalKconfig.g:2417:1: ( '!=' )
            {
            // InternalKconfig.g:2417:1: ( '!=' )
            // InternalKconfig.g:2418:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getExclamationMarkEqualsSignKeyword_1_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getExclamationMarkEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__NeqLiteral__Group_1__2"
    // InternalKconfig.g:2427:1: rule__NeqLiteral__Group_1__2 : rule__NeqLiteral__Group_1__2__Impl ;
    public final void rule__NeqLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2431:1: ( rule__NeqLiteral__Group_1__2__Impl )
            // InternalKconfig.g:2432:2: rule__NeqLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__2"


    // $ANTLR start "rule__NeqLiteral__Group_1__2__Impl"
    // InternalKconfig.g:2438:1: rule__NeqLiteral__Group_1__2__Impl : ( ( rule__NeqLiteral__RightAssignment_1_2 ) ) ;
    public final void rule__NeqLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2442:1: ( ( ( rule__NeqLiteral__RightAssignment_1_2 ) ) )
            // InternalKconfig.g:2443:1: ( ( rule__NeqLiteral__RightAssignment_1_2 ) )
            {
            // InternalKconfig.g:2443:1: ( ( rule__NeqLiteral__RightAssignment_1_2 ) )
            // InternalKconfig.g:2444:2: ( rule__NeqLiteral__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getRightAssignment_1_2()); 
            }
            // InternalKconfig.g:2445:2: ( rule__NeqLiteral__RightAssignment_1_2 )
            // InternalKconfig.g:2445:3: rule__NeqLiteral__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NeqLiteral__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__AndLiteral__Group__0"
    // InternalKconfig.g:2454:1: rule__AndLiteral__Group__0 : rule__AndLiteral__Group__0__Impl rule__AndLiteral__Group__1 ;
    public final void rule__AndLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2458:1: ( rule__AndLiteral__Group__0__Impl rule__AndLiteral__Group__1 )
            // InternalKconfig.g:2459:2: rule__AndLiteral__Group__0__Impl rule__AndLiteral__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AndLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group__0"


    // $ANTLR start "rule__AndLiteral__Group__0__Impl"
    // InternalKconfig.g:2466:1: rule__AndLiteral__Group__0__Impl : ( ruleOrLiteral ) ;
    public final void rule__AndLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2470:1: ( ( ruleOrLiteral ) )
            // InternalKconfig.g:2471:1: ( ruleOrLiteral )
            {
            // InternalKconfig.g:2471:1: ( ruleOrLiteral )
            // InternalKconfig.g:2472:2: ruleOrLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getOrLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getOrLiteralParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group__0__Impl"


    // $ANTLR start "rule__AndLiteral__Group__1"
    // InternalKconfig.g:2481:1: rule__AndLiteral__Group__1 : rule__AndLiteral__Group__1__Impl ;
    public final void rule__AndLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2485:1: ( rule__AndLiteral__Group__1__Impl )
            // InternalKconfig.g:2486:2: rule__AndLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group__1"


    // $ANTLR start "rule__AndLiteral__Group__1__Impl"
    // InternalKconfig.g:2492:1: rule__AndLiteral__Group__1__Impl : ( ( rule__AndLiteral__Group_1__0 )* ) ;
    public final void rule__AndLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2496:1: ( ( ( rule__AndLiteral__Group_1__0 )* ) )
            // InternalKconfig.g:2497:1: ( ( rule__AndLiteral__Group_1__0 )* )
            {
            // InternalKconfig.g:2497:1: ( ( rule__AndLiteral__Group_1__0 )* )
            // InternalKconfig.g:2498:2: ( rule__AndLiteral__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getGroup_1()); 
            }
            // InternalKconfig.g:2499:2: ( rule__AndLiteral__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKconfig.g:2499:3: rule__AndLiteral__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__AndLiteral__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group__1__Impl"


    // $ANTLR start "rule__AndLiteral__Group_1__0"
    // InternalKconfig.g:2508:1: rule__AndLiteral__Group_1__0 : rule__AndLiteral__Group_1__0__Impl rule__AndLiteral__Group_1__1 ;
    public final void rule__AndLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2512:1: ( rule__AndLiteral__Group_1__0__Impl rule__AndLiteral__Group_1__1 )
            // InternalKconfig.g:2513:2: rule__AndLiteral__Group_1__0__Impl rule__AndLiteral__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__AndLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__0"


    // $ANTLR start "rule__AndLiteral__Group_1__0__Impl"
    // InternalKconfig.g:2520:1: rule__AndLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__AndLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2524:1: ( ( () ) )
            // InternalKconfig.g:2525:1: ( () )
            {
            // InternalKconfig.g:2525:1: ( () )
            // InternalKconfig.g:2526:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getAndLiteralLeftAction_1_0()); 
            }
            // InternalKconfig.g:2527:2: ()
            // InternalKconfig.g:2527:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getAndLiteralLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__AndLiteral__Group_1__1"
    // InternalKconfig.g:2535:1: rule__AndLiteral__Group_1__1 : rule__AndLiteral__Group_1__1__Impl rule__AndLiteral__Group_1__2 ;
    public final void rule__AndLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2539:1: ( rule__AndLiteral__Group_1__1__Impl rule__AndLiteral__Group_1__2 )
            // InternalKconfig.g:2540:2: rule__AndLiteral__Group_1__1__Impl rule__AndLiteral__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__AndLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__1"


    // $ANTLR start "rule__AndLiteral__Group_1__1__Impl"
    // InternalKconfig.g:2547:1: rule__AndLiteral__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2551:1: ( ( '&&' ) )
            // InternalKconfig.g:2552:1: ( '&&' )
            {
            // InternalKconfig.g:2552:1: ( '&&' )
            // InternalKconfig.g:2553:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getAmpersandAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__AndLiteral__Group_1__2"
    // InternalKconfig.g:2562:1: rule__AndLiteral__Group_1__2 : rule__AndLiteral__Group_1__2__Impl ;
    public final void rule__AndLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2566:1: ( rule__AndLiteral__Group_1__2__Impl )
            // InternalKconfig.g:2567:2: rule__AndLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__2"


    // $ANTLR start "rule__AndLiteral__Group_1__2__Impl"
    // InternalKconfig.g:2573:1: rule__AndLiteral__Group_1__2__Impl : ( ( rule__AndLiteral__RightAssignment_1_2 ) ) ;
    public final void rule__AndLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2577:1: ( ( ( rule__AndLiteral__RightAssignment_1_2 ) ) )
            // InternalKconfig.g:2578:1: ( ( rule__AndLiteral__RightAssignment_1_2 ) )
            {
            // InternalKconfig.g:2578:1: ( ( rule__AndLiteral__RightAssignment_1_2 ) )
            // InternalKconfig.g:2579:2: ( rule__AndLiteral__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getRightAssignment_1_2()); 
            }
            // InternalKconfig.g:2580:2: ( rule__AndLiteral__RightAssignment_1_2 )
            // InternalKconfig.g:2580:3: rule__AndLiteral__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndLiteral__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__OrLiteral__Group__0"
    // InternalKconfig.g:2589:1: rule__OrLiteral__Group__0 : rule__OrLiteral__Group__0__Impl rule__OrLiteral__Group__1 ;
    public final void rule__OrLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2593:1: ( rule__OrLiteral__Group__0__Impl rule__OrLiteral__Group__1 )
            // InternalKconfig.g:2594:2: rule__OrLiteral__Group__0__Impl rule__OrLiteral__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__OrLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group__0"


    // $ANTLR start "rule__OrLiteral__Group__0__Impl"
    // InternalKconfig.g:2601:1: rule__OrLiteral__Group__0__Impl : ( rulePrimaryLiteral ) ;
    public final void rule__OrLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2605:1: ( ( rulePrimaryLiteral ) )
            // InternalKconfig.g:2606:1: ( rulePrimaryLiteral )
            {
            // InternalKconfig.g:2606:1: ( rulePrimaryLiteral )
            // InternalKconfig.g:2607:2: rulePrimaryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getPrimaryLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getPrimaryLiteralParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group__0__Impl"


    // $ANTLR start "rule__OrLiteral__Group__1"
    // InternalKconfig.g:2616:1: rule__OrLiteral__Group__1 : rule__OrLiteral__Group__1__Impl ;
    public final void rule__OrLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2620:1: ( rule__OrLiteral__Group__1__Impl )
            // InternalKconfig.g:2621:2: rule__OrLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group__1"


    // $ANTLR start "rule__OrLiteral__Group__1__Impl"
    // InternalKconfig.g:2627:1: rule__OrLiteral__Group__1__Impl : ( ( rule__OrLiteral__Group_1__0 )* ) ;
    public final void rule__OrLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2631:1: ( ( ( rule__OrLiteral__Group_1__0 )* ) )
            // InternalKconfig.g:2632:1: ( ( rule__OrLiteral__Group_1__0 )* )
            {
            // InternalKconfig.g:2632:1: ( ( rule__OrLiteral__Group_1__0 )* )
            // InternalKconfig.g:2633:2: ( rule__OrLiteral__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getGroup_1()); 
            }
            // InternalKconfig.g:2634:2: ( rule__OrLiteral__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKconfig.g:2634:3: rule__OrLiteral__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OrLiteral__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group__1__Impl"


    // $ANTLR start "rule__OrLiteral__Group_1__0"
    // InternalKconfig.g:2643:1: rule__OrLiteral__Group_1__0 : rule__OrLiteral__Group_1__0__Impl rule__OrLiteral__Group_1__1 ;
    public final void rule__OrLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2647:1: ( rule__OrLiteral__Group_1__0__Impl rule__OrLiteral__Group_1__1 )
            // InternalKconfig.g:2648:2: rule__OrLiteral__Group_1__0__Impl rule__OrLiteral__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__OrLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__0"


    // $ANTLR start "rule__OrLiteral__Group_1__0__Impl"
    // InternalKconfig.g:2655:1: rule__OrLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__OrLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2659:1: ( ( () ) )
            // InternalKconfig.g:2660:1: ( () )
            {
            // InternalKconfig.g:2660:1: ( () )
            // InternalKconfig.g:2661:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getOrLiteralLeftAction_1_0()); 
            }
            // InternalKconfig.g:2662:2: ()
            // InternalKconfig.g:2662:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getOrLiteralLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__OrLiteral__Group_1__1"
    // InternalKconfig.g:2670:1: rule__OrLiteral__Group_1__1 : rule__OrLiteral__Group_1__1__Impl rule__OrLiteral__Group_1__2 ;
    public final void rule__OrLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2674:1: ( rule__OrLiteral__Group_1__1__Impl rule__OrLiteral__Group_1__2 )
            // InternalKconfig.g:2675:2: rule__OrLiteral__Group_1__1__Impl rule__OrLiteral__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__OrLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__1"


    // $ANTLR start "rule__OrLiteral__Group_1__1__Impl"
    // InternalKconfig.g:2682:1: rule__OrLiteral__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2686:1: ( ( '||' ) )
            // InternalKconfig.g:2687:1: ( '||' )
            {
            // InternalKconfig.g:2687:1: ( '||' )
            // InternalKconfig.g:2688:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__OrLiteral__Group_1__2"
    // InternalKconfig.g:2697:1: rule__OrLiteral__Group_1__2 : rule__OrLiteral__Group_1__2__Impl ;
    public final void rule__OrLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2701:1: ( rule__OrLiteral__Group_1__2__Impl )
            // InternalKconfig.g:2702:2: rule__OrLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__2"


    // $ANTLR start "rule__OrLiteral__Group_1__2__Impl"
    // InternalKconfig.g:2708:1: rule__OrLiteral__Group_1__2__Impl : ( ( rule__OrLiteral__RightAssignment_1_2 ) ) ;
    public final void rule__OrLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2712:1: ( ( ( rule__OrLiteral__RightAssignment_1_2 ) ) )
            // InternalKconfig.g:2713:1: ( ( rule__OrLiteral__RightAssignment_1_2 ) )
            {
            // InternalKconfig.g:2713:1: ( ( rule__OrLiteral__RightAssignment_1_2 ) )
            // InternalKconfig.g:2714:2: ( rule__OrLiteral__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getRightAssignment_1_2()); 
            }
            // InternalKconfig.g:2715:2: ( rule__OrLiteral__RightAssignment_1_2 )
            // InternalKconfig.g:2715:3: rule__OrLiteral__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrLiteral__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__0"
    // InternalKconfig.g:2724:1: rule__PrimaryLiteral__Group_1__0 : rule__PrimaryLiteral__Group_1__0__Impl rule__PrimaryLiteral__Group_1__1 ;
    public final void rule__PrimaryLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2728:1: ( rule__PrimaryLiteral__Group_1__0__Impl rule__PrimaryLiteral__Group_1__1 )
            // InternalKconfig.g:2729:2: rule__PrimaryLiteral__Group_1__0__Impl rule__PrimaryLiteral__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryLiteral__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryLiteral__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__0"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__0__Impl"
    // InternalKconfig.g:2736:1: rule__PrimaryLiteral__Group_1__0__Impl : ( ( '!' )? ) ;
    public final void rule__PrimaryLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2740:1: ( ( ( '!' )? ) )
            // InternalKconfig.g:2741:1: ( ( '!' )? )
            {
            // InternalKconfig.g:2741:1: ( ( '!' )? )
            // InternalKconfig.g:2742:2: ( '!' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getExclamationMarkKeyword_1_0()); 
            }
            // InternalKconfig.g:2743:2: ( '!' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKconfig.g:2743:3: '!'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getExclamationMarkKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__1"
    // InternalKconfig.g:2751:1: rule__PrimaryLiteral__Group_1__1 : rule__PrimaryLiteral__Group_1__1__Impl rule__PrimaryLiteral__Group_1__2 ;
    public final void rule__PrimaryLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2755:1: ( rule__PrimaryLiteral__Group_1__1__Impl rule__PrimaryLiteral__Group_1__2 )
            // InternalKconfig.g:2756:2: rule__PrimaryLiteral__Group_1__1__Impl rule__PrimaryLiteral__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryLiteral__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryLiteral__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__1"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__1__Impl"
    // InternalKconfig.g:2763:1: rule__PrimaryLiteral__Group_1__1__Impl : ( '(' ) ;
    public final void rule__PrimaryLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2767:1: ( ( '(' ) )
            // InternalKconfig.g:2768:1: ( '(' )
            {
            // InternalKconfig.g:2768:1: ( '(' )
            // InternalKconfig.g:2769:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getLeftParenthesisKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__2"
    // InternalKconfig.g:2778:1: rule__PrimaryLiteral__Group_1__2 : rule__PrimaryLiteral__Group_1__2__Impl rule__PrimaryLiteral__Group_1__3 ;
    public final void rule__PrimaryLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2782:1: ( rule__PrimaryLiteral__Group_1__2__Impl rule__PrimaryLiteral__Group_1__3 )
            // InternalKconfig.g:2783:2: rule__PrimaryLiteral__Group_1__2__Impl rule__PrimaryLiteral__Group_1__3
            {
            pushFollow(FOLLOW_26);
            rule__PrimaryLiteral__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryLiteral__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__2"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__2__Impl"
    // InternalKconfig.g:2790:1: rule__PrimaryLiteral__Group_1__2__Impl : ( ruleExpr ) ;
    public final void rule__PrimaryLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2794:1: ( ( ruleExpr ) )
            // InternalKconfig.g:2795:1: ( ruleExpr )
            {
            // InternalKconfig.g:2795:1: ( ruleExpr )
            // InternalKconfig.g:2796:2: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getExprParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getExprParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__3"
    // InternalKconfig.g:2805:1: rule__PrimaryLiteral__Group_1__3 : rule__PrimaryLiteral__Group_1__3__Impl ;
    public final void rule__PrimaryLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2809:1: ( rule__PrimaryLiteral__Group_1__3__Impl )
            // InternalKconfig.g:2810:2: rule__PrimaryLiteral__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryLiteral__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__3"


    // $ANTLR start "rule__PrimaryLiteral__Group_1__3__Impl"
    // InternalKconfig.g:2816:1: rule__PrimaryLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__PrimaryLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2820:1: ( ( ')' ) )
            // InternalKconfig.g:2821:1: ( ')' )
            {
            // InternalKconfig.g:2821:1: ( ')' )
            // InternalKconfig.g:2822:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__Group_1__3__Impl"


    // $ANTLR start "rule__ConfigLiteral__Group_0__0"
    // InternalKconfig.g:2832:1: rule__ConfigLiteral__Group_0__0 : rule__ConfigLiteral__Group_0__0__Impl rule__ConfigLiteral__Group_0__1 ;
    public final void rule__ConfigLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2836:1: ( rule__ConfigLiteral__Group_0__0__Impl rule__ConfigLiteral__Group_0__1 )
            // InternalKconfig.g:2837:2: rule__ConfigLiteral__Group_0__0__Impl rule__ConfigLiteral__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__ConfigLiteral__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__0"


    // $ANTLR start "rule__ConfigLiteral__Group_0__0__Impl"
    // InternalKconfig.g:2844:1: rule__ConfigLiteral__Group_0__0__Impl : ( ( '!' )? ) ;
    public final void rule__ConfigLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2848:1: ( ( ( '!' )? ) )
            // InternalKconfig.g:2849:1: ( ( '!' )? )
            {
            // InternalKconfig.g:2849:1: ( ( '!' )? )
            // InternalKconfig.g:2850:2: ( '!' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getExclamationMarkKeyword_0_0()); 
            }
            // InternalKconfig.g:2851:2: ( '!' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKconfig.g:2851:3: '!'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getExclamationMarkKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__ConfigLiteral__Group_0__1"
    // InternalKconfig.g:2859:1: rule__ConfigLiteral__Group_0__1 : rule__ConfigLiteral__Group_0__1__Impl rule__ConfigLiteral__Group_0__2 ;
    public final void rule__ConfigLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2863:1: ( rule__ConfigLiteral__Group_0__1__Impl rule__ConfigLiteral__Group_0__2 )
            // InternalKconfig.g:2864:2: rule__ConfigLiteral__Group_0__1__Impl rule__ConfigLiteral__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__ConfigLiteral__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__1"


    // $ANTLR start "rule__ConfigLiteral__Group_0__1__Impl"
    // InternalKconfig.g:2871:1: rule__ConfigLiteral__Group_0__1__Impl : ( ( rule__ConfigLiteral__ConfAssignment_0_1 ) ) ;
    public final void rule__ConfigLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2875:1: ( ( ( rule__ConfigLiteral__ConfAssignment_0_1 ) ) )
            // InternalKconfig.g:2876:1: ( ( rule__ConfigLiteral__ConfAssignment_0_1 ) )
            {
            // InternalKconfig.g:2876:1: ( ( rule__ConfigLiteral__ConfAssignment_0_1 ) )
            // InternalKconfig.g:2877:2: ( rule__ConfigLiteral__ConfAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getConfAssignment_0_1()); 
            }
            // InternalKconfig.g:2878:2: ( rule__ConfigLiteral__ConfAssignment_0_1 )
            // InternalKconfig.g:2878:3: rule__ConfigLiteral__ConfAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__ConfAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getConfAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__ConfigLiteral__Group_0__2"
    // InternalKconfig.g:2886:1: rule__ConfigLiteral__Group_0__2 : rule__ConfigLiteral__Group_0__2__Impl ;
    public final void rule__ConfigLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2890:1: ( rule__ConfigLiteral__Group_0__2__Impl )
            // InternalKconfig.g:2891:2: rule__ConfigLiteral__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__2"


    // $ANTLR start "rule__ConfigLiteral__Group_0__2__Impl"
    // InternalKconfig.g:2897:1: rule__ConfigLiteral__Group_0__2__Impl : ( ( rule__ConfigLiteral__Group_0_2__0 )? ) ;
    public final void rule__ConfigLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2901:1: ( ( ( rule__ConfigLiteral__Group_0_2__0 )? ) )
            // InternalKconfig.g:2902:1: ( ( rule__ConfigLiteral__Group_0_2__0 )? )
            {
            // InternalKconfig.g:2902:1: ( ( rule__ConfigLiteral__Group_0_2__0 )? )
            // InternalKconfig.g:2903:2: ( rule__ConfigLiteral__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getGroup_0_2()); 
            }
            // InternalKconfig.g:2904:2: ( rule__ConfigLiteral__Group_0_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_INT||(LA31_1>=19 && LA31_1<=21)) ) {
                    alt31=1;
                }
            }
            else if ( (LA31_0==23) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_INT||(LA31_2>=19 && LA31_2<=21)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalKconfig.g:2904:3: rule__ConfigLiteral__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigLiteral__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__ConfigLiteral__Group_0_2__0"
    // InternalKconfig.g:2913:1: rule__ConfigLiteral__Group_0_2__0 : rule__ConfigLiteral__Group_0_2__0__Impl rule__ConfigLiteral__Group_0_2__1 ;
    public final void rule__ConfigLiteral__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2917:1: ( rule__ConfigLiteral__Group_0_2__0__Impl rule__ConfigLiteral__Group_0_2__1 )
            // InternalKconfig.g:2918:2: rule__ConfigLiteral__Group_0_2__0__Impl rule__ConfigLiteral__Group_0_2__1
            {
            pushFollow(FOLLOW_29);
            rule__ConfigLiteral__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0_2__0"


    // $ANTLR start "rule__ConfigLiteral__Group_0_2__0__Impl"
    // InternalKconfig.g:2925:1: rule__ConfigLiteral__Group_0_2__0__Impl : ( ( rule__ConfigLiteral__Alternatives_0_2_0 ) ) ;
    public final void rule__ConfigLiteral__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2929:1: ( ( ( rule__ConfigLiteral__Alternatives_0_2_0 ) ) )
            // InternalKconfig.g:2930:1: ( ( rule__ConfigLiteral__Alternatives_0_2_0 ) )
            {
            // InternalKconfig.g:2930:1: ( ( rule__ConfigLiteral__Alternatives_0_2_0 ) )
            // InternalKconfig.g:2931:2: ( rule__ConfigLiteral__Alternatives_0_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getAlternatives_0_2_0()); 
            }
            // InternalKconfig.g:2932:2: ( rule__ConfigLiteral__Alternatives_0_2_0 )
            // InternalKconfig.g:2932:3: rule__ConfigLiteral__Alternatives_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Alternatives_0_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getAlternatives_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0_2__0__Impl"


    // $ANTLR start "rule__ConfigLiteral__Group_0_2__1"
    // InternalKconfig.g:2940:1: rule__ConfigLiteral__Group_0_2__1 : rule__ConfigLiteral__Group_0_2__1__Impl ;
    public final void rule__ConfigLiteral__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2944:1: ( rule__ConfigLiteral__Group_0_2__1__Impl )
            // InternalKconfig.g:2945:2: rule__ConfigLiteral__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0_2__1"


    // $ANTLR start "rule__ConfigLiteral__Group_0_2__1__Impl"
    // InternalKconfig.g:2951:1: rule__ConfigLiteral__Group_0_2__1__Impl : ( ( rule__ConfigLiteral__Alternatives_0_2_1 ) ) ;
    public final void rule__ConfigLiteral__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2955:1: ( ( ( rule__ConfigLiteral__Alternatives_0_2_1 ) ) )
            // InternalKconfig.g:2956:1: ( ( rule__ConfigLiteral__Alternatives_0_2_1 ) )
            {
            // InternalKconfig.g:2956:1: ( ( rule__ConfigLiteral__Alternatives_0_2_1 ) )
            // InternalKconfig.g:2957:2: ( rule__ConfigLiteral__Alternatives_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getAlternatives_0_2_1()); 
            }
            // InternalKconfig.g:2958:2: ( rule__ConfigLiteral__Alternatives_0_2_1 )
            // InternalKconfig.g:2958:3: rule__ConfigLiteral__Alternatives_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigLiteral__Alternatives_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getAlternatives_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__Group_0_2__1__Impl"


    // $ANTLR start "rule__SIGNED_INT__Group__0"
    // InternalKconfig.g:2967:1: rule__SIGNED_INT__Group__0 : rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 ;
    public final void rule__SIGNED_INT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2971:1: ( rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1 )
            // InternalKconfig.g:2972:2: rule__SIGNED_INT__Group__0__Impl rule__SIGNED_INT__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SIGNED_INT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SIGNED_INT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__0"


    // $ANTLR start "rule__SIGNED_INT__Group__0__Impl"
    // InternalKconfig.g:2979:1: rule__SIGNED_INT__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_INT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2983:1: ( ( ( '-' )? ) )
            // InternalKconfig.g:2984:1: ( ( '-' )? )
            {
            // InternalKconfig.g:2984:1: ( ( '-' )? )
            // InternalKconfig.g:2985:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKconfig.g:2986:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKconfig.g:2986:3: '-'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_INT__Group__1"
    // InternalKconfig.g:2994:1: rule__SIGNED_INT__Group__1 : rule__SIGNED_INT__Group__1__Impl ;
    public final void rule__SIGNED_INT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:2998:1: ( rule__SIGNED_INT__Group__1__Impl )
            // InternalKconfig.g:2999:2: rule__SIGNED_INT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_INT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__1"


    // $ANTLR start "rule__SIGNED_INT__Group__1__Impl"
    // InternalKconfig.g:3005:1: rule__SIGNED_INT__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SIGNED_INT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3009:1: ( ( RULE_INT ) )
            // InternalKconfig.g:3010:1: ( RULE_INT )
            {
            // InternalKconfig.g:3010:1: ( RULE_INT )
            // InternalKconfig.g:3011:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSIGNED_INTAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSIGNED_INTAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_INT__Group__1__Impl"


    // $ANTLR start "rule__Config__UnorderedGroup_2"
    // InternalKconfig.g:3021:1: rule__Config__UnorderedGroup_2 : rule__Config__UnorderedGroup_2__0 {...}?;
    public final void rule__Config__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConfigAccess().getUnorderedGroup_2());
        	
        try {
            // InternalKconfig.g:3026:1: ( rule__Config__UnorderedGroup_2__0 {...}?)
            // InternalKconfig.g:3027:2: rule__Config__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Config__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2"


    // $ANTLR start "rule__Config__UnorderedGroup_2__Impl"
    // InternalKconfig.g:3035:1: rule__Config__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) ) ) ;
    public final void rule__Config__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalKconfig.g:3040:1: ( ( ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) ) ) )
            // InternalKconfig.g:3041:3: ( ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) ) )
            {
            // InternalKconfig.g:3041:3: ( ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) ) )
            int alt37=6;
            int LA37_0 = input.LA(1);

            if ( ( LA37_0 >= 13 && LA37_0 <= 18 || LA37_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt37=2;
            }
            else if ( LA37_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt37=3;
            }
            else if ( LA37_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt37=4;
            }
            else if ( LA37_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt37=5;
            }
            else if ( LA37_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt37=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalKconfig.g:3042:3: ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) )
                    {
                    // InternalKconfig.g:3042:3: ({...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) ) )
                    // InternalKconfig.g:3043:4: {...}? => ( ( ( rule__Config__TypeAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalKconfig.g:3043:102: ( ( ( rule__Config__TypeAssignment_2_0 ) ) )
                    // InternalKconfig.g:3044:5: ( ( rule__Config__TypeAssignment_2_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalKconfig.g:3050:5: ( ( rule__Config__TypeAssignment_2_0 ) )
                    // InternalKconfig.g:3051:6: ( rule__Config__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalKconfig.g:3052:6: ( rule__Config__TypeAssignment_2_0 )
                    // InternalKconfig.g:3052:7: rule__Config__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__TypeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getTypeAssignment_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKconfig.g:3057:3: ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) )
                    {
                    // InternalKconfig.g:3057:3: ({...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) ) )
                    // InternalKconfig.g:3058:4: {...}? => ( ( ( rule__Config__PromptsAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalKconfig.g:3058:102: ( ( ( rule__Config__PromptsAssignment_2_1 ) ) )
                    // InternalKconfig.g:3059:5: ( ( rule__Config__PromptsAssignment_2_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalKconfig.g:3065:5: ( ( rule__Config__PromptsAssignment_2_1 ) )
                    // InternalKconfig.g:3066:6: ( rule__Config__PromptsAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getPromptsAssignment_2_1()); 
                    }
                    // InternalKconfig.g:3067:6: ( rule__Config__PromptsAssignment_2_1 )
                    // InternalKconfig.g:3067:7: rule__Config__PromptsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__PromptsAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getPromptsAssignment_2_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKconfig.g:3072:3: ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) )
                    {
                    // InternalKconfig.g:3072:3: ({...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) ) )
                    // InternalKconfig.g:3073:4: {...}? => ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalKconfig.g:3073:102: ( ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) ) )
                    // InternalKconfig.g:3074:5: ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2);
                    selected = true;
                    // InternalKconfig.g:3080:5: ( ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* ) )
                    // InternalKconfig.g:3081:6: ( ( rule__Config__RangesAssignment_2_2 ) ) ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* )
                    {
                    // InternalKconfig.g:3081:6: ( ( rule__Config__RangesAssignment_2_2 ) )
                    // InternalKconfig.g:3082:7: ( rule__Config__RangesAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getRangesAssignment_2_2()); 
                    }
                    // InternalKconfig.g:3083:7: ( rule__Config__RangesAssignment_2_2 )
                    // InternalKconfig.g:3083:8: rule__Config__RangesAssignment_2_2
                    {
                    pushFollow(FOLLOW_31);
                    rule__Config__RangesAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getRangesAssignment_2_2()); 
                    }

                    }

                    // InternalKconfig.g:3086:6: ( ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )* )
                    // InternalKconfig.g:3087:7: ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getRangesAssignment_2_2()); 
                    }
                    // InternalKconfig.g:3088:7: ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )*
                    loop33:
                    do {
                        int alt33=2;
                        alt33 = dfa33.predict(input);
                        switch (alt33) {
                    	case 1 :
                    	    // InternalKconfig.g:3088:8: ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2
                    	    {
                    	    pushFollow(FOLLOW_31);
                    	    rule__Config__RangesAssignment_2_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getRangesAssignment_2_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKconfig.g:3094:3: ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) )
                    {
                    // InternalKconfig.g:3094:3: ({...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) ) )
                    // InternalKconfig.g:3095:4: {...}? => ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalKconfig.g:3095:102: ( ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) ) )
                    // InternalKconfig.g:3096:5: ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3);
                    selected = true;
                    // InternalKconfig.g:3102:5: ( ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* ) )
                    // InternalKconfig.g:3103:6: ( ( rule__Config__DependenciesAssignment_2_3 ) ) ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* )
                    {
                    // InternalKconfig.g:3103:6: ( ( rule__Config__DependenciesAssignment_2_3 ) )
                    // InternalKconfig.g:3104:7: ( rule__Config__DependenciesAssignment_2_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getDependenciesAssignment_2_3()); 
                    }
                    // InternalKconfig.g:3105:7: ( rule__Config__DependenciesAssignment_2_3 )
                    // InternalKconfig.g:3105:8: rule__Config__DependenciesAssignment_2_3
                    {
                    pushFollow(FOLLOW_32);
                    rule__Config__DependenciesAssignment_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getDependenciesAssignment_2_3()); 
                    }

                    }

                    // InternalKconfig.g:3108:6: ( ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )* )
                    // InternalKconfig.g:3109:7: ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getDependenciesAssignment_2_3()); 
                    }
                    // InternalKconfig.g:3110:7: ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )*
                    loop34:
                    do {
                        int alt34=2;
                        alt34 = dfa34.predict(input);
                        switch (alt34) {
                    	case 1 :
                    	    // InternalKconfig.g:3110:8: ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3
                    	    {
                    	    pushFollow(FOLLOW_32);
                    	    rule__Config__DependenciesAssignment_2_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getDependenciesAssignment_2_3()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKconfig.g:3116:3: ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) )
                    {
                    // InternalKconfig.g:3116:3: ({...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) ) )
                    // InternalKconfig.g:3117:4: {...}? => ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4)");
                    }
                    // InternalKconfig.g:3117:102: ( ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) ) )
                    // InternalKconfig.g:3118:5: ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4);
                    selected = true;
                    // InternalKconfig.g:3124:5: ( ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* ) )
                    // InternalKconfig.g:3125:6: ( ( rule__Config__SelectsAssignment_2_4 ) ) ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* )
                    {
                    // InternalKconfig.g:3125:6: ( ( rule__Config__SelectsAssignment_2_4 ) )
                    // InternalKconfig.g:3126:7: ( rule__Config__SelectsAssignment_2_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getSelectsAssignment_2_4()); 
                    }
                    // InternalKconfig.g:3127:7: ( rule__Config__SelectsAssignment_2_4 )
                    // InternalKconfig.g:3127:8: rule__Config__SelectsAssignment_2_4
                    {
                    pushFollow(FOLLOW_33);
                    rule__Config__SelectsAssignment_2_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getSelectsAssignment_2_4()); 
                    }

                    }

                    // InternalKconfig.g:3130:6: ( ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )* )
                    // InternalKconfig.g:3131:7: ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getSelectsAssignment_2_4()); 
                    }
                    // InternalKconfig.g:3132:7: ( ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4 )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==30) ) {
                            int LA35_2 = input.LA(2);

                            if ( (LA35_2==RULE_ID) ) {
                                int LA35_3 = input.LA(3);

                                if ( (synpred3_InternalKconfig()) ) {
                                    alt35=1;
                                }


                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalKconfig.g:3132:8: ( rule__Config__SelectsAssignment_2_4 )=> rule__Config__SelectsAssignment_2_4
                    	    {
                    	    pushFollow(FOLLOW_33);
                    	    rule__Config__SelectsAssignment_2_4();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getSelectsAssignment_2_4()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalKconfig.g:3138:3: ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) )
                    {
                    // InternalKconfig.g:3138:3: ({...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) ) )
                    // InternalKconfig.g:3139:4: {...}? => ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Config__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5)");
                    }
                    // InternalKconfig.g:3139:102: ( ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) ) )
                    // InternalKconfig.g:3140:5: ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5);
                    selected = true;
                    // InternalKconfig.g:3146:5: ( ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* ) )
                    // InternalKconfig.g:3147:6: ( ( rule__Config__DefaultsAssignment_2_5 ) ) ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* )
                    {
                    // InternalKconfig.g:3147:6: ( ( rule__Config__DefaultsAssignment_2_5 ) )
                    // InternalKconfig.g:3148:7: ( rule__Config__DefaultsAssignment_2_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getDefaultsAssignment_2_5()); 
                    }
                    // InternalKconfig.g:3149:7: ( rule__Config__DefaultsAssignment_2_5 )
                    // InternalKconfig.g:3149:8: rule__Config__DefaultsAssignment_2_5
                    {
                    pushFollow(FOLLOW_34);
                    rule__Config__DefaultsAssignment_2_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getDefaultsAssignment_2_5()); 
                    }

                    }

                    // InternalKconfig.g:3152:6: ( ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )* )
                    // InternalKconfig.g:3153:7: ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigAccess().getDefaultsAssignment_2_5()); 
                    }
                    // InternalKconfig.g:3154:7: ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )*
                    loop36:
                    do {
                        int alt36=2;
                        alt36 = dfa36.predict(input);
                        switch (alt36) {
                    	case 1 :
                    	    // InternalKconfig.g:3154:8: ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5
                    	    {
                    	    pushFollow(FOLLOW_34);
                    	    rule__Config__DefaultsAssignment_2_5();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigAccess().getDefaultsAssignment_2_5()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Config__UnorderedGroup_2__0"
    // InternalKconfig.g:3168:1: rule__Config__UnorderedGroup_2__0 : rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__1 )? ;
    public final void rule__Config__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3172:1: ( rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__1 )? )
            // InternalKconfig.g:3173:2: rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_34);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalKconfig.g:3174:2: ( rule__Config__UnorderedGroup_2__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ( LA38_0 >= 13 && LA38_0 <= 18 || LA38_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalKconfig.g:3174:2: rule__Config__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__UnorderedGroup_2__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__0"


    // $ANTLR start "rule__Config__UnorderedGroup_2__1"
    // InternalKconfig.g:3180:1: rule__Config__UnorderedGroup_2__1 : rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__2 )? ;
    public final void rule__Config__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3184:1: ( rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__2 )? )
            // InternalKconfig.g:3185:2: rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_34);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalKconfig.g:3186:2: ( rule__Config__UnorderedGroup_2__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ( LA39_0 >= 13 && LA39_0 <= 18 || LA39_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKconfig.g:3186:2: rule__Config__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__UnorderedGroup_2__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__1"


    // $ANTLR start "rule__Config__UnorderedGroup_2__2"
    // InternalKconfig.g:3192:1: rule__Config__UnorderedGroup_2__2 : rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__3 )? ;
    public final void rule__Config__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3196:1: ( rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__3 )? )
            // InternalKconfig.g:3197:2: rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_34);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalKconfig.g:3198:2: ( rule__Config__UnorderedGroup_2__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ( LA40_0 >= 13 && LA40_0 <= 18 || LA40_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt40=1;
            }
            else if ( LA40_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalKconfig.g:3198:2: rule__Config__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__UnorderedGroup_2__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__2"


    // $ANTLR start "rule__Config__UnorderedGroup_2__3"
    // InternalKconfig.g:3204:1: rule__Config__UnorderedGroup_2__3 : rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__4 )? ;
    public final void rule__Config__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3208:1: ( rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__4 )? )
            // InternalKconfig.g:3209:2: rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__4 )?
            {
            pushFollow(FOLLOW_34);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalKconfig.g:3210:2: ( rule__Config__UnorderedGroup_2__4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ( LA41_0 >= 13 && LA41_0 <= 18 || LA41_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt41=1;
            }
            else if ( LA41_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKconfig.g:3210:2: rule__Config__UnorderedGroup_2__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__UnorderedGroup_2__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__3"


    // $ANTLR start "rule__Config__UnorderedGroup_2__4"
    // InternalKconfig.g:3216:1: rule__Config__UnorderedGroup_2__4 : rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__5 )? ;
    public final void rule__Config__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3220:1: ( rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__5 )? )
            // InternalKconfig.g:3221:2: rule__Config__UnorderedGroup_2__Impl ( rule__Config__UnorderedGroup_2__5 )?
            {
            pushFollow(FOLLOW_34);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalKconfig.g:3222:2: ( rule__Config__UnorderedGroup_2__5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ( LA42_0 >= 13 && LA42_0 <= 18 || LA42_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 4) ) {
                alt42=1;
            }
            else if ( LA42_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigAccess().getUnorderedGroup_2(), 5) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalKconfig.g:3222:2: rule__Config__UnorderedGroup_2__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__UnorderedGroup_2__5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__4"


    // $ANTLR start "rule__Config__UnorderedGroup_2__5"
    // InternalKconfig.g:3228:1: rule__Config__UnorderedGroup_2__5 : rule__Config__UnorderedGroup_2__Impl ;
    public final void rule__Config__UnorderedGroup_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3232:1: ( rule__Config__UnorderedGroup_2__Impl )
            // InternalKconfig.g:3233:2: rule__Config__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__UnorderedGroup_2__5"


    // $ANTLR start "rule__Model__ChoicesAssignment_0"
    // InternalKconfig.g:3240:1: rule__Model__ChoicesAssignment_0 : ( ruleChoice ) ;
    public final void rule__Model__ChoicesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3244:1: ( ( ruleChoice ) )
            // InternalKconfig.g:3245:2: ( ruleChoice )
            {
            // InternalKconfig.g:3245:2: ( ruleChoice )
            // InternalKconfig.g:3246:3: ruleChoice
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getChoicesChoiceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleChoice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getChoicesChoiceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ChoicesAssignment_0"


    // $ANTLR start "rule__Model__SourcesAssignment_1"
    // InternalKconfig.g:3255:1: rule__Model__SourcesAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3259:1: ( ( ruleImport ) )
            // InternalKconfig.g:3260:2: ( ruleImport )
            {
            // InternalKconfig.g:3260:2: ( ruleImport )
            // InternalKconfig.g:3261:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSourcesImportParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SourcesAssignment_1"


    // $ANTLR start "rule__Model__ConfigsAssignment_2"
    // InternalKconfig.g:3270:1: rule__Model__ConfigsAssignment_2 : ( ruleConfig ) ;
    public final void rule__Model__ConfigsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3274:1: ( ( ruleConfig ) )
            // InternalKconfig.g:3275:2: ( ruleConfig )
            {
            // InternalKconfig.g:3275:2: ( ruleConfig )
            // InternalKconfig.g:3276:3: ruleConfig
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConfigsConfigParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConfigsConfigParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConfigsAssignment_2"


    // $ANTLR start "rule__Choice__ChoiceAssignment_0"
    // InternalKconfig.g:3285:1: rule__Choice__ChoiceAssignment_0 : ( ( 'choice' ) ) ;
    public final void rule__Choice__ChoiceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3289:1: ( ( ( 'choice' ) ) )
            // InternalKconfig.g:3290:2: ( ( 'choice' ) )
            {
            // InternalKconfig.g:3290:2: ( ( 'choice' ) )
            // InternalKconfig.g:3291:3: ( 'choice' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceChoiceKeyword_0_0()); 
            }
            // InternalKconfig.g:3292:3: ( 'choice' )
            // InternalKconfig.g:3293:4: 'choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceChoiceKeyword_0_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getChoiceChoiceKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getChoiceChoiceKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__ChoiceAssignment_0"


    // $ANTLR start "rule__Choice__ConfigsAssignment_1"
    // InternalKconfig.g:3304:1: rule__Choice__ConfigsAssignment_1 : ( ruleConfig ) ;
    public final void rule__Choice__ConfigsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3308:1: ( ( ruleConfig ) )
            // InternalKconfig.g:3309:2: ( ruleConfig )
            {
            // InternalKconfig.g:3309:2: ( ruleConfig )
            // InternalKconfig.g:3310:3: ruleConfig
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getConfigsConfigParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getConfigsConfigParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__ConfigsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalKconfig.g:3319:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3323:1: ( ( ruleQualifiedName ) )
            // InternalKconfig.g:3324:2: ( ruleQualifiedName )
            {
            // InternalKconfig.g:3324:2: ( ruleQualifiedName )
            // InternalKconfig.g:3325:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Config__NameAssignment_1"
    // InternalKconfig.g:3334:1: rule__Config__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Config__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3338:1: ( ( RULE_ID ) )
            // InternalKconfig.g:3339:2: ( RULE_ID )
            {
            // InternalKconfig.g:3339:2: ( RULE_ID )
            // InternalKconfig.g:3340:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__NameAssignment_1"


    // $ANTLR start "rule__Config__TypeAssignment_2_0"
    // InternalKconfig.g:3349:1: rule__Config__TypeAssignment_2_0 : ( ruleType ) ;
    public final void rule__Config__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3353:1: ( ( ruleType ) )
            // InternalKconfig.g:3354:2: ( ruleType )
            {
            // InternalKconfig.g:3354:2: ( ruleType )
            // InternalKconfig.g:3355:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getTypeTypeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getTypeTypeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__TypeAssignment_2_0"


    // $ANTLR start "rule__Config__PromptsAssignment_2_1"
    // InternalKconfig.g:3364:1: rule__Config__PromptsAssignment_2_1 : ( rulePrompt ) ;
    public final void rule__Config__PromptsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3368:1: ( ( rulePrompt ) )
            // InternalKconfig.g:3369:2: ( rulePrompt )
            {
            // InternalKconfig.g:3369:2: ( rulePrompt )
            // InternalKconfig.g:3370:3: rulePrompt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getPromptsPromptParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrompt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getPromptsPromptParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__PromptsAssignment_2_1"


    // $ANTLR start "rule__Config__RangesAssignment_2_2"
    // InternalKconfig.g:3379:1: rule__Config__RangesAssignment_2_2 : ( ruleRange ) ;
    public final void rule__Config__RangesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3383:1: ( ( ruleRange ) )
            // InternalKconfig.g:3384:2: ( ruleRange )
            {
            // InternalKconfig.g:3384:2: ( ruleRange )
            // InternalKconfig.g:3385:3: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getRangesRangeParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getRangesRangeParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__RangesAssignment_2_2"


    // $ANTLR start "rule__Config__DependenciesAssignment_2_3"
    // InternalKconfig.g:3394:1: rule__Config__DependenciesAssignment_2_3 : ( ruleDependency ) ;
    public final void rule__Config__DependenciesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3398:1: ( ( ruleDependency ) )
            // InternalKconfig.g:3399:2: ( ruleDependency )
            {
            // InternalKconfig.g:3399:2: ( ruleDependency )
            // InternalKconfig.g:3400:3: ruleDependency
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getDependenciesDependencyParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getDependenciesDependencyParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__DependenciesAssignment_2_3"


    // $ANTLR start "rule__Config__SelectsAssignment_2_4"
    // InternalKconfig.g:3409:1: rule__Config__SelectsAssignment_2_4 : ( ruleSelect ) ;
    public final void rule__Config__SelectsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3413:1: ( ( ruleSelect ) )
            // InternalKconfig.g:3414:2: ( ruleSelect )
            {
            // InternalKconfig.g:3414:2: ( ruleSelect )
            // InternalKconfig.g:3415:3: ruleSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getSelectsSelectParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getSelectsSelectParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__SelectsAssignment_2_4"


    // $ANTLR start "rule__Config__DefaultsAssignment_2_5"
    // InternalKconfig.g:3424:1: rule__Config__DefaultsAssignment_2_5 : ( ruleDefault ) ;
    public final void rule__Config__DefaultsAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3428:1: ( ( ruleDefault ) )
            // InternalKconfig.g:3429:2: ( ruleDefault )
            {
            // InternalKconfig.g:3429:2: ( ruleDefault )
            // InternalKconfig.g:3430:3: ruleDefault
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigAccess().getDefaultsDefaultParserRuleCall_2_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigAccess().getDefaultsDefaultParserRuleCall_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__DefaultsAssignment_2_5"


    // $ANTLR start "rule__Type__TypeAssignment_0_0"
    // InternalKconfig.g:3439:1: rule__Type__TypeAssignment_0_0 : ( ( 'string' ) ) ;
    public final void rule__Type__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3443:1: ( ( ( 'string' ) ) )
            // InternalKconfig.g:3444:2: ( ( 'string' ) )
            {
            // InternalKconfig.g:3444:2: ( ( 'string' ) )
            // InternalKconfig.g:3445:3: ( 'string' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_0()); 
            }
            // InternalKconfig.g:3446:3: ( 'string' )
            // InternalKconfig.g:3447:4: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_0_0"


    // $ANTLR start "rule__Type__TpromptAssignment_0_1"
    // InternalKconfig.g:3458:1: rule__Type__TpromptAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Type__TpromptAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3462:1: ( ( RULE_STRING ) )
            // InternalKconfig.g:3463:2: ( RULE_STRING )
            {
            // InternalKconfig.g:3463:2: ( RULE_STRING )
            // InternalKconfig.g:3464:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TpromptAssignment_0_1"


    // $ANTLR start "rule__Type__TypeAssignment_1_0"
    // InternalKconfig.g:3473:1: rule__Type__TypeAssignment_1_0 : ( ( rule__Type__TypeAlternatives_1_0_0 ) ) ;
    public final void rule__Type__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3477:1: ( ( ( rule__Type__TypeAlternatives_1_0_0 ) ) )
            // InternalKconfig.g:3478:2: ( ( rule__Type__TypeAlternatives_1_0_0 ) )
            {
            // InternalKconfig.g:3478:2: ( ( rule__Type__TypeAlternatives_1_0_0 ) )
            // InternalKconfig.g:3479:3: ( rule__Type__TypeAlternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAlternatives_1_0_0()); 
            }
            // InternalKconfig.g:3480:3: ( rule__Type__TypeAlternatives_1_0_0 )
            // InternalKconfig.g:3480:4: rule__Type__TypeAlternatives_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAlternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAlternatives_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1_0"


    // $ANTLR start "rule__Type__TpromptAssignment_1_1"
    // InternalKconfig.g:3488:1: rule__Type__TpromptAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Type__TpromptAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3492:1: ( ( RULE_STRING ) )
            // InternalKconfig.g:3493:2: ( RULE_STRING )
            {
            // InternalKconfig.g:3493:2: ( RULE_STRING )
            // InternalKconfig.g:3494:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTpromptSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TpromptAssignment_1_1"


    // $ANTLR start "rule__Type__KconfigExprAssignment_1_2_1"
    // InternalKconfig.g:3503:1: rule__Type__KconfigExprAssignment_1_2_1 : ( ruleExpr ) ;
    public final void rule__Type__KconfigExprAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3507:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3508:2: ( ruleExpr )
            {
            // InternalKconfig.g:3508:2: ( ruleExpr )
            // InternalKconfig.g:3509:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__KconfigExprAssignment_1_2_1"


    // $ANTLR start "rule__Type__TypeAssignment_2_0"
    // InternalKconfig.g:3518:1: rule__Type__TypeAssignment_2_0 : ( ( rule__Type__TypeAlternatives_2_0_0 ) ) ;
    public final void rule__Type__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3522:1: ( ( ( rule__Type__TypeAlternatives_2_0_0 ) ) )
            // InternalKconfig.g:3523:2: ( ( rule__Type__TypeAlternatives_2_0_0 ) )
            {
            // InternalKconfig.g:3523:2: ( ( rule__Type__TypeAlternatives_2_0_0 ) )
            // InternalKconfig.g:3524:3: ( rule__Type__TypeAlternatives_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAlternatives_2_0_0()); 
            }
            // InternalKconfig.g:3525:3: ( rule__Type__TypeAlternatives_2_0_0 )
            // InternalKconfig.g:3525:4: rule__Type__TypeAlternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAlternatives_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAlternatives_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_2_0"


    // $ANTLR start "rule__Type__DefAssignment_2_1"
    // InternalKconfig.g:3533:1: rule__Type__DefAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Type__DefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3537:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3538:2: ( ruleExpr )
            {
            // InternalKconfig.g:3538:2: ( ruleExpr )
            // InternalKconfig.g:3539:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getDefExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getDefExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DefAssignment_2_1"


    // $ANTLR start "rule__Type__KconfigExprAssignment_2_2_1"
    // InternalKconfig.g:3548:1: rule__Type__KconfigExprAssignment_2_2_1 : ( ruleExpr ) ;
    public final void rule__Type__KconfigExprAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3552:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3553:2: ( ruleExpr )
            {
            // InternalKconfig.g:3553:2: ( ruleExpr )
            // InternalKconfig.g:3554:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getKconfigExprExprParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__KconfigExprAssignment_2_2_1"


    // $ANTLR start "rule__Dependency__DepsAssignment_1"
    // InternalKconfig.g:3563:1: rule__Dependency__DepsAssignment_1 : ( ruleExpr ) ;
    public final void rule__Dependency__DepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3567:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3568:2: ( ruleExpr )
            {
            // InternalKconfig.g:3568:2: ( ruleExpr )
            // InternalKconfig.g:3569:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDependencyAccess().getDepsExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDependencyAccess().getDepsExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__DepsAssignment_1"


    // $ANTLR start "rule__Select__SelectAssignment_1"
    // InternalKconfig.g:3578:1: rule__Select__SelectAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Select__SelectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3582:1: ( ( ( RULE_ID ) ) )
            // InternalKconfig.g:3583:2: ( ( RULE_ID ) )
            {
            // InternalKconfig.g:3583:2: ( ( RULE_ID ) )
            // InternalKconfig.g:3584:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectConfigCrossReference_1_0()); 
            }
            // InternalKconfig.g:3585:3: ( RULE_ID )
            // InternalKconfig.g:3586:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getSelectConfigIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectConfigIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getSelectConfigCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAssignment_1"


    // $ANTLR start "rule__Select__ExprAssignment_2_1"
    // InternalKconfig.g:3597:1: rule__Select__ExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Select__ExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3601:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3602:2: ( ruleExpr )
            {
            // InternalKconfig.g:3602:2: ( ruleExpr )
            // InternalKconfig.g:3603:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectAccess().getExprExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectAccess().getExprExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ExprAssignment_2_1"


    // $ANTLR start "rule__Default__ValueAssignment_1_0"
    // InternalKconfig.g:3612:1: rule__Default__ValueAssignment_1_0 : ( ruleExpr ) ;
    public final void rule__Default__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3616:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3617:2: ( ruleExpr )
            {
            // InternalKconfig.g:3617:2: ( ruleExpr )
            // InternalKconfig.g:3618:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getValueExprParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getValueExprParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__ValueAssignment_1_0"


    // $ANTLR start "rule__Default__TrivalAssignment_1_1"
    // InternalKconfig.g:3627:1: rule__Default__TrivalAssignment_1_1 : ( ( rule__Default__TrivalAlternatives_1_1_0 ) ) ;
    public final void rule__Default__TrivalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3631:1: ( ( ( rule__Default__TrivalAlternatives_1_1_0 ) ) )
            // InternalKconfig.g:3632:2: ( ( rule__Default__TrivalAlternatives_1_1_0 ) )
            {
            // InternalKconfig.g:3632:2: ( ( rule__Default__TrivalAlternatives_1_1_0 ) )
            // InternalKconfig.g:3633:3: ( rule__Default__TrivalAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getTrivalAlternatives_1_1_0()); 
            }
            // InternalKconfig.g:3634:3: ( rule__Default__TrivalAlternatives_1_1_0 )
            // InternalKconfig.g:3634:4: rule__Default__TrivalAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Default__TrivalAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getTrivalAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__TrivalAssignment_1_1"


    // $ANTLR start "rule__Default__HexAssignment_1_2"
    // InternalKconfig.g:3642:1: rule__Default__HexAssignment_1_2 : ( RULE_HEX_TERMINAL ) ;
    public final void rule__Default__HexAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3646:1: ( ( RULE_HEX_TERMINAL ) )
            // InternalKconfig.g:3647:2: ( RULE_HEX_TERMINAL )
            {
            // InternalKconfig.g:3647:2: ( RULE_HEX_TERMINAL )
            // InternalKconfig.g:3648:3: RULE_HEX_TERMINAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getHexHEX_TERMINALTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_HEX_TERMINAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getHexHEX_TERMINALTerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__HexAssignment_1_2"


    // $ANTLR start "rule__Default__IntAssignment_1_3"
    // InternalKconfig.g:3657:1: rule__Default__IntAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Default__IntAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3661:1: ( ( RULE_INT ) )
            // InternalKconfig.g:3662:2: ( RULE_INT )
            {
            // InternalKconfig.g:3662:2: ( RULE_INT )
            // InternalKconfig.g:3663:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getIntINTTerminalRuleCall_1_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getIntINTTerminalRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__IntAssignment_1_3"


    // $ANTLR start "rule__Default__KconfigExprAssignment_2_1"
    // InternalKconfig.g:3672:1: rule__Default__KconfigExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Default__KconfigExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3676:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3677:2: ( ruleExpr )
            {
            // InternalKconfig.g:3677:2: ( ruleExpr )
            // InternalKconfig.g:3678:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__KconfigExprAssignment_2_1"


    // $ANTLR start "rule__Prompt__ValueAssignment_1"
    // InternalKconfig.g:3687:1: rule__Prompt__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Prompt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3691:1: ( ( RULE_STRING ) )
            // InternalKconfig.g:3692:2: ( RULE_STRING )
            {
            // InternalKconfig.g:3692:2: ( RULE_STRING )
            // InternalKconfig.g:3693:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__ValueAssignment_1"


    // $ANTLR start "rule__Prompt__KconfigExprAssignment_2_1"
    // InternalKconfig.g:3702:1: rule__Prompt__KconfigExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Prompt__KconfigExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3706:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3707:2: ( ruleExpr )
            {
            // InternalKconfig.g:3707:2: ( ruleExpr )
            // InternalKconfig.g:3708:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPromptAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPromptAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prompt__KconfigExprAssignment_2_1"


    // $ANTLR start "rule__Range__IfromAssignment_1_0_0_0"
    // InternalKconfig.g:3717:1: rule__Range__IfromAssignment_1_0_0_0 : ( ruleSIGNED_INT ) ;
    public final void rule__Range__IfromAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3721:1: ( ( ruleSIGNED_INT ) )
            // InternalKconfig.g:3722:2: ( ruleSIGNED_INT )
            {
            // InternalKconfig.g:3722:2: ( ruleSIGNED_INT )
            // InternalKconfig.g:3723:3: ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIfromSIGNED_INTParserRuleCall_1_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIfromSIGNED_INTParserRuleCall_1_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__IfromAssignment_1_0_0_0"


    // $ANTLR start "rule__Range__IconfromAssignment_1_0_0_1"
    // InternalKconfig.g:3732:1: rule__Range__IconfromAssignment_1_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Range__IconfromAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3736:1: ( ( ( RULE_ID ) ) )
            // InternalKconfig.g:3737:2: ( ( RULE_ID ) )
            {
            // InternalKconfig.g:3737:2: ( ( RULE_ID ) )
            // InternalKconfig.g:3738:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIconfromConfigCrossReference_1_0_0_1_0()); 
            }
            // InternalKconfig.g:3739:3: ( RULE_ID )
            // InternalKconfig.g:3740:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIconfromConfigIDTerminalRuleCall_1_0_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIconfromConfigIDTerminalRuleCall_1_0_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIconfromConfigCrossReference_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__IconfromAssignment_1_0_0_1"


    // $ANTLR start "rule__Range__ItoAssignment_1_0_1_0"
    // InternalKconfig.g:3751:1: rule__Range__ItoAssignment_1_0_1_0 : ( ruleSIGNED_INT ) ;
    public final void rule__Range__ItoAssignment_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3755:1: ( ( ruleSIGNED_INT ) )
            // InternalKconfig.g:3756:2: ( ruleSIGNED_INT )
            {
            // InternalKconfig.g:3756:2: ( ruleSIGNED_INT )
            // InternalKconfig.g:3757:3: ruleSIGNED_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getItoSIGNED_INTParserRuleCall_1_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSIGNED_INT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getItoSIGNED_INTParserRuleCall_1_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__ItoAssignment_1_0_1_0"


    // $ANTLR start "rule__Range__IconftoAssignment_1_0_1_1"
    // InternalKconfig.g:3766:1: rule__Range__IconftoAssignment_1_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Range__IconftoAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3770:1: ( ( ( RULE_ID ) ) )
            // InternalKconfig.g:3771:2: ( ( RULE_ID ) )
            {
            // InternalKconfig.g:3771:2: ( ( RULE_ID ) )
            // InternalKconfig.g:3772:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIconftoConfigCrossReference_1_0_1_1_0()); 
            }
            // InternalKconfig.g:3773:3: ( RULE_ID )
            // InternalKconfig.g:3774:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getIconftoConfigIDTerminalRuleCall_1_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIconftoConfigIDTerminalRuleCall_1_0_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getIconftoConfigCrossReference_1_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__IconftoAssignment_1_0_1_1"


    // $ANTLR start "rule__Range__HfromAssignment_1_1_0"
    // InternalKconfig.g:3785:1: rule__Range__HfromAssignment_1_1_0 : ( RULE_HEX_TERMINAL ) ;
    public final void rule__Range__HfromAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3789:1: ( ( RULE_HEX_TERMINAL ) )
            // InternalKconfig.g:3790:2: ( RULE_HEX_TERMINAL )
            {
            // InternalKconfig.g:3790:2: ( RULE_HEX_TERMINAL )
            // InternalKconfig.g:3791:3: RULE_HEX_TERMINAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHfromHEX_TERMINALTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_HEX_TERMINAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHfromHEX_TERMINALTerminalRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__HfromAssignment_1_1_0"


    // $ANTLR start "rule__Range__HtoAssignment_1_1_1"
    // InternalKconfig.g:3800:1: rule__Range__HtoAssignment_1_1_1 : ( RULE_HEX_TERMINAL ) ;
    public final void rule__Range__HtoAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3804:1: ( ( RULE_HEX_TERMINAL ) )
            // InternalKconfig.g:3805:2: ( RULE_HEX_TERMINAL )
            {
            // InternalKconfig.g:3805:2: ( RULE_HEX_TERMINAL )
            // InternalKconfig.g:3806:3: RULE_HEX_TERMINAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHtoHEX_TERMINALTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_HEX_TERMINAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHtoHEX_TERMINALTerminalRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__HtoAssignment_1_1_1"


    // $ANTLR start "rule__Range__KconfigExprAssignment_2_1"
    // InternalKconfig.g:3815:1: rule__Range__KconfigExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Range__KconfigExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3819:1: ( ( ruleExpr ) )
            // InternalKconfig.g:3820:2: ( ruleExpr )
            {
            // InternalKconfig.g:3820:2: ( ruleExpr )
            // InternalKconfig.g:3821:3: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getKconfigExprExprParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__KconfigExprAssignment_2_1"


    // $ANTLR start "rule__Expr__RightAssignment_1_2"
    // InternalKconfig.g:3830:1: rule__Expr__RightAssignment_1_2 : ( ruleNeqLiteral ) ;
    public final void rule__Expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3834:1: ( ( ruleNeqLiteral ) )
            // InternalKconfig.g:3835:2: ( ruleNeqLiteral )
            {
            // InternalKconfig.g:3835:2: ( ruleNeqLiteral )
            // InternalKconfig.g:3836:3: ruleNeqLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getRightNeqLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNeqLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getRightNeqLiteralParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__RightAssignment_1_2"


    // $ANTLR start "rule__NeqLiteral__RightAssignment_1_2"
    // InternalKconfig.g:3845:1: rule__NeqLiteral__RightAssignment_1_2 : ( ruleSecondaryLiteral ) ;
    public final void rule__NeqLiteral__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3849:1: ( ( ruleSecondaryLiteral ) )
            // InternalKconfig.g:3850:2: ( ruleSecondaryLiteral )
            {
            // InternalKconfig.g:3850:2: ( ruleSecondaryLiteral )
            // InternalKconfig.g:3851:3: ruleSecondaryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNeqLiteralAccess().getRightSecondaryLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSecondaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNeqLiteralAccess().getRightSecondaryLiteralParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeqLiteral__RightAssignment_1_2"


    // $ANTLR start "rule__AndLiteral__RightAssignment_1_2"
    // InternalKconfig.g:3860:1: rule__AndLiteral__RightAssignment_1_2 : ( ruleOrLiteral ) ;
    public final void rule__AndLiteral__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3864:1: ( ( ruleOrLiteral ) )
            // InternalKconfig.g:3865:2: ( ruleOrLiteral )
            {
            // InternalKconfig.g:3865:2: ( ruleOrLiteral )
            // InternalKconfig.g:3866:3: ruleOrLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndLiteralAccess().getRightOrLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndLiteralAccess().getRightOrLiteralParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndLiteral__RightAssignment_1_2"


    // $ANTLR start "rule__OrLiteral__RightAssignment_1_2"
    // InternalKconfig.g:3875:1: rule__OrLiteral__RightAssignment_1_2 : ( rulePrimaryLiteral ) ;
    public final void rule__OrLiteral__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3879:1: ( ( rulePrimaryLiteral ) )
            // InternalKconfig.g:3880:2: ( rulePrimaryLiteral )
            {
            // InternalKconfig.g:3880:2: ( rulePrimaryLiteral )
            // InternalKconfig.g:3881:3: rulePrimaryLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrLiteralAccess().getRightPrimaryLiteralParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrLiteralAccess().getRightPrimaryLiteralParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrLiteral__RightAssignment_1_2"


    // $ANTLR start "rule__PrimaryLiteral__ConfslitAssignment_0"
    // InternalKconfig.g:3890:1: rule__PrimaryLiteral__ConfslitAssignment_0 : ( ruleConfigLiteral ) ;
    public final void rule__PrimaryLiteral__ConfslitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3894:1: ( ( ruleConfigLiteral ) )
            // InternalKconfig.g:3895:2: ( ruleConfigLiteral )
            {
            // InternalKconfig.g:3895:2: ( ruleConfigLiteral )
            // InternalKconfig.g:3896:3: ruleConfigLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryLiteralAccess().getConfslitConfigLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryLiteralAccess().getConfslitConfigLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryLiteral__ConfslitAssignment_0"


    // $ANTLR start "rule__ConfigLiteral__ConfAssignment_0_1"
    // InternalKconfig.g:3905:1: rule__ConfigLiteral__ConfAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConfigLiteral__ConfAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3909:1: ( ( ( RULE_ID ) ) )
            // InternalKconfig.g:3910:2: ( ( RULE_ID ) )
            {
            // InternalKconfig.g:3910:2: ( ( RULE_ID ) )
            // InternalKconfig.g:3911:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getConfConfigCrossReference_0_1_0()); 
            }
            // InternalKconfig.g:3912:3: ( RULE_ID )
            // InternalKconfig.g:3913:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getConfConfigIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getConfConfigIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getConfConfigCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__ConfAssignment_0_1"


    // $ANTLR start "rule__ConfigLiteral__StringAssignment_1"
    // InternalKconfig.g:3924:1: rule__ConfigLiteral__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigLiteral__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKconfig.g:3928:1: ( ( RULE_STRING ) )
            // InternalKconfig.g:3929:2: ( RULE_STRING )
            {
            // InternalKconfig.g:3929:2: ( RULE_STRING )
            // InternalKconfig.g:3930:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigLiteralAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigLiteralAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigLiteral__StringAssignment_1"

    // $ANTLR start synpred1_InternalKconfig
    public final void synpred1_InternalKconfig_fragment() throws RecognitionException {   
        // InternalKconfig.g:3088:8: ( rule__Config__RangesAssignment_2_2 )
        // InternalKconfig.g:3088:9: rule__Config__RangesAssignment_2_2
        {
        pushFollow(FOLLOW_2);
        rule__Config__RangesAssignment_2_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKconfig

    // $ANTLR start synpred2_InternalKconfig
    public final void synpred2_InternalKconfig_fragment() throws RecognitionException {   
        // InternalKconfig.g:3110:8: ( rule__Config__DependenciesAssignment_2_3 )
        // InternalKconfig.g:3110:9: rule__Config__DependenciesAssignment_2_3
        {
        pushFollow(FOLLOW_2);
        rule__Config__DependenciesAssignment_2_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKconfig

    // $ANTLR start synpred3_InternalKconfig
    public final void synpred3_InternalKconfig_fragment() throws RecognitionException {   
        // InternalKconfig.g:3132:8: ( rule__Config__SelectsAssignment_2_4 )
        // InternalKconfig.g:3132:9: rule__Config__SelectsAssignment_2_4
        {
        pushFollow(FOLLOW_2);
        rule__Config__SelectsAssignment_2_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalKconfig

    // $ANTLR start synpred4_InternalKconfig
    public final void synpred4_InternalKconfig_fragment() throws RecognitionException {   
        // InternalKconfig.g:3154:8: ( rule__Config__DefaultsAssignment_2_5 )
        // InternalKconfig.g:3154:9: rule__Config__DefaultsAssignment_2_5
        {
        pushFollow(FOLLOW_2);
        rule__Config__DefaultsAssignment_2_5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalKconfig

    // Delegated rules

    public final boolean synpred1_InternalKconfig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKconfig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalKconfig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalKconfig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKconfig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKconfig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKconfig() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKconfig_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\6\1\uffff\4\4\1\10\1\4\3\0\1\uffff";
    static final String dfa_4s = "\1\51\1\uffff\1\47\1\4\2\47\1\10\1\4\3\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\11\uffff\1\1";
    static final String dfa_6s = "\10\uffff\1\2\1\0\1\1\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\6\1\5\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\2\6\uffff\2\1",
            "",
            "\1\4\1\5\2\uffff\1\6\36\uffff\1\3",
            "\1\4",
            "\1\10\1\11\41\uffff\1\7",
            "\1\10\1\11\41\uffff\1\7",
            "\1\12",
            "\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3088:7: ( ( rule__Config__RangesAssignment_2_2 )=> rule__Config__RangesAssignment_2_2 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKconfig()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKconfig()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKconfig()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\1\23\uffff";
    static final String dfa_10s = "\1\6\11\uffff\1\0\11\uffff";
    static final String dfa_11s = "\1\51\11\uffff\1\0\11\uffff";
    static final String dfa_12s = "\1\uffff\1\2\21\uffff\1\1";
    static final String dfa_13s = "\12\uffff\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\6\uffff\6\1\5\uffff\2\1\1\uffff\1\1\1\uffff\1\12\4\1\6\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3110:7: ( ( rule__Config__DependenciesAssignment_2_3 )=> rule__Config__DependenciesAssignment_2_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKconfig()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\6\13\uffff\1\0\7\uffff";
    static final String dfa_16s = "\1\51\13\uffff\1\0\7\uffff";
    static final String dfa_17s = "\14\uffff\1\0\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\6\uffff\6\1\5\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\14\2\1\6\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_12;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 3154:7: ( ( rule__Config__DefaultsAssignment_2_5 )=> rule__Config__DefaultsAssignment_2_5 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_12 = input.LA(1);

                         
                        int index36_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalKconfig()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001000A000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001000A000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000203E007E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000030000000A0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000030003801B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000130L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000380010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000203E007E002L});

}
