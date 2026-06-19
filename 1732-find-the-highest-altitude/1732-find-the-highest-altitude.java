class Solution {
    public int largestAltitude(int[] gain) {
        int len=gain.length;
        int []prefix=new int[len+1];
        prefix[0]=0;
        int max=prefix[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
            max=Math.max(max,prefix[i]);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna