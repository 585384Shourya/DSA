class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long[] prefixSum = new long[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++) prefixSum[i]=prefixSum[i-1]+nums[i];

        long totalSum=prefixSum[n-1];
        ///...
        int mid=n/2-1,low=-1,good=0;
        long sumLeft=0;
        while(mid<n){
            if(low==-1){
                sumLeft=totalSum-prefixSum[mid];
                if(prefixSum[mid]>sumLeft) good++;
                mid++;
                low++;
                continue;
            }

            ///...
            long prefixLeft=prefixSum[mid]-prefixSum[low];
            sumLeft=totalSum-prefixLeft;
            if(prefixLeft>sumLeft) good++;
            low++;
            mid++;
        }

        mid=mid%n;
        while(mid<(n/2-1)){
            long prefixLeft=prefixSum[low]-prefixSum[mid];
            sumLeft=totalSum-prefixLeft;
            if(prefixLeft<sumLeft) good++;
            low++;
            mid++;
        }

        return good;
    }
}