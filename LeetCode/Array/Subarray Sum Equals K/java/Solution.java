class Solution {
    public int subarraySum(int[] n, int k) {
              int y=0;
      for(int i=0;i<n.length;i++){
        int c=0;
        for(int j=i;j<n.length;j++){
            c+=n[j];
            if(c==k) y++;
        }
      }  
      return y;

    }
}