grammar Lang;

@header {
	package tigame.parser;
}

file
	: (program | NL )*
	;

program
	: 'prgm' ID NL (global_var | NL)* (statement)* 'endprgm' NL
	;

global_var
	: 'global' ID NL         #global
	;

statement
	: ID BECOMES expr NL 	# assign
	| ID '[' expr ']' BECOMES expr NL # arrayassign
	| 'goto' ID NL          # goto
	| ID ':' NL             # label
	| ID NL					# pcall
	| loopcond 'do' NL statement* 'done' NL # loop
	| 'break'               # break
	| 'continue'            # continue
	| NL   					# emptyline
	| ifstat 				# ifstatlabel
	;

ifstat
	: 'if' expr 'then' NL statement* endifstat
	;

endifstat
	: 'endif' NL 		    # endif
	| elsestat         	# elselabel
	;

elsestat
	: 'else' NL statement* 'endif' NL
	| 'else' ifstat
	;

loopcond
	: 'forever'     			#forever
	| 'while' expr  			#while
	;

// make sure can support arrays eventually
expr
    :  expr op=('*'|'/'|'%') expr 			# muldivmod
	|  expr op=('+'|'-') expr     			# addsub
	|  expr op=('>='|'<='|'='|'>'|'<') expr # cmp
	|  expr 'and'  expr 					# and
	|  expr 'or'  expr						# or
	|  'not' expr                 			# not
	|  ID '[' expr ']'            			# array
	|  ID                         			# id
	|  INT                        			# int
	|  '-' expr                   			# negate
	|  '(' expr ')'			      			# paren
	|  STR                                  # string
	;


ID : [a-zA-Z][a-zA-Z0-9]*;  // match id's
STR: '"' (~["]|'\\"')* '"';
INT: [0-9]+;
BECOMES: ':=';
HIDENL: '\\' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN);
NL:  '\r'? '\n';
COMMENT: ';' (~[\r\n])* -> channel(HIDDEN);
WS: [ \t\u000C]+ -> channel(HIDDEN);
