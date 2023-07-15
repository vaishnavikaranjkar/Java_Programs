public class palindrome_num {
    public static void main(String[] args) {
        int n=151251;
        int num=n;
        int rem;
        int rev_num=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            rev_num=rev_num*10+rem;
        }
        if(n==rev_num)
        {
            System.out.println(n+" is a palindrome");
        }
        else
        {
            System.out.println(n+" is not a palindrome");
        }
    }   
}
