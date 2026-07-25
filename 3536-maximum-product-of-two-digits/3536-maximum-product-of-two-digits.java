class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> nums=new ArrayList<>();
        while(n>0){
            nums.add(n%10);
            n/=10;
        }
        Collections.sort(nums);
        int product=nums.get(nums.size()-1)*nums.get(nums.size()-2);
        return product;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna