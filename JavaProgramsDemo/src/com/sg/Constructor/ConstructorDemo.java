package com.sg.Constructor;
class Customer
{

    String Firstname;
    String Email;

Customer (String Firstname, String Email)
{
    System.out.println("In Constructor!!");
    Firstname = Firstname;
    Email = Email;
    System.out.println("First Name:" + Firstname);
    System.out.println("Email Id:" + Email);
}
    void display()
    {
        System.out.println(" In Method!!!");
        System.out.println("First Name:"+Firstname);
        System.out.println("Email Id:"+Email);
    }
}

public class ConstructorDemo
{
public static void main(String args[])
    {
    Customer o1=new Customer("Santosh","santu@gmail.com");
    o1.display();
    }
}
