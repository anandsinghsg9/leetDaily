class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> row1=new ArrayList<>();
        List<Integer> row2=new ArrayList<>();
        for(int k=0;k<nums1.length;k++){
            if(!set2.contains(nums1[k])){
                row1.add(nums1[k]);
                set2.add(nums1[k]);
            }
        }
        for(int l=0;l<nums2.length;l++){
            if(!set1.contains(nums2[l])){
                row2.add(nums2[l]);
                set1.add(nums2[l]);
            }
        }
        list.add(row1);
        list.add(row2);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna