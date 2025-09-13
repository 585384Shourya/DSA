import java.util.*;
class Solution {
    static List<List<Integer>> sub(int[] nums,int idx){
        List<List<Integer>> ans=new ArrayList<>();
        if(idx>=nums.length){
            ans.add(new ArrayList<Integer>());
            return ans;
        }
        int cur=nums[idx];
        List<List<Integer>> smallans=sub(nums,idx+1);
        for(List<Integer> s:smallans){
            ans.add(s);
            List<Integer> copy = new ArrayList<>(s);
            copy.add(cur);
            ans.add(copy);
        }
        return ans;

    }
    public List<List<Integer>> subsets(int[] nums) {
        return sub(nums,0);
    }
}
