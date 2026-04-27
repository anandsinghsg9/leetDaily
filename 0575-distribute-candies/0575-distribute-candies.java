class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        int type=1;
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        type=Math.min(n,set.size());
        return type;
    }
}