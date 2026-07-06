class Solution {
    public static int[] mergeSort(int[] nums1,int[] nums2,int[] merged){
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                merged[k]=nums2[j];
                j++;
            }
            k++;
        }

        ///...
        while(i<nums1.length){
            merged[k]=nums1[i];
            i++;
            k++;
        }
        ///...
        while(j<nums2.length){
            merged[k]=nums2[j];
            j++;
            k++;
        }

        return merged;
    }
    ///...
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] merged = new int[m+n];
        mergeSort(nums1,nums2,merged);

        ///Finding Median...
        int len=m+n;
        if(len%2==0){
            int p=merged[len/2],q=merged[(len/2)-1];
            return (p+q)/2.0;
        }

        return merged[len/2];
    }
}
