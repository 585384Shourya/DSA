class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int i=0;
        while(i<n){
            arr[i]=start+2*i;
            i++;
        }
        ///...
        int xor=0;
        for(int ele:arr){
            xor^=ele;
        }

        return xor;
    }
}
