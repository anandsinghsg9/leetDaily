class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int output=0;
        int point=0;
        int locate=timeSeries[point]-1;
        while(point<timeSeries.length){
            if(locate>=timeSeries[point]){
                output=output-(locate-timeSeries[point]+1);
            }
            output=output+duration;
            locate=timeSeries[point]+duration-1;
            point++;
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna