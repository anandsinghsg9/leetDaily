class Solution {
    public int[] productExceptSelf(int[] nums) {
        int point=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                point++;
            }
            else{
                product*=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(point==0){
                nums[i]=product/nums[i];
            }
            else if(point==1){
                if(nums[i]==0){
                    nums[i]=product;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=0;
            }
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna