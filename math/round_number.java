/*
 * adding the pow(digit, no_of_digits) of all digits of a number
 * and then check if it is 1
 * if not then check again with the resultant number
 * 
 */

import java.util.HashSet;

public class round_number {
    static boolean round(int num, int digits)
    {
        HashSet<Integer> set=new HashSet<Integer>();
        while(num!=1)
        {
            int temp=num;
            int sum=0;
            while(temp!=0)
            {
                sum=sum+(int)Math.pow(temp%10, digits);
                temp=temp/10;
            }
            num=sum;
            if(set.contains(num))
            {
                return false;
            }
            set.add(num);            
        }
        return true;
    }
    public static void main(String[] args) {
        int num=153;
        int n=num; 
        int digits=0;
        while(n!=0)
        {
            digits++;
            n=n/10;
        }
        boolean res=round(num, digits);
        System.out.println(res);
    }
}
