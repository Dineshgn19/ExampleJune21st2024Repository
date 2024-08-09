package com.sg.Constructor;


class Shop
{
    String Shopname;
    int Shopno;
    String ShopOwner;
    Shop(String Shopname,int Shopno, String ShopOwner)
    {
        System.out.println("In Constructor!!");
        this.Shopname=Shopname;
        this.Shopno=Shopno;
        this.ShopOwner=ShopOwner;
        System.out.println("Shop Name:"+Shopname);
        System.out.println("Shop Number:"+Shopno);
        System.out.println("Shop Owner:"+ShopOwner);
    }

}
class Purschase
{
    String Product;
    String Company;
    int Quqntity;
    Purschase(String Product,String Company,int Quqntity)
    {
        this.Product=Product;
        this.Company=Company;
        this.Quqntity=Quqntity;
        System.out.println("Product Name:"+Product);
        System.out.println("Company Name:"+Company);
        System.out.println("No Of Quqntity:"+Quqntity);
    }
}
class Distributor
{
    String Dname;
    String Dcompany;
    int ProId;
    Distributor(String Dname,String Dcompany, int ProId)
    {
        this.Dname=Dname;
        this.Dcompany=Dcompany;
        this.ProId=ProId;
        System.out.println("Distributor Name:"+Dname);
        System.out.println("Distributor Company:"+Dcompany);
        System.out.println("Product Id:"+ProId);

    }
}
public class Shopping
{
    public static void main(String[] args)
    {
       Shop o1=new Shop("RK Store",01,"Rahul");
       Purschase o2=new Purschase("Shampo","Sunsilk",20);
       Distributor o3=new Distributor("Reliance","Rmart",02);
    }
}
