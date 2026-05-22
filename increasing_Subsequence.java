class Solution {
    public int findLengthOfLCIS(int[] nums) {

        ///Sliding Window Pattern...
       int low=0,high=0,max_Length=Integer.MIN_VALUE;
       while(high<nums.length){
          if(high!=0 && nums[high]<=nums[high-1]){
            low=high;
          }
          max_Length=Math.max((high-low)+1,max_Length);
          high++;
       } 

       return max_Length;
    }
}