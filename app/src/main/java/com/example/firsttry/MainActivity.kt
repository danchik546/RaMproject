package com.example.firsttry

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import okhttp3.ResponseBody
import retrofit2.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    var recyclerView : RecyclerView? = null
    val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service = ApiClient.GetClient().create(GitHubService::class.java)
        service.listRepos().enqueue(object :Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                val dataModel = response.body()!!
                dataModel.dataList
                getDataList(response.body()!!.dataList)
                Log.i(TAG, "success " + response.body()?.toString())
            }
            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.i(TAG, "response fail")
            }
        })
        var adapter = dataAdapter()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}