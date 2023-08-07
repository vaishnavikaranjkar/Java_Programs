public class completeTheWord
{
    static boolean canComplete(String s, String t)
    {
        boolean res=false;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        if(count==s.length())
        {
            res=true;
        }
        return res;
    }
    public static void main(String[] args) {
        boolean res=canComplete("tulb","beautiful");
        System.out.println(res);
    }
}