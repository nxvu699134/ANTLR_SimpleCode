grammar SimpleCode;

options
{
    language = Java;
}
/*
* LEXER RULE
*/

K_VOID              :   'void';
K_CALLOUT           :   'callout';
K_RETURN            :   'return';
K_CLASS             :   'class';

K_IF                :   'if';
K_ELSE              :   'else';
BOOL_LITERAL        :   K_TRUE
                    |   K_FALSE
                    ;
K_TRUE              :   'true';
K_FALSE             :   'false';

K_FOR               :   'for';
K_CONTINUE          :   'continue';
K_BREAK             :   'break';

K_INT               :   'int';
K_BOOLEAN           :   'boolean';

WHITE_SPACE         :   [ \r\t\n]+ -> skip;
LINE_COMMENT        :   '//' ~( '\r' | '\n' )* -> skip;
BLOCK_COMMENT       :   '/*' ~( '\r' | '\n' )* '*/' -> skip;
SEMI                :   ';';

GT                  :   '>';
LT                  :   '<';
GE                  :   '>=';
LE                  :   '<=';
EQ                  :   '=';
PLUS_EQ             :   '+=';
MINUS_EQ            :   '-=';

DOUBLE_EQ           :   '==';
EX_EQ               :   '!=';

MULT                :   '*';
DIV                 :   '/';
PLUS                :   '+';
MINUS               :   '-';
MODULUS             :   '%';

COMMA               :   ',';
LPAREN              :   '(';
RPAREN              :   ')';
LCBRACKET           :   '{';
RCBRACKET           :   '}';
LSBRACKET           :   '[';
RSBRACKET           :   ']';

/*
* PARSER RULE
*/

root                        : program EOF;

program                     :   K_CLASS 'Program' LCBRACKET field_decl* method_decl* RCBRACKET
                            ;

field_decl                  :   type field (COMMA field)* SEMI
                            ;

field                       :   id (LSBRACKET int_literal RSBRACKET)?
                            ;

method_decl                 :   (type | K_VOID) id LPAREN ((method_arg COMMA)* method_arg)? RPAREN block
                            ;

method_arg                  :   type id
                            ;

block                       :   LCBRACKET var_decl* statement* RCBRACKET
                            ;

var_decl                    :   type (id COMMA)* id SEMI
                            ;

type                        :   K_INT | K_BOOLEAN
                            ;

statement                   :   assign_statement
                            |   method_call SEMI
                            |   if_statement
                            |   for_statment
                            |   return_statment
                            |   break_statement
                            |   continue_statement
                            |   block
                            ;

assign_statement            :   location assign_op expr SEMI
                            ;

if_statement                :   K_IF LPAREN expr RPAREN block (K_ELSE block)?
                            ;

for_statment                :   K_FOR id EQ expr COMMA expr block
                            ;

return_statment             :   K_RETURN (expr)? SEMI
                            ;

break_statement             :   K_BREAK SEMI
                            ;

continue_statement          :   K_CONTINUE SEMI
                            ;

assign_op                   :   EQ
                            |   PLUS_EQ
                            |   MINUS_EQ
                            ;

method_call                 :   method_name LPAREN (callout_arg (COMMA callout_arg)*)? RPAREN
                            |   K_CALLOUT LPAREN string_literal (COMMA (callout_arg COMMA)* callout_arg)? RPAREN
                            ;

method_name                 :   id
                            ;

location                    :   id
                            |   id LSBRACKET expr RSBRACKET
                            ;

expr                        :   location
                            |   method_call
                            |   literal
                            |   expr bin_op expr
                            |   MINUS expr
                            |   '!' expr
                            |   LPAREN expr RPAREN
                            ;

callout_arg                 :   expr
                            |   string_literal
                            ;

bin_op                      :   arith_op
                            |   rel_op
                            |   eq_op
                            |   cond_op
                            ;

arith_op                    :   PLUS
                            |   MINUS
                            |   MULT
                            |   DIV
                            |   MODULUS
                            ;

rel_op                      :   GT
                            |   LT
                            |   GE
                            |   LE
                            ;

eq_op                       :   DOUBLE_EQ | EX_EQ
                            ;

cond_op                     :   '&&' | '||'
                            ;

literal                     :   int_literal
                            |   char_literal
                            |   bool_literal
                            ;

id                          :   ID
                            ;

ID                          :   ALPHA ALPHA_NUM*
                            ;

fragment ALPHA_NUM          :   ALPHA | DIGIT
                            ;

fragment ALPHA              :   'a' .. 'z' | 'A' .. 'Z' | '_'
                            ;

fragment DIGIT              :   '0' .. '9'
                            ;

fragment HEX_DIGIT          :   'a' .. 'z' | 'A' .. 'Z' | '0' .. '9'
                            ;


int_literal                 :   INT_LITERAL;

INT_LITERAL                 :   HEX_LITERAL
                            |   DECIMAL_LITERAL
                            ;

fragment DECIMAL_LITERAL    :   DIGIT DIGIT*
                            ;

fragment HEX_LITERAL        :   '0x' HEX_DIGIT HEX_DIGIT*
                            ;

bool_literal                :   BOOL_LITERAL
                            ;

char_literal                :   CHAR_LITERAL
                            ;

CHAR_LITERAL                :   '\'' CHAR '\''
                            ;

string_literal              :   STRING_LITERAL
                            ;

STRING_LITERAL              :   '"' CHAR* '"'
                            ;

CHAR                        :   ('\\' [ntr\\"'])
                            |   ~([\r\n\t"'\\])
                            ;
