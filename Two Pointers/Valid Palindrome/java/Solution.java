class Solution {
    public boolean isPalindrome(String s) {
        String str ="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str += Character.toLowerCase(ch);
            }
        }
        StringBuilder rev = new StringBuilder(str);
        rev= rev.reverse();
        String s2= rev.toString();

        return str.equals(s2);
    }
}