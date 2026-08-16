class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<stones.length;i++){
            if(stones[i]%3==0){
                count0++;
            }
            else if(stones[i]%3==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count0%2==0){
            return count1>0 && count2>0;
        }
        return Math.abs(count1-count2)>2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna