class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> output=new ArrayList<>();
        int point=1;
        int index=0;
        while(index<target.length){
            output.add("Push");
            if(target[index]!=point){
                output.add("Pop");
                point++;
            }
            else{
                index++;
                point++;
            }
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna