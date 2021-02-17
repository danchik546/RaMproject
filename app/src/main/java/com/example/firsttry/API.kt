package com.example.firsttry

import retrofit2.Call
import retrofit2.http.GET

interface GitHubService {
    @GET("api/character")
    fun listRepos(): Call<DataModel>
}