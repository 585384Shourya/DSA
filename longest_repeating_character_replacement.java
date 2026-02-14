class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[123];
        int n=s.length(),low=0,high=0,Msize=0,longest=0;
        while(high<n){
            int curr=s.charAt(high);
            arr[curr]++;

            if(Msize<arr[curr])Msize=arr[curr];
            //...information thik kar rahe hai... 
            while(((high-low)+1)-Msize>k){
                int left=s.charAt(low);
                arr[left]--;
                //...Maximum frequency calculate kar rahe hai...
                for(int i=0;i<123;i++){
                    if(arr[i]>Msize){
                        Msize=arr[i];
                    }
                }
                low++;
            }
            if(((high-low)+1)>longest)longest=((high-low)+1);
            high++;
        }
        return longest;
    }
}
