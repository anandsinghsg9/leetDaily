class Solution {
    public int smallestNumber(int n, int t) {
        int remainder=Integer.MAX_VALUE;
        int output=n;
        while(remainder!=0){
            int curr=n;
            int product=1;
            while(curr!=0){
                product*=(curr%10);
                curr/=10;
            }
            remainder=product%t;
            n++;
        }
        return n-1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna