class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i==0){
                nums[i]=nums[i];
            }
            else{
                nums[i]=nums[i]+nums[i-1];
            }
        }
        return nums;
    }
}
