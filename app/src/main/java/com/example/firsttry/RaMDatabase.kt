package com.example.firsttry

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [RaM::class], version = 1)
abstract class RaMDatabase: RoomDatabase(){
    abstract fun RaMDAO(): RaMDAO
}

