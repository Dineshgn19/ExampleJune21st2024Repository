package Method;
class Count13
{
    void demo13()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if((i%2==0)&&(i%4==0)&&(i%6==0))
            {
                count++;
            }
        }
        System.out.println("Total count:"+count);
    }
}
public class Assign13
{
    public static void main(String[] args)
    {
    Count13 o1=new Count13();
    o1.demo13();
    }
}
