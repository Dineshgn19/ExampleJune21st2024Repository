package Gitwork;
class Count
{
    void Demo2()
    {
        int count =0;
        for (int i=100;i<=300;i++)
        {
          if(i%2==0)
          {
              count++;
          }
        }
        System.out.println(count);
    }

}
public class EvenCount
{
    public static void main(String[] args)
    {
    Count obj=new Count();
    obj.Demo2();

    }

}
