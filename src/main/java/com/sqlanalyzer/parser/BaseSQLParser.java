package com.sqlanalyzer.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 基础SQL解析器
 */
public abstract class BaseSQLParser {

    /**
     * 获取语法分析的入口规则方法名
     * @return 入口规则方法名
     */
    protected abstract String getStartRuleName();

    protected SQLParseResult parse(String sql,
                                   Class<? extends Lexer> lexerClass,
                                   Class<? extends Parser> parserClass) {
        try {
            // 创建词法分析器
            CharStream input = CharStreams.fromString(sql);
            Lexer lexer = lexerClass.getConstructor(CharStream.class).newInstance(input);

            // 创建词法符号流
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 创建语法分析器
            Parser parser = parserClass.getConstructor(TokenStream.class).newInstance(tokens);

            // 添加错误监听器
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e) {
                    throw new RuntimeException("line " + line + ":" + charPositionInLine + " " + msg);
                }
            });

            // 通过反射调用入口规则方法
            ParseTree tree = (ParseTree) parserClass
                    .getMethod(getStartRuleName())
                    .invoke(parser);

            return new SQLParseResult(tree, sql);

        } catch (Exception e) {
            return new SQLParseResult(sql, e.getMessage());
        }
    }
}