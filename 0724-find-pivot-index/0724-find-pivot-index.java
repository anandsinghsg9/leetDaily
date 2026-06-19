class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int[] leftSum=new int[len+1];
        int [] rightSum=new int[len+1];
        leftSum[0]=0;
        rightSum[len]=0;
        for(int i=1;i<len+1;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        for(int i=len-1;i>(-1);i--){
            rightSum[i]=rightSum[i+1]+nums[i];
        }
        for(int i=0;i<len;i++){
            if(leftSum[i]==rightSum[i+1]){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna