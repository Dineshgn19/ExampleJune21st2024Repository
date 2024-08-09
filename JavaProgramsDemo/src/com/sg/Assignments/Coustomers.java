package com.sg.Assignments;

class Users
{
    String Name;
    int Userid;
    Users()
    {
        Name="Keerthi";
        Userid=200;

        System.out.println("User Name:"+Name);
        System.out.println("User Id:"+Userid);
    }
}

class UserProfile
{
    String Location;
    int Bills;
    {
        Location="tumkur";
        Bills=25000;

        System.out.println("User Locatoin:"+Location);
        System.out.println("User Bills:"+Bills);

    }
}

class Roles
{
    String UserRoles;
    int Valodity;
    Roles()
    {
        UserRoles="HNI";
        Valodity=100;

        System.out.println("User Roles:"+UserRoles);
        System.out.println("User Validity:"+ Valodity);
    }
}
public class Coustomers
{
    public static void main (String args[])
    {
        Users obj1=new Users();
        UserProfile obj2=new UserProfile();
        Roles obj3= new Roles();
    }
}
