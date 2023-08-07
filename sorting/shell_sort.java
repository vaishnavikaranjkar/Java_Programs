/*
in shell sort, gaps are used
initially gap=n/2 -->n=no of elements
an element is compared with the another elements which is after number of gaps
perform swapping. we compare this element to the left and right sides.  the element to the left of the gap should be smaller than the element to the right of the gap. 
move to the next element
*/

public class shell_sort {
    public void shellsort(int A[], int n)
    {
        int gap=n/2;
        while(gap>0)
        {
            int i=gap;
            while(i<n)
            {
                int temp=A[i];
                int j=i-gap;
                while(j>=0 && A[j]>temp)
                {
                    A[j+gap]=A[j];
                    j=j-gap;
                }
                A[j+gap]=temp;
                i=i+1;
            }
            gap=gap/2;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        shell_sort sr = new shell_sort();
        int A[]={12,5,4,6,6,996};
        sr.shellsort(A, 6);
    }
}
