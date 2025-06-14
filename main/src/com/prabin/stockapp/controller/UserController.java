package com.prabin.stockapp.controller;

import com.prabin.stockapp.model.User;
import com.prabin.stockapp.service.Userservice;

import java.util.Scanner;


public class UserController {
 private Userservice userservice = new Userservice();
    public User loginorregister(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("Choose option:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if(choice ==1){
            User user = userservice.login(username);
            if (user != null) {
                System.out.println(" Welcome back, " + username + "!");
                return user;
            } else {
                System.out.println(" User not found.");
            }
        }
        else {
            System.out.println("wait im updating");

        }

        return null;
    }

}
