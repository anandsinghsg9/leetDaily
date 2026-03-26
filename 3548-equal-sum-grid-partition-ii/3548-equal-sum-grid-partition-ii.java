class Solution {
    static final int BIG_NUM = 100001;   // ← maximum possible grid value + 1

    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length; 
        long total = 0;                    // total sum of all cells

        // frequency arrays for top/bottom sections (horizontal cuts)
        int[] bottom = new int[BIG_NUM], top = new int[BIG_NUM]; 
        // initially, bottom contains every cell
        for (int[] row : grid) {
            for (int x : row) {
                total += x;
                bottom[x]++;               // count each value in the whole grid
            }
        }

        // ---------- HORIZONTAL CUTS ----------
        long top_sum = 0;
        for (int i = 0; i < m - 1; i++) {                // cut after row i
            // move the current row from bottom to top
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                top_sum += val;            // add to top section
                top[val]++;                // update frequency of top
                bottom[val]--;             // remove from bottom frequency
            }

            long bottom_sum = total - top_sum;
            if (top_sum == bottom_sum) return true;      // sums already equal

            long diff = Math.abs(top_sum - bottom_sum);
            // if diff is too large, no single cell can cover it
            if (diff < BIG_NUM) {
                if (top_sum > bottom_sum) {
                    // heavier section is top → try to remove a cell from top
                    if (check(top, grid, 0, i, 0, n - 1, diff)) return true;
                } else {
                    // heavier section is bottom → try to remove a cell from bottom
                    if (check(bottom, grid, i + 1, m - 1, 0, n - 1, diff)) return true;
                }
            }
        }

        // ---------- VERTICAL CUTS ----------
        int[] left = new int[BIG_NUM], right = new int[BIG_NUM];
        for (int[] row : grid) {
            for (int x : row) {
                right[x]++;               // initially right contains everything
            }
        }

        long left_sum = 0;
        for (int j = 0; j < n - 1; j++) {                // cut after column j
            for (int i = 0; i < m; i++) {
                int val = grid[i][j];
                left_sum += val;
                left[val]++;
                right[val]--;
            }

            long right_sum = total - left_sum;
            if (left_sum == right_sum) return true;

            long diff = Math.abs(left_sum - right_sum);
            if (diff < BIG_NUM) {
                if (left_sum > right_sum) {
                    if (check(left, grid, 0, m - 1, 0, j, diff)) return true;
                } else {
                    if (check(right, grid, 0, m - 1, j + 1, n - 1, diff)) return true;
                }
            }
        }

        return false;   // no valid cut found
    }

    // Check if we can remove a cell with value 'diff' from the section
    // defined by rows [r1..r2] and columns [c1..c2].
    private boolean check(int[] freq, int[][] grid, int r1, int r2, int c1, int c2, long diff) {
        int rows = r2 - r1 + 1, cols = c2 - c1 + 1;

        // section of size 1 → cannot remove the only cell
        if (rows * cols == 1) return false;

        // if the section has both dimensions > 1, removing any cell stays connected
        if (rows > 1 && cols > 1) {
            return freq[(int)diff] > 0;   // just check if value exists in this section
        }

        // single row → only the two ends can be removed without splitting
        if (rows == 1) {
            return grid[r1][c1] == diff || grid[r2][c2] == diff;
        } 
        // single column → only the two ends can be removed
        else {
            return grid[r1][c1] == diff || grid[r1][c2] == diff;
        }
    }
}