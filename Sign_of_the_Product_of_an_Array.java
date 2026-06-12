class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for (int ele : nums) {
            if (ele == 0) {
                return 0; 
            }
            if (ele < 0) {
                pro *= -1; 
            }
        }
        return pro;
    }
}
