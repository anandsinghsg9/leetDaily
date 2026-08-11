class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new  HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
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
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna