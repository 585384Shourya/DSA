class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,left,right;
        //...
        while(i<n-2){

            left=i+1;right=n-1;
            if(i!=0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            //...
            while(left<right){
                if((nums[left]+nums[right])==(-nums[i])){
                    List<Integer> row = new ArrayList<>();
                    row.add(nums[left]);
                    row.add(nums[right]);
                    row.add(nums[i]);
                    lst.add(row);
                    left++;
                    right--;

                    //for checking duplicates..

                    while( left<right  && nums[left]==nums[left-1]){
                    left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                    right--;
                    }
                }
                else if((nums[left]+nums[right])<(-nums[i])){
                    left++;
                }
                else if((nums[left]+nums[right])>(-nums[i])){ThreeSum.java
                    right--;
                }

            }
            i++;
        }
        //...
        return lst;
    }
}