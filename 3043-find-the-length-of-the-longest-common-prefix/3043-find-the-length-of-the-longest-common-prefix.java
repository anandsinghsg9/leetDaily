class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            while(num>0){
                set.add(num);
                num=num/10;
            }
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];
            int step=0;
            while(num>0){
                if(set.contains(num)){
                    step++;
                }
                num=num/10;
            }
            count=Math.max(step,count);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna