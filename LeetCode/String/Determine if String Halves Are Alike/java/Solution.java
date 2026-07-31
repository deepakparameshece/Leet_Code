class Solution {
    public boolean halvesAreAlike(String s) {
        int len= s.length();
        String a= s.substring(0,len/2);
        String b= s.substring(len/2,len);
        int Acnt=vowel(a);
        int Bcnt=vowel(b);
        return Acnt==Bcnt;
    }
    public int vowel(String str){
        int count =0;
        for(int j=0;j<str.length();j++){
          char i= str.charAt(j);
            if(i=='a'|| i=='A'|| i=='i'|| i=='I'|| i=='o'||i=='O' || i=='u' || i== 'U' || i=='e' || i=='E'){
                count++;
            }
        }
        return count;
    }
}