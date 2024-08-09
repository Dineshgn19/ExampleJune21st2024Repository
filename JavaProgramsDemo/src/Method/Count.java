package Method;

import org.w3c.dom.ls.LSOutput;

class Evencount
{
    void Even ()
    {
        int count=0;
        for (int i=1; i<=500; i++)
            if(i%2==0)
        {
            count=count+1;
        }
        System.out.println(count);
    }

}


public class Count
{
    public static void main(String[] args)
    {
        Evencount o1=new Evencount();
        o1.Even();
    }
}
