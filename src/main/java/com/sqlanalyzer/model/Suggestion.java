package com.sqlanalyzer.model;

/**
 * SQL优化建议.
 *
 * @author Yang Xin
 */
public class Suggestion {
    private SuggestionType type; // 建议类型
    private String message; // 建议信息
    private String recommendation; // 具体建议
    private int priority; // 建议优先级 1-5，5为最高

    public Suggestion(SuggestionType type, String message, String recommendation, int priority) {
        this.type = type;
        this.message = message;
        this.recommendation = recommendation;
        this.priority = priority;
    }

    // Getter方法
    public SuggestionType getType() {
        return type;
    }

    public String getTitle() {
        return message;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public int getPriority() {
        return priority;
    }
}
