package Gitwork;
class Test
{
    Test(int a ,int b)
    {
        int add=(a+b);
        System.out.println("Constroctor method:"+add);
    }

    {

        System.out.println("instance Method");
    }
}
public class Demo4
{
    public static void main(String[] args)
    {
        Test obj=new Test(66,76);

    }
}
