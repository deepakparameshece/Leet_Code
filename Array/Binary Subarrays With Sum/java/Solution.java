class Solution {
    public int numSubarraysWithSum(int[] n, int goal) {
      int y=0;
      for(int i=0;i<n.length;i++){
        int c=0;
        for(int j=i;j<n.length;j++){
            c+=n[j];
            if(c==goal) y++;
        }
      }  
      return y;
    }
}