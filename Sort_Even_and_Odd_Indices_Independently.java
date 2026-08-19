class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[101];
        int[] even = new int[101];

        ///...
        for(int i=0;i<nums.length;i++){
            if(i%2==0) even[nums[i]]++;
            else odd[nums[i]]++;
        }

        ///For even...
        int i=1,k=0;
        while(k<nums.length){
            while(even[i]==0){
                i++;
            }
            nums[k]=i;
            even[i]--;
            k+=2;
        }
        
        //For odd...
        k=1;
        i=100;
        while(k<nums.length){
            while(odd[i]==0){
                i--;
            }
            nums[k]=i;
            odd[i]--;
            k+=2;
        }
        return nums;
    }
}
