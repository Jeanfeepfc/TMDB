package eu.epfc.tmdb.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import eu.epfc.tmdb.network.TmdbService
import eu.epfc.tmdb.network.models.MovieResponse
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    var popularMovies : List<MovieResponse> by mutableStateOf(listOf())

    fun fetchPopularMovies() {
        viewModelScope.launch {
            popularMovies = TmdbService.tmdbHttpClient.getPopularMovies()
        }
    }
}

