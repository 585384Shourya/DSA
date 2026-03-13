// User function Template for Java

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        //... Used Kadane approach to Solve this...//
        int min=a[0],prevSum=a[0],currSum=a[0];
        for(int i=1;i<size;i++){
            int val1=prevSum+a[i];
            int val2=a[i];
            
            currSum=Math.min(val1,val2);
            
            if(currSum<min) min=currSum;
            //...
            prevSum=currSum;
        }
        return min;
    }
}
