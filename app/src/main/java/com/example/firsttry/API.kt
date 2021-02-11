package com.example.firsttry

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("api/character")
    fun listRepos(): Call<ResponseBody>
}