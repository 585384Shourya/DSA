class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int ele : nums) st.add(ele);

        ///...
        int i=1;
        List<Integer> lst = new ArrayList<>();
        while(i<=nums.length){
            if(!st.contains(i)) lst.add(i);
            i++;
        }

        return lst;
    }
}