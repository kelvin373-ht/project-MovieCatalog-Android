package com.algokelvin.catalog.movie.tv.repository.data

data class DataMovie(val result: ArrayList<Movie>? = null)

data class Movie(
    val image: Int? = null,
    val title: String? = null,
    val rating: Double? = null
)