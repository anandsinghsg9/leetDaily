class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        double c= (double) n;
        while(c>1){
            c=c/3;
        }
        return c==1;
    }
}