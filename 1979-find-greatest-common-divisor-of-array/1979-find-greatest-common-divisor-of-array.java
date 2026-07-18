class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(b<nums[i]){
                b=nums[i];
            }
            if(a>nums[i]){
                a=nums[i];
            }
        }
        while(a>0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna