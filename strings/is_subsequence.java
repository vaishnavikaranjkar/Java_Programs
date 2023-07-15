//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

class is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(m<1)
            return true;

        while(i<n)
        {
            if(tt[i]==ss[j])
            {
                j++;
            }
            i++; 
            if(j==m)
                return true;
        }
        return false;
    }
}