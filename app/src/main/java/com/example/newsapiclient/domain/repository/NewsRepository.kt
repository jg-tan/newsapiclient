package com.example.newsapiclient.domain.repository

import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.model.Article
import com.example.newsapiclient.data.util.resource.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(country: String, page: Int, searchQuery: String) : Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)

    /**
     * Live data (androidx) is meant to be used in ViewModels only, in
     * this case we choose to use Flow.
     *
     * As we are using Flow/LiveData, which are Data streams, we do not
     * need to make it a suspending function.
     * */
    fun getSavedNews(): Flow<List<Article>>
}