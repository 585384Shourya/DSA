class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,map.getOrDefault(0,0)+1);
        int sum=0,count=0;
        for(int ele:nums){
            sum+=ele;
            //Agar map wo key contain kar raha ho tab hi ye condition true hoga...
            if(map.containsKey(sum - k)){
                int var=map.get(sum-k);
                while(var!=0){
                    count++;
                    var--;
                }
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
