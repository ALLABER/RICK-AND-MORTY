package com.allaber.rickandmorty.presentation.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.allaber.domain.repository.RickAndMortyRepository
import com.allaber.rickandmorty.R
import com.allaber.rickandmorty.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: RickAndMortyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        val appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        findViewById<TextView>(R.id.tvName).text = repository.getAllCharacters().first().name
    }
}
