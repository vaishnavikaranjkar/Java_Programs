//The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of its digits repeatedly. If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.
import java.util.HashSet;

public class happy_number {
    static boolean happy(int n)
    {
        HashSet<Integer> calculated_num= new HashSet<>();
        while(n!=1)
        {
            int temp=n;
            int sum=0;
            while(temp!=0)
            {
                sum=sum+((temp%10)*(temp%10));
                temp=temp/10;
            }
            if(calculated_num.contains(sum))
            {
                return false;
            }
            calculated_num.add(sum);
            n=sum;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(happy(19));
        
    }
}
