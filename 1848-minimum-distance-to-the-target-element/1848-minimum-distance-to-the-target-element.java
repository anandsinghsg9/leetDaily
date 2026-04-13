class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int out=Integer.MAX_VALUE;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                out=Math.min(Math.abs(i-start),out);
            }
        }
        return out;
    }
}