class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Solved using two HashSet...
        int n=0,i=0,count=0;
        if(nums1.length<nums2.length) n=nums1.length;
        else if(nums1.length>=nums2.length) n=nums2.length;
        int[] ans=new int[n];
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int ele :nums1){
            set1.add(ele);
        }
        //...
        for(int ele:nums2){
            set2.add(ele);
        }
        //...
        for(int ele:set1){
            if(set2.contains(ele)){
                ans[i]=ele;
                count++;
                i++;
            }
        }

        return Arrays.copyOf(ans,count);
    }
}
