class Solution {
    public int[] replaceElements(int[] arr) {
        int i,n=arr.length;
        i=n-2;
        // while(i<n){
        //     if(i==n-1){
        //         arr[i]=-1;
        //         break;
        //     }
        //     int j=i+1,max=Integer.MIN_VALUE;
        //     while(j<n){
        //         if(arr[j]>max){
        //             max=arr[j];
        //         }
        //         j++;
        //     }
        //     arr[i]=max;
        //     i++;
        // }
        // return arr;

        int max=arr[n-1];
        arr[n-1]=-1;
        while(i>=0){
                int temp=arr[i];
                arr[i]=max;
                if(max<temp){
                    max=temp;
                }
            i--;    
        }
        return arr;
    }
}
