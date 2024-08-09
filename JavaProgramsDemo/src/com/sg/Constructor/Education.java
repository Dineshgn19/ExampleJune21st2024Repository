package com.sg.Constructor;


class University {
    String Uname;
    String Location;
    int code;

    University(String Uname, String Location, int code)
    {
        this.Uname=Uname;
        this.Location=Location;
        this.code=code;
        System.out.println("University Name:" + Uname);
        System.out.println("University Adress:" + Location);
        System.out.println("University Code:" + code);
    }
}

class College
{
    String Cname;
    String Branch;
    int Ccode;
    College(String Cname, String Branch,int Ccode)
    {
        this.Cname=Cname;
        this.Branch=Branch;
        this.Ccode=Ccode;
        System.out.println("College Name:"+Cname);
        System.out.println("Branch Name:"+Branch);
        System.out.println("Colege Code:"+Cname);
    }
}
class Student
{
    String Sname;
    String SClass;
    int SId;
    Student(String Sname,String SClass,int SId)
    {
        this.Sname=Sname;
        this.SClass=SClass;
        this.SId=SId;
        System.out.println("Student Name:"+Sname);
        System.out.println("Student Class:"+SClass);
        System.out.println("Student Id:"+SId);
    }
}
public class Education
{
    public static void main(String[] args)
    {
      University o1=new University("Vtu","Belgam",01);
      College o2=new College("Rvk","EC",3);
      Student o3=new Student("Santosh","Second",8);

    }
}
