package com.sg.Constructor;
class Customer2
{
    String Firstname;
    String email;
    Customer2(String Firstname, String email)
    {
        System.out.println(" In Operator!!!");
        this.Firstname=Firstname;
        this.email=email;
        System.out.println("First Name:"+Firstname);
        System.out.println("Email:"+email);

    }
    void display()
    {
        System.out.println("In Method");
        System.out.println("First Name:"+Firstname);
        System.out.println("Email ID:"+email);
    }

}

public class Demo2
{
    public static void main(String[] args)
    {
        Customer2 o1=new Customer2("Santosh","Santu@gmail.com");
                o1.display();
    }
}
