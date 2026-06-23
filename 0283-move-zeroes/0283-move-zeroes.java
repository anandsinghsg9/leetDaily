class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]==0 && nums[right]==0){
                right++;
            }
            else if(nums[left]==0 && nums[right]!=0){
                nums[left]=nums[right];
                nums[right]=0;
                left++;
                right++;
            }
            else{
                left++;
                right++;
            }
            
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna