class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int output=-1;
        int left=0;
        int right=0;

        while(output<0 && left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                output=nums2[right];
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna