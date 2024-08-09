package Exam2;
class A
{
    String name;
    int age;
}

public class Practice
{
    public static void main(String[] args)
    {
       A obj=new A();
       obj.name="Dinesh";
       obj.age=44;
        System.out.println(obj.name);

        System.out.println(obj.age);
        A v1=new A();
        v1.name="Keerthi";
        v1.age=5;
        System.out.println(v1.age);
        System.out.println(v1.name);
    }
}
