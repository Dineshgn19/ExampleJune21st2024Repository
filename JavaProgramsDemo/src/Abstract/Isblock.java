package Abstract;


class Ab
{
    static void show2()
    {
        System.out.println("static method");
    }
        public void show()
        {
            System.out.println(" its a Instanc  method");
        }
        Ab()
    {
        System.out.println("Its Constructor");
    }

    {
        System.out.println("Its a Instance Blockhh");
    }

}
public class Isblock
{
    public static void main(String[] args)
    {
        Ab.show2();
        Ab obj=new Ab();


    }
}
