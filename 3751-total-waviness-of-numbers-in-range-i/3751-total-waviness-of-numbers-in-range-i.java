class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        if(num1<99 && num2<99){
            return 0;
        }
        for(int i=num1;i<=num2;i++){
            String evalute= i + "";
            int left=0;
            int right=2;
            int point=1;
            while(right<evalute.length()){
                if(evalute.charAt(point)<evalute.charAt(left) && evalute.charAt(point)<evalute.charAt(right)){
                    count++;
                }
                else if(evalute.charAt(point)>evalute.charAt(left) && evalute.charAt(point)>evalute.charAt(right)){
                    count++;
                }
                left++;
                point++;
                right++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna