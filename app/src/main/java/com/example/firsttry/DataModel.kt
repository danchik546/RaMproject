package com.example.firsttry

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.google.gson.annotations.SerializedName


/*class DataModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    val dataList2: List<DataModel.DataBean> = TODO()
    class DataBean(): ViewModel() {
        class info {
            val count: LiveData<String?> = TODO()
            val pages: LiveData<String?> = TODO()
            val next: LiveData<String?> = TODO()
            val prev: LiveData<String?> = TODO()
        }
        val id: LiveData<String> = TODO()
        val name: LiveData<String> = TODO()
        val status: LiveData<String> = TODO()
        val species: LiveData<String> = TODO()
        val type: LiveData<String> = TODO()
        val gender: LiveData<String> = TODO()
        val image: LiveData<String> = TODO()
        val episode: LiveData<List<String>> = TODO()
        val url: LiveData<String> = TODO()
        val created: LiveData<String> = TODO()

        class origin {
            val name: LiveData<String> = TODO()
            val url: LiveData<String> = TODO()
        }

        class location {
            val name: LiveData<String> = TODO()
            val url: LiveData<String> = TODO()
        }
    }
} */
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
