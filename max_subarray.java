class Solution {
    public int maxSubArray(int[] nums) {
        //...Solving using kadane pattern
        int max=nums[0],pvsSum=nums[0],currSum=nums[0];
        int i=1;
        while(i<nums.length){
            int val1=nums[i]+pvsSum;
            int val2=nums[i];
            currSum=Math.max(val1,val2);

            if(currSum>max) max=currSum;
            pvsSum=currSum;
            i++;
        }
        return max;
    }
}
//doit again..
