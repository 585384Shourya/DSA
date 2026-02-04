class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,n=nums.length,max=0,count=0;
        while(i<n){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                if(max<count){
                    max=count;
                }
                count=0;
            }
            i++;
        }
        //...
        if(max<count){
            max=count;
        }
        return max;
    }
}
