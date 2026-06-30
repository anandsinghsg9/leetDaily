class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[]=new int[gain.length+1];
        prefix[0]=0;
        int result=prefix[0];
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
            result=Math.max(result,prefix[i+1]);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna