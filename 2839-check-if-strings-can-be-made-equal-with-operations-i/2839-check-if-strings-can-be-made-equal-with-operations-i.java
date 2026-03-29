class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        if(a1[0]==a2[2] && a1[2]==a2[0]){
            if(a1[1]==a2[3] && a1[3]==a2[1]||a1[1]==a2[1] && a1[3]==a2[3]){
                return true;
            }
        }
        if(a1[2]==a2[2] && a1[0]==a2[0]){
            if(a1[1]==a2[3] && a1[3]==a2[1]||a1[1]==a2[1] && a1[3]==a2[3]){
                return true;
            }
        }
        return false;
    }
}