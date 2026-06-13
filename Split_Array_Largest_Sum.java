class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0,minLar=0;
        for(int ele : nums){
            low = Math.max(low, ele);
            high+=ele;
        } 

        while(low<=high){
            int mid=low+(high-low)/2;
            //Applying Sliding window pattern...
            int right=0,countSplits=1,Sum=0;
            while (right < nums.length) {
            // Agar current element add karne se mid cross nahi ho raha
            if (Sum + nums[right] <= mid) {
               Sum += nums[right];
            } 
            else {
            // Agar cross ho gaya, toh pichla window yahan block karo (Split lagao)
            countSplits++;
            Sum = nums[right]; // Nayi window isi element se shuru hogi
            }
           right++;
        }

            ////...
            if(countSplits<=k){
                minLar=mid;
                high=mid-1;
            }  
            else if(countSplits>k){
                low=mid+1;
            }
        }

        return minLar;
    }
}
