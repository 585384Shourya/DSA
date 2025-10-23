class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,end=nums.length-1,mid;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid; 
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
        }
        return st;
    }
}
