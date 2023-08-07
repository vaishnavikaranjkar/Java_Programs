public class travelling_codt {
    static int cost(int r1, int r2, int n, int min)
    {
        int res=0;
        int hr=(int)Math.ceil((float)(min/60.0));
        if(n>hr)
        {
            res=res+hr*r1;
            return res;
        }
        res=res+n*r1;
        res=res+(hr-n)*r2;
        return res;
    }
    public static void main(String[] args) {
        int total_cost=cost(20,40,1,90);
        System.out.println(total_cost);
    }
}
