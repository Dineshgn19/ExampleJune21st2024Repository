package com.newwork;
class Demo2
{
    String firstname;
    String cityname;
    int code;
    Demo2(String fn,String ctname,int cd)
    {
        fn="dines";
        ctname="mysore";
        cd=7788;
        System.out.println(fn);
        System.out.println(ctname);
        System.out.println(cd);

    }
}
public class Test2
{
    public static void main(String[] args)
    {
        Demo2 obj=new Demo2("Dinesh","mysore",99);



    }
}
