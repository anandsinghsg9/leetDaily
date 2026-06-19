class NumArray {
    int []prefix;
    public NumArray(int[] nums) {
        int len=nums.length;
        prefix=new int [len+1];
        prefix[0]=0;
        for(int i=1;i<len+1;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }  
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna