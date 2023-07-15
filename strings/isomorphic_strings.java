/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
*/



class isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {

        int len1=s.length();
        int len2=t.length();
        int map1[]=new int[200];
        int map2[]=new int[200];

        if(len1!=len2)
        {
            return false;
        }
        for(int i=0;i<len1;i++)
        {
           if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;

        }
        return true;
    }
}

/* 
solution to the same problem but this is by using a hashmap

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false;
        if(s.equals(t)) return true;

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m1.getOrDefault(c1, c2)!=c2 || m2.getOrDefault(c2, c1)!=c1) return false;
            else{
                m1.put(c1,c2);
                m2.put(c2,c1);
            }

        }
        return true;
    }
}
 */