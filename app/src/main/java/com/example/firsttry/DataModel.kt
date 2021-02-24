package com.example.firsttry

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.launch


class DataModel(
    @SerializedName("results") val dataList: List<DataBean>
) {
    class DataBean(
        val next: String?,
        val prev: String?,
        val id: Int,
        val name: String,
        val status: String,
        val species: String,
        val type: String,
        val gender: String,
        val image: String,
        val episode: List<String>,
        val url: String,
        val created: String
    )
    class info(
        val count: Int,
        val pages: Int,
        val next: String?,
        val prev: String?
    )
    class location(
        val name: String,
        val url: String
    )
    class origin(
        val name: String,
        val url: String
    )
}
class MyViewModelconstructor(
    @Assisted savedStateHandle: SavedStateHandle,
    Repository: Reprository
) :ViewModel(){
    val data = MutableLiveData<DataModel>()
    init {
        viewModelScope.launch {
            data.value = Repository.listRepos()
        }
    }
}
