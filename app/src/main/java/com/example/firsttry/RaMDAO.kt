package com.example.firsttry

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {
    @Insert(onConflict = REPLACE)
    fun save(RaM: RaM)

    @Query("SELECT * FROM RaM WHERE id = :ID")
    fun load(ID: String): Flow<RaM>
}