class Solution {
    public static int totalpath(int[][] obstacleGrid,int m,int n,int r,int c){

        if(r==m || c==n || obstacleGrid[r][c]==1){
            return 0;
        }
        if(r==m-1 && c==n-1){
            return -1;
        }
        if(obstacleGrid[r][c]!=Integer.MIN_VALUE){
            return obstacleGrid[r][c];
        }
         obstacleGrid[r][c]=totalpath(obstacleGrid,m,n,r,c+1)+totalpath(obstacleGrid,m,n,r+1,c);
         return obstacleGrid[r][c];

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                else{
                    obstacleGrid[i][j]=Integer.MIN_VALUE;
                }
            }
        }
        return -(totalpath(obstacleGrid,m,n,0,0));
    }
}
