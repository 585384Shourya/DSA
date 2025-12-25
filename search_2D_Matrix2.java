class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid,st=0,end=matrix[0].length-1;
        while(st<matrix.length && end>=0){
            mid=matrix[st][end];
            if(mid==target){
                return true;
            }
            else if(target>mid){
                st=st+1;
            }
            else if(target<mid){
                end=end-1;
            }
        }
        return false;
    }
}
