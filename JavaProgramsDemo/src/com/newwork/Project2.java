package com.newwork;
class Birds
{
    static String Birdname(String Bname)
    {
        return Bname;

    }

}
public class Project2
{
    public static void main(String[] args)
    {
        Birds obj=new Birds();

        obj.Birdname("Peagon");

        System.out.println(obj.Birdname("Peagon"));
        System.out.println(obj.Birdname("Parrot"));
        System.out.println(obj.Birdname("Peacock"));




    }
}
