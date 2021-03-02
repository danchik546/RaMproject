package com.example.firsttry

import retrofit2.*
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("api/character")
    fun listRepos(): Call<DataModelAllChar>

    @GET("api/character/{id}")
    suspend fun user(@Path("id") id:Int):DataModelSingleChar
}
