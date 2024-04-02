package com.gls.gemini.upms.boot.kafka;

/**
 * Kafka主题常量
 */
public interface KafkaTopicConstants {
    /**
     * 主题前缀
     */
    String TOPIC_PREFIX = "gemini-upms-topic-";
    /**
     * 测试主题
     */
    String TOPIC_TEST = TOPIC_PREFIX + "test";
}
