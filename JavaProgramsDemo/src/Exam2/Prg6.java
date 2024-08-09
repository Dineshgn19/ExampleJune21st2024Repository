package Exam2;

import org.w3c.dom.ls.LSOutput;

class Demo6
{
    Demo6(int a ,int b)
    {
        int add=(a+b);
        System.out.println("Constroctor method:"+add);
    }

    {

        System.out.println("instance Method");
    }
}


public class Prg6
{
    public static void main(String[] args)
    {

        Demo6 obj=new Demo6(3,6);


    }

}
