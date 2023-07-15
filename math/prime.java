public class prime {
    public static void main(String[] args) {
        int num=7;
        int flag=0;
        if(num==0 ||num==1)
        {
            System.out.println(num+" is not a prime number");
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(num+" is a prime number");
        }
    }
}
