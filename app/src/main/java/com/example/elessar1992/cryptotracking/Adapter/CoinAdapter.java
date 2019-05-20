package com.example.elessar1992.cryptotracking.Adapter;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elessar1992.cryptotracking.Interface.Load;
import com.example.elessar1992.cryptotracking.Model.CoinModel;
import com.example.elessar1992.cryptotracking.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by elessar1992 on 5/13/19.
 */

public class CoinAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    Load load;
    boolean checkLoading;
    Activity activity;
    List<CoinModel> items;
    int visibleThreshold = 5;
    int lastVisibleItem;
    int totalItemCount;


    public CoinAdapter(RecyclerView recyclerView,Activity activity,List<CoinModel> items)
    {
        this.activity = activity;
        this.items = items;

        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                totalItemCount = linearLayoutManager.getItemCount();
                lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
                if(!checkLoading && totalItemCount <= lastVisibleItem + visibleThreshold)
                {
                    if(load != null)
                        load.LoadMore();
                    checkLoading = true;
                }
            }
        });
    }

    public void setLoad(Load load)
    {
        this.load = load;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity)
                .inflate(R.layout.coin_layout,parent,false);
        return new coinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        CoinModel item = items.get(position);
        coinViewHolder holderItem = (coinViewHolder)holder;

        holderItem.coin_name.setText(item.getName());
        holderItem.coin_symbol.setText(item.getSymbol());
        holderItem.coin_price.setText(item.getPrice_usd());
        holderItem.oneHourChange.setText(item.getPercentage_change_1h()+"%");
        holderItem.twentyHourChange.setText(item.getPercentage_change_24h()+"%");
        holderItem.sevenDayHour.setText(item.getPercentage_change_7d()+"%");

        Picasso.with(activity)
                .load(new StringBuilder("https://res.cloudinary.com/dxi90ksom/image/upload/")
                .append(item.getSymbol().toLowerCase()).append(".png").toString())
                .into(holderItem.coin_icon);

        /*holderItem.oneHourChange.setTextColor(item.getPercentage_change_1h().contains("-")?
                Color.parseColor("#FF0000"):Color.parseColor("#32CD32"));
        holderItem.twentyHourChange.setTextColor(item.getPercentage_change_1h().contains("-")?
                Color.parseColor("#FF0000"):Color.parseColor("#32CD32"));
        holderItem.sevenDayHour.setTextColor(item.getPercentage_change_1h().contains("-")?
                Color.parseColor("#FF0000"):Color.parseColor("#32CD32"));*/
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }

    public void setCheckLoading(){checkLoading = false;}

    public void updateData(List<CoinModel> coinModels)
    {
        this.items = coinModels;
        notifyDataSetChanged();
    }
}
