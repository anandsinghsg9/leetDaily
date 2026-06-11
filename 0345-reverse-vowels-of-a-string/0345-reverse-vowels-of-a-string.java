class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        int point1=0;
        int point2=0;
        char [] input=s.toCharArray();

        while(left<right){
            if(input[left]=='a' || input[left]=='e' || input[left]=='i' || input[left]=='o' || input[left]=='u' ||input[left]=='A' || input[left]=='E' || input[left]=='I' || input[left]=='O' || input[left]=='U'){
                point1=1;
            }
            if(input[right]=='a' || input[right]=='e' || input[right]=='i' || input[right]=='o' || input[right]=='u' ||input[right]=='A' || input[right]=='E' || input[right]=='I' || input[right]=='O' || input[right]=='U'){
                point2=1;
            }
            if(point1==1 && point2==1){
                char temp=input[left];
                input[left]=input[right];
                input[right]=temp;
                left++;
                right--;
                point1=0;
                point2=0;
            }
            else if(point1==1){
                right--;
            }
            else if(point2==1){
                left++;
            }
            else{
                left++;
                right--;
            }

        }
        return new String(input);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna