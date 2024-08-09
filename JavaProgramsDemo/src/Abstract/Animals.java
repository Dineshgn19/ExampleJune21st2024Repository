package Abstract;
abstract class Allanimals
{
    abstract void Sound();
}
class Dog extends Allanimals
{
     void Sound()
     {
         System.out.println("Black dog");
     }
}

class Lion extends Allanimals
{
    void Sound()
    {
        System.out.println("Big liion");
    }
}
public class Animals
{
    public static void main(String[] args)
    {
        Dog D=new Dog();
        Lion L=new Lion();
        D.Sound();
        L.Sound();
    }
}
