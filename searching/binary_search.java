//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//binary searching

import java.util.*;
class binary_search {
    public static int search(int[] nums, int target) {
        int size=nums.length;
        Arrays.sort(nums);
        int min=0, max=size-1, temp;
        while(min<=max)
        {
            temp=(min+max)/2;
            if(nums[temp]==target)
            {
                return temp;
            }
            else if(nums[temp]<target)
            {
                min=temp+1;
            }
            else if(nums[temp]>target)
            {
                max=temp-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int arr[]={12,232,323,112,111,23,12,1};
        int target=111;
        int res=search(arr, target);
        System.out.println(res);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}