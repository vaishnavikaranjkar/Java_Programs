//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//fibonacci sequence

class sum_array {
    public int[] runningSum(int[] nums) {
        int size=nums.length;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String[] args) {
        sum_array sa=new sum_array();

        int A[]={12,14,36,362,3};
        sa.runningSum(A);
    }
}