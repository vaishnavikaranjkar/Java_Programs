public class remove_element {
    public int removeElement(int[] nums, int val) {
        int j=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        remove_element re=new remove_element();
        int a[]={3,2,2,3};
        int res=re.removeElement(a, 3);
        System.out.println(res);
    }
}
