package com.sg.Assignments;

import javax.swing.*;
import java.util.SimpleTimeZone;

class Employee
{
    String Ename;
    int Eid;
    String Ejob;
    Employee()
    {
        Ename="Rahul";
        Eid=01;
        Ejob="Manager";

        System.out.println("Employee Name:"+Ename);
        System.out.println("Employee Id:"+Eid);
        System.out.println("Employee job:"+Ejob);
    }
}

class Department
{
    String Dname;
    int Deptid;
    String Location;

    {
        Dname="HR";
        Deptid=11;
        Location="Mysore";

        System.out.println("Department Name:"+Dname);
        System.out.println("Department Id:"+Deptid);
        System.out.println("Department Location:"+Location);
    }
}

class Insurance
{
    String Icompany;
    String Iplan;
    int Primium;

    {
        Icompany="Cigna Manipal";
        Iplan="Health Insurance";
        Primium=100000;

        System.out.println("Insurance Company:"+Icompany);
        System.out.println("Insurance Plan:"+Iplan);
        System.out.println("Insurance Primium:"+Primium);


    }
}
public class Office {
    public static void main(String args[]) {
        Employee obj1 = new Employee();
        Department obj2 = new Department();
        Insurance obj3 = new Insurance();
    }
}
