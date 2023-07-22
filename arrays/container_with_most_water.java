/*
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.    
 */
public class container_with_most_water {
    public static void main(String[] args) {

        int arr[]={1,8,6,2,5,4,8,3,7};
        int len=arr.length;

        int l_ptr,r_ptr,height,width;
        int temp_area, max_area=0;
        int i=0,j=len-1;

        while(i<len && j>0)
        {
            l_ptr=arr[i];
            r_ptr=arr[j];

            if(l_ptr>r_ptr)
            {
                height=r_ptr;
            }
            else
            {
                height=l_ptr;
            }
            width=j-i;

            temp_area=height*width;
            if(temp_area>max_area)
            {
                max_area=temp_area;
            }
            if(l_ptr>r_ptr)
            {
                j--;
            }
            else
            {
                i++;
            }
        }      
        System.out.println(max_area);
    }
}
