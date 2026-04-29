class Solution {
    public int findNumbers(int[] nums) {
        int answer=0;
        for(int i=0;i<nums.length;i++){
            if(10<=nums[i] && nums[i]<=99 || 1000<=nums[i] && nums[i]<=9999 || nums[i]==100000){
                answer++;
            }
        }
        return answer;
    }
}