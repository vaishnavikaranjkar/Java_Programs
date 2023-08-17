/*
 * Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
 * array element may not be contiguous
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        Collections.sort(a);
        int len=0, max_len=0;
        for(int i=0;i<a.size();i++)
        {
            for(int j=i;j<a.size();j++)
            {
                if((int)Math.abs(a.get(i)-a.get(j))<=1)
                {
                    len++;
                }
            }
            if(max_len<len)
            {
                max_len=len;
            }
            len=0;
        }
        return max_len;
    }

}

public class max_arrlen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
