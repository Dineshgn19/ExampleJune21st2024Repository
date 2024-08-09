package com.sg.Return;

class Test
{
   boolean inprime(int num)
   {
       boolean Test=true;
       for(int i=2;i<num;i++){
           if(num%i==0){
               Test=false;
               break;
           }
       }
       return Test;
   }

}

public class Demo1
{
    public static void main(String[] args)
    {
        Test obj=new Test();
        boolean v1=obj.inprime(31);
        System.out.println(v1);

    }
}
