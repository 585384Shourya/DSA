class Solution {
    public int gcdOfOddEvenSums(int n) {
        // int sumOdd=0,sumEven=0,countEven=0,countOdd=0;
        // int i=1;
        // while(countEven<n || countOdd<n){
        //     if(i%2==0){
        //         sumEven+=i;
        //         countEven++;
        //     } 
        //     else if(i%2!=0){
        //         sumOdd+=i;
        //         countOdd++;
        //     }

        //     i++;
        // }

        ///Using Arithmatic Progression(AP) Logic to calculate sumEven and sumOdd...

        int sumOdd=(n*n);
        int sumEven=(n+(n*n));
        ///...
        int min=Math.min(sumEven,sumOdd);
        int max=Math.max(sumEven,sumOdd);
        ///...
        while(min!=0){
            int temp=min;
            min=max % min;
            max=temp;
        }

        return max;
    }
}