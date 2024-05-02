package com.allaber.domain.usecase

import com.allaber.domain.model.Character
import com.allaber.domain.repository.RickAndMortyRepository
import javax.inject.Inject

class GetAllCharactersUseCase @Inject constructor(
    private val repository: RickAndMortyRepository
) {
    operator fun invoke(): List<Character> {
        return repository.getAllCharacters()
    }
}
