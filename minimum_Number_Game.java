class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.sort(nums);
        int i=0,j=0;
        while(i<nums.length){
            int alice=nums[i++];
            int bob=nums[i++];
            //Now, putting values in arr array...
            arr[j++]=bob;
            arr[j++]=alice;
        }
        return arr;
    }
}