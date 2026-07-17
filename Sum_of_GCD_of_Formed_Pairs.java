class Solution {
    public int gcd(int mx,int num){
        int max=Math.max(mx,num);
        int min=Math.min(mx,num);
        ///...
        while(min!=0){
            int temp=min;
            min=max % min;
            max=temp;
        }

        return max;
    }
    ///...
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] prefixGcd = new int[n];
        ///...
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(nums[i],mx);
            prefixGcd[i]=gcd(mx,nums[i]);
        }

        ///...
        Arrays.sort(prefixGcd);
        long sum=0;
        int i=0,j=n-1;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}