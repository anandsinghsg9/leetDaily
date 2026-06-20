class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int []output=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
            output[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=output[i];
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna