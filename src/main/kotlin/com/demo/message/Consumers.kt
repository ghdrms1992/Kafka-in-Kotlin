package com.demo.message

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageConsumer(private val service: MessageService) {

    @KafkaListener(topics = ["someTopic"])
    fun consume(content: String?) {
        if(!content.isNullOrEmpty()) service.save(Message(null, content))
    }
}