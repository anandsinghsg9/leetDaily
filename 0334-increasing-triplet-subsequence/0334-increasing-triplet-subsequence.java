class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small1=Integer.MAX_VALUE;
        int small2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small1>=nums[i]){
                small1=nums[i];
            }
            else if(small2>=nums[i]){
                small2=nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna