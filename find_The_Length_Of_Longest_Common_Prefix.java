class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        ///Bhai,ye code TLE dega...

        // int max_Length=0;
        // for(int i=0;i<arr1.length;i++){
        //     if(i!=0 && arr1[i]==arr1[i-1]) continue;///Ye tab ,jab element duplicate aa jaye...
        //     for(int j=0;j<arr2.length;j++){
        //     if(j!=0 && arr2[j]==arr2[j-1]) continue;///Ye tab ,jab element duplicate aa jaye...

        //     Stack<Integer> st1 = new Stack<>();
        //     Stack<Integer> st2 = new Stack<>();

        //     int n=arr1[i];int m=arr2[j];
        //     ///st1 stack me arr1 ka element ka ek-ek digit push ho raha hai...
        //       while(n!=0){
        //         st1.push(n%10);
        //         n/=10;
        //       }
            
        //     ///st2 stack me arr2 ka element ka ek-ek digit push ho raha hai...
        //       while(m!=0){
        //         st2.push(m%10);
        //         m/=10;
        //       }
        //       ///Now, popping out and compare for Prefix...
        //       int length=0;
        //       while(!st1.empty() && !st2.empty()){
        //         if(st1.pop()==st2.pop()) length++;
        //         else break;
        //       }
        //       max_Length=Math.max(length,max_Length);
        //     }
        // }
        // return max_Length;

        //Bhai,isko hmm HashSet se solve karenge ,but ye tree se bhi ho sakta hai...
        HashSet<Integer> set = new HashSet<>();

        //Yaha,hmm arr1 ke harek  elements ke jitne bhi prefix hai usko hashset me add kar rahe hai...  
        for(int i=0;i<arr1.length;i++){
            int n=arr1[i];
            while(n!=0){
                set.add(n);
                n/=10;
            }
        }
        
        ///Now checking ,whether prefix of elements of arr2 arr present in hashSet or not and finding longest...
        int max=0;
        for(int i=0;i<arr2.length;i++){
            int m=arr2[i];
            while(m!=0){
                if(set.contains(m)){
                    int count = 0;
                    int temp = m;
                    while (temp > 0) {
                       count++;
                       temp /= 10;
                    }
                    max= Math.max(max, count);
                    break;
                }
                m/=10;
            }
        }

        return max;
    }
}
