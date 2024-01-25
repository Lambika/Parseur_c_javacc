# The grammar of the ALGO syntax

```Java
PARSE ::= ALGO . EOF

ALGO ::= "ALGORITHM" . "(" . IDENT . ")" . BLOCK

BLOCK ::= "{" . SEQUENCE . "}"

SEQUENCE ::= ( STATEMENT )*

STATEMENT ::=
   | DECL ";"	  
   | EXPR ";"	  
   | ASSIGNMENT ";"
   | IFTE
   | RETUR ";"
   | WHILEl
   | ADRP
   | LBRACE RBRACE
   
IFTE ::= IF . "(" . EXPR . ")" . BLOCK . ELSE . BLOCK

DECL ::= BASIC_TYPE . EXPR

ASSIGNMENT ::= IDENTIFIER . (PRE_POST_OP|ASSIGN) . EXPR

RETUR ::= RETURN . EXPR

WHILEl ::= WHILE . "(" . EXPR . ")" . BLOCK

ADRP ::= (ADDR|PTR) . EXPR

EXPR ::= E1 . opt_BINOP_EXPR

E1 ::= (IDENTIFIER | INTEGER)+

opt_BINOP_EXPR ::= Binop . E1

Binop ::= BINOP

IDENT ::= (LOWERCASE | UPPERCASE | UNDERSCORE)+




























VALUE ::= ...

TYPE ::=
     | "bool"
     | "int"
     | "char"
     | "string"
     
```
