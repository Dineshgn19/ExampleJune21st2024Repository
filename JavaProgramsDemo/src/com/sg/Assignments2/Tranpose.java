package com.sg.Assignments2;
class Ass2
{
    Ass2(int x[][])
    {
        int y[][]=new int [x.length][x[0].length];
        for (int i=0; i<x.length; i++)
        {
            for (int j=0; j<x[i].length; j++)
            {
                y[i][j]=x[j][i];
                System.out.print(y[i][j]+"  ");

            }
            System.out.println();
        }
    }
}
public class Tranpose
{
    public static void main(String[] args) {
        Ass2 o2=new Ass2(new int[][]{{1,1,1},{2,2,2},{3,3,3}});
    }

}