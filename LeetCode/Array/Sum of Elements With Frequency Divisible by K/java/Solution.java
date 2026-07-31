import java.util.*;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequency of each element
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int total = 0;
        
        // Check which elements have frequency divisible by k
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count % k == 0) {
                total += num * count;
            }
        }
        
        return total;
    }
}
