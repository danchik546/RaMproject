package com.example.firsttry

import com.google.gson.annotations.SerializedName

class DataModel(
        @SerializedName("results") val dataList: List<DataBean>
) {
    class DataBean(
            val count: Int,
            val pages: Int,
            val next: String?,
            val prev: String?,
            val id: Int,
            val nameChar: String,
            val status: String,
            val species: String,
            val type: String,
            val gender: String,
            val nameOrigin: String,
            val urlOrigin: String,
            val nameLocation: String,
            val urlLocation: String,
            val urlChar: String,
            val created: String
    )
}
