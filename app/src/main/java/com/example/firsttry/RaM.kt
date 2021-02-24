package com.example.firsttry

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class RaM
       (
    @PrimaryKey val ID: String,
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val image: String,
    val episode: List<String>,
    val nameLocation: String,
    val urlLocation: String,
    val nameOrigin: String,
    val urlOrigin: String,
    val url: String,
    val created: String
        )

