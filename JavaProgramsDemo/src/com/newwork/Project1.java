package com.newwork;

class Mobiel
{
    static int price(int mprice )
    {
        return mprice;
    }
}

public class Project1
{
    public static void main(String[] args)
    {
        Mobiel obj=new Mobiel();
        int v1=obj.price(999);
        System.out.println("mobile price:"+v1);
    }

}
