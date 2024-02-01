package com.example.Assignment1b.data.network.model

data class Auth(
    val password: String,
    val authGoogle: Boolean,
    val authEmail: Boolean
)