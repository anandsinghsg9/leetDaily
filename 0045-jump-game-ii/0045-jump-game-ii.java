class Solution {
    public int jump(int[] nums) {
        int currentEnd=0;
        int far=0;
        int jump=0;
        int point=0;
        while(currentEnd<nums.length-1){
            far=Math.max(far,point+nums[point]);
            if(point==currentEnd){
                currentEnd=far;
                jump++;
            }
            point++;
        }
        return jump;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna