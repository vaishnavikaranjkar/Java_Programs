/*the insertion sort -two elements are compared and the smallest is kept to the left 
the elements smaller than the left elements are shifted right until the element left to them are smaller than them */

public class insertion_sort {
    public void ins_sort(int A[])
    {
        int n=A.length;
        for(int i=1;i<n;i++)
        {
            int min=A[i];
            int position = i;
            while(position>0 && A[position-1]>min)
            {
                A[position]=A[position-1];
                position=position-1;
            }
            A[position]=min;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        insertion_sort is = new insertion_sort();

        int A[] = {45,23,14,7,896,4};
        is.ins_sort(A);
    }
}
