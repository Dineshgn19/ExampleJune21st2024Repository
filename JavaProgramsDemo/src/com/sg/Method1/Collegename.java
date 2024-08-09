package com.sg.Method1;
class Demo1
{
    String clname(String Cname)
    {
        return Cname;
    }
}
public class Collegename
{
    public static void main(String[] args)
    {
        Demo1 oj=new Demo1();
        String v1= oj.clname("Mysore Engineering clg");
        System.out.println(" Name of the college:"+v1);

    }
}
