//sort the array in increasing order till a specific index k. and then sort the rest of the array in decreasing order
import java.util.*;
public class incr_then_decr{
    public static List<Integer> incr(List<Integer> ls, int k)
    {
        int temp1,temp2, count=0, count2=0;
        while(count!=k)
        {
            count++;
            for(int i=0;i<k-1;i++)
            {  
                temp1=ls.get(i);
                temp2=ls.get(i+1);
                if(temp1>temp2)
                {
                    ls.set(i, temp2);
                    ls.set(i+1, temp1);
                }
            }
        }
        while(count2!=ls.size()-k)
        {
            count2++;
            for(int i=k;i<ls.size()-1;i++)
            {
                temp1=ls.get(i);
                temp2=ls.get(i+1);
                if(temp1<temp2)
                {
                    ls.set(i, temp2);
                    ls.set(i+1, temp1);
                }
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(11);
        ls.add(7);
        ls.add(5);
        ls.add(10);
        ls.add(46);
        ls.add(23);
        ls.add(16);
        ls.add(8);
        int k=3;
        ls=incr(ls, k);
        System.out.println(ls);

    }
}