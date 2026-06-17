class Solution {
    Boolean []dp;
    public boolean canJump(int[] nums) {
        if(nums.length<2){
            return true;
        }
        dp=new Boolean[nums.length];
        return solve(nums,0);
    }
    public boolean solve(int[]nums, int i){
        if(i>=nums.length-1){
            return true;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        for(int jump=1;jump<nums[i]+1;jump++){
            if(solve(nums,i+jump)){
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna