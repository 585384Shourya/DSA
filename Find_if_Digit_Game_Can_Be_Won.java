class Solution {
    public boolean canAliceWin(int[] nums) {
        int sSum=0,dSum=0;
        for(int ele : nums){
            if(ele>=1 && ele<=9) sSum+=ele;
            else dSum+=ele;
        }

        return sSum==dSum ? false : true;
    }
}
