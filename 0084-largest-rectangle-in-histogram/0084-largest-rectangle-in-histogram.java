import java.util.Stack;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s=new Stack<>();
        int []left= new int[heights.length];
        for(int i=0;i<left.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        int [] right=new int[heights.length];
        for(int j=right.length-1;j>-1;j--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[j]){
                s.pop();
            }
            if(s.isEmpty()){
                right[j]=heights.length;
            }
            else{
                right[j]=s.peek();
            }
            s.push(j);
        }
        int output=0;
        for(int k=0;k<heights.length;k++){
            int rectangle=(right[k]-left[k]-1)*heights[k];
            output=Math.max(rectangle,output);
        }
        return output;
    }
}