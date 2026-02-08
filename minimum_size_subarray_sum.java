class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high=0,low=0,sum=0,size=Integer.MAX_VALUE;
        while(high<nums.length){
            sum=sum+nums[high];
            while(sum>=target){
                if(size>(high-low)){
                    size=(high-low)+1;
                }
                sum-=nums[low];
                low++;
            }
            high++;
        }
        if(size==Integer.MAX_VALUE){
            return 0;
        }
        return size;
    }
}
