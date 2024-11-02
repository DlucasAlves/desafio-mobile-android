package com.example.marvel

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.marvel.databinding.ActivitySecondBinding
import com.example.marvel.presentation.adapters.MarvelAdapter
import com.example.marvel.domain.entities.MarvelCardEntity


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.miranha.adapter = MarvelAdapter(getModel())
    }

    private fun getModel(): List<MarvelCardEntity> {
        return listOf(
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
            MarvelCardEntity(
                text = "Homen Aranha",
                image = "https://br.web.img3.acsta.net/pictures/bzp/01/29007.jpg"
            ),
        )
    }
}

