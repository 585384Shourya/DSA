class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,map.getOrDefault(0,0)+1);
        int sum=0,count=0,remainder=0;
        //...
        for(int ele:nums){
            sum+=ele; 
            remainder=((sum%k)+k)%k;
            //Agar map wo key contain kar raha ho tab hi ye condition true hoga...
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
         
         return count;
    }
}
