package com.example.mvp_news.network

import com.example.mvp_news.model.GetAllNewsItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("news")
    fun getAllNews() : Call<List<GetAllNewsItem>>
}