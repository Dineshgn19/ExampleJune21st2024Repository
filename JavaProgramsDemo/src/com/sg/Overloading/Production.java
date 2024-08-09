package com.sg.Overloading;
class Product
{
    String Pname;
    int Pid;
    Product(String Pname,String Pid)
    {
        System.out.println("Product Name:"+Pname);
        System.out.println("Product Id:"+Pid);
    }
    Product(String Pmonth,int Expyear)
    {
        System.out.println("Product Manf Month:"+Pmonth);
        System.out.println("Prodect Expiry Month:"+Expyear);
    }
}
public class Production
{
    public static void main(String[] args)
    {
        Product o1=new Product("July",2024);
        Product o2=new Product("bread",003);

    }
}
