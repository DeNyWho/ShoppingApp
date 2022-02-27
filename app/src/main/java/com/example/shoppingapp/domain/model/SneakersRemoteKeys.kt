package com.example.shoppingapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shoppingapp.util.Constants.SNEAKERS_REMOTE_KEYS_DATABASE_TABLE

@Entity(tableName = SNEAKERS_REMOTE_KEYS_DATABASE_TABLE)
data class SneakersRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val nextPage: Int,
    val prevPage: Int?
)
