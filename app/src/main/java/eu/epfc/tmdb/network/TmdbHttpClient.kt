package eu.epfc.tmdb.network

import eu.epfc.tmdb.network.models.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

// https://api.themoviedb.org/3/movie/popular?page={your_page_number}&api_key={your_api_key}
// Api Key : ea2dcee690e0af8bb04f37aa35b75075

interface TmdbHttpClient {
    @GET("3/movie/popular?page=1&api_key=ea2dcee690e0af8bb04f37aa35b75075")
    suspend fun getPopularMovies() : List<MovieResponse>
}