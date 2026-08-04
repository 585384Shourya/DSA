class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int ele : nums){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
            set.add(ele);
        }

        ///...


        int i=min+1;
        while(i<max){
            if(!set.contains(i)) lst.add(i);
            i++;
        }

        return lst;
    }
}
