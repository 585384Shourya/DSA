class Solution {
    public int waysToSplitArray(int[] nums) {
        long rightSum=0,leftSum=0;
        for(int ele : nums) rightSum+=ele;
        ///....
        int i=0,count=0;
        while(i<nums.length-1){
            leftSum+=nums[i];
            rightSum-=nums[i];
            if(leftSum>=rightSum) count++;
            i++;
        }
        return count;
    }
}
