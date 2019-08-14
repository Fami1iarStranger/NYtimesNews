package com.example.andronews2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.andronews2.viewed.ResultsViewed;
import com.example.andronews2.viewed.MediaMetaDataViewed;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;

    //correct param??
    private List<ResultsViewed> resultsVieweds = new ArrayList<>();
    private List<MediaMetaDataViewed> mImage = new ArrayList<>();

    public MyAdapter(Context context, List<ResultsViewed> resultsVieweds, List<MediaMetaDataViewed> mImage) {
        this.context = context;
        this.resultsVieweds = resultsVieweds;
        this.mImage = mImage;
    }

    //ok!
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    // correct for image???
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        ResultsViewed resultsViewed = resultsVieweds.get(position);
        //Glide.with(context)
        //        .asBitmap()
        //        .load(mImage)
        //        .into(myViewHolder.img_article);
        myViewHolder.article.setText(resultsViewed.getTitle());
        myViewHolder.article_date.setText(resultsViewed.getPublished_date());
    }

    //what to return?
    @Override
    public int getItemCount() {
        return resultsVieweds.size();
    }

    //ok!
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
