class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int uniqe_ele=-1;
        ///step1: ...
        for(int ele : nums){
            map1.put(ele,map1.getOrDefault(ele,0)+1);
        }
        ///Step2: Now, counting frequecy...
        for(int ele : map1.keySet()){
            int temp=map1.get(ele);
            map2.put(temp,map2.getOrDefault(temp,0)+1);
        }
        ///Step3: Now,calculating unique frequency...
        for(int ele : nums){
            int freq = map1.get(ele); // Is element ki frequency kya hai...
            if (map2.get(freq) == 1) { // Kya yeh frequency unique hai...
                return ele; // Mil gaya sabse pehla element...
            }
        }
        ///...
        return uniqe_ele;
    }
}
