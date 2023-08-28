/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. */
public class valid_palindrome_leetcode {
    public static boolean isPalindrome(String s) {
        if(s.length()==1)
        {
            return true;
        }
        String s_new=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if(s_new.equals(""))
        {
            return true;
        }
        String s_rev="";
        for(int i=s_new.length()-1;i>=0;i--)
        {
            s_rev=s_rev+s_new.charAt(i);
        }
        if(s_new.equals(s_rev))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="my, nme is vika4";
        boolean a=isPalindrome(s);
        System.out.println(a);
    }
}
