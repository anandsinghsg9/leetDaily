class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int j=1;j<=nums.length;j++){
            if(!set.contains(k*j)){
                result=k*j;
                break;
            }
        }
        if(result==0){
            result=k*(nums.length+1);
            }
        return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna