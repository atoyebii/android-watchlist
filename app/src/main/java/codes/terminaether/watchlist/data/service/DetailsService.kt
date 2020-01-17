package codes.terminaether.watchlist.data.service

import codes.terminaether.watchlist.data.model.Movie
import codes.terminaether.watchlist.data.model.Show
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Contains functions for fetching full [Movie] and [Show] models from TMDb.
 *
 * Created by terminaether on 2020-01-17.
 */
interface DetailsService {

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Deferred<Response<Movie>>

    @GET("tv/{show_id}")
    fun getShowDetails(@Path("show_id") id: Int): Deferred<Response<Show>>

}