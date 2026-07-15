class Solution {
    public int gcdOfOddEvenSums(int n) {
        return findGCD(((n*n)+n), (n*n));
    }
    public int findGCD(int even, int odd){
        if(even%odd==0){
            return odd;
        }
        return findGCD(even,even%odd);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna