package com.example.elessar1992.cryptotracking.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.example.elessar1992.cryptotracking.R;

/**
 * Created by elessar1992 on 5/13/19.
 */

public class LoadingViewHolder extends RecyclerView.ViewHolder
{
    public ProgressBar progressBar;
    public LoadingViewHolder(View itemView)
    {
        super(itemView);
        progressBar = (ProgressBar) itemView.findViewById(R.id.progress_bar);
    }
}
