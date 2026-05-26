class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int ele : nums){
            sum+=ele;
        }

        ///...
        int i=0,leftSum=0,rightSum=sum;
        while(i<nums.length){
            rightSum-=nums[i];
            if(leftSum==rightSum) return i;
            leftSum+=nums[i];
            i++;
        }

        return -1;
    }
}
