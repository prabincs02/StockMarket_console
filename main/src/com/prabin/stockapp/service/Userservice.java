package com.prabin.stockapp.service;

import com.prabin.stockapp.model.User;
import com.prabin.stockapp.repository.Datastore;

public class Userservice {

    public User login(String username){
        return Datastore.users.get(username);
    }
    public boolean register(String username,double balance){
        if(Datastore.users.containsKey(username))
            return false;
        Datastore.users.put(username,new User(username,balance));
        return true;
    }

    public double checkbalance(String username){
           if(Datastore.users.containsKey(username)){
               return Datastore.users.get(username).getBalance();
           }
           return 0;
    }

}
