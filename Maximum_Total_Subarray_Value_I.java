class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE; 
        for(int ele : nums){
            if(ele<min) min=ele;
            if(ele>max) max=ele; 
        }

        return (long)k*(max-min);
    }
}