package Exam2;



class Test
{
    String firstname;
    String email;
    Test(String myname, String Email1)
    {
        System.out.println("In constructor");
        this.firstname="keethi";
        this.email="rvk";
        System.out.println(firstname);
        System.out.println(email);
    }
    void display ()
    {
        System.out.println("in Method");
        System.out.println(firstname);
        System.out.println(email);
    }
}



public class Dtest
{
    public static void main(String[] args)
    {
        Test  o=new Test("Dinesh","dieshg@gmail.com");
        Test o1=new Test("ggg","uuu");
        o.display();


    }
}
