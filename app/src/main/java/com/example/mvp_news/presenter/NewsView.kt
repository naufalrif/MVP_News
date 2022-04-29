package com.example.mvp_news.presenter

import com.example.mvp_news.model.GetAllNewsItem

interface NewsView {
    fun onSuccess(pesan : String, news : List<GetAllNewsItem>)
    fun onError(pesan : String)
}