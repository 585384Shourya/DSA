class Solution {
    public boolean search(int[] nums, int target) {
        int st=0,end=nums.length-1,mid;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target==nums[mid]){
                return true;
            }
            else if(nums[st]==nums[mid] && nums[mid]==nums[end]){
                end--;
            }
            else if(nums[mid]<=nums[end]){
                if(target>nums[mid] && target<=nums[end]){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else if(nums[st]<=nums[mid]){
                if(target>=nums[st] && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return false;
    }
}