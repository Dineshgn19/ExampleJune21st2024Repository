package com.sg.Assignments;

import javax.swing.*;

class Fruits
{
    String Fname;
    int Quantity;
    String Fcolor;
    Fruits(String Fname,int Quantity, String Fcolor,int rate)

    {

        System.out.println("Fruits Name:"+Fname);
        System.out.println("Quantity in KG:"+Quantity);
        System.out.println("Fruits Color:"+Fcolor);

    }
}

class Flowers
{
    String Fname;
    String Fcolor;
    int Quantity;
    Flowers(String Fname, String Fcolor, int Quantity)

    {

        System.out.println("Flower name:"+Fname);
        System.out.println("Flower Colour:"+Fcolor);
        System.out.println("No of Quantity:"+Quantity);

    }
}

class Vegitables
{
    String Vegname;
    int Quantity1;
    Vegitables(String Vegname,int Quantity1)

    {

        System.out.println("Vegital name:"+Vegname);
        System.out.println("No of Kg:"+Quantity1);


    }
        }
public class Market
{
    public static void main (String args[])
    {
        Fruits obj1=new Fruits("Apple",1,"green",3);
        Flowers obj2= new Flowers("Rose","Red",2);
        Vegitables obj3=new Vegitables("tamota",2);
    }
}
