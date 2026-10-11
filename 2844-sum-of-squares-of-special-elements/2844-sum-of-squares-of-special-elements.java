class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int result=nums[0]*nums[0];
        for(int i=1;i<=n;i++){
            if(n%(i+1)==0){
                result+=nums[i]*nums[i];
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna