import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> lst=new ArrayList<Integer>();
        if(nums1.length>nums2.length){
            while(j<nums2.length && i<nums1.length){
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else if(nums1[i]>nums2[j]){
                    j++;
                }
                else{
                    lst.add(nums1[i]);
                    i++;
                    j++;
                }
            }
        }

        else{
            while(j<nums1.length && i<nums2.length){
                if(nums2[i]<nums1[j]){
                    i++;
                }
                else if(nums2[i]>nums1[j]){
                    j++;
                }
                else{
                    lst.add(nums2[i]);
                    i++;
                    j++;
                }
            }
        }
        int[] ans = new int[lst.size()];
        for (int k = 0; k< lst.size(); k++) {
            ans[k] = lst.get(k);
        }

        return ans;
        
    }
}