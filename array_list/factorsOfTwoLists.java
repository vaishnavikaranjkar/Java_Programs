/*
 * There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int maxOfA = Collections.max(a);
        int minOfB = Collections.min(b)+1;
        
        List<Integer> ls=new ArrayList<Integer>();
        int count=0;
        
        for(int i=maxOfA;i<minOfB;i++)
        {
            boolean flag=true;
            for(int j=0;j<a.size();j++)
            {
                if(i%a.get(j)!=0)
                {
                    flag=false;
                    break;
                }else flag=true;
            }
            if(flag==true)
            {
                ls.add(i);
            }
        }
        
        for(int i : ls)
        {
            boolean flag =true;
            for(int j=0;j<b.size();j++)
            {
                if(b.get(j)%i!=0)
                {
                    flag=false;
                    break;
                }else flag=true;
            }
            if(flag==true)
            {
                count++;
            }
        }
        
        return count;
    }

}

public class factorsOfTwoLists {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
