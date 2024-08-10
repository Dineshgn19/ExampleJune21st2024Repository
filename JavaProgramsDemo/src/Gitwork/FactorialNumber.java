package Gitwork;

import java.sql.SQLOutput;

class Demofactnum
{
    int Getfactorial(int num)
    {
        if(num ==1)
        {
            return 1;
        }
        return  num*Getfactorial(num-1);
    }
}

public class FactorialNumber
{
    public static void main(String[] args)
    {
        Demofactnum obj=new Demofactnum();
        System.out.print("Given Factoria numner");
        System.out.println(obj.Getfactorial(4));
    }
}
