class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    Map<Integer,Integer> m= new HashMap<>();
    for(int a:nums1){
        for(int b:nums2){
            int s=a+b;
            m.put(s,m.getOrDefault(s,0)+1);
        }
    }
    int count=0;
    for(int c:nums3){
        for(int d:nums4){
            int t=-(c+d);
             count+=m.getOrDefault(t,0);
        }
    }
        return count;
    }
}