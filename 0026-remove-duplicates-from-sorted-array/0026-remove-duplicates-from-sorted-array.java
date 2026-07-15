class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }
            else{
                nums[++left]=nums[right++];
            }
        }
        return left+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna