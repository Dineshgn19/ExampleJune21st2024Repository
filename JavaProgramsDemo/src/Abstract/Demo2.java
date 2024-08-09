package Abstract;
abstract class College1
{
    void Showcourse(String Coures[])
    {
        System.out.println("Course");
        for (int i=0;i<Coures.length;i++)
        {
            System.out.println("Courese name:"+Coures);
        }
    }
    abstract void Showcityname(String name);
}
    class Engineering1 extends College1
    {
        void Showcollegename(String  name)
        {
            System.out.println("Engineering clg name:"+name);
        }
        void Showcityname(String name)
        {
            System.out.println("City name:"+name);
        }
    }

public class Demo2
{
    public static void main(String[] args)
    {
        Engineering1 obj=new Engineering1();
        obj.Showcollegename("mit");
        obj.Showcityname("mysore");
        String s[]={"civil","ec","eee"};
        obj.Showcourse(s);

    }
}
