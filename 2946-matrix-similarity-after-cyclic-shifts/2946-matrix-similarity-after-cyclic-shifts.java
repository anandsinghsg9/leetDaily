class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int l=mat[0].length;
        int m=mat.length;
        int [][]iter=new int[m][l];
        int [][]result=new int[m][l];
        for(int i=0;i<mat.length;i++){
            result[i]=mat[i].clone();
        }
        k=k%l;
        for(int i=0;i<k;i++){
            int j=0;
            int start=0;
            int stop=1;
            while(start<m){
                if(j<l-1){
                    iter[start][j]=result[start][j+1];
                    j++;
                }
                else if(j==l-1){
                    iter[start][j]=result[start][0];
                    j++;
                }
                else{
                    j=0;
                    start=start+2;
                }
            }
            while(stop<m){
                if(j<l-1){
                    iter[stop][j]=result[stop][j+1];
                    j++;
                }
                else if(j==l-1){
                    iter[stop][j]=result[stop][0];
                    j++;
                }
                else{
                    j=0;
                    stop=stop+2;
                }
            }
            for(int r=0;r<result.length;r++){
                result[r]= iter[r].clone();
            }
        } 
        return Arrays.deepEquals(result,mat);
    }
}