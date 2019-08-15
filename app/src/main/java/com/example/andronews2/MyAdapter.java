package com.example.andronews2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.andronews2.viewed.MediaMetaDataViewed;
import com.example.andronews2.viewed.ResultsViewed;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<ResultsViewed> resultsViewedList = new ArrayList<>();
    private List<MediaMetaDataViewed> mImage = new ArrayList<>();
    private Context context;

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NotNull MyViewHolder myViewHolder, int position) {
        ResultsViewed resultsViewed = resultsViewedList.get(position);
        MediaMetaDataViewed mediaMetaDataViewed = mImage.get(position);
        Glide.with(context)
                .load(mediaMetaDataViewed.getUrl())
                .into(myViewHolder.img_article);
        myViewHolder.article.setText(resultsViewed.getTitle());
        myViewHolder.article_date.setText(resultsViewed.getPublished_date());
    }

    @Override
    public int getItemCount() {
        return resultsViewedList.size();
    }

    public void setResultsViewedList(@NonNull List<ResultsViewed> resultsViewedList) {
        this.resultsViewedList = resultsViewedList;
        this.notifyDataSetChanged();
    }

    public void setmImage(@NonNull List<MediaMetaDataViewed> mImage) {
        this.mImage = mImage;
        this.notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView img_article;
        public TextView article;
        public TextView article_date;

        public MyViewHolder(View itemView) {
            super(itemView);
            img_article = itemView.findViewById(R.id.img_article);
            article = itemView.findViewById(R.id.article);
            article_date = itemView.findViewById(R.id.article_date);
        }
    }
}
