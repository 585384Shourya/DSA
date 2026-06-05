class Solution {
    public int maxDistance(int[] position, int m) {
        int low=1,high=0,n=position.length,max=0;
        Arrays.sort(position);
        high=position[n-1]-position[0];
        ///...
        while(low<=high){
            ///check kar rahe hai ki kya mid distance par m balls rakh sakte hai ya nahi...
            int mid=low+(high-low)/2;
            int count_Balls=1,last=position[0];
            for(int i=1;i<n;i++){
                if(position[i]-last>=mid){
                    count_Balls++;
                    last=position[i];
                }
            }
            ///....
            if(count_Balls>=m){///Agar mid distance par m balls rakh sakte hai to iska matlab mid distance se zyada par bhi rakh sakte hai...to low ko mid+1 kar do...
                max=mid;
                low=mid+1;
            }
            else if(count_Balls<m) high=mid-1; ///Agar mid distance par m balls nahi rakh sakte hai to iska matlab mid distance se kam par hi rakh sakte hai...to high ko mid-1 kar do...
        }
        return max;
    }
}
