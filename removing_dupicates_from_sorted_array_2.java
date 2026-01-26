class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,count=1;
        while(j<nums.length){
            if(nums[i]==nums[j] && count<2){
                if((j-i)==1){
                    i=j;
                    j++;
                }
                else if((j-i)!=1){
                    i=i+1;
                    nums[i]=nums[j];
                    j++;
                }
                count++;
            }
            else if(nums[i]==nums[j] && count>=2){
                j++;
                count++;
            }
            else if(nums[i]!=nums[j]){
                if((j-i)==1){
                    i=j;
                    j++;
                }
                else if((j-i)!=1){
                    i=i+1;
                    nums[i]=nums[j];
                    j++;
                }
                count=1;
            }
        }
        return i+1;
    }
}
