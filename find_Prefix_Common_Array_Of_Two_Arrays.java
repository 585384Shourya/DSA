class Solution {
    ///Solved using HashSet...

    // public int[] findThePrefixCommonArray(int[] A, int[] B) {
    //     int n=A.length;
    //     HashSet<Integer> set = new HashSet<>();
    //     int[] C = new int[n];
    //     int i=0;
    //     while(i<n){
    //         set.add(A[i]);
    //         set.add(B[i]);
    //         C[i]=(i+i+2)-set.size();
    //         i++;
    //     }

    //     return C;
    // }


    
    ///Solved using frequency array...

        public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freq = new int[51];
        int[] C = new int[n];
        int i=0,count=0;
        while(i<n){
            if(freq[A[i]]!=1){
                freq[A[i]]=1;
                count++;
            }

            if(freq[B[i]]!=1){
                freq[B[i]]=1;
                count++;
            }
            ///...
            C[i]=(i+i+2)-count;
            i++;
        }

        return C;
    }
}
