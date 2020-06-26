package com.algokelvin.catalog.movie.tv.utils.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.algokelvin.catalog.movie.tv.repository.interfaceData.MovieTVParameter

@Suppress("UNCHECKED_CAST")
class MovieTVVMFactory(
    override val api: String,
    override val language: String
): ViewModelProvider.Factory, MovieTVParameter {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AppsViewModel(api, language) as T
    }

}