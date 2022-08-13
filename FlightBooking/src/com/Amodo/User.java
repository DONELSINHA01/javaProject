package com.Amodo;

import java.util.Scanner;

public class User extends FlightBookingSystem {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long phNum;

    //constructor


    public User(String firstName, String lastName, String email, String password, long phNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phNum = phNum;

    }
    public void print(){
        System.out.println(firstName+" "+lastName+" "+email+" "+password+" "+phNum);
    }



}
