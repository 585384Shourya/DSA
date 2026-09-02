class Solution {
    public boolean check(int[] nums) {
        ///Practice again...
        int kink=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]) kink++;
        }

        return kink<=1;
    }
}
