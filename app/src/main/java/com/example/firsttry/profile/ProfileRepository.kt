package com.example.firsttry.profile

import com.example.firsttry.ApiClient
import com.example.firsttry.ApiInterface
import retrofit2.create

class ProfileRepository {
    private val api:ApiInterface = ApiClient.retrofit.create()
    suspend fun loadUser(id:Int) = api.user(id)
}