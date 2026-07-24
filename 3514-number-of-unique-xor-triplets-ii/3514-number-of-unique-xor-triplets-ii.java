class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> pair=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int ans1=(nums[i]^nums[j]);
                pair.add(ans1);
            }
        }
        ArrayList <Integer>pairs=new ArrayList<>(pair);
        for(int i=0;i<pairs.size();i++){
            for(int j=0;j<nums.length;j++){
                int ans2=nums[j]^pairs.get(i);
                set.add(ans2);
            }
        }
        return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna