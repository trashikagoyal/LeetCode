import java.util.Arrays;

class Solution {
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return minCut(s, 0, s.length(), dp);
    }

    private int minCut(String s, int ind, int n, int dp[]) {
        if (ind == n) {
            return -1; // No more cuts needed if we have reached the end
        }
        if (dp[ind] != -1) {
            return dp[ind]; // Return cached result
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = ind; i < n; i++) {
            if (isPalindrome(s, ind, i)) {
                int cut = 1 + minCut(s, i + 1, n, dp);
                min = Math.min(min, cut);
            }
        }
        return dp[ind]=min;
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
