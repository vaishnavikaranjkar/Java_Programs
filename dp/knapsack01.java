/*to find the solution for 0/1 knapsack =>
DP approach => this is a recursive code woth storage. this is carried out in two steps:
- recursion function is written
    - base condition 
    - choice diagram
*/
public class knapsack01 {
    public static int kp(int[] wt, int[] val, int W, int n)
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        else if(wt[n-1]<=W)
        {
            return Math.max(val[n-1]+kp(wt,val,W-wt[n-1], n-1),kp(wt, val, W, n-1));
        }
        else if(wt[n-1]>W)
        {
            return kp(wt,val,W,n-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int W=7;
        System.out.println(kp(wt, val, W, wt.length));
        
    }
}
