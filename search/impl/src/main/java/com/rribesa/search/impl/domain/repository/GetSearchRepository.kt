package com.rribesa.search.impl.domain.repository

import com.rribesa.search.domain.model.SearchResultModel

interface GetSearchRepository {
    suspend fun getSearchResults(term: String): Result<List<SearchResultModel>>
    suspend fun getHistory(): Result<List<String>>
}