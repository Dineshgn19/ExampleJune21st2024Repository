package com.sg.Overloading;
class FirsrBuyer
{
    FirsrBuyer(String Name,String Property)
    {
        System.out.println("Buyer Name:"+Name);
        System.out.println("Property Type:"+Property);
    }
    FirsrBuyer(String City,int Price)
    {
        System.out.println("Property City:"+City);
        System.out.println("Property Price:"+Price);
    }
}
public class Buyer {
    public static void main(String[] args) {
        FirsrBuyer p2=new FirsrBuyer("Rahul","Site");
        FirsrBuyer p3=new FirsrBuyer("mysore",25);
    }
}
