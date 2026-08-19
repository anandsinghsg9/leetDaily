class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> rowMasks = new HashMap<>();
        
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            
            if (col >= 2 && col <= 9) {
                rowMasks.put(row, rowMasks.getOrDefault(row, 0) | (1 << col));
            }
        }
        
        int maxFamilies = (n - rowMasks.size()) * 2;
        
        int leftMask = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);     
        int rightMask = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);   
        int middleMask = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);  
        
        for (int mask : rowMasks.values()) {
            boolean leftAvailable = (mask & leftMask) == 0;
            boolean rightAvailable = (mask & rightMask) == 0;
            boolean middleAvailable = (mask & middleMask) == 0;
            
            if (leftAvailable && rightAvailable) {
                maxFamilies += 2; 
            } else if (leftAvailable || rightAvailable || middleAvailable) {
                maxFamilies += 1; 
            }
        }
        
        return maxFamilies;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna