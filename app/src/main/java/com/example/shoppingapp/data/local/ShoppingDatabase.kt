package com.example.shoppingapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.shoppingapp.data.local.dao.SneakersDao
import com.example.shoppingapp.data.local.dao.SneakersRemoteKeysDao
import com.example.shoppingapp.domain.model.Sneakers
import com.example.shoppingapp.domain.model.SneakersRemoteKeys

@Database(entities = [Sneakers::class, SneakersRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class ShoppingDatabase: RoomDatabase() {

    abstract fun sneakersDao(): SneakersDao

    abstract fun sneakersRemoteKeysDao(): SneakersRemoteKeysDao

}