package com.gls.gemini.upms.boot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka消费者
 */
@Slf4j
@Component
public class KafkaConsumer {
    /**
     * 消费消息
     *
     * @param input 消息
     */
    @KafkaListener(topics = KafkaTopicConstants.TOPIC_TEST)
    public void listen(String input) {
        log.info("kafka 消息接收成功 KafkaConsumer: {}", input);
    }
}
