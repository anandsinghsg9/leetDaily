class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int number=0;
        int i=0;
        Arrays.sort(costs);
        while(coins>0 && i<costs.length){
            if(costs[i]<=coins){
                number++;
                coins-=costs[i];
            }
            i++;
        }
        return number;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna