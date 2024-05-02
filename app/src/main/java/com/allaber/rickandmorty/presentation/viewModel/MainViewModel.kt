package com.allaber.rickandmorty.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.allaber.domain.usecase.GetAllCharactersUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getAllCharactersUseCase: GetAllCharactersUseCase
) : ViewModel() {

    init {
        getAllCharacters()
    }

    private fun getAllCharacters() {
    }
}
