class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 || mid==nums.length-1)|| (nums[mid]!=nums[mid-1] &&  nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                if((mid-1)%2!=0){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else if(nums[mid]==nums[mid+1]){
                if((mid)%2!=0){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
}
