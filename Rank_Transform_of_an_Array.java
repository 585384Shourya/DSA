class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return arr;
        int[] brr =arr.clone();
        HashMap<Integer,Integer> map = new  HashMap<>();
        ///...
        Arrays.sort(brr);
        int i=0,prev=brr[i],n=arr.length,rank=1;
        map.put(brr[i],rank);
        i++;
        while(i<n){
            if(brr[i]!=prev){
                map.put(brr[i],++rank);
            }
            prev=brr[i];
            i++;
        } 
        ///...
        int[] result = new int[n];
        i=0;
        for(int ele:arr){
            result[i]=map.get(ele);
            i++;
        }

        return result;

    }
}
