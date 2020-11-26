/* Generated By:JavaCC: Do not edit this line. JavaGrammarConstants.java */
package compiler;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JavaGrammarConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NULL = 11;
  /** RegularExpression Id. */
  int IMPORT = 12;
  /** RegularExpression Id. */
  int PACKAGE = 13;
  /** RegularExpression Id. */
  int CLASS = 14;
  /** RegularExpression Id. */
  int RETURN = 15;
  /** RegularExpression Id. */
  int PRINT = 16;
  /** RegularExpression Id. */
  int IF = 17;
  /** RegularExpression Id. */
  int ELSE = 18;
  /** RegularExpression Id. */
  int WHILE = 19;
  /** RegularExpression Id. */
  int FOR = 20;
  /** RegularExpression Id. */
  int TRUE = 21;
  /** RegularExpression Id. */
  int FALSE = 22;
  /** RegularExpression Id. */
  int INT = 23;
  /** RegularExpression Id. */
  int FLOAT = 24;
  /** RegularExpression Id. */
  int STRING = 25;
  /** RegularExpression Id. */
  int CHAR = 26;
  /** RegularExpression Id. */
  int BOOLEAN = 27;
  /** RegularExpression Id. */
  int VOID = 28;
  /** RegularExpression Id. */
  int STATIC = 29;
  /** RegularExpression Id. */
  int FINAL = 30;
  /** RegularExpression Id. */
  int PRIVATE = 31;
  /** RegularExpression Id. */
  int PROTECTED = 32;
  /** RegularExpression Id. */
  int PUBLIC = 33;
  /** RegularExpression Id. */
  int AC = 34;
  /** RegularExpression Id. */
  int FC = 35;
  /** RegularExpression Id. */
  int AP = 36;
  /** RegularExpression Id. */
  int FP = 37;
  /** RegularExpression Id. */
  int AB = 38;
  /** RegularExpression Id. */
  int FB = 39;
  /** RegularExpression Id. */
  int VIRGULA = 40;
  /** RegularExpression Id. */
  int PONTO = 41;
  /** RegularExpression Id. */
  int PONTO_VIRGULA = 42;
  /** RegularExpression Id. */
  int PONTO_ASTERISCO = 43;
  /** RegularExpression Id. */
  int SOMA = 44;
  /** RegularExpression Id. */
  int SUBTRACAO = 45;
  /** RegularExpression Id. */
  int MUTIPLICACAO = 46;
  /** RegularExpression Id. */
  int DIVISAO = 47;
  /** RegularExpression Id. */
  int MODULO = 48;
  /** RegularExpression Id. */
  int SOMA_PLUS = 49;
  /** RegularExpression Id. */
  int SUBTRACAO_PLUS = 50;
  /** RegularExpression Id. */
  int MULTIPLICACAO_PLUS = 51;
  /** RegularExpression Id. */
  int DIVISAO_PLUS = 52;
  /** RegularExpression Id. */
  int MODULO_PLUS = 53;
  /** RegularExpression Id. */
  int ATRIBUICAO = 54;
  /** RegularExpression Id. */
  int INCREMENTO = 55;
  /** RegularExpression Id. */
  int DECREMENTO = 56;
  /** RegularExpression Id. */
  int IGUALDADE = 57;
  /** RegularExpression Id. */
  int DIFERENCA = 58;
  /** RegularExpression Id. */
  int MENOR = 59;
  /** RegularExpression Id. */
  int MAIOR = 60;
  /** RegularExpression Id. */
  int MENOR_IGUAL = 61;
  /** RegularExpression Id. */
  int MAIOR_IGUAL = 62;
  /** RegularExpression Id. */
  int AND = 63;
  /** RegularExpression Id. */
  int OR = 64;
  /** RegularExpression Id. */
  int NEGACAO = 65;
  /** RegularExpression Id. */
  int IDENTIFICADOR = 66;
  /** RegularExpression Id. */
  int LETRA = 67;
  /** RegularExpression Id. */
  int DIGITO = 68;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 69;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 70;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 71;
  /** RegularExpression Id. */
  int EXPONENT = 72;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 73;
  /** RegularExpression Id. */
  int STRING_LITERAL = 74;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int comentarioSimples = 1;
  /** Lexical state. */
  int comentarioLongo = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"//\"",
    "\"/*\"",
    "\"\\n\"",
    "<token of kind 8>",
    "\"*/\"",
    "<token of kind 10>",
    "\"null\"",
    "\"import\"",
    "\"package\"",
    "\"class\"",
    "\"return\"",
    "\"System.out.println\"",
    "\"if\"",
    "\"else\"",
    "\"while\"",
    "\"for\"",
    "\"true\"",
    "\"false\"",
    "\"int\"",
    "\"float\"",
    "\"string\"",
    "\"char\"",
    "\"boolean\"",
    "\"void\"",
    "\"static\"",
    "\"final\"",
    "\"private\"",
    "\"protected\"",
    "\"public\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "\".\"",
    "\";\"",
    "\".*\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"=\"",
    "\"++\"",
    "\"--\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"&&\"",
    "\"||\"",
    "\"!\"",
    "<IDENTIFICADOR>",
    "<LETRA>",
    "<DIGITO>",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\"public static void main\"",
  };

}
