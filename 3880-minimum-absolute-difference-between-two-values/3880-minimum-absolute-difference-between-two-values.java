class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int result=Integer.MAX_VALUE;
        int x=-1;
        int y=-1;
        int diffrence=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                x=i;
                diffrence=Math.abs(x-y);
                if(y!=-1){
                    result=Math.min(result, diffrence);
                }
                
            }
            else if(nums[i]==2){
                y=i;
                diffrence=Math.abs(x-y);
                if(x!=-1){
                  result=Math.min(result, diffrence);  
                }
            }
        }
        if(x>-1 && y>-1){
            return result;
        }
        return -1;
    }
}