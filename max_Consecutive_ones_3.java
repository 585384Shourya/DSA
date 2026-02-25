class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0,high=0,ansLen=0;
        int[] arr=new int[2];
        while(high<nums.length){
            arr[nums[high]]++;
            while(arr[0]>k){
                if(nums[low]==0) arr[0]--;
                low++;
            }
            if(ansLen<(high-low)+1) ansLen=(high-low)+1;
            high++;
        }
        return ansLen;
    }
}
