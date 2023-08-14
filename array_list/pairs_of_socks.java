import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class unique {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int count=1, pairs=0, temp=0;
        Collections.sort(ar);
        List<Integer> count_ls=new ArrayList<>();
        // 6 5 2 3 5 2 2 1 1 5 1 3 3 3 5
        // 1 1 1 2 2 2 3 3 3 3 5 5 5 5 6
        for(int i=1;i<n;i++) //n=15
        {
            if(i==n-1) //i=14
            {
                if(ar.get(i)!=ar.get(i-1))
                { 
                    count_ls.add(count);
                    count=1;
                    count_ls.add(count);
                }
                if(ar.get(i)==ar.get(i-1))
                {
                    count++;
                    count_ls.add(count);
                }
            }
            if(ar.get(i)==ar.get(i-1))
            {
                count++;
            }
            if(ar.get(i)!=ar.get(i-1))
            {
                count_ls.add(count);//3 3 4 
                count=1;
            }
        }
        System.out.println(count_ls);
        //3 3 4 4 1 
        for(int i=0;i<count_ls.size();i++)
        {
            temp=0;
            if(count_ls.get(i)==1)
            {
                continue;
            }
            if(count_ls.get(i)%2!=0)
            {
                temp=(count_ls.get(i)-1)/2;
            }
            if(count_ls.get(i)%2==0)
            {
                temp=count_ls.get(i)/2;
            }
            pairs=pairs+temp;
        }
        return pairs;
    }

}

public class pairs_of_socks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = unique.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
