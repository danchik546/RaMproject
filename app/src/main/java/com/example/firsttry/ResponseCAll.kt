package com.example.firsttry

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.coroutineContext

private val adapter = DataAdapter()

val service = ApiClient.retrofit.create(GitHubService::class.java)

class ResponseCAl {
}
