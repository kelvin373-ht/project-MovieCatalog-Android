package com.algokelvin.catalog.movie.tv.utils.dummy

import com.algokelvin.catalog.movie.tv.utils.R

data class DummyMovie(val image: Int, val title: String, val rating: Double)

object MovieDummy {
    fun typeOne(): ArrayList<DummyMovie> {
        val dataMovieDummy = ArrayList<DummyMovie>()
        dataMovieDummy.add(DummyMovie(R.drawable.sample_poster_movie_01, "Avenger End Game", 8.0))
        dataMovieDummy.add(DummyMovie(R.drawable.sample_poster_movie_01, "Ant Man", 9.2))
        dataMovieDummy.add(DummyMovie(R.drawable.sample_poster_movie_01, "IP Man", 8.6))
        dataMovieDummy.add(DummyMovie(R.drawable.sample_poster_movie_01, "Spiderman", 8.2))
        dataMovieDummy.add(DummyMovie(R.drawable.sample_poster_movie_01, "Avenger", 8.5))
        return dataMovieDummy
    }
}