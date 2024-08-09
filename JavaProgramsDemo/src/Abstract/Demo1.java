package Abstract;

abstract class College
{
    abstract void ShowCollegeName(String name);
    abstract void Showcityname(String name);
    void Showcourse (String Course[])
    {
        System.out.println("Course:");
        for (int i=0;i<Course.length;i++)
        {
            System.out.println("Course name:"+Course[i]);
        }
    }
}
 class Engineering extends College
{
    void ShowCollegeName(String name)
    {
        System.out.println("Engineering collge name:"+name);
    }
    void Showcityname(String name)
    {
        System.out.println("City name:"+name);
    }
    void DisplayAddress(String Address)
    {
        System.out.println("Address of the college:"+Address);
    }
}
public class Demo1
{
    public static void main(String[] args)
    {
       Engineering obj=new Engineering();
       obj.ShowCollegeName("MIT");
       obj.Showcityname("mysore");
       String s[]={"ece","mech","cs"};
       obj.Showcourse(s);
       obj.DisplayAddress("Vijaynagar,23rd main");

    }
}
