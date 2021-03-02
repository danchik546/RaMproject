package com.example.firsttry.profile

import com.example.firsttry.ApiClient
import com.example.firsttry.ApiInterface
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import retrofit2.create

internal class ProfileRepositoryTest {


    @Test
   suspend fun loadUser2() {

        ProfileRepository().loadUser(1)
    }
}