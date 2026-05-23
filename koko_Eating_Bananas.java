class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        ///....
        int low=1,high=max,mid=0,min_Banana=Integer.MAX_VALUE;
        while(low<=high){
            mid=low+(high-low)/2;
            ///...
            int count_hour=0;
            for(int i=0;i<piles.length;i++){
                if(count_hour>h) break;
                count_hour+=(piles[i]/mid);
                if(piles[i]%mid!=0) count_hour++; //Yeh ,tab karenge jab remainder kuch bach raha ho matlab jo bach gya usko koko ko khane me 1 ghanta aur lagega...
            }
            ///... 
            if(count_hour>h) low=mid+1;//matlab, jo hour ka count hai wo watchman ke return time se jayada hai, matalb koko kam banana kha rahi hai isliye use time jyada lag raha hai,isliye use jyada banana(k) khana chahiye...
            else if(count_hour<=h){
                min_Banana=Math.min(mid,min_Banana);
                high=mid-1;
            }//matlab, jo hour ka count hai wo watchman ke return time se already kam hai to hmm dekhenge ki aur isse bhi kam banana wo kha sakti hai kya...
        }

        return min_Banana;
    }
}