package Method;
class Dm12
{
    void Elements(int a[][])
    {
        for (int i=0;i<a.length;i++)
        {
            if((i==a.length-2)||(i==(a.length-1)))
            {
                for (int j=0; j<a[i].length;j++){
                    System.out.println(a[i][j]+"");
                }
            }
            System.out.println();
        }
    }
}

public class Assign12
{
    public static void main(String[] args)
    {
        Dm12 o1=new Dm12();
        o1.Elements(new int [][]{{10,20,30,40},{20,40,60,80},{15,25,35,55},{22,44,66,88}});

    }
}

