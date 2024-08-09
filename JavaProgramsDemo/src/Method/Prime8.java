package Method;
class PrimeNumber
{
    void Even()
    {

        for (int i=2;i<=50; i++)
            if(i%i==0)
            {
                System.out.println(i);
            }
    }
}

public class Prime8
{
    public static void main(String[] args)
    {
    PrimeNumber o1=new PrimeNumber();
    o1.Even();
    }
}
