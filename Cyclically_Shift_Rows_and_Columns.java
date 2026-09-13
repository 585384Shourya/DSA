class Solution {
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            nums[left]  = nums[left] ^ nums[right];
            nums[right] = nums[left] ^ nums[right];
            nums[left]  = nums[left] ^ nums[right];
            left++;
            right--;
        }
    }

    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        ///for rowShift...
        for(int i=0;i<n;i++){
            int k=rowShift[i];
            reverse(grid[i],0,n-1);
            reverse(grid[i],n-k,n-1);
            reverse(grid[i],0,n-k-1);
        }

        //for colShift...
        for(int i=0;i<n;i++){
            int[] arr = new int[n];
            int l=0;
            for(int j=n-1;j>=0;j--){
                arr[l]=grid[j][i];
                l++;
            }

            int k=colShift[i];
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            
            l=0;
            for(int j=n-1;j>=0;j--){
                grid[j][i]=arr[l];
                l++;
            }
        }

        return grid;
    }
}
