//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
import java.util.ArrayList;
import java.util.Collections;

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            arr.add(nums[i]);
        }
        arr.add(target);
        Collections.sort(arr);
        int idx=arr.indexOf(target);
        if(idx==-1)
        {
            return nums.length;
        }
        return idx;
    }
    public static void main(String[] args) {
        search_insert_position sip=new search_insert_position();
        int a[]={3,2,2,3};
        int res=sip.searchInsert(a, 4);
        System.out.println(res);
    }
}
