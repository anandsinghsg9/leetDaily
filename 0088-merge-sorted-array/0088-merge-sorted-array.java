class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int first = 0;
        int second = 0;
        int i = 0;

        while (first < m && second < n) {
            // Compare values first
            if (nums1[first] <= nums2[second]) {
                result[i] = nums1[first]; // Assign current value
                first++;                   // Then move pointer
            } else {
                result[i] = nums2[second]; // Assign current value
                second++;                  // Then move pointer
            }
            i++;
        }

        // Fill remaining elements from nums2
        while (second < n) {
            result[i++] = nums2[second++];
        }

        // Fill remaining elements from nums1
        while (first < m) {
            result[i++] = nums1[first++];
        }

        // Copy everything back to nums1
        for (int j = 0; j < (m + n); j++) {
            nums1[j] = result[j];
        }
    }
}