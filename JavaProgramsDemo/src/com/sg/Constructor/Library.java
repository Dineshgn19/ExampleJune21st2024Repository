package com.sg.Constructor;

import java.sql.SQLOutput;

class NewsPaper
{
    String PaperName;
    String Language;
    int NoofPage;
    NewsPaper(String Papername,String Language,int Noofpage)
    {
        this.PaperName=PaperName;
        this.Language=Language;
        this.NoofPage=NoofPage;
        System.out.println("News Paper Name:"+PaperName);
        System.out.println("News Paper Language:"+Language);
        System.out.println("Number Of Pages:"+Noofpage);


    }
}
class Magzin
{
    String Mname;
    int Mprice;
    String Month;
    Magzin(String Mname,int Mprice,String Month)
    {
        this.Mname=Mname;
        this.Mprice=Mprice;
        this.Month=Month;
        System.out.println("Magzin Name:"+Mname);
        System.out.println("Magzin Price:"+Mprice);
        System.out.println("Release Month:"+Month);
    }
}

class Comics
{
    String BookName;
    String Author;
    int Price;
    Comics(String BookName,String Author,int Price)
    {
        this.BookName=BookName;
        this.Author=Author;
        this.Price=Price;
        System.out.println("Comic BookName:"+BookName);
        System.out.println("Comic Book Author:"+Author);
        System.out.println("Comic book Price:"+Price);
    }
}

public class Library
{
    public static void main(String[] args)
    {
    NewsPaper o1=new NewsPaper("Mysore Mirroe","English",20);
    Magzin O2=new Magzin("Realty World",999,"July");
    Comics o3=new Comics("Cartoons","Ford",499);
    }
}
