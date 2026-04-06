class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Key: Sorted String, Value: List of original strings
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Convert string to char array and sort it
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            
            // 2. If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // 3. Add the original string to the corresponding list
            map.get(key).add(s);
        }
        
        // 4. Return all the values (lists) from the map
        return new ArrayList<>(map.values());
    }
}