package com.sgtest.programs;

import javax.swing.*;

class Nationalpark
{
    String Parkname;
    String location;
    int Ticket;
    Nationalpark()
    {

        Parkname="HDKote";
        location="Mysore";
        Ticket=100;

        System.out.println("Park name:"+Parkname);
        System.out.println("Location:"+location);
        System.out.println("Entry Price:"+Ticket);


    }
}
 class Wonderla
 {
     String Gamename;
     int Duration;
     int Ticket;
     Wonderla()
     {
         Gamename="Jointwheel";
         Duration=30;
         Ticket=300;


         System.out.println("Game Name:"+Gamename);
         System.out.println("Duration:"+Duration);
         System.out.println("Entry price:"+Ticket);
     }


 }
public class Program2 {
    public static void main(String args[])
    {
        Nationalpark obj1 = new Nationalpark();
        Wonderla obj2 = new Wonderla();
    }
}