class Solution {
    public String processStr(String s) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(a.length()>0){
                    a.deleteCharAt(a.length()-1);
                }
            }
            else if(ch=='#'){
                a.append(a.toString());
            }
            else if(ch=='%'){
                a.reverse();
            }
            else{
                a.append(ch);
            }

        }
        return a.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna