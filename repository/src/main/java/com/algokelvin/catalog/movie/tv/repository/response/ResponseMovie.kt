package com.algokelvin.catalog.movie.tv.repository.response

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.algokelvin.catalog.movie.tv.repository.BuildConfig
import com.algokelvin.catalog.movie.tv.repository.`interface`.MovieTVParameter
import com.algokelvin.catalog.movie.tv.repository.api.ApiInstanceMovieTV
import com.algokelvin.catalog.movie.tv.repository.data.DataMovie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseMovie(override val api: String, override val language: String) : MovieTVParameter {
    fun getMovieNowPlayingResponse(): LiveData<DataMovie> {
        val responseMovieNowPlaying = MutableLiveData<DataMovie>()
        val data = ApiInstanceMovieTV.create(BuildConfig.URL_MOVIE_TV).getMovieNowPlaying(api, language)
        data.enqueue(object : Callback<DataMovie> {
            override fun onResponse(call: Call<DataMovie>, response: Response<DataMovie>) {
                responseMovieNowPlaying.postValue(response.body())
            }
            override fun onFailure(call: Call<DataMovie>, t: Throwable) {
                responseMovieNowPlaying.postValue(null)
            }
        })
        return responseMovieNowPlaying
    }
}