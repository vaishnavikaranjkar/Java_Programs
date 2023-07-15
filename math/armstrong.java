//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int n1=num;
        int n2=num;
        int rem;
        int count=0;
        int power;
        int sum=0;
        while(n1>0)
        {
            n1=n1/10;
            count++;
        }
        System.out.println(count);
        while(n2>0)
        {
            rem=n2%10;
            power=(int)java.lang.Math.pow(rem,count);
            sum=sum+power;
            n2=n2/10;
        }
        System.out.println(sum);
        if(sum==num)
        {
            System.out.println(num+" is an armstrong number");
        }
        else
        {
            System.out.println(num+" is not an armstrong number");
        }
    }
}
