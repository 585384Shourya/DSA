class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suffixMin = new int[n];
        int max=-1,stableIdx=-1,instabilityScore=Integer.MAX_VALUE;

        ///...
        suffixMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>suffixMin[i+1]) suffixMin[i]=suffixMin[i+1]; 
            else suffixMin[i]=nums[i];
        }

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if((max-suffixMin[i])<=k){  
                    stableIdx=i;
                    break;
            }
        }

        return stableIdx;
    }
}