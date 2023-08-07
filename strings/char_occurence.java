//find the occurence of each character in a string and sort the characters in asc order

import java.util.*;
public class char_occurence {
    public static void main(String[] args) {
        String s= "cbbabfhgbaa";
        System.out.println("String is: "+s);

        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        
        System.out.print("Sorted string is: ");
        System.out.println(arr);
        
        HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
        int temp_count=1;
        //abbbc
        hm.put(arr[0], 1); //a=1
        for(int i=1;i<s.length();i++) //1 2 3 4 
        {
            if(arr[i]==arr[i-1])
            {
                temp_count++;
                hm.put(arr[i-1], temp_count);
            }
            else
            {
                temp_count=1;
                hm.put(arr[i], temp_count);   
            }
        }
        System.out.println(hm);
    }
}
