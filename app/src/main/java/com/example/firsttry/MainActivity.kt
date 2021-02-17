package com.example.firsttry

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val adapter = DataAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()

        val service = ApiClient.retrofit.create(GitHubService::class.java)
        service.listRepos().enqueue(object : Callback<DataModel> {
            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                val dataModel = response.body()?.dataList ?: return onFailure("Illegal state")
                adapter.addDataList(dataModel)
                Log.i(TAG, "success " + response.body()?.toString())
            }

            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.i(TAG, "response fail")
                onFailure(t.localizedMessage ?: "response fail")
            }
        })
    }

    fun onFailure(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
}