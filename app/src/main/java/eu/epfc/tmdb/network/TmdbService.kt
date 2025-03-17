package eu.epfc.tmdb.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


// Api Key : ea2dcee690e0af8bb04f37aa35b75075

object TmdbService {
    private const val BASE_URL = "https://www.themoviedb.org/"
    val tmdbHttpClient : TmdbHttpClient
    init {
        val jsonConverter: MoshiConverterFactory = MoshiConverterFactory.create()
        val retrofitBuilder : Retrofit.Builder = Retrofit.Builder()
            .addConverterFactory(jsonConverter)
            .baseUrl(BASE_URL)
        val retrofit : Retrofit = retrofitBuilder.build()
        tmdbHttpClient = retrofit.create(TmdbHttpClient::class.java)
    }
}