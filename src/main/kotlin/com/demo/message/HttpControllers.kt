package com.demo.message

import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun get(): List<Message> = service.findMessages()

    @GetMapping("/{id}")
    fun get(@PathVariable id: String): List<Message> = service.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) = service.save(message)
}