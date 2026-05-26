class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            int num=word.charAt(i);
            if(map.containsKey(num-32) && map.getOrDefault(num-32,0)>0){
                map.put(num-32,(map.getOrDefault(num-32,0)-1));
                if(!set.contains(num) && !set.contains(num-32)){
                    result++;
                    set.add(num);
                }
                
            }
            else if(map.containsKey(num+32) && map.getOrDefault(num+32,0)>0){
                map.put(num+32,(map.getOrDefault(num+32,0)-1));
                if(!set.contains(num) && !set.contains(num+32)){
                    result++;
                    set.add(num);
                }
            }
            else{
                map.put(num,(map.getOrDefault(num,0)+1));
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna