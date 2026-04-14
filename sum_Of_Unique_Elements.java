public class sum_Of_Unique_Elements {
    public int sumOfUnique(int[] nums) {
        //Solving using HashMap...
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        //...
        int sum=0;
        for(int key: map.keySet()){
            if(map.get(key)==1){
                sum+=key;
            }
        }

        return sum;
    }
} 
