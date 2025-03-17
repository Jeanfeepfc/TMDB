package eu.epfc.tmdb.network.models

import com.squareup.moshi.Json
import retrofit2.http.Field

data class MovieResponse(
    @field:Json(name = "original_title")
    val title: String
)
