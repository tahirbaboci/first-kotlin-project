package com.baboci.firstkotlinproject

import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()
    fun post(message: Message) {
        db.save(message)
    }
}