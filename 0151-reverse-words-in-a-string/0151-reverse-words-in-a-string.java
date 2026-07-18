class Solution {
    public String reverseWords(String s) {
        int left=0;
        int right=0;
        String output="";
        StringBuilder words=new StringBuilder("");
        while(right<s.length()){
            if(s.charAt(right)!=' '){
                words.append(s.charAt(right));
                left=1;
            }
            else if(left==1){
                output=" "+words+output;
                words.setLength(0); 
                left=0;   
            }
            right++;
        }
        if(left==1){
            output=words+output;
        }
        else {
            output=output.substring(1);
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna