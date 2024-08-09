package Method;
class Prime9
{
    void primenumber()
    {
        int num=100;
        int f;
        int count=0;
        for(int i=1;i<=num; i++){
            f=0;
            for(int j=2; j<i/2; j++){
                if(i%j==0) {
                    f++;
                    break;
                }
            }
            if (f==0){
                count++;
            }
        }
        System.out.println("Prime Number:"+count);
    }
}
public class PrimeCount9
{
    public static void main(String[] args)
    {
        Prime9 o1=new Prime9();
        o1.primenumber();

    }
}
