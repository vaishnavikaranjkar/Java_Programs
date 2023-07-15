/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/

class pivot_index {
    public int pivotIndex(int[] nums) {
        int size=nums.length;
        int a=0,b=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
                a=a+nums[j];
            }
            for(int j=i+1;j<size;j++)
            {
                b=b+nums[j];
            }
            if(a==b)
            {
                return i;
            }
            a=0;b=0;
        }
        return -1;
    }
}