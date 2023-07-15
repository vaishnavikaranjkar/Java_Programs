//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//sort the array first

import java.util.*;

public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        int size=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<size-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        duplicate d=new duplicate();
        int A[]={1,3,5,4,2,6};
        boolean res=d.containsDuplicate(A);
        System.out.println(res);
    }
}
