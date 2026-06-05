class Solution {
    public String mergeAlternately(String word1, String word2) {
        int up=0;
        int down=0;
        String output="";
        while(up<word1.length() && down<word2.length()){
            output+=word1.charAt(up);
            output+=word2.charAt(down);
            up++;
            down++;
        }
        while(up<word1.length()){
            output+=word1.charAt(up);
            up++;
        }
        while(down<word2.length()){
            output+=word2.charAt(down);
            down++;
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna