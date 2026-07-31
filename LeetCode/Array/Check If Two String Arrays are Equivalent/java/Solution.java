class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String new1="";

        String new2="";
       for(int i=0;i<word1.length;i++){
         new1=new1+word1[i];
       }
       for(int j=0;j<word2.length;j++){
       new2=new2+word2[j];
       } 
      if(new1.equals(new2))return true;

      return false; 
    }
}