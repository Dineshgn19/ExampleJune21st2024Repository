package com.sg.Overloading;

class CarInsurance
{
        CarInsurance (String Company,int cover)
    {
        System.out.println("Health Insurance Comapany:"+Company);
        System.out.println("Insurance Primium:"+cover);
    }
        CarInsurance(String Damage,String Parts)
    {
        System.out.println("Hospital Name:"+Damage);
        System.out.println("total Covarage:"+Parts);
    }
}

public class Insurance
{
    public static void main(String[] args) {
        CarInsurance p1=new CarInsurance("TATA AIG",2);
        CarInsurance p2=new CarInsurance("Head lights","Seat");
    }
}
