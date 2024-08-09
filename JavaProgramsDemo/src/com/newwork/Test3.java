package com.newwork;
class Maths
{
    static int add(int a ,int b)
    {
        return (a+b);
    }

    int mult (int a,int b)
    {
        return (a*b);
    }
}
public class Test3
{
    public static void main(String[] args)
    {
      int sum=Maths.add(22,44);
        System.out.println("Add sum"+sum);


        Maths obj=new Maths();
        int res=obj.mult(3,5);
        System.out.println(res);

    }
}
