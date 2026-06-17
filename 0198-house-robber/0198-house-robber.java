class Solution {
    int []dp;
    public int rob(int[] nums) {
        int dp[]=new int [nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<nums.length+1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna