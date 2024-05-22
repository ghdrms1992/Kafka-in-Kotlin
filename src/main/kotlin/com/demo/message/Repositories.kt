package com.demo.message

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>