package Abstract;

class Student
{
    static String Firstname;
    static int age;

    static {
        Firstname = "Dinesh";
        show();
    }
    static void show()
    {
        System.out.println(Firstname);

    }
}
public class Sexecute
{
    public static void main(String[] args)
    {
        Student.age=22;
        System.out.println(Student.age);

    }
}
