grammar Setlika_new;

stmt
    : (sql_stmt_list)* EOF
    ;

sql_stmt_list
    : SCOL* stmt_line (SCOL+ stmt_line)* SCOL
    ;

stmt_line
    : create_stmt // +
    | drop_stmt   // +
    | insert_stmt // +
    | select_stmt // +-
    | vacuum_stmt // +
    ;

vacuum_stmt
    : 'VACUUM'
    ;

create_stmt
    : 'CREATE' 'TABLE' existence? table_name '(' columns_def ')'
    ;

drop_stmt
    : 'DROP' 'TABLE' existence? table_name
    ;

insert_stmt
    : 'INSERT' 'INTO' table_name ('VALUES')? values
    ;

select_stmt
    : 'SELECT' result_columns 'FROM' from_body where_clause?
    ;

result_columns
    : result_column (',' result_column)*
    ;

result_column
    : '*'
    | table_name
    ;

from_body
    : table_name join_clauses?
    ;


join_clauses
    : join_clauses join_clause
    | join_clause
    ;

join_clause
    : cross_join
    | inner_join
    ;

cross_join
    : ',' table_name
    ;

inner_join
    : 'JOIN' table_name 'ON' expr
    ;

existence
    : 'IF' 'NOT' 'EXISTS'
    ;

table_name
    : identifier
    ;

columns_def
    : column_def (',' column_def)*
    ;

column_def
    : column_name ':' type (primary_key)?
    ;


column_name
    : identifier
    ;

type
    : 'int'
    | 'float'
    | 'str' '(' integer ')'
    | 'bool'
    ;

primary_key
    : 'PRIMARY' 'KEY'
    | 'PK'
    ;

values
    : value (',' value)*
    ;

value
    : '(' literal (',' literal)* ')'
    ;


expr
    : column_name binary_operator literal
    ;

binary_expr
    : expr (binary_combination expr)*
    ;

where_clause
    : 'WHERE' binary_expr
    ;

binary_combination
    :'AND'
    |'OR'
    ;

binary_operator
    :'<=' // less-equals
    |'<' // less
    |'>=' // more-equals
    |'>' // more
    |'=' // equals
    |'!=' // not equals
    ;

literal
    : integer
    | float
    | text
    | bool
    ;

integer: NUMBER;
float: NUMBER '.' NUMBER;
text: '\'' .*? '\'';
bool: 'True' | 'False';

identifier: ID;

NUMBER: [0-9]+;
ID: [a-zA-Z]+;
SCOL: ';';
WS: [ \n\r] -> skip;