  

grammar Meta;

import MetaLexer;

program: ( stmt )+
;

stmt:  funDecl ';'?
         ;

include: INCLUDE StringLiteral
        ;

formalSpec:
            concreteFormal 
        |   BRA formalSpec ( OR formalSpec )* KET
        |   formalSpec mod 
        ;

concreteFormal:
            VAR | NUM | MAP | PAIRMAP | LIST | STR | BOOL
        ;
        
mod:    PLUS | MULT | OPT
        ;

funDecl:    
        Identifier 
        BRA 
            (formalSpec ','?) * 
        KET
        ;

 

