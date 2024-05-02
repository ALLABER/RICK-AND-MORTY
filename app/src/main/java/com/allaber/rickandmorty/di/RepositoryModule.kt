package com.allaber.rickandmorty.di

import com.allaber.data.repository.RickAndMortyRepositoryImpl
import com.allaber.domain.repository.RickAndMortyRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindRickAndMortyRepository(
        repository: RickAndMortyRepositoryImpl
    ): RickAndMortyRepository
}
