class Solution {
    public int mySqrt(int x) {
        long low=0L,mid=0L;
        long high=(long)x;

        while(low<=high){
            mid=low+(high-low)/2;
            ///...
            if(mid*mid==x) return (int)mid;
            else if(mid*mid<x) low=mid+1;
            else if(mid*mid>x) high=mid-1;
        }

        return (int)high;
    }
}