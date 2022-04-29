package com.example.mvp_news.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvp_news.R
import com.example.mvp_news.adapter.NewsAdapter
import com.example.mvp_news.model.GetAllNewsItem
import com.example.mvp_news.presenter.NewsPresent
import com.example.mvp_news.presenter.NewsView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NewsView {
    private lateinit var presenternews : NewsPresent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenternews = NewsPresent(this)
        presenternews.getDataNews()
    }

    override fun onSuccess(pesan: String, news: List<GetAllNewsItem>) {
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.adapter = NewsAdapter(news)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this,"Failed",Toast.LENGTH_LONG)
            .show()
    }
}