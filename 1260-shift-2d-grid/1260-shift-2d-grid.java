class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        
        // Effective shifts needed
        k = k % totalElements;
        
        // Create an empty result grid initialized to zeros
        int[][] shifted = new int[m][n];
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // Calculate new 1D index after shift
                int new1DIndex = (r * n + c + k) % totalElements;
                
                // Convert back to 2D coordinates
                int newR = new1DIndex / n;
                int newC = new1DIndex % n;
                
                shifted[newR][newC] = grid[r][c];
            }
        }
        
        // Convert 2D primitive array to List<List<Integer>> as required by standard signature
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : shifted) {
            List<Integer> listRow = new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            result.add(listRow);
        }
        
        return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna