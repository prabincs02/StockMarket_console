package com.prabin.stockapp.service;

import com.prabin.stockapp.model.Stock;
import com.prabin.stockapp.repository.Datastore;

import java.util.List;

public class StockService {

    public List<Stock> getallstocks(){
        return Datastore.stock;
    }

    public Stock getbysymbol(String symbol){
        for(Stock stock : Datastore.stock){
            if(stock.getSymbol().equalsIgnoreCase(symbol)){
                return stock;
            }
        }
        return null;
    }


}
