package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.Semester_Project_DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemester_Project_DslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'var'", "'sensor'", "','", "'ssid'", "'password'", "'ip'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSemester_Project_DslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemester_Project_DslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemester_Project_DslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSemester_Project_Dsl.g"; }


    	private Semester_Project_DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(Semester_Project_DslGrammarAccess grammarAccess) {
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
    // InternalSemester_Project_Dsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:54:1: ( ruleModel EOF )
            // InternalSemester_Project_Dsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalSemester_Project_Dsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSemester_Project_Dsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:69:3: ( rule__Model__Group__0 )
            // InternalSemester_Project_Dsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalSemester_Project_Dsl.g:78:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:79:1: ( ruleVariable EOF )
            // InternalSemester_Project_Dsl.g:80:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSemester_Project_Dsl.g:87:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:91:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:92:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:92:2: ( ( rule__Variable__Group__0 ) )
            // InternalSemester_Project_Dsl.g:93:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:94:3: ( rule__Variable__Group__0 )
            // InternalSemester_Project_Dsl.g:94:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSensor"
    // InternalSemester_Project_Dsl.g:103:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:104:1: ( ruleSensor EOF )
            // InternalSemester_Project_Dsl.g:105:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSemester_Project_Dsl.g:112:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:116:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:117:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:117:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSemester_Project_Dsl.g:118:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:119:3: ( rule__Sensor__Group__0 )
            // InternalSemester_Project_Dsl.g:119:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleCredentials"
    // InternalSemester_Project_Dsl.g:128:1: entryRuleCredentials : ruleCredentials EOF ;
    public final void entryRuleCredentials() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:129:1: ( ruleCredentials EOF )
            // InternalSemester_Project_Dsl.g:130:1: ruleCredentials EOF
            {
             before(grammarAccess.getCredentialsRule()); 
            pushFollow(FOLLOW_1);
            ruleCredentials();

            state._fsp--;

             after(grammarAccess.getCredentialsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCredentials"


    // $ANTLR start "ruleCredentials"
    // InternalSemester_Project_Dsl.g:137:1: ruleCredentials : ( ( rule__Credentials__Alternatives ) ) ;
    public final void ruleCredentials() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:141:2: ( ( ( rule__Credentials__Alternatives ) ) )
            // InternalSemester_Project_Dsl.g:142:2: ( ( rule__Credentials__Alternatives ) )
            {
            // InternalSemester_Project_Dsl.g:142:2: ( ( rule__Credentials__Alternatives ) )
            // InternalSemester_Project_Dsl.g:143:3: ( rule__Credentials__Alternatives )
            {
             before(grammarAccess.getCredentialsAccess().getAlternatives()); 
            // InternalSemester_Project_Dsl.g:144:3: ( rule__Credentials__Alternatives )
            // InternalSemester_Project_Dsl.g:144:4: rule__Credentials__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Credentials__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCredentials"


    // $ANTLR start "entryRuleSSID"
    // InternalSemester_Project_Dsl.g:153:1: entryRuleSSID : ruleSSID EOF ;
    public final void entryRuleSSID() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:154:1: ( ruleSSID EOF )
            // InternalSemester_Project_Dsl.g:155:1: ruleSSID EOF
            {
             before(grammarAccess.getSSIDRule()); 
            pushFollow(FOLLOW_1);
            ruleSSID();

            state._fsp--;

             after(grammarAccess.getSSIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSSID"


    // $ANTLR start "ruleSSID"
    // InternalSemester_Project_Dsl.g:162:1: ruleSSID : ( ( rule__SSID__Group__0 ) ) ;
    public final void ruleSSID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:166:2: ( ( ( rule__SSID__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:167:2: ( ( rule__SSID__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:167:2: ( ( rule__SSID__Group__0 ) )
            // InternalSemester_Project_Dsl.g:168:3: ( rule__SSID__Group__0 )
            {
             before(grammarAccess.getSSIDAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:169:3: ( rule__SSID__Group__0 )
            // InternalSemester_Project_Dsl.g:169:4: rule__SSID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SSID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSSIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSID"


    // $ANTLR start "entryRulePassword"
    // InternalSemester_Project_Dsl.g:178:1: entryRulePassword : rulePassword EOF ;
    public final void entryRulePassword() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:179:1: ( rulePassword EOF )
            // InternalSemester_Project_Dsl.g:180:1: rulePassword EOF
            {
             before(grammarAccess.getPasswordRule()); 
            pushFollow(FOLLOW_1);
            rulePassword();

            state._fsp--;

             after(grammarAccess.getPasswordRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePassword"


    // $ANTLR start "rulePassword"
    // InternalSemester_Project_Dsl.g:187:1: rulePassword : ( ( rule__Password__Group__0 ) ) ;
    public final void rulePassword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:191:2: ( ( ( rule__Password__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:192:2: ( ( rule__Password__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:192:2: ( ( rule__Password__Group__0 ) )
            // InternalSemester_Project_Dsl.g:193:3: ( rule__Password__Group__0 )
            {
             before(grammarAccess.getPasswordAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:194:3: ( rule__Password__Group__0 )
            // InternalSemester_Project_Dsl.g:194:4: rule__Password__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Password__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPasswordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassword"


    // $ANTLR start "entryRuleIP"
    // InternalSemester_Project_Dsl.g:203:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // InternalSemester_Project_Dsl.g:204:1: ( ruleIP EOF )
            // InternalSemester_Project_Dsl.g:205:1: ruleIP EOF
            {
             before(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getIPRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalSemester_Project_Dsl.g:212:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:216:2: ( ( ( rule__IP__Group__0 ) ) )
            // InternalSemester_Project_Dsl.g:217:2: ( ( rule__IP__Group__0 ) )
            {
            // InternalSemester_Project_Dsl.g:217:2: ( ( rule__IP__Group__0 ) )
            // InternalSemester_Project_Dsl.g:218:3: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // InternalSemester_Project_Dsl.g:219:3: ( rule__IP__Group__0 )
            // InternalSemester_Project_Dsl.g:219:4: rule__IP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "rule__Credentials__Alternatives"
    // InternalSemester_Project_Dsl.g:227:1: rule__Credentials__Alternatives : ( ( ruleSSID ) | ( rulePassword ) | ( ruleIP ) );
    public final void rule__Credentials__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:231:1: ( ( ruleSSID ) | ( rulePassword ) | ( ruleIP ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSemester_Project_Dsl.g:232:2: ( ruleSSID )
                    {
                    // InternalSemester_Project_Dsl.g:232:2: ( ruleSSID )
                    // InternalSemester_Project_Dsl.g:233:3: ruleSSID
                    {
                     before(grammarAccess.getCredentialsAccess().getSSIDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSSID();

                    state._fsp--;

                     after(grammarAccess.getCredentialsAccess().getSSIDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemester_Project_Dsl.g:238:2: ( rulePassword )
                    {
                    // InternalSemester_Project_Dsl.g:238:2: ( rulePassword )
                    // InternalSemester_Project_Dsl.g:239:3: rulePassword
                    {
                     before(grammarAccess.getCredentialsAccess().getPasswordParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePassword();

                    state._fsp--;

                     after(grammarAccess.getCredentialsAccess().getPasswordParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemester_Project_Dsl.g:244:2: ( ruleIP )
                    {
                    // InternalSemester_Project_Dsl.g:244:2: ( ruleIP )
                    // InternalSemester_Project_Dsl.g:245:3: ruleIP
                    {
                     before(grammarAccess.getCredentialsAccess().getIPParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIP();

                    state._fsp--;

                     after(grammarAccess.getCredentialsAccess().getIPParserRuleCall_2()); 

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
    // $ANTLR end "rule__Credentials__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSemester_Project_Dsl.g:254:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:258:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSemester_Project_Dsl.g:259:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:266:1: rule__Model__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:270:1: ( ( 'Program' ) )
            // InternalSemester_Project_Dsl.g:271:1: ( 'Program' )
            {
            // InternalSemester_Project_Dsl.g:271:1: ( 'Program' )
            // InternalSemester_Project_Dsl.g:272:2: 'Program'
            {
             before(grammarAccess.getModelAccess().getProgramKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSemester_Project_Dsl.g:281:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:285:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSemester_Project_Dsl.g:286:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:293:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:297:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:298:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:298:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:299:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:300:2: ( rule__Model__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:300:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalSemester_Project_Dsl.g:308:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:312:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSemester_Project_Dsl.g:313:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalSemester_Project_Dsl.g:320:1: rule__Model__Group__2__Impl : ( ( rule__Model__VariablesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:324:1: ( ( ( rule__Model__VariablesAssignment_2 )* ) )
            // InternalSemester_Project_Dsl.g:325:1: ( ( rule__Model__VariablesAssignment_2 )* )
            {
            // InternalSemester_Project_Dsl.g:325:1: ( ( rule__Model__VariablesAssignment_2 )* )
            // InternalSemester_Project_Dsl.g:326:2: ( rule__Model__VariablesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_2()); 
            // InternalSemester_Project_Dsl.g:327:2: ( rule__Model__VariablesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:327:3: rule__Model__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalSemester_Project_Dsl.g:335:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:339:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalSemester_Project_Dsl.g:340:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalSemester_Project_Dsl.g:347:1: rule__Model__Group__3__Impl : ( ( rule__Model__SensorsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:351:1: ( ( ( rule__Model__SensorsAssignment_3 )* ) )
            // InternalSemester_Project_Dsl.g:352:1: ( ( rule__Model__SensorsAssignment_3 )* )
            {
            // InternalSemester_Project_Dsl.g:352:1: ( ( rule__Model__SensorsAssignment_3 )* )
            // InternalSemester_Project_Dsl.g:353:2: ( rule__Model__SensorsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getSensorsAssignment_3()); 
            // InternalSemester_Project_Dsl.g:354:2: ( rule__Model__SensorsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:354:3: rule__Model__SensorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__SensorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSensorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalSemester_Project_Dsl.g:362:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:366:1: ( rule__Model__Group__4__Impl )
            // InternalSemester_Project_Dsl.g:367:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalSemester_Project_Dsl.g:373:1: rule__Model__Group__4__Impl : ( ( rule__Model__CredentialsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:377:1: ( ( ( rule__Model__CredentialsAssignment_4 )* ) )
            // InternalSemester_Project_Dsl.g:378:1: ( ( rule__Model__CredentialsAssignment_4 )* )
            {
            // InternalSemester_Project_Dsl.g:378:1: ( ( rule__Model__CredentialsAssignment_4 )* )
            // InternalSemester_Project_Dsl.g:379:2: ( rule__Model__CredentialsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getCredentialsAssignment_4()); 
            // InternalSemester_Project_Dsl.g:380:2: ( rule__Model__CredentialsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:380:3: rule__Model__CredentialsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__CredentialsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCredentialsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalSemester_Project_Dsl.g:389:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:393:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSemester_Project_Dsl.g:394:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:401:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:405:1: ( ( 'var' ) )
            // InternalSemester_Project_Dsl.g:406:1: ( 'var' )
            {
            // InternalSemester_Project_Dsl.g:406:1: ( 'var' )
            // InternalSemester_Project_Dsl.g:407:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalSemester_Project_Dsl.g:416:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:420:1: ( rule__Variable__Group__1__Impl )
            // InternalSemester_Project_Dsl.g:421:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:427:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:431:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:432:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:432:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:433:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:434:2: ( rule__Variable__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:434:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSemester_Project_Dsl.g:443:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:447:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSemester_Project_Dsl.g:448:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:455:1: rule__Sensor__Group__0__Impl : ( 'sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:459:1: ( ( 'sensor' ) )
            // InternalSemester_Project_Dsl.g:460:1: ( 'sensor' )
            {
            // InternalSemester_Project_Dsl.g:460:1: ( 'sensor' )
            // InternalSemester_Project_Dsl.g:461:2: 'sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSemester_Project_Dsl.g:470:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:474:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSemester_Project_Dsl.g:475:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:482:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:486:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:487:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:487:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:488:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:489:2: ( rule__Sensor__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:489:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSemester_Project_Dsl.g:497:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:501:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSemester_Project_Dsl.g:502:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

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
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSemester_Project_Dsl.g:509:1: rule__Sensor__Group__2__Impl : ( ',' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:513:1: ( ( ',' ) )
            // InternalSemester_Project_Dsl.g:514:1: ( ',' )
            {
            // InternalSemester_Project_Dsl.g:514:1: ( ',' )
            // InternalSemester_Project_Dsl.g:515:2: ','
            {
             before(grammarAccess.getSensorAccess().getCommaKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalSemester_Project_Dsl.g:524:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:528:1: ( rule__Sensor__Group__3__Impl )
            // InternalSemester_Project_Dsl.g:529:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3__Impl();

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
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalSemester_Project_Dsl.g:535:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__PinAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:539:1: ( ( ( rule__Sensor__PinAssignment_3 ) ) )
            // InternalSemester_Project_Dsl.g:540:1: ( ( rule__Sensor__PinAssignment_3 ) )
            {
            // InternalSemester_Project_Dsl.g:540:1: ( ( rule__Sensor__PinAssignment_3 ) )
            // InternalSemester_Project_Dsl.g:541:2: ( rule__Sensor__PinAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getPinAssignment_3()); 
            // InternalSemester_Project_Dsl.g:542:2: ( rule__Sensor__PinAssignment_3 )
            // InternalSemester_Project_Dsl.g:542:3: rule__Sensor__PinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPinAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__SSID__Group__0"
    // InternalSemester_Project_Dsl.g:551:1: rule__SSID__Group__0 : rule__SSID__Group__0__Impl rule__SSID__Group__1 ;
    public final void rule__SSID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:555:1: ( rule__SSID__Group__0__Impl rule__SSID__Group__1 )
            // InternalSemester_Project_Dsl.g:556:2: rule__SSID__Group__0__Impl rule__SSID__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SSID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SSID__Group__1();

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
    // $ANTLR end "rule__SSID__Group__0"


    // $ANTLR start "rule__SSID__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:563:1: rule__SSID__Group__0__Impl : ( 'ssid' ) ;
    public final void rule__SSID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:567:1: ( ( 'ssid' ) )
            // InternalSemester_Project_Dsl.g:568:1: ( 'ssid' )
            {
            // InternalSemester_Project_Dsl.g:568:1: ( 'ssid' )
            // InternalSemester_Project_Dsl.g:569:2: 'ssid'
            {
             before(grammarAccess.getSSIDAccess().getSsidKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSSIDAccess().getSsidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSID__Group__0__Impl"


    // $ANTLR start "rule__SSID__Group__1"
    // InternalSemester_Project_Dsl.g:578:1: rule__SSID__Group__1 : rule__SSID__Group__1__Impl ;
    public final void rule__SSID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:582:1: ( rule__SSID__Group__1__Impl )
            // InternalSemester_Project_Dsl.g:583:2: rule__SSID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SSID__Group__1__Impl();

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
    // $ANTLR end "rule__SSID__Group__1"


    // $ANTLR start "rule__SSID__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:589:1: rule__SSID__Group__1__Impl : ( ( rule__SSID__NameAssignment_1 ) ) ;
    public final void rule__SSID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:593:1: ( ( ( rule__SSID__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:594:1: ( ( rule__SSID__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:594:1: ( ( rule__SSID__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:595:2: ( rule__SSID__NameAssignment_1 )
            {
             before(grammarAccess.getSSIDAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:596:2: ( rule__SSID__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:596:3: rule__SSID__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SSID__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSSIDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSID__Group__1__Impl"


    // $ANTLR start "rule__Password__Group__0"
    // InternalSemester_Project_Dsl.g:605:1: rule__Password__Group__0 : rule__Password__Group__0__Impl rule__Password__Group__1 ;
    public final void rule__Password__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:609:1: ( rule__Password__Group__0__Impl rule__Password__Group__1 )
            // InternalSemester_Project_Dsl.g:610:2: rule__Password__Group__0__Impl rule__Password__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Password__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Password__Group__1();

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
    // $ANTLR end "rule__Password__Group__0"


    // $ANTLR start "rule__Password__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:617:1: rule__Password__Group__0__Impl : ( 'password' ) ;
    public final void rule__Password__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:621:1: ( ( 'password' ) )
            // InternalSemester_Project_Dsl.g:622:1: ( 'password' )
            {
            // InternalSemester_Project_Dsl.g:622:1: ( 'password' )
            // InternalSemester_Project_Dsl.g:623:2: 'password'
            {
             before(grammarAccess.getPasswordAccess().getPasswordKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPasswordAccess().getPasswordKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Password__Group__0__Impl"


    // $ANTLR start "rule__Password__Group__1"
    // InternalSemester_Project_Dsl.g:632:1: rule__Password__Group__1 : rule__Password__Group__1__Impl ;
    public final void rule__Password__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:636:1: ( rule__Password__Group__1__Impl )
            // InternalSemester_Project_Dsl.g:637:2: rule__Password__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Password__Group__1__Impl();

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
    // $ANTLR end "rule__Password__Group__1"


    // $ANTLR start "rule__Password__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:643:1: rule__Password__Group__1__Impl : ( ( rule__Password__NameAssignment_1 ) ) ;
    public final void rule__Password__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:647:1: ( ( ( rule__Password__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:648:1: ( ( rule__Password__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:648:1: ( ( rule__Password__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:649:2: ( rule__Password__NameAssignment_1 )
            {
             before(grammarAccess.getPasswordAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:650:2: ( rule__Password__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:650:3: rule__Password__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Password__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPasswordAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Password__Group__1__Impl"


    // $ANTLR start "rule__IP__Group__0"
    // InternalSemester_Project_Dsl.g:659:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:663:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // InternalSemester_Project_Dsl.g:664:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__IP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__1();

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
    // $ANTLR end "rule__IP__Group__0"


    // $ANTLR start "rule__IP__Group__0__Impl"
    // InternalSemester_Project_Dsl.g:671:1: rule__IP__Group__0__Impl : ( 'ip' ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:675:1: ( ( 'ip' ) )
            // InternalSemester_Project_Dsl.g:676:1: ( 'ip' )
            {
            // InternalSemester_Project_Dsl.g:676:1: ( 'ip' )
            // InternalSemester_Project_Dsl.g:677:2: 'ip'
            {
             before(grammarAccess.getIPAccess().getIpKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getIpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0__Impl"


    // $ANTLR start "rule__IP__Group__1"
    // InternalSemester_Project_Dsl.g:686:1: rule__IP__Group__1 : rule__IP__Group__1__Impl ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:690:1: ( rule__IP__Group__1__Impl )
            // InternalSemester_Project_Dsl.g:691:2: rule__IP__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__1__Impl();

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
    // $ANTLR end "rule__IP__Group__1"


    // $ANTLR start "rule__IP__Group__1__Impl"
    // InternalSemester_Project_Dsl.g:697:1: rule__IP__Group__1__Impl : ( ( rule__IP__NameAssignment_1 ) ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:701:1: ( ( ( rule__IP__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:702:1: ( ( rule__IP__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:702:1: ( ( rule__IP__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:703:2: ( rule__IP__NameAssignment_1 )
            {
             before(grammarAccess.getIPAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:704:2: ( rule__IP__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:704:3: rule__IP__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IP__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:713:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:717:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:718:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:718:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:719:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VariablesAssignment_2"
    // InternalSemester_Project_Dsl.g:728:1: rule__Model__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:732:1: ( ( ruleVariable ) )
            // InternalSemester_Project_Dsl.g:733:2: ( ruleVariable )
            {
            // InternalSemester_Project_Dsl.g:733:2: ( ruleVariable )
            // InternalSemester_Project_Dsl.g:734:3: ruleVariable
            {
             before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment_2"


    // $ANTLR start "rule__Model__SensorsAssignment_3"
    // InternalSemester_Project_Dsl.g:743:1: rule__Model__SensorsAssignment_3 : ( ruleSensor ) ;
    public final void rule__Model__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:747:1: ( ( ruleSensor ) )
            // InternalSemester_Project_Dsl.g:748:2: ( ruleSensor )
            {
            // InternalSemester_Project_Dsl.g:748:2: ( ruleSensor )
            // InternalSemester_Project_Dsl.g:749:3: ruleSensor
            {
             before(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SensorsAssignment_3"


    // $ANTLR start "rule__Model__CredentialsAssignment_4"
    // InternalSemester_Project_Dsl.g:758:1: rule__Model__CredentialsAssignment_4 : ( ruleCredentials ) ;
    public final void rule__Model__CredentialsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:762:1: ( ( ruleCredentials ) )
            // InternalSemester_Project_Dsl.g:763:2: ( ruleCredentials )
            {
            // InternalSemester_Project_Dsl.g:763:2: ( ruleCredentials )
            // InternalSemester_Project_Dsl.g:764:3: ruleCredentials
            {
             before(grammarAccess.getModelAccess().getCredentialsCredentialsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCredentials();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCredentialsCredentialsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CredentialsAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:773:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:777:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:778:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:778:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:779:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:788:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:792:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:793:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:793:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:794:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__PinAssignment_3"
    // InternalSemester_Project_Dsl.g:803:1: rule__Sensor__PinAssignment_3 : ( RULE_INT ) ;
    public final void rule__Sensor__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:807:1: ( ( RULE_INT ) )
            // InternalSemester_Project_Dsl.g:808:2: ( RULE_INT )
            {
            // InternalSemester_Project_Dsl.g:808:2: ( RULE_INT )
            // InternalSemester_Project_Dsl.g:809:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getPinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getPinINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PinAssignment_3"


    // $ANTLR start "rule__SSID__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:818:1: rule__SSID__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SSID__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:822:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:823:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:823:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:824:3: RULE_ID
            {
             before(grammarAccess.getSSIDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSSIDAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSID__NameAssignment_1"


    // $ANTLR start "rule__Password__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:833:1: rule__Password__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Password__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:837:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:838:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:838:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:839:3: RULE_ID
            {
             before(grammarAccess.getPasswordAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPasswordAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Password__NameAssignment_1"


    // $ANTLR start "rule__IP__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:848:1: rule__IP__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IP__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:852:1: ( ( RULE_STRING ) )
            // InternalSemester_Project_Dsl.g:853:2: ( RULE_STRING )
            {
            // InternalSemester_Project_Dsl.g:853:2: ( RULE_STRING )
            // InternalSemester_Project_Dsl.g:854:3: RULE_STRING
            {
             before(grammarAccess.getIPAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003B000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}