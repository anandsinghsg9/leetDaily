class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3){
            return n;
        }
        int k=(int)(Math.log(n)/Math.log(2))+1;
        int result=(int)Math.pow(2,k);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna