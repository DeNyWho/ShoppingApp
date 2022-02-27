package com.example.shoppingapp.data.repository

import androidx.paging.PagingData
import com.example.shoppingapp.data.local.ShoppingDatabase
import com.example.shoppingapp.data.remote.ShoppingApi
import com.example.shoppingapp.domain.model.Sneakers
import com.example.shoppingapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow

class RemoteDataSourceImpl (
    private val shoppingApi: ShoppingApi,
    private val shoppingDatabase: ShoppingDatabase
) : RemoteDataSource {
    override fun getAllSneakers(): Flow<PagingData<Sneakers>> {
        TODO("Not yet implemented")
    }

    override fun searchSneakers(): Flow<PagingData<Sneakers>> {
        TODO("Not yet implemented")
    }


}