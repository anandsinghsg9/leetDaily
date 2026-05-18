class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original= image[sr][sc];
        if(original==color){
            return image;
        }
        dfs(image,sr,sc,original,color);
        return image;
    }
    private void dfs(int[][]image, int sr, int sc, int original,int color){
        int column=image[0].length;
        int rows=image.length;
        if(sr<0 || sc<0|| sr>=rows || sc>=column || image[sr][sc]!=original ){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,original,color);
        dfs(image,sr-1,sc,original,color);
        dfs(image,sr,sc+1,original,color);
        dfs(image,sr,sc-1,original,color);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna