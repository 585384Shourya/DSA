class Solution {
    public int findNumbers(int[] nums) {
        int i=0,count=0;
        // while(i<nums.length){
        //     int n=nums[i];
        //     int dig=0;
        //     while(n!=0){
        //         n=n/10;
        //         dig++;
        //     }
        //     if(dig%2==0){
        //         count++;
        //     }
        //     i++;
        // }
        //Another approach..
        while(i<nums.length){
            int size=((int)Math.log10(nums[i]))+1;
            if(size%2==0){
               count++;
            }
            i++;
        }
        return count;
    }
}
