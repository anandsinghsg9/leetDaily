class Solution {
    public String reverseWords(String s) {
        int left=0;
        HashMap <Integer,String> map=new HashMap<>();
        int point=0;
        int value=1;
        String word="";
        char check=' ';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=check){
                word+=s.charAt(i);
                point=0;
            }
            else{
                point=1;
            }
            if(word.length()>0 && point==1){
                map.put(value,word);
                word="";
                value++;
            }
        }
        if(word!=""){
                map.put(value,word);
                point=0;
            }
        word="";
        while(point<value){
            word+=map.get(value-point)+" ";
            point++;
        }
        word=word.substring(0,word.length()-1);
        return word;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna