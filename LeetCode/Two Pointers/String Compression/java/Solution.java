class Solution {
    public int compress(char[] chars) {
        int i=0;
        String r="";
        while(i<chars.length){
            char ck=chars[i];
            int count=0;
            while(i<chars.length&&ck==chars[i]){
                i++;
                count++;
            }
            r+=ck;
            if(count>1) r+=count;
        }
        for(int j=0;j<r.length();j++){
            chars[j]=r.charAt(j);
        }
        return r.length();
    }
}