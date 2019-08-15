package com.example.andronews2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;


import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<com.example.andronews2.data.Results> resultsList = new ArrayList<>();

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NotNull MyViewHolder myViewHolder, final int position) {
        com.example.andronews2.data.Results results = resultsList.get(position);

        Glide.with(myViewHolder.img_article.getContext())
                .load(resultsList.get(position).getMedia().get(0).getMediaMetaData().get(2).getUrl())
                .into(myViewHolder.img_article);
        myViewHolder.article.setText(results.getTitle());
        myViewHolder.article_date.setText(results.getPublished_date());
        myViewHolder.section.setText(results.getSection());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra("key", resultsList.get(position).getUrl());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsList.size();
    }

    public void setResultsList(@NonNull List<com.example.andronews2.data.Results> resultsList) {
        this.resultsList = resultsList;
        this.notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView img_article;
        public TextView article;
        public TextView article_date;
        public TextView section;

        public MyViewHolder(View itemView) {
            super(itemView);
            img_article = itemView.findViewById(R.id.img_article);
            article = itemView.findViewById(R.id.article);
            article_date = itemView.findViewById(R.id.article_date);
            section = itemView.findViewById(R.id.section_news);
        }
    }
}
