class Solution {
    public int mySqrt(int x) {
        int st=0,end=x,mid;
        while(st<=end){
            mid=st+(end-st)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid>0?mid>x/mid:mid*mid>x){
                end=mid-1;
            }
            else if(mid*mid<x){
                st=mid+1;
            }
        }
        return end;
    }
}
