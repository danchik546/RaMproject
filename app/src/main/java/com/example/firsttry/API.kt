package com.example.firsttry

import android.graphics.ColorSpace
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*


interface GitHubService {
    @GET("api/character")
    fun listRepos(): Call<DataModel>
}