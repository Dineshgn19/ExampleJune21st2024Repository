package Method;
class Demo11
{
    void tables()
    {
        for (int i=1;i<=20; i++)
        {
            for(int j=1;j<=10;j++)
            {
                String Str=(i+"*"+j +"="+(i*j));
                System.out.println(Str);
            }
            System.out.println("-------------------");
        }
    }
}
public class Assign11
{
    public static void main(String[] args)
    {
     Demo11 o1=new Demo11();
     o1.tables();
    }
}
