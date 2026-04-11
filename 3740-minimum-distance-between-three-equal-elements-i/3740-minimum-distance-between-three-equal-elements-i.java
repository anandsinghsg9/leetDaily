class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }
        
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;
        
        for (List<Integer> indices : map.values()) {
            // We need at least 3 indices to form a good tuple
            if (indices.size() >= 3) {
                found = true;
                // Check every consecutive triplet in the sorted indices list
                for (int i = 0; i <= indices.size() - 3; i++) {
                    int d = 2 * (indices.get(i + 2) - indices.get(i));
                    minDistance = Math.min(minDistance, d);
                }
            }
        }
        return found ? minDistance : -1;
    }
}