package ru.agavrilyuk.bookshelf.network.model

import retrofit2.http.GET
import retrofit2.http.Query
import ru.agavrilyuk.bookshelf.BookShelf

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResult: Int
    ): BookShelf
}