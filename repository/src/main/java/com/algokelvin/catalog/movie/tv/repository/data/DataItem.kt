package com.algokelvin.catalog.movie.tv.repository.data

data class DataMovie(val results: ArrayList<Movie>? = null)

data class Movie(
    val backdrop_path: String? = null,
    val title: String? = null,
    val rating: Double? = null
)