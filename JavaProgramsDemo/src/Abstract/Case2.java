package Abstract;

class Sreturn
{
    static String getresult(String a[][])
    {
        String s="     ";
        for (int i=0; i<a.length;i++)
        {
            for (int j=0; j<a[i].length;j++)
            {
                s=s+a[i][j];
            }
        }
        return s;
    }
}

public class Case2
{
    public static void main(String[] args)
    {
        String val=Sreturn.getresult(new String[][]{{"DI","NE"},{"S","H"}});
        System.out.println(val);

    }
}
