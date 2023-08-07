import java.util.*;
public class string_precisionOfDecimals {


        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
    
        public static void plusMinus(List<Integer> arr) {
        // Write your code here
            int pcount=0, zcount=0,ncount=0;
            
            for(int i=0;i<arr.size();i++)
            {
                if(arr.get(i)==0)
                {
                    zcount++;
                }
                else if(arr.get(i)<0)
                {
                    ncount++;
                }
                else
                {
                    pcount++;
                }
            }
            String a=String.format("%.6f",(float)pcount/(float)arr.size());
            String b=String.format("%.6f",(float)ncount/(float)arr.size());
            String c=String.format("%.6f",(float)zcount/(float)arr.size());
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            
            
        }
    
    
}
