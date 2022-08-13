package com.Amodo;

import java.util.ArrayList;
import java.util.List;

public class journey {
//    Airport from;
//    Airport to;
//    int date;
//
//    public journey(Airport from, Airport to, int date) {
//        this.from = from;
//        this.to = to;
//        this.date = date;
//    }

    public void from(){
        System.out.println("From -->");
        List<String> fromState = new ArrayList<>(5);
        fromState.add("Kadapa Airport\t"+"----->"+"Andhra Pradesh\t");
        fromState.add("Pasighat Airport\t"+"----->"+"Arunachal Pradesh");
        fromState.add("Gaya Airport\t"+"----->"+"Bihar");
        fromState.add("Indira Gandhi International Airport\t"+"----->"+"Delhi");
        fromState.add("Dibrugarh Airport\t"+"----->"+"Assam");

        for (int i = 0; i<fromState.size(); i++){
            System.out.println(i+1+"."+fromState.get(i));
        }
    }
    public void to(){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("To -->");
        List<String> toState = new ArrayList<>(5);
        toState.add("Kadapa Airport\t"+"----->"+"Andhra Pradesh\t");
        toState.add("Pasighat Airport\t"+"----->"+"Arunachal Pradesh");
        toState.add("Gaya Airport\t"+"----->"+"Bihar");
        toState.add("Indira Gandhi International Airport\t"+"----->"+"Delhi");
        toState.add("Dibrugarh Airport\t"+"----->"+"Assam");

        for (int i = 0; i<toState.size(); i++){
            System.out.println(i+1+"."+toState.get(i));
        }
    }

}
