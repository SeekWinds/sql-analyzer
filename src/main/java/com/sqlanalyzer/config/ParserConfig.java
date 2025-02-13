package com.sqlanalyzer.config;

/**
 * SQL解析器配置类
 * 用于配置SQL解析器的行为和限制
 *
 * @author SeekWinds
 * @date 2025-02-11 09:46:42
 */
public class ParserConfig {

    /**
     * 默认最大SQL长度
     */
    private static final int DEFAULT_MAX_SQL_LENGTH = 1000000;

    /**
     * 默认解析超时时间（毫秒）
     */
    private static final long DEFAULT_TIMEOUT = 30000L;

    /**
     * 默认最大解析深度
     */
    private static final int DEFAULT_MAX_PARSE_DEPTH = 100;

    /**
     * 默认是否启用缓存
     */
    private static final boolean DEFAULT_CACHE_ENABLED = true;

    /**
     * 默认缓存大小
     */
    private static final int DEFAULT_CACHE_SIZE = 1000;

    private final int maxSqlLength;
    private final long timeout;
    private final int maxParseDepth;
    private final boolean cacheEnabled;
    private final int cacheSize;
    private final boolean strictMode;
    private final boolean debugMode;

    private ParserConfig(Builder builder) {
        this.maxSqlLength = builder.maxSqlLength;
        this.timeout = builder.timeout;
        this.maxParseDepth = builder.maxParseDepth;
        this.cacheEnabled = builder.cacheEnabled;
        this.cacheSize = builder.cacheSize;
        this.strictMode = builder.strictMode;
        this.debugMode = builder.debugMode;
    }

    public int getMaxSqlLength() {
        return maxSqlLength;
    }

    public long getTimeout() {
        return timeout;
    }

    public int getMaxParseDepth() {
        return maxParseDepth;
    }

    public boolean isCacheEnabled() {
        return cacheEnabled;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public boolean isStrictMode() {
        return strictMode;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    /**
     * 构建器类
     */
    public static class Builder {
        private int maxSqlLength = DEFAULT_MAX_SQL_LENGTH;
        private long timeout = DEFAULT_TIMEOUT;
        private int maxParseDepth = DEFAULT_MAX_PARSE_DEPTH;
        private boolean cacheEnabled = DEFAULT_CACHE_ENABLED;
        private int cacheSize = DEFAULT_CACHE_SIZE;
        private boolean strictMode = false;
        private boolean debugMode = false;

        public Builder maxSqlLength(int maxSqlLength) {
            this.maxSqlLength = maxSqlLength;
            return this;
        }

        public Builder timeout(long timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder maxParseDepth(int maxParseDepth) {
            this.maxParseDepth = maxParseDepth;
            return this;
        }

        public Builder cacheEnabled(boolean cacheEnabled) {
            this.cacheEnabled = cacheEnabled;
            return this;
        }

        public Builder cacheSize(int cacheSize) {
            this.cacheSize = cacheSize;
            return this;
        }

        public Builder strictMode(boolean strictMode) {
            this.strictMode = strictMode;
            return this;
        }

        public Builder debugMode(boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        public ParserConfig build() {
            return new ParserConfig(this);
        }
    }

    /**
     * 创建默认配置
     *
     * @return 默认配置对象
     */
    public static ParserConfig createDefault() {
        return new Builder().build();
    }

    /**
     * 创建严格模式配置
     *
     * @return 严格模式配置对象
     */
    public static ParserConfig createStrict() {
        return new Builder()
                .strictMode(true)
                .maxSqlLength(50000)
                .timeout(10000L)
                .maxParseDepth(50)
                .build();
    }

    /**
     * 创建调试模式配置
     *
     * @return 调试模式配置对象
     */
    public static ParserConfig createDebug() {
        return new Builder()
                .debugMode(true)
                .timeout(60000L)
                .maxParseDepth(200)
                .build();
    }

    @Override
    public String toString() {
        return "ParserConfig{" +
                "maxSqlLength=" + maxSqlLength +
                ", timeout=" + timeout +
                ", maxParseDepth=" + maxParseDepth +
                ", cacheEnabled=" + cacheEnabled +
                ", cacheSize=" + cacheSize +
                ", strictMode=" + strictMode +
                ", debugMode=" + debugMode +
                '}';
    }
}