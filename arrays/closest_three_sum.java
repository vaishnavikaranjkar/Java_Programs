//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

//Return the sum of the three integers.

//You may assume that each input would have exactly one solution.


import java.util.*;
public class closest_three_sum
{
    public static void main(String[] args) {
        int nums[]={-1,2,1,-4};
        int target=1;
        Arrays.sort(nums);
        int closest_sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closest_sum))
                {
                    closest_sum=sum;
                }
                if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        System.out.println(closest_sum);
    }
}