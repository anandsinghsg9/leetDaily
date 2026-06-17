class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int output=0;
        int up=0;
        int down=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(down<s.length && up<g.length){
            if(g[up]<=s[down]){
                output++;
                up++;
                down++;
            }
            else{
                down++;
            }
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna