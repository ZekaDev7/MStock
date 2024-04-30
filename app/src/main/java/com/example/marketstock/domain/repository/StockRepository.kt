package com.example.marketstock.domain.repository

import androidx.room.Query
import com.example.marketstock.domain.model.CompanyListing
import com.example.marketstock.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}