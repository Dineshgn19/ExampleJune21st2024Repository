package com.sg.Method1;
class Demo2
{
    String getcolor(String fcolor)
    {
        return fcolor;
    }
}
public class Color
{
    public static void main(String[] args)
    {
        Demo2 o2=new Demo2();
        String v2=o2.getcolor("Yellow");
        System.out.println("My fovt Color:"+v2);

    }
}
