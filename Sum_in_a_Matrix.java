class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length,n=nums[0].length;
        /// step1:

        for(int i=0;i<m;i++){
            Arrays.sort(nums[i]);
        }

        ///...
        int score=0;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(max,nums[j][i]);
            }
            score+=max;
        }

        return score;
    }
}