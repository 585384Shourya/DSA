class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //using HashMap...
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        //Now traversing HashMap and finding those keys who have value==2...
        for(int key:map.keySet()){
            if(map.get(key)==2) lst.add(key);
        }

        return lst;
    }
}