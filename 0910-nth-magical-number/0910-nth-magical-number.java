class Solution {
    public int nthMagicalNumber(int n, int A, int B) {
        // We will be using binary search where
        // beg = min(A, B)
        // end = n * min(A, B)
        // Check condition: mid/A + mid/B - mid/LCM(A, B)
        // If the condition < n, then beg = mid + 1
        // Else, end = mid; the answer will be beg
        // LCM = (A * B) / GCD(A, B)

        long mod = (long)(Math.pow(10,9)+7);
        long a = A;
        long b = B;
        
        // Calculate gcd using the Euclidean algorithm
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        // GCD is in 'a', now calculate LCM
        long gcd = a;
        long lcm = (A * (B / gcd)); // to prevent overflow

        long beg = Math.min(A, B);
        long end = (long) n * beg;

        while (beg < end) {
            long mid = beg + (end - beg) / 2;
            long x = (mid / A) + (mid / B) - (mid / lcm);

            if (x < n) {
                beg = mid + 1;
            } else {
                end = mid;
            }
        }
        return (int)(beg % mod);
    }
}
