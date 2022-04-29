package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.Semester_Project_DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemester_Project_DslParser extends AbstractInternalAntlrParser {
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

        public InternalSemester_Project_DslParser(TokenStream input, Semester_Project_DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Semester_Project_DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSemester_Project_Dsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSemester_Project_Dsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSemester_Project_Dsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalSemester_Project_Dsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* ( (lv_sensors_3_0= ruleSensor ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_variables_2_0 = null;

        EObject lv_sensors_3_0 = null;



        	enterRule();

        try {
            // InternalSemester_Project_Dsl.g:77:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* ( (lv_sensors_3_0= ruleSensor ) )* ) )
            // InternalSemester_Project_Dsl.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* ( (lv_sensors_3_0= ruleSensor ) )* )
            {
            // InternalSemester_Project_Dsl.g:78:2: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* ( (lv_sensors_3_0= ruleSensor ) )* )
            // InternalSemester_Project_Dsl.g:79:3: otherlv_0= 'Program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_variables_2_0= ruleVariable ) )* ( (lv_sensors_3_0= ruleSensor ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getProgramKeyword_0());
            		
            // InternalSemester_Project_Dsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSemester_Project_Dsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSemester_Project_Dsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSemester_Project_Dsl.g:101:3: ( (lv_variables_2_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:102:4: (lv_variables_2_0= ruleVariable )
            	    {
            	    // InternalSemester_Project_Dsl.g:102:4: (lv_variables_2_0= ruleVariable )
            	    // InternalSemester_Project_Dsl.g:103:5: lv_variables_2_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_variables_2_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_2_0,
            	    						"org.xtext.example.mydsl.Semester_Project_Dsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSemester_Project_Dsl.g:120:3: ( (lv_sensors_3_0= ruleSensor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSemester_Project_Dsl.g:121:4: (lv_sensors_3_0= ruleSensor )
            	    {
            	    // InternalSemester_Project_Dsl.g:121:4: (lv_sensors_3_0= ruleSensor )
            	    // InternalSemester_Project_Dsl.g:122:5: lv_sensors_3_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sensors_3_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_3_0,
            	    						"org.xtext.example.mydsl.Semester_Project_Dsl.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // InternalSemester_Project_Dsl.g:143:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSemester_Project_Dsl.g:143:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSemester_Project_Dsl.g:144:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSemester_Project_Dsl.g:150:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSemester_Project_Dsl.g:156:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSemester_Project_Dsl.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSemester_Project_Dsl.g:157:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSemester_Project_Dsl.g:158:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalSemester_Project_Dsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSemester_Project_Dsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSemester_Project_Dsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalSemester_Project_Dsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSensor"
    // InternalSemester_Project_Dsl.g:184:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSemester_Project_Dsl.g:184:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSemester_Project_Dsl.g:185:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSemester_Project_Dsl.g:191:1: ruleSensor returns [EObject current=null] : ( (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalSemester_Project_Dsl.g:197:2: ( ( (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalSemester_Project_Dsl.g:198:2: ( (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalSemester_Project_Dsl.g:198:2: ( (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSemester_Project_Dsl.g:199:3: (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalSemester_Project_Dsl.g:199:3: (otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalSemester_Project_Dsl.g:200:4: otherlv_0= 'CO2' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getCO2Keyword_0_0());
                    			
                    // InternalSemester_Project_Dsl.g:204:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalSemester_Project_Dsl.g:205:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalSemester_Project_Dsl.g:205:5: (lv_name_1_0= RULE_ID )
                    // InternalSemester_Project_Dsl.g:206:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSemester_Project_Dsl.g:224:3: (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalSemester_Project_Dsl.g:224:3: (otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalSemester_Project_Dsl.g:225:4: otherlv_2= 'CO' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getCOKeyword_1_0());
                    			
                    // InternalSemester_Project_Dsl.g:229:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalSemester_Project_Dsl.g:230:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalSemester_Project_Dsl.g:230:5: (lv_name_3_0= RULE_ID )
                    // InternalSemester_Project_Dsl.g:231:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleSensor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});

}