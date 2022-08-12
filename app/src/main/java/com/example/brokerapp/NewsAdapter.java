package com.example.brokerapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{
    Context mcontext;
    ArrayList<NewsModel> newsdatalist;

    public NewsAdapter(Context mcontext, ArrayList<NewsModel> newsdatalist) {
        this.mcontext = mcontext;
        this.newsdatalist = newsdatalist;
    }

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.custom_news_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, @SuppressLint("RecyclerView") int position) {

        NewsModel newsModel = newsdatalist.get(position);
        String news = newsdatalist.get(position).getShortnews();
        String time = newsdatalist.get(position).getTime();
        int img = newsdatalist.get(position).getNewsimg();
        holder.tv_shortnews.setText(news);
        holder.tv_newstime.setText(time);
        holder.iv_news.setImageResource(img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mcontext, NewsFullScreen.class);
                intent.putExtra("news", newsdatalist.get(position).getShortnews());
                intent.putExtra("image", newsModel.getNewsimg());
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsdatalist.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView tv_shortnews, tv_newstime;
        ImageView iv_news;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_shortnews = itemView.findViewById(R.id.tv_shortnews);
            tv_newstime = itemView.findViewById(R.id.tv_newstime);
            iv_news = itemView.findViewById(R.id.iv_news);
        }
    }
}
