package com.example.firsttry

import com.google.gson.annotations.SerializedName

class UserDTO {
    var count: String = ""
    var pages: String = ""
    var next: String = ""
    var prev: String = ""
    var id: Int = 0
    var nameChar: String = ""
    var status: String = ""
    var species: String = ""
    var type: String = ""
    var gender: String = ""
    var nameOrigin: String = ""
    var urlOrigin: String = ""
    var nameLocation: String = ""
    var urlLocation: String = ""
    var image: String = ""
    var episode: List<String> = emptyList()
    var url: String= ""
    var created: String = ""

    constructor() {}
    constructor(count: String, pages: String, next: String, prev: String, id: Int, nameChar: String,
                status: String, species: String, type: String, gender: String, nameOrigin: String,
                urlOrigin: String, nameLocation: String, urlLocation: String, image: String,
                episode: List<String>, url: String, created: String )
    {
        this.count = count
        this.pages = pages
        this.next = next
        this.prev = prev
        this.id = id
        this.nameChar = nameChar
        this.status = status
        this.species = species
        this.type = type
        this.gender = gender
        this.nameOrigin = nameOrigin
        this.urlOrigin = urlOrigin
        this.nameLocation = nameLocation
        this.urlLocation = urlLocation
        this.image = image
        this.episode = episode
        this.url = url
        this.created = created
    }

}