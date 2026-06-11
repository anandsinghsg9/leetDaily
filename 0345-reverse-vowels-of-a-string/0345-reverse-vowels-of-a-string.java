class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        int point1=0;
        int point2=0;
        char [] input=s.toCharArray();

        while(left<right){
            if(check(input[left])){
                point1=1;
            }
            if(check(input[right])){
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
    private boolean check(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna