1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3    int left=0;
4      int right =arr.length-1;
5      while(left<right){
6        int m=left+(right-left)/2;
7        if(arr[m]<arr[m+1]) left=m+1;
8        else right=m;
9      }
10      return left;
11    }
12}