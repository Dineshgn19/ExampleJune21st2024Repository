package Method;
class Fact1
{
    void Factorial(int a)
    {
           int f=1;
           for( int i=1;i<=a;i++)
           {
               f=f*i;
           }
        System.out.println(f);

    }
}
public class Factorial
{
    public static void main(String[] args)
    {
    Fact1 o=new Fact1();
    o.Factorial (3);
    o.Factorial(4);
    }
}
