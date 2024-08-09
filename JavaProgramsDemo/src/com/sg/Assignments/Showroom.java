package com.sg.Assignments;

import javax.swing.*;

class Twowheelr
{
    String Bikename;
    String Bikecolor;
    int Price;
    Twowheelr()
    {
        Bikename="Honda Unicorn";
        Bikecolor="Black";
        Price=80000;

        System.out.println("Bike Name:"+Bikename);
        System.out.println("Bike Color:"+Bikecolor);
        System.out.println("Bike On road Price:"+ Price);
    }
}

class Fourwheelr
{
    String Company;
    String Varient;
    int Model;
    Fourwheelr()

    {
        Company="Nissan";
        Varient="Micra";
        Model=2013;

        System.out.println("Car Company Name:"+Company);
        System.out.println("Car Varient:"+Varient);
        System.out.println("Car Model:"+Model);

    }
}

class HeavyVehicle
{
    String Vehiclename;
    String Vcolor;
    int CC;
    HeavyVehicle()

    {
        Vehiclename="Lorry";
        Vcolor="Green";
        CC=3000;

        System.out.println("Vehicle Company:"+ Vehiclename);
        System.out.println("Vehicle color:"+Vcolor);
        System.out.println("Vehicle Capacity in CC:"+CC);



    }
}
public class Showroom {
    public static void main(String args[])
    {
        Twowheelr obj1 = new Twowheelr();
        Fourwheelr obj2=new Fourwheelr();
        HeavyVehicle obj3= new HeavyVehicle();
    }
}