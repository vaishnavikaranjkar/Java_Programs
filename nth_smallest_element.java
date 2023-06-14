import java.util.*;

public class nth_smallest_element {
    public static int n_smallest(int array[], int n)
    {
        int len=array.length;
        int temp=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }

        ArrayList<Integer> set=new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i]))
            {
                continue;
            }
            set.add(array[i]);
        }
        System.out.println("\nThe set without duplicate values is: ");
        for (int i = 0; i < set.size(); i++) {
            System.out.print(set.get(i)+",");
        }
        int res=set.get(n-1);
        return res;
    }
    public static void main(String[] args) {

        int array[]={1,2,45,1,21,5,45,4,12,4};
        //finding nth smallest and largest
        int n=3; //nth smallest
        int result=n_smallest(array,n);

        System.out.println("\n"+n+" smallest element is: "+result);
    }
}
