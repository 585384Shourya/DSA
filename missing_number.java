class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumoFn=n*(n+1)/2;
        int i=0,sum=0;
        while(i<n){
            sum=sum+nums[i];
            i++;
        }
        return (sumoFn-sum);
    }
}
