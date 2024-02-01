package com.example.Assignment1b.data.network.model

import java.io.Serializable

data class Todo(
    val id: String = "",
    val name: String = "",
    val createdBy: User = User(),
    val done: Boolean = false
) : Serializable