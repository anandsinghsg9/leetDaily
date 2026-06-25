class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;
        while(a<s.length() && b<t.length()){
            if(s.charAt(a)==t.charAt(b)){
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        return a==s.length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna