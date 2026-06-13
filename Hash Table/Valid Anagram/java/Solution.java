class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    System.out.println(Arrays.equals(sChars,tChars));
    }}
}