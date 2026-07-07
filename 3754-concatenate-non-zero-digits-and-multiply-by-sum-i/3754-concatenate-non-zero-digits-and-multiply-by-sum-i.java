class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        double multiply=0;
        int count=1;
        while(n>0){
            int step=n%10;
            if(step!=0){
                sum+=step;
                multiply=(step*(Math.pow(10,count)))+multiply;
                count++;
            }
            n=n/10;
        }
        multiply=(long)(multiply/10);
        return (long)multiply*sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna