class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst1.add(nums[0]);
        lst2.add(nums[1]);
        int i=2;
        while(i<nums.length){
            if (lst1.get(lst1.size() - 1) > lst2.get(lst2.size() - 1)) {
                lst1.add(nums[i]);
            } else {
                lst2.add(nums[i]);
            }
            i++;
        }

        ///...
        i=0;
        for(int ele : lst1){
            nums[i]=ele;
            i++;
        }

        for(int ele : lst2){
            nums[i]=ele;
            i++;
        }

        return nums;
    }
}