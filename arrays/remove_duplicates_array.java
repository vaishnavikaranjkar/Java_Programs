public class remove_duplicates_array {
    public int removeDuplicates(int[] nums) {
        int counter=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[counter]=nums[i];
                counter++;
            }
        }
        return counter;
        
    }
    public static void main(String[] args) {
        remove_duplicates_array rd=new remove_duplicates_array();
        int arr[]={0,0,1,2,2,2};
        int res=rd.removeDuplicates(arr);
        System.out.println(res);
    }
}
