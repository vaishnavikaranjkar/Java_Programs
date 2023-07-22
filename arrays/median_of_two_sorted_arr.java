import java.util.Arrays;

public class median_of_two_sorted_arr {
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3,4};
        int merged[]=new int[nums1.length+nums2.length];
        int idx=0, i=0, j=0;

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                merged[idx]=nums1[i];
                idx++;
                i++;
            }
            else
            {
                merged[idx]=nums2[j];
                idx++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            merged[idx++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            merged[idx++]=nums2[j++];
        }
        System.out.println(Arrays.toString(merged));

        int start=0, end=merged.length-1;
        int mid;
        double res;
        if(merged.length%2==0)
        {
            mid=(end-start)/2;
            double temp1=(double)merged[mid];
            double temp2=(double)merged[mid+1];
            double temp3=temp1+temp2;
            res=temp3/2.0;
        }
        else
        {
            mid=(end-start)/2;
            res=(double)merged[mid];
        }
        System.out.println(res);
    }
}

