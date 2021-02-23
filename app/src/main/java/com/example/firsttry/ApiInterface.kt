package com.example.firsttry

import android.util.Log
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface GitHubService {
    @GET("api/character")
    fun listRepos(): Call<DataModel>
}
