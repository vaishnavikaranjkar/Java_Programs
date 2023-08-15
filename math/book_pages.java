/*
 * When they flip page , they see pages  and . Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is  pages long, and a student wants to turn to page , what is the minimum number of pages to turn? They can start at the beginning or the end of the book.

Given  and , find and print the minimum number of pages that must be turned in order to arrive at page .
 */
import java.io.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    //     if(p==1 || p==n )
    //     {
    //         return 0;
    //     }
    //     if(p<=n/2)
    //     {
    //         return p/2;
    //     }
    //     else
    //     {
    //         if(n%2==0)
    //         {
    //             return (int)Math.ceil(n-p)/2;
    //         }
    //         else
    //         {
    //             if(p==n-1)
    //             {
    //                 return 0;
    //             }
    //             return (int)Math.floor(n-p/2);
    //         }
    //     }
    return Math.min(p/2, n/2-p/2);
    }

}

public class book_pages {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
