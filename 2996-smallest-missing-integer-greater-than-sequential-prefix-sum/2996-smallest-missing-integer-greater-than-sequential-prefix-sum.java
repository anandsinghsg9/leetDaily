class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int point=1;
        int done=0;
        while(done!=1 && point<nums.length){
            if(nums[point]==nums[point-1]+1){
                sum+=nums[point];
            }
            else{
                done=1;
            }
            point++;
        }
        Arrays.sort(nums);
        point=nums.length-1;
        done=0;
        while(done!=1){
            if(sum<nums[point]){
                point--;
            }
            else if(sum==nums[point]){
                point++;
                if(point==nums.length){
                    done=1;
                }
                else if(sum==nums[point]){
                    sum--;
                }
                sum++;
            }
            else{
                done=1;
            }
        }
        
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna