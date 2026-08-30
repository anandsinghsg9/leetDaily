class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        // Step 1: Find array indices of min and max elements
        for (int k = 0; k < n; k++) {
            if (nums[k] < nums[minIdx]) minIdx = k;
            if (nums[k] > nums[maxIdx]) maxIdx = k;
        }

        // Step 2: Ensure i is the left index and j is the right index
        int i = Math.min(minIdx, maxIdx);
        int j = Math.max(minIdx, maxIdx);

        // Step 3: Compute min cost across 3 possible paths
        int bothFromLeft = j + 1;
        int bothFromRight = n - i;
        int oneFromEachEnd = (i + 1) + (n - j);

        return Math.min(bothFromLeft, Math.min(bothFromRight, oneFromEachEnd));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna