class Solution {
    public int[] replaceElements(int[] arr) {
        int max=0;
        int []output= new int [arr.length];
        for(int i=arr.length-1;i>0;i--){
            max=Math.max(max,arr[i]);
            output[i-1]=max;
        }
        output[arr.length-1]=-1;
        return output;
    }
}