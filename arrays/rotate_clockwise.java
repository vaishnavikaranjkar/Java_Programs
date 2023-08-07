//given an array of size n, a positive int k.
//rotate the array clockwise by k
public class rotate_clockwise {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        int arr[]={1,2,3,4,5};
        if(k>n)
        {
            k=k-n;
        }
        int arr_new[] = new int[n];
        for(int i=0;i<k;i++)
        {
            arr_new[i]=arr[k+1+i];
        }
        int index=0;
        for(int i=k;i<n;i++)
        {
            arr_new[i]=arr[index++];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr_new[i]+" ");
        }
    }

}
