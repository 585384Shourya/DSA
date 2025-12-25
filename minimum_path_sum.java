class Solution {
    public static int smallestpath(int[][] grid,int[][] gridcopy,int m,int n,int r,int c){
        
        if(r==m || c==n){
            return Integer.MAX_VALUE;
        }
        int c_val=grid[r][c];
        if(r==m-1 && c==n-1){
            grid[r][c]=c_val;
            gridcopy[r][c]=grid[r][c];
            return grid[r][c];
        }
        if(gridcopy[r][c]!=-1){
            return gridcopy[r][c];
        }
        int col_wala=smallestpath(grid,gridcopy,m,n,r,c+1);
        int row_wala=smallestpath(grid,gridcopy,m,n,r+1,c);
        if(row_wala < col_wala){
            grid[r][c]=c_val+row_wala;
            gridcopy[r][c]=grid[r][c];
        }
        else{
            grid[r][c]=c_val+col_wala;
            gridcopy[r][c]=grid[r][c];
        }
        return gridcopy[r][c];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] gridcopy=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                gridcopy[i][j]=-1;
            }
        }
        return smallestpath(grid,gridcopy,m,n,0,0);
    }
}
