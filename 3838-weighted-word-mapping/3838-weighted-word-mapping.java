class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String eval=words[i];
            int len=eval.length();
            int point=0;
            int sum=0;
            while(point<len){
                int a=eval.charAt(point);
                sum=sum + weights[a-'a'];
                point++;
            }
            sum=sum%26;
            char c=(char)('z'-sum);
            s.append(c);
        }
        return s.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna