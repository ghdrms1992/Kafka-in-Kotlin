package com.demo.message

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class MessageProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun produce(content: String) {
        kafkaTemplate.send("someTopic", content)
    }
}