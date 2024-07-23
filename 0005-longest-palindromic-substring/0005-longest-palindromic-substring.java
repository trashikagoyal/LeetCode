class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxlen = Integer.MIN_VALUE;
        int sp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Solve(dp, s, i, j)) {
                    if (j - i + 1 > maxlen) {
                        maxlen = j - i + 1;
                        sp = i;
                    }
                }
            }
        }
        return s.substring(sp, sp + maxlen);
    }

    public boolean Solve(boolean[][] dp, String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (dp[i][j]) {
            return dp[i][j] ;
        }
        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j]=Solve(dp,s,i+1,j-1);
        }
        return dp[i][j];
    }
}