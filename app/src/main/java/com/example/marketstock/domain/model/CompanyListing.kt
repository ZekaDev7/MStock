package com.example.marketstock.domain.model

import java.lang.Exception
import java.util.concurrent.Exchanger

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String
)
