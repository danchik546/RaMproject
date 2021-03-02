package com.example.firsttry

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.firsttry.databinding.ActivityMainBinding
import com.example.firsttry.databinding.RickListRowBinding
import com.example.firsttry.profile.ProfileFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create


class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding
    private lateinit var RickBinding: RickListRowBinding
    var ID: Int = 0


    var adapter = DataAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        bindingMain.recyclerView.adapter = adapter
        val view = bindingMain.root
        setContentView(view)

        val service:ApiInterface = ApiClient.retrofit.create()
        service.listRepos().enqueue(object : Callback<DataModelAllChar> {
            override fun onResponse(call: Call<DataModelAllChar>, response: Response<DataModelAllChar>) {
                val dataModel = response.body()?: return onFailure("Illegal state")
                adapter.addDataList(dataModel)
                Log.i(TAG, "success ")
            }

            override fun onFailure(call: Call<DataModelAllChar>, t: Throwable) {
                Log.i(TAG, "response fail")
                onFailure(t.localizedMessage ?: "response fail")
            }
        })
        adapter.notifyDataSetChanged()
    }


    fun onFailure(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    fun showProfile(UserID: Int) = supportFragmentManager.commit {
        replace(R.id.fragmentContainer, ProfileFragment.get(ID))
    }
    fun SingleCharProfile(view: View){
        var id: Int
        val IdTextView = view as TextView
        val textFromId = IdTextView.text.toString()

        id = textFromId.toInt()
        supportFragmentManager.commit {
            replace(R.id.fragmentContainer, ProfileFragment.get(id))
    }}
    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

}