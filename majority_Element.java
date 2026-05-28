class Solution {
    public int majorityElement(int[] nums) {
        //Boyer-Moore Algorithm...
        int count=0,candidate=-1;
        for(int ele : nums){
            if(count==0) candidate=ele;
            ///.....
            if(candidate==ele) count++;
            else if(candidate!=ele) count--;
        }
        return candidate;
    }
}
