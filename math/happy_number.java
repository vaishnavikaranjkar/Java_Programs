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
