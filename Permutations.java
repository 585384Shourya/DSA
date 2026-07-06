class Solution {
    public static List<List<Integer>> arrangements(int[] nums,List<List<Integer>> lst,List<Integer> innerLst){
        if(innerLst.size()==nums.length){
            lst.add(new ArrayList<>(innerLst));
            return lst;
        }
        ///...
        for(int ele : nums){
            if(!innerLst.contains(ele)){
                innerLst.add(ele);
                arrangements(nums,lst,innerLst);
                innerLst.remove(innerLst.size()-1);
            }
        }

        return lst;
    }

    ///...
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> innerLst = new ArrayList<>();
        return arrangements(nums,lst,innerLst);
    }
}