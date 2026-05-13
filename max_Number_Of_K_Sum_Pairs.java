class Solution {
    public int maxOperations(int[] nums, int k) {
        //Solving using two pointer pattern...
        // Arrays.sort(nums);
        // int i=0,j=nums.length-1,count=0;
        // while(i<j){
        //     if(nums[i]+nums[j]==k){
        //         count++;
        //         i++;
        //         j--;
        //     }
        //     else if(nums[i]+nums[j]<k) i++;
        //     else if(nums[i]+nums[j]>k) j--;
        // }

        // return count;

        //Soving using HashMap...
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,count=0;
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        i++;
        while(i<nums.length){
            if (map.getOrDefault(k-nums[i], 0) > 0) {
               count++;
               /// Frequency 1 se kam karne ke liye...
               map.put(k-nums[i], map.get(k-nums[i]) - 1);
            }
            else{///Matlab nahi contain karta hai...
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            i++;
        }
        return count;
    }
}
