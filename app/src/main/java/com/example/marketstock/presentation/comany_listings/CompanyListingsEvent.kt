package com.example.marketstock.presentation.comany_listings

sealed class CompanyListingsEvent {
    data object Refresh : CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent()
}