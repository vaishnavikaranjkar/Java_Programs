import java.util.*;
public class roman_int {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> m=new HashMap<>();

        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int result=0;

        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1)))
            {
                result=result-m.get(s.charAt(i));
            }
            else
            {
                result=result+m.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int res=romanToInt("XV");
        System.out.println(res);
    }
}
