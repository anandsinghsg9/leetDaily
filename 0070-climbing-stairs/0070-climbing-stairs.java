class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int [n-1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
    public int solve(int n){
        if(n<=2){
            return n;
        }
        if(dp[n-2]!=-1){
            return dp[n-2];
        }
        else {
            return dp[n-2]=solve(n-1)+solve(n-2);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna