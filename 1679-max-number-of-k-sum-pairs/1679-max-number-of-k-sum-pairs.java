class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                result++;
                left++;
                right--;
            }
            else if(sum>k){
                right--;
            }
            else {
                left++;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna