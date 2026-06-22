class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        while(map.containsKey('b') && map.get('b')>0){
            map.put('b',map.get('b')-1);
            if(map.containsKey('a') && map.get('a')>0){
                map.put('a',map.get('a')-1);
                if(map.containsKey('l') && map.get('l')>1){
                    map.put('l',map.get('l')-2);
                    if(map.containsKey('o') && map.get('o')>1){
                        map.put('o',map.get('o')-2);
                        if(map.containsKey('n') && map.get('n')>0){
                            map.put('n',map.get('n')-1);
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna