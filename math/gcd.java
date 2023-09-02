public class gcd {
    public static void main(String[] args) {
        int a=98, b=56;
        int res;
        int min=Math.min(a, b);
        if(a%min==0 && b%min==0)
        {
            res=min;
            System.out.println(res);
        }
        else
        {
            for(int i=min/2;i>=2;i--)
            {
                if(a%i==0 && b%i==0)
                {
                    res=i;
                    System.out.println(i+" "+res);
                    break;
                }
            }
        }
    }
}
