package com.Amodo;

import java.util.Scanner;

public class FlightBookingSystem {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter first name: ");
        String firstName = keyboard.nextLine();// local variable
        System.out.print("Please enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Please enter Your email: " );
        String email = keyboard.nextLine();  // another local variable
        keyboard.nextLine();  // to handle the end of line characters
        System.out.print("Please enter Your password: " );
        String password = keyboard.nextLine();
        System.out.print("Please enter Your Phone Number: " );
        long phNum = keyboard.nextLong();

        User user = new User(firstName,lastName,email,password,phNum);
        journey jr = new journey();
        SelectOption option = new SelectOption();

        jr.from();
        jr.to();
        option.option();

    }



//    public static void UserRegister(){
//        Scanner scan = new Scanner(System.in);
//       String name = scan.nextLine();
//       String email = scan.nextLine();
//       int  PhNum = scan.nextInt();
//        System.out.println("Registered Successfully ");
//    }
}
