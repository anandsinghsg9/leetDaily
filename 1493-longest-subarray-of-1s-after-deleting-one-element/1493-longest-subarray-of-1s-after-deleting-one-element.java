class Solution {
    public int longestSubarray(int[] nums) {
        int temp=0;
        int left=0;
        int right=0;
        int result=right-left;
        while(right<nums.length){
            if(nums[right]==1){
                right++;
            }
            else{
                if(temp<1){
                    temp++;
                    right++;
                }
                else{
                    while(temp>0){
                        if(nums[left]==0){
                            temp--;
                        }
                        left++;
                    }
                    right++;
                    temp++;
                }
            }
            int step=right-left;
            result=Math.max(step,result);
        }
        if(nums.length==result){
            return result-1;
        }
        return result-temp;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna