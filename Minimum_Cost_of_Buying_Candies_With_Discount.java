class Solution {
    public int minimumCost(int[] cost) {
        ///...
        Arrays.sort(cost);
        int sum=0,i=cost.length-1;
        while(i>=0){
            if(i==0){
                return sum+=cost[i];
            }
            sum+=(cost[i]+cost[i-1]);
            i-=3;
        }
        return sum;
    }
}
