class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] arr = new int[set1.size()];
        int i=0;
        for(int n:set1){
            arr[i++]=n;
        }
                return arr;

    }
}