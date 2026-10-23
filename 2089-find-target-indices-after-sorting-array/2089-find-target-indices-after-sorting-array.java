class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int temp=0;
        int point=0;
        List <Integer> output= new ArrayList<>();
        while(point<nums.length){
            if(nums[point]==target){
                output.add(point);
                temp=1;
            }
            else if(temp==1){
                break;
            }
            point++;
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna