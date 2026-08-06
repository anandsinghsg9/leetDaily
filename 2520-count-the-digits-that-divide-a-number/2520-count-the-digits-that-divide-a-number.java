class Solution {
    public int countDigits(int num) {
        int curr=num;
        int output=0;
        while(curr>0){
            int val=curr%10;
            if(num%val==0){
                output++;
            }
            curr/=10;
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna