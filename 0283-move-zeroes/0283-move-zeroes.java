class Solution {
    public void moveZeroes(int[] nums) {
        int left =0;
        int right=1;
        while(left<nums.length-1 && right<nums.length){
            if(nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
            else if(nums[left]==0 && nums[right]==0){
                left--;
            }
            left++;
            right++;
        }

    }
}