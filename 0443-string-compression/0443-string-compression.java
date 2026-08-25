class Solution {
    public int compress(char[] chars) {
        int count=0;
        char a='+';
        int step=0;
        char []output=new char[chars.length];
        int point=0;
        for(int i=0;i<chars.length;i++){
            char b=chars[i];
            if(a!=b){
                count++;
                a=chars[i];
                if(step>1){
                    String c=Integer.toString(step);
                    for(int j=0;j<c.length();j++){
                        output[point]=c.charAt(j);
                        point++;
                        count++;
                    }
                }
                step=1;
                output[point]=b;
                point++;
            }
            else if(a==b){
                step++;
            }
        }
        if(step>1){
            String c=Integer.toString(step);
            for(int k=0;k<c.length();k++){
                output[point]=c.charAt(k);
                point++;
                count++;
            }
        }
        System.arraycopy(output, 0, chars, 0, point);
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna