package com.example.elessar1992.cryptotracking.Model;

/**
 * Created by elessar1992 on 5/13/19.
 */

public class CoinModel
{
    public String id;
    public String name;
    public String symbol;
    public String price_usd;
    public String percent_change_1h;
    public String percent_change_24h;
    public String percent_change_7d;

    public CoinModel()
    {
    }

    public CoinModel(String id, String name, String symbol, String price_usd, String percentage_change_1h, String percentage_change_24h, String percentage_change_7d)
    {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price_usd = price_usd;
        this.percent_change_1h = percentage_change_1h;
        this.percent_change_24h = percentage_change_24h;
        this.percent_change_7d = percentage_change_7d;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public String getPercentage_change_1h() {
        return percent_change_1h;
    }

    public String getPercentage_change_24h() {
        return percent_change_24h;
    }

    public String getPercentage_change_7d() {
        return percent_change_7d;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public void setPercentage_change_1h(String percentage_change_1h) {
        this.percent_change_1h = percentage_change_1h;
    }

    public void setPercentage_change_24h(String percentage_change_24h) {
        this.percent_change_24h = percentage_change_24h;
    }

    public void setPercentage_change_7d(String percentage_change_7d) {
        this.percent_change_7d = percentage_change_7d;
    }
}
