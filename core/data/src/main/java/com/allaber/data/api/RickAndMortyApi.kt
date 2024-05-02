package com.allaber.data.api

import com.allaber.data.model.CharacterDto

interface RickAndMortyApi {
    fun getAllCharacters(): List<CharacterDto>
}
