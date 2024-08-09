package Method;

import java.sql.SQLOutput;

class Demo7
{
    void castchar (char a[][])
{
    int b[][]=new int[a.length][a[0].length];
    int k=0,z=0;
    for (int i=0;i<a.length;i++)
    {
        for (int j=0; j<a[i].length; j++){
        b[k][z]=a[i][j];
        System.out.println(b[k][z]+" ");

    }
        System.out.println();
    }
}
}
public class Assign7
{
    public static void main(String[] args)
    {
        System.out.println("array to integer:");
        Demo7 o1=new Demo7();
        o1.castchar(new char[][]{{'A','B','C'},{'E','F','G'},{'H','I','J'}});

    }
}
