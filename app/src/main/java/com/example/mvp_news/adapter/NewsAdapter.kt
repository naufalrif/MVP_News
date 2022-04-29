package com.example.mvp_news.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvp_news.R
import com.example.mvp_news.model.GetAllNewsItem
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(private var datanews : List<GetAllNewsItem>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private var datanews : List<GetAllNewsItem>? = null
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news,parent,false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_news_title.text = datanews!![position].title
        holder.itemView.tv_news_date.text = datanews!![position].createdAt
        holder.itemView.tv_news_author.text = datanews!![position].author
        Glide.with(holder.itemView.context).load(datanews!![position].image)
            .into(holder.itemView.img_news)
    }

    override fun getItemCount(): Int {
        return if(datanews == null){
            0
        }else{
            datanews?.size!!
        }
    }
}