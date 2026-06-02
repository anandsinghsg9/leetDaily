class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int output=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landFinish =landStartTime[i] + landDuration[i];

                int finish1 =Math.max(landFinish,waterStartTime[j])+ waterDuration[j];

                int waterFinish =waterStartTime[j] + waterDuration[j];

                int finish2 =Math.max(waterFinish,landStartTime[i])+ landDuration[i];

                output = Math.min(output,Math.min(finish1, finish2));
            }
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna