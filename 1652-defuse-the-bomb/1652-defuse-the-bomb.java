class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) return result;

        // Define the initial window based on sign of k
        int start = (k > 0) ? 1 : n + k;
        int end = (k > 0) ? k : n - 1;
        
        int currentSum = 0;
        for (int i = start; i <= end; i++) {
            currentSum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            result[i] = currentSum;
            // Slide the window: remove start, add next end
            currentSum -= code[start % n];
            start++;
            end++;
            currentSum += code[end % n];
        }

        return result;
    }
}