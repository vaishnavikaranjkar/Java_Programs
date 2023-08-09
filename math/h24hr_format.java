import java.io.*;
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here 12:01:00PM 
        int hh = Integer.parseInt(String.valueOf(s.charAt(0)))*10+Integer.parseInt(String.valueOf(s.charAt(1)));
        int mm = Integer.parseInt(String.valueOf(s.charAt(3)))*10+Integer.parseInt(String.valueOf(s.charAt(4)));
        
        String s_new="";
        
        if(s.charAt(8)=='A' || s.charAt(8)=='a')
        {
            if(hh==12 && mm>=1)
            {
                s_new="00"+s.substring(2,8);
                return s_new;
            }  
            else if(hh==12 && mm==0)
            {
                s_new="00:00:00";
                return s_new;
            }
        }
        else if(s.charAt(8)=='P' || s.charAt(8)=='p')
        {
            if(hh==12)
            {
                return s.substring(0,8);
            }
            if(hh>=1)
            {
                System.out.println(hh);
                s_new=Integer.toString(hh+12)+s.substring(2,8);
                return s_new;
            }
        }
        
        return s.substring(0,8);
    }

}

public class h24hr_format {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
