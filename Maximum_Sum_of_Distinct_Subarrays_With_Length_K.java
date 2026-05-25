class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        ///....
        int low=0,high=0;
        long sum=0L,max_Sum=0L;
        boolean marked = true;
        //Iterration for first k elements...
        for(high=0;high<k;high++){
            sum+=nums[high];
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
        }

        if(map.size()!=k) marked =false;
        else marked=true;
        if(marked && max_Sum<sum) max_Sum=sum;
        ///Now,applying fixed size sliding window...
        for(;high<n;high++){
            sum-=nums[low];
            map.put(nums[low],map.getOrDefault(nums[low],0)-1);
            if(map.get(nums[low])==0) map.remove(nums[low]);

            sum+=nums[high];
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            if(map.size()!=k) marked =false;
            else marked=true;

            if(marked && max_Sum<sum) max_Sum=sum;
            low++;
        }

        return max_Sum;
    }
}
