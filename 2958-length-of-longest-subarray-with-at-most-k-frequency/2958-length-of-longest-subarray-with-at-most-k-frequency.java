class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int right=k-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        int size=0;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            size++;
        }
        for(int i=k;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            right++;
            if(map.get(nums[i])>k){
                while(map.get(nums[i])>k){
                    map.put(nums[left],map.get(nums[left])-1);
                    left++;
                }
            }
            int step=right-left+1;
            size=Math.max(step,size);
        }
        return size;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna