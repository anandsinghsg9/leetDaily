class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
        for(int i=0;i<intervals.length;i++){
            int step=intervals.length;
            for(int j=0;j<intervals.length;j++){
                if(intervals[i][0]>=intervals[j][0] && i!=j &&intervals[i][1]<=intervals[j][1]){
                    count++;
                    break;
                }
            }
        }
        return intervals.length-count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna