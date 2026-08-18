class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // Case 1: k == n
        // Only 1 subarray exists, so all elements appear in exactly 1 subarray.
        if (k == n) {
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        // Count overall frequencies of all numbers
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Case 2: k == 1
        // Subarrays have size 1. Valid numbers must have total frequency == 1.
        if (k == 1) {
            int max = -1;
            for (int num : freq.keySet()) {
                if (freq.get(num) == 1) {
                    max = Math.max(max, num);
                }
            }
            return max;
        }

        // Case 3: 1 < k < n
        // Middle elements (indices 1 to n-2) always belong to >= 2 subarrays.
        // Only nums[0] or nums[n-1] can be valid (if their total frequency is 1).
        int ans = -1;
        if (freq.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (freq.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna