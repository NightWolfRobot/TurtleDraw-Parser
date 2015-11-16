/* The following code was generated by JFlex 1.4.3 on 16/11/15 01:38 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 16/11/15 01:38 from the specification file
 * <tt>program.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\1\1\0\2\1\22\0\1\41\7\0\1\7\1\10\1\53"+
    "\1\51\1\0\1\52\1\4\1\54\1\3\11\2\1\0\1\50\1\0"+
    "\1\47\3\0\1\33\1\27\1\35\1\14\1\37\1\21\1\6\1\24"+
    "\4\6\1\44\2\6\1\43\2\6\1\40\1\31\1\6\1\11\4\6"+
    "\6\0\1\12\1\16\1\26\1\45\1\15\1\5\1\46\1\5\1\22"+
    "\2\5\1\36\1\5\1\23\1\32\1\25\1\42\1\13\1\30\1\20"+
    "\1\17\1\34\4\5\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\14\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\3\15\0"+
    "\1\15\2\0\1\16\2\0\1\17\21\0\1\20\6\0"+
    "\1\21\1\22\1\23\1\24\4\0\1\20\1\0\1\25"+
    "\3\0\1\26\3\0\1\27\1\30\6\0\1\31\4\0"+
    "\1\32\4\0\1\33\2\0\1\34\1\35\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\55\0\132\0\55\0\207\0\55\0\55"+
    "\0\264\0\341\0\u010e\0\u013b\0\u0168\0\u0195\0\u01c2\0\u01ef"+
    "\0\u021c\0\u0249\0\u0276\0\u02a3\0\55\0\55\0\55\0\55"+
    "\0\55\0\55\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1"+
    "\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf\0\u04ec\0\u0519"+
    "\0\u0546\0\u0573\0\u05a0\0\55\0\u05cd\0\u05fa\0\55\0\u0627"+
    "\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f"+
    "\0\u07bc\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7"+
    "\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\55"+
    "\0\55\0\55\0\55\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\55"+
    "\0\u0b13\0\55\0\u0b40\0\u0b6d\0\u0b9a\0\55\0\u0bc7\0\u0bf4"+
    "\0\u0c21\0\55\0\55\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02"+
    "\0\u0d2f\0\55\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\55\0\u0e10"+
    "\0\u0e3d\0\u0e6a\0\u0e97\0\55\0\u0ec4\0\u0ef1\0\55\0\55"+
    "\0\55";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\2\1\7"+
    "\1\10\1\11\2\6\1\12\4\6\1\13\2\6\1\14"+
    "\2\6\1\15\1\6\1\16\1\6\1\17\1\6\1\20"+
    "\1\6\1\21\1\22\1\3\1\6\1\23\1\24\2\6"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\57\0\2\4"+
    "\1\33\55\0\2\6\2\0\30\6\1\0\5\6\20\0"+
    "\1\34\57\0\1\35\51\0\1\36\7\0\1\37\44\0"+
    "\1\40\54\0\1\41\54\0\1\42\17\0\1\43\56\0"+
    "\1\44\1\0\1\45\50\0\1\46\47\0\1\47\41\0"+
    "\1\50\7\0\1\51\64\0\1\52\54\0\1\53\24\0"+
    "\2\33\64\0\1\54\57\0\1\55\60\0\1\56\55\0"+
    "\1\57\50\0\1\60\65\0\1\61\47\0\1\62\50\0"+
    "\1\63\47\0\1\64\74\0\1\65\41\0\1\66\47\0"+
    "\1\67\61\0\1\70\60\0\1\71\50\0\1\72\102\0"+
    "\1\73\26\0\1\74\50\0\1\75\61\0\1\76\61\0"+
    "\1\77\47\0\1\100\47\0\1\101\64\0\1\102\44\0"+
    "\1\103\77\0\1\104\40\0\1\105\66\0\1\106\52\0"+
    "\1\107\35\0\1\110\56\0\1\111\57\0\1\112\51\0"+
    "\1\113\64\0\1\114\51\0\1\115\73\0\1\116\36\0"+
    "\1\117\4\0\1\120\52\0\1\121\56\0\1\122\41\0"+
    "\1\123\67\0\1\124\41\0\1\125\62\0\1\126\53\0"+
    "\1\127\55\0\1\130\73\0\1\131\27\0\1\132\54\0"+
    "\1\133\56\0\1\134\65\0\1\135\72\0\1\136\31\0"+
    "\1\137\57\0\1\140\45\0\1\141\50\0\1\142\56\0"+
    "\1\143\51\0\1\144\70\0\1\145\43\0\1\146\54\0"+
    "\1\147\56\0\1\150\50\0\1\151\56\0\1\152\51\0"+
    "\1\153\55\0\1\154\106\0\1\155\21\0\1\156\61\0"+
    "\1\157\52\0\1\160\56\0\1\161\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3870];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\11\1\1\2\11\14\1\6\11"+
    "\1\1\15\0\1\1\2\0\1\11\2\0\1\11\21\0"+
    "\1\1\6\0\4\11\4\0\1\11\1\0\1\11\3\0"+
    "\1\11\3\0\2\11\6\0\1\11\4\0\1\11\4\0"+
    "\1\11\2\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException, 	LexerException
 {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 17: 
          { return new Token(Sym.POUR);
          }
        case 31: break;
        case 21: 
          { return new Token(Sym.ALORS);
          }
        case 32: break;
        case 14: 
          { return new Token(Sym.VAR);
          }
        case 33: break;
        case 5: 
          { return new Token(Sym.LPAR);
          }
        case 34: break;
        case 29: 
          { return new Token(Sym.SAVE);
          }
        case 35: break;
        case 15: 
          { return new Token(Sym.FIN);
          }
        case 36: break;
        case 22: 
          { return new Token(Sym.SINON);
          }
        case 37: break;
        case 10: 
          { return new Token(Sym.MINUS);
          }
        case 38: break;
        case 26: 
          { return new Token(Sym.TANTQUE);
          }
        case 39: break;
        case 28: 
          { return new Token(Sym.BAS);
          }
        case 40: break;
        case 11: 
          { return new Token(Sym.TIMES);
          }
        case 41: break;
        case 23: 
          { return new Token(Sym.TOURNE);
          }
        case 42: break;
        case 6: 
          { return new Token(Sym.RPAR);
          }
        case 43: break;
        case 12: 
          { return new Token(Sym.DIV);
          }
        case 44: break;
        case 4: 
          { return new VarToken(Sym.VARIABLE, yytext());
          }
        case 45: break;
        case 27: 
          { return new Token(Sym.EPAISSEUR);
          }
        case 46: break;
        case 30: 
          { return new Token(Sym.HAUT);
          }
        case 47: break;
        case 19: 
          { return new Token(Sym.DEBUT);
          }
        case 48: break;
        case 13: 
          { return new Token(Sym.SI);
          }
        case 49: break;
        case 8: 
          { return new Token(Sym.CONCAT);
          }
        case 50: break;
        case 3: 
          { return new IntToken(Sym.INT, Double.parseDouble(yytext()));
          }
        case 51: break;
        case 9: 
          { return new Token(Sym.PLUS);
          }
        case 52: break;
        case 24: 
          { return new Token(Sym.AVANCE);
          }
        case 53: break;
        case 1: 
          { System.out.println(yytext()); throw new LexerException(yyline, yycolumn);
          }
        case 54: break;
        case 20: 
          { return new Token(Sym.FAIRE);
          }
        case 55: break;
        case 25: 
          { return new Token(Sym.COULEUR);
          }
        case 56: break;
        case 18: 
          { return new Token(Sym.MODE);
          }
        case 57: break;
        case 16: 
          { return new Token(Sym.TOURS);
          }
        case 58: break;
        case 7: 
          { return new Token(Sym.EQ);
          }
        case 59: break;
        case 2: 
          { 
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              return new Token(Sym.EOF);
            }
            case 114: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
