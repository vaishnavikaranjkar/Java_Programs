import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class nth_smallest_element {
    public static void main(String[] args) {

        int array[]={1,2,45,1,21,5,45,4,12,4};


        //finding nth smallest and largest
        int n=3; //nth smallest
    

        //sort the array
        int temp=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }



        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
        

        System.out.println(n+"th smallest element is:");

    }
}
