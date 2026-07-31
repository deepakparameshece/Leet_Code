class Solution {
    public int findMin(int[] arr) {
        int left=0;
      int right =arr.length-1;
      while(left<right){
        int m=left+(right-left)/2;
        if(arr[m]>arr[right]) left=m+1;
        else right--;
      }
      return arr[left];

    }
}