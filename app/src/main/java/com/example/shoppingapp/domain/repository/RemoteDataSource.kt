package com.example.shoppingapp.domain.repository

import androidx.paging.PagingData
import androidx.paging.PagingSource
import com.example.shoppingapp.domain.model.Sneakers
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    fun getAllSneakers(): Flow<PagingData<Sneakers>>

    fun searchSneakers(): Flow<PagingData<Sneakers>>
}