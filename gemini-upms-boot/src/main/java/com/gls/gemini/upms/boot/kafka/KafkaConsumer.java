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

    @KafkaListener(topics = "test")
    public void listen(String input) {
        log.info("KafkaConsumer: {}", input);
    }
}
