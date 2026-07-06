class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        int covered = 0;

        for (int i = 0; i < intervals.length; i++) {

            for (int j = 0; j < intervals.length; j++) {

                if (i != j &&
                    intervals[j][0] <= intervals[i][0] &&
                    intervals[j][1] >= intervals[i][1]) {

                    covered++;
                    break;
                }
            }
        }

        return intervals.length - covered;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna