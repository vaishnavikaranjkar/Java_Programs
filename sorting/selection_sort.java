//selection sort is where the minimum value of the whole array is placed at the left sorted array and swapped with the element in its position

public class selection_sort
{
    public void selec_sort(int A[], int size)
    {
        for(int i=0; i<size-1;i++)
        {
            int position=i;
            for(int j=i+1;j<size;j++)
            {
                if(A[j]<A[position])
                {
                    position=j;
                }
            }
            int temp=A[i];
            A[i]=A[position];
            A[position]=temp;
        }
    }
    public void display(int A[], int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(A[i]+", ");
        }
    }
    public static void main(String[] args) {
        selection_sort sr = new selection_sort();

        int A[] = {12,23,01,15,48,36,45};
        int size=A.length;
        sr.selec_sort(A, size);
        sr.display(A, size);
    }
}