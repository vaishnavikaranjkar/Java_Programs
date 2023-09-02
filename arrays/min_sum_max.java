/*
 * n=2, size=n*2
 * arr= 1 4 2 3 
 * groups=n
 * 
 * CASE1:
 * grp1=(1,4)
 * grp2=(2,3)
 * temp1=min(grp1)+min(grp2)=3
 * 
 * CASE2:
 * grp1=(1,2)
 * grp2=(4,3)
 * temp2=min(grp1)+min(grp2)=4
 * 
 * output-to find max value of summation of mins
 * max=temp2=5
 * 
 */

import java.util.*;

public class min_sum_max{
    public static int min_sum_func(int n, int array[])
    {
        int count=0;
        int temp_sum=0,sum;
        // 1 4 2 3 5 4
        // 1 2, 4 3,5 4=8
        // 1 4, 2 3, 5 4 =7
        // 1 2 3 4 4 5 

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n*2];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // int res=min_sum_func(n,arr);
        int arr[]={1,4,2,3,5,4};
        int res=min_sum_func(6,arr);
        System.out.println(res);
        sc.close();
    }
}