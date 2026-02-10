class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int low=0,high=0,n=fruits.length,size=Integer.MIN_VALUE;
        while(high<n){
            int curr=fruits[high];
            map.put(curr,map.getOrDefault(curr,0)+1);
            //Shrink window if more than 2 fruit types...
            while(map.size()>2){
                int left=fruits[low];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                low++;
            }
            if(size<(high-low)+1){
                size=(high-low)+1;
            }
            high++;
        }
        return size;
    }
}
