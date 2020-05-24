package com.algokelvin.catalog.movie.tv.utils.dummy

import com.algokelvin.catalog.movie.tv.utils.R

data class DummyMovieOne(val image: Int, val title: String, val rating: Double)
data class DummyMovieTwo(val image: Int)

object MovieDummy {
    fun typeOne(): ArrayList<DummyMovieOne> {
        val dataMovieDummy = ArrayList<DummyMovieOne>()
        dataMovieDummy.add(DummyMovieOne(R.drawable.sample_poster_movie_01, "Avenger End Game", 8.0))
        dataMovieDummy.add(DummyMovieOne(R.drawable.sample_poster_movie_01, "Ant Man", 9.2))
        dataMovieDummy.add(DummyMovieOne(R.drawable.sample_poster_movie_01, "IP Man", 8.6))
        dataMovieDummy.add(DummyMovieOne(R.drawable.sample_poster_movie_01, "Spiderman", 8.2))
        dataMovieDummy.add(DummyMovieOne(R.drawable.sample_poster_movie_01, "Avenger", 8.5))
        return dataMovieDummy
    }
    fun typeTwo(): ArrayList<DummyMovieTwo> {
        val dataMovieDummy = ArrayList<DummyMovieTwo>()
        dataMovieDummy.add(DummyMovieTwo(R.drawable.sample_poster_movie_02))
        dataMovieDummy.add(DummyMovieTwo(R.drawable.sample_poster_movie_02))
        dataMovieDummy.add(DummyMovieTwo(R.drawable.sample_poster_movie_02))
        dataMovieDummy.add(DummyMovieTwo(R.drawable.sample_poster_movie_02))
        dataMovieDummy.add(DummyMovieTwo(R.drawable.sample_poster_movie_02))
        return dataMovieDummy
    }
}