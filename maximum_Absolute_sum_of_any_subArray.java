class Solution {
    public int maxAbsoluteSum(int[] nums) {
        ///...Maximum value
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
        max=Math.abs(max);

        ///...Minimum value
       int min=nums[0];pvsSum=nums[0];currSum=nums[0];
        for( i=1;i<nums.length;i++){
            int val1=pvsSum+nums[i];
            int val2=nums[i];
            
            currSum=Math.min(val1,val2);
            
            if(currSum<min) min=currSum;
            //...
            pvsSum=currSum;
        }
         min=Math.abs(min);
         if(max>min) return max;

        return min; 
    }
}
