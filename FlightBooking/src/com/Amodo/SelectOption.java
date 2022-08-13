package com.Amodo;

import java.util.Date;
import java.util.Scanner;

public class SelectOption extends Date {

    public void option() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Departure and Destination Airport");
        int op = scan.nextInt();

        switch (op) {
            case 12:
                System.out.println("Kadapa to Pasighat Airport");


                break;
            case 13:
                System.out.println("kapapa to Gaya Airport");
                break;
            case 14:
                System.out.println("Kadapa to Indira Gandhi International Airport");
                break;
            case 15:
                System.out.println("Kadapa to Dibrugarh Airport");
                break;
            case 21:
                System.out.println("Pasighat to Kadapa Airport");
                break;
            case 23:
                System.out.println("Pasighat to Gaya Airport");
                break;
            case 24:
                System.out.println("Pasighat to Indira Gandhi International Airport");
                break;
            case 25:
                System.out.println("Pasighat to Dibrughar Airport");
                break;
            case 31:
                System.out.println("Gaya to Kadapa Airport");
                break;
            case 32:
                System.out.println("Gaya to Pasighat Airport");
                break;
            case 34:
                System.out.println("Gaya to Indira Gandhi International Airport");
                break;
            case 35:
                System.out.println("Gaya to Dibrughar Airport");
                break;
            case 41:
                System.out.println("Indira Gandhi International Airport to Kadapa Airport ");
                break;
            case 42:
                System.out.println("Indira Gandhi International Airport to Pasighat Airport");
                break;
            case 43:
                System.out.println("Indira Gandhi International Airport to Gaya Airport");
                break;
            case 45:
                System.out.println("Indira Gandhi International Airport to Dibrughar Airport");
                break;
            case 51:
                System.out.println("Dibrughar to Kadapa Airport");
                break;
            case 52:
                System.out.println("Dibrughar to Pasighat Airport");
                break;
            case 53:
                System.out.println("Dibrughar to Gaya Airport");
                break;
            case 54:
                System.out.println("Dibrughar to Indira Gandhi International Airport");
                break;


        }
    }
}
