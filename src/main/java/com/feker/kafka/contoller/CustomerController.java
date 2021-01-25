package com.feker.kafka.contoller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者消费消息
 */
@Component
public class CustomerController {

    /**
     * topics = "demo" 要消费的topic名称
     * @param record
     */
    @KafkaListener(topics = "test")
    public void listen (ConsumerRecord<?, ?> record){
//        log.info("topic是: {}, offset是: {}, value是: {}", record.topic(), record.offset(), record.value());
        System.out.println("topic是: "+record.topic()+", offset是: "+record.offset()+" value是: "  +record.value());
    }
}