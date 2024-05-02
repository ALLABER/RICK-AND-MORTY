package com.allaber.domain.model

data class Character(
    val id: Int,
    val name: String,
    val status: CharacterStatus,
    val gender: CharacterGender,
    val image: String
)
