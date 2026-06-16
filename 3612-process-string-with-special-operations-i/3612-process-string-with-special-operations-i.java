class Solution {
    public String processStr(String s) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                a=(a.length()==0)? a:a.deleteCharAt(a.length()-1);
            }
            else if(s.charAt(i)=='#'){
                a.append(a.toString());
            }
            else if(s.charAt(i)=='%'){
                a.reverse();
            }
            else{
                a.append(s.charAt(i));
            }

        }
        return a.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna