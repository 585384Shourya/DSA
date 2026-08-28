class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;

        ///Sieve of Eratosthenes...
        int[] prime = new int[n];
        for(int i=2;i<prime.length;i++){
            prime[i]=1;
        }

        ///...
        int count=0;
        for(int i=2;i*i<n;i++){

            if(prime[i]==1){
                for(int j=i*i;j<prime.length;j=i+j) prime[j]=0;
            }
        }

        ///...
        for(int ele : prime){
            if(ele==1) count++;
        }

        return count;
    }
}
