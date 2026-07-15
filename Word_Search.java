class Solution {
    public boolean backTrack(char[][] board, String word, int i, int j, int idx){
        if(idx==word.length()) return true;
        ///...
        int m=board.length,n=board[0].length;
        ///...
        if((i>=0 && i<m) && (j>=0 && j<n)){
            char ch=word.charAt(idx);
            if(board[i][j]!=ch) return false;

            board[i][j]='#';
            ///...
            if (backTrack(board, word, i, j+1, idx+1)) {
                    return true;
            }
            if (backTrack(board, word, i, j-1, idx+1)) {
                    return true;
            }
            if (backTrack(board, word, i+1, j, idx+1)) {
                    return true;
            }
            if (backTrack(board, word, i-1, j, idx+1)) {
                    return true;
            }

            board[i][j]=ch;
        }
        return false;
    }
    
    public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char ch=word.charAt(0);
                if(board[i][j]==ch){
                    if(backTrack(board,word,i,j,0)) return true;
                }
            }
        }

        return false;
    }
}