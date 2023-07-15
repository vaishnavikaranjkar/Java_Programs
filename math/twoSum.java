//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class twoSum {
    public int[] two_Sum(int[] nums, int target) {

        int i;
        int j;

        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        twoSum ts=new twoSum();
        
    }
}