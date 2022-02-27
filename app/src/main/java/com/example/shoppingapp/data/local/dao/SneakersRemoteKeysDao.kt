package com.example.shoppingapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.shoppingapp.domain.model.SneakersRemoteKeys

@Dao
interface SneakersRemoteKeysDao {

    @Query("SELECT * FROM sneakers_remote_keys_table WHERE id =:sneakersId")
    suspend fun getRemoteKeys(sneakersId: Int): SneakersRemoteKeys?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(sneakersRemoteKeys: List<SneakersRemoteKeys>)

    @Query("DELETE FROM sneakers_remote_keys_table")
    suspend fun deleteAllRemoteKeys()
}