class Solution {
    public boolean isPerfectSquare(int num) {
        //Using binary Search bcoz liner search will give T.L.E. error...   
        Long low=1L,mid=0L;
        Long high=(long)num;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid*mid == num) return true;
            else if(num<mid*mid) high=mid-1;
            else if(num>mid*mid) low=mid+1;
        }

        return false;
    }
}
