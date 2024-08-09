package Polymorphism;
 abstract class Animals
 {
     abstract void sounds();

         class dog extends Animals
         {
             void sounds()
             {
                 String s1="Bark";
                 System.out.println("Animal dog Sounds:"+ s1);
             }
         }
         class Lion extends Animals
         {
             @Override
             void sounds()
             {
                 String s2= "Roar";
                 System.out.println("Animal lion sounds:"+s2);
             }
         }

         class cat extends Animals
         {
             @Override
             void sounds()
             {
              int legs=4;
                 System.out.println("no of legs :"+legs);
             }
         }

 }


public class Prdemo1
{
    public static void main(String[] args) {

    }
}
