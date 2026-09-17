class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int sum=nums[0]+nums[1];
        st.add(sum);
        int i=0,j=2;
        while(j<nums.length){
            sum-=nums[i];
            sum+=nums[j];
            if(st.contains(sum)) return true;
            st.add(sum);
            i++;
            j++;
        }

        return false;
    }
}