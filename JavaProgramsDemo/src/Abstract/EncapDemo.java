package Abstract;

class A
{
    private int value;

    public void setValues(int x)
    {
        value=x;

    }

    public int getValues()
    {
        return value;
    }
}


public class EncapDemo
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.setValues(100);
        System.out.println(obj.getValues());
    }
}
