class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        ///...
        long sum=0;
        while(n!=0){
            if(n%10!=0){
                digits.add(n%10);
                sum+=n%10;
            }
            n/=10;
        }
        ///...
        long x=0;
        int i=digits.size()-1;
        for(;i>=0;i--){
            x = x * 10 + digits.get(i);
        }

        return x*sum;
    }
}
