package com.example.shoppingapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shoppingapp.util.Constants.SNEAKERS_DATABASE_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = SNEAKERS_DATABASE_TABLE)
data class Sneakers(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val size: String

)
