import java.util.*;
public class reverse_arr {
    public static void main(String[] args) {
        int arr[]={4,2,6,7,10,6,7,8,5};
        int len=arr.length;

        System.out.println("Before reversing");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("After reversing\n");
        for(int i=0;i<len/2;i++)
        {
            Collections.swap(Arrays.asList(arr),arr[i],arr[len-i-1]);
        }
        for (int i : arr) {
            System.out.print(i);
        }

    }
}
