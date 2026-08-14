class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<2;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int left=0;
        int result=2;
        for(int i=2;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))>2){
                while(map.get(s.charAt(i))>2){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
            }
            int step=i-left+1;
            result=Math.max(result,step);
        }
        return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna