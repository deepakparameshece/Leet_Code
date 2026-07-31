class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {  
                digits[i]++;  // just add 1 if not 9
                return digits; 
            }
            digits[i] = 0; // if it's 9, make it 0 and carry goes to next
        }

        // If all were 9s, we reach here -> need a bigger array
        int[] result = new int[n + 1];
        result[0] = 1; // example: [9,9,9] -> [1,0,0,0]
        return result;
    }
}