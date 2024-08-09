package com.sgtest.programs;

import javax.swing.*;

class Animals
{
    String Animalname;
    int Noofanimals;
    int Animalage;
    Animals()
    {
        Animalname="Lion";
        Noofanimals=10;
        Animalage=50;

        System.out.println("Animla name:"+ Animalname);
        System.out.println("No of Animals:"+Noofanimals);
        System.out.println("Animal Age:"+Animalage);

    }
}

class Fishs
{
    String Fishname;
    String Color;
    int nooftypes;
    Fishs()
    {
        Fishname="Goldfish";
        Color="Goldcolor";
        nooftypes=10;
        System.out.println("Fish Name:"+Fishname);
        System.out.println("Fish Color:"+Color);
        System.out.println("No of Types:"+nooftypes);
    }
}
public class Program3
{
   public static void main (String args[])
  {
      Animals obj1=new Animals();
      Fishs obj2=new Fishs();
  }
}
