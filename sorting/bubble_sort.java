
public class bubble_sort {
    public void bub_sort(int A[], int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        bubble_sort b=new bubble_sort();
        int A[]={12,5,3,56,45,2};
        b.bub_sort(A, 6);
    }
}
