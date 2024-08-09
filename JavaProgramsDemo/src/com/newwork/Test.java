package com.newwork;

import java.sql.SQLOutput;

class Demo1
{
    String firstname;
    int age;
}
public class Test
{
    public static void main(String[] args)
    {
        Demo1 obj=new Demo1();
        obj.firstname="Dinesh";
        obj.age=75;
        System.out.println("First name:"+ obj.firstname);
        System.out.println("current age:"+obj.age);

        Demo1 obj2=new Demo1();
        obj2.age=66;
        obj2.firstname="keerthiraj";
                System.out.println(obj2.firstname);
        System.out.println(obj2.age);
    }
}
