class Solution {
    public int minDistance(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int [][]dp=new int[a+1][b+1];
        for(int i=0;i<a+1;i++){
            for(int j=0;j<b+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]=i;
                }
                else{
                    if(word1.charAt(i-1)==word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    }
                }
            }
        }
        return dp[a][b];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna