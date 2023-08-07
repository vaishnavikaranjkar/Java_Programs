
public class binary_search_recursive {
    public int bin_search(int A[], int key, int min, int max)
    {
        int temp;
        if(min>max)
        {
            return -1;
        }
        else
        {
            temp=(min+max)/2;
            if(key==A[temp])
            {
                return temp;
            }
            else if(key<A[temp])
            {
                return bin_search(A, key, min, max-1);
            }
            else if(key>A[temp])
            {
                return bin_search(A, key, min+1, max);
            }
        }     
        return -1;
    }
    public static void main(String[] args) {
        binary_search_recursive br=new binary_search_recursive();

        int A[]={12,23,56,78,90};
        int n=A.length;
        int min=0, max=n-1;
        int found=br.bin_search(A, 23, min, max);
        System.out.println(found);
    }
}
