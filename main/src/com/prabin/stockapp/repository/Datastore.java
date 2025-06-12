package com.prabin.stockapp.repository;

import com.prabin.stockapp.model.Stock;
import com.prabin.stockapp.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datastore {

    public static List<Stock>stock = new ArrayList<>();
    public static Map<String, User> users= new HashMap<>();

    static {
        stock.add(new Stock("TATA",567));
        stock.add(new Stock("TCS",2567));
        stock.add(new Stock("MRF",122567));

        users.put("Prabin",new User("Prab",1000));
        users.put("kingson",new User("King",5000));
        users.put("Kumar",new User("chandra",20000));
    }
}
