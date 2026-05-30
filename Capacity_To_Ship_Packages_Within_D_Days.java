class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1,high=0,min=0;
        for(int ele : weights) high+=ele;

        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0,count_days=1;
            for(int i=0;i<weights.length;i++){
                if(weights[i]>mid){
                    count_days=Integer.MAX_VALUE;
                    break;
                }
                else if(sum+weights[i]>mid){
                    count_days++;
                    sum=weights[i];
                }
                else if(sum<mid){
                    sum+=weights[i];
                }
            }
            ///.....
            if(count_days>days) low=mid+1;
            else if(count_days<=days){
                min=mid;
                high=mid-1;
            }

        }

        return min;
    }
}
