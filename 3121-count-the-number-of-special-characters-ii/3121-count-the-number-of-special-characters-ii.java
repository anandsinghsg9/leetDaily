class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap <Integer, Integer> map=new HashMap<>();
        HashSet <Integer> set=new HashSet<>(); 
        HashSet <Integer> vanish=new HashSet<>();
        int result=0;
        for(int i=0; i<word.length();i++){
            int num=word.charAt(i);
            if(num<91 && map.containsKey(num+32) && map.getOrDefault(num+32, 0)>0 && !vanish.contains(num+32)){
                if(!set.contains(num+32)){
                    result++;
                    set.add(num+32);
                }
                map.put(num+32, map.getOrDefault(num+32, 0)-1);
            }else if(num<91 && !map.containsKey(num+32)){
                vanish.add(num+32);
            }
            else if(num>96 && set.contains(num)){
                result--;
                set.remove(num);
                vanish.add(num);
            }
            else if(num>96 && !set.contains(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna