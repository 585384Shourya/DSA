class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        //...
        HashSet<Integer> st = new HashSet<>();
        for(int ele:map.keySet()){
            st.add(map.get(ele));
        }
        //...
        if(map.size()==st.size()) return true;

        return false;
    }
}
