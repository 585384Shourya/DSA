class Solution {
    public int backTrack(char[][] grid, int i, int j){
        int m=grid.length,n=grid[0].length;

        ///...
        if(i<0 || i>=m || j<0 || j>=n) return 0;
        
        if((i>=0 && i<m) && (j>=0 && j<n)){
            char ch=grid[i][j];
            if(ch!='1') return 0;

            grid[i][j]='#';
            ///...
            backTrack(grid,i,j+1);
            backTrack(grid,i,j-1);
            backTrack(grid,i+1,j);
            backTrack(grid,i-1,j);
        }

        return 1;
    }
    ///...
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length,islands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                   islands+=backTrack(grid,i,j);
                }
            }
        }

        return islands;
    }
}