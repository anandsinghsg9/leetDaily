class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long []sumR=new long[grid.length]; 
        long totalSumR=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sumR [i]+=grid[i][j];
            }
            totalSumR+=sumR[i];
        }
        long []sumC=new long[grid[0].length]; 
        long totalSumC=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                sumC[i]+=grid[j][i];
            }
            totalSumC+=sumC[i];
        }
        long prefix=0;
        long suffix=0;
        for(int i=0;i<sumR.length-1;i++){
            prefix+=sumR[i];
            suffix=totalSumR-prefix;
            if(prefix==suffix){
                return true;
            }
        }
        prefix=0;
        suffix=0;
        for(int i=0;i<sumC.length-1;i++){
            prefix+=sumC[i];
            suffix=totalSumC-prefix;
            if(prefix==suffix){
                return true;
            }
        }
        return false;
    }
}