package ru.agavrilyuk.bookshelf.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer{

}

class DefaultAppContainer: AppContainer{
    private val BASE_URL = "https://www.googleapis.com/books.v1/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()


}