class Solution {
    public boolean check(int[] nums) {
        int switche=0;
        int pointer=0;
        while(switche<1 && pointer<nums.length-1){
            if(nums[pointer+1]<nums[pointer]){
                switche=pointer+1;
            }
            pointer++;
        }
        if(nums[nums.length-1]>nums[0] && switche>0){
            return false;
        }
        for(int i=switche;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                return false;
            }
        }
        return true;
    }
}