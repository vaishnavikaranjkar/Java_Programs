public class substring_occurences {
    static int method1(String s, String t)
    {
        int count=0;
        String temp="";
        for(int i=0;i<s.length()-t.length()+1;i++)
        {
            temp=s.substring(i, i+t.length());
            if(t.substring(0).equals(temp))
            {
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s1="abcabcgabfdabcabc";
        String s2="abc";
        int res=method1(s1,s2);
        System.out.println(res);
    }
}
