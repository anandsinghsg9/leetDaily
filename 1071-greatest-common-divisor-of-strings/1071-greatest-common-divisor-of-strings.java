class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        int answer=0;
        for(int i=Math.max(len1,len2);i>0;i--){
            if(len1%i==0 && len2%i==0){
                String substr=str1.substring(0,i);
                StringBuilder newstr1=new StringBuilder();
                StringBuilder newstr2=new StringBuilder();
                for(int j=0;j<len1/i;j++){
                    newstr1.append(substr);
                }
                for(int k=0;k<len2/i;k++){
                    newstr2.append(substr);
                }
                if(newstr1.toString().equals(str1) && newstr2.toString().equals(str2)){
                    answer=Math.max(answer,i);
                }
            }
        }
        return str1.substring(0,answer);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna