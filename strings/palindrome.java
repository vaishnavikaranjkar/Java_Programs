public class palindrome {
    static boolean checkPalindrome(String s)
    {
        boolean res=false;
        s=s.toLowerCase();


    //METHOD! by using char array
        // char arr[] = new char[s.length()];
        // int idx=0;
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     arr[idx++]=s.charAt(i);
        // }
        // String rev_s=new String(arr);
        // if(rev_s.equals(s))
        // {
        //     res=true;
        // }



    //METHOD2 by concatenating to string
        String rev_s="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev_s=rev_s+s.charAt(i);
        }
        if(s.equals(rev_s))
        {
            res=true;
        }
        
        return res;
    }
    public static void main(String[] args) {
        String s="mom";
        boolean res = checkPalindrome(s);
        System.out.println(res);
    }
}
