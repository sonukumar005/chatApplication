package com.example.chatapplication.DATA

data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val username: String,
    val purl: String?,
    val email: String?
)