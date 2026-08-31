class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        ///...
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,idxMin=-1,idxMax=-1;
        for(int i=0;i<n;i++){
           if(nums[i]<min){
            min=nums[i];
            idxMin=i;
           }
           if(nums[i]>max){
            max=nums[i];
            idxMax=i;
           }
        }

        ///...
        int val1=Math.max(idxMin,idxMax)+1;
        int val2=n-Math.min(idxMin,idxMax);
        int val3=n-Math.max(idxMin,idxMax);
        val3+=Math.min(idxMin,idxMax)+1;
        int ans=Math.min(val3,Math.min(val1,val2));


        return ans;
    }
}
