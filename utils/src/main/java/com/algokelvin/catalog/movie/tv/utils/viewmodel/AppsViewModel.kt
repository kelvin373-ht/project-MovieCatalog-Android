package com.algokelvin.catalog.movie.tv.utils.viewmodel

import com.algokelvin.catalog.movie.tv.repository.interfaceData.MovieTVParameter
import com.algokelvin.catalog.movie.tv.repository.response.ResponseMovie

class AppsViewModel(override val api: String, override val language: String) : BaseViewModel(), MovieTVParameter {
    private val responseMovie = ResponseMovie(api, language)

    //TODO: Movie
    fun getMovieNowPlaying() = responseMovie.getMovieNowPlayingResponse()

}