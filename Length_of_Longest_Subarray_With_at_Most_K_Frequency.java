class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length,len=0;
        int low=0,high=0;

        ///...
        while(high<n){
            int ele=nums[high];
            map.put(ele,map.getOrDefault(ele,0)+1);

            ///...
            while(map.get(ele)>k){
                int left=nums[low];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                low++;
            }

            len=Math.max(len,(high-low)+1);

            high++;
        }

        return len;
    }
}