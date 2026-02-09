class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int i=0,j=0;
        while(i<ans.length){
            if(j==nums.length){
                j=0;
            }
            ans[i]=nums[j];
            i++;
            j++;
        }
        return ans;
    }
}
