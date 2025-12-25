class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int st=0,mid,end=(m*n-1);
        while(st<=end){
            mid=st+(end-st)/2;

            int r=mid/n;
            int c=mid%n;
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]<target){
                st=mid+1;
            }
            else if(matrix[r][c]>target){
                end=mid-1;
            }
        }
        return false;
    }
}