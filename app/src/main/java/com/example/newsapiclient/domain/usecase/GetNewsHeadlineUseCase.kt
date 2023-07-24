package com.example.newsapiclient.domain.usecase

import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.util.resource.Resource
import com.example.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlineUseCase(private val newsRepository: NewsRepository) {

    /**
     * We can also code some business logic here.
     * */
    suspend fun execute(country: String, page: Int): Resource<APIResponse> = newsRepository.getNewsHeadlines(country, page)
}