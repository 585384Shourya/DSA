class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int op1=(nums[n-1]-1)*(nums[n-2]-1);
        int op2=(nums[0]-1)*(nums[1]-1);

        return Math.max(op1,op2);
    }
}