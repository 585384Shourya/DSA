class Solution {
    public int minElement(int[] nums) {
        int i=0;
        while(i<nums.length){
            int num = nums[i];
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            nums[i]=sum;
            i++;
        }

        ///finding Minimum...
        int min = Integer.MAX_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
}
