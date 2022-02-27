package com.example.shoppingapp.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(

    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val sneakers: List<Sneakers> = emptyList()

)
