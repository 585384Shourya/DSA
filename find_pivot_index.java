class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
        int[] pSum=new int[n];
        int[] sSum=new int[n];
        //prefix Sum
        for(int i=0;i<n;i++){
            if(i==0){
                pSum[i]=nums[i];
            }
            else{
                pSum[i]=nums[i]+pSum[i-1];
            }
        }
        //Sufix Sum
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                sSum[i]=nums[i];
            }
            else{
                sSum[i]=nums[i]+sSum[i+1];
            }
        }

        //...now checking for pivot
        for(int i=0;i<n;i++){
            if(i==0){
                if(sSum[i+1]==0)return i;
            }
            else if(i==n-1){
                if(pSum[i-1]==0)return i;
            }
            else{
                if(pSum[i-1]==sSum[i+1]){
                    return i;
                }
            }
        }

        return -1;
    }
}
