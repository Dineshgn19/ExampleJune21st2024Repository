package Abstract;


class Maths
{
    static String Mathstype;
    static String name;
    static void additon(int a,int b )
    {
        int Result=(a*b);
        System.out.println(Result);
    }
}
public class Saticdemo
{
    public static void main(String[] args)
    {
        Maths.Mathstype="Algebra";
        System.out.println(Maths.Mathstype);
        Maths.additon(22,3);
        Maths.additon(10,5);
        Maths.name="Dinesh";
        System.out.println(Maths.name);

    }
}
