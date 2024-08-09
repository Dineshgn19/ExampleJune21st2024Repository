package Method;
class Primsum
{
    void primecount()
    {
        int num=100;
        int p;
        int sum=0;
        for(int i=200; i>=num; i--){
            p=0;
            for (int j=2;j<i/2; j++){
                if(i%j==0){
                    p++;
                    break;
                }
            }
            if(p==0){
                sum=sum+i;

            }
    }
        System.out.println("Prime no sum:"+sum);
}
}
public class Assign10
{
    public static void main(String[] args) {
        Primsum o1=new Primsum();
        o1.primecount();
    }
}
