package Exam2;

class A22
{
    String Firstname;
    String Branch;
    int Rollno;

    A22(String firstname,String branch,int rollno)
    {

        Branch="EC";
        Rollno=99;
        System.out.println("Name:"+firstname);
        System.out.println("Brancname:"+branch);
        System.out.println("Student name:"+rollno);
    }

    void dinesh(String dname)
    {
        Firstname="dinesh";
        System.out.println("int method");
        System.out.println(Firstname);
        System.out.println(Branch);
        System.out.println(Rollno);
        System.out.println(dname);
    }

}
public class A2
{
    public static void main(String[] args)
    {
        A22 obj=new A22("Keethi","Kusha",90);
       obj.dinesh("hangal");
        System.out.println();


    }
}
