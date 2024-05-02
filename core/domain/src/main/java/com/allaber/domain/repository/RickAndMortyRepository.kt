package com.allaber.domain.repository

import com.allaber.domain.model.Character

interface RickAndMortyRepository {
    fun getAllCharacters(): List<Character>
}
