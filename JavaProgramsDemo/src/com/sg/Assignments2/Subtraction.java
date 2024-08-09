package com.sg.Assignments2;
class Submath
{
    Submath(int x[][],int y[][])
    {
        for (int i=0; i<x.length; i++)
        {
            for (int j=0; j<x[i].length;j++)
            {
                int res=(x[i][j]-y[i][j]);
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}

public class Subtraction
{
    public static void main(String[] args) {
        int a[][]={{50,30,20},{60,50,20}};
        int b[][]={{5,3,1},{3,4,1}};
        Submath o1=new Submath(a,b);

    }
}
