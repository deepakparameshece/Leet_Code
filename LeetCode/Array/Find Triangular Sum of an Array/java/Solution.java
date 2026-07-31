import java.math.BigInteger;

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        // Array to hold binomial coefficients for row (n-1)
        BigInteger[] coeffs = new BigInteger[n];
        coeffs[0] = BigInteger.ONE;

        // Compute binomial coefficients using iterative formula:
        // C(n, r) = C(n, r-1) * (n-r)/r
        for (int r = 1; r < n; r++) {
            coeffs[r] = coeffs[r - 1]
                .multiply(BigInteger.valueOf(n - r))
                .divide(BigInteger.valueOf(r));
        }

        // Weighted sum of nums[i] with binomial coefficients
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            sum = sum.add(coeffs[i].multiply(BigInteger.valueOf(nums[i])));
        }

        // Result is sum modulo 10
        return sum.mod(BigInteger.TEN).intValue();
    }
    
}