package com.allaber.rickandmorty.di

import com.allaber.rickandmorty.presentation.view.MainActivity
import dagger.Component

@Component(modules = [RepositoryModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}
