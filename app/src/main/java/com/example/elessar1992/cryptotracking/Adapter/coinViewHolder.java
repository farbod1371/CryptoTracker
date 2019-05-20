package com.example.elessar1992.cryptotracking.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elessar1992.cryptotracking.R;

/**
 * Created by elessar1992 on 5/13/19.
 */

public class coinViewHolder extends RecyclerView.ViewHolder
{
    public ImageView coin_icon;
    public TextView coin_symbol;
    public TextView coin_name;
    public TextView coin_price;
    public TextView oneHourChange;
    public TextView twentyHourChange;
    public TextView sevenDayHour;

    public coinViewHolder(View itemView)
    {
        super(itemView);
        coin_icon = (ImageView) itemView.findViewById(R.id.coinIcon);
        coin_name = (TextView) itemView.findViewById(R.id.coinName);
        coin_symbol = (TextView) itemView.findViewById(R.id.coinSymbol);
        coin_price = (TextView) itemView.findViewById(R.id.priceUsd);
        oneHourChange = (TextView) itemView.findViewById(R.id.oneHour);
        twentyHourChange = (TextView) itemView.findViewById(R.id.twentyFourHour);
        sevenDayHour = (TextView) itemView.findViewById(R.id.sevenDay);
    }
}
