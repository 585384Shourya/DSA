class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> st = new HashSet<>();

        for(int ele : nums) st.add(ele);

        ///...
        int len=0;
        for(int ele : st){
            if(!st.contains(ele-1)){
                int size=1;

                while(st.contains(ele+1)){
                size++;
                ele++;
                }

                len=Math.max(len,size);
            }
        }

        return len;
    }
}