package com.example.dagger_test2.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInstance {

    @GET("repositories")
    fun getDataFromApi(@Query("q")query: String): Call<RecyclerList>

}