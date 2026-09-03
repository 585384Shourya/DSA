class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest=Integer.MAX_VALUE;
        for(int ele : nums1){
            if(ele%2!=0) smallest=Math.min(smallest,ele);
        }

        ///....
        if(smallest==Integer.MAX_VALUE) return true;

        for(int ele : nums1){
            if(ele%2==0 && smallest>ele) return false;
        }

        return true;
    }
}