//Given an integer array nums, find the subarray with the largest sum, and return its sum.

//solution - kadane's algorithm

public class max_sub_array {
    public int maxSum(int nums[])
    {
        int sum=0, max=Integer.MIN_VALUE, size=nums.length;
        for(int i=0;i<size;i++)
        {
            sum=sum+nums[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        max_sub_array ms=new max_sub_array();
        int A[]={12,-2,-23,45,6};
        int res=ms.maxSum(A);
        System.out.println(res);
    }
}
