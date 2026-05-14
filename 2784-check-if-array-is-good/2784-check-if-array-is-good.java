class Solution {
    public boolean isGood(int[] nums) {
        int a=nums.length;
        HashMap <Integer,Integer> map=new HashMap<>();
        int b=1;
        for(int i=0;i<a;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            b=Math.max(nums[i],b);
        }
        if(b>a-1){
            return false;
        }
        for(int i=1;i<a;i++){
            if(map.get(i)==null){
                return false;
            }
            map.put(i,map.getOrDefault(i,0)-1);
        }
        if(map.get(b)<1){
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna