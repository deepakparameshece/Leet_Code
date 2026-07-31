class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String newarr[] = new String[arr.length];
        for(String a:arr){
            int num= a.charAt(a.length()-1)-'1';
            newarr[num]=a.substring(0,a.length()-1);

        }
        return String.join(" ", newarr);
    }
}