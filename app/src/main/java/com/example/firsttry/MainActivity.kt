package com.example.firsttry

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    var text: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.TextBox)
        text?.text=("privet")
        val retrofit = Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/")
                .build()

        val service = retrofit.create(GitHubService::class.java)
        service.listRepos().enqueue(object :Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                text?.text=response.body()?.string()
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                text?.text = t.message
            }
        })


    }

}