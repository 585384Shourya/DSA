class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,m=mat.length,n=mat[0].length;

        ///...
        int k=0,l=n-1;
        for(int i=0;i<m;i++){
            if(k==l) sum+=mat[i][k];
            else sum+=mat[i][k]+mat[i][l];
            k++;
            l--;
        }

        return sum;
    }
}
