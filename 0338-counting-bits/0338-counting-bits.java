class Solution {
    public int[] countBits(int n) {
        int[]result = new int[n + 1];
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){ //even
            result[i] = result[i/2];
            }
            else{
                result[i] = result[i/2] + 1;
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna