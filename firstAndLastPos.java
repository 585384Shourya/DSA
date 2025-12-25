class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=-1;arr[1]=-1;
        int st=0,end=nums.length-1,mid,i=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target ){
               if(i==0){ 
                arr[i]=mid;
                end=mid-1;
                }
                else{
                arr[i]=mid;
                st=mid+1;
                }
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            
            if(st>end && i==0){
                end=nums.length-1;
                i++;
            }
        }

        return arr;
    }
}
