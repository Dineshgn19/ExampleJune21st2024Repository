package com.sg.Constructor;

import java.sql.SQLOutput;

class Wholeseller
{
    String Wname;
    String Location;
    int Quantity;
    Wholeseller(String Wname, String Location,int Quantity)
    {
        this.Wname=Wname;
        this.Location=Location;
        this.Quantity=Quantity;
        System.out.println("Whole Seller Name:"+ Wname);
        System.out.println("Seller Name:"+Location);
        System.out.println("No of Quantity:"+Quantity);
    }
}
class Retailer
{
    String Shopname;
    String Area;
    int Code;
    Retailer(String Shopname,String Area,int Code)
    {
        this.Shopname=Shopname;
        this.Area=Area;
        this.Code=Code;
        System.out.println("Retailer Shopname:"+Shopname);
        System.out.println("Area:"+Area);
        System.out.println("Retailer Code:"+Code);
    }
}
class Purchaser
{
    String Pname;
    String Parea;
    int Bill;
    Purchaser(String Pname,String Parea,int Bill)
    {
        this.Pname=Pname;
        this.Parea=Parea;
        this.Bill=Bill;
        System.out.println("Purshaser Name:"+Pname);
        System.out.println("Purchasing Area:"+Parea);
        System.out.println("Total bill:"+Bill);
    }

}
public class Product
{
    public static void main(String[] args)
    {
    Wholeseller o1=new Wholeseller("Goodlife","Mysore",100);
    Retailer o2=new Retailer("BigBazzar","Vijaynagar",570017);
    Purchaser o3=new Purchaser("Keerthi","Food",1000);
    }
}
