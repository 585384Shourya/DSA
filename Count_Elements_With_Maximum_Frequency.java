class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums) map.put(ele,map.getOrDefault(ele,0)+1);

        ///....
        int maxFreq=Integer.MIN_VALUE;
        for(int val : map.values()) maxFreq=Math.max(maxFreq,val);

        ///...
        int ans=0;
        for(int val : map.values()) if(val==maxFreq) ans+=val;

        return ans;
    }
}