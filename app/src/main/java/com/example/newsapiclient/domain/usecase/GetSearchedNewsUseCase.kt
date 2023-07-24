package com.example.newsapiclient.domain.usecase

import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.util.resource.Resource
import com.example.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country: String, page: Int, searchQuery: String): Resource<APIResponse> =
        newsRepository.getSearchedNews(country, page, searchQuery)
}