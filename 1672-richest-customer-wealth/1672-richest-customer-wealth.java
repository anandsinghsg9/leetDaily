class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int column=accounts[0].length;
        int output=0;
        int richest=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                output+=accounts[i][j];
            }
            richest=Math.max(output,richest);
            output=0;
        }
        return richest;
    }
}