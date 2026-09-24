class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        while(i<nums.length){
            int n=nums[i];
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }

            if(sum==i) return i;
            i++;
        }

        return -1;
    }
}
