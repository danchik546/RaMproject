package com.example.firsttry

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


class DataModel {
    @SerializedName ("data")
    var dataList = ArrayList<DataBean>()
    data class DataBean(
    @SerializedName("count") var count: Int,
    @SerializedName("pages") var pages: Int,
    @SerializedName("next")  var next: String?,
    @SerializedName("prev")  var prev: String?,
    @SerializedName("id")  var id: Int,
    @SerializedName("nameChar")  var nameChar: String,
    @SerializedName("status")  var status: String,
    @SerializedName("species") var species: String,
    @SerializedName("type")  var type: String,
    @SerializedName("gender")  var gender: String,
    @SerializedName("nameOrigin")var nameOrigin: String,
    @SerializedName("urlOrigin") var urlOrigin: String,
    @SerializedName("nameLocation")var nameLocation: String,
    @SerializedName("urlLocation") var urlLocation: String,
    @SerializedName("urlChar") var urlChar: String,
    @SerializedName("created") var created: String
    )
}
