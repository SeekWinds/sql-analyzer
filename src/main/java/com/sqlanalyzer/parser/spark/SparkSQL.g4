grammar SparkSQL;

@header {
package com.sqlanalyzer.parser.spark;
}

// Parser Rules
prog
    : sqlStatements EOF
    ;

sqlStatements
    : sqlStatement (SEMICOLON sqlStatement)* SEMICOLON?
    ;

sqlStatement
    : createTableStatement
    | selectStatement
    ;

createTableStatement
    : CREATE TABLE (IF NOT EXISTS)? tableName
      (LPAREN columnDefinition (COMMA columnDefinition)* RPAREN)?
      (USING fileFormat)?
      (OPTIONS LPAREN tableOptions RPAREN)?
      (PARTITIONED BY partitionColumns)?
      (CLUSTERED BY LPAREN identifier (COMMA identifier)* RPAREN
       (SORTED BY LPAREN sortItem (COMMA sortItem)* RPAREN)?
       INTO NUMBER BUCKETS)?
      tableProperties?
    ;

columnDefinition
    : identifier dataType (COMMENT STRING_LITERAL)?
    ;

partitionColumns
    : identifier (COMMA identifier)*
    | transformExpr (COMMA transformExpr)*
    ;

transformExpr
    : identifier
    | function
    ;

sortItem
    : identifier (ASC | DESC)?
    ;

tableOptions
    : tableOption (COMMA tableOption)*
    ;

tableOption
    : STRING_LITERAL EQUAL STRING_LITERAL
    ;

tableProperties
    : TBLPROPERTIES LPAREN property (COMMA property)* RPAREN
    ;

property
    : STRING_LITERAL EQUAL STRING_LITERAL
    ;

selectStatement
    : SELECT selectElements
      fromClause?
      whereClause?
      groupByClause?
      havingClause?
      orderByClause?
      limitClause?
    ;

selectElements
    : (star | selectElement) (COMMA selectElement)*
    ;

selectElement
    : expression (AS? alias)?
    ;

fromClause
    : FROM tableSource (joinPart)*
    ;

whereClause
    : WHERE expression
    ;

groupByClause
    : GROUP BY groupByItem (COMMA groupByItem)*
    ;

havingClause
    : HAVING expression
    ;

orderByClause
    : ORDER BY orderByExpression (COMMA orderByExpression)*
    ;

limitClause
    : LIMIT NUMBER
    ;

orderByExpression
    : expression (ASC | DESC)?
    ;

joinPart
    : (INNER | LEFT OUTER? | RIGHT OUTER? | FULL OUTER? | CROSS)?
      JOIN tableSource
      (ON expression | USING LPAREN identifier (COMMA identifier)* RPAREN)?
    ;

tableSource
    : tableName (AS? alias)?
    ;

expression
    : primary
    | expression comparisonOperator expression
    | expression AND expression
    | expression OR expression
    | NOT expression
    | LPAREN expression RPAREN
    ;

primary
    : literal
    | identifier
    | function
    ;

function
    : identifier LPAREN functionArg (COMMA functionArg)* RPAREN
    ;

functionArg
    : expression
    | STAR
    ;

dataType
    : STRING
    | INT
    | BIGINT
    | DOUBLE
    | DATE
    | TIMESTAMP
    | BOOLEAN
    | DECIMAL (LPAREN NUMBER (COMMA NUMBER)? RPAREN)?
    | VARCHAR LPAREN NUMBER RPAREN
    | ARRAY LT dataType GT
    | MAP LT dataType COMMA dataType GT
    | STRUCT LT structType GT
    ;

structType
    : structField (COMMA structField)*
    ;

structField
    : identifier COLON dataType
    ;

fileFormat
    : PARQUET
    | ORC
    | JSON
    | CSV
    | DELTA
    | ICEBERG
    ;

comparisonOperator
    : EQUAL
    | NOT_EQUAL
    | LESS_THAN
    | LESS_THAN_EQUAL
    | GREATER_THAN
    | GREATER_THAN_EQUAL
    | LIKE
    | IN
    ;

identifier
    : IDENTIFIER
    | BACK_QUOTED_IDENTIFIER
    ;

tableName
    : identifier (DOT identifier)?
    ;

alias
    : identifier
    ;

literal
    : STRING_LITERAL
    | NUMBER
    | DATE_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;

star
    : STAR
    ;

groupByItem
    : expression
    ;

// Lexer Rules
CREATE : 'CREATE';
TABLE : 'TABLE';
IF : 'IF';
NOT : 'NOT';
EXISTS : 'EXISTS';
USING : 'USING';
OPTIONS : 'OPTIONS';
PARTITIONED : 'PARTITIONED';
BY : 'BY';
CLUSTERED : 'CLUSTERED';
SORTED : 'SORTED';
INTO : 'INTO';
BUCKETS : 'BUCKETS';
TBLPROPERTIES : 'TBLPROPERTIES';
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
GROUP : 'GROUP';
HAVING : 'HAVING';
ORDER : 'ORDER';
LIMIT : 'LIMIT';
JOIN : 'JOIN';
INNER : 'INNER';
LEFT : 'LEFT';
RIGHT : 'RIGHT';
FULL : 'FULL';
OUTER : 'OUTER';
CROSS : 'CROSS';
ON : 'ON';
AND : 'AND';
OR : 'OR';
IN : 'IN';
LIKE : 'LIKE';
ASC : 'ASC';
DESC : 'DESC';
COMMENT : 'COMMENT';
AS : 'AS';

// Data Types
STRING : 'STRING';
INT : 'INT';
BIGINT : 'BIGINT';
DOUBLE : 'DOUBLE';
DATE : 'DATE';
TIMESTAMP : 'TIMESTAMP';
BOOLEAN : 'BOOLEAN';
DECIMAL : 'DECIMAL';
VARCHAR : 'VARCHAR';
ARRAY : 'ARRAY';
MAP : 'MAP';
STRUCT : 'STRUCT';

// File Formats
PARQUET : 'PARQUET';
ORC : 'ORC';
JSON : 'JSON';
CSV : 'CSV';
DELTA : 'DELTA';
ICEBERG : 'ICEBERG';

// Literals
TRUE : 'TRUE';
FALSE : 'FALSE';
NULL : 'NULL';

// Operators and Punctuation
EQUAL : '=';
NOT_EQUAL : '!=' | '<>';
LESS_THAN : '<';
LESS_THAN_EQUAL : '<=';
GREATER_THAN : '>';
GREATER_THAN_EQUAL : '>=';
DOT : '.';
COMMA : ',';
SEMICOLON : ';';
LPAREN : '(';
RPAREN : ')';
STAR : '*';
LT : '<';
GT : '>';
COLON : ':';

// Identifiers and Literals
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

BACK_QUOTED_IDENTIFIER
    : '`' ( ~'`' | '``' )* '`'
    ;

STRING_LITERAL
    : '\'' ( ~'\'' | '\'\'' )* '\''
    ;

DATE_LITERAL
    : DATE STRING_LITERAL
    ;

NUMBER
    : DIGIT+ ('.' DIGIT*)?
    | '.' DIGIT+
    ;

fragment DIGIT : [0-9];

// Whitespace and Comments
WS
    : [ \t\r\n]+ -> skip
    ;

LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

MULTILINE_COMMENT
    : '/*' .*? '*/' -> skip
    ;