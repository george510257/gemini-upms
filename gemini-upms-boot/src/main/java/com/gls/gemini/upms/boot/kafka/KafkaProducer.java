package com.gls.gemini.upms.boot.kafka;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Kafka生产者
 */
@Slf4j
@Component
public class KafkaProducer {
    /**
     * KafkaTemplate 用于发送消息
     */
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 发送消息
     *
     * @param topic 主题
     * @param input 消息
     */
    public void send(String topic, String input) {
        log.info("KafkaProducer: {}", input);
        kafkaTemplate.send(topic, input).whenComplete((result, throwable) -> {
            if (throwable != null) {
                log.error("Kafka 消息发送失败: {}", throwable.getMessage());
            } else {
                log.info("Kafka 消息发送成功: {}", result);
            }
        });
    }
}
