class Solution {
    public static List<List<Integer>> combinations(int[] candidates, int idx, int sum, int target, List<List<Integer>> lst, List<Integer> innerLst){
        if(sum>target || sum==target || idx==candidates.length){
            if(sum==target){
                lst.add(new ArrayList<>(innerLst));
            }

            return lst;
        }
        ///...
        innerLst.add(candidates[idx]);
        combinations(candidates,idx,sum+candidates[idx],target,lst,innerLst);
        ///...
        innerLst.remove(innerLst.size()-1);
        combinations(candidates,idx+1,sum,target,lst,innerLst);
        return lst;
    }

    ///...

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> innerLst = new ArrayList<>();
        return combinations(candidates,0,0,target,lst,innerLst);
    }
}