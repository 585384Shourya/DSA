class Solution {
    public List<List<Integer>> backTrack(int[] candidates, List<List<Integer>> lst, int target, List<Integer> innerLst, int idx, int sum){
        if(sum>=target || idx>=candidates.length){
            if(sum==target){
                lst.add(new ArrayList<>(innerLst));
                return lst;
            }

            return lst;
        }

        ///...
        innerLst.add(candidates[idx]);
        backTrack(candidates,lst,target,innerLst,idx+1,sum+candidates[idx]);

        ///...
        innerLst.remove(innerLst.size()-1);
        idx++;
        ///...
        if((idx!=0 && idx<candidates.length) && candidates[idx]==candidates[idx-1]){
            while(idx<candidates.length && candidates[idx]==candidates[idx-1]) idx++;

            if(idx>=candidates.length) return lst;
            backTrack(candidates,lst,target,innerLst,idx,sum); 

        }
        else{
            backTrack(candidates,lst,target,innerLst,idx,sum);
        }

        return lst;
    }
    ///...
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> innerLst = new ArrayList<>();
        return backTrack(candidates,lst,target,innerLst,0,0);
    }
}