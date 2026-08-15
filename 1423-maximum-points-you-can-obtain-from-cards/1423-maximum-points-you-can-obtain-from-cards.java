class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int result=0;
        int n=cardPoints.length;
        for(int i=0;i<n;i++){
            result+=cardPoints[i];
        }
        int remove=0;
        for(int j=0;j<n-k;j++){
            remove+=cardPoints[j];
        }
        int step=result-remove;
        result=step;
        int left=0;
        int right=n-k;
        while(right<n){
            step=step+cardPoints[left]-cardPoints[right];
            result=Math.max(step,result);
            left++;
            right++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna