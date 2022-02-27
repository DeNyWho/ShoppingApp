package com.example.shoppingapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.example.shoppingapp.domain.model.Sneakers

@Dao
interface SneakersDao {

    @Query("SELECT * FROM sneakers_table ORDER BY id ASC")
    fun getAllSneakers(): PagingSource<Int, Sneakers>



}
