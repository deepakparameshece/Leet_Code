import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false; //edge case 

        // convert string  in character array 
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
         //sort character lexicographically
        Arrays.sort(sChars);  
        Arrays.sort(tChars);
        
        // check if both sorted arrays are identical
        return Arrays.equals(sChars, tChars);
    }
}