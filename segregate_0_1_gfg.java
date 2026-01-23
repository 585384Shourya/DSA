// User function Template for Java

class Solution {
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    void segregate0and1(int[] arr) {
        // code here
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==0 && arr[j]==0){
                i++;
            }
            else if(arr[i]==1 && arr[j]==1){
                j--;
            }
            else if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]==1){
                i++;
                j--;
            }
        }
        return;
    }
}
//can be solved this way also..
// while(i < j){
//     if(arr[i] == 0) i++;
//     else if(arr[j] == 1) j--;
//     else swap(arr, i++, j--);
// }
