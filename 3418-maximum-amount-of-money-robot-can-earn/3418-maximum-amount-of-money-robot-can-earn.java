class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] -> max coins at (i,j) with k neutralizes remaining
        // Use long to prevent overflow during intermediate calculations
        long[][][] dp = new long[m][n][3];
        
        // Initialize with a very small number
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Long.MIN_VALUE / 2; 
                }
            }
        }

        // Base case: Starting point (0,0)
        dp[0][0][2] = coins[0][0]; // Power not used
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0; // Power used at (0,0)
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j == 0) continue;

                    // Find the best value coming into this cell with k powers
                    long prev = Long.MIN_VALUE / 2;
                    if (i > 0) prev = Math.max(prev, dp[i - 1][j][k]);
                    if (j > 0) prev = Math.max(prev, dp[i][j - 1][k]);

                    if (prev <= Long.MIN_VALUE / 4) continue;

                    // Choice 1: Don't use a power at this cell
                    dp[i][j][k] = Math.max(dp[i][j][k], prev + coins[i][j]);

                    // Choice 2: Use a power at this cell (only if it's a robber)
                    if (k > 0 && coins[i][j] < 0) {
                        dp[i][j][k - 1] = Math.max(dp[i][j][k - 1], prev);
                    }
                }
            }
        }

        // Answer is the best value at the bottom-right corner with any amount of powers left
        long res = Math.max(dp[m - 1][n - 1][0], Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
        return (int) res;
    }
}