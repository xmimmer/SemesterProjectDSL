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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'var'", "'CO2'", "'CO'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
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
    // InternalSemester_Project_Dsl.g:112:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:116:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalSemester_Project_Dsl.g:117:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalSemester_Project_Dsl.g:117:2: ( ( rule__Sensor__Alternatives ) )
            // InternalSemester_Project_Dsl.g:118:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalSemester_Project_Dsl.g:119:3: ( rule__Sensor__Alternatives )
            // InternalSemester_Project_Dsl.g:119:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalSemester_Project_Dsl.g:127:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:131:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSemester_Project_Dsl.g:132:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalSemester_Project_Dsl.g:132:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalSemester_Project_Dsl.g:133:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalSemester_Project_Dsl.g:134:3: ( rule__Sensor__Group_0__0 )
                    // InternalSemester_Project_Dsl.g:134:4: rule__Sensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemester_Project_Dsl.g:138:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalSemester_Project_Dsl.g:138:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalSemester_Project_Dsl.g:139:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalSemester_Project_Dsl.g:140:3: ( rule__Sensor__Group_1__0 )
                    // InternalSemester_Project_Dsl.g:140:4: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSemester_Project_Dsl.g:148:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:152:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSemester_Project_Dsl.g:153:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSemester_Project_Dsl.g:160:1: rule__Model__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:164:1: ( ( 'Program' ) )
            // InternalSemester_Project_Dsl.g:165:1: ( 'Program' )
            {
            // InternalSemester_Project_Dsl.g:165:1: ( 'Program' )
            // InternalSemester_Project_Dsl.g:166:2: 'Program'
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
    // InternalSemester_Project_Dsl.g:175:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:179:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalSemester_Project_Dsl.g:180:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalSemester_Project_Dsl.g:187:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:191:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:192:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:192:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:193:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:194:2: ( rule__Model__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:194:3: rule__Model__NameAssignment_1
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
    // InternalSemester_Project_Dsl.g:202:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:206:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalSemester_Project_Dsl.g:207:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalSemester_Project_Dsl.g:214:1: rule__Model__Group__2__Impl : ( ( rule__Model__VariablesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:218:1: ( ( ( rule__Model__VariablesAssignment_2 )* ) )
            // InternalSemester_Project_Dsl.g:219:1: ( ( rule__Model__VariablesAssignment_2 )* )
            {
            // InternalSemester_Project_Dsl.g:219:1: ( ( rule__Model__VariablesAssignment_2 )* )
            // InternalSemester_Project_Dsl.g:220:2: ( rule__Model__VariablesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_2()); 
            // InternalSemester_Project_Dsl.g:221:2: ( rule__Model__VariablesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:221:3: rule__Model__VariablesAssignment_2
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
    // InternalSemester_Project_Dsl.g:229:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:233:1: ( rule__Model__Group__3__Impl )
            // InternalSemester_Project_Dsl.g:234:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // InternalSemester_Project_Dsl.g:240:1: rule__Model__Group__3__Impl : ( ( rule__Model__SensorsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:244:1: ( ( ( rule__Model__SensorsAssignment_3 )* ) )
            // InternalSemester_Project_Dsl.g:245:1: ( ( rule__Model__SensorsAssignment_3 )* )
            {
            // InternalSemester_Project_Dsl.g:245:1: ( ( rule__Model__SensorsAssignment_3 )* )
            // InternalSemester_Project_Dsl.g:246:2: ( rule__Model__SensorsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getSensorsAssignment_3()); 
            // InternalSemester_Project_Dsl.g:247:2: ( rule__Model__SensorsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:247:3: rule__Model__SensorsAssignment_3
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalSemester_Project_Dsl.g:256:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:260:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalSemester_Project_Dsl.g:261:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalSemester_Project_Dsl.g:268:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:272:1: ( ( 'var' ) )
            // InternalSemester_Project_Dsl.g:273:1: ( 'var' )
            {
            // InternalSemester_Project_Dsl.g:273:1: ( 'var' )
            // InternalSemester_Project_Dsl.g:274:2: 'var'
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
    // InternalSemester_Project_Dsl.g:283:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:287:1: ( rule__Variable__Group__1__Impl )
            // InternalSemester_Project_Dsl.g:288:2: rule__Variable__Group__1__Impl
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
    // InternalSemester_Project_Dsl.g:294:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:298:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalSemester_Project_Dsl.g:299:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalSemester_Project_Dsl.g:299:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalSemester_Project_Dsl.g:300:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalSemester_Project_Dsl.g:301:2: ( rule__Variable__NameAssignment_1 )
            // InternalSemester_Project_Dsl.g:301:3: rule__Variable__NameAssignment_1
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


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalSemester_Project_Dsl.g:310:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:314:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalSemester_Project_Dsl.g:315:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1();

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
    // $ANTLR end "rule__Sensor__Group_0__0"


    // $ANTLR start "rule__Sensor__Group_0__0__Impl"
    // InternalSemester_Project_Dsl.g:322:1: rule__Sensor__Group_0__0__Impl : ( 'CO2' ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:326:1: ( ( 'CO2' ) )
            // InternalSemester_Project_Dsl.g:327:1: ( 'CO2' )
            {
            // InternalSemester_Project_Dsl.g:327:1: ( 'CO2' )
            // InternalSemester_Project_Dsl.g:328:2: 'CO2'
            {
             before(grammarAccess.getSensorAccess().getCO2Keyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCO2Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0__1"
    // InternalSemester_Project_Dsl.g:337:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:341:1: ( rule__Sensor__Group_0__1__Impl )
            // InternalSemester_Project_Dsl.g:342:2: rule__Sensor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_0__1"


    // $ANTLR start "rule__Sensor__Group_0__1__Impl"
    // InternalSemester_Project_Dsl.g:348:1: rule__Sensor__Group_0__1__Impl : ( ( rule__Sensor__NameAssignment_0_1 ) ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:352:1: ( ( ( rule__Sensor__NameAssignment_0_1 ) ) )
            // InternalSemester_Project_Dsl.g:353:1: ( ( rule__Sensor__NameAssignment_0_1 ) )
            {
            // InternalSemester_Project_Dsl.g:353:1: ( ( rule__Sensor__NameAssignment_0_1 ) )
            // InternalSemester_Project_Dsl.g:354:2: ( rule__Sensor__NameAssignment_0_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_0_1()); 
            // InternalSemester_Project_Dsl.g:355:2: ( rule__Sensor__NameAssignment_0_1 )
            // InternalSemester_Project_Dsl.g:355:3: rule__Sensor__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalSemester_Project_Dsl.g:364:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:368:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalSemester_Project_Dsl.g:369:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1();

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
    // $ANTLR end "rule__Sensor__Group_1__0"


    // $ANTLR start "rule__Sensor__Group_1__0__Impl"
    // InternalSemester_Project_Dsl.g:376:1: rule__Sensor__Group_1__0__Impl : ( 'CO' ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:380:1: ( ( 'CO' ) )
            // InternalSemester_Project_Dsl.g:381:1: ( 'CO' )
            {
            // InternalSemester_Project_Dsl.g:381:1: ( 'CO' )
            // InternalSemester_Project_Dsl.g:382:2: 'CO'
            {
             before(grammarAccess.getSensorAccess().getCOKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCOKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_1__1"
    // InternalSemester_Project_Dsl.g:391:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:395:1: ( rule__Sensor__Group_1__1__Impl )
            // InternalSemester_Project_Dsl.g:396:2: rule__Sensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_1__1"


    // $ANTLR start "rule__Sensor__Group_1__1__Impl"
    // InternalSemester_Project_Dsl.g:402:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__NameAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:406:1: ( ( ( rule__Sensor__NameAssignment_1_1 ) ) )
            // InternalSemester_Project_Dsl.g:407:1: ( ( rule__Sensor__NameAssignment_1_1 ) )
            {
            // InternalSemester_Project_Dsl.g:407:1: ( ( rule__Sensor__NameAssignment_1_1 ) )
            // InternalSemester_Project_Dsl.g:408:2: ( rule__Sensor__NameAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1_1()); 
            // InternalSemester_Project_Dsl.g:409:2: ( rule__Sensor__NameAssignment_1_1 )
            // InternalSemester_Project_Dsl.g:409:3: rule__Sensor__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:418:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:422:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:423:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:423:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:424:3: RULE_ID
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
    // InternalSemester_Project_Dsl.g:433:1: rule__Model__VariablesAssignment_2 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:437:1: ( ( ruleVariable ) )
            // InternalSemester_Project_Dsl.g:438:2: ( ruleVariable )
            {
            // InternalSemester_Project_Dsl.g:438:2: ( ruleVariable )
            // InternalSemester_Project_Dsl.g:439:3: ruleVariable
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
    // InternalSemester_Project_Dsl.g:448:1: rule__Model__SensorsAssignment_3 : ( ruleSensor ) ;
    public final void rule__Model__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:452:1: ( ( ruleSensor ) )
            // InternalSemester_Project_Dsl.g:453:2: ( ruleSensor )
            {
            // InternalSemester_Project_Dsl.g:453:2: ( ruleSensor )
            // InternalSemester_Project_Dsl.g:454:3: ruleSensor
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalSemester_Project_Dsl.g:463:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:467:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:468:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:468:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:469:3: RULE_ID
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


    // $ANTLR start "rule__Sensor__NameAssignment_0_1"
    // InternalSemester_Project_Dsl.g:478:1: rule__Sensor__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:482:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:483:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:483:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:484:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_0_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1_1"
    // InternalSemester_Project_Dsl.g:493:1: rule__Sensor__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemester_Project_Dsl.g:497:1: ( ( RULE_ID ) )
            // InternalSemester_Project_Dsl.g:498:2: ( RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:498:2: ( RULE_ID )
            // InternalSemester_Project_Dsl.g:499:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});

}