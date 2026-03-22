class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=target.length;
        for(int r=0;r<3;r++){
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            int[][] answer=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    answer[i][j]=mat[j][n-1-i];
                }
            }
            mat=answer;
        }
        return false;
    }
}