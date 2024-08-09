  package Exam2;
class Am
{
    void d1 (int x,int y)
    {
        int res=x*y;
        int gg=x/y;
        System.out.println("divison:"+gg);
        System.out.println("Multiplcation:"+res);
    }
        void d2(int x,int y)
        {
            int add=x+y;
            System.out.println("Addition:"+add);
        }
}
public class Amethod
{
    public static void main(String[] args)
    {
        Am b=new Am();
        b.d1(4,6);
        b.d2(6,9);
        b.d1(55,8);

    }
}
