class Solution {
    public static int totalpath(int m,int n,int r,int c,int[][] record){
        if(c==n-1 || r==m-1){
            return 1;
        }
        if(record[r][c]!=-1){
            return record[r][c];
        }
        record[r][c]=totalpath(m,n,r,c+1,record)+totalpath(m,n,r+1,c,record);
        return record[r][c];
    }
    public int uniquePaths(int m, int n) {
        int[][] record =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                record[i][j]=-1;
            }
        }
        return totalpath(m,n,0,0,record);
    }
}
