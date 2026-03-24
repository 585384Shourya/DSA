class Solution {
    public int maxProduct(int[] nums) {
         int i=1,maxPro=nums[0],minPro=nums[0],max=nums[0];
         while(i<nums.length){
            int temp=maxPro;
           maxPro=Math.max(nums[i],Math.max(maxPro*nums[i],minPro*nums[i]));
           minPro=Math.min(nums[i],Math.min(temp*nums[i],minPro*nums[i]));
           //...
           if(maxPro>max) max=maxPro;
           i++;
        }
        return max;
    }
}
//do it agaain..
