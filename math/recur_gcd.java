/*
 * First, we will divide 18 by 12, and get the remainder of 6. So the GCD of 12 and 18 is equal to the GCD of 6 and 12.
Now We divide 12 by 6, which gives a remainder of 0. So the GCD of 6 and 12 is 6.
 */
public class recur_gcd {
    public static int gcd(int a,int b)
    {
        if(a>b) return gcd(b,a);
        if(a==0) return b;
        if(a==1) return 1;
        return gcd(a,b%a); 
    }
    public static void main(String[] args) {
        int a=12,b=8;
        System.out.println(gcd(a, b));
    }
}
