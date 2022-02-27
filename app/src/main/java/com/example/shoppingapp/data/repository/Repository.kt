package com.example.shoppingapp.data.repository

import androidx.paging.PagingData
import com.example.shoppingapp.domain.model.Sneakers
import com.example.shoppingapp.domain.repository.DataStoreOperations
import com.example.shoppingapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations,
) {

    fun getAllSneakers(): Flow<PagingData<Sneakers>>{
        return remote.getAllSneakers()
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }

}