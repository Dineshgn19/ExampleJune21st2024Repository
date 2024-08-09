package Method;
class D1
{
    void chartp (char ch)
    {
        for (char c='p';c<='z'; c++)
        {
        System.out.print(c+" ");
        }

    }
}
public class Alpha
{
    public static void main(String[] args)
    {
     D1 o1=new D1();
     o1.chartp('p');
    }
}
