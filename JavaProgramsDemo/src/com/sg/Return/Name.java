package com.sg.Return;
class Demo4
{
    String Myname(String name){
        return name;
    }
}

public class Name
{
    public static void main(String[] args)
    {
        Demo4 obj=new Demo4();
        String V1=obj.Myname("dinesh");
        System.out.println(V1);

    }
}
