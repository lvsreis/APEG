
tree grammar SemanticAnalysis2;

options {
    tokenVocab = AdaptablePEG;
    ASTLabelType = CommonTree;
}

@header {
package treeparsers;
import semantics.*;
}

@treeparser::members {

    Grammar tab;
    NonTerminal currNT;
    
    private boolean mMessageCollectionEnabled = false;
    private List<String> mMessages;

    /**
     *  Switches error message collection on or of.
     *
     *  The standard destination for parser error messages is <code>System.err</code>.
     *  However, if <code>true</code> gets passed to this method this default
     *  behaviour will be switched off and all error messages will be collected
     *  instead of written to anywhere.
     *
     *  The default value is <code>false</code>.
     *
     *  @param pNewState  <code>true</code> if error messages should be collected.
     */
    public void enableErrorMessageCollection(boolean pNewState) {
        mMessageCollectionEnabled = pNewState;
        if (mMessages == null && mMessageCollectionEnabled) {
            mMessages = new ArrayList<String>();
        }
    }
    
    /**
     *  Collects an error message or passes the error message to <code>
     *  super.emitErrorMessage(...)</code>.
     *
     *  The actual behaviour depends on whether collecting error messages
     *  has been enabled or not.
     *
     *  @param pMessage  The error message.
     */
     @Override
    public void emitErrorMessage(String pMessage) {
        if (mMessageCollectionEnabled) {
            mMessages.add(pMessage);
        } else {
            super.emitErrorMessage(pMessage);
        }
    }
    
    /**
     * O token passado como par�metro (atributo token) � usado
     * para adicionar a linha e coluna na mensagem de erro.
     */
    public void emitErrorMessage(Token t, String pMessage) {
        emitErrorMessage("line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + pMessage);
    }
    
    /**
     *  Returns collected error messages.
     *
     *  @return  A list holding collected error messages or <code>null</code> if
     *           collecting error messages hasn't been enabled. Of course, this
     *           list may be empty if no error message has been emited.
     */
    public List<String> getMessages() {
        return mMessages;
    }
    
    /**
     *  Tells if parsing has caused any error messages.
     *
     *  @return  <code>true</code> if parsing has caused at least one error message.
     */
    public boolean hasErrors() {
        return mMessages.size() > 0;
    }
        
    public void printErrorMessages() {
      for (String s : getMessages()) {
        System.out.println("  " + s);
      }
    }
    
}

grammarDef[Grammar t] :
    { tab = t; }
    rule+
    ;

rule 
  : 
  ^(RULE ID
    { currNT = tab.getNonTerminal($ID.text); }
    ^(LIST varDecl*)
    ^(LIST varDecl*)
    ^(LIST varDecl*)
    peg_expr
  )
  {
    currNT.setPegExpr($peg_expr.start);
  }
  ;

varDecl :
  ^(VARDECL id1=ID id2=ID)
  ;

peg_expr
@init {
  NonTerminal nt;
  int cont = 0;
  String message = null;
}
  :
  ^(CHOICE peg_expr peg_expr)
  |
  ^(SEQ peg_expr+)
  |
  ANY
  |
  ^(NONTERM
      ID
      {
        nt = tab.getNonTerminal($ID.text);
        if (nt == null) {
          emitErrorMessage($ID.token, "Symbol not found");
        }
      }
      ^(LIST 
        (
          expr
          {
            ++cont;
            if (nt != null && message == null) {
              if (cont > nt.getNumParam() + nt.getNumRet()) {
                message = "Wrong number of parameters: " + $ID.text;
              } else if (cont > nt.getNumParam()) {
                CommonTree t = $expr.start;
                if (t.getType() != ID) {
                  message = "Inherited attributes must be only an identifier";
                }
              }
            }
          }
        )*
      )
      {
        if (nt != null && message == null) {
          if (cont != nt.getNumParam() + nt.getNumRet()) {
            message = "Wrong number of parameters: " + $ID.text;
          }
        }
        if (message != null) {
          emitErrorMessage($ID.token, message);
        }
      }
  )
  |
  STRING_LITERAL
  |
  ^(REPEAT peg_expr)
  |
  ^(NOT_LOOKAHEAD peg_expr)
  |
  ^(COND expr)
  |
  ^(ASSIGNLIST assign+)
  ;

actPars : ^(LIST expr*);

assign :
  ^(ASSIGN ID expr)
  ; 

expr :
  ^(OP_OR expr expr)
  |
  ^(OP_AND expr expr)
  |
  ^(relOp expr expr)
  |
  ^(addOp expr expr)
  |
  ^(mulOp expr expr)
  |
  ^(UNARY_SUB expr)
  |
  ^(OP_NOT expr)
  |
  ^(CALL designator actPars)
  |
  designator
  |
  number
  |
  STRING_LITERAL
  ;

number : INT_NUMBER | REAL_NUMBER ;

designator :
  ID
    {
      if (currNT.getAttribute($ID.text) == null) {
        emitErrorMessage($ID.token, "Attribute not found: " + $ID.text);
      }
    }
  |
  ^(DOT designator ID)
  |
  ^(ARRAY_REF designator expr)
  ;

relOp : OP_EQ | OP_NE | OP_LT | OP_GT | OP_LE | OP_GE ;

addOp : OP_ADD | OP_SUB ;

mulOp : OP_MUL | OP_DIV | OP_MOD ;
