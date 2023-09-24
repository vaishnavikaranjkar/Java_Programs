//Given a string s consisting of words and spaces, return the length of the last word in the string.

/*A word is a maximal 
substring
 consisting of non-space characters only.
 */
public class len_last_word {
    class Solution {
        public int lengthOfLastWord(String s) {
            int count=0;
            int last_count=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    if(count!=0)
                    {
                        last_count=count;
                    }
                    count=0;
                    continue;
                }
                count++;
            }
            if(count==0)
            {
                return last_count;
            }
            return count;
        }
    }
}
