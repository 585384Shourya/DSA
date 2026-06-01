class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(m*k)) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE,min=-1;
        for(int ele : bloomDay){
            low=Math.min(low,ele);//Isse minimum, hmara answer ja hi nahi sakta...
            high=Math.max(high,ele);//Isse maximum, hmara answer ja hi nahi sakta...
        }
        ///...
        while(low<=high){
            int mid=low+(high-low)/2;
            ///...
            int count_Bouq=0,count_Adj=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid) count_Adj++;
                else if(bloomDay[i]>mid) count_Adj=0;//Agar bloomDay,koi bada hogaya fir usko skip karna padega ,aur firse count_Adj ko 0 se start  karna padega...

                if(count_Adj==k){
                    count_Bouq++;
                    count_Adj=0;
                }
            }

            ///...
            if(count_Bouq<m) low=mid+1;
            else if(count_Bouq>=m){
               min=mid;
               high=mid-1;
            }
        }

        return min;
    }
}