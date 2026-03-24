class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int row =grid.length;
        int column=grid[0].length;
        int MOD=12345;
        long product=1;
        long product2=1;
        int [][]result=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]=(int) product;
                product=grid[i][j]*(product%MOD)%MOD;
            }
        }
        for(int i=row-1;i>=0;i--){
            for(int j=column-1;j>=0;j--){
                result[i][j]=(int) ((product2*(result[i][j])%MOD)%MOD);
                product2=((grid[i][j]%MOD)*(product2))%MOD;
            }
        }
        return result;
    }
}