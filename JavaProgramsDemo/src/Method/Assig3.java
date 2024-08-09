package Method;

class Reverse
{
    void Firstrow (double a[][])
    {
    double res[]=a[0];
    for (int i=a.length;i>=0; i--)
        {
        System.out.print(res[i]+" ");
        }
    }
}
public class Assig3
{
    public static void main(String[] args)
    {
        double a[][]={{1.1,1.2,1.3,1.4},{2.1,2.2,2.3,2.4},{3.1,3.2,3.3,3.4}};
        Reverse o1=new Reverse();
        o1.Firstrow(a);

    }
}
