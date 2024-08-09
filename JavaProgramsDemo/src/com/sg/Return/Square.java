package com.sg.Return;

class SumSquare
{
    void sqr()
    {
        int sum=0;
        for (int i=1;i<=10;i++)
        {
            int sqr=i*i;
            System.out.println(i+"Sum of Square Result:"+sqr);
        }

    }
}
public class Square
{
    public static void main(String[] args)
    {

        SumSquare obj1=new SumSquare();
        obj1.sqr();

    }

}
