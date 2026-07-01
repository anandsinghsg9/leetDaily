class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int result=Integer.MIN_VALUE;
        while(left<right){
            int step=Math.min(height[left],height[right])*(right-left);
            result=Math.max(result,step);
            if(height[left]<height[right]){
                left++;
            }
            else if(height[right]<height[left]){
                right--;
            }
            else{
                if(height[right-1]<height[left+1]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna