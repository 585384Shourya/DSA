class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0,j=0,mSum=Integer.MIN_VALUE,sum=0,m=accounts.length,n=accounts[0].length;
        while(i<m){
            j=0;
            sum=0;
            while(j<n){
                sum+=accounts[i][j];
                j++;
            }
            if(sum>mSum)mSum=sum;

            i++;
        }
        return mSum;
    }
}
