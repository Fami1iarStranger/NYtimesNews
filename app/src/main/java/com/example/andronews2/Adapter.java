package com.example.andronews2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;
import com.example.andronews2.viewed.ResultsViewed;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ResultsViewed> resultsVieweds;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public Adapter(List<ResultsViewed> resultsVieweds, Context context) {
        this.resultsVieweds = resultsVieweds;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.model, viewGroup, false);
        return new MyViewHolder(view, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        final MyViewHolder holder = viewHolder;
        ResultsViewed model = resultsVieweds.get(i);

        RequestOptions requestOptions = new RequestOptions();


        holder.article.setText(model.getTitle());
        holder.date.setText(" \u2022 " + Utils.DateToTimeFormat(model.getPublished_date()));
    }

    @Override
    public int getItemCount() {
        return resultsVieweds.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView article, date;
        ImageView img;
        OnItemClickListener onItemClickListener;

        public MyViewHolder(@NonNull View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);

            itemView.setOnClickListener(this);
            article = itemView.findViewById(R.id.article);
            date = itemView.findViewById(R.id.date_article);
            img = itemView.findViewById(R.id.img_article);

            this.onItemClickListener = onItemClickListener;
        }

        @Override
        public void onClick(View v) {

            onItemClickListener.onItemClick(v, getAdapterPosition());
        }
    }
}
