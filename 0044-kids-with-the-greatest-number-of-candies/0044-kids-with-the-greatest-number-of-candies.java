class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int point=1;
            for(int j=0;j<candies.length;j++){
                if(i!=j && candies[i]+extraCandies<candies[j]){
                    point=0;
                }
            }
            if(point==1){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna