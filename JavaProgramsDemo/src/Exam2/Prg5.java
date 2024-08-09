package Exam2;
class Demo5
{
    static String name;
    static int age;
    {

        System.out.println(age);
        System.out.println(name);
    }

    {
        System.out.println("Instance method");
    }
}
public class Prg5
{
    public static void main(String[] args)
    {
        Demo5 obj=new Demo5();
        Demo5.name="Dinesh";
        System.out.println("Static method:"+Demo5.name);
        Demo5.age=33;
        System.out.println("Static Method:"+Demo5.age);
    }
}
