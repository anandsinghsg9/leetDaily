class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int point=arr.length-1;
        int []rightmax=new int [point+1];
        rightmax[point]=0;
        point--;
        for(int i=arr.length-1;i>0;i--){
            rightmax[point]=Math.max(rightmax[i],arr[i]);
            point--;
        }
        ArrayList <Integer> max=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=rightmax[i]){
                max.add(arr[i]);
            }
        }
        return max;
    }
}
