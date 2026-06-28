class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        int i=0;
        int num=0;
        if(s.charAt(0)== '-') {
            sign =-1;
            i++;
        }
        else if(s.charAt(0)== '+') i++;

        while(i<s.length()){
            char ch =s.charAt(i);
            if(ch<'0'||ch>'9') break;
            int digit = ch-'0';

            if(num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10 && digit >7))
            return sign ==1
                    ?Integer.MAX_VALUE
                    :Integer.MIN_VALUE;
                num=num*10+digit;
                i++;

        }
        return num*sign;
    }
}