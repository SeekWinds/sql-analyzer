grammar HiveSQL;

// Parser Rules
parse
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
      LPAREN columnDefinition (COMMA columnDefinition)* RPAREN
      (COMMENT STRING_LITERAL)?
      (PARTITIONED BY LPAREN columnDefinition (COMMA columnDefinition)* RPAREN)?
      (CLUSTERED BY LPAREN identifier (COMMA identifier)* RPAREN
       (SORTED BY LPAREN columnSortSpec (COMMA columnSortSpec)* RPAREN)?
       INTO NUMBER BUCKETS)?
      (STORED AS fileFormat)?
      (LOCATION STRING_LITERAL)?
      (TBLPROPERTIES LPAREN tableProperties RPAREN)?
    ;

columnDefinition
    : identifier dataType (COMMENT STRING_LITERAL)?
    ;

columnSortSpec
    : identifier (ASC | DESC)?
    ;

tableProperties
    : tableProperty (COMMA tableProperty)*
    ;

tableProperty
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
    ;

fileFormat
    : TEXTFILE
    | SEQUENCEFILE
    | ORC
    | PARQUET
    | AVRO
    | RCFILE
    | JSONFILE
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
PARTITIONED : 'PARTITIONED';
BY : 'BY';
CLUSTERED : 'CLUSTERED';
SORTED : 'SORTED';
INTO : 'INTO';
BUCKETS : 'BUCKETS';
STORED : 'STORED';
AS : 'AS';
LOCATION : 'LOCATION';
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
USING : 'USING';
AND : 'AND';
OR : 'OR';
IN : 'IN';
LIKE : 'LIKE';
ASC : 'ASC';
DESC : 'DESC';
COMMENT : 'COMMENT';

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

// File Formats
TEXTFILE : 'TEXTFILE';
SEQUENCEFILE : 'SEQUENCEFILE';
ORC : 'ORC';
PARQUET : 'PARQUET';
AVRO : 'AVRO';
RCFILE : 'RCFILE';
JSONFILE : 'JSONFILE';

// Literals
TRUE : 'TRUE';
FALSE : 'FALSE';
NULL : 'NULL';

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
    : 'DATE' STRING_LITERAL
    ;

NUMBER
    : DIGIT+ ('.' DIGIT*)?
    | '.' DIGIT+
    ;

fragment DIGIT : [0-9];

WS
    : [ \t\r\n]+ -> skip
    ;

LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

MULTILINE_COMMENT
    : '/*' .*? '*/' -> skip
    ;