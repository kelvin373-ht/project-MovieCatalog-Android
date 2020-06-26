package com.algokelvin.catalog.movie.tv.repository.api

import com.algokelvin.catalog.movie.tv.repository.data.DataMovie
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface ApiInstanceMovieTV {

    @GET("3/movie/top_rated")
    fun getMovieTopRated(
        @Query("api_key") api: String,
        @Query("language") language: String? = null
    ): Call<DataMovie>

    @GET("3/movie/now_playing")
    fun getMovieNowPlaying(
        @Query("api_key") api: String,
        @Query("language") language: String? = null
    ): Call<DataMovie>

    companion object {
        fun create(link: String): ApiInstanceMovieTV {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient().newBuilder()

            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .connectTimeout(3, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
                .build()

            val retrofit = Retrofit.Builder()
                .client(okHttpClient.build())
                .baseUrl(link)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()

            return retrofit.create(ApiInstanceMovieTV::class.java)
        }
    }
}