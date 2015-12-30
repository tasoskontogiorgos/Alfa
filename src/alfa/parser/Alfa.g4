  

grammar Alfa;

import AlfaLexer;

program: ( stmt )+
;

stmt: 
            assignment ';'? 
        |   funCall ';' ?
        |   include ';'?
        ;

include: INCLUDE StringLiteral
        ;

literal:    IntegerLiteral
	|   FloatingPointLiteral
	|   BooleanLiteral
	|   CharacterLiteral
	|   StringLiteral
	|   NullLiteral
	;

num:        IntegerLiteral 
        |   FloatingPointLiteral
        ;

var:    Identifier
        ;

map:    '{'
            ( exp ':' exp )+
        '}'
        ;

pairmap:'{'
            ( num '_' num ':' exp )+
        '}'
        ;

list:   '[' 
            ( exp ',' ? )*  
        ']'
        ;

exp:        literal          
        |   var              
        |   map              
        |   pairmap          
        |   list             
        |   exp binOper exp  
        |   funCall          
        |   BRA exp KET      
        ;



funCall:    Identifier 
            BRA  
                (exp ','?) * 
            KET
            ;

 

assignment:  Identifier '=' exp 
            ;
    
  

binOper: EQ | NEQ | IN | GT | GE | LT | LE ;


