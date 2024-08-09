package Exam2;
class Maths
{
    static int add (int a,int b)
    {
        return a+b;
    }
    int multy (int a,int b)
    {
        return a*b;
    }
}
public class Prt2
{
    public static void main(String[] args)
    {

        int sum= Maths.add(55,66);

            System.out.println("Addition:"+sum);
            Maths obj=new Maths();
            int cal=obj.multy(3,6);
            System.out.println("multy:"+cal);

    }
}
