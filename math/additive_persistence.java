/*
 1232432 -> 2 (2 iterations till the sum becomes one digit number)
 1+2+3+2+4+3+2 = 17 
 1+7=8
 */
class additive_persistence
{
    public static void main(String[] args) {
        int num=1145454545;
        int itr=0, rem,temp_sum=0;
        int n=num;
    
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            temp_sum=temp_sum+rem;
        }
        itr++;
        n=temp_sum;
        int sum=temp_sum;
        while(sum>9)
        {
            sum=0;
            while(n!=0)
            {
                rem=n%10;
                n=n/10;
                sum=sum+rem;
            }
            n=sum;
            itr++;
        }
        System.out.println(itr);
    }
}