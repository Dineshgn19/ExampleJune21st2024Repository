package com.sg.Assignments2;

class Sum
{
    Sum(int a[][])
    {
        int Total=0;
        for (int i=0;i<a.length;i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                Total=Total+a[i][j];
            }
        }
    }
}
public class SumMath
{
    public static void main(String[] args)
    {
    Sum o4=new Sum(new int[][]{{10,20,30},{5,10,15},{4,8,12}});
    }
}
