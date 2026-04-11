class Solution {
    public int findLHS(int[] nums) {
        int left=0;
        int out=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            while(nums[i]-nums[left]>1){
                left++;
            }
            if((nums[i]-nums[left])==1){
                out=Math.max(out,i-left+1);
            }
        }
        return out;
    }
}