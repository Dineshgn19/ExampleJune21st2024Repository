package com.sg.Return;

class Numbers
{
    int[] even()
    {
        int evenitems[]={2,4,6,8};
        return evenitems;
    }
     int [] odd ()
     {
         int odditems[]={1,3,5,7};
         return odditems;
     }
}
public class Demo3
{
    public static void main(String[] args)
    {
        Numbers data=new Numbers();
        int[] E1=data.even();
        System.out.print("even number:");
        for(int kk:E1)
        {
            System.out.println(kk);
        }
        System.out.println();

        int [] E2=data.odd();
        for(int kk:E2){
            System.out.print(kk);
        }
        System.out.println();

    }

}
