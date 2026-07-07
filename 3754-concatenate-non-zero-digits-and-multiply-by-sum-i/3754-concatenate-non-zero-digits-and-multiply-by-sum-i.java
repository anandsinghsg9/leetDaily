class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        double multiply=0;
        int count=1;
        while(n>0){
            if((n%10)!=0){
                sum+=n%10;
                multiply=((n%10)*(Math.pow(10,count)))+multiply;
                count++;
            }
            n=n/10;
        }
        return (long)(multiply/10)*sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna