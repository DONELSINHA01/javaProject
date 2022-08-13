package com.Amodo;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Dated {
    String day;



   public void dateMethod(){
       Calendar cal = Calendar.getInstance();

       //creating a constructor of the SimpleDateFormat class
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//getting current date
       System.out.println("Departure date (dd-MM-yyyy): "+sdf.format(cal.getTime()));


       //creating a constructor of the Format class
//displaying full-day name
       Format f = new SimpleDateFormat("EEEE");
       String str = f.format(new Date());

       day=str;




   }
}
