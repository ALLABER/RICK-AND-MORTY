package com.allaber.data.repository

import com.allaber.domain.model.Character
import com.allaber.domain.model.CharacterGender
import com.allaber.domain.model.CharacterStatus
import com.allaber.domain.repository.RickAndMortyRepository
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor() : RickAndMortyRepository {
    override fun getAllCharacters(): List<Character> {
        return listOf(
            Character(
                id = 1,
                name = "Rick Sanchez",
                status = CharacterStatus.ALIVE,
                gender = CharacterGender.MALE,
                image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
            )
        )
    }
}
