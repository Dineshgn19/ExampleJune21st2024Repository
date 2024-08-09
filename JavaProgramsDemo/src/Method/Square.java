package Method;

class SumSquare
{
    void Square()

    {
        int res=0;
        for (int a=1;a<=10;a++)

        {
            res=res+(a*a);
        }
        System.out.println(res);
    }

}


public class Square
{
    public static void main(String[] args)
    {
     SumSquare o1=new SumSquare();
             o1.Square();
    }
}

