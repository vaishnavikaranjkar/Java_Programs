
public class palindrome_no {
    static boolean palin(int num)
    {
        int temp=num;
        int digit_count=0;
        int digit;
        int rev_num=0;

        if(num<0)
        {
            return false;
        }

        while(temp!=0)
        {
            digit_count++;
            temp=temp/10;
        }
        temp=num;
        
        while(temp!=0)
        {
            digit=temp%10;
            rev_num=rev_num+digit*((int)Math.pow(10,digit_count-1));
            temp=temp/10;
            digit_count--;
        }
        System.out.println(num);
        System.out.println(rev_num);
        if(num==rev_num)
        {
            return true;
        }
        return false;       
    }
    public static void main(String[] args) {
        System.out.println(palin(192091));
    }
}
