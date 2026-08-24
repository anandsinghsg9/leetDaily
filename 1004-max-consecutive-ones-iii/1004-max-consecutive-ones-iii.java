class Solution {
    public int longestOnes(int[] nums, int k) {
        int temp=k;
        int left=0;
        int right=k;;
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                temp--;
            }
        }
        int count=right-left;
        for(int j=k;j<nums.length;j++){
            if(nums[j]==1){
                right++;
            }
            else{
                if(temp>0){
                    temp--;
                    right++;
                }
                else{
                    while(temp==0){
                        if(nums[left]==0){
                            temp++;
                        }
                        left++;
                    }
                    temp--;
                    right++;
                }
            }
            int step=right-left;
            count=Math.max(count,step);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna