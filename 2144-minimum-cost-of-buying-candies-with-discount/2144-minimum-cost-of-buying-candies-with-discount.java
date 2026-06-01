class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int output=0;
        int count=0;
        int point=(cost.length-1);
        while(point>-1){
            if(count<2){
                output=output+cost[point];
                count++;
                point--;
            }
            else{
                point--;
                count=0;
            }
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna