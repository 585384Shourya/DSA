class Solution {
    public int differenceOfSum(int[] nums) {
        int ele_Sum=0,di_Sum=0;
        int i=0;
        while(i<nums.length){
            ele_Sum+=nums[i];
            int j=nums[i];
            while(j!=0){
                di_Sum+=j%10;
                j/=10;
            }
            i++;
        }
        return Math.abs(di_Sum-ele_Sum);
    }
}
