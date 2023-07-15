//Strong number is a special number whose sum of the factorial of digits is equal to the original number
class strongNum
{
    public static int fact(int n)
    {
        int fac=1;
        for(int i=n;i>0;i--)
        {
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        int num=145;
        int n=num;
        int sum=0;
        int rem;
        int factorial;
        while(n>0)
        {
            rem=n%10;
            factorial=fact(rem);
            sum=sum+factorial;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==num)
        {
            System.out.println("Its is a strong number");
        }
        else
        {
            System.out.println("It isnt a strong number");
        }
        
    }
}