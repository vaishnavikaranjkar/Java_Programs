package dp;
public class climbingStairs {
    public static int climbStairs(int n) {
        int pos1=1, pos2=1,temp;
        for(int i=0;i<n-1;i++)
        {
            temp=pos1;
            pos1=pos1+pos2;
            pos2=temp;
        }   
        return pos1;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
