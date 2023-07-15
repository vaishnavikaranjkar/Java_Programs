import java.util.*;
public class longest_common_prefix{
    public static String lcp(String s[])
    {
        Arrays.sort(s);
        for (String string : s) {
            System.out.print(string);
        }
        String s1=s[0];
        String s2=s[s.length-1];
        int idx=0;
        while(idx<s1.length() && idx<s2.length())
        {
            if(s1.charAt(idx)==s2.charAt(idx))
            {
                idx++;
            }
            else
            {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        String res[]={"flower","flow","flight"};
        System.out.println(lcp(res));
    }
}