class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // 1. Sort both the greed factors and the cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childIndex = 0;
        int cookieIndex = 0;
        
        // 2. Iterate through cookies to find matches
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie can satisfy the current child
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++; // Move to the next child
            }
            // Move to the next cookie regardless (if it was too small or used)
            cookieIndex++;
        }
         return childIndex;
    }
}