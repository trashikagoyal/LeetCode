import java.util.Arrays;

class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = (res + count(grid, dp, i, j)) % MOD;
            }
        }
        return res;
    }

    private int count(int[][] arr, int[][] dp, int i, int j) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int m = arr.length;
        int n = arr[0].length;
        int totalPaths = 1; // A single cell is a valid path itself.
        
        if (i > 0 && arr[i - 1][j] > arr[i][j]) {
            totalPaths = (totalPaths + count(arr, dp, i - 1, j)) % MOD;
        }
        if (j > 0 && arr[i][j - 1] > arr[i][j]) {
            totalPaths = (totalPaths + count(arr, dp, i, j - 1)) % MOD;
        }
        if (i < m - 1 && arr[i + 1][j] > arr[i][j]) {
            totalPaths = (totalPaths + count(arr, dp, i + 1, j)) % MOD;
        }
        if (j < n - 1 && arr[i][j + 1] > arr[i][j]) {
            totalPaths = (totalPaths + count(arr, dp, i, j + 1)) % MOD;
        }
        
        dp[i][j] = totalPaths;
        return totalPaths;
    }
}
