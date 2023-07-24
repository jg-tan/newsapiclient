package com.example.newsapiclient.data.repository.datasourceimpl

import android.graphics.pdf.PdfDocument.Page
import com.example.newsapiclient.data.api.NewsAPIService
import com.example.newsapiclient.data.model.APIResponse
import com.example.newsapiclient.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse> =
        newsAPIService.getTopHeadlines(country, page)

    override suspend fun getSearchedNews(
        country: String,
        page: Int,
        searchQuery: String,
    ): Response<APIResponse> = newsAPIService.getSearchedTopHeadlines(country, page, searchQuery)

}