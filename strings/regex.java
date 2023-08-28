public class regex {
    public static boolean isPalindrome(String s) {
        String s_new=s.replaceAll("[^A-Za-z]","").toLowerCase();
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
        String s="Level11";
        //remove all spaces, digits and characters
        //^\w^\s^\d
        
        boolean a=isPalindrome(s);
        System.out.println(a);
        
    }
}
