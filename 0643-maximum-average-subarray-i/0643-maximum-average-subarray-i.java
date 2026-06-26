class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=(nums[i]);
        }
        double output=sum;
        for(int i=k;i<nums.length;i++){
            double step=(sum+nums[i]-nums[i-k]);
            output=Math.max(output,step);
            sum=step;
        }
        return (output/k);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna