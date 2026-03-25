class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        int k=0;
        while(left<=right){
            if(nums[left]==val&&nums[right]!=val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
                k++;
            }
            else if(nums[left]==val&&nums[right]==val){
                right--;
            }
            else if(nums[left]!=val&&nums[right]==val){
                right--;
                left++;
                k++;
            }
            else{
                left++;
                k++;
            }
        }
        return k; 
    }
}