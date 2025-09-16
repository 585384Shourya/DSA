class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
         int prev=nums[n-1],count=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=prev){
                prev=nums[i];
                count++;
            }
            if(count==3){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}