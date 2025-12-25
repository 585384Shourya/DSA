public class firstBadersion extends VersionControl {
    public int firstBadVersion(int n) {
        int st=1,end=n,mid,actual_ans=-1;
        while(st<=end){
            mid=st+(end-st)/2;
           boolean ans=isBadVersion(mid);
           if(ans==true){
            actual_ans=mid;
            end=mid-1;
           }
           else if(ans==false){
            st=mid+1;
           }
        }
        return actual_ans;
    }
}
