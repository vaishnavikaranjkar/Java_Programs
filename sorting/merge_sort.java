//dividing the set into smaller parts and then 
public class merge_sort {
    public void mergesort(int A[], int left, int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergesort(A, left, mid);
            mergesort(A, mid+1, right);
            merge(A, left, mid, right);
        }
    }
    public void merge(int A[], int left, int mid, int right)
    {
        int i=left;
        int j=mid+1;
        int k=left;
        int B[]=new int[right+1];
        while(i<=mid && j<=right)
        {
            if(A[i]<A[j])
            {
                B[k]=A[i];
                i=i+1;
            }
            else
            {
                B[k]=A[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<=mid){
            B[k]=A[j];
            i=i+1;
            k=k+1;   
        } 
        while(j<=right)
        {
            B[k]=A[j];
            j=j+1;
            k=k+1;
        }
        for(int x=left;x<right+1;x++)
        {
            A[x]=B[x];
        }
    }
    public void display(int A[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        merge_sort ms=new merge_sort();
        int A[]={3,5,2,6,4,2};
        ms.mergesort(A, 0, 5);
        ms.display(A, 6);
    }
}
