package com.sgtest.programs;

class Restaurent
{
    String Rname;
    String Rowner;
    String Foods;
    int Bill;
    Restaurent()
    {
    Rname="RK hotel";
    Rowner="Nagesh";
    Foods="Dosa";
    Bill=100;

    System.out.println("Rname:"+Rname);
    System.out.println("Rowner:"+Rowner);
    System.out.println("Foods:"+Foods);
    System.out.println("Bill:"+Bill);

    }
}

class FoodDelivery
{
    String Cname;
    String Dname;
    int nooforder;
    FoodDelivery()
    {
        Cname="Rmx";
        Dname="Satish";
        nooforder=10;
        System.out.println("Cname:"+Cname);
        System.out.println("Dname:"+Dname);
        System.out.println("nooforder:"+nooforder);

    }
}

public class Program1
{
    public static void main (String args[]) {
        Restaurent obj1 = new Restaurent();
        FoodDelivery obj2 = new FoodDelivery();
    }
}

