class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row=x;
        int column=y;
        int a= k/2;
        for(int j=0;j<k;j++){
            for (int i=0;i<a;i++){
                int temp=grid[row+i][column+j];
                grid[row+i][column+j]=grid[row+k-1-i][column+j];
                grid[row+k-1-i][column+j]=temp;
            }
        }
        return grid;
    }
}